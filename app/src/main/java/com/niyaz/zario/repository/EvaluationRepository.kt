package com.niyaz.zario.repository

import android.content.Context
import android.util.Log
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.longPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import com.niyaz.zario.Constants
import com.niyaz.zario.data.ScreenTimePlan
import com.niyaz.zario.data.evaluationDataStore
import com.niyaz.zario.data.local.dao.EvaluationHistoryDao
import com.niyaz.zario.data.local.entities.EvaluationHistoryEntry
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

@Singleton
class EvaluationRepository @Inject constructor(
    @ApplicationContext private val context: Context,
    private val historyDao: EvaluationHistoryDao,
    private val userSessionRepository: UserSessionRepository
) {

    private val dataStore: DataStore<Preferences> = context.evaluationDataStore

    private val _currentPlan = MutableStateFlow<ScreenTimePlan?>(null)
    val currentPlan: StateFlow<ScreenTimePlan?> = _currentPlan.asStateFlow()

    init {
        // Stream DataStore updates into in-memory cache
        CoroutineScope(Dispatchers.IO).launch {
            dataStore.data
                .map { it.toPlanOrNull() }
                .collect { _currentPlan.value = it }
        }
    }

    fun savePlan(plan: ScreenTimePlan) {
        runBlocking {
            dataStore.edit { prefs ->
                prefs[PrefKeys.GOAL_TIME_MS] = plan.goalTimeMs
                prefs[PrefKeys.DAILY_AVERAGE_MS] = plan.dailyAverageMs
                prefs[PrefKeys.PLAN_LABEL] = plan.label
                prefs[PrefKeys.PLAN_CREATED_AT] = plan.planCreatedAt
                plan.evaluationStartTime?.let { prefs[PrefKeys.EVALUATION_START_TIME] = it }
                    ?: prefs.remove(PrefKeys.EVALUATION_START_TIME)
                prefs[PrefKeys.NOTIFIED_80] = false
                prefs[PrefKeys.EVALUATION_COMPLETED] = false
                prefs.remove(PrefKeys.EVALUATION_COMPLETION_TIME)
                prefs[PrefKeys.FEEDBACK_VIEWED] = true
            }
        }
    }

    fun loadPlan(): ScreenTimePlan? {
        return runBlocking { dataStore.data.first().toPlanOrNull() }
    }

    fun startEvaluation(): ScreenTimePlan? {
        val plan = loadPlan()
        return if (plan != null && plan.evaluationStartTime == null) {
            val updated = plan.copy(
                evaluationStartTime = com.niyaz.zario.utils.CalendarUtils.getStartOfCurrentDay()
            )
            savePlan(updated)
            updated
        } else plan
    }

    fun clearPlan() {
        runBlocking { dataStore.edit { it.clear() } }
    }

    fun hasPlanConfigured(): Boolean {
        val cached = _currentPlan.value
        return if (cached != null) true else runBlocking { dataStore.data.first().toPlanOrNull() != null }
    }

    fun hasActiveEvaluation(): Boolean {
        val plan = _currentPlan.value ?: runBlocking { dataStore.data.first().toPlanOrNull() } ?: return false
        val start = plan.evaluationStartTime ?: return false
        return com.niyaz.zario.utils.CalendarUtils.isWithinCurrentDay(start) && 
               System.currentTimeMillis() < com.niyaz.zario.utils.CalendarUtils.getEndOfCurrentDay()
    }

    fun isEvaluationExpired(): Boolean {
        val plan = _currentPlan.value ?: runBlocking { dataStore.data.first().toPlanOrNull() } ?: return false
        val start = plan.evaluationStartTime ?: return false
        return !com.niyaz.zario.utils.CalendarUtils.isWithinCurrentDay(start) || 
               System.currentTimeMillis() >= com.niyaz.zario.utils.CalendarUtils.getEndOfCurrentDay()
    }

    fun getEvaluationTimeRemaining(): Long {
        val plan = loadPlan()
        return if (plan?.evaluationStartTime != null && com.niyaz.zario.utils.CalendarUtils.isWithinCurrentDay(plan.evaluationStartTime)) {
            com.niyaz.zario.utils.CalendarUtils.getTimeRemainingInCurrentDay()
        } else 0L
    }

    fun getCurrentPlan(): ScreenTimePlan? {
        val cached = _currentPlan.value
        return cached ?: runBlocking { dataStore.data.first().toPlanOrNull() }
    }

    // ------------------------------------------------------------------
    // 80-percent notification helpers
    // ------------------------------------------------------------------
    fun hasSent80PercentNotification(): Boolean {
        return runBlocking {
            dataStore.data.first()[PrefKeys.NOTIFIED_80] ?: false
        }
    }

    fun mark80PercentNotificationSent() {
        runBlocking {
            dataStore.edit { it[PrefKeys.NOTIFIED_80] = true }
        }
    }

    /**
     * Resets the 80% notification flag for a new evaluation cycle.
     * Called when starting a fresh evaluation cycle for the same target.
     */
    fun reset80PercentNotification() {
        runBlocking {
            dataStore.edit { it[PrefKeys.NOTIFIED_80] = false }
        }
    }

    // ------------------------------------------------------------------
    // Evaluation completion state helpers
    // ------------------------------------------------------------------
    
    /**
     * Checks if the current evaluation cycle has been marked as completed.
     * This prevents race conditions between worker completion and ViewModel refresh.
     */
    fun isEvaluationCompleted(): Boolean {
        return runBlocking {
            dataStore.data.first()[PrefKeys.EVALUATION_COMPLETED] ?: false
        }
    }

    /**
     * Marks the current evaluation cycle as completed with timestamp.
     * Called by the worker when evaluation period ends.
     */
    fun markEvaluationCompleted() {
        runBlocking {
            dataStore.edit { prefs ->
                prefs[PrefKeys.EVALUATION_COMPLETED] = true
                prefs[PrefKeys.EVALUATION_COMPLETION_TIME] = System.currentTimeMillis()
                prefs[PrefKeys.FEEDBACK_VIEWED] = false // Mark as unviewed
            }
        }
    }

    /**
     * Gets the completion timestamp for the current evaluation cycle.
     * Returns null if evaluation is not completed.
     */
    fun getEvaluationCompletionTime(): Long? {
        return runBlocking {
            dataStore.data.first()[PrefKeys.EVALUATION_COMPLETION_TIME]
        }
    }

    /**
     * Checks if the current evaluation should be considered completed based on
     * calendar day boundaries and completion state. This is the authoritative check.
     */
    fun shouldShowCompletionState(): Boolean {
        val plan = getCurrentPlan() ?: return false
        val start = plan.evaluationStartTime ?: return false
        
        val now = System.currentTimeMillis()
        
        // Check both calendar day completion and explicit completion state
        val dayExpired = !com.niyaz.zario.utils.CalendarUtils.isWithinCurrentDay(start) || 
                        now >= com.niyaz.zario.utils.CalendarUtils.getEndOfCurrentDay()
        val markedCompleted = isEvaluationCompleted()
        
        return dayExpired || markedCompleted
    }

    /**
     * Checks if there's a completed evaluation that hasn't been viewed in the feedback screen.
     * Used by SplashFragment to determine if feedback should be shown.
     */
    fun hasUnviewedCompletedEvaluation(): Boolean {
        return runBlocking {
            val prefs = dataStore.data.first()
            val isCompleted = prefs[PrefKeys.EVALUATION_COMPLETED] ?: false
            val isViewed = prefs[PrefKeys.FEEDBACK_VIEWED] ?: true // Default to viewed
            isCompleted && !isViewed
        }
    }

    /**
     * Marks the feedback as viewed. Called when user visits the feedback screen.
     */
    fun markFeedbackViewed() {
        runBlocking {
            dataStore.edit { prefs ->
                prefs[PrefKeys.FEEDBACK_VIEWED] = true
            }
        }
    }

    // ------------------------------------------------------------------
    // History persistence helpers
    // ------------------------------------------------------------------
    suspend fun recordCycleResult(entry: EvaluationHistoryEntry) {
        historyDao.insert(entry)
    }

    /** Starts a fresh evaluation cycle for the current target (indefinite cycles). */
    fun startNextCycle(): ScreenTimePlan? {
        val plan = getCurrentPlan() ?: return null
        val updated = plan.copy(
            evaluationStartTime = com.niyaz.zario.utils.CalendarUtils.getStartOfCurrentDay()
        )

        runBlocking {
            dataStore.edit { prefs ->
                prefs[PrefKeys.EVALUATION_START_TIME] = updated.evaluationStartTime!!
                prefs[PrefKeys.NOTIFIED_80] = false
            }
        }

        return updated
    }

    // ------------------------------------------------------------------
    // Preferences ↔ Domain mapping helpers
    // ------------------------------------------------------------------
    private fun Preferences.toPlanOrNull(): ScreenTimePlan? {
        val goal = this[PrefKeys.GOAL_TIME_MS] ?: return null
        val avg = this[PrefKeys.DAILY_AVERAGE_MS] ?: 0L
    val label = this[PrefKeys.PLAN_LABEL] ?: ScreenTimePlan.DEFAULT_LABEL
    val createdAt = this[PrefKeys.PLAN_CREATED_AT] ?: System.currentTimeMillis()
        val start = this[PrefKeys.EVALUATION_START_TIME]
        return ScreenTimePlan(
            goalTimeMs = goal,
            dailyAverageMs = avg,
            label = label,
            planCreatedAt = createdAt,
            evaluationStartTime = start
        )
    }

    private object PrefKeys {
        val GOAL_TIME_MS = longPreferencesKey("plan_goal_time_ms")
        val DAILY_AVERAGE_MS = longPreferencesKey("plan_daily_average_ms")
    val PLAN_LABEL = stringPreferencesKey("plan_label")
        val PLAN_CREATED_AT = longPreferencesKey("plan_created_at")
        val EVALUATION_START_TIME = longPreferencesKey("evaluation_start_time")
    // Removed baseline; now using calendar-day aggregation only
        val NOTIFIED_80 = booleanPreferencesKey("notified_80")
        val EVALUATION_COMPLETED = booleanPreferencesKey("evaluation_completed")
        val EVALUATION_COMPLETION_TIME = longPreferencesKey("evaluation_completion_time")
        val FEEDBACK_VIEWED = booleanPreferencesKey("feedback_viewed")
    }

    companion object {
        private const val TAG = Constants.LOG_TAG_EVALUATION_REPOSITORY
    }
} 