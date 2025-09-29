package com.niyaz.zario.data.local

import androidx.room.TypeConverter
import com.niyaz.zario.data.local.entities.PendingHourlySyncEntity

class RemoteSyncTypeConverters {
    @TypeConverter
    fun fromSyncType(type: PendingHourlySyncEntity.SyncType?): String? = type?.name

    @TypeConverter
    fun toSyncType(value: String?): PendingHourlySyncEntity.SyncType? = value?.let {
        runCatching { PendingHourlySyncEntity.SyncType.valueOf(it) }.getOrNull()
    }
}
