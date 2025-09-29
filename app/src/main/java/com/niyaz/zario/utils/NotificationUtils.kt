package com.niyaz.zario.utils

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import androidx.core.app.NotificationCompat
import androidx.core.app.TaskStackBuilder
import androidx.work.ExistingWorkPolicy
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import com.niyaz.zario.Constants
import com.niyaz.zario.MainActivity
import com.niyaz.zario.R
import com.niyaz.zario.data.ScreenTimePlan
import com.niyaz.zario.worker.EvaluationCycleNotificationWorker
import java.util.concurrent.TimeUnit

// Removed ForegroundInfo imports - no longer using foreground services

object NotificationUtils {

    private const val WORK_NAME_CYCLE_COMPLETE_NOTIFICATION = "cycle_complete_notification"

    private fun ensureChannel(context: Context) {
        val nm = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val channelId = Constants.NOTIFICATION_CHANNEL_ID_EVALUATION_ALERTS
        if (nm.getNotificationChannel(channelId) == null) {
            val channel = NotificationChannel(
                channelId,
                context.getString(R.string.notification_channel_name),
                NotificationManager.IMPORTANCE_HIGH
            ).apply {
                description = context.getString(R.string.notification_channel_description)
            }
            nm.createNotificationChannel(channel)
        }
    }

    fun sendUsageThresholdReached(
        context: Context,
        plan: ScreenTimePlan,
        currentUsageMs: Long,
        thresholdPercent: Int
    ) {
        ensureChannel(context)

        val nm = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        // Build deep link to MainActivity (opens last screen via nav component default behaviour)
        val intent = Intent(context, MainActivity::class.java)
        val pendingIntent: PendingIntent? = TaskStackBuilder.create(context).run {
            addNextIntentWithParentStack(intent)
            getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE)
        }

        val usageFormatted = TimeUtils.formatTimeForDisplay(context, currentUsageMs)
        val goalFormatted = TimeUtils.formatTimeForDisplay(context, plan.goalTimeMs)
        val contentText = context.getString(
            R.string.notification_usage_threshold_content,
            plan.label,
            usageFormatted,
            goalFormatted,
            thresholdPercent
        )

        val notification = NotificationCompat.Builder(context, Constants.NOTIFICATION_CHANNEL_ID_EVALUATION_ALERTS)
            .setSmallIcon(R.mipmap.ic_launcher)
            .setContentTitle(context.getString(R.string.notification_usage_threshold_title, thresholdPercent))
            .setContentText(contentText)
            .setStyle(NotificationCompat.BigTextStyle().bigText(contentText))
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setAutoCancel(true)
            .setContentIntent(pendingIntent)
            .build()

        nm.notify(Constants.NOTIFICATION_ID_USAGE_THRESHOLD, notification)
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
     * Sends a high-priority notification when an evaluation cycle finishes.
     * Navigates to the feedback screen to show cycle results.
     */
    fun sendEvaluationCycleCompleted(context: Context, cycleEndTime: Long) {
        val scheduledAt = CalendarUtils.getNextDayAtTime(
            cycleEndTime,
            Constants.EVALUATION_REMINDER_HOUR,
            Constants.EVALUATION_REMINDER_MINUTE
        )
        val delayMs = scheduledAt - System.currentTimeMillis()

        if (delayMs <= 0L) {
            postEvaluationCycleCompletedNow(context)
            return
        }

        val workRequest = OneTimeWorkRequestBuilder<EvaluationCycleNotificationWorker>()
            .setInitialDelay(delayMs, TimeUnit.MILLISECONDS)
            .build()

        WorkManager.getInstance(context)
            .enqueueUniqueWork(
                WORK_NAME_CYCLE_COMPLETE_NOTIFICATION,
                ExistingWorkPolicy.REPLACE,
                workRequest
            )
    }

    internal fun postEvaluationCycleCompletedNow(context: Context) {
        ensureChannel(context)

        val nm = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        // Deep link to feedback screen via MainActivity
        val intent = Intent(context, MainActivity::class.java)
        intent.putExtra("navigate_to", "feedback")
        val pendingIntent: PendingIntent? = TaskStackBuilder.create(context).run {
            addNextIntentWithParentStack(intent)
            getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE)
        }

        val notification = NotificationCompat.Builder(context, Constants.NOTIFICATION_CHANNEL_ID_EVALUATION_ALERTS)
            .setSmallIcon(R.mipmap.ic_launcher)
            .setContentTitle(context.getString(R.string.notification_cycle_complete_title))
            .setContentText(context.getString(R.string.notification_cycle_complete_content))
            .setStyle(
                NotificationCompat.BigTextStyle().bigText(
                    context.getString(R.string.notification_cycle_complete_content)
                )
            )
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setAutoCancel(true)
            .setContentIntent(pendingIntent)
            .build()

        nm.notify(Constants.NOTIFICATION_ID_EVALUATION_COMPLETE, notification)
    }

    // Removed createMonitoringForegroundInfo - no longer using foreground services to avoid Android 14 restrictions
} 