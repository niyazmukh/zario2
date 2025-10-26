package com.niyaz.zario.usage

import java.time.Clock
import java.time.Duration
import java.time.ZoneId

/**
 * Tunable knobs for usage aggregation that mirror Digital Wellbeing heuristics.
 */
data class UsageAggregationConfig(
    // Maximum idle gap we allow between two foreground sessions before treating them as separate.
    // Keeping this small (10s) lets us bridge brief hand-off jitter without inflating totals.
    val mergeGap: Duration = Duration.ofSeconds(10),
    val taskContinuityGap: Duration = Duration.ofSeconds(30),
    val sliceDuration: Duration = Duration.ofHours(12),
    val maxLookback: Duration = Duration.ofDays(8),
    val suppressedTaskRootPackages: Set<String> = emptySet(),
    val suppressedTaskRootClassNames: Set<String> = emptySet(),
    val hostPackagesForAttribution: Set<String> = emptySet(),
    val navigationPackages: Set<String> = emptySet(),
    val navigationActivityClassNames: Set<String> = emptySet(),
    val navigationDebounce: Duration = Duration.ofSeconds(8),
    val enableFilteredEventQuery: Boolean = true,
    val zoneId: ZoneId = ZoneId.systemDefault(),
    val clock: Clock = Clock.systemDefaultZone()
)
