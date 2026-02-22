package com.niyaz.zario.core.evaluation

import android.util.Log
import com.niyaz.zario.Constants
import com.niyaz.zario.core.evaluation.storage.CycleStateStore
import com.niyaz.zario.core.evaluation.storage.PlanPreferencesDataSource
import com.niyaz.zario.data.ScreenTimePlan
import com.niyaz.zario.data.local.dao.EvaluationHistoryDao
import com.niyaz.zario.data.local.dao.HourlyUsageDao
import com.niyaz.zario.data.local.entities.EvaluationHistoryEntry
import com.niyaz.zario.data.local.entities.AppUsageHourlyEntry
import com.niyaz.zario.di.ApplicationScope
import com.niyaz.zario.security.UserIdentity
import com.niyaz.zario.utils.CalendarUtils
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.withContext

@Singleton
class EvaluationRepository @Inject constructor(
    private val planPreferencesDataSource: PlanPreferencesDataSource,
    private val cycleStateStore: CycleStateStore,
    private val historyDao: EvaluationHistoryDao,
    private val hourlyUsageDao: HourlyUsageDao,
    private val remoteDataSource: EvaluationRemoteDataSource,
    @ApplicationScope private val applicationScope: CoroutineScope
) {

    /**
     * Suppresses notifications for the first calendar day after the first plan is set.
     * This prevents “day one” negative onboarding experiences when today's existing usage
     * is already near/exceeds the newly configured goal.
     */
    suspend fun shouldSuppressDayOneNotifications(cycleStartTime: Long): Boolean {
        val firstPlanSetAt = planPreferencesDataSource.latest().firstPlanSetAt ?: return false
        return CalendarUtils.isSameDay(firstPlanSetAt, cycleStartTime)
    }

    /**
     * Suppresses the Feedback screen for the first calendar day after the first plan is set.
     */
    suspend fun shouldSuppressDayOneFeedback(cycleStartTime: Long): Boolean {
        val firstPlanSetAt = planPreferencesDataSource.latest().firstPlanSetAt ?: return false
        return CalendarUtils.isSameDay(firstPlanSetAt, cycleStartTime)
    }

    /**
     * Suppresses points changes for the first calendar day after the first plan is set.
     */
    suspend fun shouldSuppressDayOnePoints(cycleStartTime: Long): Boolean {
        val firstPlanSetAt = planPreferencesDataSource.latest().firstPlanSetAt ?: return false
        return CalendarUtils.isSameDay(firstPlanSetAt, cycleStartTime)
    }

    val evaluationState: StateFlow<EvaluationStateSnapshot> =
        cycleStateStore.cycleState
            .map { state ->
                EvaluationStateSnapshot(
                    plan = state.plan,
                    usageThresholdReached = state.usageThresholdReached,
                    nextCycleStartTime = state.nextCycleStartTime,
                    evaluationCompleted = state.evaluationCompleted,
                    evaluationCompletionTime = state.evaluationCompletionTime,
                    feedbackViewed = state.feedbackViewed,
                    goalSuccessStreak = state.goalSuccessStreak
                )
            }
            .stateIn(applicationScope, SharingStarted.Eagerly, EvaluationStateSnapshot.EMPTY)

    val currentPlan: StateFlow<ScreenTimePlan?> =
        evaluationState
            .map { it.plan }
            .stateIn(applicationScope, SharingStarted.Eagerly, null)

    suspend fun savePlan(plan: ScreenTimePlan) {
        planPreferencesDataSource.savePlan(plan)
        runCatching { remoteDataSource.syncPlan(plan) }
    }

    suspend fun loadPlan(): ScreenTimePlan? = planPreferencesDataSource.latest().plan

    suspend fun startEvaluation(): ScreenTimePlan? {
        val snapshot = planPreferencesDataSource.latest()
        val plan = snapshot.plan ?: return null
        if (plan.evaluationStartTime != null) return plan

        val nextCycleStart = snapshot.nextCycleStartTime
        val now = System.currentTimeMillis()
        if (nextCycleStart != null && now < nextCycleStart) {
            Log.d(TAG, "startEvaluation deferred until next cycle window opens")
            return plan
        }

        val start = CalendarUtils.getStartOfCurrentDay()
        cycleStateStore.markEvaluationStarted(start)
        return plan.copy(evaluationStartTime = start)
    }

    suspend fun clearPlan() {
        planPreferencesDataSource.clear()
    }

    suspend fun hasPlanConfigured(): Boolean = planPreferencesDataSource.latest().plan != null

    /**
     * Returns true only when:
     * - a plan exists locally, AND
     * - the most recent evaluation cycle ended within the last [Constants.GOAL_REUSE_WINDOW_DAYS] days.
     *
     * If the user has no completed cycles yet (no history), the plan is considered valid.
     */
    suspend fun isPlanValidForUser(
        userId: String,
        userEmail: String,
        nowMs: Long = System.currentTimeMillis()
    ): Boolean {
        if (planPreferencesDataSource.latest().plan == null) return false

        val candidateIds = UserIdentity.candidateIds(userId, userEmail)
        val idsForQuery = if (candidateIds.isEmpty()) listOf(EMPTY_ID_SENTINEL) else candidateIds

        val latestEnd = historyDao.latestEvaluationEndTimeForUser(idsForQuery, userEmail)
            ?: return true

        // If timestamps are weird (e.g., future), treat as "not expired".
        if (latestEnd <= 0L || latestEnd > nowMs) return true

        val windowMs = TimeUnit.DAYS.toMillis(Constants.GOAL_REUSE_WINDOW_DAYS.toLong())
        return (nowMs - latestEnd) <= windowMs
    }

    suspend fun hasActiveEvaluation(): Boolean {
        val snapshot = cycleStateStore.latest()
        val plan = snapshot.plan ?: return false
        val start = plan.evaluationStartTime ?: return false
        val now = System.currentTimeMillis()

        if (snapshot.evaluationCompleted) {
            // If the evaluation is marked completed, check if it corresponds to the current cycle.
            // If the completion time is before the current start time, it's a stale flag from
            // a previous cycle, so the current cycle is actually active.
            val completionTime = snapshot.evaluationCompletionTime
            if (completionTime != null && completionTime < start) {
                return now >= start
            }
            return false
        }

        return now >= start
    }

    suspend fun isEvaluationExpired(): Boolean {
        val plan = planPreferencesDataSource.latest().plan ?: return false
        val start = plan.evaluationStartTime ?: return false
        val now = System.currentTimeMillis()
        return now >= CalendarUtils.getEndOfDay(start)
    }

    suspend fun getCurrentPlan(): ScreenTimePlan? = planPreferencesDataSource.latest().plan

    suspend fun getHighestUsageNotification(): Int =
        cycleStateStore.latest().usageThresholdReached

    suspend fun markUsageNotification(thresholdPercent: Int) {
        cycleStateStore.markUsageThresholdReached(thresholdPercent)
    }

    suspend fun getLastNotificationTime(): Long? {
        return planPreferencesDataSource.getLastNotificationTime()
    }

    suspend fun getNextCycleStartTime(): Long? =
        cycleStateStore.latest().nextCycleStartTime

    suspend fun isEvaluationCompleted(): Boolean {
        val snapshot = cycleStateStore.latest()
        val plan = snapshot.plan ?: return false
        if (!snapshot.evaluationCompleted) return false
        val completionTime = snapshot.evaluationCompletionTime ?: return false
        val start = plan.evaluationStartTime ?: return false
        return completionTime >= start && CalendarUtils.isSameDay(completionTime, start)
    }

    suspend fun markEvaluationCompleted(completionTime: Long = System.currentTimeMillis()) {
        cycleStateStore.markEvaluationCompleted(completionTime)
    }

    suspend fun getEvaluationCompletionTime(): Long? =
        cycleStateStore.latest().evaluationCompletionTime

    suspend fun shouldShowCompletionState(): Boolean {
        val snapshot = cycleStateStore.latest()
        val plan = snapshot.plan ?: return false
        val start = plan.evaluationStartTime ?: return false

        val now = System.currentTimeMillis()
        if (start > now) return false

        val dayExpired = !CalendarUtils.isWithinCurrentDay(start) ||
            now >= CalendarUtils.getEndOfCurrentDay()
        val completionTime = snapshot.evaluationCompletionTime
        val markedCompleted = snapshot.evaluationCompleted &&
            completionTime != null &&
            completionTime >= start &&
            CalendarUtils.isSameDay(completionTime, start)

        return dayExpired || markedCompleted
    }

    suspend fun hasUnviewedCompletedEvaluation(): Boolean {
        val snapshot = cycleStateStore.latest()
        return snapshot.evaluationCompleted && !snapshot.feedbackViewed
    }

    suspend fun markFeedbackViewed() {
        persistFeedbackConsumed()
    }

    suspend fun discardPendingFeedback(force: Boolean = false) {
        if (!force && !hasUnviewedCompletedEvaluation()) return
        persistFeedbackConsumed()
    }

    private suspend fun persistFeedbackConsumed() {
        // Ensure persistence even if caller scope is cancelled during navigation/app close
        withContext(NonCancellable) {
            cycleStateStore.markFeedbackViewed()
            cycleStateStore.resetCompletionFlags(forceClear = true)
        }
    }

    suspend fun recordCycleResult(entry: EvaluationHistoryEntry) {
        historyDao.insert(entry)
    }

    suspend fun recordHourlyUsage(entries: List<AppUsageHourlyEntry>) {
        if (entries.isEmpty()) return
        hourlyUsageDao.insertAll(entries)
    }

    fun observeHourlyUsage(userId: String, cycleStartTime: Long): Flow<List<AppUsageHourlyEntry>> =
        hourlyUsageDao.observeCycleUsage(userId, cycleStartTime)

    fun observeAllHourlyUsage(userId: String): Flow<List<AppUsageHourlyEntry>> =
        hourlyUsageDao.observeAllUsage(userId)

    suspend fun incrementGoalSuccessStreak(): Int {
        val updated = cycleStateStore.incrementGoalSuccessStreak()
        runCatching { remoteDataSource.syncGoalSuccessStreak(updated) }
        return updated
    }

    suspend fun resetGoalSuccessStreak() {
        cycleStateStore.resetGoalSuccessStreak()
        runCatching { remoteDataSource.syncGoalSuccessStreak(0) }
    }

    suspend fun updateGoalTime(goalTimeMs: Long) = cycleStateStore.updateGoalTime(goalTimeMs)

    suspend fun pruneOldHourlyUsage(threshold: Long) {
        hourlyUsageDao.deleteUsageBefore(threshold)
    }

    suspend fun startNextCycle(nextCycleStartTime: Long? = null): ScreenTimePlan? {
        val snapshot = planPreferencesDataSource.latest()
        val plan = snapshot.plan ?: return null
        val scheduledStart = nextCycleStartTime ?: CalendarUtils.getStartOfNextDay()

        cycleStateStore.scheduleNextCycle(scheduledStart)
        cycleStateStore.resetCompletionFlags()

        return plan.copy(evaluationStartTime = null)
    }

    companion object {
        private const val TAG = Constants.LOG_TAG_EVALUATION_REPOSITORY
        private const val EMPTY_ID_SENTINEL = "__none__"
    }
}
