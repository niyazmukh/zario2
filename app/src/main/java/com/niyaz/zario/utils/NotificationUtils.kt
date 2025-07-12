package com.niyaz.zario.utils

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.app.TaskStackBuilder
import com.niyaz.zario.R
import com.niyaz.zario.data.TargetApp
import com.niyaz.zario.MainActivity
// Removed ForegroundInfo imports - no longer using foreground services

object NotificationUtils {

    private const val CHANNEL_ID = "evaluation_alerts"
    private const val CHANNEL_NAME = "Evaluation Alerts"
    private const val NOTIFICATION_ID_THRESHOLD = 1001
    private const val NOTIFICATION_ID_CYCLE_COMPLETE = 1002

    private fun ensureChannel(context: Context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val nm = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            if (nm.getNotificationChannel(CHANNEL_ID) == null) {
                val channel = NotificationChannel(
                    CHANNEL_ID,
                    CHANNEL_NAME,
                    NotificationManager.IMPORTANCE_HIGH
                ).apply {
                    description = context.getString(R.string.notification_channel_description)
                }
                nm.createNotificationChannel(channel)
            }
        }
    }

    fun sendUsageThresholdReached(context: Context, targetApp: TargetApp, goalTimeMs: Long) {
        ensureChannel(context)

        val nm = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        // Build deep link to MainActivity (opens last screen via nav component default behaviour)
        val intent = Intent(context, MainActivity::class.java)
        val pendingIntent: PendingIntent? = TaskStackBuilder.create(context).run {
            addNextIntentWithParentStack(intent)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE)
            } else {
                getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT)
            }
        }

        val contentText = context.getString(
            R.string.notification_usage_threshold_content,
            targetApp.appName
        )

        val notification = NotificationCompat.Builder(context, CHANNEL_ID)
            .setSmallIcon(R.mipmap.ic_launcher)
            .setContentTitle(context.getString(R.string.notification_usage_threshold_title))
            .setContentText(contentText)
            .setStyle(NotificationCompat.BigTextStyle().bigText(contentText))
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setAutoCancel(true)
            .setContentIntent(pendingIntent)
            .build()

        nm.notify(NOTIFICATION_ID_THRESHOLD, notification)
    }

    /**
     * Sends a high-priority notification when an evaluation cycle finishes.
     * Navigates to the feedback screen to show cycle results.
     */
    fun sendEvaluationCycleCompleted(context: Context) {
        ensureChannel(context)

        val nm = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        // Deep link to feedback screen via MainActivity
        val intent = Intent(context, MainActivity::class.java)
        intent.putExtra("navigate_to", "feedback")
        val pendingIntent: PendingIntent? = TaskStackBuilder.create(context).run {
            addNextIntentWithParentStack(intent)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE)
            } else {
                getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT)
            }
        }

        val notification = NotificationCompat.Builder(context, CHANNEL_ID)
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

        nm.notify(NOTIFICATION_ID_CYCLE_COMPLETE, notification)
    }

    // Removed createMonitoringForegroundInfo - no longer using foreground services to avoid Android 14 restrictions
} 