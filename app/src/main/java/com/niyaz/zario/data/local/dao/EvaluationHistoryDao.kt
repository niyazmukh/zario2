package com.niyaz.zario.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.niyaz.zario.data.local.entities.EvaluationHistoryEntry
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

@Dao
interface EvaluationHistoryDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(entry: EvaluationHistoryEntry)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertAll(entries: List<EvaluationHistoryEntry>)

    @Query("SELECT * FROM evaluation_history WHERE userId = :userId ORDER BY evaluationEndTime DESC")
    fun getAll(userId: String): Flow<List<EvaluationHistoryEntry>>

    @Query(
        """
        SELECT * FROM evaluation_history
        WHERE userId IN (:userIds)
           OR (userEmail = :userEmail AND userId = '')
        ORDER BY evaluationEndTime DESC
        """
    )
    fun getAllForUser(userIds: List<String>, userEmail: String): Flow<List<EvaluationHistoryEntry>>

    @Query("SELECT * FROM evaluation_history WHERE userId = :userId AND planLabel = :label ORDER BY evaluationEndTime DESC")
    fun getByPlanLabel(userId: String, label: String): Flow<List<EvaluationHistoryEntry>>

    @Query(
        """
        SELECT * FROM evaluation_history
        WHERE (userId IN (:userIds) OR (userEmail = :userEmail AND userId = ''))
          AND planLabel = :label
        ORDER BY evaluationEndTime DESC
        """
    )
    fun getByPlanLabelForUser(userIds: List<String>, userEmail: String, label: String): Flow<List<EvaluationHistoryEntry>>

    @Query("SELECT * FROM evaluation_history WHERE userId = :userId ORDER BY evaluationEndTime DESC LIMIT 1")
    fun observeLatest(userId: String): Flow<EvaluationHistoryEntry?>

    @Query(
        """
        SELECT metGoal FROM evaluation_history
        WHERE userId = :userId
        ORDER BY evaluationEndTime DESC
        """
    )
    fun observeGoalResults(userId: String): Flow<List<Boolean>>

    @Query("SELECT evaluationEndTime FROM evaluation_history WHERE userId = :userId ORDER BY evaluationEndTime DESC LIMIT 1")
    suspend fun latestEvaluationEndTime(userId: String): Long?

    @Query(
        """
        SELECT evaluationEndTime FROM evaluation_history
        WHERE userId IN (:userIds)
           OR (userEmail = :userEmail AND userId = '')
        ORDER BY evaluationEndTime DESC
        LIMIT 1
        """
    )
    suspend fun latestEvaluationEndTimeForUser(userIds: List<String>, userEmail: String): Long?

    fun observeGoalStreak(userId: String): Flow<Int> =
        observeGoalResults(userId).map { results ->
            var streak = 0
            for (metGoal in results) {
                if (metGoal) {
                    streak += 1
                } else {
                    break
                }
            }
            streak
        }
}
