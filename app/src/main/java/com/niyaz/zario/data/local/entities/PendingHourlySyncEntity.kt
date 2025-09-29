package com.niyaz.zario.data.local.entities

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "pending_hourly_sync",
    indices = [
        Index(value = ["userId", "cycleStartTime", "hourStartTime"]),
        Index(value = ["parentCycleId"]),
        Index(
            value = ["userId", "cycleStartTime", "hourStartTime", "packageName", "syncType"],
            unique = true
        )
    ]
)
data class PendingHourlySyncEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val parentCycleId: Long?,
    val userId: String,
    val userEmail: String,
    val planLabel: String,
    val cycleStartTime: Long,
    val hourStartTime: Long,
    val hourEndTime: Long,
    val packageName: String,
    val usageMs: Long,
    val syncType: SyncType,
    val attempts: Int = 0,
    val lastAttemptAt: Long? = null,
    val createdAt: Long = System.currentTimeMillis()
) {
    enum class SyncType {
        CYCLE,
        LIVE
    }
}
