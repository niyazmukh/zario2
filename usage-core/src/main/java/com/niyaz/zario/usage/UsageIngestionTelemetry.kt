package com.niyaz.zario.usage

/**
 * Hook for capturing ingestion diagnostics so the app can validate suppression heuristics against
 * Digital Wellbeing traces. Implementations may log, persist, or export the aggregated metrics.
 */
interface UsageIngestionTelemetry {

    fun onIngestionResult(result: Result)

    data class Result(
        val windowStartMs: Long,
        val windowEndMs: Long,
        val sliceCount: Int,
        val totalEventsRead: Int,
        val eventsEmitted: Int,
        val suppressedTaskRootPackages: Map<String, Int>,
        val suppressedTaskRootClassNames: Map<String, Int>,
        val nullPackageDrops: Int,
        val unknownTypeDrops: Int,
        val droppedEvents: List<DroppedEvent> = emptyList(),
        val perPackageStats: Map<String, PackageDropStats> = emptyMap()
    )

    /**
     * Detailed information about a single dropped event for debugging.
     */
    data class DroppedEvent(
        val timestampMs: Long,
        val packageName: String?,
        val eventType: Int,
        val taskRootPackageName: String?,
        val taskRootClassName: String?,
        val dropReason: DropReason,
        val instanceId: Int? = null
    )

    /**
     * Per-package statistics showing what percentage of events were dropped.
     */
    data class PackageDropStats(
        val packageName: String,
        val totalEvents: Int,
        val droppedEvents: Int,
        val emittedEvents: Int,
        val dropReasons: Map<DropReason, Int>
    ) {
        val dropRate: Double
            get() = if (totalEvents > 0) droppedEvents.toDouble() / totalEvents else 0.0
    }

    enum class DropReason {
        NULL_PACKAGE,
        UNKNOWN_TYPE,
        SUPPRESSED_TASK_ROOT_PACKAGE,
        SUPPRESSED_TASK_ROOT_CLASS,
        NOT_TRACKED_TYPE
    }

    object NO_OP : UsageIngestionTelemetry {
        override fun onIngestionResult(result: Result) = Unit
    }
}