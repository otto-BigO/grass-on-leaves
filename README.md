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
- Fabric API
- Java 21 or newer

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
