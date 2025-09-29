import java.util.Properties

fun Project.loadCredential(key: String): String? {
    val envValue = System.getenv(key)
    if (!envValue.isNullOrBlank()) return envValue

    val propsFile = rootProject.file("local.properties")
    if (propsFile.exists()) {
        val props = Properties()
        propsFile.inputStream().use { props.load(it) }
        return props.getProperty(key)
    }

    return null
}

fun isReleaseTaskRequested(taskNames: List<String>): Boolean {
    if (taskNames.isEmpty()) return false
    return taskNames.any { it.contains("Release", ignoreCase = true) }
}

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.hilt.android)
    alias(libs.plugins.google.services)
    kotlin("kapt")
}

android {
    namespace = "com.niyaz.zario"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.niyaz.zario"
        minSdk = 29
        targetSdk = 34
        versionCode = 2
        versionName = "1.1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        
        // Ensure 16 KB page alignment for Android 15+ compatibility
        ndk {
            abiFilters += listOf("arm64-v8a", "armeabi-v7a")
        }
    }

    signingConfigs {
        val keystoreFile = rootProject.file("keystore/zario-release.jks")
        val releaseStorePassword = loadCredential("ZARIO_KEYSTORE_PASSWORD")
        val releaseKeyPassword = loadCredential("ZARIO_KEY_PASSWORD")
        val releaseCredentialsConfigured = !releaseStorePassword.isNullOrBlank() &&
            !releaseKeyPassword.isNullOrBlank() &&
            keystoreFile.exists()

        if (releaseCredentialsConfigured) {
            create("release") {
                storeFile = keystoreFile
                storePassword = releaseStorePassword!!
                keyAlias = "zario-release-key"
                keyPassword = releaseKeyPassword!!
            }
        } else {
            logger.lifecycle("Release keystore credentials not detected. Release signing will be configured once credentials are provided via environment variables or local.properties.")
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )

            val requestedRelease = isReleaseTaskRequested(gradle.startParameter.taskNames)
            val hasSigningConfig = signingConfigs.findByName("release") != null

            if (hasSigningConfig) {
                signingConfig = signingConfigs.getByName("release")
            } else if (requestedRelease) {
                throw GradleException(
                    "Release signing credentials are missing. Set ZARIO_KEYSTORE_PASSWORD and ZARIO_KEY_PASSWORD as environment variables or define them in local.properties (untracked)."
                )
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        viewBinding = true
        buildConfig = true
    }
    
    // Add this configuration for proper Hilt annotation processing
    kapt {
        correctErrorTypes = true
    }
}

dependencies {
    implementation(platform(libs.firebase.bom))
    implementation(libs.firebase.auth.ktx)
    implementation(libs.firebase.firestore.ktx)
    implementation(libs.kotlinx.coroutines.play.services)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.fragment.ktx)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.work.runtime.ktx)
    implementation(libs.androidx.swiperefreshlayout)
    
    // Hilt dependencies - order matters
    implementation(libs.hilt.android)
    implementation(libs.androidx.hilt.work)
    kapt(libs.hilt.android.compiler)
    kapt(libs.androidx.hilt.compiler)
    // DataStore Preferences for modern SSoT persistence
    implementation(libs.androidx.datastore.preferences)

    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.ktx)
    kapt(libs.androidx.room.compiler)
    testImplementation(libs.junit)
    testImplementation(libs.kotlinx.coroutines.test)
    testImplementation(libs.mockk)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.work.testing)
}