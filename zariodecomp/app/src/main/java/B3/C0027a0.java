package B3;

import A2.C0009i;
import a.AbstractC0183a;
import g2.AbstractC0584g;
import java.io.IOException;
import java.io.StringReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import z3.AbstractC1080d;
import z3.AbstractC1098w;
import z3.C1094s;

/* renamed from: B3.a0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\a0.1.smali */
public final class C0027a0 extends AbstractC1098w {

    /* renamed from: s, reason: collision with root package name */
    public static final Logger f707s;

    /* renamed from: t, reason: collision with root package name */
    public static final Set f708t;

    /* renamed from: u, reason: collision with root package name */
    public static final boolean f709u;

    /* renamed from: v, reason: collision with root package name */
    public static final boolean f710v;

    /* renamed from: w, reason: collision with root package name */
    public static final boolean f711w;

    /* renamed from: x, reason: collision with root package name */
    public static String f712x;

    /* renamed from: a, reason: collision with root package name */
    public final A1 f713a;

    /* renamed from: b, reason: collision with root package name */
    public final Random f714b = new Random();

    /* renamed from: c, reason: collision with root package name */
    public volatile X f715c = X.f593a;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f716d = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final String f717e;

    /* renamed from: f, reason: collision with root package name */
    public final String f718f;

    /* renamed from: g, reason: collision with root package name */
    public final int f719g;
    public final o2 h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final z3.p0 f720j;

    /* renamed from: k, reason: collision with root package name */
    public final Q1 f721k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f722l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f723m;

    /* renamed from: n, reason: collision with root package name */
    public Executor f724n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f725o;

    /* renamed from: p, reason: collision with root package name */
    public final b2 f726p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f727q;

    /* renamed from: r, reason: collision with root package name */
    public AbstractC1080d f728r;

    static {
        Logger logger = Logger.getLogger(C0027a0.class.getName());
        f707s = logger;
        f708t = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        f709u = Boolean.parseBoolean(property);
        f710v = Boolean.parseBoolean(property2);
        f711w = Boolean.parseBoolean(property3);
        try {
            try {
                try {
                    if (Class.forName("B3.B0", true, C0027a0.class.getClassLoader()).asSubclass(Z.class).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (Exception e5) {
                    logger.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e5);
                }
            } catch (Exception e6) {
                logger.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e6);
            }
        } catch (ClassCastException e7) {
            logger.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e7);
        } catch (ClassNotFoundException e8) {
            logger.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e8);
        }
    }

    public C0027a0(String str, z3.c0 c0Var, o2 o2Var, Q1 q12, boolean z4) throws NumberFormatException {
        S0.f.l(c0Var, "args");
        this.h = o2Var;
        S0.f.l(str, "name");
        URI uriCreate = URI.create("//".concat(str));
        S0.f.e(str, "Invalid DNS name: %s", uriCreate.getHost() != null);
        String authority = uriCreate.getAuthority();
        if (authority == null) {
            throw new NullPointerException(AbstractC0183a.U("nameUri (%s) doesn't have an authority", uriCreate));
        }
        this.f717e = authority;
        this.f718f = uriCreate.getHost();
        if (uriCreate.getPort() == -1) {
            this.f719g = c0Var.f11292a;
        } else {
            this.f719g = uriCreate.getPort();
        }
        A1 a12 = c0Var.f11293b;
        S0.f.l(a12, "proxyDetector");
        this.f713a = a12;
        long nanos = 0;
        if (!z4) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j5 = 30;
            if (property != null) {
                try {
                    j5 = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    f707s.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            nanos = j5 > 0 ? TimeUnit.SECONDS.toNanos(j5) : j5;
        }
        this.i = nanos;
        this.f721k = q12;
        z3.p0 p0Var = c0Var.f11294c;
        S0.f.l(p0Var, "syncContext");
        this.f720j = p0Var;
        P0 p02 = c0Var.f11298g;
        this.f724n = p02;
        this.f725o = p02 == null;
        b2 b2Var = c0Var.f11295d;
        S0.f.l(b2Var, "serviceConfigParser");
        this.f726p = b2Var;
    }

    public static Map r(Map map, Random random, String str) {
        for (Map.Entry entry : map.entrySet()) {
            p1.b.T(entry, "Bad key: %s", f708t.contains(entry.getKey()));
        }
        List listD = D0.d(map, "clientLanguage");
        if (listD != null && !listD.isEmpty()) {
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                if ("java".equalsIgnoreCase((String) it.next())) {
                }
            }
            return null;
        }
        Double dE = D0.e(map, "percentage");
        if (dE != null) {
            int iIntValue = dE.intValue();
            p1.b.T(dE, "Bad percentage: %s", iIntValue >= 0 && iIntValue <= 100);
            if (random.nextInt(100) >= iIntValue) {
                return null;
            }
        }
        List listD2 = D0.d(map, "clientHostname");
        if (listD2 != null && !listD2.isEmpty()) {
            Iterator it2 = listD2.iterator();
            while (it2.hasNext()) {
                if (((String) it2.next()).equals(str)) {
                }
            }
            return null;
        }
        Map mapG = D0.g(map, "serviceConfig");
        if (mapG != null) {
            return mapG;
        }
        throw new B0.c(String.format("key '%s' missing in '%s'", map, "serviceConfig"));
    }

    public static ArrayList s(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("grpc_config=")) {
                String strSubstring = str.substring(12);
                Logger logger = C0.f381a;
                O2.a aVar = new O2.a(new StringReader(strSubstring));
                try {
                    Object objA = C0.a(aVar);
                    if (!(objA instanceof List)) {
                        throw new ClassCastException("wrong type " + objA);
                    }
                    List list2 = (List) objA;
                    D0.a(list2);
                    arrayList.addAll(list2);
                } finally {
                    try {
                        aVar.close();
                    } catch (IOException e5) {
                        logger.log(Level.WARNING, "Failed to close", (Throwable) e5);
                    }
                }
            } else {
                f707s.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            }
        }
        return arrayList;
    }

    @Override // z3.AbstractC1098w
    public final String f() {
        return this.f717e;
    }

    @Override // z3.AbstractC1098w
    public final void k() {
        S0.f.q("not started", this.f728r != null);
        t();
    }

    @Override // z3.AbstractC1098w
    public final void m() {
        if (this.f723m) {
            return;
        }
        this.f723m = true;
        Executor executor = this.f724n;
        if (executor == null || !this.f725o) {
            return;
        }
        l2.b(this.h, executor);
        this.f724n = null;
    }

    @Override // z3.AbstractC1098w
    public final void n(AbstractC1080d abstractC1080d) {
        S0.f.q("already started", this.f728r == null);
        if (this.f725o) {
            this.f724n = (Executor) l2.a(this.h);
        }
        this.f728r = abstractC1080d;
        t();
    }

    public final C0009i q() {
        z3.d0 d0Var;
        z3.d0 d0Var2;
        List listU;
        z3.d0 d0Var3;
        String str = this.f718f;
        C0009i c0009i = new C0009i(5);
        try {
            c0009i.f205c = u();
            if (f711w) {
                List listEmptyList = Collections.emptyList();
                boolean z4 = false;
                if (f709u) {
                    if ("localhost".equalsIgnoreCase(str)) {
                        z4 = f710v;
                    } else if (!str.contains(":")) {
                        boolean z5 = true;
                        for (int i = 0; i < str.length(); i++) {
                            char cCharAt = str.charAt(i);
                            if (cCharAt != '.') {
                                z5 &= cCharAt >= '0' && cCharAt <= '9';
                            }
                        }
                        z4 = !z5;
                    }
                }
                if (z4 && this.f716d.get() != null) {
                    throw new ClassCastException();
                }
                Object d0Var4 = null;
                if (listEmptyList.isEmpty()) {
                    f707s.log(Level.FINE, "No TXT records found for {0}", new Object[]{str});
                } else {
                    Random random = this.f714b;
                    if (f712x == null) {
                        try {
                            f712x = InetAddress.getLocalHost().getHostName();
                        } catch (UnknownHostException e5) {
                            throw new RuntimeException(e5);
                        }
                    }
                    String str2 = f712x;
                    try {
                        Iterator it = s(listEmptyList).iterator();
                        Map mapR = null;
                        while (it.hasNext()) {
                            try {
                                mapR = r((Map) it.next(), random, str2);
                                if (mapR != null) {
                                    break;
                                }
                            } catch (RuntimeException e6) {
                                d0Var = new z3.d0(z3.k0.f11350g.g("failed to pick service config choice").f(e6));
                            }
                        }
                        d0Var = mapR == null ? null : new z3.d0(mapR);
                    } catch (IOException | RuntimeException e7) {
                        d0Var = new z3.d0(z3.k0.f11350g.g("failed to parse TXT records").f(e7));
                    }
                    if (d0Var != null) {
                        z3.k0 k0Var = d0Var.f11302a;
                        if (k0Var != null) {
                            d0Var4 = new z3.d0(k0Var);
                        } else {
                            Map map = (Map) d0Var.f11303b;
                            b2 b2Var = this.f726p;
                            b2Var.getClass();
                            try {
                                q2 q2Var = b2Var.f751d;
                                q2Var.getClass();
                                if (map != null) {
                                    try {
                                        listU = i2.u(i2.p(map));
                                    } catch (RuntimeException e8) {
                                        d0Var3 = new z3.d0(z3.k0.f11350g.g("can't parse load balancer configuration").f(e8));
                                    }
                                } else {
                                    listU = null;
                                }
                                d0Var3 = (listU == null || listU.isEmpty()) ? null : i2.t(listU, (z3.O) q2Var.f952b);
                                if (d0Var3 != null) {
                                    z3.k0 k0Var2 = d0Var3.f11302a;
                                    if (k0Var2 != null) {
                                        d0Var4 = new z3.d0(k0Var2);
                                    } else {
                                        d0Var4 = d0Var3.f11303b;
                                    }
                                }
                                d0Var2 = new z3.d0(C0039e1.a(map, b2Var.f748a, b2Var.f749b, b2Var.f750c, d0Var4));
                            } catch (RuntimeException e9) {
                                d0Var2 = new z3.d0(z3.k0.f11350g.g("failed to parse service config").f(e9));
                            }
                            d0Var4 = d0Var2;
                        }
                    }
                }
                c0009i.f206d = d0Var4;
            }
            return c0009i;
        } catch (Exception e10) {
            c0009i.f204b = z3.k0.f11355n.g("Unable to resolve host " + str).f(e10);
            return c0009i;
        }
    }

    public final void t() {
        if (this.f727q || this.f723m) {
            return;
        }
        if (this.f722l) {
            long j5 = this.i;
            if (j5 != 0 && (j5 <= 0 || this.f721k.a(TimeUnit.NANOSECONDS) <= j5)) {
                return;
            }
        }
        this.f727q = true;
        this.f724n.execute(new I(this, this.f728r));
    }

    public final List u() {
        try {
            try {
                X x3 = this.f715c;
                String str = this.f718f;
                x3.getClass();
                List listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
                ArrayList arrayList = new ArrayList(listUnmodifiableList.size());
                Iterator it = listUnmodifiableList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C1094s(new InetSocketAddress((InetAddress) it.next(), this.f719g)));
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception e5) {
                Object obj = AbstractC0584g.f7604a;
                if (e5 instanceof RuntimeException) {
                    throw ((RuntimeException) e5);
                }
                throw new RuntimeException(e5);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                f707s.log(Level.FINE, "Address resolution failure", (Throwable) null);
            }
            throw th;
        }
    }
}
