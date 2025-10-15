package com.niyaz.zario.usage

/**
 * Aggregated usage totals over a window.
 */
data class UsageSummary(
    val windowStartMs: Long,
    val windowEndMs: Long,
    val totalsByPackage: Map<String, Long>
) {
    val totalUsageMs: Long = totalsByPackage.values.sum()

    @Deprecated("Use totalUsageMs instead", ReplaceWith("totalUsageMs"))
    val totalDurationMs: Long
        get() = totalUsageMs
}

/**
 * Fixed-size bucket representing foreground usage within [bucketStartMs, bucketEndMs).
 */
data class UsageBucket(
    val bucketStartMs: Long,
    val bucketEndMs: Long,
    val totalsByPackage: Map<String, Long>
)

data class UsageGlobalSummary(
    val perDayUsageMs: List<Long>
) {
    private val positiveValues: List<Long> = perDayUsageMs.filter { it > 0L }
    val validDayCount: Int = positiveValues.size
    val todayUsageMs: Long = perDayUsageMs.firstOrNull() ?: 0L
    val trailingAverageMs: Long = if (positiveValues.isEmpty()) 0L else positiveValues.sum() / positiveValues.size
}
