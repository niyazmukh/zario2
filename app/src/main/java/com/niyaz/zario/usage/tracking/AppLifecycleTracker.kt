package com.niyaz.zario.usage.tracking

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import com.niyaz.zario.usage.ingest.model.AppLifecycleState
import com.niyaz.zario.usage.ingest.model.EventConfidence
import com.niyaz.zario.usage.ingest.model.TrackedEvent
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppLifecycleTracker @Inject constructor(
    private val recorder: UsageEventRecorder
) : DefaultLifecycleObserver {

    override fun onStart(owner: LifecycleOwner) {
        recorder.publish(
            TrackedEvent.AppLifecycle(
                epochMillis = System.currentTimeMillis(),
                confidence = EventConfidence.HIGH,
                state = AppLifecycleState.FOREGROUND,
                foregroundPackage = null
            )
        )
    }

    override fun onStop(owner: LifecycleOwner) {
        recorder.publish(
            TrackedEvent.AppLifecycle(
                epochMillis = System.currentTimeMillis(),
                confidence = EventConfidence.HIGH,
                state = AppLifecycleState.BACKGROUND,
                foregroundPackage = null
            )
        )
    }
}