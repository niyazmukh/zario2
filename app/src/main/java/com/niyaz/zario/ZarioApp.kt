package com.niyaz.zario

import android.app.Application
import android.util.Log
import androidx.work.Configuration
import androidx.work.WorkManager
import androidx.work.ExistingWorkPolicy
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.OutOfQuotaPolicy
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject
import androidx.hilt.work.HiltWorkerFactory
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import com.niyaz.zario.worker.MonitoringSchedulerWorker
import com.niyaz.zario.repository.EvaluationRepository

@HiltAndroidApp
class ZarioApp : Application(), Configuration.Provider {

    @Inject lateinit var workerFactory: HiltWorkerFactory
    @Inject lateinit var evaluationRepository: EvaluationRepository

    override val workManagerConfiguration: Configuration
        get() = Configuration.Builder()
            .setWorkerFactory(workerFactory)
            .setMinimumLoggingLevel(Log.ERROR)
            .build()
            
    override fun onCreate() {
        super.onCreate()
        
        // Manually initialize WorkManager with our custom configuration
        WorkManager.initialize(this, workManagerConfiguration)
        
        Log.i("ZarioApp", "Application created with WorkManager initialized using HiltWorkerFactory")
        
        // CRITICAL: Boot-time recovery for process kills
        // If there's an active evaluation when the app starts, restart monitoring
        CoroutineScope(Dispatchers.IO).launch {
            val currentPlan = evaluationRepository.getCurrentPlan()
            if (currentPlan?.evaluationStartTime != null && !evaluationRepository.isEvaluationCompleted()) {
                Log.i("ZarioApp", "Boot recovery: Restarting monitoring for active evaluation (${currentPlan.label})")
                
                // Restart monitoring scheduler immediately
                val recoveryScheduler = OneTimeWorkRequestBuilder<MonitoringSchedulerWorker>()
                    .setExpedited(OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST)
                    .build()
                
                WorkManager.getInstance(this@ZarioApp).enqueueUniqueWork(
                    MonitoringSchedulerWorker.WORK_NAME,
                    ExistingWorkPolicy.REPLACE,
                    recoveryScheduler
                )
                
                Log.i("ZarioApp", "Boot recovery: Monitoring scheduler restarted successfully")
                    }
        }
    }
} 