# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

# --- Hilt / Dagger ---
-keep class dagger.hilt.** { *; }
-keep class javax.inject.** { *; }

# --- WorkManager + HiltWorker (reflection instantiation) ---
-keep class androidx.hilt.work.HiltWorker { *; }
-keep class com.niyaz.zario.worker.** { *; }

# --- Keep generated Hilt components / injectors ---
-keep class * extends dagger.hilt.internal.ComponentSupplier { *; }
-keep class * extends dagger.hilt.internal.GeneratedComponent { *; }

# --- ViewBinding classes (accessed via reflection by layout inflaters) ---
-keep class **Binding { *; }

# --- Keep Kotlin metadata annotations (avoid stripping) ---
-keepattributes *Annotation*,EnclosingMethod,EnclosingClass