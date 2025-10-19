package Z2;

import v0.AbstractC0977a;
import z0.C1063b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Z2\b.smali */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC0977a[] f4011a = {new a(1, 5, 0), new a(2, 5, 1), new a(3, 5, 2), new a(4, 5, 3)};

    public static final void a(C1063b c1063b) {
        c1063b.m("CREATE TABLE IF NOT EXISTS `evaluation_history` (\n    `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    `userId` TEXT NOT NULL,\n    `userEmail` TEXT NOT NULL,\n    `planLabel` TEXT NOT NULL,\n    `goalTimeMs` INTEGER NOT NULL,\n    `dailyAverageMs` INTEGER NOT NULL,\n    `finalUsageMs` INTEGER NOT NULL,\n    `evaluationStartTime` INTEGER NOT NULL,\n    `evaluationEndTime` INTEGER NOT NULL,\n    `metGoal` INTEGER NOT NULL,\n    `pointsDelta` INTEGER NOT NULL,\n    `pointsBalanceAfter` INTEGER NOT NULL\n)");
        c1063b.m("CREATE INDEX IF NOT EXISTS `index_evaluation_history_userId_evaluationEndTime` ON `evaluation_history`(`userId`, `evaluationEndTime`)");
        c1063b.m("CREATE TABLE IF NOT EXISTS `hourly_app_usage` (\n    `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    `userId` TEXT NOT NULL,\n    `userEmail` TEXT NOT NULL,\n    `planLabel` TEXT NOT NULL,\n    `cycleStartTime` INTEGER NOT NULL,\n    `hourStartTime` INTEGER NOT NULL,\n    `hourEndTime` INTEGER NOT NULL,\n    `packageName` TEXT NOT NULL,\n    `usageMs` INTEGER NOT NULL\n)");
        c1063b.m("CREATE INDEX IF NOT EXISTS `index_hourly_app_usage_userId_cycleStartTime_hourStartTime` ON `hourly_app_usage`(`userId`, `cycleStartTime`, `hourStartTime`)");
        c1063b.m("CREATE INDEX IF NOT EXISTS `index_hourly_app_usage_userId_planLabel` ON `hourly_app_usage`(`userId`, `planLabel`)");
        c1063b.m("CREATE TABLE IF NOT EXISTS `pending_cycle_sync` (\n    `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    `userId` TEXT NOT NULL,\n    `userEmail` TEXT NOT NULL,\n    `historyDocumentId` TEXT NOT NULL,\n    `planLabel` TEXT NOT NULL,\n    `goalTimeMs` INTEGER NOT NULL,\n    `dailyAverageMs` INTEGER NOT NULL,\n    `finalUsageMs` INTEGER NOT NULL,\n    `evaluationStartTime` INTEGER NOT NULL,\n    `evaluationEndTime` INTEGER NOT NULL,\n    `metGoal` INTEGER NOT NULL,\n    `pointsDelta` INTEGER NOT NULL,\n    `pointsBalanceAfter` INTEGER NOT NULL,\n    `attempts` INTEGER NOT NULL DEFAULT 0,\n    `lastAttemptAt` INTEGER,\n    `createdAt` INTEGER NOT NULL\n)");
        c1063b.m("CREATE TABLE IF NOT EXISTS `pending_hourly_sync` (\n    `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    `parentCycleId` INTEGER,\n    `userId` TEXT NOT NULL,\n    `userEmail` TEXT NOT NULL,\n    `planLabel` TEXT NOT NULL,\n    `cycleStartTime` INTEGER NOT NULL,\n    `hourStartTime` INTEGER NOT NULL,\n    `hourEndTime` INTEGER NOT NULL,\n    `packageName` TEXT NOT NULL,\n    `usageMs` INTEGER NOT NULL,\n    `syncType` TEXT NOT NULL,\n    `attempts` INTEGER NOT NULL DEFAULT 0,\n    `lastAttemptAt` INTEGER,\n    `createdAt` INTEGER NOT NULL\n)");
        c1063b.m("CREATE INDEX IF NOT EXISTS `index_pending_hourly_sync_userId_cycleStartTime_hourStartTime` ON `pending_hourly_sync`(`userId`, `cycleStartTime`, `hourStartTime`)");
        c1063b.m("CREATE INDEX IF NOT EXISTS `index_pending_hourly_sync_parentCycleId` ON `pending_hourly_sync`(`parentCycleId`)");
        c1063b.m("CREATE UNIQUE INDEX IF NOT EXISTS `index_pending_hourly_sync_userId_cycleStartTime_hourStartTime_packageName_syncType` ON `pending_hourly_sync`(`userId`, `cycleStartTime`, `hourStartTime`, `packageName`, `syncType`)");
        c1063b.m("CREATE TABLE IF NOT EXISTS `hourly_sync_state` (\n    `key` TEXT NOT NULL,\n    `userId` TEXT NOT NULL,\n    `cycleStartTime` INTEGER NOT NULL,\n    `lastSyncedHourStart` INTEGER NOT NULL,\n    `updatedAt` INTEGER NOT NULL,\n    PRIMARY KEY(`key`)\n)");
    }
}
