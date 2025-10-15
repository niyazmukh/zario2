package com.niyaz.zario.usage.tracking

import android.app.Application
import androidx.lifecycle.ProcessLifecycleOwner
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UsageTrackingInitializer @Inject constructor(
    private val appLifecycleTracker: AppLifecycleTracker,
    private val activityLifecycleTracker: ActivityLifecycleTracker,
    private val screenStateTracker: ScreenStateTracker
) {

    fun initialize(application: Application) {
        ProcessLifecycleOwner.get().lifecycle.addObserver(appLifecycleTracker)
        application.registerActivityLifecycleCallbacks(activityLifecycleTracker)
        screenStateTracker.register(application)
    }

    fun shutdown(application: Application) {
        application.unregisterActivityLifecycleCallbacks(activityLifecycleTracker)
        ProcessLifecycleOwner.get().lifecycle.removeObserver(appLifecycleTracker)
        screenStateTracker.unregister(application)
    }
}