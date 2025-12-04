package com.niyaz.zario.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pending_notification_event")
data class PendingNotificationEventEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val userId: String,
    val userEmail: String,
    val occurredAt: Long,
    val eventType: NotificationEventType,
    val category: NotificationCategory,
    val notificationId: Int,
    val channelId: String,
    val metadataJson: String?,
    val attempts: Int = 0,
    val lastAttemptAt: Long? = null,
    val createdAt: Long = System.currentTimeMillis()
)

enum class NotificationEventType {
    SENT,
    TAPPED
}

enum class NotificationCategory {
    USAGE_THRESHOLD,
    CYCLE_COMPLETION,
    UNKNOWN
}
