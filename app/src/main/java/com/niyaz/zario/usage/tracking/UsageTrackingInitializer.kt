package com.niyaz.zario.usage.tracking

import android.app.Application
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UsageTrackingInitializer @Inject constructor(
    private val activityLifecycleTracker: ActivityLifecycleTracker,
    private val screenStateTracker: ScreenStateTracker
) {

    fun initialize(application: Application) {
        application.registerActivityLifecycleCallbacks(activityLifecycleTracker)
        screenStateTracker.register(application)
    }

    fun shutdown(application: Application) {
        application.unregisterActivityLifecycleCallbacks(activityLifecycleTracker)
        screenStateTracker.unregister(application)
    }
}