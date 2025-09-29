package com.niyaz.zario.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pending_cycle_sync")
data class PendingCycleSyncEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val userId: String,
    val userEmail: String,
    val historyDocumentId: String,
    val planLabel: String,
    val goalTimeMs: Long,
    val dailyAverageMs: Long,
    val finalUsageMs: Long,
    val evaluationStartTime: Long,
    val evaluationEndTime: Long,
    val metGoal: Boolean,
    val pointsDelta: Int,
    val pointsBalanceAfter: Int,
    val attempts: Int = 0,
    val lastAttemptAt: Long? = null,
    val createdAt: Long = System.currentTimeMillis()
)
