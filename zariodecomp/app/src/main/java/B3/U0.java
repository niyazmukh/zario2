package B3;

import A2.C0020u;
import g2.C0580c;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import z3.AbstractC1081e;
import z3.AbstractC1083g;
import z3.AbstractC1098w;
import z3.C1079c;
import z3.C1091o;
import z3.C1092p;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\U0.smali */
public final class U0 extends AbstractC1081e {

    /* renamed from: o, reason: collision with root package name */
    public static final L f555o;

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f556a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f557b;

    /* renamed from: c, reason: collision with root package name */
    public final C1091o f558c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f559d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC1098w f560e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC1081e f561f;

    /* renamed from: g, reason: collision with root package name */
    public z3.k0 f562g;
    public List h;
    public O i;

    /* renamed from: j, reason: collision with root package name */
    public final C1091o f563j;

    /* renamed from: k, reason: collision with root package name */
    public final com.google.android.gms.common.api.internal.F f564k;

    /* renamed from: l, reason: collision with root package name */
    public final C1079c f565l;

    /* renamed from: m, reason: collision with root package name */
    public final long f566m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V0 f567n;

    static {
        Logger.getLogger(U0.class.getName());
        f555o = new L(0);
    }

    public U0(V0 v02, C1091o c1091o, com.google.android.gms.common.api.internal.F f2, C1079c c1079c) {
        ScheduledFuture<?> scheduledFutureSchedule;
        this.f567n = v02;
        Y0 y02 = v02.f576g;
        Logger logger = Y0.f611g0;
        y02.getClass();
        Executor executor = c1079c.f11286b;
        executor = executor == null ? y02.f654k : executor;
        Y0 y03 = v02.f576g;
        W0 w02 = y03.f653j;
        this.h = new ArrayList();
        S0.f.l(executor, "callExecutor");
        this.f557b = executor;
        S0.f.l(w02, "scheduler");
        C1091o c1091oB = C1091o.b();
        this.f558c = c1091oB;
        c1091oB.getClass();
        C1092p c1092p = c1079c.f11285a;
        if (c1092p == null) {
            scheduledFutureSchedule = null;
        } else {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long jC = c1092p.c(timeUnit);
            long jAbs = Math.abs(jC);
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            long nanos = jAbs / timeUnit2.toNanos(1L);
            long jAbs2 = Math.abs(jC) % timeUnit2.toNanos(1L);
            StringBuilder sb = new StringBuilder();
            if (jC < 0) {
                sb.append("ClientCall started after CallOptions deadline was exceeded. Deadline has been exceeded for ");
            } else {
                sb.append("Deadline CallOptions will be exceeded in ");
            }
            sb.append(nanos);
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
            sb.append("s. ");
            scheduledFutureSchedule = w02.f588a.schedule(new I(0, this, sb), jC, timeUnit);
        }
        this.f556a = scheduledFutureSchedule;
        this.f563j = c1091o;
        this.f564k = f2;
        this.f565l = c1079c;
        y03.f644b0.getClass();
        this.f566m = System.nanoTime();
    }

    @Override // z3.AbstractC1081e
    public final void a(String str, Throwable th) {
        z3.k0 k0Var = z3.k0.f11349f;
        z3.k0 k0VarG = str != null ? k0Var.g(str) : k0Var.g("Call cancelled without message");
        if (th != null) {
            k0VarG = k0VarG.f(th);
        }
        f(k0VarG, false);
    }

    @Override // z3.AbstractC1081e
    public final void b() {
        g(new K(this, 0));
    }

    @Override // z3.AbstractC1081e
    public final void c(int i) {
        if (this.f559d) {
            this.f561f.c(i);
        } else {
            g(new RunnableC0040f(this, i, 1));
        }
    }

    @Override // z3.AbstractC1081e
    public final void d(com.google.protobuf.E e5) {
        if (this.f559d) {
            this.f561f.d(e5);
        } else {
            g(new I(2, this, e5));
        }
    }

    @Override // z3.AbstractC1081e
    public final void e(AbstractC1098w abstractC1098w, z3.a0 a0Var) {
        z3.k0 k0Var;
        boolean z4;
        S0.f.q("already started", this.f560e == null);
        synchronized (this) {
            try {
                this.f560e = abstractC1098w;
                k0Var = this.f562g;
                z4 = this.f559d;
                if (!z4) {
                    O o5 = new O(abstractC1098w);
                    this.i = o5;
                    abstractC1098w = o5;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (k0Var != null) {
            this.f557b.execute(new M(this, abstractC1098w, k0Var));
        } else if (z4) {
            this.f561f.e(abstractC1098w, a0Var);
        } else {
            g(new J(this, abstractC1098w, a0Var, 0));
        }
    }

    public final void f(z3.k0 k0Var, boolean z4) {
        AbstractC1098w abstractC1098w;
        synchronized (this) {
            try {
                AbstractC1081e abstractC1081e = this.f561f;
                boolean z5 = true;
                if (abstractC1081e == null) {
                    L l4 = f555o;
                    if (abstractC1081e != null) {
                        z5 = false;
                    }
                    S0.f.p(abstractC1081e, "realCall already set to %s", z5);
                    ScheduledFuture scheduledFuture = this.f556a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f561f = l4;
                    abstractC1098w = this.f560e;
                    this.f562g = k0Var;
                    z5 = false;
                } else if (z4) {
                    return;
                } else {
                    abstractC1098w = null;
                }
                if (z5) {
                    g(new I(1, this, k0Var));
                } else {
                    if (abstractC1098w != null) {
                        this.f557b.execute(new M(this, abstractC1098w, k0Var));
                    }
                    h();
                }
                this.f567n.f576g.f659p.execute(new K(this, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f559d) {
                    runnable.run();
                } else {
                    this.h.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.h     // Catch: java.lang.Throwable -> L24
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            r0 = 0
            r3.h = r0     // Catch: java.lang.Throwable -> L24
            r0 = 1
            r3.f559d = r0     // Catch: java.lang.Throwable -> L24
            B3.O r0 = r3.i     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.f557b
            B3.u r2 = new B3.u
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            r0 = move-exception
            goto L44
        L26:
            java.util.List r1 = r3.h     // Catch: java.lang.Throwable -> L24
            r3.h = r0     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r0 = r1.iterator()
        L2f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2f
        L3f:
            r1.clear()
            r0 = r1
            goto L5
        L44:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.U0.h():void");
    }

    public final void i() {
        C0082u c0082u;
        C1091o c1091oA = this.f563j.a();
        try {
            C1079c c1079c = this.f565l;
            C0580c c0580c = AbstractC1083g.f11307a;
            this.f567n.f576g.f644b0.getClass();
            AbstractC1081e abstractC1081eS = this.f567n.s(this.f564k, c1079c.c(c0580c, Long.valueOf(System.nanoTime() - this.f566m)));
            synchronized (this) {
                try {
                    AbstractC1081e abstractC1081e = this.f561f;
                    if (abstractC1081e != null) {
                        c0082u = null;
                    } else {
                        S0.f.p(abstractC1081e, "realCall already set to %s", abstractC1081e == null);
                        ScheduledFuture scheduledFuture = this.f556a;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        this.f561f = abstractC1081eS;
                        c0082u = new C0082u(this, this.f558c);
                    }
                } finally {
                }
            }
            if (c0082u == null) {
                this.f567n.f576g.f659p.execute(new K(this, 1));
                return;
            }
            Y0 y02 = this.f567n.f576g;
            C1079c c1079c2 = this.f565l;
            y02.getClass();
            Executor executor = c1079c2.f11286b;
            if (executor == null) {
                executor = y02.f654k;
            }
            executor.execute(new I(19, this, c0082u));
        } finally {
            this.f563j.c(c1091oA);
        }
    }

    public final String toString() {
        C0020u c0020uX = r1.d.X(this);
        c0020uX.a(this.f561f, "realCall");
        return c0020uX.toString();
    }
}
