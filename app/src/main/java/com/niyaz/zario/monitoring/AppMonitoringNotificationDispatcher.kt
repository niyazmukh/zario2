package com.niyaz.zario.monitoring

import android.content.Context
import com.niyaz.zario.data.ScreenTimePlan
import com.niyaz.zario.core.evaluation.EvaluationResultProcessor
import com.niyaz.zario.data.local.entities.NotificationCategory
import com.niyaz.zario.data.local.entities.NotificationEventType
import com.niyaz.zario.utils.NotificationUtils
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppMonitoringNotificationDispatcher @Inject constructor(
    private val engagementEventLogger: EngagementEventLogger
) : MonitoringNotificationDispatcher {

    override fun notifyUsageThresholdReached(
        context: Context,
        plan: ScreenTimePlan,
        currentUsageMs: Long,
        thresholdPercent: Int
    ) {
        NotificationUtils.sendUsageThresholdReached(context, plan, currentUsageMs, thresholdPercent)
        engagementEventLogger.logNotificationEvent(
            eventType = NotificationEventType.SENT,
            category = NotificationCategory.USAGE_THRESHOLD,
            notificationId = com.niyaz.zario.Constants.NOTIFICATION_ID_USAGE_THRESHOLD,
            channelId = com.niyaz.zario.Constants.NOTIFICATION_CHANNEL_ID_EVALUATION_ALERTS,
            metadata = mapOf(
                "planLabel" to plan.label,
                "currentUsageMs" to currentUsageMs,
                "thresholdPercent" to thresholdPercent
            )
        )
    }

    override fun notifyCycleCompletionNow(
        context: Context,
        plan: ScreenTimePlan,
        result: EvaluationResultProcessor.Result
    ) {
        NotificationUtils.sendEvaluationCycleCompletedNow(context, plan, result)
        engagementEventLogger.logNotificationEvent(
            eventType = NotificationEventType.SENT,
            category = NotificationCategory.CYCLE_COMPLETION,
            notificationId = com.niyaz.zario.Constants.NOTIFICATION_ID_EVALUATION_COMPLETE,
            channelId = com.niyaz.zario.Constants.NOTIFICATION_CHANNEL_ID_EVALUATION_ALERTS,
            metadata = mapOf(
                "planLabel" to plan.label,
                "finalUsageMs" to result.finalUsageMs,
                "pointsDelta" to result.pointsDelta,
                "metGoal" to result.metGoal
            )
        )
    }
}
