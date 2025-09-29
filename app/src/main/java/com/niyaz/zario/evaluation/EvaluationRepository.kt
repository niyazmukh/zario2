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
import com.niyaz.zario.utils.CalendarUtils
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn

@Singleton
class EvaluationRepository @Inject constructor(
    private val planPreferencesDataSource: PlanPreferencesDataSource,
    private val cycleStateStore: CycleStateStore,
    private val historyDao: EvaluationHistoryDao,
    private val hourlyUsageDao: HourlyUsageDao,
    private val remoteDataSource: EvaluationRemoteDataSource,
    @ApplicationScope private val applicationScope: CoroutineScope
) {

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

    suspend fun hasActiveEvaluation(): Boolean {
        val plan = planPreferencesDataSource.latest().plan ?: return false
        val start = plan.evaluationStartTime ?: return false
        return CalendarUtils.isWithinCurrentDay(start) &&
            System.currentTimeMillis() < CalendarUtils.getEndOfCurrentDay()
    }

    suspend fun isEvaluationExpired(): Boolean {
        val plan = planPreferencesDataSource.latest().plan ?: return false
        val start = plan.evaluationStartTime ?: return false
        return !CalendarUtils.isWithinCurrentDay(start) ||
            System.currentTimeMillis() >= CalendarUtils.getEndOfCurrentDay()
    }

    suspend fun getCurrentPlan(): ScreenTimePlan? = planPreferencesDataSource.latest().plan

    suspend fun getHighestUsageNotification(): Int =
        cycleStateStore.latest().usageThresholdReached

    suspend fun markUsageNotification(thresholdPercent: Int) {
        cycleStateStore.markUsageThresholdReached(thresholdPercent)
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
        cycleStateStore.markFeedbackViewed()
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
    }
}
