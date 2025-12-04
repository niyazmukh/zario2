package com.niyaz.zario.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.niyaz.zario.data.local.dao.EvaluationHistoryDao
import com.niyaz.zario.data.local.dao.HourlyUsageDao
import com.niyaz.zario.data.local.dao.RemoteSyncDao
import com.niyaz.zario.data.local.entities.AppUsageHourlyEntry
import com.niyaz.zario.data.local.entities.EvaluationHistoryEntry
import com.niyaz.zario.data.local.entities.HourlySyncStateEntity
import com.niyaz.zario.data.local.entities.PendingAppInteractionEntity
import com.niyaz.zario.data.local.entities.PendingCycleSyncEntity
import com.niyaz.zario.data.local.entities.PendingHourlySyncEntity
import com.niyaz.zario.data.local.entities.PendingNotificationEventEntity

@Database(
    entities = [
        EvaluationHistoryEntry::class,
        AppUsageHourlyEntry::class,
        PendingCycleSyncEntity::class,
        PendingHourlySyncEntity::class,
        HourlySyncStateEntity::class,
        PendingAppInteractionEntity::class,
        PendingNotificationEventEntity::class
    ],
    version = 7,
    exportSchema = true
)
@TypeConverters(RemoteSyncTypeConverters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun evaluationHistoryDao(): EvaluationHistoryDao
    abstract fun hourlyUsageDao(): HourlyUsageDao
    abstract fun remoteSyncDao(): RemoteSyncDao
}
