package F2;

import A2.RunnableC0012l;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F2\r.smali */
public final class r implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f1734a;

    /* renamed from: b, reason: collision with root package name */
    public final Semaphore f1735b = new Semaphore(4);

    public r(Executor executor) {
        this.f1734a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (!this.f1735b.tryAcquire()) {
            runnable.run();
            return;
        }
        try {
            this.f1734a.execute(new RunnableC0012l(9, this, runnable));
        } catch (RejectedExecutionException unused) {
            runnable.run();
        }
    }
}
