package B3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import z3.AbstractC1080d;
import z3.AbstractC1098w;
import z3.C1072A;
import z3.C1084h;
import z3.C1086j;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\Z0.smali */
public final class Z0 extends z3.Q {

    /* renamed from: E, reason: collision with root package name */
    public static final Method f675E;

    /* renamed from: a, reason: collision with root package name */
    public final K2.c f678a;

    /* renamed from: b, reason: collision with root package name */
    public final K2.c f679b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f680c;

    /* renamed from: d, reason: collision with root package name */
    public final z3.g0 f681d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f682e;

    /* renamed from: f, reason: collision with root package name */
    public final String f683f;

    /* renamed from: g, reason: collision with root package name */
    public final String f684g;
    public final z3.r h;
    public final C1086j i;

    /* renamed from: j, reason: collision with root package name */
    public final long f685j;

    /* renamed from: k, reason: collision with root package name */
    public final int f686k;

    /* renamed from: l, reason: collision with root package name */
    public final int f687l;

    /* renamed from: m, reason: collision with root package name */
    public final long f688m;

    /* renamed from: n, reason: collision with root package name */
    public final long f689n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f690o;

    /* renamed from: p, reason: collision with root package name */
    public final C1072A f691p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f692q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f693r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f694s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f695t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f696u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f697v;

    /* renamed from: w, reason: collision with root package name */
    public final h1.i f698w;

    /* renamed from: x, reason: collision with root package name */
    public final g1.i f699x;

    /* renamed from: y, reason: collision with root package name */
    public static final Logger f676y = Logger.getLogger(Z0.class.getName());

    /* renamed from: z, reason: collision with root package name */
    public static final long f677z = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: A, reason: collision with root package name */
    public static final long f671A = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: B, reason: collision with root package name */
    public static final K2.c f672B = new K2.c(AbstractC0056k0.f871p, 5);

    /* renamed from: C, reason: collision with root package name */
    public static final z3.r f673C = z3.r.f11392d;

    /* renamed from: D, reason: collision with root package name */
    public static final C1086j f674D = C1086j.f11319b;

    static {
        Method declaredMethod;
        try {
            Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
            Class cls2 = Boolean.TYPE;
            declaredMethod = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException e5) {
            f676y.log(Level.FINE, "Unable to apply census stats", (Throwable) e5);
            declaredMethod = null;
            f675E = declaredMethod;
        } catch (NoSuchMethodException e6) {
            f676y.log(Level.FINE, "Unable to apply census stats", (Throwable) e6);
            declaredMethod = null;
            f675E = declaredMethod;
        }
        f675E = declaredMethod;
    }

    public Z0(String str, h1.i iVar, g1.i iVar2) {
        z3.g0 g0Var;
        K2.c cVar = f672B;
        this.f678a = cVar;
        this.f679b = cVar;
        this.f680c = new ArrayList();
        Logger logger = z3.g0.f11308d;
        synchronized (z3.g0.class) {
            try {
                if (z3.g0.f11309e == null) {
                    ArrayList arrayList = new ArrayList();
                    try {
                        boolean z4 = b0.a;
                        arrayList.add(b0.class);
                    } catch (ClassNotFoundException e5) {
                        z3.g0.f11308d.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e5);
                    }
                    List<z3.f0> listK = AbstractC1080d.k(z3.f0.class, Collections.unmodifiableList(arrayList), z3.f0.class.getClassLoader(), new C1084h(9));
                    if (listK.isEmpty()) {
                        z3.g0.f11308d.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                    }
                    z3.g0.f11309e = new z3.g0();
                    for (z3.f0 f0Var : listK) {
                        z3.g0.f11308d.fine("Service loader found " + f0Var);
                        z3.g0 g0Var2 = z3.g0.f11309e;
                        synchronized (g0Var2) {
                            S0.f.g("isAvailable() returned false", f0Var.b());
                            g0Var2.f11311b.add(f0Var);
                        }
                    }
                    z3.g0.f11309e.a();
                }
                g0Var = z3.g0.f11309e;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f681d = g0Var;
        this.f682e = new ArrayList();
        this.f684g = "pick_first";
        this.h = f673C;
        this.i = f674D;
        this.f685j = f677z;
        this.f686k = 5;
        this.f687l = 5;
        this.f688m = 16777216L;
        this.f689n = 1048576L;
        this.f690o = true;
        this.f691p = C1072A.f11228e;
        this.f692q = true;
        this.f693r = true;
        this.f694s = true;
        this.f695t = true;
        this.f696u = true;
        this.f697v = true;
        S0.f.l(str, "target");
        this.f683f = str;
        this.f698w = iVar;
        this.f699x = iVar2;
    }

    @Override // z3.Q
    public final z3.P a() {
        SSLSocketFactory sSLSocketFactory;
        Method method;
        C3.g gVar = (C3.g) this.f698w.f7641b;
        boolean z4 = gVar.h != Long.MAX_VALUE;
        int iC = t.h.c(gVar.f1157g);
        if (iC == 0) {
            try {
                if (gVar.f1155e == null) {
                    gVar.f1155e = SSLContext.getInstance("Default", D3.k.f1372d.f1373a).getSocketFactory();
                }
                sSLSocketFactory = gVar.f1155e;
            } catch (GeneralSecurityException e5) {
                throw new RuntimeException("TLS Provider failure", e5);
            }
        } else {
            if (iC != 1) {
                throw new RuntimeException("Unknown negotiation type: ".concat(B.a.v(gVar.f1157g)));
            }
            sSLSocketFactory = null;
        }
        C3.f fVar = new C3.f(gVar.f1153c, gVar.f1154d, sSLSocketFactory, gVar.f1156f, gVar.f1159k, z4, gVar.h, gVar.i, gVar.f1158j, gVar.f1160l, gVar.f1152b);
        o2 o2Var = new o2(7);
        K2.c cVar = new K2.c(AbstractC0056k0.f871p, 5);
        o2 o2Var2 = AbstractC0056k0.f873r;
        ArrayList arrayList = new ArrayList(this.f680c);
        synchronized (AbstractC1098w.class) {
        }
        if (this.f693r && (method = f675E) != null) {
            try {
                if (method.invoke(null, Boolean.valueOf(this.f694s), Boolean.valueOf(this.f695t), Boolean.FALSE, Boolean.valueOf(this.f696u)) != null) {
                    throw new ClassCastException();
                }
            } catch (IllegalAccessException e6) {
                f676y.log(Level.FINE, "Unable to apply census stats", (Throwable) e6);
            } catch (InvocationTargetException e7) {
                f676y.log(Level.FINE, "Unable to apply census stats", (Throwable) e7);
            }
        }
        if (this.f697v) {
            try {
                if (Class.forName("io.grpc.census.InternalCensusTracingAccessor").getDeclaredMethod("getClientInterceptor", null).invoke(null, null) != null) {
                    throw new ClassCastException();
                }
            } catch (ClassNotFoundException e8) {
                f676y.log(Level.FINE, "Unable to apply census stats", (Throwable) e8);
            } catch (IllegalAccessException e9) {
                f676y.log(Level.FINE, "Unable to apply census stats", (Throwable) e9);
            } catch (NoSuchMethodException e10) {
                f676y.log(Level.FINE, "Unable to apply census stats", (Throwable) e10);
            } catch (InvocationTargetException e11) {
                f676y.log(Level.FINE, "Unable to apply census stats", (Throwable) e11);
            }
        }
        return new C0030b1(new Y0(this, fVar, o2Var, cVar, o2Var2, arrayList));
    }
}
