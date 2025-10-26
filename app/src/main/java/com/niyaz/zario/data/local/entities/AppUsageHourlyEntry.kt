package com.niyaz.zario.data.local.entities

import androidx.room.Entity
import androidx.room.Index

@Entity(
    tableName = "hourly_app_usage",
    primaryKeys = ["userId", "planLabel", "cycleStartTime", "hourStartTime", "packageName"],
    indices = [
        Index(value = ["userId", "cycleStartTime", "hourStartTime"]),
        Index(value = ["userId", "planLabel"])
    ]
)
data class AppUsageHourlyEntry(
    val userId: String,
    val userEmail: String,
    val planLabel: String,
    val cycleStartTime: Long,
    val hourStartTime: Long,
    val hourEndTime: Long,
    val packageName: String,
    val usageMs: Long
)
