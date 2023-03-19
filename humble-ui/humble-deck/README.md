# Humble UI learning

fork from [humble-deck](https://github.com/tonsky/humble-deck/tree/main)

Annotated the code within the application that calls the full-screen interface so that it can run on windows

Presentation Software built with [Humble UI](https://github.com/HumbleUI/HumbleUI)

![screenshot](./extras/screenshot.png)

Features:

- Write slides in Clojure
- Text, section, list, image
- Slide groups for slight variations
- PNG, JPG, SVG, GIF, WEBP
- Speaker view with current clock, time spent and time left
- Grid view and slider for quick navigation

## Running

```sh
clj -M -m humble-deck.main
```

## Developing

Starting nREPL server:

```sh
clj -M:dev -m user
```
