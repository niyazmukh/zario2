package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\W.smali */
public abstract class W {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f4458a;

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f4459b;

    /* renamed from: c, reason: collision with root package name */
    public static final d0 f4460c;

    static {
        Class<?> cls;
        Class<?> cls2;
        S s4 = S.f4448c;
        d0 d0Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f4458a = cls;
        try {
            S s5 = S.f4448c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                d0Var = (d0) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f4459b = d0Var;
        f4460c = new d0();
    }

    public static void A(d0 d0Var, Object obj, Object obj2) {
        d0Var.getClass();
        AbstractC0218v abstractC0218v = (AbstractC0218v) obj;
        c0 c0Var = abstractC0218v.unknownFields;
        c0 c0Var2 = ((AbstractC0218v) obj2).unknownFields;
        c0 c0Var3 = c0.f4480f;
        if (!c0Var3.equals(c0Var2)) {
            if (c0Var3.equals(c0Var)) {
                int i = c0Var.f4481a + c0Var2.f4481a;
                int[] iArrCopyOf = Arrays.copyOf(c0Var.f4482b, i);
                System.arraycopy(c0Var2.f4482b, 0, iArrCopyOf, c0Var.f4481a, c0Var2.f4481a);
                Object[] objArrCopyOf = Arrays.copyOf(c0Var.f4483c, i);
                System.arraycopy(c0Var2.f4483c, 0, objArrCopyOf, c0Var.f4481a, c0Var2.f4481a);
                c0Var = new c0(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                c0Var.getClass();
                if (!c0Var2.equals(c0Var3)) {
                    if (!c0Var.f4485e) {
                        throw new UnsupportedOperationException();
                    }
                    int i5 = c0Var.f4481a + c0Var2.f4481a;
                    c0Var.a(i5);
                    System.arraycopy(c0Var2.f4482b, 0, c0Var.f4482b, c0Var.f4481a, c0Var2.f4481a);
                    System.arraycopy(c0Var2.f4483c, 0, c0Var.f4483c, c0Var.f4481a, c0Var2.f4481a);
                    c0Var.f4481a = i5;
                }
            }
        }
        abstractC0218v.unknownFields = c0Var;
    }

    public static boolean B(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void C(int i, List list, E e5, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0209l c0209l = (C0209l) e5.f4420a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0209l.b1(i, ((Boolean) list.get(i5)).booleanValue());
                i5++;
            }
            return;
        }
        c0209l.m1(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Boolean) list.get(i7)).getClass();
            Logger logger = C0209l.f4523g;
            i6++;
        }
        c0209l.o1(i6);
        while (i5 < list.size()) {
            c0209l.Z0(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
            i5++;
        }
    }

    public static void D(int i, List list, E e5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e5.getClass();
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((C0209l) e5.f4420a).c1(i, (C0204g) list.get(i5));
        }
    }

    public static void E(int i, List list, E e5, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0209l c0209l = (C0209l) e5.f4420a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                double dDoubleValue = ((Double) list.get(i5)).doubleValue();
                c0209l.getClass();
                c0209l.g1(i, Double.doubleToRawLongBits(dDoubleValue));
                i5++;
            }
            return;
        }
        c0209l.m1(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Double) list.get(i7)).getClass();
            Logger logger = C0209l.f4523g;
            i6 += 8;
        }
        c0209l.o1(i6);
        while (i5 < list.size()) {
            c0209l.h1(Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
            i5++;
        }
    }

    public static void F(int i, List list, E e5, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0209l c0209l = (C0209l) e5.f4420a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0209l.i1(i, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c0209l.m1(i, 2);
        int iW0 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iW0 += C0209l.W0(((Integer) list.get(i6)).intValue());
        }
        c0209l.o1(iW0);
        while (i5 < list.size()) {
            c0209l.j1(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void G(int i, List list, E e5, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0209l c0209l = (C0209l) e5.f4420a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0209l.e1(i, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c0209l.m1(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Integer) list.get(i7)).getClass();
            Logger logger = C0209l.f4523g;
            i6 += 4;
        }
        c0209l.o1(i6);
        while (i5 < list.size()) {
            c0209l.f1(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void H(int i, List list, E e5, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0209l c0209l = (C0209l) e5.f4420a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0209l.g1(i, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        c0209l.m1(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Long) list.get(i7)).getClass();
            Logger logger = C0209l.f4523g;
            i6 += 8;
        }
        c0209l.o1(i6);
        while (i5 < list.size()) {
            c0209l.h1(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static void I(int i, List list, E e5, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0209l c0209l = (C0209l) e5.f4420a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                float fFloatValue = ((Float) list.get(i5)).floatValue();
                c0209l.getClass();
                c0209l.e1(i, Float.floatToRawIntBits(fFloatValue));
                i5++;
            }
            return;
        }
        c0209l.m1(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Float) list.get(i7)).getClass();
            Logger logger = C0209l.f4523g;
            i6 += 4;
        }
        c0209l.o1(i6);
        while (i5 < list.size()) {
            c0209l.f1(Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
            i5++;
        }
    }

    public static void J(int i, List list, E e5, V v4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e5.getClass();
        for (int i5 = 0; i5 < list.size(); i5++) {
            e5.h(i, list.get(i5), v4);
        }
    }

    public static void K(int i, List list, E e5, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0209l c0209l = (C0209l) e5.f4420a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0209l.i1(i, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c0209l.m1(i, 2);
        int iW0 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iW0 += C0209l.W0(((Integer) list.get(i6)).intValue());
        }
        c0209l.o1(iW0);
        while (i5 < list.size()) {
            c0209l.j1(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void L(int i, List list, E e5, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0209l c0209l = (C0209l) e5.f4420a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0209l.p1(i, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        c0209l.m1(i, 2);
        int iW0 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iW0 += C0209l.W0(((Long) list.get(i6)).longValue());
        }
        c0209l.o1(iW0);
        while (i5 < list.size()) {
            c0209l.q1(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static void M(int i, List list, E e5, V v4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e5.getClass();
        for (int i5 = 0; i5 < list.size(); i5++) {
            e5.k(i, list.get(i5), v4);
        }
    }

    public static void N(int i, List list, E e5, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0209l c0209l = (C0209l) e5.f4420a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0209l.e1(i, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c0209l.m1(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Integer) list.get(i7)).getClass();
            Logger logger = C0209l.f4523g;
            i6 += 4;
        }
        c0209l.o1(i6);
        while (i5 < list.size()) {
            c0209l.f1(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void O(int i, List list, E e5, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0209l c0209l = (C0209l) e5.f4420a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0209l.g1(i, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        c0209l.m1(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Long) list.get(i7)).getClass();
            Logger logger = C0209l.f4523g;
            i6 += 8;
        }
        c0209l.o1(i6);
        while (i5 < list.size()) {
            c0209l.h1(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static void P(int i, List list, E e5, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0209l c0209l = (C0209l) e5.f4420a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                int iIntValue = ((Integer) list.get(i5)).intValue();
                c0209l.n1(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i5++;
            }
            return;
        }
        c0209l.m1(i, 2);
        int iU0 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            int iIntValue2 = ((Integer) list.get(i6)).intValue();
            iU0 += C0209l.U0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c0209l.o1(iU0);
        while (i5 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i5)).intValue();
            c0209l.o1((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i5++;
        }
    }

    public static void Q(int i, List list, E e5, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0209l c0209l = (C0209l) e5.f4420a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                long jLongValue = ((Long) list.get(i5)).longValue();
                c0209l.p1(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i5++;
            }
            return;
        }
        c0209l.m1(i, 2);
        int iW0 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            long jLongValue2 = ((Long) list.get(i6)).longValue();
            iW0 += C0209l.W0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c0209l.o1(iW0);
        while (i5 < list.size()) {
            long jLongValue3 = ((Long) list.get(i5)).longValue();
            c0209l.q1((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i5++;
        }
    }

    public static void R(int i, List list, E e5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e5.getClass();
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((C0209l) e5.f4420a).k1(i, (String) list.get(i5));
        }
    }

    public static void S(int i, List list, E e5, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0209l c0209l = (C0209l) e5.f4420a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0209l.n1(i, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c0209l.m1(i, 2);
        int iU0 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iU0 += C0209l.U0(((Integer) list.get(i6)).intValue());
        }
        c0209l.o1(iU0);
        while (i5 < list.size()) {
            c0209l.o1(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void T(int i, List list, E e5, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0209l c0209l = (C0209l) e5.f4420a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0209l.p1(i, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        c0209l.m1(i, 2);
        int iW0 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iW0 += C0209l.W0(((Long) list.get(i6)).longValue());
        }
        c0209l.o1(iW0);
        while (i5 < list.size()) {
            c0209l.q1(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0209l.C0(i) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iS0 = C0209l.S0(i) * size;
        for (int i5 = 0; i5 < list.size(); i5++) {
            int size2 = ((C0204g) list.get(i5)).size();
            iS0 += C0209l.U0(size2) + size2;
        }
        return iS0;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0209l.S0(i) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW0 = 0;
        for (int i = 0; i < size; i++) {
            iW0 += C0209l.W0(((Integer) list.get(i)).intValue());
        }
        return iW0;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0209l.G0(i) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0209l.H0(i) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i, List list, V v4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ0 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            iJ0 += C0209l.J0(i, (AbstractC0198a) list.get(i5), v4);
        }
        return iJ0;
    }

    public static int k(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0209l.S0(i) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW0 = 0;
        for (int i = 0; i < size; i++) {
            iW0 += C0209l.W0(((Integer) list.get(i)).intValue());
        }
        return iW0;
    }

    public static int m(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0209l.S0(i) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW0 = 0;
        for (int i = 0; i < size; i++) {
            iW0 += C0209l.W0(((Long) list.get(i)).longValue());
        }
        return iW0;
    }

    public static int o(int i, Object obj, V v4) {
        int iS0 = C0209l.S0(i);
        int iA = ((AbstractC0198a) obj).a(v4);
        return C0209l.U0(iA) + iA + iS0;
    }

    public static int p(int i, List list, V v4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iS0 = C0209l.S0(i) * size;
        for (int i5 = 0; i5 < size; i5++) {
            int iA = ((AbstractC0198a) list.get(i5)).a(v4);
            iS0 += C0209l.U0(iA) + iA;
        }
        return iS0;
    }

    public static int q(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0209l.S0(i) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU0 = 0;
        for (int i = 0; i < size; i++) {
            int iIntValue = ((Integer) list.get(i)).intValue();
            iU0 += C0209l.U0((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iU0;
    }

    public static int s(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0209l.S0(i) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW0 = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iW0 += C0209l.W0((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iW0;
    }

    public static int u(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iS0 = C0209l.S0(i) * size;
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = list.get(i5);
            if (obj instanceof C0204g) {
                int size2 = ((C0204g) obj).size();
                iS0 = C0209l.U0(size2) + size2 + iS0;
            } else {
                iS0 = C0209l.R0((String) obj) + iS0;
            }
        }
        return iS0;
    }

    public static int v(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0209l.S0(i) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU0 = 0;
        for (int i = 0; i < size; i++) {
            iU0 += C0209l.U0(((Integer) list.get(i)).intValue());
        }
        return iU0;
    }

    public static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0209l.S0(i) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW0 = 0;
        for (int i = 0; i < size; i++) {
            iW0 += C0209l.W0(((Long) list.get(i)).longValue());
        }
        return iW0;
    }

    public static Object z(Object obj, int i, InterfaceC0219w interfaceC0219w, Object obj2, d0 d0Var) {
        return obj2;
    }
}
