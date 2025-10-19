package K0;

import android.database.SQLException;
import androidx.work.impl.WorkDatabase_Impl;
import com.niyaz.zario.data.local.AppDatabase_Impl;
import com.niyaz.zario.usage.storage.UsageAggregationDatabase_Impl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import u0.AbstractC0967h;
import u0.x;
import w0.C1021a;
import w0.C1022b;
import z0.C1063b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\K0\p.smali */
public final class p extends I1.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2167b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f2168c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(UsageAggregationDatabase_Impl usageAggregationDatabase_Impl) {
        super(2);
        this.f2168c = usageAggregationDatabase_Impl;
    }

    private final F1.d l(C1063b c1063b) {
        HashMap map = new HashMap(12);
        map.put("id", new C1021a("id", "INTEGER", true, 1, null, 1));
        map.put("userId", new C1021a("userId", "TEXT", true, 0, null, 1));
        map.put("userEmail", new C1021a("userEmail", "TEXT", true, 0, null, 1));
        map.put("planLabel", new C1021a("planLabel", "TEXT", true, 0, null, 1));
        map.put("goalTimeMs", new C1021a("goalTimeMs", "INTEGER", true, 0, null, 1));
        map.put("dailyAverageMs", new C1021a("dailyAverageMs", "INTEGER", true, 0, null, 1));
        map.put("finalUsageMs", new C1021a("finalUsageMs", "INTEGER", true, 0, null, 1));
        map.put("evaluationStartTime", new C1021a("evaluationStartTime", "INTEGER", true, 0, null, 1));
        map.put("evaluationEndTime", new C1021a("evaluationEndTime", "INTEGER", true, 0, null, 1));
        map.put("metGoal", new C1021a("metGoal", "INTEGER", true, 0, null, 1));
        map.put("pointsDelta", new C1021a("pointsDelta", "INTEGER", true, 0, null, 1));
        map.put("pointsBalanceAfter", new C1021a("pointsBalanceAfter", "INTEGER", true, 0, null, 1));
        HashSet hashSet = new HashSet(0);
        HashSet hashSet2 = new HashSet(1);
        hashSet2.add(new w0.d("index_evaluation_history_userId_evaluationEndTime", false, Arrays.asList("userId", "evaluationEndTime"), Arrays.asList("ASC", "ASC")));
        w0.e eVar = new w0.e("evaluation_history", map, hashSet, hashSet2);
        w0.e eVarA = w0.e.a(c1063b, "evaluation_history");
        if (!eVar.equals(eVarA)) {
            return new F1.d("evaluation_history(com.niyaz.zario.data.local.entities.EvaluationHistoryEntry).\n Expected:\n" + eVar + "\n Found:\n" + eVarA, false);
        }
        HashMap map2 = new HashMap(9);
        map2.put("id", new C1021a("id", "INTEGER", true, 1, null, 1));
        map2.put("userId", new C1021a("userId", "TEXT", true, 0, null, 1));
        map2.put("userEmail", new C1021a("userEmail", "TEXT", true, 0, null, 1));
        map2.put("planLabel", new C1021a("planLabel", "TEXT", true, 0, null, 1));
        map2.put("cycleStartTime", new C1021a("cycleStartTime", "INTEGER", true, 0, null, 1));
        map2.put("hourStartTime", new C1021a("hourStartTime", "INTEGER", true, 0, null, 1));
        map2.put("hourEndTime", new C1021a("hourEndTime", "INTEGER", true, 0, null, 1));
        map2.put("packageName", new C1021a("packageName", "TEXT", true, 0, null, 1));
        map2.put("usageMs", new C1021a("usageMs", "INTEGER", true, 0, null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new w0.d("index_hourly_app_usage_userId_cycleStartTime_hourStartTime", false, Arrays.asList("userId", "cycleStartTime", "hourStartTime"), Arrays.asList("ASC", "ASC", "ASC")));
        hashSet4.add(new w0.d("index_hourly_app_usage_userId_planLabel", false, Arrays.asList("userId", "planLabel"), Arrays.asList("ASC", "ASC")));
        w0.e eVar2 = new w0.e("hourly_app_usage", map2, hashSet3, hashSet4);
        w0.e eVarA2 = w0.e.a(c1063b, "hourly_app_usage");
        if (!eVar2.equals(eVarA2)) {
            return new F1.d("hourly_app_usage(com.niyaz.zario.data.local.entities.AppUsageHourlyEntry).\n Expected:\n" + eVar2 + "\n Found:\n" + eVarA2, false);
        }
        HashMap map3 = new HashMap(16);
        map3.put("id", new C1021a("id", "INTEGER", true, 1, null, 1));
        map3.put("userId", new C1021a("userId", "TEXT", true, 0, null, 1));
        map3.put("userEmail", new C1021a("userEmail", "TEXT", true, 0, null, 1));
        map3.put("historyDocumentId", new C1021a("historyDocumentId", "TEXT", true, 0, null, 1));
        map3.put("planLabel", new C1021a("planLabel", "TEXT", true, 0, null, 1));
        map3.put("goalTimeMs", new C1021a("goalTimeMs", "INTEGER", true, 0, null, 1));
        map3.put("dailyAverageMs", new C1021a("dailyAverageMs", "INTEGER", true, 0, null, 1));
        map3.put("finalUsageMs", new C1021a("finalUsageMs", "INTEGER", true, 0, null, 1));
        map3.put("evaluationStartTime", new C1021a("evaluationStartTime", "INTEGER", true, 0, null, 1));
        map3.put("evaluationEndTime", new C1021a("evaluationEndTime", "INTEGER", true, 0, null, 1));
        map3.put("metGoal", new C1021a("metGoal", "INTEGER", true, 0, null, 1));
        map3.put("pointsDelta", new C1021a("pointsDelta", "INTEGER", true, 0, null, 1));
        map3.put("pointsBalanceAfter", new C1021a("pointsBalanceAfter", "INTEGER", true, 0, null, 1));
        map3.put("attempts", new C1021a("attempts", "INTEGER", true, 0, null, 1));
        map3.put("lastAttemptAt", new C1021a("lastAttemptAt", "INTEGER", false, 0, null, 1));
        map3.put("createdAt", new C1021a("createdAt", "INTEGER", true, 0, null, 1));
        w0.e eVar3 = new w0.e("pending_cycle_sync", map3, new HashSet(0), new HashSet(0));
        w0.e eVarA3 = w0.e.a(c1063b, "pending_cycle_sync");
        if (!eVar3.equals(eVarA3)) {
            return new F1.d("pending_cycle_sync(com.niyaz.zario.data.local.entities.PendingCycleSyncEntity).\n Expected:\n" + eVar3 + "\n Found:\n" + eVarA3, false);
        }
        HashMap map4 = new HashMap(14);
        map4.put("id", new C1021a("id", "INTEGER", true, 1, null, 1));
        map4.put("parentCycleId", new C1021a("parentCycleId", "INTEGER", false, 0, null, 1));
        map4.put("userId", new C1021a("userId", "TEXT", true, 0, null, 1));
        map4.put("userEmail", new C1021a("userEmail", "TEXT", true, 0, null, 1));
        map4.put("planLabel", new C1021a("planLabel", "TEXT", true, 0, null, 1));
        map4.put("cycleStartTime", new C1021a("cycleStartTime", "INTEGER", true, 0, null, 1));
        map4.put("hourStartTime", new C1021a("hourStartTime", "INTEGER", true, 0, null, 1));
        map4.put("hourEndTime", new C1021a("hourEndTime", "INTEGER", true, 0, null, 1));
        map4.put("packageName", new C1021a("packageName", "TEXT", true, 0, null, 1));
        map4.put("usageMs", new C1021a("usageMs", "INTEGER", true, 0, null, 1));
        map4.put("syncType", new C1021a("syncType", "TEXT", true, 0, null, 1));
        map4.put("attempts", new C1021a("attempts", "INTEGER", true, 0, null, 1));
        map4.put("lastAttemptAt", new C1021a("lastAttemptAt", "INTEGER", false, 0, null, 1));
        map4.put("createdAt", new C1021a("createdAt", "INTEGER", true, 0, null, 1));
        HashSet hashSet5 = new HashSet(0);
        HashSet hashSet6 = new HashSet(3);
        hashSet6.add(new w0.d("index_pending_hourly_sync_userId_cycleStartTime_hourStartTime", false, Arrays.asList("userId", "cycleStartTime", "hourStartTime"), Arrays.asList("ASC", "ASC", "ASC")));
        hashSet6.add(new w0.d("index_pending_hourly_sync_parentCycleId", false, Arrays.asList("parentCycleId"), Arrays.asList("ASC")));
        hashSet6.add(new w0.d("index_pending_hourly_sync_userId_cycleStartTime_hourStartTime_packageName_syncType", true, Arrays.asList("userId", "cycleStartTime", "hourStartTime", "packageName", "syncType"), Arrays.asList("ASC", "ASC", "ASC", "ASC", "ASC")));
        w0.e eVar4 = new w0.e("pending_hourly_sync", map4, hashSet5, hashSet6);
        w0.e eVarA4 = w0.e.a(c1063b, "pending_hourly_sync");
        if (!eVar4.equals(eVarA4)) {
            return new F1.d("pending_hourly_sync(com.niyaz.zario.data.local.entities.PendingHourlySyncEntity).\n Expected:\n" + eVar4 + "\n Found:\n" + eVarA4, false);
        }
        HashMap map5 = new HashMap(5);
        map5.put("key", new C1021a("key", "TEXT", true, 1, null, 1));
        map5.put("userId", new C1021a("userId", "TEXT", true, 0, null, 1));
        map5.put("cycleStartTime", new C1021a("cycleStartTime", "INTEGER", true, 0, null, 1));
        map5.put("lastSyncedHourStart", new C1021a("lastSyncedHourStart", "INTEGER", true, 0, null, 1));
        map5.put("updatedAt", new C1021a("updatedAt", "INTEGER", true, 0, null, 1));
        w0.e eVar5 = new w0.e("hourly_sync_state", map5, new HashSet(0), new HashSet(0));
        w0.e eVarA5 = w0.e.a(c1063b, "hourly_sync_state");
        if (eVar5.equals(eVarA5)) {
            return new F1.d((String) null, true);
        }
        return new F1.d("hourly_sync_state(com.niyaz.zario.data.local.entities.HourlySyncStateEntity).\n Expected:\n" + eVar5 + "\n Found:\n" + eVarA5, false);
    }

    @Override // I1.e
    public final void a(C1063b c1063b) throws SQLException {
        switch (this.f2167b) {
            case 0:
                c1063b.m("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                c1063b.m("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                c1063b.m("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                c1063b.m("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                c1063b.m("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                c1063b.m("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                c1063b.m("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                c1063b.m("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                c1063b.m("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                c1063b.m("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                c1063b.m("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                c1063b.m("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                c1063b.m("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                c1063b.m("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c1063b.m("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
                break;
            case 1:
                c1063b.m("CREATE TABLE IF NOT EXISTS `evaluation_history` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userId` TEXT NOT NULL, `userEmail` TEXT NOT NULL, `planLabel` TEXT NOT NULL, `goalTimeMs` INTEGER NOT NULL, `dailyAverageMs` INTEGER NOT NULL, `finalUsageMs` INTEGER NOT NULL, `evaluationStartTime` INTEGER NOT NULL, `evaluationEndTime` INTEGER NOT NULL, `metGoal` INTEGER NOT NULL, `pointsDelta` INTEGER NOT NULL, `pointsBalanceAfter` INTEGER NOT NULL)");
                c1063b.m("CREATE INDEX IF NOT EXISTS `index_evaluation_history_userId_evaluationEndTime` ON `evaluation_history` (`userId`, `evaluationEndTime`)");
                c1063b.m("CREATE TABLE IF NOT EXISTS `hourly_app_usage` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userId` TEXT NOT NULL, `userEmail` TEXT NOT NULL, `planLabel` TEXT NOT NULL, `cycleStartTime` INTEGER NOT NULL, `hourStartTime` INTEGER NOT NULL, `hourEndTime` INTEGER NOT NULL, `packageName` TEXT NOT NULL, `usageMs` INTEGER NOT NULL)");
                c1063b.m("CREATE INDEX IF NOT EXISTS `index_hourly_app_usage_userId_cycleStartTime_hourStartTime` ON `hourly_app_usage` (`userId`, `cycleStartTime`, `hourStartTime`)");
                c1063b.m("CREATE INDEX IF NOT EXISTS `index_hourly_app_usage_userId_planLabel` ON `hourly_app_usage` (`userId`, `planLabel`)");
                c1063b.m("CREATE TABLE IF NOT EXISTS `pending_cycle_sync` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userId` TEXT NOT NULL, `userEmail` TEXT NOT NULL, `historyDocumentId` TEXT NOT NULL, `planLabel` TEXT NOT NULL, `goalTimeMs` INTEGER NOT NULL, `dailyAverageMs` INTEGER NOT NULL, `finalUsageMs` INTEGER NOT NULL, `evaluationStartTime` INTEGER NOT NULL, `evaluationEndTime` INTEGER NOT NULL, `metGoal` INTEGER NOT NULL, `pointsDelta` INTEGER NOT NULL, `pointsBalanceAfter` INTEGER NOT NULL, `attempts` INTEGER NOT NULL, `lastAttemptAt` INTEGER, `createdAt` INTEGER NOT NULL)");
                c1063b.m("CREATE TABLE IF NOT EXISTS `pending_hourly_sync` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `parentCycleId` INTEGER, `userId` TEXT NOT NULL, `userEmail` TEXT NOT NULL, `planLabel` TEXT NOT NULL, `cycleStartTime` INTEGER NOT NULL, `hourStartTime` INTEGER NOT NULL, `hourEndTime` INTEGER NOT NULL, `packageName` TEXT NOT NULL, `usageMs` INTEGER NOT NULL, `syncType` TEXT NOT NULL, `attempts` INTEGER NOT NULL, `lastAttemptAt` INTEGER, `createdAt` INTEGER NOT NULL)");
                c1063b.m("CREATE INDEX IF NOT EXISTS `index_pending_hourly_sync_userId_cycleStartTime_hourStartTime` ON `pending_hourly_sync` (`userId`, `cycleStartTime`, `hourStartTime`)");
                c1063b.m("CREATE INDEX IF NOT EXISTS `index_pending_hourly_sync_parentCycleId` ON `pending_hourly_sync` (`parentCycleId`)");
                c1063b.m("CREATE UNIQUE INDEX IF NOT EXISTS `index_pending_hourly_sync_userId_cycleStartTime_hourStartTime_packageName_syncType` ON `pending_hourly_sync` (`userId`, `cycleStartTime`, `hourStartTime`, `packageName`, `syncType`)");
                c1063b.m("CREATE TABLE IF NOT EXISTS `hourly_sync_state` (`key` TEXT NOT NULL, `userId` TEXT NOT NULL, `cycleStartTime` INTEGER NOT NULL, `lastSyncedHourStart` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL, PRIMARY KEY(`key`))");
                c1063b.m("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c1063b.m("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '406066dfa62251f0b3b11f0c16cc5391')");
                break;
            default:
                c1063b.m("CREATE TABLE IF NOT EXISTS `usage_sessions` (`packageName` TEXT NOT NULL, `startMs` INTEGER NOT NULL, `endMs` INTEGER NOT NULL, `durationMs` INTEGER NOT NULL, `dayStartMs` INTEGER NOT NULL, `taskRootPackageName` TEXT, PRIMARY KEY(`packageName`, `startMs`))");
                c1063b.m("CREATE INDEX IF NOT EXISTS `idx_usage_sessions_day` ON `usage_sessions` (`dayStartMs`)");
                c1063b.m("CREATE INDEX IF NOT EXISTS `idx_usage_sessions_package_day` ON `usage_sessions` (`packageName`, `dayStartMs`)");
                c1063b.m("CREATE INDEX IF NOT EXISTS `idx_sessions_time_range` ON `usage_sessions` (`startMs`, `endMs`)");
                c1063b.m("CREATE TABLE IF NOT EXISTS `usage_raw_events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `timestampMs` INTEGER NOT NULL, `source` TEXT NOT NULL, `packageName` TEXT, `activityClass` TEXT, `state` TEXT NOT NULL, `confidenceOrdinal` INTEGER NOT NULL, `extras` TEXT)");
                c1063b.m("CREATE INDEX IF NOT EXISTS `idx_usage_raw_events_ts` ON `usage_raw_events` (`timestampMs`)");
                c1063b.m("CREATE INDEX IF NOT EXISTS `idx_usage_raw_events_source` ON `usage_raw_events` (`source`)");
                c1063b.m("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c1063b.m("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5a776336a89e5c3df48329d01ff77a6b')");
                break;
        }
    }

    @Override // I1.e
    public final void b(C1063b c1063b) throws SQLException {
        switch (this.f2167b) {
            case 0:
                c1063b.m("DROP TABLE IF EXISTS `Dependency`");
                c1063b.m("DROP TABLE IF EXISTS `WorkSpec`");
                c1063b.m("DROP TABLE IF EXISTS `WorkTag`");
                c1063b.m("DROP TABLE IF EXISTS `SystemIdInfo`");
                c1063b.m("DROP TABLE IF EXISTS `WorkName`");
                c1063b.m("DROP TABLE IF EXISTS `WorkProgress`");
                c1063b.m("DROP TABLE IF EXISTS `Preference`");
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2168c;
                ArrayList arrayList = workDatabase_Impl.f10465g;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((b) workDatabase_Impl.f10465g.get(i)).getClass();
                    }
                    break;
                }
                break;
            case 1:
                c1063b.m("DROP TABLE IF EXISTS `evaluation_history`");
                c1063b.m("DROP TABLE IF EXISTS `hourly_app_usage`");
                c1063b.m("DROP TABLE IF EXISTS `pending_cycle_sync`");
                c1063b.m("DROP TABLE IF EXISTS `pending_hourly_sync`");
                c1063b.m("DROP TABLE IF EXISTS `hourly_sync_state`");
                ArrayList arrayList2 = ((AppDatabase_Impl) this.f2168c).f10465g;
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).getClass();
                    }
                    break;
                }
                break;
            default:
                c1063b.m("DROP TABLE IF EXISTS `usage_sessions`");
                c1063b.m("DROP TABLE IF EXISTS `usage_raw_events`");
                ArrayList arrayList3 = ((UsageAggregationDatabase_Impl) this.f2168c).f10465g;
                if (arrayList3 != null) {
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        ((b) it2.next()).getClass();
                    }
                    break;
                }
                break;
        }
    }

    @Override // I1.e
    public final void h(C1063b c1063b) {
        switch (this.f2167b) {
            case 0:
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2168c;
                ArrayList arrayList = workDatabase_Impl.f10465g;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((b) workDatabase_Impl.f10465g.get(i)).getClass();
                    }
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = ((AppDatabase_Impl) this.f2168c).f10465g;
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).getClass();
                    }
                    break;
                }
                break;
            default:
                ArrayList arrayList3 = ((UsageAggregationDatabase_Impl) this.f2168c).f10465g;
                if (arrayList3 != null) {
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        ((b) it2.next()).getClass();
                    }
                    break;
                }
                break;
        }
    }

    @Override // I1.e
    public final void i(C1063b c1063b) throws SQLException {
        switch (this.f2167b) {
            case 0:
                ((WorkDatabase_Impl) this.f2168c).f10459a = c1063b;
                c1063b.m("PRAGMA foreign_keys = ON");
                ((WorkDatabase_Impl) this.f2168c).k(c1063b);
                ArrayList arrayList = ((WorkDatabase_Impl) this.f2168c).f10465g;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((b) ((WorkDatabase_Impl) this.f2168c).f10465g.get(i)).a(c1063b);
                    }
                    break;
                }
                break;
            case 1:
                ((AppDatabase_Impl) this.f2168c).f10459a = c1063b;
                ((AppDatabase_Impl) this.f2168c).k(c1063b);
                ArrayList arrayList2 = ((AppDatabase_Impl) this.f2168c).f10465g;
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).a(c1063b);
                    }
                    break;
                }
                break;
            default:
                ((UsageAggregationDatabase_Impl) this.f2168c).f10459a = c1063b;
                ((UsageAggregationDatabase_Impl) this.f2168c).k(c1063b);
                ArrayList arrayList3 = ((UsageAggregationDatabase_Impl) this.f2168c).f10465g;
                if (arrayList3 != null) {
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        ((b) it2.next()).a(c1063b);
                    }
                    break;
                }
                break;
        }
    }

    @Override // I1.e
    public final void j(C1063b c1063b) throws IOException, SQLException {
        switch (this.f2167b) {
            case 0:
                AbstractC0967h.a(c1063b);
                break;
            case 1:
                AbstractC0967h.a(c1063b);
                break;
            default:
                AbstractC0967h.a(c1063b);
                break;
        }
    }

    @Override // I1.e
    public final F1.d k(C1063b c1063b) {
        switch (this.f2167b) {
            case 0:
                HashMap map = new HashMap(2);
                map.put("work_spec_id", new C1021a("work_spec_id", "TEXT", true, 1, null, 1));
                map.put("prerequisite_id", new C1021a("prerequisite_id", "TEXT", true, 2, null, 1));
                HashSet hashSet = new HashSet(2);
                hashSet.add(new C1022b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                hashSet.add(new C1022b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
                HashSet hashSet2 = new HashSet(2);
                hashSet2.add(new w0.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
                hashSet2.add(new w0.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
                w0.e eVar = new w0.e("Dependency", map, hashSet, hashSet2);
                w0.e eVarA = w0.e.a(c1063b, "Dependency");
                if (!eVar.equals(eVarA)) {
                    return new F1.d("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + eVar + "\n Found:\n" + eVarA, false);
                }
                HashMap map2 = new HashMap(30);
                map2.put("id", new C1021a("id", "TEXT", true, 1, null, 1));
                map2.put("state", new C1021a("state", "INTEGER", true, 0, null, 1));
                map2.put("worker_class_name", new C1021a("worker_class_name", "TEXT", true, 0, null, 1));
                map2.put("input_merger_class_name", new C1021a("input_merger_class_name", "TEXT", true, 0, null, 1));
                map2.put("input", new C1021a("input", "BLOB", true, 0, null, 1));
                map2.put("output", new C1021a("output", "BLOB", true, 0, null, 1));
                map2.put("initial_delay", new C1021a("initial_delay", "INTEGER", true, 0, null, 1));
                map2.put("interval_duration", new C1021a("interval_duration", "INTEGER", true, 0, null, 1));
                map2.put("flex_duration", new C1021a("flex_duration", "INTEGER", true, 0, null, 1));
                map2.put("run_attempt_count", new C1021a("run_attempt_count", "INTEGER", true, 0, null, 1));
                map2.put("backoff_policy", new C1021a("backoff_policy", "INTEGER", true, 0, null, 1));
                map2.put("backoff_delay_duration", new C1021a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
                map2.put("last_enqueue_time", new C1021a("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
                map2.put("minimum_retention_duration", new C1021a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
                map2.put("schedule_requested_at", new C1021a("schedule_requested_at", "INTEGER", true, 0, null, 1));
                map2.put("run_in_foreground", new C1021a("run_in_foreground", "INTEGER", true, 0, null, 1));
                map2.put("out_of_quota_policy", new C1021a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
                map2.put("period_count", new C1021a("period_count", "INTEGER", true, 0, "0", 1));
                map2.put("generation", new C1021a("generation", "INTEGER", true, 0, "0", 1));
                map2.put("next_schedule_time_override", new C1021a("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
                map2.put("next_schedule_time_override_generation", new C1021a("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
                map2.put("stop_reason", new C1021a("stop_reason", "INTEGER", true, 0, "-256", 1));
                map2.put("required_network_type", new C1021a("required_network_type", "INTEGER", true, 0, null, 1));
                map2.put("requires_charging", new C1021a("requires_charging", "INTEGER", true, 0, null, 1));
                map2.put("requires_device_idle", new C1021a("requires_device_idle", "INTEGER", true, 0, null, 1));
                map2.put("requires_battery_not_low", new C1021a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
                map2.put("requires_storage_not_low", new C1021a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
                map2.put("trigger_content_update_delay", new C1021a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
                map2.put("trigger_max_content_delay", new C1021a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
                map2.put("content_uri_triggers", new C1021a("content_uri_triggers", "BLOB", true, 0, null, 1));
                HashSet hashSet3 = new HashSet(0);
                HashSet hashSet4 = new HashSet(2);
                hashSet4.add(new w0.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
                hashSet4.add(new w0.d("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
                w0.e eVar2 = new w0.e("WorkSpec", map2, hashSet3, hashSet4);
                w0.e eVarA2 = w0.e.a(c1063b, "WorkSpec");
                if (!eVar2.equals(eVarA2)) {
                    return new F1.d("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + eVar2 + "\n Found:\n" + eVarA2, false);
                }
                HashMap map3 = new HashMap(2);
                map3.put("tag", new C1021a("tag", "TEXT", true, 1, null, 1));
                map3.put("work_spec_id", new C1021a("work_spec_id", "TEXT", true, 2, null, 1));
                HashSet hashSet5 = new HashSet(1);
                hashSet5.add(new C1022b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                HashSet hashSet6 = new HashSet(1);
                hashSet6.add(new w0.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
                w0.e eVar3 = new w0.e("WorkTag", map3, hashSet5, hashSet6);
                w0.e eVarA3 = w0.e.a(c1063b, "WorkTag");
                if (!eVar3.equals(eVarA3)) {
                    return new F1.d("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + eVar3 + "\n Found:\n" + eVarA3, false);
                }
                HashMap map4 = new HashMap(3);
                map4.put("work_spec_id", new C1021a("work_spec_id", "TEXT", true, 1, null, 1));
                map4.put("generation", new C1021a("generation", "INTEGER", true, 2, "0", 1));
                map4.put("system_id", new C1021a("system_id", "INTEGER", true, 0, null, 1));
                HashSet hashSet7 = new HashSet(1);
                hashSet7.add(new C1022b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                w0.e eVar4 = new w0.e("SystemIdInfo", map4, hashSet7, new HashSet(0));
                w0.e eVarA4 = w0.e.a(c1063b, "SystemIdInfo");
                if (!eVar4.equals(eVarA4)) {
                    return new F1.d("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + eVar4 + "\n Found:\n" + eVarA4, false);
                }
                HashMap map5 = new HashMap(2);
                map5.put("name", new C1021a("name", "TEXT", true, 1, null, 1));
                map5.put("work_spec_id", new C1021a("work_spec_id", "TEXT", true, 2, null, 1));
                HashSet hashSet8 = new HashSet(1);
                hashSet8.add(new C1022b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                HashSet hashSet9 = new HashSet(1);
                hashSet9.add(new w0.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
                w0.e eVar5 = new w0.e("WorkName", map5, hashSet8, hashSet9);
                w0.e eVarA5 = w0.e.a(c1063b, "WorkName");
                if (!eVar5.equals(eVarA5)) {
                    return new F1.d("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + eVar5 + "\n Found:\n" + eVarA5, false);
                }
                HashMap map6 = new HashMap(2);
                map6.put("work_spec_id", new C1021a("work_spec_id", "TEXT", true, 1, null, 1));
                map6.put("progress", new C1021a("progress", "BLOB", true, 0, null, 1));
                HashSet hashSet10 = new HashSet(1);
                hashSet10.add(new C1022b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                w0.e eVar6 = new w0.e("WorkProgress", map6, hashSet10, new HashSet(0));
                w0.e eVarA6 = w0.e.a(c1063b, "WorkProgress");
                if (!eVar6.equals(eVarA6)) {
                    return new F1.d("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + eVar6 + "\n Found:\n" + eVarA6, false);
                }
                HashMap map7 = new HashMap(2);
                map7.put("key", new C1021a("key", "TEXT", true, 1, null, 1));
                map7.put("long_value", new C1021a("long_value", "INTEGER", false, 0, null, 1));
                w0.e eVar7 = new w0.e("Preference", map7, new HashSet(0), new HashSet(0));
                w0.e eVarA7 = w0.e.a(c1063b, "Preference");
                if (eVar7.equals(eVarA7)) {
                    return new F1.d((String) null, true);
                }
                return new F1.d("Preference(androidx.work.impl.model.Preference).\n Expected:\n" + eVar7 + "\n Found:\n" + eVarA7, false);
            case 1:
                return l(c1063b);
            default:
                HashMap map8 = new HashMap(6);
                map8.put("packageName", new C1021a("packageName", "TEXT", true, 1, null, 1));
                map8.put("startMs", new C1021a("startMs", "INTEGER", true, 2, null, 1));
                map8.put("endMs", new C1021a("endMs", "INTEGER", true, 0, null, 1));
                map8.put("durationMs", new C1021a("durationMs", "INTEGER", true, 0, null, 1));
                map8.put("dayStartMs", new C1021a("dayStartMs", "INTEGER", true, 0, null, 1));
                map8.put("taskRootPackageName", new C1021a("taskRootPackageName", "TEXT", false, 0, null, 1));
                HashSet hashSet11 = new HashSet(0);
                HashSet hashSet12 = new HashSet(3);
                hashSet12.add(new w0.d("idx_usage_sessions_day", false, Arrays.asList("dayStartMs"), Arrays.asList("ASC")));
                hashSet12.add(new w0.d("idx_usage_sessions_package_day", false, Arrays.asList("packageName", "dayStartMs"), Arrays.asList("ASC", "ASC")));
                hashSet12.add(new w0.d("idx_sessions_time_range", false, Arrays.asList("startMs", "endMs"), Arrays.asList("ASC", "ASC")));
                w0.e eVar8 = new w0.e("usage_sessions", map8, hashSet11, hashSet12);
                w0.e eVarA8 = w0.e.a(c1063b, "usage_sessions");
                if (!eVar8.equals(eVarA8)) {
                    return new F1.d("usage_sessions(com.niyaz.zario.usage.storage.UsageSessionEntity).\n Expected:\n" + eVar8 + "\n Found:\n" + eVarA8, false);
                }
                HashMap map9 = new HashMap(8);
                map9.put("id", new C1021a("id", "INTEGER", true, 1, null, 1));
                map9.put("timestampMs", new C1021a("timestampMs", "INTEGER", true, 0, null, 1));
                map9.put("source", new C1021a("source", "TEXT", true, 0, null, 1));
                map9.put("packageName", new C1021a("packageName", "TEXT", false, 0, null, 1));
                map9.put("activityClass", new C1021a("activityClass", "TEXT", false, 0, null, 1));
                map9.put("state", new C1021a("state", "TEXT", true, 0, null, 1));
                map9.put("confidenceOrdinal", new C1021a("confidenceOrdinal", "INTEGER", true, 0, null, 1));
                map9.put("extras", new C1021a("extras", "TEXT", false, 0, null, 1));
                HashSet hashSet13 = new HashSet(0);
                HashSet hashSet14 = new HashSet(2);
                hashSet14.add(new w0.d("idx_usage_raw_events_ts", false, Arrays.asList("timestampMs"), Arrays.asList("ASC")));
                hashSet14.add(new w0.d("idx_usage_raw_events_source", false, Arrays.asList("source"), Arrays.asList("ASC")));
                w0.e eVar9 = new w0.e("usage_raw_events", map9, hashSet13, hashSet14);
                w0.e eVarA9 = w0.e.a(c1063b, "usage_raw_events");
                if (eVar9.equals(eVarA9)) {
                    return new F1.d((String) null, true);
                }
                return new F1.d("usage_raw_events(com.niyaz.zario.usage.storage.UsageRawEventEntity).\n Expected:\n" + eVar9 + "\n Found:\n" + eVarA9, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(AppDatabase_Impl appDatabase_Impl) {
        super(5);
        this.f2168c = appDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(WorkDatabase_Impl workDatabase_Impl) {
        super(20);
        this.f2168c = workDatabase_Impl;
    }
}
