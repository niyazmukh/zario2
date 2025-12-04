package com.niyaz.zario.ui.splash

import android.os.Bundle
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.niyaz.zario.R
import com.niyaz.zario.core.evaluation.EvaluationRepository
import com.niyaz.zario.repository.UserSessionRepository
import com.niyaz.zario.permissions.PermissionsManager
import com.niyaz.zario.utils.BatteryOptimizationUtils
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

/**
 * Entry fragment that decides initial navigation based on:
 * 1. Authentication state
 * 2. Required permissions
 * 3. Target selection & active evaluation
 */
@AndroidEntryPoint
class SplashFragment : Fragment() {

    @Inject lateinit var sessionRepository: UserSessionRepository
    @Inject lateinit var evaluationRepository: EvaluationRepository
    @Inject lateinit var permissionsManager: PermissionsManager

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Minimal, invisible layout – could be a ProgressBar if desired
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        lifecycleScope.launch {
            decideNavigation()
        }
    }

    private suspend fun decideNavigation() = withContext(Dispatchers.Default) {
        val session = sessionRepository.awaitSession()
        if (!session.isLoggedIn) {
            navigateSafely(R.id.action_splash_to_login)
            return@withContext
        }

        // Check for unviewed completed evaluations first
        if (evaluationRepository.hasUnviewedCompletedEvaluation()) {
            navigateSafely(R.id.action_splash_to_feedback)
            return@withContext
        }

        // Check if FLEXIBLE user needs to set stakes
        val currentUser = session.user
        if (currentUser?.condition == com.niyaz.zario.data.Condition.FLEXIBLE &&
            currentUser.hasSetFlexibleStakes.not()) {
            navigateSafely(R.id.action_splash_to_flexstakes)
            return@withContext
        }

        if (!hasAllRequiredPermissions()) {
            navigateSafely(R.id.action_splash_to_permissions)
            return@withContext
        }

        if (!evaluationRepository.hasPlanConfigured()) {
            if (!session.hasCompletedIntro) {
                navigateSafely(R.id.action_splash_to_intro)
            } else {
                navigateSafely(R.id.action_splash_to_target)
            }
            return@withContext
        }

        // Target selected – regardless of evaluation state, proceed to Intervention screen.
        // The user can replace the target manually from within the app.
        navigateSafely(R.id.action_splash_to_intervention)
    }

    private fun hasAllRequiredPermissions(): Boolean {
        val state = permissionsManager.refresh()
        
        // Check battery optimization (Android 6.0+)
        val hasBatteryOptimization = requireContext().let { context ->
            BatteryOptimizationUtils.isIgnoringBatteryOptimizations(context)
        }
        
        return state.hasUsageStatsPermission && 
               state.hasNotificationPermission &&
               hasBatteryOptimization
    }

    private fun navigateSafely(actionId: Int) {
        if (!isAdded) return

        if (Looper.myLooper() == Looper.getMainLooper()) {
            // Already on main thread – navigate directly
            findNavController().navigate(actionId)
        } else {
            // Switch to main thread to comply with NavController requirements
            view?.post {
                if (isAdded) {
                    findNavController().navigate(actionId)
                }
            }
        }
    }
} 
