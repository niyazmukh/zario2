package com.niyaz.zario.firebase

import com.google.firebase.firestore.DocumentSnapshot
import com.niyaz.zario.data.ScreenTimePlan
import com.niyaz.zario.data.local.entities.AppUsageHourlyEntry
import com.niyaz.zario.data.local.entities.EvaluationHistoryEntry

fun DocumentSnapshot.toEvaluationHistoryEntry(userId: String, userEmail: String): EvaluationHistoryEntry {
    return EvaluationHistoryEntry(
        userId = userId,
        userEmail = userEmail,
        planLabel = getString("planLabel") ?: "",
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

/**
 * Supports both legacy hourly docs (one doc per package) and v2 hourly docs (one doc per hour with `packages`).
 */
fun DocumentSnapshot.toAppUsageHourlyEntries(
    userId: String,
    userEmail: String,
    fallbackPlanLabel: String
): List<AppUsageHourlyEntry> {
    val packages = get("packages")
    if (packages !is List<*>) {
        return listOf(toAppUsageHourlyEntry(userId, userEmail, fallbackPlanLabel))
    }

    val planLabel = getString("planLabel") ?: fallbackPlanLabel
    val cycleStartTime = getLong("cycleStartTime") ?: 0L
    val hourStartTime = getLong("hourStartTime") ?: 0L
    val hourEndTime = getLong("hourEndTime") ?: 0L

    return packages.mapNotNull { item ->
        val raw = item as? Map<*, *> ?: return@mapNotNull null
        val packageName = raw["packageName"] as? String ?: return@mapNotNull null
        val usageMs = (raw["usageMs"] as? Number)?.toLong() ?: 0L
        AppUsageHourlyEntry(
            userId = userId,
            userEmail = userEmail,
            planLabel = planLabel,
            cycleStartTime = cycleStartTime,
            hourStartTime = hourStartTime,
            hourEndTime = hourEndTime,
            packageName = packageName,
            usageMs = usageMs
        )
    }
}

fun Map<String, Any?>.toScreenTimePlan(): ScreenTimePlan? {
    val goalTimeMs = (this["goalTimeMs"] as? Number)?.toLong() ?: return null
    val dailyAverageMs = (this["dailyAverageMs"] as? Number)?.toLong() ?: 0L
    val label = (this["label"] as? String) ?: ""
    val planCreatedAt = (this["planCreatedAt"] as? Number)?.toLong() ?: System.currentTimeMillis()
    val evaluationStartTime = (this["evaluationStartTime"] as? Number)?.toLong()
    return ScreenTimePlan(goalTimeMs, dailyAverageMs, label, planCreatedAt, evaluationStartTime)
}
