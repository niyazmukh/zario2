package com.niyaz.zario.data.local.entities

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "hourly_app_usage",
    indices = [
        Index(value = ["userId", "cycleStartTime", "hourStartTime"]),
        Index(value = ["userId", "planLabel"])
    ]
)
data class AppUsageHourlyEntry(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val userId: String,
    val userEmail: String,
    val planLabel: String,
    val cycleStartTime: Long,
    val hourStartTime: Long,
    val hourEndTime: Long,
    val packageName: String,
    val usageMs: Long
)
