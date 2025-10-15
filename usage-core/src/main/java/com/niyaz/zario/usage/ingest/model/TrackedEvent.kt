package com.niyaz.zario.usage.ingest.model

import com.niyaz.zario.usage.UsageEvent
import com.niyaz.zario.usage.UsageEventType

/** Canonical domain model emitted by every tracking layer prior to reconciliation. */
sealed interface TrackedEvent {
    val epochMillis: Long
    val source: TrackedSource
    val confidence: EventConfidence

    data class AppLifecycle(
        override val epochMillis: Long,
        override val confidence: EventConfidence,
        val state: AppLifecycleState,
        val foregroundPackage: String?
    ) : TrackedEvent {
        override val source: TrackedSource = TrackedSource.APP_LIFECYCLE
    }

    data class ActivityLifecycle(
        override val epochMillis: Long,
        override val confidence: EventConfidence,
        val packageName: String,
        val activityClass: String,
        val state: ActivityLifecycleState
    ) : TrackedEvent {
        override val source: TrackedSource = TrackedSource.ACTIVITY_LIFECYCLE
    }

    data class ScreenState(
        override val epochMillis: Long,
        override val confidence: EventConfidence,
        val state: ScreenStateEvent
    ) : TrackedEvent {
        override val source: TrackedSource = TrackedSource.SCREEN
    }

    data class UsageStats(
        override val epochMillis: Long,
        override val confidence: EventConfidence,
        val packageName: String,
        val type: UsageEventType,
        val backingEvent: UsageEvent
    ) : TrackedEvent {
        override val source: TrackedSource = TrackedSource.USAGE_STATS
    }

    data class Accessibility(
        override val epochMillis: Long,
        override val confidence: EventConfidence,
        val packageName: String,
        val className: String?
    ) : TrackedEvent {
        override val source: TrackedSource = TrackedSource.ACCESSIBILITY
    }
}

enum class TrackedSource {
    APP_LIFECYCLE,
    ACTIVITY_LIFECYCLE,
    SCREEN,
    USAGE_STATS,
    ACCESSIBILITY
}

enum class EventConfidence { HIGH, MEDIUM, LOW }

enum class AppLifecycleState { FOREGROUND, BACKGROUND }

enum class ActivityLifecycleState { RESUMED, PAUSED, STOPPED, DESTROYED }

enum class ScreenStateEvent { SCREEN_ON, SCREEN_OFF, USER_PRESENT, INTERACTIVE, NON_INTERACTIVE }