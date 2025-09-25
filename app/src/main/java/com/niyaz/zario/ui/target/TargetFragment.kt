package com.niyaz.zario.ui.target

import android.app.AppOpsManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.work.WorkManager
import com.niyaz.zario.Constants
import com.niyaz.zario.R
import com.niyaz.zario.data.ScreenTimePlan
import com.niyaz.zario.databinding.FragmentTargetBinding
import com.niyaz.zario.repository.EvaluationRepository
import com.niyaz.zario.utils.TimeUtils
import com.niyaz.zario.utils.UsageStatsUtils
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import kotlin.math.max
import kotlin.math.roundToInt
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@AndroidEntryPoint
class TargetFragment : Fragment() {

    private var _binding: FragmentTargetBinding? = null
    private val binding get() = _binding!!

    @Inject lateinit var evaluationRepository: EvaluationRepository

    private var todayUsageMs: Long = 0L
    private var trailingAverageMs: Long = 0L
    private var baselineUsageMs: Long = Constants.MIN_USAGE_THRESHOLD_MS
    private var recommendedGoalMs: Long = 0L

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
        setupClickListeners()
        loadUsageData()
    }

    override fun onResume() {
        super.onResume()
        refreshPermissionState()
    }

    private fun setupClickListeners() {
        binding.buttonRetry.setOnClickListener {
            loadUsageData()
        }

        binding.buttonGrantPermission.setOnClickListener {
            requestUsageStatsPermission()
        }

        binding.btnConfirmTarget.setOnClickListener {
            confirmPlan()
        }
    }

    private fun refreshPermissionState() {
        if (!hasUsageStatsPermission()) {
            showPermissionRequired()
        } else if (binding.progressBar.visibility != View.VISIBLE && todayUsageMs == 0L) {
            loadUsageData()
        }
    }

    private fun loadUsageData() {
        if (!hasUsageStatsPermission()) {
            showPermissionRequired()
            return
        }

        showLoading()

        viewLifecycleOwner.lifecycleScope.launch {
            val usageSummary = withContext(Dispatchers.IO) {
                UsageStatsUtils.getGlobalUsageSummary(requireContext(), Constants.USAGE_ANALYSIS_DAYS)
            }

            todayUsageMs = usageSummary.todayUsageMs
            trailingAverageMs = usageSummary.trailingAverageMs

            val hasHistoricalUsage = usageSummary.validDayCount > 0 && trailingAverageMs > 0L
            val hasTodayUsage = todayUsageMs > 0L

            baselineUsageMs = when {
                hasHistoricalUsage -> trailingAverageMs
                hasTodayUsage -> todayUsageMs
                else -> Constants.MIN_USAGE_THRESHOLD_MS
            }

            recommendedGoalMs = calculateRecommendedGoal(baselineUsageMs)

            if (!hasTodayUsage && !hasHistoricalUsage) {
                Log.w(Constants.LOG_TAG_TARGET_FRAGMENT, "No usage detected yet; using minimum baseline for goal setup")
            }

            val averageForDisplay = if (hasHistoricalUsage) trailingAverageMs else baselineUsageMs

            showPlanSummary(
                averageUsageMs = averageForDisplay,
                todayUsageMs = todayUsageMs,
                isEstimated = !hasHistoricalUsage && !hasTodayUsage
            )
        }
    }

    private fun calculateRecommendedGoal(dailyUsageMs: Long): Long {
        val baseline = max(dailyUsageMs, Constants.MIN_USAGE_THRESHOLD_MS)
        return (baseline * Constants.GOAL_REDUCTION_RATIO).toLong().coerceAtLeast(Constants.MIN_USAGE_THRESHOLD_MS)
    }

    private fun showLoading() {
        binding.apply {
            progressBar.visibility = View.VISIBLE
            textViewLoading.visibility = View.VISIBLE
            recyclerViewApps.visibility = View.GONE
            tvSectionTitle.visibility = View.GONE
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
        isEstimated: Boolean
    ) {
        binding.apply {
            progressBar.visibility = View.GONE
            textViewLoading.visibility = View.GONE
            recyclerViewApps.visibility = View.GONE
            tvSectionTitle.visibility = View.GONE
            textViewError.visibility = View.GONE
            buttonRetry.visibility = View.GONE
            buttonGrantPermission.visibility = View.GONE

            cardGoalSummary.visibility = View.VISIBLE

            val averageFormatted = TimeUtils.formatTimeForGoal(requireContext(), averageUsageMs)
            val goalFormatted = TimeUtils.formatTimeForGoal(requireContext(), recommendedGoalMs)
            val reductionPct = ((1 - Constants.GOAL_REDUCTION_RATIO) * 100).roundToInt()

            tvCurrentUsage.text = getString(R.string.goal_summary_usage, averageFormatted)
            tvGoalUsage.text = getString(R.string.goal_summary_target, goalFormatted)
            if (todayUsageMs > 0L) {
                tvTodayUsage.visibility = View.VISIBLE
                val todayFormatted = TimeUtils.formatTimeForGoal(requireContext(), todayUsageMs)
                tvTodayUsage.text = getString(R.string.goal_summary_today_usage, todayFormatted)
            } else {
                tvTodayUsage.visibility = View.GONE
            }
            tvReductionInfo.text = if (isEstimated) {
                getString(R.string.goal_summary_estimated_usage)
            } else {
                getString(R.string.goal_reduction_percentage, reductionPct)
            }

            updateConfirmButton(enabled = true)
        }
    }

    private fun showPermissionRequired() {
        binding.apply {
            progressBar.visibility = View.GONE
            textViewLoading.visibility = View.GONE
            recyclerViewApps.visibility = View.GONE
            tvSectionTitle.visibility = View.GONE
            cardGoalSummary.visibility = View.GONE
            textViewError.visibility = View.VISIBLE
            textViewError.text = getString(R.string.usage_stats_permission_required_analyze)
            buttonRetry.visibility = View.GONE
            buttonGrantPermission.visibility = View.VISIBLE
            updateConfirmButton(enabled = false)
        }
    }

    private fun showError(message: String) {
        binding.apply {
            progressBar.visibility = View.GONE
            textViewLoading.visibility = View.GONE
            recyclerViewApps.visibility = View.GONE
            tvSectionTitle.visibility = View.GONE
            cardGoalSummary.visibility = View.GONE
            textViewError.visibility = View.VISIBLE
            textViewError.text = message
            buttonRetry.visibility = View.VISIBLE
            buttonGrantPermission.visibility = View.GONE
            updateConfirmButton(enabled = false)
        }
    }

    private fun confirmPlan() {
        try {
            val plan = ScreenTimePlan(
                goalTimeMs = recommendedGoalMs,
                dailyAverageMs = baselineUsageMs,
                label = ScreenTimePlan.DEFAULT_LABEL,
                planCreatedAt = System.currentTimeMillis(),
                evaluationStartTime = null
            )

            WorkManager.getInstance(requireContext())
                .cancelUniqueWork(com.niyaz.zario.worker.UsageMonitoringWorker.WORK_NAME)

            evaluationRepository.savePlan(plan)

            findNavController().navigate(R.id.action_target_to_intervention)
        } catch (e: Exception) {
            Log.e(Constants.LOG_TAG_TARGET_FRAGMENT, "Failed to save screen-time plan", e)
            showError(getString(R.string.error_setting_plan))
        }
    }

    private fun updateConfirmButton(enabled: Boolean) {
        binding.btnConfirmTarget.apply {
            isEnabled = enabled
            text = if (enabled) {
                getString(R.string.confirm_goal_selection)
            } else {
                getString(R.string.confirm_goal_selection_disabled)
            }
        }
    }

    private fun hasUsageStatsPermission(): Boolean {
        val appOpsManager = requireContext().getSystemService(Context.APP_OPS_SERVICE) as AppOpsManager
        val mode = appOpsManager.checkOpNoThrow(
            AppOpsManager.OPSTR_GET_USAGE_STATS,
            android.os.Process.myUid(),
            requireContext().packageName
        )
        return mode == AppOpsManager.MODE_ALLOWED
    }

    private fun requestUsageStatsPermission() {
        startActivity(Intent(Settings.ACTION_USAGE_ACCESS_SETTINGS))
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}