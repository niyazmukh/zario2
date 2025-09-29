package com.niyaz.zario.core.evaluation.storage

import com.niyaz.zario.data.local.entities.AppUsageHourlyEntry
import com.niyaz.zario.utils.UsageStatsUtils

internal object HourlyUsageMapper {
    fun map(
        userId: String,
        userEmail: String,
        planLabel: String,
        cycleStartTime: Long,
        buckets: List<UsageStatsUtils.UsageBucket>
    ): List<AppUsageHourlyEntry> {
        if (userId.isBlank()) return emptyList()
        return buckets.flatMap { bucket ->
            bucket.totalsByPackage
                .filterValues { usage -> usage > 0L }
                .map { (packageName, usageMs) ->
                    AppUsageHourlyEntry(
                        userId = userId,
                        userEmail = userEmail,
                        planLabel = planLabel,
                        cycleStartTime = cycleStartTime,
                        hourStartTime = bucket.bucketStartMs,
                        hourEndTime = bucket.bucketEndMs,
                        packageName = packageName,
                        usageMs = usageMs
                    )
                }
        }
    }
}
