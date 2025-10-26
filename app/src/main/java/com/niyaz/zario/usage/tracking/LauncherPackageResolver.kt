package com.niyaz.zario.usage.tracking

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.content.pm.ResolveInfo
import android.os.Build
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.LazyThreadSafetyMode

@Singleton
class LauncherPackageResolver @Inject constructor(
    @ApplicationContext private val context: Context
) {

    data class Result(
        val packages: Set<String>,
        val activityClassNames: Set<String>
    )

    private val cachedResult: Lazy<Result> = lazy(LazyThreadSafetyMode.PUBLICATION) {
        computeLauncherPackages()
    }

    fun resolve(): Result = cachedResult.value

    fun prewarm() {
        if (!cachedResult.isInitialized()) {
            cachedResult.value
        }
    }

    private fun computeLauncherPackages(): Result {
        val packageManager = context.packageManager
        val launcherIntent = Intent(Intent.ACTION_MAIN).apply { addCategory(Intent.CATEGORY_HOME) }

        val resolvedActivities = queryLaunchers(packageManager, launcherIntent)
        val launcherPackages = mutableSetOf<String>()
        val launcherActivities = mutableSetOf<String>()

        resolvedActivities.forEach { info ->
            val activityInfo = info.activityInfo ?: return@forEach
            val pkg = activityInfo.packageName.orEmpty()
            if (pkg.isBlank()) return@forEach
            launcherPackages += pkg
            val name = activityInfo.name
            if (!name.isNullOrBlank()) {
                launcherActivities += if (name.startsWith(".")) {
                    "$pkg$name"
                } else {
                    name
                }
            }
        }

        launcherPackages += STATIC_LAUNCHER_PACKAGES
        launcherActivities += STATIC_LAUNCHER_ACTIVITIES
        launcherPackages += context.packageName

        return Result(
            packages = launcherPackages,
            activityClassNames = launcherActivities
        )
    }

    private fun queryLaunchers(
        packageManager: PackageManager,
        intent: Intent
    ): List<ResolveInfo> {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            packageManager.queryIntentActivities(
                intent,
                PackageManager.ResolveInfoFlags.of(PackageManager.MATCH_DEFAULT_ONLY.toLong())
            )
        } else {
            @Suppress("DEPRECATION")
            packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)
        }
    }

    private companion object {
        val STATIC_LAUNCHER_PACKAGES = setOf(
            "com.android.launcher",
            "com.android.launcher2",
            "com.android.launcher3",
            "com.android.quickstep",
            "com.google.android.apps.nexuslauncher",
            "com.sec.android.app.launcher",
            "com.miui.home",
            "com.huawei.android.launcher",
            "com.oppo.launcher",
            "com.coloros.launcher",
            "com.vivo.launcher",
            "net.oneplus.launcher",
            "com.teslacoilsw.launcher",
            "com.lawnchair",
            "ch.deletescape.lawnchair.plah",
            "org.pixelexperience.launcher",
            "com.novalauncher",
            "com.microsoft.launcher"
        )

        val STATIC_LAUNCHER_ACTIVITIES = setOf(
            "com.android.launcher3.Launcher",
            "com.android.launcher3.uioverrides.QuickstepLauncher",
            "com.google.android.apps.nexuslauncher.NexusLauncherActivity",
            "com.google.android.apps.nexuslauncher.NexusQuickstepLauncher",
            "com.samsung.android.launcher.HomeActivity",
            "com.android.systemui.recents.RecentsActivity",
            "com.android.systemui.statusbar.phone.StatusBar",
            "com.android.systemui.qs.QSActivity",
            "com.android.systemui.volume.VolumeDialog",
            "com.android.systemui.media.controls.ui.MediaControlPanel",
            "com.google.android.permissioncontroller.permission.ui.ReviewPermissionsActivity"
        )
    }
}
