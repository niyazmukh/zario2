package com.niyaz.zario.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Embedded
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Relation
import androidx.room.Transaction
import androidx.room.Update
import com.niyaz.zario.data.local.entities.HourlySyncStateEntity
import com.niyaz.zario.data.local.entities.PendingCycleSyncEntity
import com.niyaz.zario.data.local.entities.PendingHourlySyncEntity
import com.niyaz.zario.data.local.entities.PendingHourlySyncEntity.SyncType

@Dao
interface RemoteSyncDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertState(state: HourlySyncStateEntity)

    @Query("SELECT * FROM hourly_sync_state WHERE key = :key LIMIT 1")
    suspend fun findStateByKey(key: String): HourlySyncStateEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCycle(entity: PendingCycleSyncEntity): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertHourly(entities: List<PendingHourlySyncEntity>): List<Long>

    @Transaction
    suspend fun insertCycleWithHourly(
        cycle: PendingCycleSyncEntity,
        hourly: List<PendingHourlySyncEntity>
    ): Long {
        val cycleId = insertCycle(cycle)
        if (hourly.isNotEmpty()) {
            val withParent = hourly.map { it.copy(parentCycleId = cycleId) }
            insertHourly(withParent)
        }
        return cycleId
    }

    @Transaction
    @Query("SELECT * FROM pending_cycle_sync ORDER BY createdAt LIMIT :limit")
    suspend fun loadPendingCycles(limit: Int): List<PendingCycleWithHourly>

    @Query(
        """
        SELECT * FROM pending_hourly_sync
        WHERE syncType = :syncType AND parentCycleId IS NULL
        ORDER BY hourStartTime
        LIMIT :limit
        """
    )
    suspend fun loadPendingHourly(syncType: SyncType, limit: Int): List<PendingHourlySyncEntity>

    @Update
    suspend fun updateCycle(entity: PendingCycleSyncEntity)

    @Update
    suspend fun updateHourly(entity: PendingHourlySyncEntity)

    @Delete
    suspend fun deleteCycle(entity: PendingCycleSyncEntity)

    @Delete
    suspend fun deleteHourly(entities: List<PendingHourlySyncEntity>)

    @Query("DELETE FROM pending_hourly_sync WHERE parentCycleId = :parentId")
    suspend fun deleteHourlyByParent(parentId: Long)

    data class PendingCycleWithHourly(
        @Embedded val cycle: PendingCycleSyncEntity,
        @Relation(
            parentColumn = "id",
            entityColumn = "parentCycleId"
        )
        val hourly: List<PendingHourlySyncEntity>
    )
}
