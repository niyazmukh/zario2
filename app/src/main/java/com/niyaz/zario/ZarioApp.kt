package com.niyaz.zario

import android.app.Application
import android.util.Log
import androidx.hilt.work.HiltWorkerFactory
import androidx.work.Configuration
import com.niyaz.zario.core.evaluation.EvaluationRepository
import com.niyaz.zario.worker.MonitoringWorkScheduler
import com.niyaz.zario.firebase.FirebaseAuthInitializer
import com.niyaz.zario.usage.accessibility.TrackingAccessibilityService
import com.niyaz.zario.usage.tracking.UsageTrackingInitializer
import com.niyaz.zario.usage.tracking.UsageEventRecorder
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.launch
import javax.inject.Inject
import com.niyaz.zario.di.ApplicationScope
import kotlinx.coroutines.CoroutineScope

@HiltAndroidApp
class ZarioApp : Application(), Configuration.Provider, TrackingAccessibilityService.RecorderProvider {

    @Inject lateinit var workerFactory: HiltWorkerFactory
    @Inject lateinit var evaluationRepository: EvaluationRepository
    @Inject @ApplicationScope lateinit var applicationScope: CoroutineScope
    @Inject lateinit var monitoringWorkScheduler: MonitoringWorkScheduler
    @Inject lateinit var firebaseAuthInitializer: FirebaseAuthInitializer
    @Inject lateinit var usageTrackingInitializer: UsageTrackingInitializer
    @Inject lateinit var usageEventRecorder: UsageEventRecorder

    override val workManagerConfiguration: Configuration
        get() = Configuration.Builder()
            .setWorkerFactory(workerFactory)
            .setMinimumLoggingLevel(Log.ERROR)
            .build()
            
    override fun onCreate() {
        super.onCreate()
        
        // Manually initialize WorkManager with our custom configuration
        Log.i("ZarioApp", "Application created; WorkManager configured via Configuration.Provider")

        firebaseAuthInitializer.initialize()
        usageTrackingInitializer.initialize(this)

        // CRITICAL: Boot-time recovery for process kills
        // If there's an active evaluation when the app starts, restart monitoring
        applicationScope.launch {
            val currentPlan = evaluationRepository.getCurrentPlan()
            if (currentPlan?.evaluationStartTime != null && !evaluationRepository.isEvaluationCompleted()) {
                Log.i("ZarioApp", "Boot recovery: Restarting monitoring for active evaluation (${currentPlan.label})")

                // Restart monitoring scheduler immediately
                monitoringWorkScheduler.enqueueScheduler()

                Log.i("ZarioApp", "Boot recovery: Monitoring scheduler restarted successfully")
            }
        }
    }

    override fun provideRecorder(): UsageEventRecorder = usageEventRecorder
}