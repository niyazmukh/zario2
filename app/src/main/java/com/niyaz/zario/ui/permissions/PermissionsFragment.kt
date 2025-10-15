package com.niyaz.zario.ui.permissions

import android.Manifest
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.niyaz.zario.Constants
import com.niyaz.zario.R
import com.niyaz.zario.databinding.FragmentPermissionsBinding
import com.niyaz.zario.permissions.PermissionsManager
import com.niyaz.zario.utils.BatteryOptimizationUtils
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class PermissionsFragment : Fragment() {

    private var _binding: FragmentPermissionsBinding? = null
    private val binding get() = _binding!!
    @Inject lateinit var permissionsManager: PermissionsManager

    private val notificationPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { isGranted ->
        Log.d(TAG, "Notification permission result: $isGranted")
        permissionsManager.refresh()
        updateNotificationPermissionUI(isGranted)
        updateContinueButtonState()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPermissionsBinding.inflate(inflater, container, false)
        Log.d(TAG, "PermissionsFragment onCreateView")
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "PermissionsFragment onViewCreated")
        
        setupClickListeners()
        updatePermissionStates()
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "PermissionsFragment onResume")
        updatePermissionStates()
    }

    private fun setupClickListeners() {
        Log.d(TAG, "Setting up click listeners")
        
        binding.cardNotificationPermission.setOnClickListener {
            Log.d(TAG, "Notification permission card clicked")
            requestNotificationPermission()
        }

        binding.cardUsagePermission.setOnClickListener {
            Log.d(TAG, "Usage permission card clicked") 
            requestUsageStatsPermission()
        }

        binding.cardBatteryPermission.setOnClickListener {
            Log.d(TAG, "Battery optimization card clicked")
            requestBatteryOptimization()
        }

        binding.btnContinue.setOnClickListener {
            Log.d(TAG, "Continue button clicked")
            // Navigate to target selection screen
            findNavController().navigate(R.id.action_permissions_to_target)
        }
    }

    private fun requestNotificationPermission() {
        Log.d(TAG, "requestNotificationPermission called")
        Log.d(TAG, "Android version: ${Build.VERSION.SDK_INT}, TIRAMISU: ${Build.VERSION_CODES.TIRAMISU}")
        
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            val currentPermission = permissionsManager.hasNotificationPermission(forceRefresh = true)
            Log.d(TAG, "Current notification permission status: $currentPermission")
            
            when {
                currentPermission -> {
                    Log.d(TAG, "Notification permission already granted")
                    updateNotificationPermissionUI(true)
                }
                else -> {
                    Log.d(TAG, "Launching notification permission request")
                    try {
                        notificationPermissionLauncher.launch(Manifest.permission.POST_NOTIFICATIONS)
                    } catch (e: Exception) {
                        Log.e(TAG, "Error launching notification permission request", e)
                    }
                }
            }
        } else {
            Log.d(TAG, "Android version < 13, notifications enabled by default")
            // For Android 12 and below, notifications are enabled by default
            permissionsManager.refresh()
            updateNotificationPermissionUI(true)
        }
    }

    private fun requestUsageStatsPermission() {
        Log.d(TAG, "requestUsageStatsPermission called")
        
        if (permissionsManager.hasUsageStatsPermission(forceRefresh = true)) {
            Log.d(TAG, "Usage stats permission already granted")
            updateUsageStatsPermissionUI(true)
        } else {
            try {
                Log.d(TAG, "Opening usage access settings")
                val intent = Intent(Settings.ACTION_USAGE_ACCESS_SETTINGS)
                startActivity(intent)
            } catch (e: Exception) {
                Log.e(TAG, "Error opening usage access settings", e)
            }
        }
    }

    private fun requestBatteryOptimization() {
        Log.d(TAG, "requestBatteryOptimization called")
        
        activity?.let { activity ->
            if (BatteryOptimizationUtils.isIgnoringBatteryOptimizations(activity)) {
                Log.d(TAG, "Battery optimization already disabled")
                updateBatteryOptimizationUI(true)
            } else {
                Log.d(TAG, "Opening battery optimization settings directly")
                BatteryOptimizationUtils.requestBatteryOptimizationExemption(activity)
            }
        }
    }

    private fun updatePermissionStates() {
        Log.d(TAG, "Updating permission states")
        val state = permissionsManager.refresh()
        updateNotificationPermissionUI(state.hasNotificationPermission)
        updateUsageStatsPermissionUI(state.hasUsageStatsPermission)
        
        // Check battery optimization
        activity?.let { activity ->
            val batteryOptimizationDisabled = BatteryOptimizationUtils.isIgnoringBatteryOptimizations(activity)
            updateBatteryOptimizationUI(batteryOptimizationDisabled)
        }
        
        updateContinueButtonState(state)
    }

    private fun updateNotificationPermissionUI(granted: Boolean) {
        Log.d(TAG, "Updating notification permission UI: granted=$granted")
        binding.tvNotificationStatus.text = if (granted) {
            getString(R.string.permission_granted)
        } else {
            getString(R.string.grant_permission)
        }
        binding.cardNotificationPermission.isEnabled = !granted
    }

    private fun updateUsageStatsPermissionUI(granted: Boolean) {
        Log.d(TAG, "Updating usage stats permission UI: granted=$granted")
        binding.tvUsageStatus.text = if (granted) {
            getString(R.string.permission_granted)
        } else {
            getString(R.string.grant_permission)
        }
        binding.cardUsagePermission.isEnabled = !granted
    }

    private fun updateBatteryOptimizationUI(granted: Boolean) {
        Log.d(TAG, "Updating battery optimization UI: disabled=$granted")
        binding.tvBatteryStatus.text = if (granted) {
            getString(R.string.permission_granted)
        } else {
            getString(R.string.grant_permission)
        }
        binding.cardBatteryPermission.isEnabled = !granted
    }

    private fun updateContinueButtonState(state: PermissionsManager.PermissionsState = permissionsManager.currentState()) {
        val notificationPermission = state.hasNotificationPermission
        val usagePermission = state.hasUsageStatsPermission
        
        // Check battery optimization separately
        val batteryOptimizationDisabled = activity?.let { 
            BatteryOptimizationUtils.isIgnoringBatteryOptimizations(it) 
        } ?: false
        
        val allPermissionsGranted = notificationPermission && 
                                    usagePermission && 
                                    batteryOptimizationDisabled
        
        Log.d(TAG, "Continue button state: notification=$notificationPermission, usage=$usagePermission, battery=$batteryOptimizationDisabled, all=$allPermissionsGranted")
        
        binding.btnContinue.isEnabled = allPermissionsGranted
        binding.btnContinue.text = if (allPermissionsGranted) {
            getString(R.string.continue_to_app)
        } else {
            getString(R.string.continue_to_app_disabled)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "PermissionsFragment onDestroyView")
        _binding = null
    }
    
    companion object {
        private const val TAG = Constants.LOG_TAG_PERMISSIONS
    }
} 