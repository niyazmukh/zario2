plugins {
    id("androidx.baselineprofile") version "1.3.2"
}

android {
    namespace = "com.niyaz.zario.baselineprofile"
}

dependencies {
    implementation(project(":app"))
    androidTestImplementation("androidx.test:runner:1.5.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.uiautomator:uiautomator:2.3.0")
    androidTestImplementation("androidx.profileinstaller:profileinstaller:1.3.2")
    androidTestImplementation("androidx.baselineprofile:baselineprofile-macrobenchmark:1.3.2")