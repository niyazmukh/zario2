package K0;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.SQLException;
import v0.AbstractC0977a;
import z0.C1063b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\K0\g.smali */
public final class g extends AbstractC0977a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2145c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Context f2146d;

    public g(Context context, int i, int i5) {
        super(i, i5);
        this.f2146d = context;
    }

    @Override // v0.AbstractC0977a
    public final void a(C1063b c1063b) throws SQLException {
        switch (this.f2145c) {
            case 0:
                if (this.f10555b >= 10) {
                    c1063b.n(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.f2146d.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                c1063b.m("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = this.f2146d;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j5 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j6 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    c1063b.a();
                    try {
                        c1063b.n(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j5)});
                        c1063b.n(new Object[]{"reschedule_needed", Long.valueOf(j6)});
                        sharedPreferences.edit().clear().apply();
                        c1063b.s();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i5 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    c1063b.a();
                    try {
                        c1063b.n(new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                        c1063b.n(new Object[]{"next_alarm_manager_id", Integer.valueOf(i5)});
                        sharedPreferences2.edit().clear().apply();
                        c1063b.s();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public g(Context context) {
        super(9, 10);
        this.f2146d = context;
    }
}
