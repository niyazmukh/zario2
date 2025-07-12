package com.niyaz.zario.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.niyaz.zario.data.local.entities.EvaluationHistoryEntry
import kotlinx.coroutines.flow.Flow

@Dao
interface EvaluationHistoryDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(entry: EvaluationHistoryEntry)

    @Query("SELECT * FROM evaluation_history WHERE userEmail = :userEmail ORDER BY evaluationEndTime DESC")
    fun getAll(userEmail: String): Flow<List<EvaluationHistoryEntry>>

    @Query("SELECT * FROM evaluation_history WHERE userEmail = :userEmail AND packageName = :pkg ORDER BY evaluationEndTime DESC")
    fun getByPackage(userEmail: String, pkg: String): Flow<List<EvaluationHistoryEntry>>
} 