# Grass on Leaves

A lightweight, **100% server-side** [Fabric](https://fabricmc.net/) mod for **Minecraft 26.1.2** that lets you place grass, ferns, flowers, saplings, and other vegetation directly on top of leaf blocks — something vanilla normally won't allow.

## Features

- Place any vegetation that normally requires grass/dirt (short grass, ferns, flowers, saplings, etc.) on **leaf blocks**.
- **Server-side only** — players do **not** need the mod installed on their client. Install it on the server and it just works for everyone.
- Tiny and dependency-light: a single mixin, no new blocks, items, or config.

## How it works

The mod mixes into `VegetationBlock.mayPlaceOn` and returns `true` when the block below is tagged `minecraft:leaves`, so the game treats leaf blocks as a valid foundation for vegetation.

## Requirements

- Minecraft **26.1.2**
- Fabric Loader **0.19.1+**
- Fabric API
- Java **21+**

## Installation

1. Download `grass-on-leaves-1.0.0.jar` from the [Releases](https://github.com/otto-BigO/grass-on-leaves/releases) page.
2. Make sure [Fabric API](https://modrinth.com/mod/fabric-api) is installed.
3. Drop the jar into your server's `mods/` folder.
4. Restart the server.

## Building from source

```sh
git clone https://github.com/otto-BigO/grass-on-leaves.git
cd grass-on-leaves
./gradlew build
```

The built jar will be in `build/libs/`.

## License

[MIT](LICENSE)
