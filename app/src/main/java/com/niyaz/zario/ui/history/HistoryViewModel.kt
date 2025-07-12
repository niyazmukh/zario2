package com.niyaz.zario.ui.history

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.niyaz.zario.data.local.dao.EvaluationHistoryDao
import com.niyaz.zario.repository.UserSessionRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
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
    private val userSessionRepository: UserSessionRepository
) : ViewModel() {

    private val _filterPackage = MutableStateFlow<String?>(null)
    val filterPackage: StateFlow<String?> = _filterPackage.asStateFlow()

    @OptIn(kotlinx.coroutines.ExperimentalCoroutinesApi::class)
    val history: Flow<List<com.niyaz.zario.data.local.entities.EvaluationHistoryEntry>> =
        combine(
            _filterPackage,
            userSessionRepository.session
        ) { pkg, session ->
            Pair(pkg, session.user?.email)
        }.flatMapLatest { (pkg, userEmail) ->
            if (userEmail.isNullOrEmpty()) {
                // No user logged in, return empty list
                flowOf(emptyList())
            } else {
                // Filter by user email and optionally by package
                if (pkg.isNullOrEmpty()) {
                    dao.getAll(userEmail)
                } else {
                    dao.getByPackage(userEmail, pkg)
                }
            }
        }

    fun setFilter(packageName: String?) {
        _filterPackage.value = packageName
    }
} 