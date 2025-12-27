package com.niyaz.zario.usage

import com.niyaz.zario.usage.ingest.model.ActivityLifecycleState
import com.niyaz.zario.usage.ingest.model.EventConfidence
import com.niyaz.zario.usage.ingest.model.ScreenStateEvent
import com.niyaz.zario.usage.ingest.model.TrackedEvent
import org.junit.Assert.assertEquals

class UsageTimelineReconcilerTest {

    private val config = UsageAggregationConfig()
    private val reconciler = UsageTimelineReconciler(config)

    @org.junit.Test
    fun `sessions extend with continuity gap after explicit STOPPED event`() {
        val start = 0L
        val events = listOf(
            TrackedEvent.ActivityLifecycle(
                epochMillis = 1000,
                confidence = EventConfidence.HIGH,
                packageName = "com.twitter.android",
                activityClass = "MainActivity",
                state = ActivityLifecycleState.RESUMED
            ),
            TrackedEvent.ActivityLifecycle(
                epochMillis = 5000,
                confidence = EventConfidence.HIGH,
                packageName = "com.twitter.android",
                activityClass = "MainActivity",
                state = ActivityLifecycleState.STOPPED
            )
        )

        val sessions = reconciler.reconcile(events, start, 100_000)

        assertEquals(1, sessions.size)
        val session = sessions.single()
        assertEquals(1000, session.startMs)
        assertEquals(35_000, session.endMs)
    }

    @org.junit.Test
    fun `sessions extend with continuity gap after MOVE_TO_BACKGROUND`() {
        val start = 0L
        val events = listOf(
            TrackedEvent.UsageStats(
                epochMillis = 1000,
                confidence = EventConfidence.MEDIUM,
                packageName = "com.instagram.android",
                type = UsageEventType.MOVE_TO_FOREGROUND,
                backingEvent = UsageEvent(1000, UsageEventType.MOVE_TO_FOREGROUND, "com.instagram.android")
            ),
            TrackedEvent.UsageStats(
                epochMillis = 8000,
                confidence = EventConfidence.MEDIUM,
                packageName = "com.instagram.android",
                type = UsageEventType.MOVE_TO_BACKGROUND,
                backingEvent = UsageEvent(8000, UsageEventType.MOVE_TO_BACKGROUND, "com.instagram.android")
            )
        )
        val sessions = reconciler.reconcile(events, start, 100_000)
        assertEquals(1, sessions.size)
        val session = sessions.single()
        assertEquals(1000, session.startMs)
        // Should extend 30s beyond background event
        assertEquals(38_000, session.endMs)
    }

    @org.junit.Test
    fun `sessions extend with continuity gap after screen off event`() {
        val start = 0L
        val events = listOf(
            TrackedEvent.ActivityLifecycle(
                epochMillis = 1000,
                confidence = EventConfidence.HIGH,
                packageName = "com.twitter.android",
                activityClass = "MainActivity",
                state = ActivityLifecycleState.RESUMED
            ),
            TrackedEvent.ScreenState(
                epochMillis = 10_000,
                confidence = EventConfidence.HIGH,
                state = ScreenStateEvent.SCREEN_OFF
            )
        )

        val sessions = reconciler.reconcile(events, start, 100_000)

        assertEquals(1, sessions.size)
        val session = sessions.single()
        assertEquals(1000, session.startMs)
        assertEquals(10_000, session.endMs)
    }

    @org.junit.Test
    fun `open sessions extend through window end`() {
        val start = 0L
        val windowEnd = 100_000L
        val events = listOf(
            TrackedEvent.ActivityLifecycle(
                epochMillis = 1000,
                confidence = EventConfidence.HIGH,
                packageName = "com.twitter.android",
                activityClass = "MainActivity",
                state = ActivityLifecycleState.RESUMED
            ),
            // No explicit close event - session remains open
            TrackedEvent.UsageStats(
                epochMillis = 5000,
                confidence = EventConfidence.MEDIUM,
                packageName = "com.twitter.android",
                type = UsageEventType.USER_INTERACTION,
                backingEvent = UsageEvent(5000, UsageEventType.USER_INTERACTION, "com.twitter.android")
            )
        )

        val sessions = reconciler.reconcile(events, start, windowEnd)

        assertEquals(1, sessions.size)
        val session = sessions.single()
        assertEquals(1000, session.startMs)
        // Open sessions now extend all the way to the processing window end to avoid undercounting.
        assertEquals(windowEnd, session.endMs)
    }

    @org.junit.Test
    fun `reconcile merges overlapping events by confidence`() {
        val start = 1_000L
        val end = 10_000L
        val events = listOf(
            TrackedEvent.ActivityLifecycle(
                epochMillis = start + 100,
                confidence = EventConfidence.HIGH,
                packageName = "com.test.app",
                activityClass = "Main",
                state = ActivityLifecycleState.RESUMED
            ),
            TrackedEvent.UsageStats(
                epochMillis = start + 500,
                confidence = EventConfidence.MEDIUM,
                packageName = "com.test.app",
                type = com.niyaz.zario.usage.UsageEventType.MOVE_TO_BACKGROUND,
                backingEvent = UsageEvent(start + 500, UsageEventType.MOVE_TO_BACKGROUND, "com.test.app")
            ),
            TrackedEvent.ActivityLifecycle(
                epochMillis = start + 3_000,
                confidence = EventConfidence.HIGH,
                packageName = "com.test.app",
                activityClass = "Main",
                state = ActivityLifecycleState.PAUSED
            )
        )

        val sessions = reconciler.reconcile(events, start, end)

        assertEquals(1, sessions.size)
        val session = sessions.single()
        assertEquals("com.test.app", session.packageName)
        assertEquals(start + 100, session.startMs)
        assertEquals(end, session.endMs)
    }

    @org.junit.Test
    fun `screen off closes all open sessions`() {
        val start = 0L
        val events = listOf(
            TrackedEvent.ActivityLifecycle(
                epochMillis = 1_000,
                confidence = EventConfidence.HIGH,
                packageName = "com.social",
                activityClass = "Timeline",
                state = ActivityLifecycleState.RESUMED
            ),
            TrackedEvent.ScreenState(
                epochMillis = 5_000,
                confidence = EventConfidence.HIGH,
                state = ScreenStateEvent.SCREEN_OFF
            )
        )

        val sessions = reconciler.reconcile(events, start, 10_000)
        assertEquals(1, sessions.size)
        assertEquals(5_000, sessions.first().endMs)
    }

    @org.junit.Test
    fun `higher confidence resume retains original foreground start`() {
        val start = 0L
        val events = listOf(
            TrackedEvent.UsageStats(
                epochMillis = 500,
                confidence = EventConfidence.MEDIUM,
                packageName = "org.telegram.messenger",
                type = UsageEventType.MOVE_TO_FOREGROUND,
                backingEvent = UsageEvent(500, UsageEventType.MOVE_TO_FOREGROUND, "org.telegram.messenger")
            ),
            TrackedEvent.ActivityLifecycle(
                epochMillis = 1_000,
                confidence = EventConfidence.HIGH,
                packageName = "org.telegram.messenger",
                activityClass = "TelegramActivity",
                state = ActivityLifecycleState.RESUMED
            ),
            TrackedEvent.ActivityLifecycle(
                epochMillis = 6_500,
                confidence = EventConfidence.HIGH,
                packageName = "org.telegram.messenger",
                activityClass = "TelegramActivity",
                state = ActivityLifecycleState.PAUSED
            )
        )

        val sessions = reconciler.reconcile(events, start, 10_000)

        assertEquals(1, sessions.size)
        val session = sessions.single()
        assertEquals(500, session.startMs)
        assertEquals(10_000, session.endMs)
    }

    @org.junit.Test
    fun `intra task swaps stay within single session`() {
        val start = 0L
        val events = listOf(
            TrackedEvent.ActivityLifecycle(
                epochMillis = 100,
                confidence = EventConfidence.HIGH,
                packageName = "com.twitter.android",
                activityClass = "MainActivity",
                state = ActivityLifecycleState.RESUMED
            ),
            TrackedEvent.ActivityLifecycle(
                epochMillis = 1_000,
                confidence = EventConfidence.MEDIUM,
                packageName = "com.twitter.android",
                activityClass = "MainActivity",
                state = ActivityLifecycleState.PAUSED
            ),
            TrackedEvent.ActivityLifecycle(
                epochMillis = 1_050,
                confidence = EventConfidence.MEDIUM,
                packageName = "com.twitter.android",
                activityClass = "TweetDetailActivity",
                state = ActivityLifecycleState.RESUMED
            ),
            TrackedEvent.ActivityLifecycle(
                epochMillis = 4_500,
                confidence = EventConfidence.MEDIUM,
                packageName = "com.twitter.android",
                activityClass = "TweetDetailActivity",
                state = ActivityLifecycleState.PAUSED
            ),
            TrackedEvent.ActivityLifecycle(
                epochMillis = 5_000,
                confidence = EventConfidence.HIGH,
                packageName = "com.twitter.android",
                activityClass = "MainActivity",
                state = ActivityLifecycleState.STOPPED
            )
        )

        val sessions = reconciler.reconcile(events, start, 10_000)

        assertEquals(1, sessions.size)
        val session = sessions.single()
        assertEquals(100, session.startMs)
        assertEquals(35_000, session.endMs)
    }

    @org.junit.Test
    fun `usage stats duplicate foreground events do not fragment session`() {
        val start = 0L
        val events = listOf(
            TrackedEvent.UsageStats(
                epochMillis = 200,
                confidence = EventConfidence.MEDIUM,
                packageName = "com.instagram.android",
                type = UsageEventType.MOVE_TO_FOREGROUND,
                backingEvent = UsageEvent(200, UsageEventType.MOVE_TO_FOREGROUND, "com.instagram.android")
            ),
            TrackedEvent.UsageStats(
                epochMillis = 500,
                confidence = EventConfidence.LOW,
                packageName = "com.instagram.android",
                type = UsageEventType.MOVE_TO_FOREGROUND,
                backingEvent = UsageEvent(500, UsageEventType.MOVE_TO_FOREGROUND, "com.instagram.android")
            ),
            TrackedEvent.UsageStats(
                epochMillis = 2_000,
                confidence = EventConfidence.HIGH,
                packageName = "com.instagram.android",
                type = UsageEventType.MOVE_TO_BACKGROUND,
                backingEvent = UsageEvent(2_000, UsageEventType.MOVE_TO_BACKGROUND, "com.instagram.android")
            )
        )

        val sessions = reconciler.reconcile(events, start, 5_000)

        assertEquals(1, sessions.size)
        val session = sessions.single()
        assertEquals(200, session.startMs)
        assertEquals(32_000, session.endMs)
    }

    @org.junit.Test
    fun `does not merge sessions separated by noticeable gap`() {
        val start = 0L
        val windowEnd = 100_000L
        val events = listOf(
            TrackedEvent.UsageStats(
                epochMillis = 1_000,
                confidence = EventConfidence.HIGH,
                packageName = "com.example.app",
                type = UsageEventType.MOVE_TO_FOREGROUND,
                backingEvent = UsageEvent(1_000, UsageEventType.MOVE_TO_FOREGROUND, "com.example.app")
            ),
            TrackedEvent.UsageStats(
                epochMillis = 5_000,
                confidence = EventConfidence.HIGH,
                packageName = "com.example.app",
                type = UsageEventType.MOVE_TO_BACKGROUND,
                backingEvent = UsageEvent(5_000, UsageEventType.MOVE_TO_BACKGROUND, "com.example.app")
            ),
            TrackedEvent.UsageStats(
                epochMillis = 50_000,
                confidence = EventConfidence.HIGH,
                packageName = "com.example.app",
                type = UsageEventType.MOVE_TO_FOREGROUND,
                backingEvent = UsageEvent(50_000, UsageEventType.MOVE_TO_FOREGROUND, "com.example.app")
            ),
            TrackedEvent.UsageStats(
                epochMillis = 55_000,
                confidence = EventConfidence.HIGH,
                packageName = "com.example.app",
                type = UsageEventType.MOVE_TO_BACKGROUND,
                backingEvent = UsageEvent(55_000, UsageEventType.MOVE_TO_BACKGROUND, "com.example.app")
            )
        )

        val sessions = reconciler.reconcile(events, start, windowEnd)

        assertEquals(2, sessions.size)
        assertEquals(1_000, sessions[0].startMs)
        assertEquals(35_000, sessions[0].endMs)
        assertEquals(50_000, sessions[1].startMs)
        assertEquals(85_000, sessions[1].endMs)
    }

    @org.junit.Test
    fun `merges sessions split by small idle gap`() {
        val start = 0L
        val windowEnd = 15_000L
        val events = listOf(
            TrackedEvent.ActivityLifecycle(
                epochMillis = 1_000,
                confidence = EventConfidence.HIGH,
                packageName = "com.example.smallgap",
                activityClass = "MainActivity",
                state = ActivityLifecycleState.RESUMED
            ),
            TrackedEvent.ActivityLifecycle(
                epochMillis = 4_000,
                confidence = EventConfidence.HIGH,
                packageName = "com.example.smallgap",
                activityClass = "MainActivity",
                state = ActivityLifecycleState.STOPPED
            ),
            TrackedEvent.ActivityLifecycle(
                epochMillis = 4_500,
                confidence = EventConfidence.HIGH,
                packageName = "com.example.smallgap",
                activityClass = "MainActivity",
                state = ActivityLifecycleState.RESUMED
            ),
            TrackedEvent.ActivityLifecycle(
                epochMillis = 9_000,
                confidence = EventConfidence.HIGH,
                packageName = "com.example.smallgap",
                activityClass = "MainActivity",
                state = ActivityLifecycleState.STOPPED
            )
        )

        val sessions = reconciler.reconcile(events, start, windowEnd)

        assertEquals(1, sessions.size)
        val session = sessions.single()
        assertEquals(1_000, session.startMs)
        assertEquals(39_000, session.endMs)
    }
}