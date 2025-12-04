package com.niyaz.zario.monitoring

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.core.app.TaskStackBuilder
import com.niyaz.zario.MainActivity
import com.niyaz.zario.data.local.entities.NotificationCategory
import com.niyaz.zario.data.local.entities.NotificationEventType
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class NotificationInteractionReceiver : BroadcastReceiver() {

    @Inject lateinit var engagementEventLogger: EngagementEventLogger

    override fun onReceive(context: Context, intent: Intent?) {
        if (intent == null) return
        val category = intent.getStringExtra(EXTRA_CATEGORY)
            ?.let { runCatching { NotificationCategory.valueOf(it) }.getOrNull() }
            ?: NotificationCategory.UNKNOWN
        val notificationId = intent.getIntExtra(EXTRA_NOTIFICATION_ID, DEFAULT_NOTIFICATION_ID)
        val channelId = intent.getStringExtra(EXTRA_CHANNEL_ID) ?: DEFAULT_CHANNEL_ID
        val metadata = buildMap<String, Any?> {
            intent.getStringExtra(EXTRA_METADATA)?.let { put("payload", it) }
            put("navigate_to", intent.getStringExtra(EXTRA_NAVIGATE_TO))
        }.filterValues { it != null }

        engagementEventLogger.logNotificationEvent(
            eventType = NotificationEventType.TAPPED,
            category = category,
            notificationId = notificationId,
            channelId = channelId,
            metadata = metadata
        )

        val navigateTo = intent.getStringExtra(EXTRA_NAVIGATE_TO)
        val launchIntent = Intent(context, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
            if (!navigateTo.isNullOrBlank()) {
                putExtra("navigate_to", navigateTo)
            }
        }

        TaskStackBuilder.create(context).apply {
            addNextIntentWithParentStack(launchIntent)
        }.startActivities()
    }

    companion object {
        const val ACTION_NOTIFICATION_TAP = "com.niyaz.zario.action.NOTIFICATION_TAP"
        const val EXTRA_CATEGORY = "extra_category"
        const val EXTRA_NOTIFICATION_ID = "extra_notification_id"
        const val EXTRA_CHANNEL_ID = "extra_channel_id"
        const val EXTRA_NAVIGATE_TO = "extra_navigate_to"
        const val EXTRA_METADATA = "extra_metadata"
        private const val DEFAULT_NOTIFICATION_ID = 0
        private const val DEFAULT_CHANNEL_ID = ""

        fun buildTapIntent(
            context: Context,
            category: NotificationCategory,
            notificationId: Int,
            channelId: String,
            navigateTo: String?,
            metadataJson: String?
        ): Intent = Intent(context, NotificationInteractionReceiver::class.java).apply {
            action = ACTION_NOTIFICATION_TAP
            putExtra(EXTRA_CATEGORY, category.name)
            putExtra(EXTRA_NOTIFICATION_ID, notificationId)
            putExtra(EXTRA_CHANNEL_ID, channelId)
            putExtra(EXTRA_NAVIGATE_TO, navigateTo)
            putExtra(EXTRA_METADATA, metadataJson)
        }
    }
}
