package com.google.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.u0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\u0.1.smali */
public abstract class AbstractC0426u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f6587a;

    /* renamed from: b, reason: collision with root package name */
    public static final E0 f6588b;

    /* renamed from: c, reason: collision with root package name */
    public static final E0 f6589c;

    static {
        Class<?> cls;
        Class<?> cls2;
        E0 e02 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f6587a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                e02 = (E0) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f6588b = e02;
        f6589c = new E0();
    }

    public static void A(E0 e02, Object obj, Object obj2) {
        e02.getClass();
        E e5 = (E) obj;
        D0 d02 = e5.unknownFields;
        D0 d03 = ((E) obj2).unknownFields;
        D0 d04 = D0.f6412f;
        if (!d04.equals(d03)) {
            if (d04.equals(d02)) {
                int i = d02.f6413a + d03.f6413a;
                int[] iArrCopyOf = Arrays.copyOf(d02.f6414b, i);
                System.arraycopy(d03.f6414b, 0, iArrCopyOf, d02.f6413a, d03.f6413a);
                Object[] objArrCopyOf = Arrays.copyOf(d02.f6415c, i);
                System.arraycopy(d03.f6415c, 0, objArrCopyOf, d02.f6413a, d03.f6413a);
                d02 = new D0(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                d02.getClass();
                if (!d03.equals(d04)) {
                    if (!d02.f6417e) {
                        throw new UnsupportedOperationException();
                    }
                    int i5 = d02.f6413a + d03.f6413a;
                    d02.a(i5);
                    System.arraycopy(d03.f6414b, 0, d02.f6414b, d02.f6413a, d03.f6413a);
                    System.arraycopy(d03.f6415c, 0, d02.f6415c, d02.f6413a, d03.f6413a);
                    d02.f6413a = i5;
                }
            }
        }
        e5.unknownFields = d02;
    }

    public static boolean B(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void C(int i, List list, Y y4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0422s abstractC0422s = (AbstractC0422s) y4.f6481a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                abstractC0422s.w0(i, ((Boolean) list.get(i5)).booleanValue());
                i5++;
            }
            return;
        }
        abstractC0422s.K0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Boolean) list.get(i7)).getClass();
            Logger logger = AbstractC0422s.f6578d;
            i6++;
        }
        abstractC0422s.M0(i6);
        while (i5 < list.size()) {
            abstractC0422s.v0(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
            i5++;
        }
    }

    public static void D(int i, List list, Y y4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4.getClass();
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((AbstractC0422s) y4.f6481a).y0(i, (AbstractC0409l) list.get(i5));
        }
    }

    public static void E(int i, List list, Y y4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0422s abstractC0422s = (AbstractC0422s) y4.f6481a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                double dDoubleValue = ((Double) list.get(i5)).doubleValue();
                abstractC0422s.getClass();
                abstractC0422s.C0(i, Double.doubleToRawLongBits(dDoubleValue));
                i5++;
            }
            return;
        }
        abstractC0422s.K0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Double) list.get(i7)).getClass();
            Logger logger = AbstractC0422s.f6578d;
            i6 += 8;
        }
        abstractC0422s.M0(i6);
        while (i5 < list.size()) {
            abstractC0422s.D0(Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
            i5++;
        }
    }

    public static void F(int i, List list, Y y4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0422s abstractC0422s = (AbstractC0422s) y4.f6481a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                abstractC0422s.E0(i, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        abstractC0422s.K0(i, 2);
        int iH0 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iH0 += AbstractC0422s.h0(((Integer) list.get(i6)).intValue());
        }
        abstractC0422s.M0(iH0);
        while (i5 < list.size()) {
            abstractC0422s.F0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void G(int i, List list, Y y4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0422s abstractC0422s = (AbstractC0422s) y4.f6481a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                abstractC0422s.A0(i, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        abstractC0422s.K0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Integer) list.get(i7)).getClass();
            Logger logger = AbstractC0422s.f6578d;
            i6 += 4;
        }
        abstractC0422s.M0(i6);
        while (i5 < list.size()) {
            abstractC0422s.B0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void H(int i, List list, Y y4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0422s abstractC0422s = (AbstractC0422s) y4.f6481a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                abstractC0422s.C0(i, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        abstractC0422s.K0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Long) list.get(i7)).getClass();
            Logger logger = AbstractC0422s.f6578d;
            i6 += 8;
        }
        abstractC0422s.M0(i6);
        while (i5 < list.size()) {
            abstractC0422s.D0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static void I(int i, List list, Y y4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0422s abstractC0422s = (AbstractC0422s) y4.f6481a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                float fFloatValue = ((Float) list.get(i5)).floatValue();
                abstractC0422s.getClass();
                abstractC0422s.A0(i, Float.floatToRawIntBits(fFloatValue));
                i5++;
            }
            return;
        }
        abstractC0422s.K0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Float) list.get(i7)).getClass();
            Logger logger = AbstractC0422s.f6578d;
            i6 += 4;
        }
        abstractC0422s.M0(i6);
        while (i5 < list.size()) {
            abstractC0422s.B0(Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
            i5++;
        }
    }

    public static void J(int i, List list, Y y4, InterfaceC0425t0 interfaceC0425t0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4.getClass();
        for (int i5 = 0; i5 < list.size(); i5++) {
            y4.i(i, list.get(i5), interfaceC0425t0);
        }
    }

    public static void K(int i, List list, Y y4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0422s abstractC0422s = (AbstractC0422s) y4.f6481a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                abstractC0422s.E0(i, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        abstractC0422s.K0(i, 2);
        int iH0 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iH0 += AbstractC0422s.h0(((Integer) list.get(i6)).intValue());
        }
        abstractC0422s.M0(iH0);
        while (i5 < list.size()) {
            abstractC0422s.F0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void L(int i, List list, Y y4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0422s abstractC0422s = (AbstractC0422s) y4.f6481a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                abstractC0422s.N0(i, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        abstractC0422s.K0(i, 2);
        int iT0 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iT0 += AbstractC0422s.t0(((Long) list.get(i6)).longValue());
        }
        abstractC0422s.M0(iT0);
        while (i5 < list.size()) {
            abstractC0422s.O0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static void M(int i, List list, Y y4, InterfaceC0425t0 interfaceC0425t0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4.getClass();
        for (int i5 = 0; i5 < list.size(); i5++) {
            y4.l(i, list.get(i5), interfaceC0425t0);
        }
    }

    public static void N(int i, List list, Y y4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0422s abstractC0422s = (AbstractC0422s) y4.f6481a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                abstractC0422s.A0(i, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        abstractC0422s.K0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Integer) list.get(i7)).getClass();
            Logger logger = AbstractC0422s.f6578d;
            i6 += 4;
        }
        abstractC0422s.M0(i6);
        while (i5 < list.size()) {
            abstractC0422s.B0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void O(int i, List list, Y y4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0422s abstractC0422s = (AbstractC0422s) y4.f6481a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                abstractC0422s.C0(i, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        abstractC0422s.K0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Long) list.get(i7)).getClass();
            Logger logger = AbstractC0422s.f6578d;
            i6 += 8;
        }
        abstractC0422s.M0(i6);
        while (i5 < list.size()) {
            abstractC0422s.D0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static void P(int i, List list, Y y4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0422s abstractC0422s = (AbstractC0422s) y4.f6481a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                int iIntValue = ((Integer) list.get(i5)).intValue();
                abstractC0422s.L0(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i5++;
            }
            return;
        }
        abstractC0422s.K0(i, 2);
        int iR0 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            int iIntValue2 = ((Integer) list.get(i6)).intValue();
            iR0 += AbstractC0422s.r0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        abstractC0422s.M0(iR0);
        while (i5 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i5)).intValue();
            abstractC0422s.M0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i5++;
        }
    }

    public static void Q(int i, List list, Y y4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0422s abstractC0422s = (AbstractC0422s) y4.f6481a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                long jLongValue = ((Long) list.get(i5)).longValue();
                abstractC0422s.N0(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i5++;
            }
            return;
        }
        abstractC0422s.K0(i, 2);
        int iT0 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            long jLongValue2 = ((Long) list.get(i6)).longValue();
            iT0 += AbstractC0422s.t0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        abstractC0422s.M0(iT0);
        while (i5 < list.size()) {
            long jLongValue3 = ((Long) list.get(i5)).longValue();
            abstractC0422s.O0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i5++;
        }
    }

    public static void R(int i, List list, Y y4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4.getClass();
        boolean z4 = list instanceof S;
        AbstractC0422s abstractC0422s = (AbstractC0422s) y4.f6481a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                abstractC0422s.I0(i, (String) list.get(i5));
                i5++;
            }
            return;
        }
        S s4 = (S) list;
        while (i5 < list.size()) {
            Object objB = s4.b(i5);
            if (objB instanceof String) {
                abstractC0422s.I0(i, (String) objB);
            } else {
                abstractC0422s.y0(i, (AbstractC0409l) objB);
            }
            i5++;
        }
    }

    public static void S(int i, List list, Y y4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0422s abstractC0422s = (AbstractC0422s) y4.f6481a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                abstractC0422s.L0(i, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        abstractC0422s.K0(i, 2);
        int iR0 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iR0 += AbstractC0422s.r0(((Integer) list.get(i6)).intValue());
        }
        abstractC0422s.M0(iR0);
        while (i5 < list.size()) {
            abstractC0422s.M0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void T(int i, List list, Y y4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0422s abstractC0422s = (AbstractC0422s) y4.f6481a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                abstractC0422s.N0(i, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        abstractC0422s.K0(i, 2);
        int iT0 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iT0 += AbstractC0422s.t0(((Long) list.get(i6)).longValue());
        }
        abstractC0422s.M0(iT0);
        while (i5 < list.size()) {
            abstractC0422s.O0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC0422s.X(i) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iP0 = AbstractC0422s.p0(i) * size;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iP0 += AbstractC0422s.Z((AbstractC0409l) list.get(i5));
        }
        return iP0;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0422s.p0(i) * size) + e(list);
    }

    public static int e(List list) {
        int iH0;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof H) {
            H h = (H) list;
            iH0 = 0;
            while (i < size) {
                h.i(i);
                iH0 += AbstractC0422s.h0(h.f6421b[i]);
                i++;
            }
        } else {
            iH0 = 0;
            while (i < size) {
                iH0 += AbstractC0422s.h0(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iH0;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC0422s.c0(i) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC0422s.d0(i) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i, List list, InterfaceC0425t0 interfaceC0425t0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iF0 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            iF0 += AbstractC0422s.f0(i, (AbstractC0388a) list.get(i5), interfaceC0425t0);
        }
        return iF0;
    }

    public static int k(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0422s.p0(i) * size) + l(list);
    }

    public static int l(List list) {
        int iH0;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof H) {
            H h = (H) list;
            iH0 = 0;
            while (i < size) {
                h.i(i);
                iH0 += AbstractC0422s.h0(h.f6421b[i]);
                i++;
            }
        } else {
            iH0 = 0;
            while (i < size) {
                iH0 += AbstractC0422s.h0(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iH0;
    }

    public static int m(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (AbstractC0422s.p0(i) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof W) {
            W w4 = (W) list;
            if (size <= 0) {
                return 0;
            }
            w4.i(0);
            throw null;
        }
        int iT0 = 0;
        for (int i = 0; i < size; i++) {
            iT0 += AbstractC0422s.t0(((Long) list.get(i)).longValue());
        }
        return iT0;
    }

    public static int o(int i, Object obj, InterfaceC0425t0 interfaceC0425t0) {
        int iP0 = AbstractC0422s.p0(i);
        int iC = ((AbstractC0388a) obj).c(interfaceC0425t0);
        return AbstractC0422s.r0(iC) + iC + iP0;
    }

    public static int p(int i, List list, InterfaceC0425t0 interfaceC0425t0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iP0 = AbstractC0422s.p0(i) * size;
        for (int i5 = 0; i5 < size; i5++) {
            int iC = ((AbstractC0388a) list.get(i5)).c(interfaceC0425t0);
            iP0 += AbstractC0422s.r0(iC) + iC;
        }
        return iP0;
    }

    public static int q(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0422s.p0(i) * size) + r(list);
    }

    public static int r(List list) {
        int iR0;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof H) {
            H h = (H) list;
            iR0 = 0;
            while (i < size) {
                h.i(i);
                int i5 = h.f6421b[i];
                iR0 += AbstractC0422s.r0((i5 >> 31) ^ (i5 << 1));
                i++;
            }
        } else {
            iR0 = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iR0 += AbstractC0422s.r0((iIntValue >> 31) ^ (iIntValue << 1));
                i++;
            }
        }
        return iR0;
    }

    public static int s(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0422s.p0(i) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof W) {
            W w4 = (W) list;
            if (size <= 0) {
                return 0;
            }
            w4.i(0);
            throw null;
        }
        int iT0 = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iT0 += AbstractC0422s.t0((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iT0;
    }

    public static int u(int i, List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        int iP0 = AbstractC0422s.p0(i) * size;
        if (list instanceof S) {
            S s4 = (S) list;
            while (i5 < size) {
                Object objB = s4.b(i5);
                iP0 = (objB instanceof AbstractC0409l ? AbstractC0422s.Z((AbstractC0409l) objB) : AbstractC0422s.o0((String) objB)) + iP0;
                i5++;
            }
        } else {
            while (i5 < size) {
                Object obj = list.get(i5);
                iP0 = (obj instanceof AbstractC0409l ? AbstractC0422s.Z((AbstractC0409l) obj) : AbstractC0422s.o0((String) obj)) + iP0;
                i5++;
            }
        }
        return iP0;
    }

    public static int v(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0422s.p0(i) * size) + w(list);
    }

    public static int w(List list) {
        int iR0;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof H) {
            H h = (H) list;
            iR0 = 0;
            while (i < size) {
                h.i(i);
                iR0 += AbstractC0422s.r0(h.f6421b[i]);
                i++;
            }
        } else {
            iR0 = 0;
            while (i < size) {
                iR0 += AbstractC0422s.r0(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iR0;
    }

    public static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0422s.p0(i) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof W) {
            W w4 = (W) list;
            if (size <= 0) {
                return 0;
            }
            w4.i(0);
            throw null;
        }
        int iT0 = 0;
        for (int i = 0; i < size; i++) {
            iT0 += AbstractC0422s.t0(((Long) list.get(i)).longValue());
        }
        return iT0;
    }

    public static Object z(Object obj, int i, List list, Object obj2, E0 e02) {
        return obj2;
    }
}
