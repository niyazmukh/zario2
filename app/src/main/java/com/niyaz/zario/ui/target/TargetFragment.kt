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
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.niyaz.zario.Constants
import com.niyaz.zario.databinding.FragmentTargetBinding
import com.niyaz.zario.data.TargetSelectionState
import com.niyaz.zario.ui.target.adapter.AppUsageAdapter
import com.niyaz.zario.R
import com.niyaz.zario.utils.TimeUtils
import com.niyaz.zario.data.TargetApp
import com.niyaz.zario.repository.EvaluationRepository
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import kotlin.math.roundToInt

@AndroidEntryPoint
class TargetFragment : Fragment() {

    private var _binding: FragmentTargetBinding? = null
    private val binding get() = _binding!!

    private val viewModel: TargetViewModel by viewModels()
    private lateinit var appUsageAdapter: AppUsageAdapter
    @Inject lateinit var evaluationRepository: EvaluationRepository
    private var selectedAppInfo: com.niyaz.zario.data.AppUsageInfo? = null

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
        
        // evaluationRepository injected
        
        setupRecyclerView()
        observeViewModel()
        setupClickListeners()
        
        // Initial load
        loadUsageData()
    }

    override fun onResume() {
        super.onResume()
        // CRITICAL FIX: Synchronize permission state and handle all cases
        refreshPermissionState()
    }

    /**
     * Safely checks and handles permission state changes when returning from Settings.
     * Prevents race conditions and handles both granted/denied scenarios.
     */
    private fun refreshPermissionState() {
        val hasPermission = hasUsageStatsPermission()
        
        // Get current ViewModel state to determine appropriate action
        val currentState = viewModel.state.value
        
        when {
            hasPermission -> {
                // Permission granted - reload data if we're in error/permission state
                if (currentState is TargetSelectionState.Error || 
                    binding.buttonGrantPermission.visibility == View.VISIBLE) {
                    
                    Log.d(Constants.LOG_TAG_TARGET_FRAGMENT, "Permission granted, reloading usage data")
                    
                    // Reset UI state and reload
                    selectedAppInfo = null
                    appUsageAdapter.setSelectedApp(null)
                    loadUsageData()
                }
                // If already showing apps, don't reload unnecessarily
            }
            else -> {
                // Permission denied or not available - show appropriate error state
                Log.d(Constants.LOG_TAG_TARGET_FRAGMENT, "Permission not available, showing permission required state")
                showPermissionRequired()
            }
        }
    }

    private fun setupRecyclerView() {
        appUsageAdapter = AppUsageAdapter { appUsageInfo ->
            // Handle app selection and show goal summary
            selectedAppInfo = appUsageInfo
            showGoalSummary(appUsageInfo)
            appUsageAdapter.setSelectedApp(appUsageInfo.packageName)
        }

        binding.recyclerViewApps.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = appUsageAdapter
        }
    }

    private fun observeViewModel() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.state.collect { state ->
                    when (state) {
                        is TargetSelectionState.Loading -> showLoading()
                        is TargetSelectionState.Success -> showApps(state.topApps)
                        is TargetSelectionState.Error -> showError(state.message)
                    }
                }
            }
        }
    }

    private fun setupClickListeners() {
        binding.buttonRetry.setOnClickListener {
            if (hasUsageStatsPermission()) {
                // Reset UI state and reload data
                selectedAppInfo = null
                appUsageAdapter.setSelectedApp(null)
                loadUsageData()
            } else {
                requestUsageStatsPermission()
            }
        }

        binding.buttonGrantPermission.setOnClickListener {
            requestUsageStatsPermission()
        }

        binding.btnConfirmTarget.setOnClickListener {
            selectedAppInfo?.let { appInfo ->
                // Stop current monitoring so the new target starts fresh
                androidx.work.WorkManager.getInstance(requireContext())
                    .cancelUniqueWork(com.niyaz.zario.worker.UsageMonitoringWorker.WORK_NAME)

                // Save target app
                // Clear any existing target only now – we keep previous target alive until a new one is confirmed
                evaluationRepository.clearTargetApp()
                val goalTimeMs = (appInfo.dailyAverageMs * Constants.GOAL_REDUCTION_RATIO).toLong()

                val targetApp = TargetApp(
                    packageName = appInfo.packageName,
                    appName = appInfo.appName,
                    goalTimeMs = goalTimeMs,
                    dailyAverageMs = appInfo.dailyAverageMs,
                    targetSelectedTime = System.currentTimeMillis(),
                    evaluationStartTime = null // Will be set when evaluation actually starts
                )
                evaluationRepository.saveTargetApp(targetApp)
                
                // Navigate to intervention screen ONLY after successful save
                findNavController().navigate(R.id.action_target_to_intervention)
            } ?: run {
                // Show error if no app selected
                showNoAppSelectedError()
            }
        }
    }

    private fun loadUsageData() {
        if (!hasUsageStatsPermission()) {
            showPermissionRequired()
            return
        }

        // Show loading with a small delay for better UX
        viewLifecycleOwner.lifecycleScope.launch {
            delay(Constants.LOADING_DELAY_MS)
            viewModel.fetchUsageData(requireContext())
        }
    }

    private fun showLoading() {
        binding.apply {
            progressBar.visibility = View.VISIBLE
            textViewLoading.visibility = View.VISIBLE
            recyclerViewApps.visibility = View.GONE
            textViewError.visibility = View.GONE
            buttonRetry.visibility = View.GONE
            buttonGrantPermission.visibility = View.GONE
            cardGoalSummary.visibility = View.GONE
            updateConfirmButtonState(false)
        }
    }

    private fun showApps(apps: List<com.niyaz.zario.data.AppUsageInfo>) {
        binding.apply {
            progressBar.visibility = View.GONE
            textViewLoading.visibility = View.GONE
            recyclerViewApps.visibility = View.VISIBLE
            textViewError.visibility = View.GONE
            buttonRetry.visibility = View.GONE
            buttonGrantPermission.visibility = View.GONE
            
            // Reset confirmation button and summary
            cardGoalSummary.visibility = View.GONE
            updateConfirmButtonState(false)
        }
        
        appUsageAdapter.submitList(apps)
        // Reset selection when new apps are loaded
        appUsageAdapter.setSelectedApp(null)
    }

    private fun showGoalSummary(appUsageInfo: com.niyaz.zario.data.AppUsageInfo) {
        binding.apply {
            // Show the goal summary card
            cardGoalSummary.visibility = View.VISIBLE
            
            // Format daily average usage
            val dailyAverageFormatted = TimeUtils.formatTimeForGoal(requireContext(), appUsageInfo.dailyAverageMs)
            tvCurrentUsage.text = getString(R.string.goal_summary_usage, dailyAverageFormatted)
            
            // Calculate 20% reduction goal
            val goalTimeMs = (appUsageInfo.dailyAverageMs * Constants.GOAL_REDUCTION_RATIO).toLong()
            val goalTimeFormatted = TimeUtils.formatTimeForGoal(requireContext(), goalTimeMs)
            tvGoalUsage.text = getString(R.string.goal_summary_target, goalTimeFormatted)

            // Dynamic reduction percentage based on Constants.GOAL_REDUCTION_RATIO
            val reductionPct = ((1 - Constants.GOAL_REDUCTION_RATIO) * 100).roundToInt()
            tvReductionInfo.text = getString(R.string.goal_reduction_percentage, reductionPct)
            
            // Enable confirmation button
            updateConfirmButtonState(true)
        }
    }

    private fun showError(message: String) {
        binding.apply {
            progressBar.visibility = View.GONE
            textViewLoading.visibility = View.GONE
            recyclerViewApps.visibility = View.GONE
            textViewError.visibility = View.VISIBLE
            textViewError.text = message
            buttonRetry.visibility = View.VISIBLE
            buttonGrantPermission.visibility = View.GONE
            cardGoalSummary.visibility = View.GONE
            updateConfirmButtonState(false)
        }
    }

    private fun showPermissionRequired() {
        binding.apply {
            progressBar.visibility = View.GONE
            textViewLoading.visibility = View.GONE
            recyclerViewApps.visibility = View.GONE
            textViewError.visibility = View.VISIBLE
            textViewError.text = getString(R.string.usage_stats_permission_required_analyze)
            buttonRetry.visibility = View.GONE
            buttonGrantPermission.visibility = View.VISIBLE
            cardGoalSummary.visibility = View.GONE
            updateConfirmButtonState(false)
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
        val intent = Intent(Settings.ACTION_USAGE_ACCESS_SETTINGS)
        startActivity(intent)
    }

    private fun updateConfirmButtonState(hasSelection: Boolean) {
        binding.btnConfirmTarget.apply {
            isEnabled = hasSelection
            text = if (hasSelection) {
                getString(R.string.confirm_target_selection)
            } else {
                getString(R.string.confirm_target_selection_disabled)
            }
        }
    }

    private fun showNoAppSelectedError() {
        binding.apply {
            progressBar.visibility = View.GONE
            textViewLoading.visibility = View.GONE
            recyclerViewApps.visibility = View.GONE
            textViewError.visibility = View.VISIBLE
            textViewError.text = getString(R.string.error_no_app_selected)
            buttonRetry.visibility = View.VISIBLE
            buttonGrantPermission.visibility = View.GONE
            cardGoalSummary.visibility = View.GONE
            updateConfirmButtonState(false)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
} 