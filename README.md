# GAndro Core
This repository contains core code for gandro testing engine and input data generation. This project is configured as a library or module so it should be imported inside Android project that way.

## Compilation
To use GAndro as library it should be compile with command:

```gradle deleteAAR createAAR```

This will leave the aar file under the path:

```$userDir$/app/libs/aar/gandro-core.aar```

This aar should be copied inside target project's structure and set as a dependency using:

```compile 'com.example:gandro-core:1.0.0@aar'```

Inside module's build.gradle.
