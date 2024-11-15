plugins {
//    kotlin("multiplatform") version "2.0.21" // FIXME official way doesn't work?!?
    kotlin("js") version "2.0.21"
}
repositories {
    mavenLocal()
    google()
    mavenCentral()
    gradlePluginPortal()
}
kotlin {
    js {
        browser {
        }
        binaries.executable()
    }
}