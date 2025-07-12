package com.niyaz.zario.ui.permissions

import android.Manifest
import android.app.AppOpsManager
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.niyaz.zario.Constants
import com.niyaz.zario.R
import com.niyaz.zario.databinding.FragmentPermissionsBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class PermissionsFragment : Fragment() {

    private var _binding: FragmentPermissionsBinding? = null
    private val binding get() = _binding!!

    private val notificationPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { isGranted ->
        Log.d(TAG, "Notification permission result: $isGranted")
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
            val currentPermission = ContextCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.POST_NOTIFICATIONS
            )
            Log.d(TAG, "Current notification permission status: $currentPermission")
            
            when {
                currentPermission == PackageManager.PERMISSION_GRANTED -> {
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
            updateNotificationPermissionUI(true)
        }
    }

    private fun requestUsageStatsPermission() {
        Log.d(TAG, "requestUsageStatsPermission called")
        
        if (hasUsageStatsPermission()) {
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

    private fun hasUsageStatsPermission(): Boolean {
        val appOps = requireContext().getSystemService(Context.APP_OPS_SERVICE) as AppOpsManager
        val mode = appOps.checkOpNoThrow(
            AppOpsManager.OPSTR_GET_USAGE_STATS,
            android.os.Process.myUid(),
            requireContext().packageName
        )
        val hasPermission = mode == AppOpsManager.MODE_ALLOWED
        Log.d(TAG, "Usage stats permission check: $hasPermission (mode: $mode)")
        return hasPermission
    }

    private fun hasNotificationPermission(): Boolean {
        val hasPermission = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            ContextCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.POST_NOTIFICATIONS
            ) == PackageManager.PERMISSION_GRANTED
        } else {
            true // Notifications are enabled by default on Android 12 and below
        }
        Log.d(TAG, "Notification permission check: $hasPermission")
        return hasPermission
    }

    private fun updatePermissionStates() {
        Log.d(TAG, "Updating permission states")
        updateNotificationPermissionUI(hasNotificationPermission())
        updateUsageStatsPermissionUI(hasUsageStatsPermission())
        updateContinueButtonState()
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

    private fun updateContinueButtonState() {
        val notificationPermission = hasNotificationPermission()
        val usagePermission = hasUsageStatsPermission()
        val allPermissionsGranted = notificationPermission && usagePermission
        
        Log.d(TAG, "Continue button state: notification=$notificationPermission, usage=$usagePermission, all=$allPermissionsGranted")
        
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