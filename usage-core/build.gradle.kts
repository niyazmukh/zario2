plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
}

android {
    namespace = "com.niyaz.zario.usage"
    compileSdk = 35

    defaultConfig {
        minSdk = 29
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    testOptions {
        unitTests.isIncludeAndroidResources = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }

    buildFeatures {
        buildConfig = false
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
    implementation(libs.androidx.core.ktx)
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.kotlinx.coroutines.android)

    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.ktx)
    kapt(libs.androidx.room.compiler)

    testImplementation(libs.junit)
    testImplementation(libs.kotlinx.coroutines.test)
    testImplementation(libs.mockk)
    testImplementation(libs.robolectric)
}

// --- SDK 29–35 safety gate ----------------------------------------------------
// Prevents accidental compile-time references to API 34+ platform symbols from
// leaking into bytecode that runs on Android 10–13 (minSdk = 29).
tasks.register("verifyNoForbiddenPlatformRefs") {
    group = "verification"
    description = "Fails if compiled usage-core bytecode references API 34+ UsageEventsQuery symbols."

    dependsOn(tasks.matching { it.name.startsWith("compile") && (it.name.endsWith("Kotlin") || it.name.endsWith("JavaWithJavac")) })

    doLast {
        val forbiddenMarkers = listOf(
            "android/app/usage/UsageEventsQuery",
            "Landroid/app/usage/UsageEventsQuery;"
        )

        val roots = listOf(
            layout.buildDirectory.dir("tmp/kotlin-classes").get().asFile,
            layout.buildDirectory.dir("intermediates/javac").get().asFile
        ).filter { it.exists() }

        val classFiles = roots
            .flatMap { root ->
                root.walkTopDown()
                    .filter { it.isFile && it.extension == "class" }
                    .toList()
            }

        val violations = mutableListOf<Pair<java.io.File, String>>()
        for (file in classFiles) {
            // Classfile constant pools are binary but contain ASCII descriptors; ISO-8859-1 preserves bytes 1:1.
            val text = file.readBytes().toString(Charsets.ISO_8859_1)
            val hit = forbiddenMarkers.firstOrNull { marker -> text.contains(marker) }
            if (hit != null) {
                violations += file to hit
                if (violations.size >= 20) break
            }
        }

        if (violations.isNotEmpty()) {
            val rendered = violations.joinToString(separator = "\n") { (file, marker) ->
                "- ${file.relativeTo(projectDir)} (matched: $marker)"
            }
            throw GradleException(
                "Forbidden platform reference(s) detected in usage-core bytecode. " +
                    "This can crash on SDK < 34.\n$rendered"
            )
        }
    }
}

tasks.named("check") {
    dependsOn("verifyNoForbiddenPlatformRefs")
}
