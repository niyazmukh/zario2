package f4;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: f4.a0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\a0.1.smali */
public final class C0495a0 extends Z implements J {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f7046c;

    public C0495a0(Executor executor) {
        this.f7046c = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // f4.J
    public final P a(long j5, E0 e02, O3.i iVar) {
        Executor executor = this.f7046c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(e02, j5, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e5) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e5);
                InterfaceC0506g0 interfaceC0506g0 = (InterfaceC0506g0) iVar.get(B.f7000b);
                if (interfaceC0506g0 != null) {
                    interfaceC0506g0.cancel(cancellationException);
                }
            }
        }
        return scheduledFutureSchedule != null ? new O(scheduledFutureSchedule) : F.f7017n.a(j5, e02, iVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f7046c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // f4.J
    public final void e(long j5, C0516n c0516n) {
        Executor executor = this.f7046c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(new A3.a(13, this, c0516n, false), j5, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e5) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e5);
                InterfaceC0506g0 interfaceC0506g0 = (InterfaceC0506g0) c0516n.f7082e.get(B.f7000b);
                if (interfaceC0506g0 != null) {
                    interfaceC0506g0.cancel(cancellationException);
                }
            }
        }
        if (scheduledFutureSchedule != null) {
            c0516n.v(new C0511j(scheduledFutureSchedule, 0));
        } else {
            F.f7017n.e(j5, c0516n);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0495a0) && ((C0495a0) obj).f7046c == this.f7046c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f7046c);
    }

    public final void k(O3.i iVar, Runnable runnable) {
        try {
            this.f7046c.execute(runnable);
        } catch (RejectedExecutionException e5) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e5);
            InterfaceC0506g0 interfaceC0506g0 = (InterfaceC0506g0) iVar.get(B.f7000b);
            if (interfaceC0506g0 != null) {
                interfaceC0506g0.cancel(cancellationException);
            }
            m4.e eVar = N.f7027a;
            m4.d.f8928c.k(iVar, runnable);
        }
    }

    @Override // f4.Z
    public final Executor o() {
        return this.f7046c;
    }

    public final String toString() {
        return this.f7046c.toString();
    }
}
