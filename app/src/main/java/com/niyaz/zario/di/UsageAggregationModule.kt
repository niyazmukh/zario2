package com.niyaz.zario.di

import android.app.usage.UsageStatsManager
import android.content.Context
import com.niyaz.zario.BuildFlags
import androidx.room.Room
import com.niyaz.zario.usage.UsageAggregationConfig
import com.niyaz.zario.usage.UsageAggregationStore
import com.niyaz.zario.usage.UsageEventLoader
import com.niyaz.zario.usage.UsageEventSource
import com.niyaz.zario.usage.UsageIngestionTelemetry
import com.niyaz.zario.usage.UsageIngestionTelemetryLogger
import com.niyaz.zario.usage.UsageTimelineReconciler
import com.niyaz.zario.usage.ingest.TrackedEventSource
import com.niyaz.zario.usage.ingest.UsageEventBus
import com.niyaz.zario.usage.storage.UsageAggregationDatabase
import com.niyaz.zario.usage.storage.UsageRawEventDao
import com.niyaz.zario.usage.storage.UsageSessionDao
import com.niyaz.zario.usage.tracking.CompositeTrackedEventSource
import com.niyaz.zario.usage.tracking.LauncherPackageResolver
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import kotlinx.coroutines.CoroutineScope

@Module
@InstallIn(SingletonComponent::class)
object UsageAggregationModule {

    private val SUPPRESSED_TASK_ROOT_PACKAGES = setOf(
        "com.android.systemui",
        "com.google.android.packageinstaller",
        "com.google.android.permissioncontroller",
        "com.android.permissioncontroller",
        "com.sec.android.app.launcher",
        "com.android.launcher3",
        "com.niyaz.zario"
    )

    private val SUPPRESSED_TASK_ROOT_CLASS_NAMES = setOf(
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

    private val HOST_ATTRIBUTION_PACKAGES = setOf(
        "com.android.vending",
        "com.google.android.instantapps.supervisor",
        "com.google.android.googlequicksearchbox"
    )

    private val NAVIGATION_PACKAGES = setOf(
        "com.android.systemui",
        "com.android.quickstep",
        "com.google.android.permissioncontroller",
        "com.android.permissioncontroller",
        "com.google.android.packageinstaller",
        "com.niyaz.zario"
    )

    private val NAVIGATION_ACTIVITY_CLASS_NAMES = SUPPRESSED_TASK_ROOT_CLASS_NAMES

    @Provides
    @Singleton
    fun provideUsageAggregationConfig(
        launcherPackageResolver: LauncherPackageResolver
    ): UsageAggregationConfig {
        val launcherResult = launcherPackageResolver.resolve()
        val suppressedPackages = (SUPPRESSED_TASK_ROOT_PACKAGES + launcherResult.packages).toSet()
        val suppressedClasses = (SUPPRESSED_TASK_ROOT_CLASS_NAMES + launcherResult.activityClassNames).toSet()
        val navigationPackages = (NAVIGATION_PACKAGES + launcherResult.packages).toSet()
        val navigationClasses = (NAVIGATION_ACTIVITY_CLASS_NAMES + launcherResult.activityClassNames).toSet()

        return UsageAggregationConfig(
            suppressedTaskRootPackages = suppressedPackages,
            suppressedTaskRootClassNames = suppressedClasses,
            hostPackagesForAttribution = HOST_ATTRIBUTION_PACKAGES,
            navigationPackages = navigationPackages,
            navigationActivityClassNames = navigationClasses,
            enableFilteredEventQuery = true
        )
    }

    @Provides
    @Singleton
    fun provideUsageStatsManager(
        @ApplicationContext context: Context
    ): UsageStatsManager =
        requireNotNull(context.getSystemService(Context.USAGE_STATS_SERVICE) as? UsageStatsManager) {
            "UsageStatsManager service unavailable"
        }

    @Provides
    @Singleton
    fun provideUsageEventBus(
        @ApplicationScope scope: CoroutineScope
    ): UsageEventBus = UsageEventBus(scope)

    @Provides
    @Singleton
    fun provideUsageAggregationDatabase(
        @ApplicationContext context: Context
    ): UsageAggregationDatabase =
        Room.databaseBuilder(
            context,
            UsageAggregationDatabase::class.java,
            UsageAggregationDatabase.DATABASE_NAME
        ).fallbackToDestructiveMigration()
            .fallbackToDestructiveMigrationOnDowngrade()
            .build()

    @Provides
    fun provideUsageSessionDao(
        database: UsageAggregationDatabase
    ): UsageSessionDao = database.usageSessionDao()

    @Provides
    fun provideUsageRawEventDao(
        database: UsageAggregationDatabase
    ): UsageRawEventDao = database.usageRawEventDao()

    @Provides
    @Singleton
    fun provideUsageIngestionTelemetry(
        logger: UsageIngestionTelemetryLogger
    ): UsageIngestionTelemetry =
        if (BuildFlags.isDebug) {
            // In debug builds use the verbose logger
            logger
        } else {
            // In release builds, return NO_OP to avoid diagnostic overhead
            UsageIngestionTelemetry.NO_OP
        }

    @Provides
    @Singleton
    fun provideUsageEventSource(
        usageStatsManager: UsageStatsManager,
        config: UsageAggregationConfig,
        telemetry: UsageIngestionTelemetry
    ): UsageEventSource = UsageEventLoader(usageStatsManager, config, telemetry = telemetry)

    @Provides
    @Singleton
    fun provideTrackedEventSource(
        usageEventSource: UsageEventSource,
        rawEventDao: UsageRawEventDao,
        config: UsageAggregationConfig
    ): TrackedEventSource = CompositeTrackedEventSource(usageEventSource, rawEventDao, config)

    @Provides
    @Singleton
    fun provideUsageAggregationStore(
        trackedEventSource: TrackedEventSource,
        rawEventDao: UsageRawEventDao,
        sessionDao: UsageSessionDao,
        config: UsageAggregationConfig,
        telemetry: UsageIngestionTelemetry
    ): UsageAggregationStore = UsageAggregationStore(
        trackedEventSource = trackedEventSource,
        timelineReconciler = UsageTimelineReconciler(config),
        dao = sessionDao,
        rawEventDao = rawEventDao,
        config = config,
        telemetry = telemetry
    )
}
