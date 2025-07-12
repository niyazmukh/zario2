# Test APK specific keep rules
-dontobfuscate
-dontoptimize

# Keep instrumentation test classes
-keep class * extends android.app.Application { *; }
-keep class * extends androidx.test.runner.AndroidJUnitRunner { *; }

# Ensure Hilt test components are retained
-keep class dagger.hilt.android.testing.** { *; } 