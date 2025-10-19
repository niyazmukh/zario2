package F2;

import A2.C0009i;
import A2.RunnableC0005e;
import A2.RunnableC0012l;
import a.AbstractC0183a;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F2\f.smali */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1706c = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1705b = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public final d f1704a = new d(this);

    public final C0009i a(e eVar, long j5, Runnable runnable) {
        ScheduledFuture<?> scheduledFutureSchedule;
        if (this.f1706c.contains(eVar)) {
            j5 = 0;
        }
        System.currentTimeMillis();
        C0009i c0009i = new C0009i(8, (Object) this, (Object) runnable, false);
        d dVar = this.f1704a;
        RunnableC0005e runnableC0005e = new RunnableC0005e(c0009i, 9);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (dVar) {
            scheduledFutureSchedule = dVar.f1690a.schedule(runnableC0005e, j5, timeUnit);
        }
        c0009i.f205c = scheduledFutureSchedule;
        this.f1705b.add(c0009i);
        return c0009i;
    }

    public final void b(Runnable runnable) {
        E2.r rVar = new E2.r(runnable, 1);
        d dVar = this.f1704a;
        dVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        try {
            dVar.execute(new RunnableC0012l(6, taskCompletionSource, rVar));
        } catch (RejectedExecutionException unused) {
            p1.b.p(2, f.class.getSimpleName(), "Refused to enqueue task after panic", new Object[0]);
        }
        taskCompletionSource.getTask();
    }

    public final void c(Throwable th) {
        this.f1704a.f1690a.shutdownNow();
        new Handler(Looper.getMainLooper()).post(new RunnableC0005e(th, 8));
    }

    public final void d() {
        Thread threadCurrentThread = Thread.currentThread();
        d dVar = this.f1704a;
        Thread thread = dVar.f1691b;
        if (thread == threadCurrentThread) {
            return;
        }
        AbstractC0183a.z("We are running on the wrong thread. Expected to be on the AsyncQueue thread %s/%d but was %s/%d", thread.getName(), Long.valueOf(dVar.f1691b.getId()), threadCurrentThread.getName(), Long.valueOf(threadCurrentThread.getId()));
        throw null;
    }
}
