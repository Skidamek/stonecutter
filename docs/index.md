---
# https://vitepress.dev/reference/default-theme-home-page
layout: home

titleTemplate: Stonecutter
title: Stonecutter
description: Modern Gradle plugin for multi-version management

hero:
  name: Stonecutter
  tagline: Modern Gradle plugin for multi-version management
  image:
    src: /assets/logo.webp
    alt: Stonecutter

features:
  - title: Migrating to Stonecutter
    icon: 🛫
    details: Do you already have a project or want to start from scratch? Take a look on the detailed setup guide.
    link: /stonecutter/migration
    linkText: Get Started
  - title: Quick Start
    icon: ⏳
    details: Check out the Fabric mod template repository to start a new mod with multi-version support.
    link: https://github.com/kikugie/stonecutter-template-fabric
    linkText: Template Repository
  - title: Learn to use Stonecutter
    icon: 🖊
    details: Explore the rich feature set provided by the custom in-comment language used by Stonecutter - Stitcher.
    link: /stonecutter/comments
    linkText: Documentation
  - title: Code documentation
    icon: 🛠
    details: Do you want to know how the file parsing and transformation is accomplished? Then you're in luck - the code is very organized and documented.
    link: /dokka/
    linkText: KDoc
---

<!--suppress ES6UnusedImports, HtmlUnknownAttribute -->
<script setup>
import { VPTeamMembers } from 'vitepress/theme';
import modrinth from '/assets/modrinth.svg?raw';
import curseforge from '/assets/curseforge.svg?raw';

let start = "here";
const members = [
  {
    avatar: 'https://cdn.modrinth.com/data/1eAoo2KR/1e43d5714f87ac6b20622e73b3ba7209be5ebafb.png',
    name: 'YetAnotherConfigLib',
    title: 'A builder-based configuration library for Minecraft.',
    links: [
      { icon: 'github', link: 'https://github.com/isXander/YetAnotherConfigLib' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/yacl' },
      { icon: { svg: curseforge }, link: 'https://www.curseforge.com/minecraft/mc-mods/yacl' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/w7ThoJFB/25d48c335340c12566044c8f35df5102e72dc06c.png',
    name: 'Zoomify',
    title: 'A zoom mod with infinite customizability.',
    links: [
      { icon: 'github', link: 'https://github.com/isXander/Zoomify' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/zoomify' },
      { icon: { svg: curseforge }, link: 'https://www.curseforge.com/minecraft/mc-mods/zoomify' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/1s5x833P/b7e3cf809f07d3cad88a60834c3e4e7248021744.png',
    name: 'Neruina - Ticking Entity Fixer',
    title: 'A Mod that prevents ticking-related crashes from bricking worlds',
    links: [
      { icon: 'github', link: 'https://github.com/Benjamin-Norton/Neruina' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/neruina' },
      { icon: { svg: curseforge }, link: 'https://www.curseforge.com/minecraft/mc-mods/neruina' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/SNVQ2c0g/cd0ac6b474ae39a347364a62a39ea04ce0e146d9.png',
    name: 'M.R.U',
    title: 'Mineblock\'s Repeated Utilities',
    links: [
      { icon: 'github', link: 'https://github.com/mineblock11/MRU' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/mru' },
      { icon: { svg: curseforge }, link: 'https://www.curseforge.com/minecraft/mc-mods/mru' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/XVnUIUAQ/8165a80ccd1c58a9a0fd7505b4d27235a759bf28.png',
    name: 'Snow Under Trees (Fabric)',
    title: 'Adds snow under trees in snowy biomes, making the biomes more immersive.',
    links: [
      { icon: 'github', link: 'https://github.com/mineblock11/SnowUnderTrees' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/snow-under-trees-remastered' },
      { icon: { svg: curseforge }, link: 'https://www.curseforge.com/minecraft/mc-mods/snow-under-trees-remastered' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/DOUdJVEm/4f8cdb3933f9efa0c5dfd5574d3ad6b101c7f3ef.png',
    name: 'Controlify',
    title: 'Adds the best controller support to Minecraft Java edition!',
    links: [
      { icon: 'github', link: 'https://github.com/isXander/Controlify' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/controlify' },
      { icon: { svg: curseforge }, link: 'https://www.curseforge.com/minecraft/mc-mods/controlify' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/XpzGz7KD/8ff6751948e096f540e320681742d0b3b918931e.png',
    name: 'Elytra Trims',
    title: 'Customizable elytra mod with trims, banner patterns and more!',
    links: [
      { icon: 'github', link: 'https://github.com/Kikugie/elytra-trims' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/elytra-trims' },
      { icon: { svg: curseforge }, link: 'https://www.curseforge.com/minecraft/mc-mods/elytra-trims' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/FrZIkosK/914fbe1f142a3fbe7488d0064e252f08f10c4a93.png',
    name: 'Forgotten Graves',
    title: 'Minecraft (Fabric) mod that stores items and XP in a decaying grave upon death',
    links: [
      { icon: 'github', link: 'https://github.com/ginsm/forgotten-graves' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/forgotten-graves' },
      { icon: { svg: curseforge }, link: 'https://www.curseforge.com/minecraft/mc-mods/forgotten-graves' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/WuGVWUF2/47e2f963c136689d4c824eb4f2d43531fb42035f.png',
    name: 'Fog Looks Good Now (Fabric)',
    title: 'Helps fog look better by moving the fog start closer. Additionally, adds cave fog and biome specific fog density.',
    links: [
      { icon: 'github', link: 'https://github.com/mineblock11/FogLooksGoodNow' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/fog' },
      { icon: { svg: curseforge }, link: 'https://www.curseforge.com/minecraft/mc-mods/fog' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/pnsUKrap/7bb6b50b2f8be66ea13e0cfd290a7c2e348d6074.png',
    name: 'All The Trims',
    title: 'Allows any item to be an armour trim material and makes all armour trimmable.',
    links: [
      { icon: 'github', link: 'https://github.com/Benjamin-Norton/AllTheTrims/' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/allthetrims' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/Eoxi2LJd/481ae7705912ab3418955e5bd650d938d1261c59.png',
    name: 'Flow',
    title: 'Configurable ease in-out inventory UI transitions.',
    links: [
      { icon: 'github', link: 'https://github.com/mineblock11/Flow' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/flow' },
      { icon: { svg: curseforge }, link: 'https://www.curseforge.com/minecraft/mc-mods/flow' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/3s19I5jr/e66d99492c9b25e88a614846cca6b154ec5309f2.png',
    name: 'Skin Shuffle',
    title: 'Easily change your skin in-game without having to leave the world.',
    links: [
      { icon: 'github', link: 'https://github.com/mineblock11/SkinShuffle' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/skinshuffle' },
      { icon: { svg: curseforge }, link: 'https://www.curseforge.com/minecraft/mc-mods/skinshuffle' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/J5NAzRqK/43f9b135ef9ab49a67da667caa8b5987e1d5d864.png',
    name: 'FSit',
    title: 'Sit anywhere!',
    links: [
      { icon: 'github', link: 'https://github.com/rvbsm/fsit' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/fsit' },
      { icon: { svg: curseforge }, link: 'https://www.curseforge.com/minecraft/mc-mods/fsit' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/9pubtjcn/7c702ddf0204753f221ab781f3f9360e071b988b.png',
    name: 'Blocky Bubbles',
    title: 'Ports the Fast Bubbles setting from Bedrock Edition!',
    links: [
      { icon: 'github', link: 'https://github.com/axialeaa/BlockyBubbles' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/blocky-bubbles' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/RCjGlCDj/icon.png',
    name: 'Mod-erate Loading Screen',
    title: 'An "alternative" to Mod Menu that\'s a lot less usable.',
    links: [
      { icon: 'github', link: 'https://github.com/enjarai/moderate-loading-screen' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/moderate-loading-screen' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/m5T5xmUy/c67c1f900e8344e462bb5c21fb512579f3b0be46.png',
    name: 'FabricBetterGrass',
    title: 'Gamers can finally touch grass!?  OptiFine\'s Fancy and Fast better grass implemented on Fabric!',
    links: [
      { icon: 'github', link: 'https://github.com/UltimatChamp/FabricBetterGrass' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/fabricbettergrass' },
      { icon: { svg: curseforge }, link: 'https://www.curseforge.com/minecraft/mc-mods/fabricbettergrass' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/tr2Mv6ke/a98512fe0df192749fa001268dcf8dd96f99e587.png',
    name: 'Sushi Bar',
    title: 'A library mod for Chai\'s mods',
    links: [
      { icon: 'github', link: 'https://github.com/Chailotl/sushi-bar' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/sushi-bar' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/Kd03i2oU/5bfab0390b4655470b95b80824df9ffe6e280514.png',
    name: 'Enchantment Disabler',
    title: 'Disable enchantments you don\'t like, and nerf enchanting in multiple ways with an extensive configuration. Supports modded enchantments.',
    links: [
      { icon: 'github', link: 'https://github.com/pajicadvance/enchantmentdisabler' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/enchantment-disabler' },
      { icon: { svg: curseforge }, link: 'https://www.curseforge.com/minecraft/mc-mods/enchantmentdisabler' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/8CsGxc95/f1d33853af9a7c9a05f2562fc72750187b3ed988.png',
    name: 'Shared Resources',
    title: 'A mod for sharing game files like resource packs, shaders, saves and more between separate Minecraft instances.',
    links: [
      { icon: 'github', link: 'https://github.com/enjarai/shared-resources' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/shared-resources' },
      { icon: { svg: curseforge }, link: 'https://www.curseforge.com/minecraft/mc-mods/shared-resources' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/9dzLWnmZ/3a7ea28ca4aa82708c23d0f1f7189661eb2ea363.png',
    name: 'Camerapture',
    title: 'Take pictures using a working camera, show them to other players and hang them on your wall in picture frames!',
    links: [
      { icon: 'github', link: 'https://github.com/chrrs/camerapture' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/camerapture' },
      { icon: { svg: curseforge }, link: 'https://www.curseforge.com/minecraft/mc-mods/camerapture' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/LLfA8jAD/68480ea1745081e6ab88970f58c9b58c9fa3a7e5.jpeg',
    name: 'telekinesis',
    title: 'The Telekinesis enchantment automatically collects drops, including blocks, mobs, experience, and more!',
    links: [
      { icon: 'github', link: 'https://github.com/btwonion/telekinesis' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/telekinesis' },
      { icon: { svg: curseforge }, link: 'https://www.curseforge.com/minecraft/mc-mods/telekinesis' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/hHVaPgFK/723c55a27d7d633024fdfe14464a44c84bf05d48.png',
    name: 'Mob Armor Trims',
    title: 'Makes mobs be able to spawn with naturally trimmed armor',
    links: [
      { icon: 'github', link: 'https://github.com/Imajo24I/Mob-Armor-Trims-1.20.1/' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/mob-armor-trims' },
      { icon: { svg: curseforge }, link: 'https://www.curseforge.com/minecraft/mc-mods/mob-armor-trims' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/9auOqb3o/a0abec247c17a55fb4826f9b641fefdebd794339.png',
    name: 'CyanSetHome',
    title: 'Adds the /sethome command and a system of trust between player to allow them to teleport to their respective homes',
    links: [
      { icon: 'github', link: 'https://github.com/Aeldit/CyanSetHome' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/cyansethome' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/s9XXQTOb/b2ad6897ae0ae1277dc3fefe4d99ed6e7e3f9024.png',
    name: 'Chai\'s Inventory Sorter',
    title: 'An inventory sorter that complements the vanilla UI with fully configurable sorting',
    links: [
      { icon: 'github', link: 'https://github.com/Chailotl/inventory-sort' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/chais-inventory-sorter' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/wTfH1dkt/b9d1ed7933cbbad760cae996d8732c914a57fbd2.png',
    name: 'Better Boat Movement',
    title: 'Increases boat step height to move up water and blocks',
    links: [
      { icon: 'github', link: 'https://github.com/btwonion/better-boat-movement' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/better-boat-movement' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/lg17V3i3/d88de184e364d8dd1da21933c7c82ce298b0fb98.png',
    name: 'autodrop',
    title: 'Simply drops specific items after pickup',
    links: [
      { icon: 'github', link: 'https://github.com/btwonion/autodrop' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/autodrop' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/6OpnBWtt/5bb148d10f81498a60f0498302743a39eadd6900.png',
    name: 'CTM Selector',
    title: 'This mod allows you to choose which blocks will have connected textures in every CTM resource pack you have loaded',
    links: [
      { icon: 'github', link: 'https://github.com/Aeldit/CTMSelector' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/ctm-selector' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/TBQr8ROh/b092cf15b0e51b27740df11220d4a8c51fd0b08e.png',
    name: 'MCC Island Nametag Mod',
    title: 'A mod that displays your own name tag on MCC Island in the exact way the server does it.',
    links: [
      { icon: 'github', link: 'https://github.com/anastarawneh/MCCINametagMod' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/mcc-island-nametag-mod' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/zGxxQr33/94087d290a929535845be488cde26de54c6826f0.png',
    name: 'Cyan',
    title: 'Adds a few commands for survival Minecraft server and client !',
    links: [
      { icon: 'github', link: 'https://github.com/Aeldit/Cyan' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/cyan' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/yXAvIk0x/a8e206afee8b866700008f18b57212f0d6ce17c6.png',
    name: 'Scribble',
    title: 'Expertly edit your books with rich formatting options, page utilities and more! And it\'s all client-side!',
    links: [
      { icon: 'github', link: 'https://github.com/chrrs/scribble' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/scribble' },
      { icon: { svg: curseforge }, link: 'https://www.curseforge.com/minecraft/mc-mods/scribble' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/BMaqFQAd/116458c672aadeb31856563eaff8ed7edd764753.png',
    name: 'AutoWhitelist',
    title: 'A way to automate the whitelist of a minecraft server based on discord roles',
    links: [
      { icon: 'github', link: 'https://github.com/Awakened-Redstone/AutoWhitelist' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/autowhitelist' },
      { icon: { svg: curseforge }, link: 'https://www.curseforge.com/minecraft/mc-mods/autowhitelist' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/YS3ZignI/f8056e4ce6ac00a50c431eac915509d14a0e90b4.png',
    name: 'TT20 (TPS Fixer)',
    title: 'TT20 helps reduce lag by optimizing how ticks work when the server\'s TPS is low.',
    links: [
      { icon: 'github', link: 'https://github.com/snackbag/tt20' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/tt20' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/MXwU9ODv/f984c9f3ddcc0d1bf9bd227406a540778b4932ff.png',
    name: 'skylper',
    title: 'Utility mod for Hypixel Skyblock focusing on mining',
    links: [
      { icon: 'github', link: 'https://github.com/btwonion/skylper' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/skylper' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/GON0Fdk5/047b7bfec30d245cd7d5972affe208e6b0f8da98.png',
    name: 'skin overrides',
    title: 'a simple mod for locally changing skins and capes.',
    links: [
      { icon: 'github', link: 'https://lumity.dev/orifu/skin-overrides' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/skin-overrides' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/ygYU16dG/cd7e06456a341a345a6d2be1e2a057745d293969.png',
    name: 'My Totem Doll',
    title: 'Simple Fabric mod which replaces all totems with player dolls. Rename your totem to player\'s nickname to use it\'s skin.',
    links: [
      { icon: 'github', link: 'https://github.com/LopyMine/My-Totem-Doll' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/my_totem_doll' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/PztDP6Mf/b4734849fa5b15e7bd86d0cad353cab356cef542.png',
    name: 'Player Statistics',
    title: 'Adds a command to your Fabric server that gives players insights into everyone\'s statistics.',
    links: [
      { icon: 'github', link: 'https://github.com/kr8gz/PlayerStatistics' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/playerstatistics' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/joSM3OBw/d678ad694601af535d957b535bce1510b2690dee.png',
    name: 'New Creative Inventory',
    title: 'A recreation of the creative inventory from version 1.19.3',
    links: [
      { icon: 'github', link: 'https://github.com/Plastoid501/NewCreativeInventory' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/new-creative-inventory' }
    ]
  },
  {
    avatar: 'https://cdn.modrinth.com/data/pNpkYUIH/59d47cca5c3dd2beb8d2f20823cbb6ad521c58a6.png',
    name: 'Daisy\'s Mod Collection',
    title: 'A collection of different mods',
    links: [
      { icon: 'github', link: 'https://github.com/DaisyDogs07/MyMod' },
      { icon: { svg: modrinth }, link: 'https://modrinth.com/mod/daisycollection' }
    ]
  }
];

let end = "here";
</script>

## Projects using Stonecutter

*This list is autogenerated. If you find a mistake please report it to the [Issues page](https://github.com/kikugie/stonecutter/issues)*  
*If you want your project to be included or excluded, open a GitHub issue or contact on Discord.*
<VPTeamMembers size="small" :members="members" />
