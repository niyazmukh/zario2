package com.niyaz.zario.worker

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.work.Data
import androidx.work.WorkInfo
import androidx.work.WorkManager
import com.niyaz.zario.BuildConfig
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Repository for observing WorkManager progress and state changes.
 * Encapsulates LiveData-to-Flow conversion and work state management.
 */
@Singleton
class WorkProgressRepository @Inject constructor(
    @ApplicationContext private val context: Context
) {

    private val workManager: WorkManager = WorkManager.getInstance(context)

    /**
     * Observes progress and state changes for the specified unique work.
     * Emits [WorkProgressUpdate] events as the work progresses.
     */
    fun observeWorkProgress(uniqueWorkName: String): Flow<WorkProgressUpdate> = callbackFlow {
        val liveData: LiveData<List<WorkInfo>> = workManager.getWorkInfosForUniqueWorkLiveData(uniqueWorkName)
        
        val observer = Observer<List<WorkInfo>> { workInfos ->
            if (BuildConfig.DEBUG) {
                Log.d(TAG, "Work info update for '$uniqueWorkName', count: ${workInfos?.size ?: 0}")
            }

            workInfos?.forEach { workInfo ->
                when (workInfo.state) {
                    WorkInfo.State.RUNNING -> {
                        trySend(WorkProgressUpdate.Running(workInfo.progress))
                    }
                    WorkInfo.State.SUCCEEDED -> {
                        trySend(WorkProgressUpdate.Succeeded(workInfo.outputData))
                    }
                    WorkInfo.State.FAILED -> {
                        trySend(WorkProgressUpdate.Failed)
                    }
                    WorkInfo.State.CANCELLED -> {
                        trySend(WorkProgressUpdate.Cancelled)
                    }
                    else -> {
                        if (BuildConfig.DEBUG) {
                            Log.d(TAG, "Work state: ${workInfo.state}")
                        }
                    }
                }
            }
        }

        liveData.observeForever(observer)

        awaitClose {
            liveData.removeObserver(observer)
            if (BuildConfig.DEBUG) {
                Log.d(TAG, "Work observer for '$uniqueWorkName' cleaned up")
            }
        }
    }

    companion object {
        private const val TAG = "WorkProgressRepository"
    }
}

/**
 * Sealed class representing different work progress states.
 */
sealed class WorkProgressUpdate {
    data class Running(val progress: Data) : WorkProgressUpdate()
    data class Succeeded(val output: Data) : WorkProgressUpdate()
    object Failed : WorkProgressUpdate()
    object Cancelled : WorkProgressUpdate()
}
