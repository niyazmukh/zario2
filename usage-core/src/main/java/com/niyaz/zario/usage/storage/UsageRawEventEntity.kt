package com.niyaz.zario.usage.storage

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "usage_raw_events",
    indices = [
        Index(value = ["timestampMs"], name = "idx_usage_raw_events_ts"),
        Index(value = ["source"], name = "idx_usage_raw_events_source")
    ]
)
data class UsageRawEventEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val timestampMs: Long,
    val source: String,
    val packageName: String?,
    val activityClass: String?,
    val state: String,
    val confidenceOrdinal: Int,
    val extras: String? = null
)