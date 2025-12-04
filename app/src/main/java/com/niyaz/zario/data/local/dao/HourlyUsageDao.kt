package com.niyaz.zario.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.niyaz.zario.data.local.entities.AppUsageHourlyEntry
import kotlinx.coroutines.flow.Flow

@Dao
interface HourlyUsageDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(entries: List<AppUsageHourlyEntry>)

    @Query(
        "SELECT * FROM hourly_app_usage " +
            "WHERE userId = :userId AND cycleStartTime = :cycleStart " +
            "ORDER BY hourStartTime ASC, packageName ASC"
    )
    fun observeCycleUsage(userId: String, cycleStart: Long): Flow<List<AppUsageHourlyEntry>>

    @Query(
        "SELECT * FROM hourly_app_usage " +
            "WHERE userId = :userId " +
            "ORDER BY cycleStartTime DESC, hourStartTime ASC"
    )
    fun observeAllUsage(userId: String): Flow<List<AppUsageHourlyEntry>>

    @Query("DELETE FROM hourly_app_usage WHERE userId = :userId AND cycleStartTime = :cycleStart")
    suspend fun deleteCycleUsage(userId: String, cycleStart: Long)

    @Query("DELETE FROM hourly_app_usage WHERE cycleStartTime < :threshold")
    suspend fun deleteUsageBefore(threshold: Long)
}
