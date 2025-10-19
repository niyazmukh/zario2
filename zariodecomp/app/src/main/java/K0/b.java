package K0;

import z0.C1063b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\K0\b.smali */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final J0.u f2121a;

    public b(J0.u clock) {
        kotlin.jvm.internal.i.e(clock, "clock");
        this.f2121a = clock;
    }

    public final void a(C1063b c1063b) {
        c1063b.a();
        try {
            StringBuilder sb = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
            this.f2121a.getClass();
            sb.append(System.currentTimeMillis() - n.f2164a);
            sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            c1063b.m(sb.toString());
            c1063b.s();
        } finally {
            c1063b.l();
        }
    }
}
