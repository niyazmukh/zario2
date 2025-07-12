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
import com.niyaz.zario.data.TargetApp
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

    private val _currentTargetApp = MutableStateFlow<TargetApp?>(null)
    val currentTargetApp: StateFlow<TargetApp?> = _currentTargetApp.asStateFlow()

    init {
        // Stream DataStore updates into in-memory cache
        CoroutineScope(Dispatchers.IO).launch {
            dataStore.data
                .map { it.toTargetAppOrNull() }
                .collect { _currentTargetApp.value = it }
        }
    }

    fun saveTargetApp(targetApp: TargetApp) {
        runBlocking {
            dataStore.edit { prefs ->
                prefs[PrefKeys.PACKAGE_NAME] = targetApp.packageName
                prefs[PrefKeys.APP_NAME] = targetApp.appName
                prefs[PrefKeys.GOAL_TIME_MS] = targetApp.goalTimeMs
                prefs[PrefKeys.DAILY_AVERAGE_MS] = targetApp.dailyAverageMs
                prefs[PrefKeys.TARGET_SELECTED_TIME] = targetApp.targetSelectedTime
                targetApp.evaluationStartTime?.let { prefs[PrefKeys.EVALUATION_START_TIME] = it } ?: prefs.remove(PrefKeys.EVALUATION_START_TIME)
                prefs[PrefKeys.BASELINE_USAGE_MS] = targetApp.baselineUsageMs
                // Reset 80% flag when a new goal is picked
                prefs[PrefKeys.NOTIFIED_80] = false
                // Only reset completion state when starting a completely new target
                // For cycle transitions, preserve feedback state until viewed
                if (getCurrentTargetApp()?.packageName != targetApp.packageName) {
                    // New target - reset completion state
                    prefs[PrefKeys.EVALUATION_COMPLETED] = false
                    prefs.remove(PrefKeys.EVALUATION_COMPLETION_TIME)
                    prefs[PrefKeys.FEEDBACK_VIEWED] = true // Default to viewed for new targets
                }
                // For same target (cycle transition), keep existing completion/feedback state
            }
        }
    }

    fun loadTargetApp(): TargetApp? {
        return runBlocking { dataStore.data.first().toTargetAppOrNull() }
    }

    fun startEvaluation(): TargetApp? {
        val targetApp = loadTargetApp()
        return if (targetApp != null && targetApp.evaluationStartTime == null) {
            val baseline = com.niyaz.zario.utils.UsageStatsUtils.getCumulativeForegroundTime(context, targetApp.packageName)
            val updated = targetApp.copy(
                evaluationStartTime = System.currentTimeMillis(),
                baselineUsageMs = baseline
            )
            saveTargetApp(updated)
            updated
        } else targetApp
    }

    fun clearTargetApp() {
        runBlocking { dataStore.edit { it.clear() } }
    }

    fun hasTargetSelected(): Boolean {
        val cached = _currentTargetApp.value
        return if (cached != null) true else runBlocking { dataStore.data.first().toTargetAppOrNull() != null }
    }

    fun hasActiveEvaluation(): Boolean {
        val target = _currentTargetApp.value ?: runBlocking { dataStore.data.first().toTargetAppOrNull() } ?: return false
        val start = target.evaluationStartTime ?: return false
        val elapsed = System.currentTimeMillis() - start
        return elapsed < Constants.EVALUATION_DURATION_MS
    }

    fun isEvaluationExpired(): Boolean {
        val target = _currentTargetApp.value ?: runBlocking { dataStore.data.first().toTargetAppOrNull() } ?: return false
        val start = target.evaluationStartTime ?: return false
        val elapsed = System.currentTimeMillis() - start
        return elapsed >= Constants.EVALUATION_DURATION_MS
    }

    fun getEvaluationTimeRemaining(): Long {
        val target = loadTargetApp()
        return if (target?.evaluationStartTime != null) {
            val elapsed = System.currentTimeMillis() - target.evaluationStartTime
            maxOf(0L, Constants.EVALUATION_DURATION_MS - elapsed)
        } else 0L
    }

    fun getCurrentTargetApp(): TargetApp? {
        val cached = _currentTargetApp.value
        return cached ?: runBlocking { dataStore.data.first().toTargetAppOrNull() }
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
        Log.d(TAG, "80% notification flag reset for new evaluation cycle")
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
        Log.d(TAG, "Evaluation marked as completed")
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
     * both time elapsed and completion state. This is the authoritative check.
     */
    fun shouldShowCompletionState(): Boolean {
        val target = getCurrentTargetApp() ?: return false
        val start = target.evaluationStartTime ?: return false
        
        val now = System.currentTimeMillis()
        val elapsed = now - start
        
        // Check both time-based completion and explicit completion state
        val timeExpired = elapsed >= Constants.EVALUATION_DURATION_MS
        val markedCompleted = isEvaluationCompleted()
        
        return timeExpired || markedCompleted
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
        Log.d(TAG, "Feedback marked as viewed")
    }

    // ------------------------------------------------------------------
    // History persistence helpers
    // ------------------------------------------------------------------
    suspend fun recordCycleResult(entry: EvaluationHistoryEntry) {
        historyDao.insert(entry)
    }

    /** Starts a fresh evaluation cycle for the current target (indefinite cycles). */
    fun startNextCycle(): TargetApp? {
        val target = getCurrentTargetApp() ?: return null
        val baseline = com.niyaz.zario.utils.UsageStatsUtils.getCumulativeForegroundTime(context, target.packageName)
        val updated = target.copy(
            evaluationStartTime = System.currentTimeMillis(),
            baselineUsageMs = baseline
        )
        
        // For cycle transitions, manually update only the fields we need to change
        // while preserving completion/feedback state until user views feedback
        runBlocking {
            dataStore.edit { prefs ->
                prefs[PrefKeys.EVALUATION_START_TIME] = updated.evaluationStartTime!!
                prefs[PrefKeys.BASELINE_USAGE_MS] = updated.baselineUsageMs
                // Reset 80% notification for new cycle but preserve feedback state
                prefs[PrefKeys.NOTIFIED_80] = false
                // Keep EVALUATION_COMPLETED and FEEDBACK_VIEWED as-is until user views feedback
            }
        }
        
        Log.d(TAG, "Next cycle started, preserving feedback state until viewed")
        
        return updated
    }

    // ------------------------------------------------------------------
    // Preferences ↔ Domain mapping helpers
    // ------------------------------------------------------------------
    private fun Preferences.toTargetAppOrNull(): TargetApp? {
        val pkg = this[PrefKeys.PACKAGE_NAME] ?: return null
        val appName = this[PrefKeys.APP_NAME] ?: ""
        val goal = this[PrefKeys.GOAL_TIME_MS] ?: 0L
        val avg = this[PrefKeys.DAILY_AVERAGE_MS] ?: 0L
        val selectedTime = this[PrefKeys.TARGET_SELECTED_TIME] ?: System.currentTimeMillis()
        val start = this[PrefKeys.EVALUATION_START_TIME]
        val baseline = this[PrefKeys.BASELINE_USAGE_MS] ?: 0L
        return TargetApp(
            packageName = pkg,
            appName = appName,
            goalTimeMs = goal,
            dailyAverageMs = avg,
            targetSelectedTime = selectedTime,
            evaluationStartTime = start,
            baselineUsageMs = baseline
        )
    }

    private object PrefKeys {
        val PACKAGE_NAME = stringPreferencesKey("target_package_name")
        val APP_NAME = stringPreferencesKey("target_app_name")
        val GOAL_TIME_MS = longPreferencesKey("target_goal_time_ms")
        val DAILY_AVERAGE_MS = longPreferencesKey("target_daily_average_ms")
        val TARGET_SELECTED_TIME = longPreferencesKey("target_selected_time")
        val EVALUATION_START_TIME = longPreferencesKey("evaluation_start_time")
        val BASELINE_USAGE_MS = longPreferencesKey("baseline_usage_ms")
        val NOTIFIED_80 = booleanPreferencesKey("notified_80")
        val EVALUATION_COMPLETED = booleanPreferencesKey("evaluation_completed")
        val EVALUATION_COMPLETION_TIME = longPreferencesKey("evaluation_completion_time")
        val FEEDBACK_VIEWED = booleanPreferencesKey("feedback_viewed")
    }

    companion object {
        private const val TAG = Constants.LOG_TAG_EVALUATION_REPOSITORY
    }
} 