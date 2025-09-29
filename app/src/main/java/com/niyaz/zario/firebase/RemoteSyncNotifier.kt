package com.niyaz.zario.firebase

import android.content.Context
import com.niyaz.zario.utils.NotificationUtils
import javax.inject.Inject
import javax.inject.Singleton

data class SyncFailureContext(
    val attempts: Int,
    val lastError: String?
)

interface RemoteSyncNotifier {
    fun notifyFailure(context: Context, failure: SyncFailureContext)
    fun notifyRecovered(context: Context)
}

@Singleton
class AppRemoteSyncNotifier @Inject constructor() : RemoteSyncNotifier {
    override fun notifyFailure(context: Context, failure: SyncFailureContext) {
        NotificationUtils.sendRemoteSyncFailure(context)
    }

    override fun notifyRecovered(context: Context) {
        NotificationUtils.clearRemoteSyncFailure(context)
    }
}
