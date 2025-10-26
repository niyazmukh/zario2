package com.niyaz.zario.usage

import android.util.Log
import com.niyaz.zario.BuildFlags
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UsageIngestionTelemetryLogger @Inject constructor() : UsageIngestionTelemetry {

    private val dateFormat = SimpleDateFormat("HH:mm:ss.SSS", Locale.US)

    override fun onIngestionResult(result: UsageIngestionTelemetry.Result) {
        if (!shouldLogVerbose()) return
        logSummary(result)
        logPerPackageStats(result)
        logHighValueDrops(result)
        logDetailedDrops(result)
    }

    override fun onNavigationSanitization(stats: UsageIngestionTelemetry.NavigationSanitization) {
        if (!shouldLogVerbose()) return
        val message = buildString {
            append("=== NAVIGATION SANITIZATION ===\n")
            append("Window: [${formatTime(stats.windowStartMs)} - ${formatTime(stats.windowEndMs)}]\n")
            append("Reassigned: ${stats.reassignedDurationMs}ms, Dropped: ${stats.droppedDurationMs}ms\n")
        }
        Log.i(TAG, message)
    }

    private fun logSummary(result: UsageIngestionTelemetry.Result) {
        val message = buildString {
            append("=== USAGE INGESTION SUMMARY (Hybrid Filtering) ===\n")
            append("Window: [${formatTime(result.windowStartMs)} - ${formatTime(result.windowEndMs)}]\n")
            append("Total Events Read: ${result.totalEventsRead}\n")
            append("Events Emitted: ${result.eventsEmitted}\n")
            append("Events Dropped: ${result.totalEventsRead - result.eventsEmitted}\n")
            val dropRate = if (result.totalEventsRead > 0) {
                (result.totalEventsRead - result.eventsEmitted).toDouble() / result.totalEventsRead
            } else {
                0.0
            }
            append("Drop Rate: ${String.format(Locale.US, "%.1f%%", dropRate * 100)}\n")
            append("Null Package Drops: ${result.nullPackageDrops}\n")
            append("Unknown Type Drops: ${result.unknownTypeDrops}\n")
            append("Suppressed Packages: ${result.suppressedTaskRootPackages.size} types\n")
            append("Suppressed Classes: ${result.suppressedTaskRootClassNames.size} types\n")
            if (result.navigationPackageDrops.isNotEmpty()) {
                val totalNavDrops = result.navigationPackageDrops.values.sum()
                append("Navigation Packages Dropped: ${result.navigationPackageDrops.size} types ($totalNavDrops events)\n")
            } else {
                append("Navigation Packages Dropped: 0 types\n")
            }
            if (result.navigationDurationReassignedMs > 0L || result.navigationDurationDroppedMs > 0L) {
                append("Navigation Duration → reassigned=${result.navigationDurationReassignedMs}ms, dropped=${result.navigationDurationDroppedMs}ms\n")
            }
            append("Note: Apps USING system components are now tracked (hybrid filtering active)\n")
        }
        Log.i(TAG, message)
    }

    private fun logPerPackageStats(result: UsageIngestionTelemetry.Result) {
        if (result.perPackageStats.isEmpty()) return

        val highDropRatePackages = result.perPackageStats.values
            .filter { it.dropRate > 0.1 } // More than 10% drop rate
            .sortedByDescending { it.dropRate }
            .take(20)

        if (highDropRatePackages.isEmpty()) return

        val message = buildString {
            append("=== PACKAGES WITH HIGH DROP RATES ===\n")
            for (stat in highDropRatePackages) {
                append("${stat.packageName}:\n")
                append("  Total: ${stat.totalEvents}, Emitted: ${stat.emittedEvents}, ")
                append("Dropped: ${stat.droppedEvents} (${String.format(Locale.US, "%.1f%%", stat.dropRate * 100)})\n")
                append("  Reasons: ${stat.dropReasons.entries.joinToString { "${it.key}=${it.value}" }}\n")
            }
        }
        Log.w(TAG, message)
    }

    private fun logHighValueDrops(result: UsageIngestionTelemetry.Result) {
        // Focus on social media and high-use apps that we suspect are being undercounted
        val highValuePackages = setOf(
            "com.twitter.android",
            "com.instagram.android",
            "com.facebook.katana",
            "com.snapchat.android",
            "com.tiktok",
            "com.whatsapp",
            "com.google.android.youtube",
            "com.android.chrome"
        )

        val highValueDrops = result.droppedEvents.filter { 
            it.packageName in highValuePackages 
        }

        if (highValueDrops.isEmpty()) {
            // Good news - no drops for high-value apps with hybrid filtering!
            Log.i(TAG, "=== HIGH-VALUE APP STATUS ===\nNo drops detected for social media apps (hybrid filtering working)")
            return
        }

        val message = buildString {
            append("=== HIGH-VALUE APP DROPS (Social Media) ===\n")
            append("Found ${highValueDrops.size} dropped events from important apps:\n")
            append("NOTE: With hybrid filtering, these should be minimal/zero\n")
            
            highValueDrops.groupBy { it.packageName }.forEach { (pkg, events) ->
                append("\n${pkg}: ${events.size} drops\n")
                val byReason = events.groupBy { it.dropReason }
                byReason.forEach { (reason, reasonEvents) ->
                    append("  ${reason}: ${reasonEvents.size} events\n")
                    if (reason == UsageIngestionTelemetry.DropReason.SUPPRESSED_TASK_ROOT_PACKAGE ||
                        reason == UsageIngestionTelemetry.DropReason.SUPPRESSED_TASK_ROOT_CLASS) {
                        val taskRoots = reasonEvents.mapNotNull { it.taskRootPackageName }.distinct()
                        append("    Task Roots: ${taskRoots.joinToString()}\n")
                    }
                }
            }
        }
        Log.e(TAG, message) // Use ERROR level for critical drops
    }

    private fun logDetailedDrops(result: UsageIngestionTelemetry.Result) {
        // Log detailed drop information only if verbose logging is needed
        // For now, log first 10 drops of each type for debugging
        if (result.droppedEvents.isEmpty()) return

        val dropsByReason = result.droppedEvents.groupBy { it.dropReason }
        
        val message = buildString {
            append("=== DETAILED DROP SAMPLES ===\n")
            dropsByReason.forEach { (reason, events) ->
                append("${reason} (${events.size} total):\n")
                events.take(5).forEach { event ->
                    append("  ${formatTime(event.timestampMs)} | ")
                    append("pkg=${event.packageName ?: "null"} | ")
                    append("type=${event.eventType} | ")
                    append("taskRoot=${event.taskRootPackageName ?: "none"} | ")
                    append("class=${event.taskRootClassName ?: "none"}\n")
                }
                if (events.size > 5) {
                    append("  ... and ${events.size - 5} more\n")
                }
            }
        }
        Log.d(TAG, message)
    }

    private fun formatTime(timestampMs: Long): String {
        return dateFormat.format(Date(timestampMs))
    }

    private fun shouldLogVerbose(): Boolean =
        BuildFlags.isDebug || Log.isLoggable(TAG, Log.INFO)

    private companion object {
        const val TAG = "UsageIngestionTelemetry"
    }
}
