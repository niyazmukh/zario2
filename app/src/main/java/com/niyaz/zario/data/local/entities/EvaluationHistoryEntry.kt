package com.niyaz.zario.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "evaluation_history")
data class EvaluationHistoryEntry(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val userEmail: String,
    val packageName: String,
    val appName: String,
    val goalTimeMs: Long,
    val finalUsageMs: Long,
    val evaluationStartTime: Long,
    val evaluationEndTime: Long,
    val metGoal: Boolean
) 