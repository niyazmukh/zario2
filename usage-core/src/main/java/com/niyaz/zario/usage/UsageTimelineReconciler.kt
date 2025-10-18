package com.niyaz.zario.usage

import com.niyaz.zario.usage.ingest.model.ActivityLifecycleState
import com.niyaz.zario.usage.ingest.model.AppLifecycleState
import com.niyaz.zario.usage.ingest.model.EventConfidence
import com.niyaz.zario.usage.ingest.model.ScreenStateEvent
import com.niyaz.zario.usage.ingest.model.TrackedEvent
import java.time.Duration

/**
 * Synthesizes per-application foreground sessions from heterogeneous tracking signals.
 */
class UsageTimelineReconciler(
    private val config: UsageAggregationConfig
) {

    private val taskContinuityGapMs = config.taskContinuityGap.toMillis()

    fun reconcile(events: List<TrackedEvent>, windowStartMs: Long, windowEndMs: Long): List<UsageSession> {
        if (events.isEmpty()) return emptyList()
        val boundedEvents = events.filter { it.epochMillis in windowStartMs..windowEndMs }
        if (boundedEvents.isEmpty()) return emptyList()

        val sorted = boundedEvents.sortedBy { it.epochMillis }
        val openSessions = mutableMapOf<String, SessionAccumulator>()
        val sessions = mutableListOf<UsageSession>()

        for (event in sorted) {
            when (event) {
                is TrackedEvent.ActivityLifecycle -> handleActivityEvent(event, openSessions, sessions)
                is TrackedEvent.UsageStats -> handleUsageStats(event, openSessions, sessions)
                is TrackedEvent.ScreenState -> handleScreen(event, openSessions, sessions)
                is TrackedEvent.AppLifecycle -> handleAppLifecycle(event, openSessions, sessions)
            }
        }

        // Only extend open sessions to windowEnd if they were never closed by a PAUSED/STOPPED/etc event
        for ((_, accumulator) in openSessions) {
            sessions += accumulator.finish(accumulator.lastEventMs, 0L) // End at last event, no artificial extension
        }

        return mergeSessions(sessions)
    }

    private fun handleActivityEvent(
        event: TrackedEvent.ActivityLifecycle,
        open: MutableMap<String, SessionAccumulator>,
        sessions: MutableList<UsageSession>
    ) {
        when (event.state) {
            ActivityLifecycleState.RESUMED -> open.ensureForeground(
                packageName = event.packageName,
                timestamp = event.epochMillis,
                confidence = event.confidence,
                taskRoot = event.activityClass
            )
            ActivityLifecycleState.PAUSED -> open.touch(event.packageName, event.epochMillis, event.confidence)
            ActivityLifecycleState.STOPPED,
            ActivityLifecycleState.DESTROYED -> open.finishIfAllowed(
                packageName = event.packageName,
                timestamp = event.epochMillis,
                confidence = event.confidence
            )?.let(sessions::add)
        }
    }

    private fun handleUsageStats(
        event: TrackedEvent.UsageStats,
        open: MutableMap<String, SessionAccumulator>,
        sessions: MutableList<UsageSession>
    ) {
        when {
            event.type.isForegroundOpenEvent -> open.ensureForeground(
                packageName = event.packageName,
                timestamp = event.epochMillis,
                confidence = event.confidence,
                taskRoot = event.backingEvent.taskRootPackageName
            )
            event.type.closesAllSessions -> sessions += open.finishAll(
                timestamp = event.epochMillis,
                confidence = event.confidence
            )
            event.type.isForegroundCloseEvent -> open.finishIfAllowed(
                packageName = event.packageName,
                timestamp = event.epochMillis,
                confidence = event.confidence
            )?.let(sessions::add)
        }
    }

    private fun handleScreen(
        event: TrackedEvent.ScreenState,
        open: MutableMap<String, SessionAccumulator>,
        sessions: MutableList<UsageSession>
    ) {
        if (event.state == ScreenStateEvent.SCREEN_OFF || event.state == ScreenStateEvent.NON_INTERACTIVE) {
            sessions += open.finishAll(timestamp = event.epochMillis)
        }
    }

    private fun handleAppLifecycle(
        event: TrackedEvent.AppLifecycle,
        open: MutableMap<String, SessionAccumulator>,
        sessions: MutableList<UsageSession>
    ) {
        if (event.state == AppLifecycleState.BACKGROUND) {
            sessions += open.finishAll(
                timestamp = event.epochMillis,
                confidence = event.confidence
            )
        }
    }

    private fun MutableMap<String, SessionAccumulator>.ensureForeground(
        packageName: String,
        timestamp: Long,
        confidence: EventConfidence,
        taskRoot: String?
    ) {
        val updated = this[packageName]
            ?.withForegroundEvent(timestamp, confidence, taskRoot)
            ?: SessionAccumulator(
                packageName = packageName,
                startMs = timestamp,
                lastEventMs = timestamp,
                confidence = confidence,
                taskRootPackageName = taskRoot
            )

        this[packageName] = updated
    }

    private fun MutableMap<String, SessionAccumulator>.finishIfAllowed(
        packageName: String,
        timestamp: Long,
        confidence: EventConfidence
    ): UsageSession? {
        val accumulator = this[packageName] ?: return null
        if (confidence.ordinal > accumulator.confidence.ordinal) {
            this[packageName] = accumulator.withTouch(timestamp, confidence)
            return null
        }
        val updated = accumulator.withCloseBoundary(timestamp)
        remove(packageName)
        // End session exactly at this close event
        return updated.finish(timestamp, 0L)
    }

    private fun MutableMap<String, SessionAccumulator>.finishAll(
        timestamp: Long,
        confidence: EventConfidence? = null
    ): List<UsageSession> {
        val finished = mutableListOf<UsageSession>()
        val iterator = iterator()
        while (iterator.hasNext()) {
            val entry = iterator.next()
            val accumulator = entry.value
            if (confidence != null && confidence.ordinal > accumulator.confidence.ordinal) {
                entry.setValue(accumulator.withTouch(timestamp, confidence))
                continue
            }
            // End session exactly at this close event
            finished += accumulator.withCloseBoundary(timestamp).finish(timestamp, 0L)
            iterator.remove()
        }
        return finished
    }

    private fun MutableMap<String, SessionAccumulator>.touch(
        packageName: String,
        timestamp: Long,
        confidence: EventConfidence
    ) {
        val accumulator = this[packageName] ?: return
        this[packageName] = accumulator.withTouch(timestamp, confidence)
    }

    private fun mergeSessions(sessions: List<UsageSession>): List<UsageSession> {
        if (sessions.isEmpty()) return sessions
        val mergeGapMs = config.mergeGap.toMillis()
        val grouped = sessions.sortedWith(compareBy<UsageSession> { it.packageName }.thenBy { it.startMs })
        val merged = mutableListOf<UsageSession>()
        var current = grouped.first()
        for (index in 1 until grouped.size) {
            val next = grouped[index]
            if (next.packageName == current.packageName && next.startMs - current.endMs <= mergeGapMs) {
                current = UsageSession(
                    packageName = current.packageName,
                    startMs = minOf(current.startMs, next.startMs),
                    endMs = maxOf(current.endMs, next.endMs),
                    taskRootPackageName = current.taskRootPackageName ?: next.taskRootPackageName
                )
            } else {
                merged += current
                current = next
            }
        }
        merged += current
        return merged
    }

    private data class SessionAccumulator(
        val packageName: String,
        val startMs: Long,
        val lastEventMs: Long,
        val confidence: EventConfidence,
        val taskRootPackageName: String?
    ) {
        fun withForegroundEvent(timestamp: Long, newConfidence: EventConfidence, taskRoot: String?): SessionAccumulator {
            val updatedConfidence = if (newConfidence.ordinal < confidence.ordinal) newConfidence else confidence
            val updatedStart = minOf(startMs, timestamp)
            val updatedTaskRoot = taskRootPackageName ?: taskRoot
            val updatedLastEvent = maxOf(lastEventMs, timestamp)
            return copy(
                startMs = updatedStart,
                lastEventMs = updatedLastEvent,
                confidence = updatedConfidence,
                taskRootPackageName = updatedTaskRoot
            )
        }

        fun withTouch(timestamp: Long, newConfidence: EventConfidence): SessionAccumulator {
            val updatedConfidence = if (newConfidence.ordinal < confidence.ordinal) newConfidence else confidence
            val updatedLastEvent = maxOf(lastEventMs, timestamp)
            return copy(
                lastEventMs = updatedLastEvent,
                confidence = updatedConfidence
            )
        }

        fun withCloseBoundary(timestamp: Long): SessionAccumulator {
            val updatedLastEvent = maxOf(lastEventMs, timestamp)
            return copy(lastEventMs = updatedLastEvent)
        }

        fun finish(requestedEnd: Long, continuityGapMs: Long): UsageSession {
            // Only extend if continuityGapMs > 0 (i.e., truly open session)
            val end = if (continuityGapMs > 0) {
                val maxContinuityEnd = lastEventMs + continuityGapMs
                val candidateEnd = minOf(requestedEnd, maxContinuityEnd)
                maxOf(candidateEnd, startMs + MIN_SESSION_LENGTH_MS, lastEventMs)
            } else {
                maxOf(requestedEnd, startMs + MIN_SESSION_LENGTH_MS, lastEventMs)
            }
            return UsageSession(
                packageName = packageName,
                startMs = startMs,
                endMs = end,
                taskRootPackageName = taskRootPackageName
            )
        }
    }

    companion object {
        private val MIN_SESSION_LENGTH_MS = Duration.ofSeconds(1).toMillis()
    }
}