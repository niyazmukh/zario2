package com.niyaz.zario.ui.intervention

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import java.util.Locale
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.widget.PopupMenu
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.niyaz.zario.Constants
import com.niyaz.zario.R
import com.niyaz.zario.data.EvaluationProgress
import com.niyaz.zario.data.EvaluationState
import com.niyaz.zario.data.ScreenTimePlan
import com.niyaz.zario.databinding.FragmentInterventionBinding
import com.niyaz.zario.permissions.PermissionsManager
import com.niyaz.zario.core.evaluation.EvaluationRepository
import com.niyaz.zario.repository.UserSessionRepository
import com.niyaz.zario.utils.TimeUtils
import com.niyaz.zario.utils.navigateSafely
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class InterventionFragment : Fragment() {

    private var _binding: FragmentInterventionBinding? = null
    private val binding get() = _binding!!

    private val viewModel: InterventionViewModel by viewModels()
    
    @Inject lateinit var sessionRepository: UserSessionRepository
    @Inject lateinit var evaluationRepository: EvaluationRepository
    @Inject lateinit var permissionsManager: PermissionsManager
    
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
        
    binding.root.isFocusableInTouchMode = true
    binding.root.requestFocus()

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
        val state = permissionsManager.refresh()
        if (!(state.hasUsageStatsPermission && state.hasNotificationPermission)) {
            // Permissions missing – return user to Permissions screen
            if (isAdded) {
                findNavController().navigateSafely(R.id.action_intervention_to_permissions)
            }
        }
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
                        findNavController().navigateSafely(R.id.action_intervention_to_history)
                        true
                    }
                    R.id.menu_profile -> {
                        findNavController().navigateSafely(R.id.action_intervention_to_profile)
                        true
                    }
                    R.id.menu_about -> {
                        findNavController().navigateSafely(R.id.action_intervention_to_about)
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
        viewLifecycleOwner.lifecycleScope.launch {
            // Stop ongoing usage monitoring permanently for this user session
            androidx.work.WorkManager.getInstance(requireContext())
                .cancelUniqueWork(com.niyaz.zario.worker.UsageMonitoringWorker.WORK_NAME)

            sessionRepository.logout()
            findNavController().navigateSafely(R.id.action_intervention_to_login)
        }
    }

    private fun setupObservers() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                launch {
                    viewModel.evaluationState.collect { state ->
                        updateUI(state)
                    }
                }
                
                launch {
                    sessionRepository.session.collect { session ->
                        updatePointsDisplay(session.user?.points ?: 100)
                    }
                }
            }
        }
    }

    private fun updatePointsDisplay(points: Int) {
        binding.tvTotalPoints.text = getString(R.string.total_points_format, points)
    }

    private fun startEvaluationIfNeeded() {
        // Check current state and start evaluation if needed
        val currentState = viewModel.evaluationState.value
        if (currentState is EvaluationState.NotStarted) {
            viewModel.startEvaluation()
        }
    }

    private fun updateUI(state: EvaluationState) {
        
        when (state) {
            is EvaluationState.NotStarted -> {
                showNotStartedState()
            }
            is EvaluationState.Preparing -> {
                showPreparingState()
            }
            is EvaluationState.Active -> {
                showMonitoringState(state.progress)
            }
            is EvaluationState.Success -> {
                showMonitoringState(state.finalProgress)
            }
            is EvaluationState.GoalExceeded -> {
                showMonitoringState(state.finalProgress)
            }
            is EvaluationState.Error -> {
                showErrorState(state.message, state.isRetryable)
            }
            else -> {
                // No-op for future states – keep existing UI untouched
            }
        }
    }
    
    // Subtitle is static in XML and intentionally not updated at runtime to keep UI simple.

    private fun showNotStartedState() {
        binding.apply {
            progressIndicator.visibility = View.GONE
            tvCurrentUsage.text = getString(R.string.evaluation_not_started)
            tvGoalTime.text = getString(R.string.empty_placeholder)
            tvTimeRemaining.text = getString(R.string.empty_placeholder)
            progressText.text = getString(R.string.evaluation_preparing)
        }
    }

    private fun showPreparingState() {
        binding.apply {
            progressIndicator.visibility = View.GONE
            tvCurrentUsage.text = getString(R.string.evaluation_preparing)
            tvGoalTime.text = getString(R.string.empty_placeholder)
            tvTimeRemaining.text = getString(R.string.empty_placeholder)
            progressText.text = getString(R.string.evaluation_preparing)
        }
    }

    private fun showMonitoringState(progress: EvaluationProgress) {
        val plan = progress.plan

        binding.apply {
            progressIndicator.visibility = View.VISIBLE

            val usageProgressCapped = progress.usagePercentage.coerceAtMost(Constants.PROGRESS_MAX_PERCENTAGE)
            progressIndicator.progress = usageProgressCapped.toInt()

            tvCurrentUsage.text = getString(
                R.string.current_usage_format,
                TimeUtils.formatTimeForDisplay(requireContext(), progress.currentUsageMs)
            )
            tvGoalTime.text = getString(
                R.string.goal_time_format,
                TimeUtils.formatTimeForDisplay(requireContext(), plan.goalTimeMs)
            )

            tvTimeRemaining.text = getString(
                R.string.time_remaining_format,
                TimeUtils.formatTimeForDisplay(requireContext(), progress.remainingTimeMs)
            )

            progressText.text = getString(R.string.empty_placeholder)

            val statusColor = when {
                progress.usagePercentage <= Constants.USAGE_ON_TRACK_THRESHOLD -> {
                    ContextCompat.getColor(requireContext(), R.color.evaluation_on_track)
                }
                progress.usagePercentage <= Constants.PROGRESS_MAX_PERCENTAGE -> {
                    ContextCompat.getColor(requireContext(), R.color.evaluation_over_goal)
                }
                else -> {
                    ContextCompat.getColor(requireContext(), R.color.evaluation_exceeded)
                }
            }

            progressIndicator.setIndicatorColor(statusColor)

            progressIndicator.contentDescription = getString(
                R.string.progress_accessibility_description,
                String.format(Locale.US, "%.1f", progress.usagePercentage),
                TimeUtils.formatTimeForDisplay(requireContext(), progress.currentUsageMs),
                TimeUtils.formatTimeForDisplay(requireContext(), plan.goalTimeMs)
            )
        }
    }



    private fun showErrorState(message: String, isRetryable: Boolean) {
        binding.apply {
            progressIndicator.visibility = View.GONE
            tvCurrentUsage.text = getString(R.string.evaluation_error)
            tvGoalTime.text = getString(R.string.empty_placeholder)
            tvTimeRemaining.text = getString(R.string.empty_placeholder)
            progressText.text = if (isRetryable) {
                getString(R.string.evaluation_error_retryable, message)
            } else {
                getString(R.string.evaluation_error_fatal, message)
            }
        }
    }
    


    override fun onDestroyView() {
        super.onDestroyView()
        
        // Cancel any pending postDelayed callbacks to prevent memory leaks
        binding.swipeRefreshLayout.handler?.removeCallbacksAndMessages(null)
        
        _binding = null
    }
} 