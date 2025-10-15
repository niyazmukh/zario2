package com.niyaz.zario.core.evaluation

import android.util.Log
import com.niyaz.zario.Constants
import com.niyaz.zario.data.Condition
import com.niyaz.zario.data.ScreenTimePlan
import com.niyaz.zario.core.evaluation.storage.HourlyUsageMapper
import com.niyaz.zario.data.UserSession
import com.niyaz.zario.data.local.entities.EvaluationHistoryEntry
import com.niyaz.zario.domain.PointsCalculator
import com.niyaz.zario.repository.UserSessionRepository
import com.niyaz.zario.security.UserIdentity
import com.niyaz.zario.usage.UsageBucket
import com.niyaz.zario.utils.CalendarUtils
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class EvaluationResultProcessor @Inject constructor(
    private val evaluationRepository: EvaluationRepository,
    private val sessionRepository: UserSessionRepository,
    private val remoteDataSource: EvaluationRemoteDataSource
) {

    data class Result(
        val planLabel: String,
        val goalTimeMs: Long,
        val finalUsageMs: Long,
        val metGoal: Boolean,
        val nextCycleStartTime: Long,
        val newPointBalance: Int
    )

    suspend fun finalizeCycle(
        plan: ScreenTimePlan,
        finalUsageMs: Long,
        evaluationStartTime: Long,
        evaluationEndTime: Long,
    hourlyUsage: List<UsageBucket> = emptyList()
    ): Result {
        val session: UserSession = sessionRepository.awaitSession()
        val user = session.user
        val userEmail = user?.email.orEmpty()
        val existingUserId = user?.id ?: ""
        val userId = if (existingUserId.isNotBlank()) existingUserId else UserIdentity.fromEmail(userEmail)
        val goalTime = plan.goalTimeMs
        val metGoal = if (goalTime > 0) finalUsageMs <= goalTime else false

        val condition = user?.condition ?: Condition.CONTROL
        val delta = PointsCalculator.calculateDelta(
            condition = condition,
            metGoal = metGoal,
            flexibleReward = user?.flexibleReward,
            flexiblePenalty = user?.flexiblePenalty
        )
        val newBalance = sessionRepository.adjustPoints(delta)
        Log.d(TAG, "Adjusted points by $delta – new balance: $newBalance")

        val historyEntry = EvaluationHistoryEntry(
            userId = userId,
            userEmail = user?.email ?: "",
            planLabel = plan.label,
            goalTimeMs = plan.goalTimeMs,
            dailyAverageMs = plan.dailyAverageMs,
            finalUsageMs = finalUsageMs,
            evaluationStartTime = evaluationStartTime,
            evaluationEndTime = evaluationEndTime,
            metGoal = metGoal,
            pointsDelta = delta,
            pointsBalanceAfter = newBalance
        )
        evaluationRepository.recordCycleResult(historyEntry)

        val hourlyEntries = HourlyUsageMapper.map(
            userId = userId,
            userEmail = userEmail,
            planLabel = plan.label,
            cycleStartTime = evaluationStartTime,
            buckets = hourlyUsage
        )
        evaluationRepository.recordHourlyUsage(hourlyEntries)

        runCatching {
            remoteDataSource.syncCycleResult(historyEntry, hourlyEntries, newBalance)
        }

        if (metGoal) {
            val streak = evaluationRepository.incrementGoalSuccessStreak()
            if (streak >= STREAK_THRESHOLD) {
                val reducedGoal = (goalTime * 9L) / 10L
                val normalizedGoal = reducedGoal.coerceAtLeast(MIN_GOAL_TIME_MS)
                if (normalizedGoal < goalTime) {
                    evaluationRepository.updateGoalTime(normalizedGoal)
                    evaluationRepository.resetGoalSuccessStreak()
                    Log.i(TAG, "Goal reduced from $goalTime to $normalizedGoal after streak of $streak successes")
                } else {
                    Log.i(TAG, "Goal reduction skipped because minimum threshold reached ($goalTime ms)")
                    evaluationRepository.resetGoalSuccessStreak()
                }
            }
        } else {
            evaluationRepository.resetGoalSuccessStreak()
        }

        evaluationRepository.markEvaluationCompleted(evaluationEndTime)

        val nextCycleStart = CalendarUtils.getStartOfNextDay(evaluationEndTime)
        evaluationRepository.startNextCycle(nextCycleStart)

        return Result(
            planLabel = plan.label,
            goalTimeMs = goalTime,
            finalUsageMs = finalUsageMs,
            metGoal = metGoal,
            nextCycleStartTime = nextCycleStart,
            newPointBalance = newBalance
        )
    }

    companion object {
        private const val TAG = "EvaluationResultProcessor"
        private const val STREAK_THRESHOLD = 3
        private val MIN_GOAL_TIME_MS = 10L * Constants.MILLISECONDS_PER_SECOND * Constants.SECONDS_PER_MINUTE
    }
}
