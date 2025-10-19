package S0;

import N2.j0;
import N2.n0;
import u0.x;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S0\h.smali */
public final class h extends S1.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2857d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(x xVar, int i) {
        super(xVar);
        this.f2857d = i;
    }

    @Override // S1.o
    public final String m() {
        switch (this.f2857d) {
            case 0:
                return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
            case 1:
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            case 2:
                return "DELETE from WorkProgress where work_spec_id=?";
            case 3:
                return "DELETE FROM WorkProgress";
            case 4:
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            case 5:
                return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
            case 6:
                return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
            case 7:
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            case 8:
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return "UPDATE workspec SET generation=generation+1 WHERE id=?";
            case 11:
                return "UPDATE workspec SET stop_reason=? WHERE id=?";
            case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return "DELETE FROM workspec WHERE id=?";
            case 13:
                return "UPDATE workspec SET state=? WHERE id=?";
            case 14:
                return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
            case 15:
                return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
            case 16:
                return "UPDATE workspec SET output=? WHERE id=?";
            case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
            case n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            case 19:
                return "DELETE FROM worktag WHERE work_spec_id=?";
            case 20:
                return "DELETE FROM hourly_app_usage WHERE userId = ? AND cycleStartTime = ?";
            case 21:
                return "DELETE FROM pending_hourly_sync";
            case 22:
                return "DELETE FROM hourly_sync_state";
            case 23:
                return "DELETE FROM pending_hourly_sync WHERE parentCycleId = ?";
            case 24:
                return "DELETE FROM pending_cycle_sync";
            case 25:
                return "DELETE FROM usage_raw_events WHERE timestampMs < ?";
            default:
                return "DELETE FROM usage_sessions WHERE endMs < ?";
        }
    }
}
