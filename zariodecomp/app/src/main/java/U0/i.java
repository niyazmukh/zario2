package U0;

import a.AbstractC0183a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import k2.InterfaceFutureC0659b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\U0\i.smali */
public abstract class i implements InterfaceFutureC0659b {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f3286d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f3287e = Logger.getLogger(i.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC0183a f3288f;

    /* renamed from: k, reason: collision with root package name */
    public static final Object f3289k;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f3290a;

    /* renamed from: b, reason: collision with root package name */
    public volatile d f3291b;

    /* renamed from: c, reason: collision with root package name */
    public volatile h f3292c;

    static {
        AbstractC0183a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(i.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f3288f = gVar;
        if (th != null) {
            f3287e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f3289k = new Object();
    }

    public static void c(i iVar) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            h hVar = iVar.f3292c;
            if (f3288f.p(iVar, hVar, h.f3283c)) {
                while (hVar != null) {
                    Thread thread = hVar.f3284a;
                    if (thread != null) {
                        hVar.f3284a = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.f3285b;
                }
                do {
                    dVar = iVar.f3291b;
                } while (!f3288f.n(iVar, dVar, d.f3272d));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.f3275c;
                    dVar3.f3275c = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.f3275c;
                    Runnable runnable = dVar2.f3273a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        iVar = fVar.f3281a;
                        if (iVar.f3290a == fVar) {
                            if (f3288f.o(iVar, fVar, f(fVar.f3282b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, dVar2.f3274b);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e5) {
            f3287e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e5);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            CancellationException cancellationException = ((a) obj).f3268b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f3271a);
        }
        if (obj == f3289k) {
            return null;
        }
        return obj;
    }

    public static Object f(InterfaceFutureC0659b interfaceFutureC0659b) {
        if (interfaceFutureC0659b instanceof i) {
            Object obj = ((i) interfaceFutureC0659b).f3290a;
            if (!(obj instanceof a)) {
                return obj;
            }
            a aVar = (a) obj;
            return aVar.f3267a ? aVar.f3268b != null ? new a(false, aVar.f3268b) : a.f3266d : obj;
        }
        boolean zIsCancelled = interfaceFutureC0659b.isCancelled();
        if ((!f3286d) && zIsCancelled) {
            return a.f3266d;
        }
        try {
            Object objG = g(interfaceFutureC0659b);
            return objG == null ? f3289k : objG;
        } catch (CancellationException e5) {
            if (zIsCancelled) {
                return new a(false, e5);
            }
            return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC0659b, e5));
        } catch (ExecutionException e6) {
            return new c(e6.getCause());
        } catch (Throwable th) {
            return new c(th);
        }
    }

    public static Object g(InterfaceFutureC0659b interfaceFutureC0659b) {
        Object obj;
        boolean z4 = false;
        while (true) {
            try {
                obj = interfaceFutureC0659b.get();
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
        d dVar = this.f3291b;
        d dVar2 = d.f3272d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f3275c = dVar;
                if (f3288f.n(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f3291b;
                }
            } while (dVar != dVar2);
        }
        d(runnable, executor);
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

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        Object obj = this.f3290a;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        a aVar = f3286d ? new a(z4, new CancellationException("Future.cancel() was called.")) : z4 ? a.f3265c : a.f3266d;
        boolean z5 = false;
        while (true) {
            if (f3288f.o(this, obj, aVar)) {
                c(this);
                if (!(obj instanceof f)) {
                    return true;
                }
                InterfaceFutureC0659b interfaceFutureC0659b = ((f) obj).f3282b;
                if (!(interfaceFutureC0659b instanceof i)) {
                    interfaceFutureC0659b.cancel(z4);
                    return true;
                }
                this = (i) interfaceFutureC0659b;
                obj = this.f3290a;
                if (!(obj == null) && !(obj instanceof f)) {
                    return true;
                }
                z5 = true;
            } else {
                obj = this.f3290a;
                if (!(obj instanceof f)) {
                    return z5;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00a8 -> B:36:0x0074). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.i.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String h() {
        Object obj = this.f3290a;
        if (obj instanceof f) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            InterfaceFutureC0659b interfaceFutureC0659b = ((f) obj).f3282b;
            return B.a.m(sb, interfaceFutureC0659b == this ? "this future" : String.valueOf(interfaceFutureC0659b), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(h hVar) {
        hVar.f3284a = null;
        while (true) {
            h hVar2 = this.f3292c;
            if (hVar2 == h.f3283c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f3285b;
                if (hVar2.f3284a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f3285b = hVar4;
                    if (hVar3.f3284a == null) {
                        break;
                    }
                } else if (!f3288f.p(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3290a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r2 instanceof f)) & (this.f3290a != null);
    }

    public final String toString() {
        String strH;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f3290a instanceof a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                strH = h();
            } catch (RuntimeException e5) {
                strH = "Exception thrown from implementation: " + e5.getClass();
            }
            if (strH != null && !strH.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strH);
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
            Object obj2 = this.f3290a;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return e(obj2);
            }
            h hVar = this.f3292c;
            h hVar2 = h.f3283c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                do {
                    AbstractC0183a abstractC0183a = f3288f;
                    abstractC0183a.a0(hVar3, hVar);
                    if (abstractC0183a.p(this, hVar, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f3290a;
                            } else {
                                i(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return e(obj);
                    }
                    hVar = this.f3292c;
                } while (hVar != hVar2);
            }
            return e(this.f3290a);
        }
        throw new InterruptedException();
    }
}
