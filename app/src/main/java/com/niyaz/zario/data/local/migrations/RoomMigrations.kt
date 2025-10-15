package com.niyaz.zario.data.local.migrations

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

/**
 * Consolidated Room migrations that normalise the schema introduced in v5 while
 * preserving existing datasets from earlier app versions. The migrations use
 * idempotent SQL so they can safely be applied even if certain tables or
 * indices already exist.
 */
object RoomMigrations {

    private fun migrateToVersion5(db: SupportSQLiteDatabase) {
        db.execSQL(
            """
            CREATE TABLE IF NOT EXISTS `evaluation_history` (
                `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
                `userId` TEXT NOT NULL,
                `userEmail` TEXT NOT NULL,
                `planLabel` TEXT NOT NULL,
                `goalTimeMs` INTEGER NOT NULL,
                `dailyAverageMs` INTEGER NOT NULL,
                `finalUsageMs` INTEGER NOT NULL,
                `evaluationStartTime` INTEGER NOT NULL,
                `evaluationEndTime` INTEGER NOT NULL,
                `metGoal` INTEGER NOT NULL,
                `pointsDelta` INTEGER NOT NULL,
                `pointsBalanceAfter` INTEGER NOT NULL
            )
            """.trimIndent()
        )
        db.execSQL(
            "CREATE INDEX IF NOT EXISTS `index_evaluation_history_userId_evaluationEndTime` ON `evaluation_history`(`userId`, `evaluationEndTime`)"
        )

        db.execSQL(
            """
            CREATE TABLE IF NOT EXISTS `hourly_app_usage` (
                `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
                `userId` TEXT NOT NULL,
                `userEmail` TEXT NOT NULL,
                `planLabel` TEXT NOT NULL,
                `cycleStartTime` INTEGER NOT NULL,
                `hourStartTime` INTEGER NOT NULL,
                `hourEndTime` INTEGER NOT NULL,
                `packageName` TEXT NOT NULL,
                `usageMs` INTEGER NOT NULL
            )
            """.trimIndent()
        )
        db.execSQL(
            "CREATE INDEX IF NOT EXISTS `index_hourly_app_usage_userId_cycleStartTime_hourStartTime` ON `hourly_app_usage`(`userId`, `cycleStartTime`, `hourStartTime`)"
        )
        db.execSQL(
            "CREATE INDEX IF NOT EXISTS `index_hourly_app_usage_userId_planLabel` ON `hourly_app_usage`(`userId`, `planLabel`)"
        )

        db.execSQL(
            """
            CREATE TABLE IF NOT EXISTS `pending_cycle_sync` (
                `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
                `userId` TEXT NOT NULL,
                `userEmail` TEXT NOT NULL,
                `historyDocumentId` TEXT NOT NULL,
                `planLabel` TEXT NOT NULL,
                `goalTimeMs` INTEGER NOT NULL,
                `dailyAverageMs` INTEGER NOT NULL,
                `finalUsageMs` INTEGER NOT NULL,
                `evaluationStartTime` INTEGER NOT NULL,
                `evaluationEndTime` INTEGER NOT NULL,
                `metGoal` INTEGER NOT NULL,
                `pointsDelta` INTEGER NOT NULL,
                `pointsBalanceAfter` INTEGER NOT NULL,
                `attempts` INTEGER NOT NULL DEFAULT 0,
                `lastAttemptAt` INTEGER,
                `createdAt` INTEGER NOT NULL
            )
            """.trimIndent()
        )

        db.execSQL(
            """
            CREATE TABLE IF NOT EXISTS `pending_hourly_sync` (
                `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
                `parentCycleId` INTEGER,
                `userId` TEXT NOT NULL,
                `userEmail` TEXT NOT NULL,
                `planLabel` TEXT NOT NULL,
                `cycleStartTime` INTEGER NOT NULL,
                `hourStartTime` INTEGER NOT NULL,
                `hourEndTime` INTEGER NOT NULL,
                `packageName` TEXT NOT NULL,
                `usageMs` INTEGER NOT NULL,
                `syncType` TEXT NOT NULL,
                `attempts` INTEGER NOT NULL DEFAULT 0,
                `lastAttemptAt` INTEGER,
                `createdAt` INTEGER NOT NULL
            )
            """.trimIndent()
        )
        db.execSQL(
            "CREATE INDEX IF NOT EXISTS `index_pending_hourly_sync_userId_cycleStartTime_hourStartTime` ON `pending_hourly_sync`(`userId`, `cycleStartTime`, `hourStartTime`)"
        )
        db.execSQL(
            "CREATE INDEX IF NOT EXISTS `index_pending_hourly_sync_parentCycleId` ON `pending_hourly_sync`(`parentCycleId`)"
        )
        db.execSQL(
            "CREATE UNIQUE INDEX IF NOT EXISTS `index_pending_hourly_sync_userId_cycleStartTime_hourStartTime_packageName_syncType` ON `pending_hourly_sync`(`userId`, `cycleStartTime`, `hourStartTime`, `packageName`, `syncType`)"
        )

        db.execSQL(
            """
            CREATE TABLE IF NOT EXISTS `hourly_sync_state` (
                `key` TEXT NOT NULL,
                `userId` TEXT NOT NULL,
                `cycleStartTime` INTEGER NOT NULL,
                `lastSyncedHourStart` INTEGER NOT NULL,
                `updatedAt` INTEGER NOT NULL,
                PRIMARY KEY(`key`)
            )
            """.trimIndent()
        )
    }

    val MIGRATION_1_5: Migration = object : Migration(1, 5) {
        override fun migrate(db: SupportSQLiteDatabase) = migrateToVersion5(db)
    }

    val MIGRATION_2_5: Migration = object : Migration(2, 5) {
        override fun migrate(db: SupportSQLiteDatabase) = migrateToVersion5(db)
    }

    val MIGRATION_3_5: Migration = object : Migration(3, 5) {
        override fun migrate(db: SupportSQLiteDatabase) = migrateToVersion5(db)
    }

    val MIGRATION_4_5: Migration = object : Migration(4, 5) {
        override fun migrate(db: SupportSQLiteDatabase) = migrateToVersion5(db)
    }

    val ALL: Array<Migration> = arrayOf(
        MIGRATION_1_5,
        MIGRATION_2_5,
        MIGRATION_3_5,
        MIGRATION_4_5
    )
}
