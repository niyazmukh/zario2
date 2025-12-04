package com.niyaz.zario

import android.app.Application
import android.util.Log
import androidx.hilt.work.HiltWorkerFactory
import androidx.work.Configuration
import com.niyaz.zario.core.evaluation.EvaluationRepository
import com.niyaz.zario.di.ApplicationScope
import com.niyaz.zario.firebase.FirebaseAuthInitializer
import com.niyaz.zario.usage.tracking.UsageTrackingInitializer
import com.niyaz.zario.worker.MonitoringWorkScheduler
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@HiltAndroidApp
class MinutesApp : Application(), Configuration.Provider {

    @Inject lateinit var workerFactory: HiltWorkerFactory
    @Inject lateinit var evaluationRepository: EvaluationRepository
    @Inject @ApplicationScope lateinit var applicationScope: CoroutineScope
    @Inject lateinit var monitoringWorkScheduler: MonitoringWorkScheduler
    @Inject lateinit var firebaseAuthInitializer: FirebaseAuthInitializer
    @Inject lateinit var usageTrackingInitializer: UsageTrackingInitializer

    override val workManagerConfiguration: Configuration
        get() = Configuration.Builder()
            .setWorkerFactory(workerFactory)
            .setMinimumLoggingLevel(Log.ERROR)
            .build()

    override fun onCreate() {
        super.onCreate()

        // Manually initialize WorkManager with our custom configuration
        Log.i("MinutesApp", "Application created; WorkManager configured via Configuration.Provider")

        firebaseAuthInitializer.initialize()
        usageTrackingInitializer.initialize(this)

        // Boot-time recovery for process kills that occur during active evaluations
        applicationScope.launch {
            val currentPlan = evaluationRepository.getCurrentPlan()
            if (currentPlan?.evaluationStartTime != null && !evaluationRepository.isEvaluationCompleted()) {
                Log.i("MinutesApp", "Boot recovery: Restarting monitoring for active evaluation (${currentPlan.label})")

                monitoringWorkScheduler.enqueueScheduler()

                Log.i("MinutesApp", "Boot recovery: Monitoring scheduler restarted successfully")
            }
        }
    }

}
