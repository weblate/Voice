@file:Suppress("UnstableApiUsage")

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "plugins"

plugins {
  id("org.gradle.toolchains.foojay-resolver-convention") version ("0.5.0")
}

dependencyResolutionManagement {
  repositories {
    mavenCentral()
    google()
  }
  versionCatalogs {
    create("libs") {
      from(files("../gradle/libs.versions.toml"))
    }
  }
}
