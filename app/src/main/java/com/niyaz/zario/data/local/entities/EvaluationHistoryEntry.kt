package com.niyaz.zario.data.local.entities

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "evaluation_history",
    indices = [Index(value = ["userId", "evaluationEndTime"])]
)
data class EvaluationHistoryEntry(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val userId: String,
    val userEmail: String,
    val planLabel: String,
    val goalTimeMs: Long,
    val dailyAverageMs: Long,
    val finalUsageMs: Long,
    val evaluationStartTime: Long,
    val evaluationEndTime: Long,
    val metGoal: Boolean,
    val pointsDelta: Int,
    val pointsBalanceAfter: Int
)
