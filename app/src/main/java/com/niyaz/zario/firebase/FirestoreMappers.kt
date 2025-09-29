package com.niyaz.zario.firebase

import com.google.firebase.firestore.DocumentSnapshot
import com.niyaz.zario.data.ScreenTimePlan
import com.niyaz.zario.data.local.entities.AppUsageHourlyEntry
import com.niyaz.zario.data.local.entities.EvaluationHistoryEntry

fun DocumentSnapshot.toEvaluationHistoryEntry(userId: String, userEmail: String): EvaluationHistoryEntry {
    return EvaluationHistoryEntry(
        userId = userId,
        userEmail = userEmail,
        planLabel = getString("planLabel") ?: ScreenTimePlan.DEFAULT_LABEL,
        goalTimeMs = getLong("goalTimeMs") ?: 0L,
        dailyAverageMs = getLong("dailyAverageMs") ?: 0L,
        finalUsageMs = getLong("finalUsageMs") ?: 0L,
        evaluationStartTime = getLong("evaluationStartTime") ?: 0L,
        evaluationEndTime = getLong("evaluationEndTime") ?: 0L,
        metGoal = getBoolean("metGoal") ?: false,
        pointsDelta = (getLong("pointsDelta") ?: 0L).toInt(),
        pointsBalanceAfter = (getLong("pointsBalanceAfter") ?: 0L).toInt()
    )
}

fun DocumentSnapshot.toAppUsageHourlyEntry(userId: String, userEmail: String, planLabel: String): AppUsageHourlyEntry {
    return AppUsageHourlyEntry(
        userId = userId,
        userEmail = userEmail,
        planLabel = planLabel,
        cycleStartTime = getLong("cycleStartTime") ?: 0L,
        hourStartTime = getLong("hourStartTime") ?: 0L,
        hourEndTime = getLong("hourEndTime") ?: 0L,
        packageName = getString("packageName") ?: "",
        usageMs = getLong("usageMs") ?: 0L
    )
}

fun Map<String, Any?>.toScreenTimePlan(): ScreenTimePlan? {
    val goalTimeMs = (this["goalTimeMs"] as? Number)?.toLong() ?: return null
    val dailyAverageMs = (this["dailyAverageMs"] as? Number)?.toLong() ?: 0L
    val label = (this["label"] as? String) ?: ScreenTimePlan.DEFAULT_LABEL
    val planCreatedAt = (this["planCreatedAt"] as? Number)?.toLong() ?: System.currentTimeMillis()
    val evaluationStartTime = (this["evaluationStartTime"] as? Number)?.toLong()
    return ScreenTimePlan(goalTimeMs, dailyAverageMs, label, planCreatedAt, evaluationStartTime)
}
