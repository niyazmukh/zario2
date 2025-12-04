package com.niyaz.zario.monitoring

import android.content.Context
import com.niyaz.zario.data.ScreenTimePlan
import com.niyaz.zario.core.evaluation.EvaluationResultProcessor

/**
 * Abstraction over notification side effects performed during usage monitoring.
 * Implementations should remain lightweight and delegate to platform helpers.
 */
interface MonitoringNotificationDispatcher {

	fun notifyUsageThresholdReached(
		context: Context,
		plan: ScreenTimePlan,
		currentUsageMs: Long,
		thresholdPercent: Int
	)

	fun notifyCycleCompletionNow(
		context: Context,
		plan: ScreenTimePlan,
		result: EvaluationResultProcessor.Result
	)
}
