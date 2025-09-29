package com.niyaz.zario.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "hourly_sync_state")
data class HourlySyncStateEntity(
    @PrimaryKey val key: String,
    val userId: String,
    val cycleStartTime: Long,
    val lastSyncedHourStart: Long,
    val updatedAt: Long = System.currentTimeMillis()
) {
    companion object {
        fun keyFor(userId: String, cycleStartTime: Long): String = "$userId-$cycleStartTime"
    }
}
