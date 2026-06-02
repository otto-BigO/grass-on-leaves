# Grass on Leaves

A server-side Fabric mod for Minecraft 26.1.2 that lets you put grass on leaves.

It also works for ferns, flowers, saplings, and other vegetation that normally can only sit on grass or dirt.

## Features

- Place vegetation directly on top of leaf blocks.
- Server-side only. Players do not need the mod on their client.
- Tiny: one mixin, no new blocks, items, or config.

## How it works

The mod injects into `VegetationBlock.mayPlaceOn` and returns true when the block below is tagged `minecraft:leaves`, so leaf blocks count as a valid foundation for plants.

## Requirements

- Minecraft 26.1.2
- Fabric Loader 0.19.1 or newer
- Java 25 or newer

No Fabric API needed. This mod has zero dependencies beyond Fabric Loader.

## Installation

1. Download `grass-on-leaves-1.0.0.jar` from [Modrinth](https://modrinth.com/mod/grass-on-leaves) (or the Releases page).
2. Drop the jar into your server's `mods/` folder.
3. Restart the server.

## Building from source

```sh
git clone https://github.com/otto-BigO/grass-on-leaves.git
cd grass-on-leaves
./gradlew build
```

The built jar will be in `build/libs/`.

## License

[MIT](LICENSE)
