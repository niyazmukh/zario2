package com.niyaz.zario.ui.history

import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.niyaz.zario.data.local.dao.EvaluationHistoryDao
import com.niyaz.zario.repository.UserSessionRepository
import com.niyaz.zario.utils.UsageStatsUtils
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.launch

@HiltViewModel
class HistoryViewModel @Inject constructor(
    private val dao: EvaluationHistoryDao,
    private val userSessionRepository: UserSessionRepository,
    @ApplicationContext private val appContext: Context
) : ViewModel() {

    private val _filterLabel = MutableStateFlow<String?>(null)
    val filterLabel: StateFlow<String?> = _filterLabel.asStateFlow()

    private val _todayUsageEntries = MutableStateFlow<List<TodayUsageEntry>>(emptyList())
    val todayUsageEntries: StateFlow<List<TodayUsageEntry>> = _todayUsageEntries.asStateFlow()

    @OptIn(kotlinx.coroutines.ExperimentalCoroutinesApi::class)
    val history: Flow<List<com.niyaz.zario.data.local.entities.EvaluationHistoryEntry>> =
        combine(
            _filterLabel,
            userSessionRepository.session
        ) { label, session ->
            Pair(label, session.user?.email)
        }.flatMapLatest { (label, userEmail) ->
            if (userEmail.isNullOrEmpty()) {
                // No user logged in, return empty list
                flowOf(emptyList())
            } else {
                // Filter by user email and optionally by plan label
                if (label.isNullOrEmpty()) {
                    dao.getAll(userEmail)
                } else {
                    dao.getByPlanLabel(userEmail, label)
                }
            }
        }

    fun setFilter(label: String?) {
        _filterLabel.value = label
    }

    fun refreshTodayTotals() {
        viewModelScope.launch(Dispatchers.IO) {
            runCatching {
                UsageStatsUtils.computeTodayTotals(appContext)
            }.onSuccess { totals ->
                val entries = totals
                    .filterValues { it > 0L }
                    .map { (packageName, duration) ->
                        val label = resolveAppLabel(packageName)
                        TodayUsageEntry(
                            packageName = packageName,
                            appLabel = label,
                            durationMs = duration
                        )
                    }
                    .sortedByDescending { it.durationMs }
                Log.d(TAG, "Fetched today's usage totals (packages=${entries.size})")
                _todayUsageEntries.value = entries
            }.onFailure { throwable ->
                Log.e(TAG, "Failed to compute today's usage totals", throwable)
                _todayUsageEntries.value = emptyList()
            }
        }
    }

    init {
        refreshTodayTotals()
    }

    private companion object {
        const val TAG = "HistoryViewModel"
    }

    private fun resolveAppLabel(packageName: String): String {
        val packageManager = appContext.packageManager
        return runCatching {
            val applicationInfo = packageManager.getApplicationInfo(packageName, 0)
            packageManager.getApplicationLabel(applicationInfo).toString()
        }.getOrElse {
            packageName
        }
    }

    data class TodayUsageEntry(
        val packageName: String,
        val appLabel: String,
        val durationMs: Long
    )
} 