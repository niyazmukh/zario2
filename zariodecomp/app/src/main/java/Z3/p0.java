package z3;

import java.lang.Thread;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\p0.smali */
public final class p0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f11384a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f11385b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f11386c = new AtomicReference();

    public p0(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f11384a = uncaughtExceptionHandler;
    }

    public final void a() {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        do {
            AtomicReference atomicReference = this.f11386c;
            Thread threadCurrentThread = Thread.currentThread();
            while (!atomicReference.compareAndSet(null, threadCurrentThread)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            while (true) {
                concurrentLinkedQueue = this.f11385b;
                try {
                    Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                    if (runnable == null) {
                        break;
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        this.f11384a.uncaughtException(Thread.currentThread(), th);
                    }
                } catch (Throwable th2) {
                    atomicReference.set(null);
                    throw th2;
                }
            }
            atomicReference.set(null);
        } while (!concurrentLinkedQueue.isEmpty());
    }

    public final void b(Runnable runnable) {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f11385b;
        S0.f.l(runnable, "runnable is null");
        concurrentLinkedQueue.add(runnable);
    }

    public final S0.l c(Runnable runnable, long j5, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        o0 o0Var = new o0(runnable);
        return new S0.l(o0Var, scheduledExecutorService.schedule(new B3.J(this, o0Var, runnable, 11), j5, timeUnit));
    }

    public final void d() {
        S0.f.q("Not called from the SynchronizationContext", Thread.currentThread() == this.f11386c.get());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable);
        a();
    }
}
