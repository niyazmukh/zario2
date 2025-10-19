package A2;

import N2.AbstractC0156x;
import a.AbstractC0183a;
import android.os.Handler;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\Q.smali */
public final class Q implements I {

    /* renamed from: a, reason: collision with root package name */
    public long f124a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f125b;

    /* renamed from: c, reason: collision with root package name */
    public Object f126c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f127d;

    /* renamed from: e, reason: collision with root package name */
    public Object f128e;

    public Q(g1.i runnableScheduler, S0.l lVar) {
        kotlin.jvm.internal.i.e(runnableScheduler, "runnableScheduler");
        long millis = TimeUnit.MINUTES.toMillis(90L);
        this.f125b = runnableScheduler;
        this.f126c = lVar;
        this.f124a = millis;
        this.f127d = new Object();
        this.f128e = new LinkedHashMap();
    }

    public void a(K0.l token) {
        Runnable runnable;
        kotlin.jvm.internal.i.e(token, "token");
        synchronized (this.f127d) {
            runnable = (Runnable) ((LinkedHashMap) this.f128e).remove(token);
        }
        if (runnable != null) {
            ((Handler) ((g1.i) this.f125b).f7594b).removeCallbacks(runnable);
        }
    }

    public void b(K0.l lVar) {
        RunnableC0012l runnableC0012l = new RunnableC0012l(12, this, lVar);
        synchronized (this.f127d) {
        }
        g1.i iVar = (g1.i) this.f125b;
        ((Handler) iVar.f7594b).postDelayed(runnableC0012l, this.f124a);
    }

    @Override // A2.I
    public void c(B2.h hVar) {
        d(hVar);
    }

    public void d(B2.h hVar) {
        ((X) this.f125b).y0("INSERT OR REPLACE INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)", AbstractC0156x.C(hVar.f315a), Long.valueOf(j()));
    }

    @Override // A2.I
    public void e(g0 g0Var) {
        ((X) this.f125b).f146d.i(g0Var.b(j()));
    }

    @Override // A2.I
    public void g(B2.h hVar) {
        d(hVar);
    }

    @Override // A2.I
    public long j() {
        AbstractC0183a.N(this.f124a != -1, "Attempting to get a sequence number outside of a transaction", new Object[0]);
        return this.f124a;
    }

    @Override // A2.I
    public void k(B2.h hVar) {
        d(hVar);
    }

    @Override // A2.I
    public void m(B2.h hVar) {
        d(hVar);
    }

    @Override // A2.I
    public void o() {
        AbstractC0183a.N(this.f124a != -1, "Committing a transaction without having started one", new Object[0]);
        this.f124a = -1L;
    }

    @Override // A2.I
    public void q() {
        AbstractC0183a.N(this.f124a == -1, "Starting a transaction without committing the previous one", new Object[0]);
        C0021v c0021v = (C0021v) this.f126c;
        long j5 = c0021v.f254a + 1;
        c0021v.f254a = j5;
        this.f124a = j5;
    }

    @Override // A2.I
    public void r(S0.c cVar) {
        this.f128e = cVar;
    }

    public Q(X x3, C0021v c0021v) {
        this.f124a = -1L;
        this.f125b = x3;
        this.f127d = new C0024y(this, c0021v);
    }
}
