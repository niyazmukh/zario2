package com.niyaz.zario.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pending_app_interaction")
data class PendingAppInteractionEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val userId: String,
    val userEmail: String,
    val occurredAt: Long,
    val source: AppInteractionSource,
    val appVersionName: String?,
    val appVersionCode: Long?,
    val attempts: Int = 0,
    val lastAttemptAt: Long? = null,
    val createdAt: Long = System.currentTimeMillis()
)

enum class AppInteractionSource {
    COLD_START,
    FOREGROUND
}
