package B3;

import N2.AbstractC0156x;
import a.AbstractC0183a;
import h2.AbstractC0592a;
import h2.C0593b;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import z3.AbstractC1080d;
import z3.AbstractC1098w;
import z3.C1088l;
import z3.C1094s;
import z3.EnumC1087k;

/* renamed from: B3.t1, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\t1.1.smali */
public final class C0081t1 extends z3.M {

    /* renamed from: o, reason: collision with root package name */
    public static final Logger f976o = Logger.getLogger(C0081t1.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC1080d f977f;
    public C0092x0 h;

    /* renamed from: k, reason: collision with root package name */
    public S0.l f980k;

    /* renamed from: l, reason: collision with root package name */
    public EnumC1087k f981l;

    /* renamed from: m, reason: collision with root package name */
    public EnumC1087k f982m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f983n;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f978g = new HashMap();
    public int i = 0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f979j = true;

    public C0081t1(AbstractC1080d abstractC1080d) {
        boolean z4 = false;
        EnumC1087k enumC1087k = EnumC1087k.f11344d;
        this.f981l = enumC1087k;
        this.f982m = enumC1087k;
        Logger logger = AbstractC0056k0.f858a;
        String property = System.getenv("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS");
        property = property == null ? System.getProperty("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS") : property;
        if (!AbstractC0183a.R(property) && Boolean.parseBoolean(property)) {
            z4 = true;
        }
        this.f983n = z4;
        this.f977f = abstractC1080d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z3.M
    public final z3.k0 a(z3.J j5) {
        List listEmptyList;
        EnumC1087k enumC1087k;
        if (this.f981l == EnumC1087k.f11345e) {
            return z3.k0.f11353l.g("Already shut down");
        }
        List list = j5.f11250a;
        boolean zIsEmpty = list.isEmpty();
        Object obj = j5.f11251b;
        if (zIsEmpty) {
            z3.k0 k0VarG = z3.k0.f11355n.g("NameResolver returned no usable address. addrs=" + list + ", attrs=" + obj);
            c(k0VarG);
            return k0VarG;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C1094s) it.next()) == null) {
                z3.k0 k0VarG2 = z3.k0.f11355n.g("NameResolver returned address list with null endpoint. addrs=" + list + ", attrs=" + obj);
                c(k0VarG2);
                return k0VarG2;
            }
        }
        this.f979j = true;
        h2.c cVar = h2.e.f7669b;
        C0593b c0593b = new C0593b();
        AbstractC0156x.h(4, "initialCapacity");
        c0593b.f7662d = new Object[4];
        c0593b.f7661c = 0;
        c0593b.f(list.size());
        if (list instanceof AbstractC0592a) {
            c0593b.f7661c = ((AbstractC0592a) list).g(c0593b.f7661c, (Object[]) c0593b.f7662d);
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                c0593b.d(it2.next());
            }
        }
        c0593b.f7660b = true;
        h2.i iVarL = h2.e.l(c0593b.f7661c, (Object[]) c0593b.f7662d);
        C0092x0 c0092x0 = this.h;
        EnumC1087k enumC1087k2 = EnumC1087k.f11342b;
        if (c0092x0 == null) {
            C0092x0 c0092x02 = new C0092x0();
            c0092x02.f1017a = iVarL != null ? iVarL : Collections.emptyList();
            this.h = c0092x02;
        } else if (this.f981l == enumC1087k2) {
            SocketAddress socketAddressA = c0092x0.a();
            C0092x0 c0092x03 = this.h;
            if (iVarL != null) {
                listEmptyList = iVarL;
            } else {
                c0092x03.getClass();
                listEmptyList = Collections.emptyList();
            }
            c0092x03.f1017a = listEmptyList;
            c0092x03.f1018b = 0;
            c0092x03.f1019c = 0;
            if (this.h.e(socketAddressA)) {
                return z3.k0.f11348e;
            }
            C0092x0 c0092x04 = this.h;
            c0092x04.f1018b = 0;
            c0092x04.f1019c = 0;
        } else {
            c0092x0.f1017a = iVarL != null ? iVarL : Collections.emptyList();
            c0092x0.f1018b = 0;
            c0092x0.f1019c = 0;
        }
        HashMap map = this.f978g;
        HashSet hashSet = new HashSet(map.keySet());
        HashSet hashSet2 = new HashSet();
        h2.c cVarListIterator = iVarL.listIterator(0);
        while (cVarListIterator.hasNext()) {
            hashSet2.addAll(((C1094s) cVarListIterator.next()).f11399a);
        }
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            SocketAddress socketAddress = (SocketAddress) it3.next();
            if (!hashSet2.contains(socketAddress)) {
                ((C0078s1) map.remove(socketAddress)).f966a.m();
            }
        }
        int size = hashSet.size();
        EnumC1087k enumC1087k3 = EnumC1087k.f11341a;
        if (size == 0 || (enumC1087k = this.f981l) == enumC1087k3 || enumC1087k == enumC1087k2) {
            this.f981l = enumC1087k3;
            i(enumC1087k3, new C0074q1(z3.I.f11245e));
            g();
            e();
        } else {
            EnumC1087k enumC1087k4 = EnumC1087k.f11344d;
            if (enumC1087k == enumC1087k4) {
                i(enumC1087k4, new C0076r1(this, this));
            } else if (enumC1087k == EnumC1087k.f11343c) {
                g();
                e();
            }
        }
        return z3.k0.f11348e;
    }

    @Override // z3.M
    public final void c(z3.k0 k0Var) {
        HashMap map = this.f978g;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C0078s1) it.next()).f966a.m();
        }
        map.clear();
        i(EnumC1087k.f11343c, new C0074q1(z3.I.a(k0Var)));
    }

    @Override // z3.M
    public final void e() {
        AbstractC1098w abstractC1098w;
        C0092x0 c0092x0 = this.h;
        if (c0092x0 == null || !c0092x0.c() || this.f981l == EnumC1087k.f11345e) {
            return;
        }
        SocketAddress socketAddressA = this.h.a();
        HashMap map = this.f978g;
        boolean zContainsKey = map.containsKey(socketAddressA);
        Logger logger = f976o;
        if (zContainsKey) {
            abstractC1098w = ((C0078s1) map.get(socketAddressA)).f966a;
        } else {
            C0071p1 c0071p1 = new C0071p1(this);
            z3.H hD = z3.H.d();
            C1094s[] c1094sArr = {new C1094s(socketAddressA)};
            AbstractC0156x.h(1, "arraySize");
            long j5 = 1 + 5 + 0;
            ArrayList arrayList = new ArrayList(j5 > 2147483647L ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : j5 < -2147483648L ? Integer.MIN_VALUE : (int) j5);
            Collections.addAll(arrayList, c1094sArr);
            hD.e(arrayList);
            hD.a(c0071p1);
            final AbstractC1098w abstractC1098wG = this.f977f.g(hD.b());
            if (abstractC1098wG == null) {
                logger.warning("Was not able to create subchannel for " + socketAddressA);
                throw new IllegalStateException("Can't create subchannel");
            }
            C0078s1 c0078s1 = new C0078s1(abstractC1098wG, c0071p1);
            c0071p1.f942b = c0078s1;
            map.put(socketAddressA, c0078s1);
            if (abstractC1098wG.c().f11280a.get(z3.M.f11255d) == null) {
                c0071p1.f941a = C1088l.a(EnumC1087k.f11342b);
            }
            abstractC1098wG.o(new z3.L() { // from class: B3.o1
                @Override // z3.L
                public final void a(C1088l c1088l) {
                    AbstractC1098w abstractC1098w2;
                    C0081t1 c0081t1 = this.f928a;
                    c0081t1.getClass();
                    EnumC1087k enumC1087k = c1088l.f11361a;
                    HashMap map2 = c0081t1.f978g;
                    AbstractC1098w abstractC1098w3 = abstractC1098wG;
                    C0078s1 c0078s12 = (C0078s1) map2.get((SocketAddress) abstractC1098w3.a().f11399a.get(0));
                    if (c0078s12 == null || (abstractC1098w2 = c0078s12.f966a) != abstractC1098w3 || enumC1087k == EnumC1087k.f11345e) {
                        return;
                    }
                    EnumC1087k enumC1087k2 = EnumC1087k.f11344d;
                    AbstractC1080d abstractC1080d = c0081t1.f977f;
                    if (enumC1087k == enumC1087k2) {
                        abstractC1080d.q();
                    }
                    C0078s1.a(c0078s12, enumC1087k);
                    EnumC1087k enumC1087k3 = c0081t1.f981l;
                    EnumC1087k enumC1087k4 = EnumC1087k.f11343c;
                    EnumC1087k enumC1087k5 = EnumC1087k.f11341a;
                    if (enumC1087k3 == enumC1087k4 || c0081t1.f982m == enumC1087k4) {
                        if (enumC1087k == enumC1087k5) {
                            return;
                        }
                        if (enumC1087k == enumC1087k2) {
                            c0081t1.e();
                            return;
                        }
                    }
                    int iOrdinal = enumC1087k.ordinal();
                    if (iOrdinal == 0) {
                        c0081t1.f981l = enumC1087k5;
                        c0081t1.i(enumC1087k5, new C0074q1(z3.I.f11245e));
                        return;
                    }
                    if (iOrdinal == 1) {
                        c0081t1.g();
                        for (C0078s1 c0078s13 : map2.values()) {
                            if (!c0078s13.f966a.equals(abstractC1098w2)) {
                                c0078s13.f966a.m();
                            }
                        }
                        map2.clear();
                        EnumC1087k enumC1087k6 = EnumC1087k.f11342b;
                        C0078s1.a(c0078s12, enumC1087k6);
                        map2.put((SocketAddress) abstractC1098w2.a().f11399a.get(0), c0078s12);
                        c0081t1.h.e((SocketAddress) abstractC1098w3.a().f11399a.get(0));
                        c0081t1.f981l = enumC1087k6;
                        c0081t1.j(c0078s12);
                        return;
                    }
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            throw new IllegalArgumentException("Unsupported state:" + enumC1087k);
                        }
                        C0092x0 c0092x02 = c0081t1.h;
                        c0092x02.f1018b = 0;
                        c0092x02.f1019c = 0;
                        c0081t1.f981l = enumC1087k2;
                        c0081t1.i(enumC1087k2, new C0076r1(c0081t1, c0081t1));
                        return;
                    }
                    if (c0081t1.h.c() && ((C0078s1) map2.get(c0081t1.h.a())).f966a == abstractC1098w3 && c0081t1.h.b()) {
                        c0081t1.g();
                        c0081t1.e();
                    }
                    C0092x0 c0092x03 = c0081t1.h;
                    if (c0092x03 == null || c0092x03.c()) {
                        return;
                    }
                    int size = map2.size();
                    List list = c0081t1.h.f1017a;
                    if (size < (list != null ? list.size() : 0)) {
                        return;
                    }
                    Iterator it = map2.values().iterator();
                    while (it.hasNext()) {
                        if (!((C0078s1) it.next()).f969d) {
                            return;
                        }
                    }
                    c0081t1.f981l = enumC1087k4;
                    c0081t1.i(enumC1087k4, new C0074q1(z3.I.a(c1088l.f11362b)));
                    int i = c0081t1.i + 1;
                    c0081t1.i = i;
                    List list2 = c0081t1.h.f1017a;
                    if (i >= (list2 != null ? list2.size() : 0) || c0081t1.f979j) {
                        c0081t1.f979j = false;
                        c0081t1.i = 0;
                        abstractC1080d.q();
                    }
                }
            });
            abstractC1098w = abstractC1098wG;
        }
        int iOrdinal = ((C0078s1) map.get(socketAddressA)).f967b.ordinal();
        if (iOrdinal == 0) {
            if (this.f983n) {
                h();
                return;
            } else {
                abstractC1098w.l();
                return;
            }
        }
        if (iOrdinal == 1) {
            logger.warning("Requesting a connection even though we have a READY subchannel");
            return;
        }
        if (iOrdinal == 2) {
            this.h.b();
            e();
        } else {
            if (iOrdinal != 3) {
                return;
            }
            abstractC1098w.l();
            C0078s1.a((C0078s1) map.get(socketAddressA), EnumC1087k.f11341a);
            h();
        }
    }

    @Override // z3.M
    public final void f() {
        Level level = Level.FINE;
        HashMap map = this.f978g;
        f976o.log(level, "Shutting down, currently have {} subchannels created", Integer.valueOf(map.size()));
        EnumC1087k enumC1087k = EnumC1087k.f11345e;
        this.f981l = enumC1087k;
        this.f982m = enumC1087k;
        g();
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C0078s1) it.next()).f966a.m();
        }
        map.clear();
    }

    public final void g() {
        S0.l lVar = this.f980k;
        if (lVar != null) {
            lVar.i();
            this.f980k = null;
        }
    }

    public final void h() {
        if (this.f983n) {
            S0.l lVar = this.f980k;
            if (lVar != null) {
                z3.o0 o0Var = (z3.o0) lVar.f2867b;
                if (!o0Var.f11376c && !o0Var.f11375b) {
                    return;
                }
            }
            AbstractC1080d abstractC1080d = this.f977f;
            this.f980k = abstractC1080d.j().c(new N(this, 6), 250L, TimeUnit.MILLISECONDS, abstractC1080d.i());
        }
    }

    public final void i(EnumC1087k enumC1087k, z3.K k5) {
        if (enumC1087k == this.f982m && (enumC1087k == EnumC1087k.f11344d || enumC1087k == EnumC1087k.f11341a)) {
            return;
        }
        this.f982m = enumC1087k;
        this.f977f.r(enumC1087k, k5);
    }

    public final void j(C0078s1 c0078s1) {
        EnumC1087k enumC1087k = c0078s1.f967b;
        EnumC1087k enumC1087k2 = EnumC1087k.f11342b;
        if (enumC1087k != enumC1087k2) {
            return;
        }
        C1088l c1088l = c0078s1.f968c.f941a;
        EnumC1087k enumC1087k3 = c1088l.f11361a;
        if (enumC1087k3 == enumC1087k2) {
            i(enumC1087k2, new C0090w1(z3.I.b(c0078s1.f966a, null), 1));
            return;
        }
        EnumC1087k enumC1087k4 = EnumC1087k.f11343c;
        if (enumC1087k3 == enumC1087k4) {
            i(enumC1087k4, new C0074q1(z3.I.a(c1088l.f11362b)));
        } else if (this.f982m != enumC1087k4) {
            i(enumC1087k3, new C0074q1(z3.I.f11245e));
        }
    }
}
