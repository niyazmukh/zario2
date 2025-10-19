package B3;

import g2.C0578a;
import g2.C0580c;
import h2.C0593b;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import z3.AbstractC1076E;
import z3.AbstractC1082f;
import z3.AbstractC1083g;
import z3.AbstractC1098w;
import z3.C1079c;
import z3.C1084h;

/* renamed from: B3.k0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\k0.1.smali */
public abstract class AbstractC0056k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f858a = Logger.getLogger(AbstractC0056k0.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final Set f859b = Collections.unmodifiableSet(EnumSet.of(z3.j0.OK, z3.j0.INVALID_ARGUMENT, z3.j0.NOT_FOUND, z3.j0.ALREADY_EXISTS, z3.j0.FAILED_PRECONDITION, z3.j0.ABORTED, z3.j0.OUT_OF_RANGE, z3.j0.DATA_LOSS));

    /* renamed from: c, reason: collision with root package name */
    public static final z3.V f860c;

    /* renamed from: d, reason: collision with root package name */
    public static final z3.V f861d;

    /* renamed from: e, reason: collision with root package name */
    public static final z3.Y f862e;

    /* renamed from: f, reason: collision with root package name */
    public static final z3.V f863f;

    /* renamed from: g, reason: collision with root package name */
    public static final z3.Y f864g;
    public static final z3.V h;
    public static final z3.V i;

    /* renamed from: j, reason: collision with root package name */
    public static final z3.V f865j;

    /* renamed from: k, reason: collision with root package name */
    public static final z3.V f866k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f867l;

    /* renamed from: m, reason: collision with root package name */
    public static final A1 f868m;

    /* renamed from: n, reason: collision with root package name */
    public static final C0580c f869n;

    /* renamed from: o, reason: collision with root package name */
    public static final C0050i0 f870o;

    /* renamed from: p, reason: collision with root package name */
    public static final o2 f871p;

    /* renamed from: q, reason: collision with root package name */
    public static final o2 f872q;

    /* renamed from: r, reason: collision with root package name */
    public static final o2 f873r;

    static {
        Charset.forName("US-ASCII");
        f860c = new z3.V("grpc-timeout", new o2(12));
        C1084h c1084h = z3.a0.f11275d;
        f861d = new z3.V("grpc-encoding", c1084h);
        f862e = AbstractC1076E.a("grpc-accept-encoding", new o2(11));
        f863f = new z3.V("content-encoding", c1084h);
        f864g = AbstractC1076E.a("accept-encoding", new o2(11));
        h = new z3.V("content-length", c1084h);
        i = new z3.V("content-type", c1084h);
        f865j = new z3.V("te", c1084h);
        f866k = new z3.V("user-agent", c1084h);
        C0578a.f7597c.getClass();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f867l = timeUnit.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        timeUnit.toNanos(20L);
        f868m = new A1();
        f869n = new C0580c("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER", 2);
        f870o = new C0050i0();
        f871p = new o2(8);
        f872q = new o2(9);
        f873r = new o2(10);
    }

    public static URI a(String str) {
        S0.f.l(str, "authority");
        try {
            return new URI(null, str, null, null, null);
        } catch (URISyntaxException e5) {
            throw new IllegalArgumentException("Invalid authority: ".concat(str), e5);
        }
    }

    public static void b(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (IOException e5) {
            f858a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e5);
        }
    }

    public static AbstractC1083g[] c(C1079c c1079c, z3.a0 a0Var, int i5, boolean z4) {
        List list = c1079c.f11289e;
        int size = list.size();
        AbstractC1083g[] abstractC1083gArr = new AbstractC1083g[size + 1];
        C1079c c1079c2 = C1079c.i;
        C0593b c0593b = new C0593b(c1079c, i5, z4);
        for (int i6 = 0; i6 < list.size(); i6++) {
            abstractC1083gArr[i6] = ((AbstractC1082f) list.get(i6)).a(c0593b, a0Var);
        }
        abstractC1083gArr[size] = f870o;
        return abstractC1083gArr;
    }

    public static String d(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", null).invoke(inetSocketAddress, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    public static k2.c e(String str) {
        Boolean bool = Boolean.TRUE;
        String.format(Locale.ROOT, str, 0);
        return new k2.c(Executors.defaultThreadFactory(), str, new AtomicLong(0L), bool);
    }

    public static A f(z3.I i5, boolean z4) {
        E e5;
        AbstractC1098w abstractC1098w = i5.f11246a;
        if (abstractC1098w == null) {
            e5 = null;
        } else {
            A0 a02 = (A0) abstractC1098w.e();
            e5 = a02.f368v;
            if (e5 == null) {
                a02.f357k.execute(new s0(a02, 1));
                e5 = null;
            }
        }
        if (e5 != null) {
            I3.q qVar = i5.f11247b;
            return qVar == null ? e5 : new C0038e0(qVar, e5);
        }
        z3.k0 k0Var = i5.f11248c;
        if (!k0Var.e()) {
            if (i5.f11249d) {
                return new C0038e0(h(k0Var), EnumC0094y.f1024c);
            }
            if (!z4) {
                return new C0038e0(h(k0Var), EnumC0094y.f1022a);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static z3.k0 g(int r3) {
        /*
            r0 = 100
            if (r3 < r0) goto Lb
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 >= r0) goto Lb
            z3.j0 r0 = z3.j0.INTERNAL
            goto L37
        Lb:
            r0 = 400(0x190, float:5.6E-43)
            if (r3 == r0) goto L35
            r0 = 401(0x191, float:5.62E-43)
            if (r3 == r0) goto L32
            r0 = 403(0x193, float:5.65E-43)
            if (r3 == r0) goto L2f
            r0 = 404(0x194, float:5.66E-43)
            if (r3 == r0) goto L2c
            r0 = 429(0x1ad, float:6.01E-43)
            if (r3 == r0) goto L29
            r0 = 431(0x1af, float:6.04E-43)
            if (r3 == r0) goto L35
            switch(r3) {
                case 502: goto L29;
                case 503: goto L29;
                case 504: goto L29;
                default: goto L26;
            }
        L26:
            z3.j0 r0 = z3.j0.UNKNOWN
            goto L37
        L29:
            z3.j0 r0 = z3.j0.UNAVAILABLE
            goto L37
        L2c:
            z3.j0 r0 = z3.j0.UNIMPLEMENTED
            goto L37
        L2f:
            z3.j0 r0 = z3.j0.PERMISSION_DENIED
            goto L37
        L32:
            z3.j0 r0 = z3.j0.UNAUTHENTICATED
            goto L37
        L35:
            z3.j0 r0 = z3.j0.INTERNAL
        L37:
            z3.k0 r0 = r0.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "HTTP status code "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            z3.k0 r3 = r0.g(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.AbstractC0056k0.g(int):z3.k0");
    }

    public static z3.k0 h(z3.k0 k0Var) {
        S0.f.h(k0Var != null);
        if (!f859b.contains(k0Var.f11358a)) {
            return k0Var;
        }
        return z3.k0.f11354m.g("Inappropriate status code from control plane: " + k0Var.f11358a + " " + k0Var.f11359b).f(k0Var.f11360c);
    }
}
