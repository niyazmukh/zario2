package com.niyaz.zario.usage.storage

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [UsageSessionEntity::class, UsageRawEventEntity::class],
    version = 2,
    exportSchema = true
)
abstract class UsageAggregationDatabase : RoomDatabase() {
    abstract fun usageSessionDao(): UsageSessionDao
    abstract fun usageRawEventDao(): UsageRawEventDao

    companion object {
        const val DATABASE_NAME = "usage_aggregation.db"
    }
}

