package F2;

import A2.RunnableC0012l;
import f4.A;
import f4.M;
import f4.N;
import f4.Z;
import java.util.concurrent.Executor;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F2\j.smali */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final Executor f1710b;

    /* renamed from: a, reason: collision with root package name */
    public i f1711a = new h();

    static {
        Executor m5;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        if (iAvailableProcessors < 2) {
            iAvailableProcessors = 2;
        }
        m4.e eVar = N.f7027a;
        m4.d.f8928c.getClass();
        A aN = m4.l.f8942c.n(iAvailableProcessors, "firestore.BackgroundQueue");
        Z z4 = aN instanceof Z ? (Z) aN : null;
        if (z4 == null || (m5 = z4.o()) == null) {
            m5 = new M(aN);
        }
        f1710b = m5;
    }

    public final void a() {
        i iVar = this.f1711a;
        if (!(iVar instanceof h)) {
            throw new IllegalStateException("drain() may not be called more than once");
        }
        this.f1711a = g.f1707a;
        h hVar = (h) iVar;
        hVar.f1708a.acquire(hVar.f1709b);
    }

    public final void b(Runnable runnable) {
        i iVar = this.f1711a;
        if (!(iVar instanceof h)) {
            throw new IllegalStateException("submit() may not be called after drain()");
        }
        ((h) iVar).f1709b++;
        f1710b.execute(new RunnableC0012l(7, runnable, iVar));
    }
}
