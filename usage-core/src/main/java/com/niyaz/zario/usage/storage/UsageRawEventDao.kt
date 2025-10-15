package com.niyaz.zario.usage.storage

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UsageRawEventDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertAll(events: List<UsageRawEventEntity>)

    @Query("SELECT * FROM usage_raw_events WHERE timestampMs >= :start AND timestampMs <= :end ORDER BY timestampMs")
    suspend fun eventsBetween(start: Long, end: Long): List<UsageRawEventEntity>

    @Query("DELETE FROM usage_raw_events WHERE timestampMs < :cutoff")
    suspend fun purgeBefore(cutoff: Long)
}