package com.niyaz.zario.monitoring

import android.content.Context
import com.niyaz.zario.data.ScreenTimePlan
import com.niyaz.zario.utils.NotificationUtils
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppMonitoringNotificationDispatcher @Inject constructor() : MonitoringNotificationDispatcher {

    override fun notifyUsageThresholdReached(
        context: Context,
        plan: ScreenTimePlan,
        currentUsageMs: Long,
        thresholdPercent: Int
    ) {
        NotificationUtils.sendUsageThresholdReached(context, plan, currentUsageMs, thresholdPercent)
    }

    override fun notifyCycleCompletionNow(
        context: Context,
        plan: ScreenTimePlan,
        finalUsageMs: Long
    ) {
        NotificationUtils.sendEvaluationCycleCompletedNow(context, plan, finalUsageMs)
    }
}
