package com.niyaz.zario.utils

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.media.AudioAttributes
import android.media.RingtoneManager
import android.os.PowerManager
import android.util.Log
import androidx.core.app.NotificationCompat
import com.niyaz.zario.Constants
import com.niyaz.zario.R
import com.niyaz.zario.data.Condition
import com.niyaz.zario.data.ScreenTimePlan
import com.niyaz.zario.core.evaluation.EvaluationResultProcessor
import com.niyaz.zario.data.local.entities.NotificationCategory
import com.niyaz.zario.monitoring.NotificationInteractionReceiver
import kotlin.math.absoluteValue
import org.json.JSONObject

object NotificationUtils {

    private const val TAG = "NotificationUtils"
    private const val WAKELOCK_TAG = "Minutes::NotificationWakeLock"
    private const val WAKELOCK_TIMEOUT_MS = 10_000L // 10 seconds

    /**
     * Ensures the notification channel is created with enhanced configuration.
     * 
     * Enhanced features:
     * - Sound configured with default notification ringtone
     * - Vibration pattern for tactile feedback
     * - LED light for devices that support it
     * - Badge visibility for launcher icons
     * - Lockscreen visibility set to PUBLIC
     * - Channel importance verification
     */
    private fun ensureChannel(context: Context) {
        val nm = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val channelId = Constants.NOTIFICATION_CHANNEL_ID_EVALUATION_ALERTS
        
        if (nm.getNotificationChannel(channelId) == null) {
            // Configure audio attributes for notification sound
            val audioAttributes = AudioAttributes.Builder()
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .setUsage(AudioAttributes.USAGE_NOTIFICATION)
                .build()
            
            val channel = NotificationChannel(
                channelId,
                context.getString(R.string.notification_channel_name),
                NotificationManager.IMPORTANCE_HIGH
            ).apply {
                description = context.getString(R.string.notification_channel_description)
                
                // Set default notification sound
                setSound(
                    RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION),
                    audioAttributes
                )
                
                // Vibration pattern: wait 0ms, vibrate 250ms, wait 250ms, vibrate 250ms
                vibrationPattern = longArrayOf(0, 250, 250, 250)
                enableVibration(true)
                
                // LED light for devices that support it
                enableLights(true)
                lightColor = Color.BLUE
                
                // Show badge on launcher icon
                setShowBadge(true)
                
                // Show on lockscreen
                lockscreenVisibility = android.app.Notification.VISIBILITY_PUBLIC
            }
            nm.createNotificationChannel(channel)
            Log.i(TAG, "Created notification channel with enhanced configuration")
        }
        
        // Verify channel importance hasn't been downgraded by user
        val existingChannel = nm.getNotificationChannel(channelId)
        if (existingChannel?.importance == NotificationManager.IMPORTANCE_NONE) {
            Log.w(TAG, "⚠️ Notification channel importance downgraded by user - notifications will not show")
        } else if (existingChannel != null && existingChannel.importance < NotificationManager.IMPORTANCE_HIGH) {
            Log.w(TAG, "⚠️ Notification channel importance reduced to ${existingChannel.importance} - may affect visibility")
        }
    }

    /**
     * Acquires a wakelock and executes the given notification action.
     * 
     * Wakelock ensures that:
     * - Device wakes up from light sleep to display notification
     * - Notification isn't lost during device sleep
     * - LED/vibration/sound can trigger properly
     * 
     * Wakelock is automatically released after 10 seconds or when block completes.
     */
    private inline fun <T> withWakeLock(context: Context, block: () -> T): T {
        val powerManager = context.getSystemService(Context.POWER_SERVICE) as PowerManager
        val wakeLock = powerManager.newWakeLock(
            PowerManager.PARTIAL_WAKE_LOCK,
            WAKELOCK_TAG
        )
        
        return try {
            wakeLock.acquire(WAKELOCK_TIMEOUT_MS)
            Log.d(TAG, "Wakelock acquired for notification delivery")
            block()
        } finally {
            if (wakeLock.isHeld) {
                wakeLock.release()
                Log.d(TAG, "Wakelock released")
            }
        }
    }

    /**
     * Sends a usage threshold notification WITH wakelock to ensure delivery.
     * 
     * Use this method when notification must be delivered immediately, even if
     * device is in light sleep or Doze mode.
     */
    fun sendUsageThresholdReached(
        context: Context,
        plan: ScreenTimePlan,
        currentUsageMs: Long,
        thresholdPercent: Int
    ) {
        withWakeLock(context) {
            sendUsageThresholdReachedInternal(context, plan, currentUsageMs, thresholdPercent)
        }
    }

    /**
     * Internal implementation of usage threshold notification.
     * Called within wakelock context.
     */
    private fun sendUsageThresholdReachedInternal(
        context: Context,
        plan: ScreenTimePlan,
        currentUsageMs: Long,
        thresholdPercent: Int
    ) {
        ensureChannel(context)

        val nm = notificationManager(context)
        val metadata = mapOf(
            "planLabel" to plan.label,
            "goalTimeMs" to plan.goalTimeMs,
            "currentUsageMs" to currentUsageMs,
            "thresholdPercent" to thresholdPercent
        )
        val pendingIntent = createNotificationTapPendingIntent(
            context = context,
            category = NotificationCategory.USAGE_THRESHOLD,
            notificationId = Constants.NOTIFICATION_ID_USAGE_THRESHOLD,
            channelId = Constants.NOTIFICATION_CHANNEL_ID_EVALUATION_ALERTS,
            navigateTo = "intervention",
            metadata = metadata
        )

        val usageFormatted = TimeUtils.formatTimeForDisplay(context, currentUsageMs)
        val goalFormatted = TimeUtils.formatTimeForDisplay(context, plan.goalTimeMs)
        val contentText = context.getString(
            R.string.notification_usage_threshold_content,
            plan.label,
            usageFormatted,
            goalFormatted,
            thresholdPercent
        )

        val notification = buildEvaluationNotification(
            context,
            context.getString(R.string.notification_usage_threshold_title, thresholdPercent),
            contentText,
            pendingIntent
        ).build()

        nm.notify(Constants.NOTIFICATION_ID_USAGE_THRESHOLD, notification)
        Log.i(TAG, "Posted usage threshold notification ($thresholdPercent%) with wakelock")
    }

    private fun ensureSyncChannel(context: Context) {
        val nm = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val channelId = Constants.NOTIFICATION_CHANNEL_ID_SYNC_ALERTS
        if (nm.getNotificationChannel(channelId) == null) {
            val channel = NotificationChannel(
                channelId,
                context.getString(R.string.notification_sync_channel_name),
                NotificationManager.IMPORTANCE_DEFAULT
            ).apply {
                description = context.getString(R.string.notification_sync_channel_description)
            }
            nm.createNotificationChannel(channel)
        }
    }

    fun sendRemoteSyncFailure(context: Context) {
        ensureSyncChannel(context)
        val nm = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val notification = NotificationCompat.Builder(context, Constants.NOTIFICATION_CHANNEL_ID_SYNC_ALERTS)
            .setSmallIcon(R.mipmap.ic_launcher)
            .setContentTitle(context.getString(R.string.notification_sync_failure_title))
            .setContentText(context.getString(R.string.notification_sync_failure_content))
            .setStyle(
                NotificationCompat.BigTextStyle().bigText(
                    context.getString(R.string.notification_sync_failure_content)
                )
            )
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setAutoCancel(false)
            .build()
        nm.notify(Constants.NOTIFICATION_ID_SYNC_FAILURE, notification)
    }

    fun clearRemoteSyncFailure(context: Context) {
        val nm = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        nm.cancel(Constants.NOTIFICATION_ID_SYNC_FAILURE)
    }

    /**
     * Posts an evaluation cycle completed notification immediately.
     * 
     * Called right after cycle completion to provide instant feedback to the user.
     * Uses wakelock to ensure delivery even if device is in light sleep.
     * 
     * @param context Application context
     */
    fun sendEvaluationCycleCompletedNow(
        context: Context,
        plan: ScreenTimePlan,
        result: EvaluationResultProcessor.Result
    ) {
        withWakeLock(context) {
            postEvaluationCycleCompletedNowInternal(context, plan, result)
        }
        Log.i(TAG, "Cycle completion notification sent immediately")
    }

    /**
     * Internal implementation of cycle completed notification.
     * Called within wakelock context.
     */
    private fun postEvaluationCycleCompletedNowInternal(
        context: Context,
        plan: ScreenTimePlan,
        result: EvaluationResultProcessor.Result
    ) {
        ensureChannel(context)

        val nm = notificationManager(context)
        val metadata = mapOf(
            "planLabel" to plan.label,
            "goalTimeMs" to plan.goalTimeMs,
            "finalUsageMs" to result.finalUsageMs,
            "pointsDelta" to result.pointsDelta,
            "metGoal" to result.metGoal
        )
        val pendingIntent = createNotificationTapPendingIntent(
            context = context,
            category = NotificationCategory.CYCLE_COMPLETION,
            notificationId = Constants.NOTIFICATION_ID_EVALUATION_COMPLETE,
            channelId = Constants.NOTIFICATION_CHANNEL_ID_EVALUATION_ALERTS,
            navigateTo = "feedback",
            metadata = metadata
        )

        // Build notification content based on available data
        val totalUsageMs = result.finalUsageMs
        val contentText = if (totalUsageMs > 0) {
            val usageFormatted = TimeUtils.formatTimeForDisplay(context, totalUsageMs)
            val goalFormatted = TimeUtils.formatTimeForDisplay(context, plan.goalTimeMs)
            context.getString(
                R.string.notification_cycle_usage_summary,
                usageFormatted,
                goalFormatted
            )
        } else {
            context.getString(R.string.notification_cycle_complete_content)
        }

        val title = resolveCycleCompletionTitle(context, result)

        val notification = buildEvaluationNotification(
            context,
            title,
            contentText,
            pendingIntent
        ).build()

        // Explicitly cancel the previous cycle completion notification so the latest payload
        // always replaces the prior one, even if the system failed to coalesce duplicates.
        nm.cancel(Constants.NOTIFICATION_ID_EVALUATION_COMPLETE)
        nm.notify(Constants.NOTIFICATION_ID_EVALUATION_COMPLETE, notification)
        Log.i(TAG, "Posted evaluation cycle completed notification with wakelock")
    }

    // Removed createMonitoringForegroundInfo - no longer using foreground services to avoid Android 14 restrictions
    private fun notificationManager(context: Context): NotificationManager =
        context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

    private fun createNotificationTapPendingIntent(
        context: Context,
        category: NotificationCategory,
        notificationId: Int,
        channelId: String,
        navigateTo: String?,
        metadata: Map<String, Any?>
    ): PendingIntent? {
        val metadataJson = metadata.toJsonString()
        // Direct intent to MainActivity to avoid notification trampoline restrictions (Android 12+)
        val intent = Intent(context, com.niyaz.zario.MainActivity::class.java).apply {
            flags = android.content.Intent.FLAG_ACTIVITY_NEW_TASK or android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP
            putExtra("navigate_to", navigateTo)
            
            // Extras for logging in MainActivity
            putExtra(NotificationInteractionReceiver.EXTRA_CATEGORY, category.name)
            putExtra(NotificationInteractionReceiver.EXTRA_NOTIFICATION_ID, notificationId)
            putExtra(NotificationInteractionReceiver.EXTRA_CHANNEL_ID, channelId)
            putExtra(NotificationInteractionReceiver.EXTRA_METADATA, metadataJson)
        }
        
        return PendingIntent.getActivity(
            context,
            notificationId,
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )
    }

    private fun buildEvaluationNotification(
        context: Context,
        title: CharSequence,
        content: CharSequence,
        pendingIntent: PendingIntent?
    ): NotificationCompat.Builder {
        return NotificationCompat.Builder(context, Constants.NOTIFICATION_CHANNEL_ID_EVALUATION_ALERTS)
            .setSmallIcon(R.mipmap.ic_launcher)
            .setContentTitle(title)
            .setContentText(content)
            .setStyle(NotificationCompat.BigTextStyle().bigText(content))
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setAutoCancel(true)
            .setContentIntent(pendingIntent)
    }

    private fun resolveCycleCompletionTitle(
        context: Context,
        result: EvaluationResultProcessor.Result
    ): String {
        return when {
            result.condition == Condition.BENCHMARK && result.metGoal ->
                context.getString(R.string.notification_cycle_benchmark_met)
            result.condition == Condition.BENCHMARK && !result.metGoal ->
                context.getString(R.string.notification_cycle_benchmark_missed)
            result.pointsDelta > 0 ->
                context.getString(R.string.notification_cycle_points_earned, result.pointsDelta)
            result.pointsDelta < 0 ->
                context.getString(R.string.notification_cycle_points_lost, result.pointsDelta.absoluteValue)
            else -> context.getString(R.string.notification_cycle_points_neutral)
        }
    }
}

private fun Map<String, Any?>?.toJsonString(): String? {
    if (this == null || this.isEmpty()) return null
    val json = org.json.JSONObject()
    this.forEach { (key, value) -> json.put(key, value) }
    return json.toString()
}
