plugins {
    kotlin("js") version "2.0.21"
}

repositories {
    mavenLocal()
    google()
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-html-js:0.11.0")
}

kotlin {
    js {
        browser {
        }
        binaries.executable()
    }
}

val deployDocs = tasks.register("deployDocs") {
    doFirst {
        delete(File("docs").listFiles())
        copy {
            from("build/dist/js/productionExecutable")
            into("docs/")
        }
    }
}

tasks.named("assemble") {
    finalizedBy("deployDocs")
}
