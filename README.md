# Fabricated Quilt Config

Quilt Config on Fabric

## Usage

Make sure you have the following repositories in your `build.gradle`:
```groovy
repositories {
    // for Quilt Config + Parsers
    maven {
        name = 'Quilt'
        url = 'https://maven.quiltmc.org/repository/release'
    }

    // for Night Config
    mavenCentral()

    // for this library!
    maven {
        name = 'JitPack'
        url = 'https://jitpack.io'
    }
}
```

Then, declare a dependency on Fabricated Quilt Config:
```groovy
dependencies {
    // ...

    modApi "com.github.unilock:fabricated-quilt-config:${project.fqconfig_version}"
}
```

Or, if you'd like to include it in your JAR (it's under 400 KB):
```groovy
dependencies {
    // ...

    modApi include("com.github.unilock:fabricated-quilt-config:${project.fqconfig_version}")
}
```

`fqconfig_version` can be found on JitPack: https://jitpack.io/#unilock/fabricated-quilt-config

Quilt Config can then be used in your Fabric mod in exactly the same way as it would with Quilt Loader!
