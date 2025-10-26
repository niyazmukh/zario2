package com.niyaz.zario.worker

import android.content.Context
import android.util.Log
import androidx.work.ExistingWorkPolicy
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.OutOfQuotaPolicy
import androidx.work.WorkManager
import com.niyaz.zario.BuildFlags
import dagger.hilt.android.qualifiers.ApplicationContext
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MonitoringWorkScheduler @Inject constructor(
    @ApplicationContext private val context: Context
) {

    private val workManager: WorkManager
        get() = WorkManager.getInstance(context)

    fun enqueueMonitoringWork() {
        val monitoringWork = OneTimeWorkRequestBuilder<UsageMonitoringWorker>()
            .setExpedited(OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST)
            .build()

        workManager.enqueueUniqueWork(
            UsageMonitoringWorker.WORK_NAME,
            ExistingWorkPolicy.KEEP,
            monitoringWork
        )

        logDebug("Usage monitoring work enqueued (KEEP policy - preserves in-flight work)")
    }

    fun enqueueScheduler(delaySeconds: Long = 0L) {
        val builder = OneTimeWorkRequestBuilder<MonitoringSchedulerWorker>()
        if (delaySeconds > 0L) {
            builder.setInitialDelay(delaySeconds, TimeUnit.SECONDS)
        } else {
            builder.setExpedited(OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST)
        }
        val request = builder.build()

        workManager.enqueueUniqueWork(
            MonitoringSchedulerWorker.WORK_NAME,
            ExistingWorkPolicy.REPLACE,
            request
        )

        logDebug("Scheduler enqueued with ${delaySeconds}s delay (REPLACE policy)")
    }

    fun enqueueSchedulerWithDelayMillis(delayMillis: Long) {
        val normalizedDelay = delayMillis.coerceAtLeast(0L)
        val seconds = TimeUnit.MILLISECONDS.toSeconds(normalizedDelay)
        enqueueScheduler(seconds)
    }

    fun cancelMonitoring() {
        workManager.cancelUniqueWork(UsageMonitoringWorker.WORK_NAME)
        logDebug("Usage monitoring work cancelled")
    }

    fun cancelScheduler() {
        workManager.cancelUniqueWork(MonitoringSchedulerWorker.WORK_NAME)
        logDebug("Monitoring scheduler cancelled")
    }

    private fun logDebug(message: String) {
        if (BuildFlags.isDebug) {
            Log.d(TAG, message)
        }
    }

    companion object {
        private const val TAG = "MonitoringWorkScheduler"
    }
}
