package S0;

import J0.C0111e;
import u0.x;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S0\s.smali */
public final class s extends u0.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2919d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(x xVar, int i) {
        super(xVar);
        this.f2919d = i;
    }

    public final String m() {
        switch (this.f2919d) {
            case 0:
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
            case 1:
                return "DELETE FROM `pending_cycle_sync` WHERE `id` = ?";
            case 2:
                return "DELETE FROM `pending_hourly_sync` WHERE `id` = ?";
            default:
                return "UPDATE OR ABORT `pending_cycle_sync` SET `id` = ?,`userId` = ?,`userEmail` = ?,`historyDocumentId` = ?,`planLabel` = ?,`goalTimeMs` = ?,`dailyAverageMs` = ?,`finalUsageMs` = ?,`evaluationStartTime` = ?,`evaluationEndTime` = ?,`metGoal` = ?,`pointsDelta` = ?,`pointsBalanceAfter` = ?,`attempts` = ?,`lastAttemptAt` = ?,`createdAt` = ? WHERE `id` = ?";
        }
    }

    public final void v(z0.i iVar, Object obj) throws Throwable {
        int i;
        switch (this.f2919d) {
            case 0:
                q qVar = (q) obj;
                String str = qVar.f2895a;
                int i5 = 1;
                if (str == null) {
                    iVar.f(1);
                } else {
                    iVar.c(1, str);
                }
                iVar.d(2, r1.d.U(qVar.f2896b));
                String str2 = qVar.f2897c;
                if (str2 == null) {
                    iVar.f(3);
                } else {
                    iVar.c(3, str2);
                }
                String str3 = qVar.f2898d;
                if (str3 == null) {
                    iVar.f(4);
                } else {
                    iVar.c(4, str3);
                }
                byte[] bArrB = J0.h.b(qVar.f2899e);
                if (bArrB == null) {
                    iVar.f(5);
                } else {
                    iVar.j(bArrB, 5);
                }
                byte[] bArrB2 = J0.h.b(qVar.f2900f);
                if (bArrB2 == null) {
                    iVar.f(6);
                } else {
                    iVar.j(bArrB2, 6);
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
                } else {
                    iVar.f(23);
                    iVar.f(24);
                    iVar.f(25);
                    iVar.f(26);
                    iVar.f(27);
                    iVar.f(28);
                    iVar.f(29);
                    iVar.f(30);
                }
                String str4 = qVar.f2895a;
                if (str4 == null) {
                    iVar.f(31);
                    return;
                } else {
                    iVar.c(31, str4);
                    return;
                }
            case 1:
                iVar.d(1, ((Y2.d) obj).f3896a);
                return;
            case 2:
                iVar.d(1, ((Y2.f) obj).f3913a);
                return;
            default:
                Y2.d dVar = (Y2.d) obj;
                iVar.d(1, dVar.f3896a);
                String str5 = dVar.f3897b;
                if (str5 == null) {
                    iVar.f(2);
                } else {
                    iVar.c(2, str5);
                }
                String str6 = dVar.f3898c;
                if (str6 == null) {
                    iVar.f(3);
                } else {
                    iVar.c(3, str6);
                }
                String str7 = dVar.f3899d;
                if (str7 == null) {
                    iVar.f(4);
                } else {
                    iVar.c(4, str7);
                }
                String str8 = dVar.f3900e;
                if (str8 == null) {
                    iVar.f(5);
                } else {
                    iVar.c(5, str8);
                }
                iVar.d(6, dVar.f3901f);
                iVar.d(7, dVar.f3902g);
                iVar.d(8, dVar.h);
                iVar.d(9, dVar.i);
                iVar.d(10, dVar.f3903j);
                iVar.d(11, dVar.f3904k ? 1L : 0L);
                iVar.d(12, dVar.f3905l);
                iVar.d(13, dVar.f3906m);
                iVar.d(14, dVar.f3907n);
                Long l4 = dVar.f3908o;
                if (l4 == null) {
                    iVar.f(15);
                } else {
                    iVar.d(15, l4.longValue());
                }
                iVar.d(16, dVar.f3909p);
                iVar.d(17, dVar.f3896a);
                return;
        }
    }
}
