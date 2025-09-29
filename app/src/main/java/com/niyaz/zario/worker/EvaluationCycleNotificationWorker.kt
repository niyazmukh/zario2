package com.niyaz.zario.worker

import android.content.Context
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.niyaz.zario.monitoring.MonitoringNotificationDispatcher
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject

@HiltWorker
class EvaluationCycleNotificationWorker @AssistedInject constructor(
    @Assisted appContext: Context,
    @Assisted params: WorkerParameters,
    private val notificationDispatcher: MonitoringNotificationDispatcher
) : CoroutineWorker(appContext, params) {

    override suspend fun doWork(): Result {
        notificationDispatcher.notifyCycleCompletionNow(applicationContext)
        return Result.success()
    }
}
