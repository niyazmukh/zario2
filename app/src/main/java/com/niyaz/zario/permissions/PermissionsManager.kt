package com.niyaz.zario.permissions

import android.Manifest
import android.app.AppOpsManager
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import androidx.core.content.ContextCompat
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
        val mode = appOps.checkOpNoThrow(
            AppOpsManager.OPSTR_GET_USAGE_STATS,
            android.os.Process.myUid(),
            context.packageName
        )
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
}
