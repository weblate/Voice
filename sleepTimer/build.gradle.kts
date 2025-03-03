plugins {
  id("voice.library")
  alias(libs.plugins.anvil)
}

anvil {
  generateDaggerFactories.set(true)
}

android {
  buildFeatures {
    viewBinding = true
    androidResources = true
  }
}

dependencies {
  implementation(projects.common)
  implementation(projects.strings)
  implementation(projects.playback)
  implementation(projects.data)

  implementation(libs.androidxCore)
  implementation(libs.prefs.core)
  implementation(libs.materialDialog.core)
  implementation(libs.androidxCore)
  implementation(libs.constraintLayout)
  implementation(libs.material)
  implementation(libs.seismic)

  implementation(libs.dagger.core)

  testImplementation(libs.prefs.inMemory)
}
