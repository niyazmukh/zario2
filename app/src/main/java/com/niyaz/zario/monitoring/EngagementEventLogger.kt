package com.niyaz.zario.monitoring

import android.content.Context
import android.content.pm.PackageManager
import android.util.Log
import com.niyaz.zario.data.local.dao.RemoteSyncDao
import com.niyaz.zario.data.local.entities.AppInteractionSource
import com.niyaz.zario.data.local.entities.PendingAppInteractionEntity
import com.niyaz.zario.data.local.entities.PendingNotificationEventEntity
import com.niyaz.zario.data.local.entities.NotificationCategory
import com.niyaz.zario.data.local.entities.NotificationEventType
import com.niyaz.zario.firebase.RemoteSyncScheduler
import com.niyaz.zario.repository.UserSessionRepository
import com.niyaz.zario.security.UserIdentity
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import org.json.JSONObject

@Singleton
class EngagementEventLogger @Inject constructor(
    private val remoteSyncDao: RemoteSyncDao,
    private val remoteSyncScheduler: RemoteSyncScheduler,
    private val userSessionRepository: UserSessionRepository,
    @ApplicationContext private val context: Context,
    @com.niyaz.zario.di.ApplicationScope private val applicationScope: CoroutineScope
) {

    fun logAppOpen(source: AppInteractionSource) {
        val identity = resolveIdentity() ?: return
        applicationScope.launch {
            val (versionName, versionCode) = appVersionInfo
            remoteSyncDao.insertAppInteraction(
                PendingAppInteractionEntity(
                    userId = identity.first,
                    userEmail = identity.second,
                    occurredAt = System.currentTimeMillis(),
                    source = source,
                    appVersionName = versionName,
                    appVersionCode = versionCode
                )
            )
            remoteSyncScheduler.scheduleSync()
        }
    }

    fun logNotificationEvent(
        eventType: NotificationEventType,
        category: NotificationCategory,
        notificationId: Int,
        channelId: String,
        metadata: Map<String, Any?> = emptyMap()
    ) {
        val identity = resolveIdentity() ?: return
        applicationScope.launch {
            remoteSyncDao.insertNotificationEvent(
                PendingNotificationEventEntity(
                    userId = identity.first,
                    userEmail = identity.second,
                    occurredAt = System.currentTimeMillis(),
                    eventType = eventType,
                    category = category,
                    notificationId = notificationId,
                    channelId = channelId,
                    metadataJson = metadata.toJsonString()
                )
            )
            remoteSyncScheduler.scheduleSync()
        }
    }

    private fun resolveIdentity(): Pair<String, String>? {
        val session = userSessionRepository.session.value
        val user = session.user ?: return null
        val email = user.email
        val userId = user.id.ifBlank { UserIdentity.fromEmail(email) }
        if (userId.isBlank()) {
            Log.w(TAG, "Skipping engagement logging – missing user identity")
            return null
        }
        return userId to email
    }

    private val appVersionInfo: Pair<String?, Long?> by lazy {
        runCatching {
            val packageInfo = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.TIRAMISU) {
                context.packageManager.getPackageInfo(context.packageName, PackageManager.PackageInfoFlags.of(0))
            } else {
                @Suppress("DEPRECATION")
                context.packageManager.getPackageInfo(context.packageName, 0)
            }
            val versionCode = runCatching { packageInfo.longVersionCode }.getOrNull()
            packageInfo.versionName to versionCode
        }.getOrElse {
            Log.w(TAG, "Unable to resolve app version", it)
            null to null
        }
    }

    private fun Map<String, Any?>.toJsonString(): String? {
        if (isEmpty()) return null
        val json = JSONObject()
        for ((key, value) in this) {
            json.put(key, value)
        }
        return json.toString()
    }

    companion object {
        private const val TAG = "EngagementEventLogger"
    }
}
