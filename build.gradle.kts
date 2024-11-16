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