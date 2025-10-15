package com.niyaz.zario.permissions

import android.Manifest
import android.app.Activity
import android.app.AppOpsManager
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.os.Process
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.niyaz.zario.utils.BatteryOptimizationUtils
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 * Central authority for runtime permission state. Caches the latest snapshot in a
 * hot [StateFlow] so UI surfaces can react without duplicating platform logic.
 */
@Singleton
class PermissionsManager @Inject constructor(
    @ApplicationContext private val context: Context
) {

    companion object {
        private const val TAG = "PermissionsManager"
        const val REQUEST_CODE_POST_NOTIFICATIONS = 1001
        const val REQUEST_CODE_USAGE_STATS = 1002
    }

    data class PermissionsState(
        val hasUsageStatsPermission: Boolean,
        val hasNotificationPermission: Boolean
    )

    private val _state = MutableStateFlow(readCurrentState())
    val state: StateFlow<PermissionsState> = _state.asStateFlow()

    /**
     * Re-computes the system permission snapshot synchronously and updates the
     * backing [StateFlow]. Returns the fresh snapshot for convenience.
     */
    fun refresh(): PermissionsState {
        val snapshot = readCurrentState()
        _state.value = snapshot
        return snapshot
    }

    fun currentState(): PermissionsState = _state.value

    fun hasUsageStatsPermission(forceRefresh: Boolean = false): Boolean {
        return if (forceRefresh) refresh().hasUsageStatsPermission else _state.value.hasUsageStatsPermission
    }

    fun hasNotificationPermission(forceRefresh: Boolean = false): Boolean {
        return if (forceRefresh) refresh().hasNotificationPermission else _state.value.hasNotificationPermission
    }

    private fun readCurrentState(): PermissionsState {
        return PermissionsState(
            hasUsageStatsPermission = resolveUsageStatsPermission(),
            hasNotificationPermission = resolveNotificationPermission()
        )
    }

    private fun resolveUsageStatsPermission(): Boolean {
        val appOps = context.getSystemService(Context.APP_OPS_SERVICE) as AppOpsManager
        val mode = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            appOps.unsafeCheckOpNoThrow(
                AppOpsManager.OPSTR_GET_USAGE_STATS,
                Process.myUid(),
                context.packageName
            )
        } else {
            @Suppress("DEPRECATION")
            appOps.checkOpNoThrow(
                AppOpsManager.OPSTR_GET_USAGE_STATS,
                Process.myUid(),
                context.packageName
            )
        }
        return mode == AppOpsManager.MODE_ALLOWED
    }

    private fun resolveNotificationPermission(): Boolean {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            ContextCompat.checkSelfPermission(
                context,
                Manifest.permission.POST_NOTIFICATIONS
            ) == PackageManager.PERMISSION_GRANTED
        } else {
            true
        }
    }

    // ========================================================================
    // Permission Request Methods (for Activity context)
    // ========================================================================

    /**
     * Requests POST_NOTIFICATIONS runtime permission (Android 13+).
     * 
     * Shows system permission dialog with educational rationale.
     * 
     * @param activity Activity context for permission request
     */
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    fun requestNotificationPermission(activity: Activity) {
        if (hasNotificationPermission(forceRefresh = true)) {
            Log.d(TAG, "POST_NOTIFICATIONS already granted")
            return
        }
        
        // Check if we should show rationale
        if (!ActivityCompat.shouldShowRequestPermissionRationale(
                activity,
                Manifest.permission.POST_NOTIFICATIONS
            )
        ) {
            // First request OR user selected "Don't ask again"
            showNotificationPermissionRationale(activity) {
                ActivityCompat.requestPermissions(
                    activity,
                    arrayOf(Manifest.permission.POST_NOTIFICATIONS),
                    REQUEST_CODE_POST_NOTIFICATIONS
                )
            }
        } else {
            // User denied before but didn't select "Don't ask again"
            showNotificationPermissionRationale(activity) {
                ActivityCompat.requestPermissions(
                    activity,
                    arrayOf(Manifest.permission.POST_NOTIFICATIONS),
                    REQUEST_CODE_POST_NOTIFICATIONS
                )
            }
        }
    }

    /**
     * Shows educational dialog explaining why notification permission is needed.
     * 
     * @param activity Activity context for dialog
     * @param onContinue Callback invoked when user taps "Continue"
     */
    private fun showNotificationPermissionRationale(activity: Activity, onContinue: () -> Unit) {
        AlertDialog.Builder(activity)
            .setTitle("Enable Notifications")
            .setMessage(
                "Zario needs notification permission to alert you when you're approaching " +
                "your screen time goals.\n\n" +
                "Notifications help you stay on track with your digital wellbeing goals " +
                "and are essential for the research study."
            )
            .setPositiveButton("Continue") { _, _ ->
                onContinue()
            }
            .setNegativeButton("Not Now") { dialog, _ ->
                Log.i(TAG, "User declined notification permission request")
                dialog.dismiss()
            }
            .setCancelable(true)
            .show()
    }

    /**
     * Checks all required permissions and shows dialogs for any missing ones.
     * 
     * Call this from MainActivity onCreate or onResume to ensure all
     * critical permissions are granted.
     * 
     * @param activity Activity context
     * @return true if all permissions granted, false if any are missing
     */
    fun checkAndRequestAllPermissions(activity: Activity): Boolean {
        var allGranted = true
        
        // Check POST_NOTIFICATIONS (Android 13+)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (!hasNotificationPermission(forceRefresh = true)) {
                Log.i(TAG, "POST_NOTIFICATIONS not granted, requesting...")
                requestNotificationPermission(activity)
                allGranted = false
            }
        }
        
        // Check battery optimization exemption
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (!BatteryOptimizationUtils.isIgnoringBatteryOptimizations(activity)) {
                Log.i(TAG, "Battery optimization exemption not granted")
                // Don't show dialog here - let app decide when to prompt
                allGranted = false
            }
        }
        
        return allGranted
    }

    /**
     * Shows a comprehensive dialog explaining all permissions needed by Zario.
     * 
     * Use this during onboarding or when user first sets up a screen time plan.
     * 
     * @param activity Activity context
     */
    fun showComprehensivePermissionsDialog(activity: Activity) {
        val permissionsNeeded = mutableListOf<String>()
        
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU && !hasNotificationPermission(forceRefresh = true)) {
            permissionsNeeded.add("📢 Notifications - to alert you about screen time goals")
        }
        
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && !BatteryOptimizationUtils.isIgnoringBatteryOptimizations(context)) {
            permissionsNeeded.add("🔋 Battery Optimization Exemption - for reliable background tracking")
        }
        
        if (permissionsNeeded.isEmpty()) {
            Log.d(TAG, "All permissions already granted")
            return
        }
        
        val message = "Zario needs the following permissions to work reliably:\n\n" +
                permissionsNeeded.joinToString("\n\n") +
                "\n\nThese permissions ensure you receive timely notifications and accurate tracking for the research study."
        
        AlertDialog.Builder(activity)
            .setTitle("Permissions Required")
            .setMessage(message)
            .setPositiveButton("Grant Permissions") { _, _ ->
                // Request permissions one by one
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU && !hasNotificationPermission(forceRefresh = true)) {
                    requestNotificationPermission(activity)
                }
                // Note: Battery and alarm permissions will be requested by their respective utilities
            }
            .setNegativeButton("Later") { dialog, _ ->
                Log.i(TAG, "User postponed permission requests")
                dialog.dismiss()
            }
            .setCancelable(true)
            .show()
    }
}
