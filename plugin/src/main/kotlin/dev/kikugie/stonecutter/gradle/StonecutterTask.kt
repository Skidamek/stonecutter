package dev.kikugie.stonecutter.gradle

import dev.kikugie.semver.SemanticVersion
import dev.kikugie.semver.SemanticVersionParser
import dev.kikugie.stitcher.process.recognizer.StandardMultiLine
import dev.kikugie.stitcher.process.recognizer.StandardSingleLine
import dev.kikugie.stitcher.process.TransformParameters
import dev.kikugie.stonecutter.cutter.FileManager
import dev.kikugie.stonecutter.metadata.ProjectName
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
import org.gradle.api.DefaultTask
import org.gradle.api.provider.MapProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.TaskAction
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardOpenOption
import kotlin.io.path.ExperimentalPathApi
import kotlin.io.path.copyTo
import kotlin.io.path.walk
import kotlin.io.path.writeText
import kotlin.system.measureTimeMillis

@Suppress("LeakingThis")
@OptIn(ExperimentalPathApi::class)
internal abstract class StonecutterTask : DefaultTask() {
    @get:Input
    abstract val input: Property<Path>

    @get:Input
    abstract val output: Property<Path>

    @get:Input
    abstract val fromVersion: Property<StonecutterProject>

    @get:Input
    abstract val toVersion: Property<StonecutterProject>

    @get:Input
    abstract val constants: MapProperty<String, Boolean>

    @get:Input
    abstract val swaps: MapProperty<String, String>

    @get:Input
    abstract val dependencies: MapProperty<String, SemanticVersion>

    @get:Input
    abstract val filter: Property<(Path) -> Boolean>

    @get:Internal
    internal lateinit var manager: FileManager

    @TaskAction
    fun run() {
        if (!input.isPresent || !output.isPresent || !toVersion.isPresent)
            throw IllegalArgumentException("[Stonecutter] StonecutterTask is not fully initialized")
        manager = createManager()
        val time = measureTimeMillis {
            transform(input.get(), output.get())
        }
        println("[Stonecutter] Switched to ${toVersion.get().project} in ${time}ms")
    }

    private fun createManager(): FileManager {
        fun cacheDir(pr: StonecutterProject) = project.let { it.parent ?: it }.project(":${pr.project}").buildDirectory.toPath().resolve("stonecutterCache")
        val deps = dependencies.get().toMutableMap()
        val mcVersion = deps["minecraft"] ?: SemanticVersionParser.parse(toVersion.get().version)
        deps["minecraft"] = mcVersion
        deps["\u0000"] = mcVersion

        val params = TransformParameters(swaps.get(), constants.get(), deps)
        return FileManager(
            inputCache = cacheDir(fromVersion.get()),
            outputCache = cacheDir(toVersion.get()),
            filter = filter.get(),
            recognizers = listOf(StandardMultiLine, StandardSingleLine),
            params = params
        )
    }

    private fun transform(input: Path, output: Path): Unit = runBlocking {
        val inPlace = input == output
        val skipped = mutableListOf<Path>()
        val processed = mutableListOf<Pair<Path, String>>()
        val exceptions = mutableListOf<Throwable>()
        input.walk().map {
            it to process(input, input.relativize(it))
        }.asFlow().flowOn(Dispatchers.Default).catch {
            exceptions += it
        }.transform<Pair<Path, String?>, Unit> { (file, result) ->
            if (result == null) skipped.add(file)
            else processed.add(file to result)
        }.collect()
        if (exceptions.isNotEmpty())
            throw exceptions.composeCauses()
        if (!inPlace) skipped.forEach {
            val out = output.resolve(input.relativize(it))
            Files.createDirectories(out.parent)
            it.copyTo(out)
        }
        processed.forEach { (it, content) ->
            val out = output.resolve(input.relativize(it))
            Files.createDirectories(out.parent)
            out.writeText(
                content,
                StandardCharsets.ISO_8859_1,
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING
            )
        }
    }

    private fun List<Throwable>.composeCauses(): Throwable {
        val cause = buildString {
            for (err in this@composeCauses) {
                val primary = err.message ?: "An error occurred"
                val cause = err.cause
                val message = StringBuilder()
                message.append("    > $primary:\n")
                for (line in (cause?.message ?: "").lines())
                    message.append("        $line\n")
                append(message)
            }
        }
        return RuntimeException("Failed to switch to ${toVersion.get().project}:\n$cause")
    }

    private fun process(root: Path, file: Path): String? = try {
        manager.process(root, file)
    } catch (e: Exception) {
        throw RuntimeException("Failed to process $file").apply {
            initCause(e)
        }
    }
}