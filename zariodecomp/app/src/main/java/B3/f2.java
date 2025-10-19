package B3;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\f2.smali */
public final class f2 implements Executor, Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f804d = Logger.getLogger(f2.class.getName());

    /* renamed from: e, reason: collision with root package name */
    public static final i2 f805e;

    /* renamed from: a, reason: collision with root package name */
    public final Executor f806a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f807b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public volatile int f808c = 0;

    static {
        i2 e2Var;
        try {
            e2Var = new d2(AtomicIntegerFieldUpdater.newUpdater(f2.class, "c"));
        } catch (Throwable th) {
            f804d.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            e2Var = new e2();
        }
        f805e = e2Var;
    }

    public f2(Executor executor) {
        S0.f.l(executor, "'executor' must not be null.");
        this.f806a = executor;
    }

    public final void a(Runnable runnable) {
        i2 i2Var = f805e;
        if (i2Var.r(this)) {
            try {
                this.f806a.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.f807b.remove(runnable);
                }
                i2Var.s(this);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f807b;
        S0.f.l(runnable, "'r' must not be null.");
        concurrentLinkedQueue.add(runnable);
        a(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        i2 i2Var = f805e;
        while (true) {
            concurrentLinkedQueue = this.f807b;
            try {
                Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                if (runnable == null) {
                    break;
                }
                try {
                    runnable.run();
                } catch (RuntimeException e5) {
                    f804d.log(Level.SEVERE, "Exception while executing runnable " + runnable, (Throwable) e5);
                }
            } catch (Throwable th) {
                i2Var.s(this);
                throw th;
            }
        }
        i2Var.s(this);
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        a(null);
    }
}
