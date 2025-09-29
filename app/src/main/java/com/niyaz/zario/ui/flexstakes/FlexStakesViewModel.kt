package com.niyaz.zario.ui.flexstakes

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.niyaz.zario.R
import com.niyaz.zario.repository.UserSessionRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

sealed class FlexStakesResult {
    object Idle : FlexStakesResult()
    object Success : FlexStakesResult()
    data class Error(val message: String) : FlexStakesResult()
    object Loading : FlexStakesResult()
}

@HiltViewModel
class FlexStakesViewModel @Inject constructor(
    @ApplicationContext private val context: Context,
    private val sessionRepository: UserSessionRepository
) : ViewModel() {

    private val _result = MutableStateFlow<FlexStakesResult>(FlexStakesResult.Idle)
    val result: StateFlow<FlexStakesResult> = _result.asStateFlow()

    fun setFlexibleStakes(reward: Int, penalty: Int) {
        viewModelScope.launch {
            _result.value = FlexStakesResult.Loading

            try {
                val success = sessionRepository.setFlexibleStakes(reward, penalty)
                if (success) {
                    _result.value = FlexStakesResult.Success
                } else {
                    _result.value = FlexStakesResult.Error(
                        context.getString(R.string.error_only_flexible_users)
                    )
                }
            } catch (e: Exception) {
                _result.value = FlexStakesResult.Error(
                    context.getString(R.string.error_setting_stakes)
                )
            }
        }
    }


} 