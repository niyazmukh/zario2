package com.niyaz.zario.data.local

import androidx.room.TypeConverter
import com.niyaz.zario.data.local.entities.AppInteractionSource
import com.niyaz.zario.data.local.entities.NotificationCategory
import com.niyaz.zario.data.local.entities.NotificationEventType
import com.niyaz.zario.data.local.entities.PendingHourlySyncEntity

class RemoteSyncTypeConverters {
    @TypeConverter
    fun fromSyncType(type: PendingHourlySyncEntity.SyncType?): String? = type?.name

    @TypeConverter
    fun toSyncType(value: String?): PendingHourlySyncEntity.SyncType? = value?.let {
        runCatching { PendingHourlySyncEntity.SyncType.valueOf(it) }.getOrNull()
    }

    @TypeConverter
    fun fromAppInteractionSource(source: AppInteractionSource?): String? = source?.name

    @TypeConverter
    fun toAppInteractionSource(value: String?): AppInteractionSource? = value?.let {
        runCatching { AppInteractionSource.valueOf(it) }.getOrNull()
    }

    @TypeConverter
    fun fromNotificationEventType(type: NotificationEventType?): String? = type?.name

    @TypeConverter
    fun toNotificationEventType(value: String?): NotificationEventType? = value?.let {
        runCatching { NotificationEventType.valueOf(it) }.getOrNull()
    }

    @TypeConverter
    fun fromNotificationCategory(category: NotificationCategory?): String? = category?.name

    @TypeConverter
    fun toNotificationCategory(value: String?): NotificationCategory? = value?.let {
        runCatching { NotificationCategory.valueOf(it) }.getOrNull()
    }
}
