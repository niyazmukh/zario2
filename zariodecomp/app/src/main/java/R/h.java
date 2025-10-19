package r;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import k2.InterfaceFutureC0659b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\r.1\h.smali */
public abstract class h implements InterfaceFutureC0659b {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f9557d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f9558e = Logger.getLogger(h.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final p1.b f9559f;

    /* renamed from: k, reason: collision with root package name */
    public static final Object f9560k;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f9561a;

    /* renamed from: b, reason: collision with root package name */
    public volatile d f9562b;

    /* renamed from: c, reason: collision with root package name */
    public volatile g f9563c;

    static {
        p1.b fVar;
        try {
            fVar = new e(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "c"), AtomicReferenceFieldUpdater.newUpdater(h.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            fVar = new f();
        }
        f9559f = fVar;
        if (th != null) {
            f9558e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f9560k = new Object();
    }

    public static void d(h hVar) {
        g gVar;
        d dVar;
        d dVar2;
        d dVar3;
        do {
            gVar = hVar.f9563c;
        } while (!f9559f.j(hVar, gVar, g.f9554c));
        while (true) {
            dVar = null;
            if (gVar == null) {
                break;
            }
            Thread thread = gVar.f9555a;
            if (thread != null) {
                gVar.f9555a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f9556b;
        }
        hVar.c();
        do {
            dVar2 = hVar.f9562b;
        } while (!f9559f.h(hVar, dVar2, d.f9547d));
        while (true) {
            dVar3 = dVar;
            dVar = dVar2;
            if (dVar == null) {
                break;
            }
            dVar2 = dVar.f9550c;
            dVar.f9550c = dVar3;
        }
        while (dVar3 != null) {
            d dVar4 = dVar3.f9550c;
            e(dVar3.f9548a, dVar3.f9549b);
            dVar3 = dVar4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e5) {
            f9558e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e5);
        }
    }

    public static Object f(Object obj) throws ExecutionException {
        if (obj instanceof C0855b) {
            CancellationException cancellationException = ((C0855b) obj).f9546b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).a);
        }
        if (obj == f9560k) {
            return null;
        }
        return obj;
    }

    public static Object g(h hVar) {
        Object obj;
        boolean z4 = false;
        while (true) {
            try {
                obj = hVar.get();
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            } catch (Throwable th) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // k2.InterfaceFutureC0659b
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f9562b;
        d dVar2 = d.f9547d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f9550c = dVar;
                if (f9559f.h(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f9562b;
                }
            } while (dVar != dVar2);
        }
        e(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object objG = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(objG == this ? "this future" : String.valueOf(objG));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e5) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e5.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e6) {
            sb.append("FAILURE, cause=[");
            sb.append(e6.getCause());
            sb.append("]");
        }
    }

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        Object obj = this.f9561a;
        if (obj != null) {
            return false;
        }
        if (!f9559f.i(this, obj, f9557d ? new C0855b(z4, new CancellationException("Future.cancel() was called.")) : z4 ? C0855b.f9543c : C0855b.f9544d)) {
            return false;
        }
        d(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j5, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j5);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f9561a;
        if (obj != null) {
            return f(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            g gVar = this.f9563c;
            g gVar2 = g.f9554c;
            if (gVar != gVar2) {
                g gVar3 = new g();
                do {
                    p1.b bVar = f9559f;
                    bVar.L(gVar3, gVar);
                    if (bVar.j(this, gVar, gVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(gVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f9561a;
                            if (obj2 != null) {
                                return f(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        h(gVar3);
                    } else {
                        gVar = this.f9563c;
                    }
                } while (gVar != gVar2);
            }
            return f(this.f9561a);
        }
        while (nanos > 0) {
            Object obj3 = this.f9561a;
            if (obj3 != null) {
                return f(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strK = "Waited " + j5 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strK2 = B.a.k(strK, " (plus ");
            long j6 = -nanos;
            long jConvert = timeUnit.convert(j6, TimeUnit.NANOSECONDS);
            long nanos2 = j6 - timeUnit.toNanos(jConvert);
            boolean z4 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strK3 = strK2 + jConvert + " " + lowerCase;
                if (z4) {
                    strK3 = B.a.k(strK3, ",");
                }
                strK2 = B.a.k(strK3, " ");
            }
            if (z4) {
                strK2 = strK2 + nanos2 + " nanoseconds ";
            }
            strK = B.a.k(strK2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(B.a.k(strK, " but future completed as timeout expired"));
        }
        throw new TimeoutException(AbstractC0854a.c(strK, " for ", string));
    }

    public final void h(g gVar) {
        gVar.f9555a = null;
        while (true) {
            g gVar2 = this.f9563c;
            if (gVar2 == g.f9554c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f9556b;
                if (gVar2.f9555a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f9556b = gVar4;
                    if (gVar3.f9555a == null) {
                        break;
                    }
                } else if (!f9559f.j(this, gVar2, gVar4)) {
                    break;
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f9561a instanceof C0855b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f9561a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f9561a instanceof C0855b) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e5) {
                str = "Exception thrown from implementation: " + e5.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f9561a;
            if (obj2 != null) {
                return f(obj2);
            }
            g gVar = this.f9563c;
            g gVar2 = g.f9554c;
            if (gVar != gVar2) {
                g gVar3 = new g();
                do {
                    p1.b bVar = f9559f;
                    bVar.L(gVar3, gVar);
                    if (bVar.j(this, gVar, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f9561a;
                            } else {
                                h(gVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    gVar = this.f9563c;
                } while (gVar != gVar2);
            }
            return f(this.f9561a);
        }
        throw new InterruptedException();
    }
}
