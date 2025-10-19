package B3;

import A2.C0020u;
import a.AbstractC0183a;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import z3.AbstractC1081e;
import z3.C1072A;
import z3.C1075D;
import z3.C1079c;
import z3.C1084h;
import z3.C1086j;
import z3.C1092p;
import z3.EnumC1087k;
import z3.InterfaceC1074C;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\Y0.smali */
public final class Y0 extends z3.P implements InterfaceC1074C {

    /* renamed from: g0, reason: collision with root package name */
    public static final Logger f611g0 = Logger.getLogger(Y0.class.getName());

    /* renamed from: h0, reason: collision with root package name */
    public static final Pattern f612h0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    /* renamed from: i0, reason: collision with root package name */
    public static final z3.k0 f613i0;

    /* renamed from: j0, reason: collision with root package name */
    public static final z3.k0 f614j0;

    /* renamed from: k0, reason: collision with root package name */
    public static final z3.k0 f615k0;

    /* renamed from: l0, reason: collision with root package name */
    public static final C0039e1 f616l0;

    /* renamed from: m0, reason: collision with root package name */
    public static final J0 f617m0;

    /* renamed from: n0, reason: collision with root package name */
    public static final L f618n0;

    /* renamed from: A, reason: collision with root package name */
    public Q0 f619A;

    /* renamed from: B, reason: collision with root package name */
    public volatile z3.K f620B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f621C;

    /* renamed from: D, reason: collision with root package name */
    public final HashSet f622D;

    /* renamed from: E, reason: collision with root package name */
    public LinkedHashSet f623E;

    /* renamed from: F, reason: collision with root package name */
    public final Object f624F;
    public final HashSet G;

    /* renamed from: H, reason: collision with root package name */
    public final S f625H;

    /* renamed from: I, reason: collision with root package name */
    public final S0.n f626I;

    /* renamed from: J, reason: collision with root package name */
    public final AtomicBoolean f627J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f628K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f629L;

    /* renamed from: M, reason: collision with root package name */
    public volatile boolean f630M;

    /* renamed from: N, reason: collision with root package name */
    public final CountDownLatch f631N;

    /* renamed from: O, reason: collision with root package name */
    public final o2 f632O;

    /* renamed from: P, reason: collision with root package name */
    public final S0.i f633P;

    /* renamed from: Q, reason: collision with root package name */
    public final r f634Q;

    /* renamed from: R, reason: collision with root package name */
    public final C0069p f635R;

    /* renamed from: S, reason: collision with root package name */
    public final C1072A f636S;

    /* renamed from: T, reason: collision with root package name */
    public final V0 f637T;

    /* renamed from: U, reason: collision with root package name */
    public C0039e1 f638U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f639V;

    /* renamed from: W, reason: collision with root package name */
    public final boolean f640W;
    public final C0049i X;

    /* renamed from: Y, reason: collision with root package name */
    public final long f641Y;

    /* renamed from: Z, reason: collision with root package name */
    public final long f642Z;

    /* renamed from: a0, reason: collision with root package name */
    public final boolean f643a0;

    /* renamed from: b0, reason: collision with root package name */
    public final C1084h f644b0;

    /* renamed from: c0, reason: collision with root package name */
    public final C0075r0 f645c0;

    /* renamed from: d, reason: collision with root package name */
    public final C1075D f646d;

    /* renamed from: d0, reason: collision with root package name */
    public final G f647d0;

    /* renamed from: e, reason: collision with root package name */
    public final String f648e;

    /* renamed from: e0, reason: collision with root package name */
    public final G1 f649e0;

    /* renamed from: f, reason: collision with root package name */
    public final z3.g0 f650f;

    /* renamed from: f0, reason: collision with root package name */
    public int f651f0;

    /* renamed from: g, reason: collision with root package name */
    public final z3.c0 f652g;
    public final q2 h;
    public final C0066o i;

    /* renamed from: j, reason: collision with root package name */
    public final W0 f653j;

    /* renamed from: k, reason: collision with root package name */
    public final Executor f654k;

    /* renamed from: l, reason: collision with root package name */
    public final K2.c f655l;

    /* renamed from: m, reason: collision with root package name */
    public final P0 f656m;

    /* renamed from: n, reason: collision with root package name */
    public final P0 f657n;

    /* renamed from: o, reason: collision with root package name */
    public final o2 f658o;

    /* renamed from: p, reason: collision with root package name */
    public final z3.p0 f659p;

    /* renamed from: q, reason: collision with root package name */
    public final z3.r f660q;

    /* renamed from: r, reason: collision with root package name */
    public final C1086j f661r;

    /* renamed from: s, reason: collision with root package name */
    public final o2 f662s;

    /* renamed from: t, reason: collision with root package name */
    public final long f663t;

    /* renamed from: u, reason: collision with root package name */
    public final G f664u;

    /* renamed from: v, reason: collision with root package name */
    public final o2 f665v;

    /* renamed from: w, reason: collision with root package name */
    public final V0 f666w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f667x;

    /* renamed from: y, reason: collision with root package name */
    public a2 f668y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f669z;

    static {
        z3.k0 k0Var = z3.k0.f11355n;
        f613i0 = k0Var.g("Channel shutdownNow invoked");
        f614j0 = k0Var.g("Channel shutdown invoked");
        f615k0 = k0Var.g("Subchannel shutdown invoked");
        f616l0 = new C0039e1(null, new HashMap(), new HashMap(), null, null, null);
        f617m0 = new J0();
        f618n0 = new L(1);
    }

    public Y0(Z0 z02, C3.f fVar, o2 o2Var, K2.c cVar, o2 o2Var2, ArrayList arrayList) {
        int i;
        o2 o2Var3 = o2.f930b;
        z3.p0 p0Var = new z3.p0(new M0(this));
        this.f659p = p0Var;
        G g3 = new G();
        g3.f411b = new ArrayList();
        g3.f410a = EnumC1087k.f11344d;
        this.f664u = g3;
        this.f622D = new HashSet(16, 0.75f);
        this.f624F = new Object();
        this.G = new HashSet(1, 0.75f);
        S0.n nVar = new S0.n();
        nVar.f2875d = this;
        nVar.f2872a = new Object();
        nVar.f2873b = new HashSet();
        this.f626I = nVar;
        this.f627J = new AtomicBoolean(false);
        this.f631N = new CountDownLatch(1);
        this.f651f0 = 1;
        this.f638U = f616l0;
        this.f639V = false;
        this.X = new C0049i(1);
        this.f644b0 = C1092p.f11377d;
        InterfaceC0042f1 cVar2 = new K2.c(this, 4);
        this.f645c0 = new C0075r0(this, 1);
        G g5 = new G();
        g5.f411b = this;
        this.f647d0 = g5;
        String str = z02.f683f;
        S0.f.l(str, "target");
        this.f648e = str;
        C1075D c1075d = new C1075D("Channel", str, C1075D.f11233d.incrementAndGet());
        this.f646d = c1075d;
        this.f658o = o2Var3;
        K2.c cVar3 = z02.f678a;
        S0.f.l(cVar3, "executorPool");
        this.f655l = cVar3;
        Executor executor = (Executor) l2.a((k2) cVar3.b);
        S0.f.l(executor, "executor");
        this.f654k = executor;
        K2.c cVar4 = z02.f679b;
        S0.f.l(cVar4, "offloadExecutorPool");
        P0 p02 = new P0(cVar4);
        this.f657n = p02;
        C0066o c0066o = new C0066o(fVar, p02);
        this.i = c0066o;
        W0 w02 = new W0(fVar.f1137d);
        this.f653j = w02;
        r rVar = new r(c1075d, o2Var3.c(), B.a.l("Channel for '", str, "'"));
        this.f634Q = rVar;
        C0069p c0069p = new C0069p(rVar, o2Var3);
        this.f635R = c0069p;
        A1 a12 = AbstractC0056k0.f868m;
        boolean z4 = z02.f690o;
        this.f643a0 = z4;
        q2 q2Var = new q2(z02.f684g);
        this.h = q2Var;
        z3.g0 g0Var = z02.f681d;
        this.f650f = g0Var;
        b2 b2Var = new b2(z4, z02.f686k, z02.f687l, q2Var);
        C3.g gVar = (C3.g) z02.f699x.f7594b;
        int iC = t.h.c(gVar.f1157g);
        if (iC == 0) {
            i = 443;
        } else {
            if (iC != 1) {
                throw new AssertionError(B.a.v(gVar.f1157g).concat(" not handled"));
            }
            i = 80;
        }
        Integer numValueOf = Integer.valueOf(i);
        a12.getClass();
        z3.c0 c0Var = new z3.c0(numValueOf, a12, p0Var, b2Var, w02, c0069p, p02);
        this.f652g = c0Var;
        c0066o.f924a.getClass();
        this.f668y = B(str, g0Var, c0Var, Collections.singleton(InetSocketAddress.class));
        this.f656m = new P0(cVar);
        S s4 = new S(executor, p0Var);
        this.f625H = s4;
        s4.a(cVar2);
        this.f665v = o2Var;
        boolean z5 = z02.f692q;
        this.f640W = z5;
        V0 v02 = new V0(this, this.f668y.f());
        this.f637T = v02;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            S0.f.l(null, "interceptor");
            throw null;
        }
        this.f666w = v02;
        this.f667x = new ArrayList(z02.f682e);
        S0.f.l(o2Var2, "stopwatchSupplier");
        this.f662s = o2Var2;
        long j5 = z02.f685j;
        if (j5 == -1) {
            this.f663t = j5;
        } else {
            S0.f.i(j5 >= Z0.f671A, "invalid idleTimeoutMillis %s", j5);
            this.f663t = z02.f685j;
        }
        this.f649e0 = new G1(new K0(this, 5), p0Var, fVar.f1137d, new Q1(2));
        z3.r rVar2 = z02.h;
        S0.f.l(rVar2, "decompressorRegistry");
        this.f660q = rVar2;
        C1086j c1086j = z02.i;
        S0.f.l(c1086j, "compressorRegistry");
        this.f661r = c1086j;
        this.f642Z = z02.f688m;
        this.f641Y = z02.f689n;
        this.f632O = new o2(14);
        this.f633P = new S0.i(2);
        C1072A c1072a = z02.f691p;
        c1072a.getClass();
        this.f636S = c1072a;
        if (z5) {
            return;
        }
        this.f639V = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [z3.f0] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    public static a2 B(String str, z3.g0 g0Var, z3.c0 c0Var, Collection collection) {
        URI uri;
        ?? r42;
        String str2;
        String str3;
        String str4;
        h2.n nVar;
        h2.n nVar2;
        StringBuilder sb = new StringBuilder();
        C0027a0 c0027a0 = null;
        try {
            uri = new URI(str);
        } catch (URISyntaxException e5) {
            sb.append(e5.getMessage());
            uri = null;
        }
        if (uri == null) {
            r42 = 0;
        } else {
            String scheme = uri.getScheme();
            if (scheme == null) {
                g0Var.getClass();
                r42 = 0;
            } else {
                synchronized (g0Var) {
                    nVar2 = g0Var.f11312c;
                }
                r42 = (z3.f0) nVar2.get(scheme.toLowerCase(Locale.US));
            }
        }
        if (r42 == 0 && !f612h0.matcher(str).matches()) {
            try {
                synchronized (g0Var) {
                    str4 = g0Var.f11310a;
                }
                uri = new URI(str4, "", "/" + str, null);
                String scheme2 = uri.getScheme();
                if (scheme2 == null) {
                    r42 = 0;
                } else {
                    synchronized (g0Var) {
                        nVar = g0Var.f11312c;
                    }
                    r42 = (z3.f0) nVar.get(scheme2.toLowerCase(Locale.US));
                }
            } catch (URISyntaxException e6) {
                throw new IllegalArgumentException(e6);
            }
        }
        if (r42 == 0) {
            if (sb.length() > 0) {
                str3 = " (" + ((Object) sb) + ")";
            } else {
                str3 = "";
            }
            throw new IllegalArgumentException(B.a.l("Could not find a NameResolverProvider for ", str, str3));
        }
        if (collection != null && !collection.containsAll(r42.a())) {
            throw new IllegalArgumentException("Address types of NameResolver '" + uri.getScheme() + "' for '" + str + "' not supported by transport");
        }
        if ("dns".equals(uri.getScheme())) {
            String path = uri.getPath();
            S0.f.l(path, "targetPath");
            if (!path.startsWith("/")) {
                throw new IllegalArgumentException(AbstractC0183a.U("the path component (%s) of the target (%s) must start with '/'", path, uri));
            }
            String strSubstring = path.substring(1);
            uri.getAuthority();
            c0027a0 = new C0027a0(strSubstring, c0Var, AbstractC0056k0.f871p, new Q1(2), b0.a);
        }
        if (c0027a0 != null) {
            o2 o2Var = new o2(7);
            W0 w02 = c0Var.f11296e;
            if (w02 == null) {
                throw new IllegalStateException("ScheduledExecutorService not set in Builder");
            }
            z3.p0 p0Var = c0Var.f11294c;
            return new a2(c0027a0, new C0061m(o2Var, w02, p0Var), p0Var);
        }
        if (sb.length() > 0) {
            str2 = " (" + ((Object) sb) + ")";
        } else {
            str2 = "";
        }
        throw new IllegalArgumentException(B.a.l("cannot create a NameResolver for ", str, str2));
    }

    public static void w(Y0 y02) {
        y02.D(true);
        S s4 = y02.f625H;
        s4.i(null);
        y02.f635R.l(2, "Entering IDLE state");
        y02.f664u.b(EnumC1087k.f11344d);
        Object[] objArr = {y02.f624F, s4};
        C0075r0 c0075r0 = y02.f645c0;
        c0075r0.getClass();
        for (int i = 0; i < 2; i++) {
            if (((Set) c0075r0.f947b).contains(objArr[i])) {
                y02.A();
                return;
            }
        }
    }

    public static void x(Y0 y02) {
        if (y02.f628K) {
            Iterator it = y02.f622D.iterator();
            while (it.hasNext()) {
                A0 a02 = (A0) it.next();
                a02.getClass();
                z3.k0 k0Var = f613i0;
                RunnableC0080t0 runnableC0080t0 = new RunnableC0080t0(a02, k0Var, 0);
                z3.p0 p0Var = a02.f357k;
                p0Var.execute(runnableC0080t0);
                p0Var.execute(new RunnableC0080t0(a02, k0Var, 1));
            }
            Iterator it2 = y02.G.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    public static void y(Y0 y02) {
        if (!y02.f630M && y02.f627J.get() && y02.f622D.isEmpty() && y02.G.isEmpty()) {
            y02.f635R.l(2, "Terminated");
            K2.c cVar = y02.f655l;
            l2.b((k2) cVar.b, y02.f654k);
            P0 p02 = y02.f656m;
            synchronized (p02) {
                Executor executor = p02.f510b;
                if (executor != null) {
                    l2.b((k2) p02.f509a.b, executor);
                    p02.f510b = null;
                }
            }
            P0 p03 = y02.f657n;
            synchronized (p03) {
                Executor executor2 = p03.f510b;
                if (executor2 != null) {
                    l2.b((k2) p03.f509a.b, executor2);
                    p03.f510b = null;
                }
            }
            y02.i.close();
            y02.f630M = true;
            y02.f631N.countDown();
        }
    }

    public final void A() {
        this.f659p.d();
        if (this.f627J.get() || this.f621C) {
            return;
        }
        if (((Set) this.f645c0.f947b).isEmpty()) {
            C();
        } else {
            z(false);
        }
        if (this.f619A != null) {
            return;
        }
        this.f635R.l(2, "Exiting idle mode");
        Q0 q02 = new Q0(this);
        q2 q2Var = this.h;
        q2Var.getClass();
        S0.n nVar = new S0.n();
        nVar.f2875d = q2Var;
        nVar.f2872a = q02;
        z3.O o5 = (z3.O) q2Var.f952b;
        String str = (String) q2Var.f953c;
        z3.N nB = o5.b(str);
        nVar.f2874c = nB;
        if (nB == null) {
            throw new IllegalStateException(B.a.l("Could not find policy '", str, "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."));
        }
        nVar.f2873b = nB.d(q02);
        q02.f518d = nVar;
        this.f619A = q02;
        this.f668y.n(new R0(this, q02, this.f668y));
        this.f669z = true;
    }

    public final void C() {
        long j5 = this.f663t;
        if (j5 == -1) {
            return;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        G1 g12 = this.f649e0;
        g12.getClass();
        long nanos = timeUnit.toNanos(j5);
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jA = g12.f424d.a(timeUnit2) + nanos;
        g12.f426f = true;
        if (jA - g12.f425e < 0 || g12.f427g == null) {
            ScheduledFuture scheduledFuture = g12.f427g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            g12.f427g = g12.f421a.schedule(new F1(g12, 1), nanos, timeUnit2);
        }
        g12.f425e = jA;
    }

    public final void D(boolean z4) {
        this.f659p.d();
        if (z4) {
            S0.f.q("nameResolver is not started", this.f669z);
            S0.f.q("lbHelper is null", this.f619A != null);
        }
        a2 a2Var = this.f668y;
        if (a2Var != null) {
            a2Var.m();
            this.f669z = false;
            if (z4) {
                String str = this.f648e;
                z3.g0 g0Var = this.f650f;
                z3.c0 c0Var = this.f652g;
                this.i.f924a.getClass();
                this.f668y = B(str, g0Var, c0Var, Collections.singleton(InetSocketAddress.class));
            } else {
                this.f668y = null;
            }
        }
        Q0 q02 = this.f619A;
        if (q02 != null) {
            S0.n nVar = q02.f518d;
            ((z3.M) nVar.f2873b).f();
            nVar.f2873b = null;
            this.f619A = null;
        }
        this.f620B = null;
    }

    @Override // z3.InterfaceC1074C
    public final C1075D c() {
        return this.f646d;
    }

    @Override // z3.AbstractC1080d
    public final AbstractC1081e n(com.google.android.gms.common.api.internal.F f2, C1079c c1079c) {
        return this.f666w.n(f2, c1079c);
    }

    @Override // z3.P
    public final void s() {
        this.f659p.execute(new K0(this, 1));
    }

    @Override // z3.P
    public final EnumC1087k t() {
        EnumC1087k enumC1087k = (EnumC1087k) this.f664u.f410a;
        if (enumC1087k == null) {
            throw new UnsupportedOperationException("Channel state API is not implemented");
        }
        if (enumC1087k == EnumC1087k.f11344d) {
            this.f659p.execute(new K0(this, 2));
        }
        return enumC1087k;
    }

    public final String toString() {
        C0020u c0020uX = r1.d.X(this);
        c0020uX.b("logId", this.f646d.f11236c);
        c0020uX.a(this.f648e, "target");
        return c0020uX.toString();
    }

    @Override // z3.P
    public final void u(EnumC1087k enumC1087k, E2.s sVar) {
        this.f659p.execute(new J(this, sVar, enumC1087k, 2));
    }

    @Override // z3.P
    public final z3.P v() {
        C0069p c0069p = this.f635R;
        c0069p.l(1, "shutdownNow() called");
        c0069p.l(1, "shutdown() called");
        boolean zCompareAndSet = this.f627J.compareAndSet(false, true);
        V0 v02 = this.f637T;
        z3.p0 p0Var = this.f659p;
        if (zCompareAndSet) {
            p0Var.execute(new K0(this, 3));
            v02.f576g.f659p.execute(new T0(v02, 0));
            p0Var.execute(new K0(this, 0));
        }
        v02.f576g.f659p.execute(new T0(v02, 1));
        p0Var.execute(new K0(this, 4));
        return this;
    }

    public final void z(boolean z4) {
        ScheduledFuture scheduledFuture;
        G1 g12 = this.f649e0;
        g12.f426f = false;
        if (!z4 || (scheduledFuture = g12.f427g) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        g12.f427g = null;
    }
}
