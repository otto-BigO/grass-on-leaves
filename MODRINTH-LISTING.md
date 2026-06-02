# Modrinth listing — copy/paste reference

Everything below is ready to paste into the Modrinth "Create a project" form.

---

## Core fields

| Field | Value |
|-------|-------|
| **Name** | Grass on Leaves |
| **Slug / URL** | `grass-on-leaves`  → modrinth.com/mod/grass-on-leaves |
| **Project type** | Mod |
| **Summary** | Place grass, ferns, flowers, saplings and other plants on top of leaf blocks. Tiny, fully server-side, no client mod or Fabric API required. |
| **License** | MIT |
| **Categories** | Decoration, Utility, Game Mechanics |
| **Client side** | Unsupported (clients don't need it) |
| **Server side** | Required |
| **Loaders** | Fabric |
| **Game versions** | 26.1.2 |

> Environment note: it changes block-placement rules on the server, so it's
> **server: required, client: unsupported** — vanilla players can use it freely.

---

## Description (body — paste as Markdown)

# Grass on Leaves

A tiny, server-side Fabric mod that lets you place vegetation directly on top of **leaf blocks** — something vanilla normally won't allow.

Works with grass, ferns, flowers, saplings, dead bushes, and other plants that normally only sit on grass or dirt. Great for treehouses, custom builds, and natural-looking canopies.

## Features

- 🌿 Place grass, ferns, flowers, saplings and more on any leaf block
- 🖥️ **100% server-side** — players join with a vanilla client, nothing to install
- 🪶 **Zero dependencies** — doesn't even need Fabric API, just Fabric Loader
- ⚙️ No new blocks, items, or config — it just works

## How it works

The mod injects into `VegetationBlock.mayPlaceOn` and treats any block tagged `minecraft:leaves` as valid ground for plants. That's the whole mod.

## Installation

1. Install Fabric Loader on your server.
2. Drop the jar into the server's `mods/` folder.
3. Restart. Done.

## License

MIT

---

## Version upload fields

| Field | Value |
|-------|-------|
| **Version number** | 1.0.0 |
| **Version name** | Grass on Leaves 1.0.0 |
| **Release channel** | Release |
| **Loaders** | Fabric |
| **Game versions** | 26.1.2 |
| **Dependencies** | None |
| **File** | `build/libs/grass-on-leaves-1.0.0.jar` |
| **Changelog** | Initial release. |
