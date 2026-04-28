plugins {
    alias(miaConventions.plugins.mia.docs)
}
repositories {
    mavenCentral()
    maven("https://repo.mineinabyss.com/releases")
    maven("https://repo.mineinabyss.com/snapshots")
}

idofront {
    docsVersion = "0.0.8"
}
