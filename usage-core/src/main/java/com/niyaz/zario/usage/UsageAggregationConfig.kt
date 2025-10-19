package com.niyaz.zario.usage

import java.time.Clock
import java.time.Duration
import java.time.ZoneId

/**
 * Tunable knobs for usage aggregation that mirror Digital Wellbeing heuristics.
 */
data class UsageAggregationConfig(
    val mergeGap: Duration = Duration.ofMinutes(1),
    val taskContinuityGap: Duration = Duration.ofSeconds(30),
    val sliceDuration: Duration = Duration.ofHours(12),
    val maxLookback: Duration = Duration.ofDays(8),
    val suppressedTaskRootPackages: Set<String> = emptySet(),
    val suppressedTaskRootClassNames: Set<String> = emptySet(),
    val enableFilteredEventQuery: Boolean = true,
    val zoneId: ZoneId = ZoneId.systemDefault(),
    val clock: Clock = Clock.systemDefaultZone()
)
