package F2;

import java.lang.Thread;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F2\d.smali */
public final class d implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final b f1690a;

    /* renamed from: b, reason: collision with root package name */
    public final Thread f1691b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f1692c;

    public d(f fVar) {
        this.f1692c = fVar;
        c cVar = new c(this);
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(cVar);
        this.f1691b = threadNewThread;
        threadNewThread.setName("FirestoreWorker");
        threadNewThread.setDaemon(true);
        threadNewThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: F2.a
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                this.f1685a.f1692c.c(th);
            }
        });
        b bVar = new b(this, cVar);
        this.f1690a = bVar;
        bVar.setKeepAliveTime(3L, TimeUnit.SECONDS);
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        this.f1690a.execute(runnable);
    }
}
