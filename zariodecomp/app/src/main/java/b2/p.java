package B2;

import F2.s;
import N2.C;
import N2.E;
import N2.InterfaceC0139c;
import N2.m0;
import N2.n0;
import a.AbstractC0183a;
import com.google.protobuf.A0;
import com.google.protobuf.AbstractC0409l;
import com.google.protobuf.B0;
import com.google.protobuf.C0407k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B2\p.smali */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final n0 f335a;

    /* renamed from: b, reason: collision with root package name */
    public static final n0 f336b;

    /* renamed from: c, reason: collision with root package name */
    public static final n0 f337c;

    /* renamed from: d, reason: collision with root package name */
    public static final n0 f338d;

    /* renamed from: e, reason: collision with root package name */
    public static final n0 f339e;

    /* renamed from: f, reason: collision with root package name */
    public static final n0 f340f;

    /* renamed from: g, reason: collision with root package name */
    public static final n0 f341g;
    public static final n0 h;
    public static final n0 i;

    /* renamed from: j, reason: collision with root package name */
    public static final n0 f342j;

    /* renamed from: k, reason: collision with root package name */
    public static final n0 f343k;

    /* renamed from: l, reason: collision with root package name */
    public static final n0 f344l;

    /* renamed from: m, reason: collision with root package name */
    public static final n0 f345m;

    /* renamed from: n, reason: collision with root package name */
    public static final n0 f346n;

    /* renamed from: o, reason: collision with root package name */
    public static final n0 f347o;

    /* renamed from: p, reason: collision with root package name */
    public static final n0 f348p;

    static {
        m0 m0VarT = n0.T();
        m0VarT.g(Double.NaN);
        f335a = (n0) m0VarT.b();
        m0 m0VarT2 = n0.T();
        m0VarT2.d();
        n0.C((n0) m0VarT2.f6410b);
        n0 n0Var = (n0) m0VarT2.b();
        f336b = n0Var;
        f337c = n0Var;
        m0 m0VarT3 = n0.T();
        m0VarT3.j("__max__");
        n0 n0Var2 = (n0) m0VarT3.b();
        f338d = n0Var2;
        m0 m0VarT4 = n0.T();
        C cB = E.B();
        cB.f(n0Var2, "__type__");
        m0VarT4.h(cB);
        f339e = (n0) m0VarT4.b();
        m0 m0VarT5 = n0.T();
        m0VarT5.j("__vector__");
        n0 n0Var3 = (n0) m0VarT5.b();
        f340f = n0Var3;
        m0 m0VarT6 = n0.T();
        C cB2 = E.B();
        cB2.f(n0Var3, "__type__");
        m0 m0VarT7 = n0.T();
        m0VarT7.f(N2.b.B());
        cB2.f((n0) m0VarT7.b(), "value");
        m0VarT6.h(cB2);
        f341g = (n0) m0VarT6.b();
        m0 m0VarT8 = n0.T();
        m0VarT8.d();
        n0.D((n0) m0VarT8.f6410b, false);
        h = (n0) m0VarT8.b();
        m0 m0VarT9 = n0.T();
        m0VarT9.g(Double.NaN);
        i = (n0) m0VarT9.b();
        m0 m0VarT10 = n0.T();
        A0 a0A = B0.A();
        a0A.d();
        B0.v((B0) a0A.f6410b, Long.MIN_VALUE);
        m0VarT10.d();
        n0.v((n0) m0VarT10.f6410b, (B0) a0A.b());
        f342j = (n0) m0VarT10.b();
        m0 m0VarT11 = n0.T();
        m0VarT11.j("");
        f343k = (n0) m0VarT11.b();
        m0 m0VarT12 = n0.T();
        C0407k c0407k = AbstractC0409l.f6528b;
        m0VarT12.d();
        n0.x((n0) m0VarT12.f6410b, c0407k);
        f344l = (n0) m0VarT12.b();
        h hVarB = h.b();
        m0 m0VarT13 = n0.T();
        String str = "projects//databases//documents/" + hVarB.f315a.c();
        m0VarT13.d();
        n0.y((n0) m0VarT13.f6410b, str);
        f345m = (n0) m0VarT13.b();
        m0 m0VarT14 = n0.T();
        Q2.a aVarA = Q2.b.A();
        aVarA.d();
        Q2.b.v((Q2.b) aVarA.f6410b, -90.0d);
        aVarA.d();
        Q2.b.w((Q2.b) aVarA.f6410b, -180.0d);
        m0VarT14.d();
        n0.z((n0) m0VarT14.f6410b, (Q2.b) aVarA.b());
        f346n = (n0) m0VarT14.b();
        m0 m0VarT15 = n0.T();
        N2.b bVarY = N2.b.y();
        m0VarT15.d();
        n0.A(bVarY, (n0) m0VarT15.f6410b);
        f347o = (n0) m0VarT15.b();
        m0 m0VarT16 = n0.T();
        m0VarT16.i(E.w());
        f348p = (n0) m0VarT16.b();
    }

    public static void a(StringBuilder sb, n0 n0Var) {
        boolean z4 = true;
        switch (t.h.c(n0Var.R())) {
            case 0:
                sb.append("null");
                return;
            case 1:
                sb.append(n0Var.H());
                return;
            case 2:
                sb.append(n0Var.M());
                return;
            case 3:
                sb.append(n0Var.K());
                return;
            case 4:
                B0 b0Q = n0Var.Q();
                sb.append("time(" + b0Q.z() + "," + b0Q.y() + ")");
                return;
            case 5:
                sb.append(n0Var.P());
                return;
            case 6:
                sb.append(s.h(n0Var.I()));
                return;
            case 7:
                AbstractC0183a.N(i(n0Var), "Value should be a ReferenceValue", new Object[0]);
                sb.append(h.c(n0Var.O()));
                return;
            case 8:
                Q2.b bVarL = n0Var.L();
                sb.append("geo(" + bVarL.y() + "," + bVarL.z() + ")");
                return;
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                N2.b bVarG = n0Var.G();
                sb.append("[");
                for (int i5 = 0; i5 < bVarG.A(); i5++) {
                    a(sb, bVarG.z(i5));
                    if (i5 != bVarG.A() - 1) {
                        sb.append(",");
                    }
                }
                sb.append("]");
                return;
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                E eN = n0Var.N();
                ArrayList arrayList = new ArrayList(eN.y().keySet());
                Collections.sort(arrayList);
                sb.append("{");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (z4) {
                        z4 = false;
                    } else {
                        sb.append(",");
                    }
                    sb.append(str);
                    sb.append(":");
                    a(sb, eN.A(str));
                }
                sb.append("}");
                return;
            default:
                AbstractC0183a.z("Invalid value type: ".concat(B.a.z(n0Var.R())), new Object[0]);
                throw null;
        }
    }

    public static int b(n0 n0Var, n0 n0Var2) {
        int i5 = 1;
        int iK = k(n0Var);
        int iK2 = k(n0Var2);
        if (iK != iK2) {
            return Integer.compare(iK, iK2);
        }
        if (iK != Integer.MAX_VALUE) {
            switch (iK) {
                case 0:
                    break;
                case 1:
                    boolean zH = n0Var.H();
                    boolean zH2 = n0Var2.H();
                    E2.n nVar = s.f1736a;
                    if (zH == zH2) {
                        return 0;
                    }
                    return zH ? 1 : -1;
                case 2:
                    if (n0Var.R() == 4) {
                        double dK = n0Var.K();
                        if (n0Var2.R() == 4) {
                            double dK2 = n0Var2.K();
                            E2.n nVar2 = s.f1736a;
                            return S0.f.B(dK, dK2);
                        }
                        if (n0Var2.R() == 3) {
                            return s.d(dK, n0Var2.M());
                        }
                    } else if (n0Var.R() == 3) {
                        long jM = n0Var.M();
                        if (n0Var2.R() == 3) {
                            return Long.compare(jM, n0Var2.M());
                        }
                        if (n0Var2.R() == 4) {
                            return s.d(n0Var2.K(), jM) * (-1);
                        }
                    }
                    AbstractC0183a.z("Unexpected values: %s vs %s", n0Var, n0Var2);
                    throw null;
                case 3:
                    B0 b0Q = n0Var.Q();
                    B0 b0Q2 = n0Var2.Q();
                    int iCompare = Long.compare(b0Q.z(), b0Q2.z());
                    return iCompare != 0 ? iCompare : Integer.compare(b0Q.y(), b0Q2.y());
                case 4:
                    B0 b0T = p1.b.t(n0Var);
                    B0 b0T2 = p1.b.t(n0Var2);
                    int iCompare2 = Long.compare(b0T.z(), b0T2.z());
                    return iCompare2 != 0 ? iCompare2 : Integer.compare(b0T.y(), b0T2.y());
                case 5:
                    return s.e(n0Var.P(), n0Var2.P());
                case 6:
                    return s.c(n0Var.I(), n0Var2.I());
                case 7:
                    String strO = n0Var.O();
                    String strO2 = n0Var2.O();
                    String[] strArrSplit = strO.split("/", -1);
                    String[] strArrSplit2 = strO2.split("/", -1);
                    int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
                    for (int i6 = 0; i6 < iMin; i6++) {
                        int iCompareTo = strArrSplit[i6].compareTo(strArrSplit2[i6]);
                        if (iCompareTo != 0) {
                            return iCompareTo;
                        }
                    }
                    return Integer.compare(strArrSplit.length, strArrSplit2.length);
                case 8:
                    Q2.b bVarL = n0Var.L();
                    Q2.b bVarL2 = n0Var2.L();
                    double dY = bVarL.y();
                    double dY2 = bVarL2.y();
                    E2.n nVar3 = s.f1736a;
                    int iB = S0.f.B(dY, dY2);
                    return iB == 0 ? S0.f.B(bVarL.z(), bVarL2.z()) : iB;
                case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    return c(n0Var.G(), n0Var2.G());
                case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    E eN = n0Var.N();
                    E eN2 = n0Var2.N();
                    Map mapY = eN.y();
                    Map mapY2 = eN2.y();
                    N2.b bVarG = ((n0) mapY.get("value")).G();
                    N2.b bVarG2 = ((n0) mapY2.get("value")).G();
                    int iCompare3 = Integer.compare(bVarG.A(), bVarG2.A());
                    return iCompare3 != 0 ? iCompare3 : c(bVarG, bVarG2);
                case 11:
                    E eN3 = n0Var.N();
                    E eN4 = n0Var2.N();
                    Iterator it = new TreeMap(eN3.y()).entrySet().iterator();
                    Iterator it2 = new TreeMap(eN4.y()).entrySet().iterator();
                    while (it.hasNext() && it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        Map.Entry entry2 = (Map.Entry) it2.next();
                        int iE = s.e((String) entry.getKey(), (String) entry2.getKey());
                        if (iE != 0) {
                            return iE;
                        }
                        int iB2 = b((n0) entry.getValue(), (n0) entry2.getValue());
                        if (iB2 != 0) {
                            return iB2;
                        }
                    }
                    boolean zHasNext = it.hasNext();
                    boolean zHasNext2 = it2.hasNext();
                    E2.n nVar4 = s.f1736a;
                    if (zHasNext == zHasNext2) {
                        i5 = 0;
                    } else if (!zHasNext) {
                        i5 = -1;
                    }
                    return i5;
                default:
                    AbstractC0183a.z(B.a.g(iK, "Invalid value type: "), new Object[0]);
                    throw null;
            }
        }
        return 0;
    }

    public static int c(N2.b bVar, N2.b bVar2) {
        int iMin = Math.min(bVar.A(), bVar2.A());
        for (int i5 = 0; i5 < iMin; i5++) {
            int iB = b(bVar.z(i5), bVar2.z(i5));
            if (iB != 0) {
                return iB;
            }
        }
        return Integer.compare(bVar.A(), bVar2.A());
    }

    public static boolean d(InterfaceC0139c interfaceC0139c, n0 n0Var) {
        Iterator it = interfaceC0139c.a().iterator();
        while (it.hasNext()) {
            if (e((n0) it.next(), n0Var)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean e(N2.n0 r5, N2.n0 r6) {
        /*
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto Lea
            if (r6 != 0) goto Lb
            goto Lea
        Lb:
            int r2 = k(r5)
            int r3 = k(r6)
            if (r2 == r3) goto L16
            return r1
        L16:
            r3 = 2
            r4 = 4
            if (r2 == r3) goto Lac
            if (r2 == r4) goto L9f
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r3) goto L9e
            switch(r2) {
                case 9: goto L71;
                case 10: goto L29;
                case 11: goto L29;
                default: goto L24;
            }
        L24:
            boolean r5 = r5.equals(r6)
            return r5
        L29:
            N2.E r5 = r5.N()
            N2.E r6 = r6.N()
            int r2 = r5.x()
            int r3 = r6.x()
            if (r2 == r3) goto L3d
        L3b:
            r0 = r1
            goto L70
        L3d:
            java.util.Map r5 = r5.y()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L49:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L70
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.util.Map r3 = r6.y()
            java.lang.Object r4 = r2.getKey()
            java.lang.Object r3 = r3.get(r4)
            N2.n0 r3 = (N2.n0) r3
            java.lang.Object r2 = r2.getValue()
            N2.n0 r2 = (N2.n0) r2
            boolean r2 = e(r2, r3)
            if (r2 != 0) goto L49
            goto L3b
        L70:
            return r0
        L71:
            N2.b r5 = r5.G()
            N2.b r6 = r6.G()
            int r2 = r5.A()
            int r3 = r6.A()
            if (r2 == r3) goto L85
        L83:
            r0 = r1
            goto L9e
        L85:
            r2 = r1
        L86:
            int r3 = r5.A()
            if (r2 >= r3) goto L9e
            N2.n0 r3 = r5.z(r2)
            N2.n0 r4 = r6.z(r2)
            boolean r3 = e(r3, r4)
            if (r3 != 0) goto L9b
            goto L83
        L9b:
            int r2 = r2 + 1
            goto L86
        L9e:
            return r0
        L9f:
            com.google.protobuf.B0 r5 = p1.b.t(r5)
            com.google.protobuf.B0 r6 = p1.b.t(r6)
            boolean r5 = r5.equals(r6)
            return r5
        Lac:
            int r2 = r5.R()
            r3 = 3
            if (r2 != r3) goto Lc9
            int r2 = r6.R()
            if (r2 != r3) goto Lc9
            long r2 = r5.M()
            long r5 = r6.M()
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 != 0) goto Lc6
            goto Lc7
        Lc6:
            r0 = r1
        Lc7:
            r1 = r0
            goto Lea
        Lc9:
            int r2 = r5.R()
            if (r2 != r4) goto Lea
            int r2 = r6.R()
            if (r2 != r4) goto Lea
            double r2 = r5.K()
            long r2 = java.lang.Double.doubleToLongBits(r2)
            double r5 = r6.K()
            long r5 = java.lang.Double.doubleToLongBits(r5)
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 != 0) goto Lc6
            goto Lc7
        Lea:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.p.e(N2.n0, N2.n0):boolean");
    }

    public static boolean f(n0 n0Var) {
        return n0Var != null && n0Var.R() == 10;
    }

    public static boolean g(n0 n0Var) {
        return n0Var != null && n0Var.R() == 4;
    }

    public static boolean h(n0 n0Var) {
        return n0Var != null && n0Var.R() == 3;
    }

    public static boolean i(n0 n0Var) {
        return n0Var != null && n0Var.R() == 8;
    }

    public static boolean j(n0 n0Var) {
        return f340f.equals(n0Var.N().y().get("__type__"));
    }

    public static int k(n0 n0Var) {
        switch (t.h.c(n0Var.R())) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return 9;
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                if (p1.b.A(n0Var)) {
                    return 4;
                }
                return f338d.equals(n0Var.N().y().get("__type__")) ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : j(n0Var) ? 10 : 11;
            default:
                AbstractC0183a.z("Invalid value type: ".concat(B.a.z(n0Var.R())), new Object[0]);
                throw null;
        }
    }
}
