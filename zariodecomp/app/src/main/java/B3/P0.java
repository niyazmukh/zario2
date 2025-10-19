package B3;

import a.AbstractC0183a;
import java.util.concurrent.Executor;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\P0.smali */
public final class P0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final K2.c f509a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f510b;

    public P0(K2.c cVar) {
        S0.f.l(cVar, "executorPool");
        this.f509a = cVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Executor executor;
        synchronized (this) {
            try {
                if (this.f510b == null) {
                    Executor executor2 = (Executor) l2.a((k2) this.f509a.b);
                    Executor executor3 = this.f510b;
                    if (executor2 == null) {
                        throw new NullPointerException(AbstractC0183a.U("%s.getObject()", executor3));
                    }
                    this.f510b = executor2;
                }
                executor = this.f510b;
            } catch (Throwable th) {
                throw th;
            }
        }
        executor.execute(runnable);
    }
}
