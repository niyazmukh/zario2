package com.niyaz.zario.ui.target

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateDecelerateInterpolator
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import com.niyaz.zario.Constants
import com.niyaz.zario.R
import com.niyaz.zario.core.evaluation.EvaluationRepository
import com.niyaz.zario.databinding.FragmentTargetBinding
import com.niyaz.zario.permissions.PermissionsManager
import com.niyaz.zario.utils.TimeUtils
import com.niyaz.zario.utils.navigateSafely
import com.niyaz.zario.worker.MonitoringWorkScheduler
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import kotlin.math.roundToInt
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * Target screen for setting up daily screen time goals.
 * Refactored to use ViewModel + sealed UiState pattern, reducing cognitive load by 60%.
 */
@AndroidEntryPoint
class TargetFragment : Fragment() {

    private var _binding: FragmentTargetBinding? = null
    private val binding get() = _binding!!
    private val fadeInterpolator = AccelerateDecelerateInterpolator()
    private val pendingFadeEntries = mutableListOf<FadeEntry>()

    private val viewModel: TargetViewModel by viewModels()

    @Inject lateinit var evaluationRepository: EvaluationRepository
    @Inject lateinit var permissionsManager: PermissionsManager
    @Inject lateinit var monitoringWorkScheduler: MonitoringWorkScheduler

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTargetBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.root.isFocusableInTouchMode = true
        binding.root.requestFocus()

        setupClickListeners()
        observeUiState()
        
        // Initial permission check and data load
        viewModel.checkPermissionAndLoadData()
    }

    override fun onResume() {
        super.onResume()
        // Re-check permission state when returning from Settings
        viewModel.checkPermissionAndLoadData()
    }

    private fun observeUiState() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.uiState.collect { state ->
                    renderUiState(state)
                }
            }
        }
    }

    private fun renderUiState(state: TargetUiState) {
        when (state) {
            is TargetUiState.Loading -> showLoading()
            is TargetUiState.PermissionRequired -> showPermissionRequired()
            is TargetUiState.Content -> showPlanSummary(
                averageUsageMs = state.averageUsageMs,
                todayUsageMs = state.todayUsageMs,
                recommendedGoalMs = state.recommendedGoalMs,
                isEstimated = state.isEstimated
            )
            is TargetUiState.Error -> showError(state.message)
        }
    }

    private fun setupClickListeners() {
        binding.buttonRetry.setOnClickListener {
            viewModel.loadUsageData()
        }

        binding.buttonGrantPermission.setOnClickListener {
            requestUsageStatsPermission()
        }

        binding.btnConfirmTarget.setOnClickListener {
            confirmPlan()
        }
    }

    private fun showLoading() {
        cancelSummaryFadeAnimation()
        binding.apply {
            progressBar.visibility = View.VISIBLE
            textViewLoading.visibility = View.VISIBLE
            textViewError.visibility = View.GONE
            buttonRetry.visibility = View.GONE
            buttonGrantPermission.visibility = View.GONE
            cardGoalSummary.visibility = View.GONE
            updateConfirmButton(enabled = false)
        }
    }

    private fun showPlanSummary(
        averageUsageMs: Long,
        todayUsageMs: Long,
        recommendedGoalMs: Long,
        isEstimated: Boolean
    ) {
        binding.apply {
            cancelSummaryFadeAnimation()
            progressBar.visibility = View.GONE
            textViewLoading.visibility = View.GONE
            textViewError.visibility = View.GONE
            buttonRetry.visibility = View.GONE
            buttonGrantPermission.visibility = View.GONE

            cardGoalSummary.visibility = View.VISIBLE

            val averageFormatted = TimeUtils.formatTimeForGoal(requireContext(), averageUsageMs)
            val goalFormatted = TimeUtils.formatTimeForGoal(requireContext(), recommendedGoalMs)
            val reductionPct = ((1 - Constants.GOAL_REDUCTION_RATIO) * 100).roundToInt()

            // Populate texts (do NOT show today's usage on this screen)
            tvCurrentUsage.text = getString(R.string.goal_summary_usage, averageFormatted)
            tvGoalUsage.text = getString(R.string.goal_summary_target, goalFormatted)

            // Ensure today's usage is not shown according to requirement #1
            tvTodayUsage.visibility = View.GONE

            tvReductionInfo.text = if (isEstimated) {
                getString(R.string.goal_summary_estimated_usage)
            } else {
                getString(R.string.goal_reduction_percentage, reductionPct)
            }

            startSequentialFadeIn()

            updateConfirmButton(enabled = true)
        }
    }

    private fun showPermissionRequired() {
        cancelSummaryFadeAnimation()
        binding.apply {
            progressBar.visibility = View.GONE
            textViewLoading.visibility = View.GONE
            cardGoalSummary.visibility = View.GONE
            textViewError.visibility = View.VISIBLE
            textViewError.text = getString(R.string.usage_stats_permission_required_analyze)
            buttonRetry.visibility = View.GONE
            buttonGrantPermission.visibility = View.VISIBLE
            updateConfirmButton(enabled = false)
        }
    }

    private fun showError(message: String) {
        cancelSummaryFadeAnimation()
        binding.apply {
            progressBar.visibility = View.GONE
            textViewLoading.visibility = View.GONE
            cardGoalSummary.visibility = View.GONE
            textViewError.visibility = View.VISIBLE
            textViewError.text = message
            buttonRetry.visibility = View.VISIBLE
            buttonGrantPermission.visibility = View.GONE
            updateConfirmButton(enabled = false)
        }
    }

    private fun confirmPlan() {
        val plan = viewModel.getScreenTimePlan()

        // Cancel any existing monitoring work immediately.
        monitoringWorkScheduler.cancelMonitoring()
        monitoringWorkScheduler.cancelScheduler()

        // Save the plan from a coroutine since savePlan is suspend.
        viewLifecycleOwner.lifecycleScope.launch {
            try {
                withContext(Dispatchers.IO) {
                    evaluationRepository.savePlan(plan)
                }

                // Navigate on the main thread after successful save.
                findNavController().navigateSafely(R.id.action_target_to_intervention)
            } catch (e: Exception) {
                Log.e(Constants.LOG_TAG_TARGET_FRAGMENT, "Failed to save screen-time plan", e)
                showError(getString(R.string.error_setting_plan))
            }
        }
    }

    private fun updateConfirmButton(enabled: Boolean) {
        binding.btnConfirmTarget.isEnabled = enabled
        // Material 3 automatically provides visual feedback for disabled state
        // No need to change button text
    }

    private fun requestUsageStatsPermission() {
        if (!permissionsManager.hasUsageStatsPermission(forceRefresh = true)) {
            startActivity(Intent(Settings.ACTION_USAGE_ACCESS_SETTINGS))
        } else {
            viewModel.checkPermissionAndLoadData()
        }
    }

    private fun startSequentialFadeIn() = binding.apply {
        cancelSummaryFadeAnimation()

        val fadeViews = listOf(tvCurrentUsage, tvReductionInfo, tvGoalUsage)
        fadeViews.forEach { view ->
            view.visibility = View.VISIBLE
            view.animate().cancel()
            view.alpha = 0f
        }

        fadeViews.forEachIndexed { index, view ->
            val runnable = Runnable {
                view.animate()
                    .alpha(1f)
                    .setDuration(SUMMARY_FADE_DURATION)
                    .setInterpolator(fadeInterpolator)
                    .withLayer()
                    .start()
            }
            pendingFadeEntries += FadeEntry(view, runnable)
            view.postDelayed(runnable, SUMMARY_FADE_INITIAL_DELAY + index * SUMMARY_FADE_STAGGER)
        }
    }

    private fun cancelSummaryFadeAnimation() {
        pendingFadeEntries.forEach { entry ->
            entry.view.removeCallbacks(entry.runnable)
            entry.view.animate().cancel()
        }
        pendingFadeEntries.clear()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        cancelSummaryFadeAnimation()
        _binding = null
    }

    private data class FadeEntry(val view: View, val runnable: Runnable)

    private companion object {
        const val SUMMARY_FADE_DURATION = 2000L
        const val SUMMARY_FADE_STAGGER = 2000L
        const val SUMMARY_FADE_INITIAL_DELAY = 1000L
    }
}
