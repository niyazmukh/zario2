package B3;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: B3.m, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\m.1.smali */
public final class C0061m {

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f893e = Logger.getLogger(C0061m.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final W0 f894a;

    /* renamed from: b, reason: collision with root package name */
    public final z3.p0 f895b;

    /* renamed from: c, reason: collision with root package name */
    public C0032c0 f896c;

    /* renamed from: d, reason: collision with root package name */
    public S0.l f897d;

    public C0061m(o2 o2Var, W0 w02, z3.p0 p0Var) {
        this.f894a = w02;
        this.f895b = p0Var;
    }

    public final void a(N n5) {
        this.f895b.d();
        if (this.f896c == null) {
            this.f896c = o2.d();
        }
        S0.l lVar = this.f897d;
        if (lVar != null) {
            z3.o0 o0Var = (z3.o0) lVar.f2867b;
            if (!o0Var.f11376c && !o0Var.f11375b) {
                return;
            }
        }
        long jA = this.f896c.a();
        this.f897d = this.f895b.c(n5, jA, TimeUnit.NANOSECONDS, this.f894a);
        f893e.log(Level.FINE, "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(jA));
    }
}
