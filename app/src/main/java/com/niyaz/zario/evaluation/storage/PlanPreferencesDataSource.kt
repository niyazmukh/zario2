package com.niyaz.zario.core.evaluation.storage

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.longPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import com.niyaz.zario.data.ScreenTimePlan
import com.niyaz.zario.data.evaluationDataStore
import com.niyaz.zario.di.ApplicationScope
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn

@Singleton
class PlanPreferencesDataSource @Inject constructor(
    @ApplicationContext context: Context,
    @ApplicationScope applicationScope: CoroutineScope
) {

    private val dataStore: DataStore<Preferences> = context.evaluationDataStore

    private val internalState: StateFlow<PlanPreferencesSnapshot> =
        dataStore.data
            .map { prefs -> prefs.toSnapshot() }
            .stateIn(
                scope = applicationScope,
                started = SharingStarted.Eagerly,
                initialValue = PlanPreferencesSnapshot.EMPTY
            )

    val snapshots: StateFlow<PlanPreferencesSnapshot> = internalState

    suspend fun latest(): PlanPreferencesSnapshot = snapshots.first()

    suspend fun savePlan(plan: ScreenTimePlan) {
        dataStore.edit { prefs ->
            prefs[Keys.GOAL_TIME_MS] = plan.goalTimeMs
            prefs[Keys.DAILY_AVERAGE_MS] = plan.dailyAverageMs
            prefs[Keys.PLAN_LABEL] = plan.label
            prefs[Keys.PLAN_CREATED_AT] = plan.planCreatedAt
            plan.evaluationStartTime?.let { start ->
                prefs[Keys.EVALUATION_START_TIME] = start
            } ?: prefs.remove(Keys.EVALUATION_START_TIME)

            prefs[Keys.USAGE_THRESHOLD_REACHED] = 0
            prefs.remove(Keys.NEXT_CYCLE_START_TIME)
            prefs[Keys.EVALUATION_COMPLETED] = false
            prefs.remove(Keys.EVALUATION_COMPLETION_TIME)
            prefs[Keys.FEEDBACK_VIEWED] = true
            prefs[Keys.GOAL_SUCCESS_STREAK] = 0
        }
    }

    suspend fun clear() {
        dataStore.edit { it.clear() }
    }

    suspend fun markEvaluationStarted(startMillis: Long) {
        dataStore.edit { prefs ->
            prefs[Keys.EVALUATION_START_TIME] = startMillis
            prefs[Keys.USAGE_THRESHOLD_REACHED] = 0
            prefs.remove(Keys.NEXT_CYCLE_START_TIME)
        }
    }

    suspend fun markUsageThresholdReached(thresholdPercent: Int) {
        dataStore.edit { prefs ->
            val current = prefs[Keys.USAGE_THRESHOLD_REACHED] ?: 0
            if (thresholdPercent > current) {
                prefs[Keys.USAGE_THRESHOLD_REACHED] = thresholdPercent
            }
        }
    }

    suspend fun markEvaluationCompleted(completionTime: Long) {
        dataStore.edit { prefs ->
            prefs[Keys.EVALUATION_COMPLETED] = true
            prefs[Keys.EVALUATION_COMPLETION_TIME] = completionTime
            prefs[Keys.FEEDBACK_VIEWED] = false
        }
    }

    suspend fun scheduleNextCycle(nextCycleStartMillis: Long?) {
        dataStore.edit { prefs ->
            prefs.remove(Keys.EVALUATION_START_TIME)
            prefs[Keys.USAGE_THRESHOLD_REACHED] = 0
            if (nextCycleStartMillis != null) {
                prefs[Keys.NEXT_CYCLE_START_TIME] = nextCycleStartMillis
            } else {
                prefs.remove(Keys.NEXT_CYCLE_START_TIME)
            }
        }
    }

    suspend fun incrementGoalSuccessStreak(): Int {
        var updated = 0
        dataStore.edit { prefs ->
            val current = prefs[Keys.GOAL_SUCCESS_STREAK] ?: 0
            updated = current + 1
            prefs[Keys.GOAL_SUCCESS_STREAK] = updated
        }
        return updated
    }

    suspend fun resetGoalSuccessStreak() {
        dataStore.edit { prefs ->
            prefs[Keys.GOAL_SUCCESS_STREAK] = 0
        }
    }

    suspend fun updateGoalTime(goalTimeMs: Long) {
        dataStore.edit { prefs ->
            prefs[Keys.GOAL_TIME_MS] = goalTimeMs
        }
    }

    suspend fun markFeedbackViewed() {
        dataStore.edit { prefs ->
            prefs[Keys.FEEDBACK_VIEWED] = true
        }
    }

    suspend fun resetEvaluationCompletionFlag() {
        dataStore.edit { prefs ->
            prefs[Keys.EVALUATION_COMPLETED] = false
            prefs.remove(Keys.EVALUATION_COMPLETION_TIME)
        }
    }

    suspend fun restoreFromRemote(plan: ScreenTimePlan?, goalSuccessStreak: Int?) {
        dataStore.edit { prefs ->
            if (plan != null) {
                prefs[Keys.GOAL_TIME_MS] = plan.goalTimeMs
                prefs[Keys.DAILY_AVERAGE_MS] = plan.dailyAverageMs
                prefs[Keys.PLAN_LABEL] = plan.label
                prefs[Keys.PLAN_CREATED_AT] = plan.planCreatedAt
                plan.evaluationStartTime?.let { start ->
                    prefs[Keys.EVALUATION_START_TIME] = start
                } ?: prefs.remove(Keys.EVALUATION_START_TIME)
            } else {
                prefs.remove(Keys.GOAL_TIME_MS)
                prefs.remove(Keys.DAILY_AVERAGE_MS)
                prefs.remove(Keys.PLAN_LABEL)
                prefs.remove(Keys.PLAN_CREATED_AT)
                prefs.remove(Keys.EVALUATION_START_TIME)
            }

            prefs[Keys.USAGE_THRESHOLD_REACHED] = 0
            prefs.remove(Keys.NEXT_CYCLE_START_TIME)
            prefs[Keys.EVALUATION_COMPLETED] = false
            prefs.remove(Keys.EVALUATION_COMPLETION_TIME)
            prefs[Keys.FEEDBACK_VIEWED] = true

            goalSuccessStreak?.let { prefs[Keys.GOAL_SUCCESS_STREAK] = it }
        }
    }

    private fun Preferences.toSnapshot(): PlanPreferencesSnapshot {
        val goal = this[Keys.GOAL_TIME_MS]
        val plan = if (goal != null) {
            val avg = this[Keys.DAILY_AVERAGE_MS] ?: 0L
            val label = this[Keys.PLAN_LABEL] ?: ScreenTimePlan.DEFAULT_LABEL
            val createdAt = this[Keys.PLAN_CREATED_AT] ?: System.currentTimeMillis()
            val start = this[Keys.EVALUATION_START_TIME]
            ScreenTimePlan(
                goalTimeMs = goal,
                dailyAverageMs = avg,
                label = label,
                planCreatedAt = createdAt,
                evaluationStartTime = start
            )
        } else {
            null
        }

        return PlanPreferencesSnapshot(
            plan = plan,
            usageThresholdReached = this[Keys.USAGE_THRESHOLD_REACHED] ?: 0,
            nextCycleStartTime = this[Keys.NEXT_CYCLE_START_TIME],
            evaluationCompleted = this[Keys.EVALUATION_COMPLETED] ?: false,
            evaluationCompletionTime = this[Keys.EVALUATION_COMPLETION_TIME],
            feedbackViewed = this[Keys.FEEDBACK_VIEWED] ?: true,
            goalSuccessStreak = this[Keys.GOAL_SUCCESS_STREAK] ?: 0
        )
    }

    private object Keys {
        val GOAL_TIME_MS = longPreferencesKey("plan_goal_time_ms")
        val DAILY_AVERAGE_MS = longPreferencesKey("plan_daily_average_ms")
        val PLAN_LABEL = stringPreferencesKey("plan_label")
        val PLAN_CREATED_AT = longPreferencesKey("plan_created_at")
        val EVALUATION_START_TIME = longPreferencesKey("evaluation_start_time")
        val NEXT_CYCLE_START_TIME = longPreferencesKey("next_cycle_start_time")
        val USAGE_THRESHOLD_REACHED = intPreferencesKey("usage_threshold_reached")
        val EVALUATION_COMPLETED = booleanPreferencesKey("evaluation_completed")
        val EVALUATION_COMPLETION_TIME = longPreferencesKey("evaluation_completion_time")
        val FEEDBACK_VIEWED = booleanPreferencesKey("feedback_viewed")
        val GOAL_SUCCESS_STREAK = intPreferencesKey("goal_success_streak")
    }
}

data class PlanPreferencesSnapshot(
    val plan: ScreenTimePlan?,
    val usageThresholdReached: Int,
    val nextCycleStartTime: Long?,
    val evaluationCompleted: Boolean,
    val evaluationCompletionTime: Long?,
    val feedbackViewed: Boolean,
    val goalSuccessStreak: Int
) {
    companion object {
        val EMPTY = PlanPreferencesSnapshot(
            plan = null,
            usageThresholdReached = 0,
            nextCycleStartTime = null,
            evaluationCompleted = false,
            evaluationCompletionTime = null,
            feedbackViewed = true,
            goalSuccessStreak = 0
        )
    }
}
