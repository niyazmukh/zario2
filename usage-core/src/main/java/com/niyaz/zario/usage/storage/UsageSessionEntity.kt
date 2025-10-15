package com.niyaz.zario.usage.storage

import androidx.room.Entity
import androidx.room.Index

/**
 * Represents a foreground usage session for an application.
 */
@Entity(
    tableName = "usage_sessions",
    primaryKeys = ["packageName", "startMs"],
    indices = [
        Index(value = ["dayStartMs"], name = "idx_usage_sessions_day"),
        Index(value = ["packageName", "dayStartMs"], name = "idx_usage_sessions_package_day"),
        Index(value = ["startMs", "endMs"], name = "idx_sessions_time_range")
    ]
)
data class UsageSessionEntity(
    val packageName: String,
    val startMs: Long,
    val endMs: Long,
    val durationMs: Long,
    val dayStartMs: Long,
    val taskRootPackageName: String?
)
