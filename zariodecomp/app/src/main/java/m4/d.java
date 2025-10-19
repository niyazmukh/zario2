package m4;

import f4.A;
import f4.Z;
import java.util.concurrent.Executor;
import k4.u;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m4\d.smali */
public final class d extends Z implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final d f8928c = new d();

    /* renamed from: d, reason: collision with root package name */
    public static final A f8929d;

    static {
        l lVar = l.f8942c;
        int i = u.f8410a;
        if (64 >= i) {
            i = 64;
        }
        f8929d = lVar.n(k4.a.l("kotlinx.coroutines.io.parallelism", i, 0, 0, 12), null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        k(O3.j.f2661a, runnable);
    }

    public final void k(O3.i iVar, Runnable runnable) {
        f8929d.k(iVar, runnable);
    }

    public final void l(O3.i iVar, Runnable runnable) {
        f8929d.l(iVar, runnable);
    }

    @Override // f4.Z
    public final Executor o() {
        return this;
    }

    public final String toString() {
        return "Dispatchers.IO";
    }
}
