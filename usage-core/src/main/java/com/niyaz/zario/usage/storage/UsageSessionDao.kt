package com.niyaz.zario.usage.storage

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

/**
 * DAO for usage session persistence.
 * 
 * CRITICAL FIX: Added day-specific query to prevent historical queries from
 * returning sessions that belong to other days (cross-midnight contamination).
 */
@Dao
interface UsageSessionDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertAll(sessions: List<UsageSessionEntity>)

    /**
     * Returns sessions that intersect the given time window AND belong to the specified day.
     * This prevents historical queries from accidentally returning sessions from other days.
     * 
     * Use this for day-specific queries (e.g., date picker, historical views).
     */
    @Query("""
        SELECT * FROM usage_sessions 
        WHERE dayStartMs = :dayStart 
          AND startMs < :windowEnd 
          AND endMs > :windowStart 
        ORDER BY startMs
    """)
    suspend fun sessionsIntersectingForDay(dayStart: Long, windowStart: Long, windowEnd: Long): List<UsageSessionEntity>

    /**
     * Returns all sessions that intersect the given time window, regardless of day.
     * Use with caution - prefer sessionsIntersectingForDay for bounded queries.
     */
    @Query("SELECT * FROM usage_sessions WHERE startMs < :windowEnd AND endMs > :windowStart ORDER BY startMs")
    suspend fun sessionsIntersecting(windowStart: Long, windowEnd: Long): List<UsageSessionEntity>

    @Query("SELECT * FROM usage_sessions WHERE dayStartMs = :dayStart ORDER BY startMs")
    suspend fun sessionsForDay(dayStart: Long): List<UsageSessionEntity>

    @Query("SELECT * FROM usage_sessions WHERE startMs <= :timestamp AND endMs >= :timestamp ORDER BY endMs DESC LIMIT 1")
    suspend fun sessionContaining(timestamp: Long): UsageSessionEntity?

    @Query("DELETE FROM usage_sessions WHERE endMs < :threshold")
    suspend fun purgeBefore(threshold: Long)

    @Query("SELECT COUNT(*) FROM usage_sessions")
    suspend fun count(): Int
}
