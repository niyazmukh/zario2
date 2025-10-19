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
    compileSdk = 35

    defaultConfig {
        applicationId = "com.niyaz.zario"
        minSdk = 29
        targetSdk = 35
        versionCode = 10
        versionName = "1.3.6"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        
        // Ensure 16 KB page alignment for Android 15+ compatibility
        ndk {
            abiFilters += listOf("arm64-v8a", "armeabi-v7a")
        }
    }

    signingConfigs {
        val keystoreFile = rootProject.file("keystore/zario-release.jks")
        fun readCredential(primaryKey: String, legacyKey: String?): String? {
            val primary = loadCredential(primaryKey)
            if (!primary.isNullOrBlank()) return primary
            return legacyKey?.let { loadCredential(it) }
        }

        val releaseStorePassword = readCredential("ZARIO_KEYSTORE_PASSWORD", "ZARIO_KEYSTORE_PASSWORD")
        val releaseKeyPassword = readCredential("ZARIO_KEY_PASSWORD", "ZARIO_KEY_PASSWORD")
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
            val missingPieces = buildList {
                if (!keystoreFile.exists()) add("keystore file ${keystoreFile.path}")
                if (releaseStorePassword.isNullOrBlank()) add("ZARIO_KEYSTORE_PASSWORD")
                if (releaseKeyPassword.isNullOrBlank()) add("ZARIO_KEY_PASSWORD")
            }.joinToString(", ")
            logger.lifecycle("Release keystore configuration incomplete. Missing: $missingPieces")
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
                    "Release signing credentials are missing. Set ZARIO_KEYSTORE_PASSWORD and ZARIO_KEY_PASSWORD (or legacy ZARIO_* equivalents) via environment variables or local.properties (untracked)."
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
}

kapt {
    correctErrorTypes = true
    arguments {
        arg("room.schemaLocation", "$projectDir/schemas")
        arg("room.incremental", "true")
        arg("room.expandProjection", "true")
    }
}

dependencies {
    implementation(project(":usage-core"))
    implementation(platform("com.google.firebase:firebase-bom:34.4.0"))
    implementation("com.google.firebase:firebase-auth-ktx:23.1.0")
    implementation("com.google.firebase:firebase-firestore-ktx:25.1.0")
    implementation(libs.kotlinx.coroutines.play.services)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.fragment.ktx)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.lifecycle.process)
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
    testImplementation(libs.androidx.test.core)
    testImplementation(libs.robolectric)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.work.testing)
}