package S0;

import J0.C0111e;
import N2.n0;
import u0.x;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S0\b.smali */
public final class b extends u0.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2845d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(x xVar, int i) {
        super(xVar);
        this.f2845d = i;
    }

    public final String m() {
        switch (this.f2845d) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 6:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
            case 7:
                return "INSERT OR IGNORE INTO `evaluation_history` (`id`,`userId`,`userEmail`,`planLabel`,`goalTimeMs`,`dailyAverageMs`,`finalUsageMs`,`evaluationStartTime`,`evaluationEndTime`,`metGoal`,`pointsDelta`,`pointsBalanceAfter`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?)";
            case 8:
                return "INSERT OR REPLACE INTO `hourly_app_usage` (`id`,`userId`,`userEmail`,`planLabel`,`cycleStartTime`,`hourStartTime`,`hourEndTime`,`packageName`,`usageMs`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return "INSERT OR REPLACE INTO `hourly_sync_state` (`key`,`userId`,`cycleStartTime`,`lastSyncedHourStart`,`updatedAt`) VALUES (?,?,?,?,?)";
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return "INSERT OR REPLACE INTO `pending_cycle_sync` (`id`,`userId`,`userEmail`,`historyDocumentId`,`planLabel`,`goalTimeMs`,`dailyAverageMs`,`finalUsageMs`,`evaluationStartTime`,`evaluationEndTime`,`metGoal`,`pointsDelta`,`pointsBalanceAfter`,`attempts`,`lastAttemptAt`,`createdAt`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 11:
                return "INSERT OR IGNORE INTO `usage_raw_events` (`id`,`timestampMs`,`source`,`packageName`,`activityClass`,`state`,`confidenceOrdinal`,`extras`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `usage_sessions` (`packageName`,`startMs`,`endMs`,`durationMs`,`dayStartMs`,`taskRootPackageName`) VALUES (?,?,?,?,?,?)";
        }
    }

    public final void v(z0.i iVar, Object obj) throws Throwable {
        int i;
        switch (this.f2845d) {
            case 0:
                a aVar = (a) obj;
                iVar.c(1, aVar.f2843a);
                String str = aVar.f2844b;
                if (str == null) {
                    iVar.f(2);
                    return;
                } else {
                    iVar.c(2, str);
                    return;
                }
            case 1:
                d dVar = (d) obj;
                iVar.c(1, dVar.f2849a);
                iVar.d(2, dVar.f2850b.longValue());
                return;
            case 2:
                String str2 = ((g) obj).f2854a;
                if (str2 == null) {
                    iVar.f(1);
                } else {
                    iVar.c(1, str2);
                }
                iVar.d(2, r11.f2855b);
                iVar.d(3, r11.f2856c);
                return;
            case 3:
                k kVar = (k) obj;
                String str3 = kVar.f2864a;
                if (str3 == null) {
                    iVar.f(1);
                } else {
                    iVar.c(1, str3);
                }
                iVar.c(2, kVar.f2865b);
                return;
            case 4:
                m mVar = (m) obj;
                String str4 = mVar.f2869a;
                if (str4 == null) {
                    iVar.f(1);
                } else {
                    iVar.c(1, str4);
                }
                byte[] bArrB = J0.h.b(mVar.f2870b);
                if (bArrB == null) {
                    iVar.f(2);
                    return;
                } else {
                    iVar.j(bArrB, 2);
                    return;
                }
            case 5:
                q qVar = (q) obj;
                String str5 = qVar.f2895a;
                int i5 = 1;
                if (str5 == null) {
                    iVar.f(1);
                } else {
                    iVar.c(1, str5);
                }
                iVar.d(2, r1.d.U(qVar.f2896b));
                String str6 = qVar.f2897c;
                if (str6 == null) {
                    iVar.f(3);
                } else {
                    iVar.c(3, str6);
                }
                String str7 = qVar.f2898d;
                if (str7 == null) {
                    iVar.f(4);
                } else {
                    iVar.c(4, str7);
                }
                byte[] bArrB2 = J0.h.b(qVar.f2899e);
                if (bArrB2 == null) {
                    iVar.f(5);
                } else {
                    iVar.j(bArrB2, 5);
                }
                byte[] bArrB3 = J0.h.b(qVar.f2900f);
                if (bArrB3 == null) {
                    iVar.f(6);
                } else {
                    iVar.j(bArrB3, 6);
                }
                iVar.d(7, qVar.f2901g);
                iVar.d(8, qVar.h);
                iVar.d(9, qVar.i);
                iVar.d(10, qVar.f2903k);
                int i6 = qVar.f2904l;
                B.a.r(i6, "backoffPolicy");
                int iC = t.h.c(i6);
                if (iC == 0) {
                    i = 0;
                } else {
                    if (iC != 1) {
                        throw new B0.c();
                    }
                    i = 1;
                }
                iVar.d(11, i);
                iVar.d(12, qVar.f2905m);
                iVar.d(13, qVar.f2906n);
                iVar.d(14, qVar.f2907o);
                iVar.d(15, qVar.f2908p);
                iVar.d(16, qVar.f2909q ? 1L : 0L);
                int i7 = qVar.f2910r;
                B.a.r(i7, "policy");
                int iC2 = t.h.c(i7);
                if (iC2 == 0) {
                    i5 = 0;
                } else if (iC2 != 1) {
                    throw new B0.c();
                }
                iVar.d(17, i5);
                iVar.d(18, qVar.f2911s);
                iVar.d(19, qVar.f2912t);
                iVar.d(20, qVar.f2913u);
                iVar.d(21, qVar.f2914v);
                iVar.d(22, qVar.f2915w);
                C0111e c0111e = qVar.f2902j;
                if (c0111e != null) {
                    iVar.d(23, r1.d.Q(c0111e.f2036a));
                    iVar.d(24, c0111e.f2037b ? 1L : 0L);
                    iVar.d(25, c0111e.f2038c ? 1L : 0L);
                    iVar.d(26, c0111e.f2039d ? 1L : 0L);
                    iVar.d(27, c0111e.f2040e ? 1L : 0L);
                    iVar.d(28, c0111e.f2041f);
                    iVar.d(29, c0111e.f2042g);
                    iVar.j(r1.d.T(c0111e.h), 30);
                    return;
                }
                iVar.f(23);
                iVar.f(24);
                iVar.f(25);
                iVar.f(26);
                iVar.f(27);
                iVar.f(28);
                iVar.f(29);
                iVar.f(30);
                return;
            case 6:
                u uVar = (u) obj;
                String str8 = uVar.f2932a;
                if (str8 == null) {
                    iVar.f(1);
                } else {
                    iVar.c(1, str8);
                }
                iVar.c(2, uVar.f2933b);
                return;
            case 7:
                Y2.b bVar = (Y2.b) obj;
                iVar.d(1, bVar.f3881a);
                String str9 = bVar.f3882b;
                if (str9 == null) {
                    iVar.f(2);
                } else {
                    iVar.c(2, str9);
                }
                String str10 = bVar.f3883c;
                if (str10 == null) {
                    iVar.f(3);
                } else {
                    iVar.c(3, str10);
                }
                String str11 = bVar.f3884d;
                if (str11 == null) {
                    iVar.f(4);
                } else {
                    iVar.c(4, str11);
                }
                iVar.d(5, bVar.f3885e);
                iVar.d(6, bVar.f3886f);
                iVar.d(7, bVar.f3887g);
                iVar.d(8, bVar.h);
                iVar.d(9, bVar.i);
                iVar.d(10, bVar.f3888j ? 1L : 0L);
                iVar.d(11, bVar.f3889k);
                iVar.d(12, bVar.f3890l);
                return;
            case 8:
                Y2.a aVar2 = (Y2.a) obj;
                iVar.d(1, aVar2.f3874a);
                iVar.c(2, aVar2.f3875b);
                iVar.c(3, aVar2.f3876c);
                String str12 = aVar2.f3877d;
                if (str12 == null) {
                    iVar.f(4);
                } else {
                    iVar.c(4, str12);
                }
                iVar.d(5, aVar2.f3878e);
                iVar.d(6, aVar2.f3879f);
                iVar.d(7, aVar2.f3880g);
                String str13 = aVar2.h;
                if (str13 == null) {
                    iVar.f(8);
                } else {
                    iVar.c(8, str13);
                }
                iVar.d(9, aVar2.i);
                return;
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                Y2.c cVar = (Y2.c) obj;
                String str14 = cVar.f3891a;
                if (str14 == null) {
                    iVar.f(1);
                } else {
                    iVar.c(1, str14);
                }
                String str15 = cVar.f3892b;
                if (str15 == null) {
                    iVar.f(2);
                } else {
                    iVar.c(2, str15);
                }
                iVar.d(3, cVar.f3893c);
                iVar.d(4, cVar.f3894d);
                iVar.d(5, cVar.f3895e);
                return;
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                Y2.d dVar2 = (Y2.d) obj;
                iVar.d(1, dVar2.f3896a);
                String str16 = dVar2.f3897b;
                if (str16 == null) {
                    iVar.f(2);
                } else {
                    iVar.c(2, str16);
                }
                String str17 = dVar2.f3898c;
                if (str17 == null) {
                    iVar.f(3);
                } else {
                    iVar.c(3, str17);
                }
                String str18 = dVar2.f3899d;
                if (str18 == null) {
                    iVar.f(4);
                } else {
                    iVar.c(4, str18);
                }
                String str19 = dVar2.f3900e;
                if (str19 == null) {
                    iVar.f(5);
                } else {
                    iVar.c(5, str19);
                }
                iVar.d(6, dVar2.f3901f);
                iVar.d(7, dVar2.f3902g);
                iVar.d(8, dVar2.h);
                iVar.d(9, dVar2.i);
                iVar.d(10, dVar2.f3903j);
                iVar.d(11, dVar2.f3904k ? 1L : 0L);
                iVar.d(12, dVar2.f3905l);
                iVar.d(13, dVar2.f3906m);
                iVar.d(14, dVar2.f3907n);
                Long l4 = dVar2.f3908o;
                if (l4 == null) {
                    iVar.f(15);
                } else {
                    iVar.d(15, l4.longValue());
                }
                iVar.d(16, dVar2.f3909p);
                return;
            case 11:
                v3.b bVar2 = (v3.b) obj;
                iVar.d(1, bVar2.f10672a);
                iVar.d(2, bVar2.f10673b);
                String str20 = bVar2.f10674c;
                if (str20 == null) {
                    iVar.f(3);
                } else {
                    iVar.c(3, str20);
                }
                String str21 = bVar2.f10675d;
                if (str21 == null) {
                    iVar.f(4);
                } else {
                    iVar.c(4, str21);
                }
                String str22 = bVar2.f10676e;
                if (str22 == null) {
                    iVar.f(5);
                } else {
                    iVar.c(5, str22);
                }
                String str23 = bVar2.f10677f;
                if (str23 == null) {
                    iVar.f(6);
                } else {
                    iVar.c(6, str23);
                }
                iVar.d(7, bVar2.f10678g);
                String str24 = bVar2.h;
                if (str24 == null) {
                    iVar.f(8);
                    return;
                } else {
                    iVar.c(8, str24);
                    return;
                }
            default:
                v3.e eVar = (v3.e) obj;
                String str25 = eVar.f10682a;
                if (str25 == null) {
                    iVar.f(1);
                } else {
                    iVar.c(1, str25);
                }
                iVar.d(2, eVar.f10683b);
                iVar.d(3, eVar.f10684c);
                iVar.d(4, eVar.f10685d);
                iVar.d(5, eVar.f10686e);
                String str26 = eVar.f10687f;
                if (str26 == null) {
                    iVar.f(6);
                    return;
                } else {
                    iVar.c(6, str26);
                    return;
                }
        }
    }
}
