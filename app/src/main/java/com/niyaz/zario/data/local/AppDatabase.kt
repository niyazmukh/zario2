package com.niyaz.zario.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.niyaz.zario.data.local.dao.EvaluationHistoryDao
import com.niyaz.zario.data.local.entities.EvaluationHistoryEntry

@Database(
    entities = [EvaluationHistoryEntry::class],
    version = 2,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun evaluationHistoryDao(): EvaluationHistoryDao
} 