package com.niyaz.zario.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.PowerManager
import android.provider.Settings
import android.util.Log
import androidx.annotation.RequiresApi

/**
 * Utility class for managing battery optimization exemptions and doze mode whitelisting.
 * 
 * Battery optimization restrictions can prevent WorkManager from executing reliably in the
 * background, which is critical for timely screen time notifications in Zario.
 * 
 * This class provides methods to:
 * 1. Check if the app is whitelisted from battery optimizations
 * 2. Request battery optimization exemption from the user
 */
object BatteryOptimizationUtils {
    
    private const val TAG = "BatteryOptimization"
    
    /**
     * Checks if the app is currently ignoring battery optimizations (whitelisted).
     * 
     * When an app is whitelisted:
     * - WorkManager jobs run more reliably in background
     * - App is exempt from Doze mode restrictions
     * - Notifications can be delivered on time
     * 
     * @param context Application context
     * @return true if app is whitelisted, false otherwise (or false on API < 23)
     */
    fun isIgnoringBatteryOptimizations(context: Context): Boolean {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            // Battery optimization API not available before Android 6.0
            return true
        }
        
        return try {
            val powerManager = context.getSystemService(Context.POWER_SERVICE) as PowerManager
            val isIgnoring = powerManager.isIgnoringBatteryOptimizations(context.packageName)
            Log.d(TAG, "Battery optimization status: ${if (isIgnoring) "EXEMPT" else "RESTRICTED"}")
            isIgnoring
        } catch (e: Exception) {
            Log.e(TAG, "Failed to check battery optimization status", e)
            false
        }
    }
    
    /**
     * Requests the user to exempt the app from battery optimizations.
     * Opens the system settings screen where user can grant exemption.
     * 
     * Note: This permission requires declaration in AndroidManifest.xml:
     * <uses-permission android:name="android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS" />
     * 
     * @param activity Activity context needed to start the settings intent
     */
    @RequiresApi(Build.VERSION_CODES.M)
    fun requestBatteryOptimizationExemption(activity: Activity) {
        try {
            val intent = Intent(Settings.ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS).apply {
                data = Uri.parse("package:${activity.packageName}")
            }
            activity.startActivity(intent)
            Log.i(TAG, "Opened battery optimization settings")
        } catch (e: Exception) {
            Log.e(TAG, "Failed to open battery optimization settings", e)
            // Fallback: open general battery optimization list
            try {
                val fallbackIntent = Intent(Settings.ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS)
                activity.startActivity(fallbackIntent)
                Log.i(TAG, "Opened general battery optimization list as fallback")
            } catch (fallbackException: Exception) {
                Log.e(TAG, "Failed to open fallback battery optimization settings", fallbackException)
            }
        }
    }
}
