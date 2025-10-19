package com.niyaz.zario.usage.tracking

import android.app.Activity
import android.app.Application
import android.os.Bundle
import com.niyaz.zario.usage.ingest.model.ActivityLifecycleState
import com.niyaz.zario.usage.ingest.model.EventConfidence
import com.niyaz.zario.usage.ingest.model.TrackedEvent
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ActivityLifecycleTracker @Inject constructor(
    private val recorder: UsageEventRecorder
) : Application.ActivityLifecycleCallbacks {

    override fun onActivityResumed(activity: Activity) {
        recorder.publish(
            TrackedEvent.ActivityLifecycle(
                epochMillis = System.currentTimeMillis(),
                confidence = EventConfidence.HIGH,
                packageName = activity.packageName,
                activityClass = activity.javaClass.name,
                state = ActivityLifecycleState.RESUMED
            )
        )
    }

    override fun onActivityPaused(activity: Activity) {
        recorder.publish(
            TrackedEvent.ActivityLifecycle(
                epochMillis = System.currentTimeMillis(),
                confidence = EventConfidence.HIGH,
                packageName = activity.packageName,
                activityClass = activity.javaClass.name,
                state = ActivityLifecycleState.PAUSED
            )
        )
    }

    override fun onActivityStopped(activity: Activity) {
        recorder.publish(
            TrackedEvent.ActivityLifecycle(
                epochMillis = System.currentTimeMillis(),
                confidence = EventConfidence.HIGH,
                packageName = activity.packageName,
                activityClass = activity.javaClass.name,
                state = ActivityLifecycleState.STOPPED
            )
        )
    }

    // Implement the destroy callback as a no-op to satisfy the ActivityLifecycleCallbacks
    // interface. We intentionally avoid publishing DESTROYED events because they were
    // absent in observed UsageEvents and produced undesirable confidence interactions.
    override fun onActivityDestroyed(activity: Activity) = Unit

    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) = Unit
    override fun onActivityStarted(activity: Activity) = Unit
    override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) = Unit
}