package com.niyaz.zario.usage.accessibility

import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent
import com.niyaz.zario.usage.ingest.model.EventConfidence
import com.niyaz.zario.usage.ingest.model.TrackedEvent
import com.niyaz.zario.usage.tracking.UsageEventRecorder

class TrackingAccessibilityService : AccessibilityService() {

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        val eventSource = event?.packageName?.toString() ?: return
        val className = event.className?.toString()
        if (event.eventType == AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED) {
            val recorder = getRecorder() ?: return
            recorder.publish(
                TrackedEvent.Accessibility(
                    epochMillis = System.currentTimeMillis(),
                    confidence = EventConfidence.MEDIUM,
                    packageName = eventSource,
                    className = className
                )
            )
        }
    }

    override fun onInterrupt() = Unit

    private fun getRecorder(): UsageEventRecorder? {
        return runCatching {
            (application as? RecorderProvider)?.provideRecorder()
        }.getOrNull()
    }

    interface RecorderProvider {
        fun provideRecorder(): UsageEventRecorder
    }
}