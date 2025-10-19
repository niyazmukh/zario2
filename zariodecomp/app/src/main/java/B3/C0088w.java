package B3;

import A2.C0020u;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import k2.EnumC0658a;
import z3.AbstractC1081e;
import z3.AbstractC1098w;
import z3.C1079c;
import z3.C1086j;
import z3.C1091o;
import z3.b0;

/* renamed from: B3.w, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\w.1.smali */
public final class C0088w extends AbstractC1081e {

    /* renamed from: q, reason: collision with root package name */
    public static final Logger f997q = Logger.getLogger(C0088w.class.getName());

    /* renamed from: r, reason: collision with root package name */
    public static final double f998r;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.common.api.internal.F f999a;

    /* renamed from: b, reason: collision with root package name */
    public final J3.c f1000b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f1001c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1002d;

    /* renamed from: e, reason: collision with root package name */
    public final S0.i f1003e;

    /* renamed from: f, reason: collision with root package name */
    public final C1091o f1004f;

    /* renamed from: g, reason: collision with root package name */
    public volatile ScheduledFuture f1005g;
    public final boolean h;
    public C1079c i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC0091x f1006j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f1007k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1008l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1009m;

    /* renamed from: n, reason: collision with root package name */
    public final G f1010n;

    /* renamed from: o, reason: collision with root package name */
    public final ScheduledExecutorService f1011o;

    /* renamed from: p, reason: collision with root package name */
    public z3.r f1012p = z3.r.f11392d;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
        f998r = TimeUnit.SECONDS.toNanos(1L) * 1.0d;
    }

    public C0088w(com.google.android.gms.common.api.internal.F f2, Executor executor, C1079c c1079c, G g3, ScheduledExecutorService scheduledExecutorService, S0.i iVar) {
        C1086j c1086j = C1086j.f11319b;
        this.f999a = f2;
        Object obj = f2.f5569d;
        System.identityHashCode(this);
        J3.b.f2098a.getClass();
        this.f1000b = J3.a.f2096a;
        if (executor == EnumC0658a.f8299a) {
            this.f1001c = new c2();
            this.f1002d = true;
        } else {
            this.f1001c = new f2(executor);
            this.f1002d = false;
        }
        this.f1003e = iVar;
        this.f1004f = C1091o.b();
        b0 b0Var = b0.f11281a;
        b0 b0Var2 = (b0) f2.f5568c;
        this.h = b0Var2 == b0Var || b0Var2 == b0.f11282b;
        this.i = c1079c;
        this.f1010n = g3;
        this.f1011o = scheduledExecutorService;
    }

    @Override // z3.AbstractC1081e
    public final void a(String str, Throwable th) {
        J3.b.c();
        try {
            J3.b.a();
            f(str, th);
            J3.b.f2098a.getClass();
        } catch (Throwable th2) {
            try {
                J3.b.f2098a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // z3.AbstractC1081e
    public final void b() {
        J3.b.c();
        try {
            J3.b.a();
            S0.f.q("Not started", this.f1006j != null);
            S0.f.q("call was cancelled", !this.f1008l);
            S0.f.q("call already half-closed", !this.f1009m);
            this.f1009m = true;
            this.f1006j.m();
            J3.b.f2098a.getClass();
        } catch (Throwable th) {
            try {
                J3.b.f2098a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // z3.AbstractC1081e
    public final void c(int i) {
        J3.b.c();
        try {
            J3.b.a();
            S0.f.q("Not started", this.f1006j != null);
            S0.f.g("Number requested must be non-negative", i >= 0);
            this.f1006j.i(i);
            J3.b.f2098a.getClass();
        } catch (Throwable th) {
            try {
                J3.b.f2098a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // z3.AbstractC1081e
    public final void d(com.google.protobuf.E e5) {
        J3.b.c();
        try {
            J3.b.a();
            h(e5);
            J3.b.f2098a.getClass();
        } catch (Throwable th) {
            try {
                J3.b.f2098a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // z3.AbstractC1081e
    public final void e(AbstractC1098w abstractC1098w, z3.a0 a0Var) {
        J3.b.c();
        try {
            J3.b.a();
            i(abstractC1098w, a0Var);
            J3.b.f2098a.getClass();
        } catch (Throwable th) {
            try {
                J3.b.f2098a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void f(String str, Throwable th) {
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            f997q.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.f1008l) {
            return;
        }
        this.f1008l = true;
        try {
            if (this.f1006j != null) {
                z3.k0 k0Var = z3.k0.f11349f;
                z3.k0 k0VarG = str != null ? k0Var.g(str) : k0Var.g("Call cancelled without message");
                if (th != null) {
                    k0VarG = k0VarG.f(th);
                }
                this.f1006j.h(k0VarG);
            }
            g();
        } catch (Throwable th2) {
            g();
            throw th2;
        }
    }

    public final void g() {
        this.f1004f.getClass();
        ScheduledFuture scheduledFuture = this.f1005g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void h(com.google.protobuf.E e5) {
        S0.f.q("Not started", this.f1006j != null);
        S0.f.q("call was cancelled", !this.f1008l);
        S0.f.q("call was half-closed", !this.f1009m);
        try {
            InterfaceC0091x interfaceC0091x = this.f1006j;
            if (interfaceC0091x instanceof N0) {
                ((N0) interfaceC0091x).v(e5);
            } else {
                interfaceC0091x.j(this.f999a.d(e5));
            }
            if (this.h) {
                return;
            }
            this.f1006j.flush();
        } catch (Error e6) {
            this.f1006j.h(z3.k0.f11349f.g("Client sendMessage() failed with Error"));
            throw e6;
        } catch (RuntimeException e7) {
            this.f1006j.h(z3.k0.f11349f.f(e7).g("Failed to stream message"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(z3.AbstractC1098w r16, z3.a0 r17) {
        /*
            Method dump skipped, instructions count: 797
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.C0088w.i(z3.w, z3.a0):void");
    }

    public final String toString() {
        C0020u c0020uX = r1.d.X(this);
        c0020uX.a(this.f999a, "method");
        return c0020uX.toString();
    }
}
