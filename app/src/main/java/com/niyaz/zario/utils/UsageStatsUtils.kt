package com.niyaz.zario.utils

import android.app.usage.UsageEvents
import android.app.usage.UsageStatsManager
import android.content.Context
import android.util.Log
import com.niyaz.zario.Constants

/**
 * Helper functions around [UsageStatsManager]. Centralised here so that both
 * background workers and UI (ViewModel) can reuse the exact same logic.
 * Keeping the implementation in **one** place prevents subtle divergences
 * between headless and in-process calculations.
 */
object UsageStatsUtils {

    private const val TAG = "UsageStatsUtils"

    // ---------------------------------------------------------------------------------
    // Helper to fetch event constants that may not exist on older/compile SDKs
    // We resolve them via reflection so the code compiles against all API levels while
    // still taking advantage of newer event types when the device supports them.
    // ---------------------------------------------------------------------------------
    private fun resolveEventConstant(name: String): Int? = try {
        UsageEvents.Event::class.java.getDeclaredField(name).getInt(null)
    } catch (_: Exception) { null }

    private val START_EVENTS: Set<Int> = buildSet {
        add(UsageEvents.Event.ACTIVITY_RESUMED)
        // MOVE_TO_FOREGROUND is available from API 30 (R)
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.R) {
            add(UsageEvents.Event.MOVE_TO_FOREGROUND)
        }
        // TOP_RESUMED_STATE_GAINED exists from API 29 but guard via reflection for safety
        resolveEventConstant("TOP_RESUMED_STATE_GAINED")?.let { add(it) }
    }

    private val END_EVENTS: Set<Int> = buildSet {
        add(UsageEvents.Event.ACTIVITY_PAUSED)
        add(UsageEvents.Event.ACTIVITY_STOPPED)
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.R) {
            add(UsageEvents.Event.MOVE_TO_BACKGROUND)
        }
        resolveEventConstant("TOP_RESUMED_STATE_LOST")?.let { add(it) }
    }

    // -----------------------------------------------------------------
    // Aggregated helpers (battery-friendly alternative)
    // -----------------------------------------------------------------

    /**
     * Returns the cumulative foreground time for [packageName] since the last device boot.
     * Leverages the system-aggregated stats which are far cheaper than walking events.
     */
    fun getCumulativeForegroundTime(context: Context, packageName: String): Long {
        return try {
            val usageStatsManager = context.getSystemService(Context.USAGE_STATS_SERVICE) as UsageStatsManager
            val now = System.currentTimeMillis()

            // queryAndAggregateUsageStats gives one UsageStats per package (fast)
            val aggregate = usageStatsManager.queryAndAggregateUsageStats(0, now)
            aggregate[packageName]?.totalTimeInForeground ?: 0L
        } catch (e: Exception) {
            Log.e(TAG, "Error fetching cumulative foreground time", e)
            0L
        }
    }

    /**
     * Computes usage **since** [baselineUsageMs] using the aggregated counter. Handles counter reset
     * (device reboot) by returning 0 instead of a negative value.
     */
    fun usageSinceBaseline(context: Context, packageName: String, baselineUsageMs: Long): Long {
        val currentTotal = getCumulativeForegroundTime(context, packageName)
        val delta = currentTotal - baselineUsageMs
        return if (delta < 0) 0L else delta
    }

    /**
     * Returns the duration (ms) of the current foreground session if the app is
     * presently active. Scans at most [lookBackMs] of events, so the cost is negligible.
     */
    fun currentActiveSession(
        context: Context,
        packageName: String,
        lookBackMs: Long = 5 * 60_000L, // default 5-minute window
        evaluationStartTime: Long? = null
    ): Long {
        return try {
            val now = System.currentTimeMillis()
            val usageStatsManager = context.getSystemService(Context.USAGE_STATS_SERVICE) as UsageStatsManager
            val events = usageStatsManager.queryEvents(now - lookBackMs, now)
            var lastStart = -1L

            val event = UsageEvents.Event()
            while (events.hasNextEvent()) {
                events.getNextEvent(event)
                if (event.packageName != packageName) continue

                if (event.eventType in START_EVENTS) {
                    lastStart = event.timeStamp
                } else if (event.eventType in END_EVENTS) {
                    // session ended – reset marker
                    lastStart = -1L
                }
            }

            if (lastStart != -1L) {
                val clampedStart = if (evaluationStartTime != null) {
                    kotlin.math.max(lastStart, evaluationStartTime)
                } else lastStart

                // Protect against negative duration if evaluationStartTime is in the future
                kotlin.math.max(0L, now - clampedStart)
            } else 0L
        } catch (e: Exception) {
            Log.e(TAG, "Error calculating current active session", e)
            0L
        }
    }

    /**
     * Hybrid helper: aggregate delta since baseline **plus** live session time.
     * Ensures real-time progress while keeping the heavy event walk minimal.
     */
    fun preciseUsageSinceBaseline(
        context: Context,
        packageName: String,
        baselineUsageMs: Long,
        evaluationStartTime: Long? = null
    ): Long {
        // Always run hybrid calculation.
        val aggregateDelta = usageSinceBaseline(context, packageName, baselineUsageMs)
        val eventDelta = eventBasedDelta(context, packageName, evaluationStartTime)

        Log.d(
            TAG,
            "Hybrid usage – aggregateDelta=$aggregateDelta ms, eventDelta=$eventDelta ms (returned=${kotlin.math.max(aggregateDelta, eventDelta)} ms)"
        )

        return kotlin.math.max(aggregateDelta, eventDelta)
    }

    /**
     * Calculates foreground usage between [start] (nullable) and now using [UsageEvents]. If
     * [start] is null, we fall back to the lightweight currentActiveSession calculation which
     * captures any on-going foreground usage.
     */
    private fun eventBasedDelta(
        context: Context,
        packageName: String,
        start: Long?
    ): Long {
        if (start == null) {
            // No evaluation window – just return the current live session length.
            return currentActiveSession(context, packageName)
        }

        return try {
            val usageStatsManager = context.getSystemService(Context.USAGE_STATS_SERVICE) as UsageStatsManager
            val now = System.currentTimeMillis()
            Log.d(TAG, "Event-walk usage calculation from $start to $now")

            val events = usageStatsManager.queryEvents(start, now)
            var total = 0L
            var activeStart: Long? = null
            var count = 0
            val event = UsageEvents.Event()

            while (events.getNextEvent(event)) {
                if (event.packageName != packageName) continue
                count++
                if (event.eventType in START_EVENTS) {
                    if (activeStart == null) activeStart = event.timeStamp
                } else if (event.eventType in END_EVENTS) {
                    activeStart?.let {
                        total += event.timeStamp - it
                        activeStart = null
                    }
                }
            }

            // If the session is still active till now
            activeStart?.let { total += now - it }

            Log.d(TAG, "Event-walk result: $total ms from $count events")
            total
        } catch (e: Exception) {
            Log.e(TAG, "Error during event-based delta calculation", e)
            0L
        }
    }

    /**
     * Returns true if [packageName] has been in the foreground within a dynamically sized
     * window. The window length is calculated as:
     *   lookBackMs = min(EVALUATION_DURATION_MS, max(goalTimeMs, MIN_ACTIVE_LOOKBACK_MS))
     * This guarantees that:
     *   • very small goals (< 5 min) are still monitored correctly, and
     *   • we never scan more than the current evaluation cycle (24 h by default).
     */
    fun isTargetAppCurrentlyActive(
        context: Context,
        packageName: String,
        goalTimeMs: Long
    ): Boolean {
        // Fast-path: if the target app is the current foreground app, we are definitely active.
        // This removes the dependency on a START event being present inside the bounded
        // look-back window and fixes the long-session miss reported in issue #active-window.
        if (getCurrentForegroundApp(context) == packageName) {
            Log.d(TAG, "Target $packageName is currently foreground – active state TRUE via getCurrentForegroundApp")
            return true
        }

        // Minimum 5-minute window expressed via Constants to stay consistent project-wide
        val minWindowMs = 5 * Constants.SECONDS_PER_MINUTE * Constants.MILLISECONDS_PER_SECOND

        val dynamicWindow = kotlin.math.min(
            Constants.EVALUATION_DURATION_MS,
            kotlin.math.max(goalTimeMs, minWindowMs)
        )

        val activeSessionDuration = currentActiveSession(context, packageName, dynamicWindow)
        return activeSessionDuration > 0L
    }

    /**
     * Gets the current foreground app package name.
     * Returns null if unable to determine.
     */
    fun getCurrentForegroundApp(context: Context): String? {
        return try {
            val usageStatsManager = context.getSystemService(Context.USAGE_STATS_SERVICE) as UsageStatsManager
            val now = System.currentTimeMillis()
            
            // Get the most recent usage stats (last 1 minute)
            val stats = usageStatsManager.queryUsageStats(
                UsageStatsManager.INTERVAL_DAILY,
                now - 60_000L, // 1 minute ago
                now
            )
            
            // Find the app with the most recent last time used
            stats.maxByOrNull { it.lastTimeUsed }?.packageName
            
        } catch (e: Exception) {
            Log.e(TAG, "Error getting current foreground app", e)
            null
        }
    }
} 