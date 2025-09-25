package com.niyaz.zario.ui.intervention

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import androidx.appcompat.widget.PopupMenu
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.niyaz.zario.R
import com.niyaz.zario.Constants
import com.niyaz.zario.data.ScreenTimePlan
import com.niyaz.zario.data.EvaluationState
import com.niyaz.zario.databinding.FragmentInterventionBinding
import com.niyaz.zario.utils.TimeUtils
import com.niyaz.zario.repository.UserSessionRepository
import com.niyaz.zario.repository.EvaluationRepository
import kotlinx.coroutines.launch
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class InterventionFragment : Fragment() {

    private var _binding: FragmentInterventionBinding? = null
    private val binding get() = _binding!!

    private val viewModel: InterventionViewModel by viewModels()
    
    @Inject lateinit var sessionRepository: UserSessionRepository
    @Inject lateinit var evaluationRepository: EvaluationRepository
    
    private val onBackPressedCallback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            // Disable back button - do nothing
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentInterventionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        setupBackButtonHandler()
        setupMenuButton()
        setupSwipeRefresh()
        setupObservers()
        startEvaluationIfNeeded()
    }
    
    override fun onResume() {
        super.onResume()
        // CRITICAL FIX: Synchronize permission state and handle all cases
        refreshPermissionState()

        // Refresh UI progress instantly (avoid 30-sec wait for next worker tick)
        viewModel.refreshProgress()
    }

    /**
     * Checks runtime permissions every time the screen resumes and navigates to
     * the Permissions flow if any required permission is missing.
     */
    private fun refreshPermissionState() {
        val hasUsage = hasUsageStatsPermission()
        val hasNotif = hasNotificationPermission()
        if (!(hasUsage && hasNotif)) {
            // Permissions missing – return user to Permissions screen
            if (isAdded) {
                findNavController().navigate(R.id.action_intervention_to_permissions)
            }
        }
    }

    // Permission helpers (reused in several fragments)
    private fun hasUsageStatsPermission(): Boolean {
        val appOps = requireContext().getSystemService(android.app.AppOpsManager::class.java)
        val mode = appOps.checkOpNoThrow(
            android.app.AppOpsManager.OPSTR_GET_USAGE_STATS,
            android.os.Process.myUid(),
            requireContext().packageName
        )
        return mode == android.app.AppOpsManager.MODE_ALLOWED
    }

    private fun hasNotificationPermission(): Boolean {
        return if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.TIRAMISU) {
            androidx.core.content.ContextCompat.checkSelfPermission(
                requireContext(),
                android.Manifest.permission.POST_NOTIFICATIONS
            ) == android.content.pm.PackageManager.PERMISSION_GRANTED
        } else true
    }
    
    private fun setupBackButtonHandler() {
        requireActivity().onBackPressedDispatcher.addCallback(
            viewLifecycleOwner,
            onBackPressedCallback
        )
    }
    
    private fun setupMenuButton() {
        binding.btnMenu.setOnClickListener { view ->
            val popupMenu = PopupMenu(requireContext(), view)
            popupMenu.menuInflater.inflate(R.menu.intervention_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { menuItem ->
                when (menuItem.itemId) {
                    R.id.menu_logout -> {
                        confirmLogout()
                        true
                    }
                    R.id.menu_history -> {
                        findNavController().navigate(R.id.action_intervention_to_history)
                        true
                    }
                    else -> false
                }
            }
            popupMenu.show()
        }
    }
    
    private fun setupSwipeRefresh() {
        binding.swipeRefreshLayout.apply {
            // Set the color scheme for the refresh indicator
            setColorSchemeResources(
                R.color.evaluation_on_track,
                R.color.evaluation_over_goal,
                R.color.evaluation_exceeded
            )
            
            // Set the refresh listener
            setOnRefreshListener {
                performRefresh()
            }
        }
    }
    
    private fun performRefresh() {
        // Refresh progress immediately
        viewModel.refreshProgress()
        
        // Stop the refresh indicator after a short delay to show the refresh completed
        binding.swipeRefreshLayout.postDelayed({
            binding.swipeRefreshLayout.isRefreshing = false
        }, 500) // 500ms delay to show refresh completion
    }
    
    private fun confirmLogout() {
        MaterialAlertDialogBuilder(requireContext())
            .setTitle(R.string.dialog_logout_title)
            .setMessage(R.string.dialog_logout_message)
            .setNegativeButton(android.R.string.cancel, null)
            .setPositiveButton(R.string.menu_logout) { _, _ ->
                performLogout()
            }
            .show()
    }

    private fun performLogout() {
        // Stop ongoing usage monitoring permanently for this user session
        androidx.work.WorkManager.getInstance(requireContext())
            .cancelUniqueWork(com.niyaz.zario.worker.UsageMonitoringWorker.WORK_NAME)

        sessionRepository.logout()
        findNavController().navigate(R.id.action_intervention_to_login)
    }

    private fun setupObservers() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.CREATED) {
                launch {
                    viewModel.evaluationState.collect { state ->
                        updateUI(state)
                    }
                }
                
                launch {
                    sessionRepository.session.collect { session ->
                        updatePointsDisplay(session.user?.points ?: 100)
                        updateConditionPointsDisplay(session.user?.condition)
                    }
                }
            }
        }
    }

    private fun updatePointsDisplay(points: Int) {
        binding.tvTotalPoints.text = getString(R.string.total_points_format, points)
    }

    private fun updateConditionPointsDisplay(condition: com.niyaz.zario.data.Condition?) {
        val conditionText = when (condition) {
            com.niyaz.zario.data.Condition.CONTROL -> {
                getString(R.string.condition_points_control, Constants.CONTROL_REWARD, Constants.CONTROL_PENALTY)
            }
            com.niyaz.zario.data.Condition.DEPOSIT -> {
                getString(R.string.condition_points_deposit, Constants.DEPOSIT_REWARD, Constants.DEPOSIT_PENALTY)
            }
            com.niyaz.zario.data.Condition.FLEXIBLE -> {
                val user = sessionRepository.session.value.user
                val reward = user?.flexibleReward ?: Constants.FLEXIBLE_REWARD
                val penalty = user?.flexiblePenalty ?: Constants.FLEXIBLE_PENALTY
                getString(R.string.condition_points_flexible, reward, penalty)
            }
            null -> null
        }
        
        if (conditionText != null) {
            binding.tvConditionPoints.text = conditionText
            binding.tvConditionPoints.visibility = View.VISIBLE
        } else {
            binding.tvConditionPoints.visibility = View.GONE
        }
    }

    private fun startEvaluationIfNeeded() {
        // Check current state and start evaluation if needed
        val currentState = viewModel.evaluationState.value
        if (currentState is EvaluationState.NotStarted) {
            viewModel.startEvaluation()
        }
    }

    private fun updateUI(state: EvaluationState) {
    // Update subtitle based on current screen-time plan
    updateSubtitle(state)
        
        when (state) {
            is EvaluationState.NotStarted -> {
                showNotStartedState()
            }
            is EvaluationState.Preparing -> {
                showPreparingState()
            }
            is EvaluationState.Active -> {
                showActiveState(state)
            }
            is EvaluationState.Success -> {
                showSuccessState(state)
            }
            is EvaluationState.GoalExceeded -> {
                showGoalExceededState(state)
            }
            is EvaluationState.Error -> {
                showErrorState(state.message, state.isRetryable)
            }
        }
    }
    
    private fun updateSubtitle(state: EvaluationState) {
        val planLabel = when (state) {
            is EvaluationState.Active -> state.progress.plan.label
            is EvaluationState.Success -> state.finalProgress.plan.label
            is EvaluationState.GoalExceeded -> state.finalProgress.plan.label
            else -> evaluationRepository.getCurrentPlan()?.label
        } ?: ScreenTimePlan.DEFAULT_LABEL

        binding.tvSubtitle.text = getString(R.string.intervention_subtitle, planLabel)
    }

    private fun showNotStartedState() {
        binding.apply {
            progressIndicator.visibility = View.GONE
            tvCurrentUsage.text = getString(R.string.evaluation_not_started)
            tvGoalTime.text = ""
            tvTimeRemaining.text = ""
            progressText.text = getString(R.string.evaluation_preparing)
        }
    }

    private fun showPreparingState() {
        binding.apply {
            progressIndicator.visibility = View.GONE
            tvCurrentUsage.text = getString(R.string.evaluation_preparing)
            tvGoalTime.text = ""
            tvTimeRemaining.text = ""
            progressText.text = getString(R.string.evaluation_preparing)
        }
    }

    private fun showActiveState(state: EvaluationState.Active) {
    val progress = state.progress
    val plan = progress.plan
        
        binding.apply {
            progressIndicator.visibility = View.VISIBLE
            
            // Show usage progress as primary indicator
            val usageProgressCapped = progress.usagePercentage.coerceAtMost(Constants.PROGRESS_MAX_PERCENTAGE)
            progressIndicator.progress = usageProgressCapped.toInt()
            
            // Show remaining time instead of used time
            // Display used time inside circle
            tvCurrentUsage.text = getString(
                R.string.current_usage_format,
                TimeUtils.formatTimeForDisplay(requireContext(), progress.currentUsageMs)
            )
            tvGoalTime.text = getString(
                R.string.goal_time_format,
                TimeUtils.formatTimeForDisplay(requireContext(), plan.goalTimeMs)
            )
            
            // Update time remaining
            tvTimeRemaining.text = getString(
                R.string.time_remaining_format,
                TimeUtils.formatTimeForDisplay(requireContext(), progress.remainingTimeMs)
            )
            
            // Clear progress text - monitoring info not needed per requirements
            progressText.text = ""
            
            // Dynamic color coding based on usage vs goal
            val statusColor = when {
                progress.usagePercentage <= Constants.USAGE_ON_TRACK_THRESHOLD -> {
                    requireContext().getColor(R.color.evaluation_on_track)
                }
                progress.usagePercentage <= Constants.PROGRESS_MAX_PERCENTAGE -> {
                    requireContext().getColor(R.color.evaluation_over_goal)
                }
                else -> {
                    requireContext().getColor(R.color.evaluation_exceeded)
                }
            }
            
            progressIndicator.setIndicatorColor(statusColor)
            
            // Add accessibility content description
            progressIndicator.contentDescription = getString(
                R.string.progress_accessibility_description,
                String.format("%.1f", progress.usagePercentage),
                TimeUtils.formatTimeForDisplay(requireContext(), progress.currentUsageMs),
                TimeUtils.formatTimeForDisplay(requireContext(), plan.goalTimeMs)
            )
        }
    }

    private fun showSuccessState(state: EvaluationState.Success) {
        val progress = state.finalProgress
        val plan = progress.plan
        
        binding.apply {
            progressIndicator.visibility = View.VISIBLE
            
            // Show final usage percentage, capped at maximum for progress bar display
            val displayPercentage = progress.usagePercentage.coerceAtMost(Constants.PROGRESS_MAX_PERCENTAGE)
            progressIndicator.progress = displayPercentage.toInt()
            
            // Show final usage value
            tvCurrentUsage.text = getString(
                R.string.final_usage_format,
                TimeUtils.formatTimeForDisplay(requireContext(), progress.currentUsageMs)
            )
            tvGoalTime.text = getString(
                R.string.goal_time_format,
                TimeUtils.formatTimeForDisplay(requireContext(), plan.goalTimeMs)
            )
            tvTimeRemaining.text = getString(R.string.evaluation_completed)
            
            val wasSuccessful = progress.usagePercentage <= Constants.PROGRESS_MAX_PERCENTAGE
            progressText.text = if (wasSuccessful) {
                getString(R.string.evaluation_success_detailed, String.format("%.1f", progress.usagePercentage))
            } else {
                getString(R.string.evaluation_exceeded_goal_detailed, String.format("%.1f", progress.usagePercentage))
            }
            
            val statusColor = if (wasSuccessful) {
                requireContext().getColor(R.color.evaluation_success)
            } else {
                requireContext().getColor(R.color.evaluation_exceeded)
            }
            
            progressIndicator.setIndicatorColor(statusColor)
            
            // Accessibility for final state
            progressIndicator.contentDescription = getString(
                R.string.final_progress_accessibility_description,
                if (wasSuccessful) "achieved" else "exceeded",
                TimeUtils.formatTimeForDisplay(requireContext(), progress.currentUsageMs),
                TimeUtils.formatTimeForDisplay(requireContext(), plan.goalTimeMs)
            )
        }
    }

    private fun showGoalExceededState(state: EvaluationState.GoalExceeded) {
        val progress = state.finalProgress
        val plan = progress.plan
        
        binding.apply {
            progressIndicator.visibility = View.VISIBLE
            
            // Show final usage percentage, capped at maximum for progress bar display
            val displayPercentage = progress.usagePercentage.coerceAtMost(Constants.PROGRESS_MAX_PERCENTAGE)
            progressIndicator.progress = displayPercentage.toInt()
            
            // Goal exceeded - show exceeded message with final usage
            tvCurrentUsage.text = getString(
                R.string.final_usage_format,
                TimeUtils.formatTimeForDisplay(requireContext(), progress.currentUsageMs)
            )
            tvGoalTime.text = getString(
                R.string.goal_time_format,
                TimeUtils.formatTimeForDisplay(requireContext(), plan.goalTimeMs)
            )
            tvTimeRemaining.text = getString(R.string.evaluation_completed)
            
            // Goal exceeded - show appropriate message
            progressText.text = getString(
                R.string.evaluation_exceeded_goal_detailed, 
                String.format("%.1f", progress.usagePercentage)
            )
            
            val statusColor = requireContext().getColor(R.color.evaluation_exceeded)
            progressIndicator.setIndicatorColor(statusColor)
            
            // Accessibility for final state
            progressIndicator.contentDescription = getString(
                R.string.final_progress_accessibility_description,
                "exceeded",
                TimeUtils.formatTimeForDisplay(requireContext(), progress.currentUsageMs),
                TimeUtils.formatTimeForDisplay(requireContext(), plan.goalTimeMs)
            )
        }
    }



    private fun showErrorState(message: String, isRetryable: Boolean) {
        binding.apply {
            progressIndicator.visibility = View.GONE
            tvCurrentUsage.text = getString(R.string.evaluation_error)
            tvGoalTime.text = ""
            tvTimeRemaining.text = ""
            progressText.text = if (isRetryable) {
                getString(R.string.evaluation_error_retryable, message)
            } else {
                getString(R.string.evaluation_error_fatal, message)
            }
        }
    }
    


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
} 