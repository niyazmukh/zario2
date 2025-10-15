package com.niyaz.zario.usage

/**
 * Immutable representation of a usage event sourced from [android.app.usage.UsageStatsManager].
 */
data class UsageEvent(
    val timestampMs: Long,
    val type: UsageEventType,
    val packageName: String,
    val instanceId: Int? = null,
    val taskRootPackageName: String? = null,
    val taskRootClassName: String? = null
)
