package com.google.protobuf;

import androidx.datastore.preferences.protobuf.C0208k;
import androidx.datastore.preferences.protobuf.C0221y;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: com.google.protobuf.g0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\g0.1.smali */
public final class C0400g0 implements InterfaceC0425t0 {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f6502n = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Unsafe f6503o = M0.j();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f6504a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f6505b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6506c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6507d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0388a f6508e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6509f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f6510g;
    public final int h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final C0404i0 f6511j;

    /* renamed from: k, reason: collision with root package name */
    public final V f6512k;

    /* renamed from: l, reason: collision with root package name */
    public final E0 f6513l;

    /* renamed from: m, reason: collision with root package name */
    public final C0393c0 f6514m;

    public C0400g0(int[] iArr, Object[] objArr, int i, int i5, AbstractC0388a abstractC0388a, int[] iArr2, int i6, int i7, C0404i0 c0404i0, V v4, E0 e02, C0428w c0428w, C0393c0 c0393c0) {
        this.f6504a = iArr;
        this.f6505b = objArr;
        this.f6506c = i;
        this.f6507d = i5;
        this.f6509f = abstractC0388a instanceof E;
        this.f6510g = iArr2;
        this.h = i6;
        this.i = i7;
        this.f6511j = c0404i0;
        this.f6512k = v4;
        this.f6513l = e02;
        this.f6508e = abstractC0388a;
        this.f6514m = c0393c0;
    }

    public static C0400g0 B(C0418p0 c0418p0, C0404i0 c0404i0, V v4, E0 e02, C0428w c0428w, C0393c0 c0393c0) {
        if (c0418p0 instanceof C0418p0) {
            return C(c0418p0, c0404i0, v4, e02, c0428w, c0393c0);
        }
        c0418p0.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.protobuf.C0400g0 C(com.google.protobuf.C0418p0 r33, com.google.protobuf.C0404i0 r34, com.google.protobuf.V r35, com.google.protobuf.E0 r36, com.google.protobuf.C0428w r37, com.google.protobuf.C0393c0 r38) {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C0400g0.C(com.google.protobuf.p0, com.google.protobuf.i0, com.google.protobuf.V, com.google.protobuf.E0, com.google.protobuf.w, com.google.protobuf.c0):com.google.protobuf.g0");
    }

    public static long D(int i) {
        return i & 1048575;
    }

    public static int E(Object obj, long j5) {
        return ((Integer) M0.f6430b.k(obj, j5)).intValue();
    }

    public static long F(Object obj, long j5) {
        return ((Long) M0.f6430b.k(obj, j5)).longValue();
    }

    public static Field O(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbO = B.a.o("Field ", str, " for ");
            sbO.append(cls.getName());
            sbO.append(" not found. Known fields are ");
            sbO.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbO.toString());
        }
    }

    public static int U(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void l(Object obj) {
        if (t(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static int m(byte[] bArr, int i, int i5, U0 u02, Class cls, C0396e c0396e) throws N {
        switch (u02.ordinal()) {
            case 0:
                c0396e.f6496c = Double.valueOf(y0.h(bArr, i));
                return i + 8;
            case 1:
                c0396e.f6496c = Float.valueOf(y0.n(bArr, i));
                return i + 4;
            case 2:
            case 3:
                int iN = y0.N(bArr, i, c0396e);
                c0396e.f6496c = Long.valueOf(c0396e.f6495b);
                return iN;
            case 4:
            case N2.j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            case 13:
                int iL = y0.L(bArr, i, c0396e);
                c0396e.f6496c = Integer.valueOf(c0396e.f6494a);
                return iL;
            case 5:
            case 15:
                c0396e.f6496c = Long.valueOf(y0.l(bArr, i));
                return i + 8;
            case 6:
            case 14:
                c0396e.f6496c = Integer.valueOf(y0.j(bArr, i));
                return i + 4;
            case 7:
                int iN2 = y0.N(bArr, i, c0396e);
                c0396e.f6496c = Boolean.valueOf(c0396e.f6495b != 0);
                return iN2;
            case 8:
                return y0.F(bArr, i, c0396e);
            case N2.n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
            default:
                throw new RuntimeException("unsupported field type.");
            case N2.n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                InterfaceC0425t0 interfaceC0425t0A = C0414n0.f6548c.a(cls);
                E eC = interfaceC0425t0A.c();
                int iT = y0.T(eC, interfaceC0425t0A, bArr, i, i5, c0396e);
                interfaceC0425t0A.d(eC);
                c0396e.f6496c = eC;
                return iT;
            case 11:
                return y0.f(bArr, i, c0396e);
            case 16:
                int iL2 = y0.L(bArr, i, c0396e);
                c0396e.f6496c = Integer.valueOf(AbstractC0417p.h(c0396e.f6494a));
                return iL2;
            case N2.n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                int iN3 = y0.N(bArr, i, c0396e);
                c0396e.f6496c = Long.valueOf(AbstractC0417p.i(c0396e.f6495b));
                return iN3;
        }
    }

    public static boolean t(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof E) {
            return ((E) obj).n();
        }
        return true;
    }

    public final Object A(Object obj, int i, int i5) {
        InterfaceC0425t0 interfaceC0425t0Q = q(i5);
        if (!u(obj, i, i5)) {
            return interfaceC0425t0Q.c();
        }
        Object object = f6503o.getObject(obj, V(i5) & 1048575);
        if (t(object)) {
            return object;
        }
        E eC = interfaceC0425t0Q.c();
        if (object != null) {
            interfaceC0425t0Q.b(eC, object);
        }
        return eC;
    }

    public final int G(Object obj, byte[] bArr, int i, int i5, int i6, long j5, C0396e c0396e) throws N {
        Unsafe unsafe = f6503o;
        Object objP = p(i6);
        Object object = unsafe.getObject(obj, j5);
        this.f6514m.getClass();
        if (C0393c0.d(object)) {
            C0391b0 c0391b0F = C0393c0.f();
            C0393c0.e(c0391b0F, object);
            unsafe.putObject(obj, j5, c0391b0F);
            object = c0391b0F;
        }
        Z zA = C0393c0.a(objP);
        C0391b0 c0391b0B = C0393c0.b(object);
        int iL = y0.L(bArr, i, c0396e);
        int i7 = c0396e.f6494a;
        if (i7 < 0 || i7 > i5 - iL) {
            throw N.h();
        }
        int i8 = i7 + iL;
        Object obj2 = "";
        Object obj3 = zA.f6484c;
        Object obj4 = obj3;
        while (iL < i8) {
            int iK = iL + 1;
            int i9 = bArr[iL];
            if (i9 < 0) {
                iK = y0.K(i9, bArr, iK, c0396e);
                i9 = c0396e.f6494a;
            }
            int i10 = iK;
            int i11 = i9 >>> 3;
            int i12 = i9 & 7;
            if (i11 != 1) {
                if (i11 == 2) {
                    U0 u02 = zA.f6483b;
                    if (i12 == u02.f6466b) {
                        iL = m(bArr, i10, i5, u02, obj3.getClass(), c0396e);
                        obj4 = c0396e.f6496c;
                    }
                }
                iL = y0.V(i9, bArr, i10, i5, c0396e);
            } else {
                Q0 q02 = zA.f6482a;
                if (i12 == q02.f6466b) {
                    iL = m(bArr, i10, i5, q02, null, c0396e);
                    obj2 = c0396e.f6496c;
                } else {
                    iL = y0.V(i9, bArr, i10, i5, c0396e);
                }
            }
        }
        if (iL != i8) {
            throw N.g();
        }
        c0391b0B.put(obj2, obj4);
        return i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0308, code lost:
    
        if (r0 != r33) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x030a, code lost:
    
        r15 = r31;
        r13 = r32;
        r3 = r19;
        r11 = r34;
        r10 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0323, code lost:
    
        r6 = r19;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0355, code lost:
    
        if (r0 != r15) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0375, code lost:
    
        if (r0 != r15) goto L113;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:36:0x00b8. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int H(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, com.google.protobuf.C0396e r36) {
        /*
            Method dump skipped, instructions count: 1044
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C0400g0.H(java.lang.Object, byte[], int, int, int, com.google.protobuf.e):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int I(Object obj, byte[] bArr, int i, int i5, int i6, int i7, int i8, int i9, int i10, long j5, int i11, C0396e c0396e) throws N {
        int iT;
        Unsafe unsafe = f6503o;
        long j6 = this.f6504a[i11 + 2] & 1048575;
        switch (i10) {
            case 51:
                if (i8 == 1) {
                    unsafe.putObject(obj, j5, Double.valueOf(y0.h(bArr, i)));
                    int i12 = i + 8;
                    unsafe.putInt(obj, j6, i7);
                    return i12;
                }
                return i;
            case 52:
                if (i8 == 5) {
                    unsafe.putObject(obj, j5, Float.valueOf(y0.n(bArr, i)));
                    int i13 = i + 4;
                    unsafe.putInt(obj, j6, i7);
                    return i13;
                }
                return i;
            case 53:
            case 54:
                if (i8 == 0) {
                    int iN = y0.N(bArr, i, c0396e);
                    unsafe.putObject(obj, j5, Long.valueOf(c0396e.f6495b));
                    unsafe.putInt(obj, j6, i7);
                    return iN;
                }
                return i;
            case 55:
            case 62:
                if (i8 == 0) {
                    int iL = y0.L(bArr, i, c0396e);
                    unsafe.putObject(obj, j5, Integer.valueOf(c0396e.f6494a));
                    unsafe.putInt(obj, j6, i7);
                    return iL;
                }
                return i;
            case 56:
            case 65:
                if (i8 == 1) {
                    unsafe.putObject(obj, j5, Long.valueOf(y0.l(bArr, i)));
                    int i14 = i + 8;
                    unsafe.putInt(obj, j6, i7);
                    return i14;
                }
                return i;
            case 57:
            case 64:
                if (i8 == 5) {
                    unsafe.putObject(obj, j5, Integer.valueOf(y0.j(bArr, i)));
                    int i15 = i + 4;
                    unsafe.putInt(obj, j6, i7);
                    return i15;
                }
                return i;
            case 58:
                if (i8 == 0) {
                    int iN2 = y0.N(bArr, i, c0396e);
                    unsafe.putObject(obj, j5, Boolean.valueOf(c0396e.f6495b != 0));
                    unsafe.putInt(obj, j6, i7);
                    return iN2;
                }
                return i;
            case 59:
                if (i8 == 2) {
                    int iL2 = y0.L(bArr, i, c0396e);
                    int i16 = c0396e.f6494a;
                    if (i16 == 0) {
                        unsafe.putObject(obj, j5, "");
                    } else {
                        if ((i9 & 536870912) != 0 && !P0.f(bArr, iL2, iL2 + i16)) {
                            throw N.c();
                        }
                        unsafe.putObject(obj, j5, new String(bArr, iL2, i16, L.f6425a));
                        iL2 += i16;
                    }
                    unsafe.putInt(obj, j6, i7);
                    return iL2;
                }
                return i;
            case 60:
                if (i8 == 2) {
                    Object objA = A(obj, i7, i11);
                    iT = y0.T(objA, q(i11), bArr, i, i5, c0396e);
                    T(obj, i7, i11, objA);
                    break;
                }
                return i;
            case 61:
                if (i8 == 2) {
                    int iF = y0.f(bArr, i, c0396e);
                    unsafe.putObject(obj, j5, c0396e.f6496c);
                    unsafe.putInt(obj, j6, i7);
                    return iF;
                }
                return i;
            case 63:
                if (i8 == 0) {
                    iT = y0.L(bArr, i, c0396e);
                    int i17 = c0396e.f6494a;
                    o(i11);
                    unsafe.putObject(obj, j5, Integer.valueOf(i17));
                    unsafe.putInt(obj, j6, i7);
                    break;
                }
                return i;
            case 66:
                if (i8 == 0) {
                    int iL3 = y0.L(bArr, i, c0396e);
                    unsafe.putObject(obj, j5, Integer.valueOf(AbstractC0417p.h(c0396e.f6494a)));
                    unsafe.putInt(obj, j6, i7);
                    return iL3;
                }
                return i;
            case 67:
                if (i8 == 0) {
                    int iN3 = y0.N(bArr, i, c0396e);
                    unsafe.putObject(obj, j5, Long.valueOf(AbstractC0417p.i(c0396e.f6495b)));
                    unsafe.putInt(obj, j6, i7);
                    return iN3;
                }
                return i;
            case 68:
                if (i8 == 3) {
                    Object objA2 = A(obj, i7, i11);
                    iT = y0.S(objA2, q(i11), bArr, i, i5, (i6 & (-8)) | 4, c0396e);
                    T(obj, i7, i11, objA2);
                    break;
                }
                return i;
            default:
                return i;
        }
        return iT;
    }

    public final int J(Object obj, byte[] bArr, int i, int i5, int i6, int i7, int i8, long j5, int i9, long j6, C0396e c0396e) throws N {
        int iM;
        Unsafe unsafe = f6503o;
        AbstractC0390b abstractC0390b = (AbstractC0390b) ((K) unsafe.getObject(obj, j6));
        boolean zG = abstractC0390b.g();
        K k5 = abstractC0390b;
        if (!zG) {
            int size = abstractC0390b.size();
            K kC = abstractC0390b.c(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j6, kC);
            k5 = kC;
        }
        switch (i9) {
            case N2.n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 35:
                if (i7 == 2) {
                    return y0.s(bArr, i, k5, c0396e);
                }
                if (i7 == 1) {
                    return y0.i(i6, bArr, i, i5, k5, c0396e);
                }
                break;
            case 19:
            case 36:
                if (i7 == 2) {
                    return y0.v(bArr, i, k5, c0396e);
                }
                if (i7 == 5) {
                    return y0.o(i6, bArr, i, i5, k5, c0396e);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i7 == 2) {
                    return y0.z(bArr, i, k5, c0396e);
                }
                if (i7 == 0) {
                    return y0.O(i6, bArr, i, i5, k5, c0396e);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i7 == 2) {
                    return y0.y(bArr, i, k5, c0396e);
                }
                if (i7 == 0) {
                    return y0.M(i6, bArr, i, i5, k5, c0396e);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i7 == 2) {
                    return y0.u(bArr, i, k5, c0396e);
                }
                if (i7 == 1) {
                    return y0.m(i6, bArr, i, i5, k5, c0396e);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i7 == 2) {
                    return y0.t(bArr, i, k5, c0396e);
                }
                if (i7 == 5) {
                    return y0.k(i6, bArr, i, i5, k5, c0396e);
                }
                break;
            case 25:
            case 42:
                if (i7 == 2) {
                    return y0.r(bArr, i, k5, c0396e);
                }
                if (i7 == 0) {
                    return y0.e(i6, bArr, i, i5, k5, c0396e);
                }
                break;
            case 26:
                if (i7 == 2) {
                    return (j5 & 536870912) == 0 ? y0.D(i6, bArr, i, i5, k5, c0396e) : y0.E(i6, bArr, i, i5, k5, c0396e);
                }
                break;
            case 27:
                if (i7 == 2) {
                    return y0.q(q(i8), i6, bArr, i, i5, k5, c0396e);
                }
                break;
            case 28:
                if (i7 == 2) {
                    return y0.g(i6, bArr, i, i5, k5, c0396e);
                }
                break;
            case 30:
            case 44:
                if (i7 == 2) {
                    iM = y0.y(bArr, i, k5, c0396e);
                } else if (i7 == 0) {
                    iM = y0.M(i6, bArr, i, i5, k5, c0396e);
                }
                o(i8);
                Class cls = AbstractC0426u0.f6587a;
                return iM;
            case 33:
            case 47:
                if (i7 == 2) {
                    return y0.w(bArr, i, k5, c0396e);
                }
                if (i7 == 0) {
                    return y0.A(i6, bArr, i, i5, k5, c0396e);
                }
                break;
            case 34:
            case 48:
                if (i7 == 2) {
                    return y0.x(bArr, i, k5, c0396e);
                }
                if (i7 == 0) {
                    return y0.B(i6, bArr, i, i5, k5, c0396e);
                }
                break;
            case 49:
                if (i7 == 3) {
                    return y0.p(q(i8), i6, bArr, i, i5, k5, c0396e);
                }
                break;
        }
        return i;
    }

    public final void K(Object obj, long j5, C0208k c0208k, InterfaceC0425t0 interfaceC0425t0, v vVar) throws M {
        int iE;
        List listC = this.f6512k.c(obj, j5);
        int i = c0208k.f4519b;
        if ((i & 7) != 3) {
            throw N.d();
        }
        do {
            E eC = interfaceC0425t0.c();
            c0208k.e(eC, interfaceC0425t0, vVar);
            interfaceC0425t0.d(eC);
            listC.add(eC);
            AbstractC0417p abstractC0417p = (AbstractC0417p) c0208k.f4522e;
            if (abstractC0417p.l() || c0208k.f4521d != 0) {
                return;
            } else {
                iE = abstractC0417p.E();
            }
        } while (iE == i);
        c0208k.f4521d = iE;
    }

    public final void L(Object obj, int i, C0208k c0208k, InterfaceC0425t0 interfaceC0425t0, v vVar) throws N {
        int iE;
        List listC = this.f6512k.c(obj, i & 1048575);
        int i5 = c0208k.f4519b;
        if ((i5 & 7) != 2) {
            throw N.d();
        }
        do {
            E eC = interfaceC0425t0.c();
            c0208k.g(eC, interfaceC0425t0, vVar);
            interfaceC0425t0.d(eC);
            listC.add(eC);
            AbstractC0417p abstractC0417p = (AbstractC0417p) c0208k.f4522e;
            if (abstractC0417p.l() || c0208k.f4521d != 0) {
                return;
            } else {
                iE = abstractC0417p.E();
            }
        } while (iE == i5);
        c0208k.f4521d = iE;
    }

    public final void M(int i, C0208k c0208k, Object obj) throws C0221y, M {
        if ((536870912 & i) != 0) {
            c0208k.S(2);
            M0.s(obj, i & 1048575, ((AbstractC0417p) c0208k.f4522e).D());
        } else if (!this.f6509f) {
            M0.s(obj, i & 1048575, c0208k.k());
        } else {
            c0208k.S(2);
            M0.s(obj, i & 1048575, ((AbstractC0417p) c0208k.f4522e).C());
        }
    }

    public final void N(int i, C0208k c0208k, Object obj) throws C0221y, M {
        boolean z4 = (536870912 & i) != 0;
        V v4 = this.f6512k;
        if (z4) {
            c0208k.M(v4.c(obj, i & 1048575), true);
        } else {
            c0208k.M(v4.c(obj, i & 1048575), false);
        }
    }

    public final void P(int i, Object obj) {
        int i5 = this.f6504a[i + 2];
        long j5 = 1048575 & i5;
        if (j5 == 1048575) {
            return;
        }
        M0.q(obj, j5, (1 << (i5 >>> 20)) | M0.f6430b.i(obj, j5));
    }

    public final void Q(Object obj, int i, int i5) {
        M0.q(obj, this.f6504a[i5 + 2] & 1048575, i);
    }

    public final int R(int i, int i5) {
        int[] iArr = this.f6504a;
        int length = (iArr.length / 3) - 1;
        while (i5 <= length) {
            int i6 = (length + i5) >>> 1;
            int i7 = i6 * 3;
            int i8 = iArr[i7];
            if (i == i8) {
                return i7;
            }
            if (i < i8) {
                length = i6 - 1;
            } else {
                i5 = i6 + 1;
            }
        }
        return -1;
    }

    public final void S(int i, Object obj, Object obj2) {
        f6503o.putObject(obj, V(i) & 1048575, obj2);
        P(i, obj);
    }

    public final void T(Object obj, int i, int i5, Object obj2) {
        f6503o.putObject(obj, V(i5) & 1048575, obj2);
        Q(obj, i, i5);
    }

    public final int V(int i) {
        return this.f6504a[i + 1];
    }

    public final void W(Object obj, Y y4) {
        int i;
        int i5;
        int i6;
        int i7;
        int[] iArr = this.f6504a;
        int length = iArr.length;
        Unsafe unsafe = f6503o;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i11 < length) {
            int iV = V(i11);
            int i12 = iArr[i11];
            int iU = U(iV);
            if (iU <= 17) {
                int i13 = iArr[i11 + 2];
                int i14 = i13 & i8;
                if (i14 != i9) {
                    i10 = i14 == i8 ? 0 : unsafe.getInt(obj, i14);
                    i9 = i14;
                }
                i = i9;
                i5 = i10;
                i6 = 1 << (i13 >>> 20);
            } else {
                i = i9;
                i5 = i10;
                i6 = 0;
            }
            long j5 = iV & i8;
            switch (iU) {
                case 0:
                    i7 = i;
                    if (s(obj, i11, i7, i5, i6)) {
                        y4.d(i12, M0.f6430b.g(obj, j5));
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case 1:
                    i7 = i;
                    if (s(obj, i11, i7, i5, i6)) {
                        y4.h(i12, M0.f6430b.h(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case 2:
                    i7 = i;
                    if (s(obj, i11, i7, i5, i6)) {
                        y4.k(i12, unsafe.getLong(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case 3:
                    i7 = i;
                    if (s(obj, i11, i7, i5, i6)) {
                        y4.r(i12, unsafe.getLong(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case 4:
                    i7 = i;
                    if (s(obj, i11, i7, i5, i6)) {
                        y4.j(i12, unsafe.getInt(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case 5:
                    i7 = i;
                    if (s(obj, i11, i7, i5, i6)) {
                        y4.g(i12, unsafe.getLong(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case 6:
                    i7 = i;
                    if (s(obj, i11, i7, i5, i6)) {
                        y4.f(i12, unsafe.getInt(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case 7:
                    i7 = i;
                    if (s(obj, i11, i7, i5, i6)) {
                        y4.b(i12, M0.f6430b.d(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case 8:
                    i7 = i;
                    if (s(obj, i11, i7, i5, i6)) {
                        Object object = unsafe.getObject(obj, j5);
                        if (object instanceof String) {
                            ((AbstractC0422s) y4.f6481a).I0(i12, (String) object);
                        } else {
                            y4.c(i12, (AbstractC0409l) object);
                        }
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case N2.n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    i7 = i;
                    if (s(obj, i11, i7, i5, i6)) {
                        y4.l(i12, unsafe.getObject(obj, j5), q(i11));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case N2.n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    i7 = i;
                    if (s(obj, i11, i7, i5, i6)) {
                        y4.c(i12, (AbstractC0409l) unsafe.getObject(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case 11:
                    i7 = i;
                    if (s(obj, i11, i7, i5, i6)) {
                        y4.q(i12, unsafe.getInt(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case N2.j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    i7 = i;
                    if (s(obj, i11, i7, i5, i6)) {
                        y4.e(i12, unsafe.getInt(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case 13:
                    i7 = i;
                    if (s(obj, i11, i7, i5, i6)) {
                        y4.m(i12, unsafe.getInt(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case 14:
                    i7 = i;
                    if (s(obj, i11, i7, i5, i6)) {
                        y4.n(i12, unsafe.getLong(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case 15:
                    i7 = i;
                    if (s(obj, i11, i7, i5, i6)) {
                        y4.o(i12, unsafe.getInt(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case 16:
                    i7 = i;
                    if (s(obj, i11, i7, i5, i6)) {
                        y4.p(i12, unsafe.getLong(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case N2.n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i7 = i;
                    if (s(obj, i11, i, i5, i6)) {
                        y4.i(i12, unsafe.getObject(obj, j5), q(i11));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case N2.n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    AbstractC0426u0.E(iArr[i11], (List) unsafe.getObject(obj, j5), y4, false);
                    break;
                case 19:
                    AbstractC0426u0.I(iArr[i11], (List) unsafe.getObject(obj, j5), y4, false);
                    break;
                case 20:
                    AbstractC0426u0.L(iArr[i11], (List) unsafe.getObject(obj, j5), y4, false);
                    break;
                case 21:
                    AbstractC0426u0.T(iArr[i11], (List) unsafe.getObject(obj, j5), y4, false);
                    break;
                case 22:
                    AbstractC0426u0.K(iArr[i11], (List) unsafe.getObject(obj, j5), y4, false);
                    break;
                case 23:
                    AbstractC0426u0.H(iArr[i11], (List) unsafe.getObject(obj, j5), y4, false);
                    break;
                case 24:
                    AbstractC0426u0.G(iArr[i11], (List) unsafe.getObject(obj, j5), y4, false);
                    break;
                case 25:
                    AbstractC0426u0.C(iArr[i11], (List) unsafe.getObject(obj, j5), y4, false);
                    break;
                case 26:
                    AbstractC0426u0.R(iArr[i11], (List) unsafe.getObject(obj, j5), y4);
                    break;
                case 27:
                    AbstractC0426u0.M(iArr[i11], (List) unsafe.getObject(obj, j5), y4, q(i11));
                    break;
                case 28:
                    AbstractC0426u0.D(iArr[i11], (List) unsafe.getObject(obj, j5), y4);
                    break;
                case 29:
                    AbstractC0426u0.S(iArr[i11], (List) unsafe.getObject(obj, j5), y4, false);
                    break;
                case 30:
                    AbstractC0426u0.F(iArr[i11], (List) unsafe.getObject(obj, j5), y4, false);
                    break;
                case 31:
                    AbstractC0426u0.N(iArr[i11], (List) unsafe.getObject(obj, j5), y4, false);
                    break;
                case 32:
                    AbstractC0426u0.O(iArr[i11], (List) unsafe.getObject(obj, j5), y4, false);
                    break;
                case 33:
                    AbstractC0426u0.P(iArr[i11], (List) unsafe.getObject(obj, j5), y4, false);
                    break;
                case 34:
                    AbstractC0426u0.Q(iArr[i11], (List) unsafe.getObject(obj, j5), y4, false);
                    break;
                case 35:
                    AbstractC0426u0.E(iArr[i11], (List) unsafe.getObject(obj, j5), y4, true);
                    break;
                case 36:
                    AbstractC0426u0.I(iArr[i11], (List) unsafe.getObject(obj, j5), y4, true);
                    break;
                case 37:
                    AbstractC0426u0.L(iArr[i11], (List) unsafe.getObject(obj, j5), y4, true);
                    break;
                case 38:
                    AbstractC0426u0.T(iArr[i11], (List) unsafe.getObject(obj, j5), y4, true);
                    break;
                case 39:
                    AbstractC0426u0.K(iArr[i11], (List) unsafe.getObject(obj, j5), y4, true);
                    break;
                case 40:
                    AbstractC0426u0.H(iArr[i11], (List) unsafe.getObject(obj, j5), y4, true);
                    break;
                case 41:
                    AbstractC0426u0.G(iArr[i11], (List) unsafe.getObject(obj, j5), y4, true);
                    break;
                case 42:
                    AbstractC0426u0.C(iArr[i11], (List) unsafe.getObject(obj, j5), y4, true);
                    break;
                case 43:
                    AbstractC0426u0.S(iArr[i11], (List) unsafe.getObject(obj, j5), y4, true);
                    break;
                case 44:
                    AbstractC0426u0.F(iArr[i11], (List) unsafe.getObject(obj, j5), y4, true);
                    break;
                case 45:
                    AbstractC0426u0.N(iArr[i11], (List) unsafe.getObject(obj, j5), y4, true);
                    break;
                case 46:
                    AbstractC0426u0.O(iArr[i11], (List) unsafe.getObject(obj, j5), y4, true);
                    break;
                case 47:
                    AbstractC0426u0.P(iArr[i11], (List) unsafe.getObject(obj, j5), y4, true);
                    break;
                case 48:
                    AbstractC0426u0.Q(iArr[i11], (List) unsafe.getObject(obj, j5), y4, true);
                    break;
                case 49:
                    AbstractC0426u0.J(iArr[i11], (List) unsafe.getObject(obj, j5), y4, q(i11));
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j5);
                    if (object2 != null) {
                        Object objP = p(i11);
                        this.f6514m.getClass();
                        Z z4 = ((C0389a0) objP).f6485a;
                        AbstractC0422s abstractC0422s = (AbstractC0422s) y4.f6481a;
                        abstractC0422s.getClass();
                        for (Map.Entry entry : ((C0391b0) object2).entrySet()) {
                            abstractC0422s.K0(i12, 2);
                            abstractC0422s.M0(C0389a0.a(z4, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            C0430y.b(abstractC0422s, z4.f6482a, 1, key);
                            C0430y.b(abstractC0422s, z4.f6483b, 2, value);
                        }
                        break;
                    }
                    break;
                case 51:
                    if (u(obj, i12, i11)) {
                        y4.d(i12, ((Double) M0.f6430b.k(obj, j5)).doubleValue());
                        break;
                    }
                    break;
                case 52:
                    if (u(obj, i12, i11)) {
                        y4.h(i12, ((Float) M0.f6430b.k(obj, j5)).floatValue());
                        break;
                    }
                    break;
                case 53:
                    if (u(obj, i12, i11)) {
                        y4.k(i12, F(obj, j5));
                        break;
                    }
                    break;
                case 54:
                    if (u(obj, i12, i11)) {
                        y4.r(i12, F(obj, j5));
                        break;
                    }
                    break;
                case 55:
                    if (u(obj, i12, i11)) {
                        y4.j(i12, E(obj, j5));
                        break;
                    }
                    break;
                case 56:
                    if (u(obj, i12, i11)) {
                        y4.g(i12, F(obj, j5));
                        break;
                    }
                    break;
                case 57:
                    if (u(obj, i12, i11)) {
                        y4.f(i12, E(obj, j5));
                        break;
                    }
                    break;
                case 58:
                    if (u(obj, i12, i11)) {
                        y4.b(i12, ((Boolean) M0.f6430b.k(obj, j5)).booleanValue());
                        break;
                    }
                    break;
                case 59:
                    if (u(obj, i12, i11)) {
                        Object object3 = unsafe.getObject(obj, j5);
                        if (object3 instanceof String) {
                            ((AbstractC0422s) y4.f6481a).I0(i12, (String) object3);
                            break;
                        } else {
                            y4.c(i12, (AbstractC0409l) object3);
                            break;
                        }
                    }
                    break;
                case 60:
                    if (u(obj, i12, i11)) {
                        y4.l(i12, unsafe.getObject(obj, j5), q(i11));
                        break;
                    }
                    break;
                case 61:
                    if (u(obj, i12, i11)) {
                        y4.c(i12, (AbstractC0409l) unsafe.getObject(obj, j5));
                        break;
                    }
                    break;
                case 62:
                    if (u(obj, i12, i11)) {
                        y4.q(i12, E(obj, j5));
                        break;
                    }
                    break;
                case 63:
                    if (u(obj, i12, i11)) {
                        y4.e(i12, E(obj, j5));
                        break;
                    }
                    break;
                case 64:
                    if (u(obj, i12, i11)) {
                        y4.m(i12, E(obj, j5));
                        break;
                    }
                    break;
                case 65:
                    if (u(obj, i12, i11)) {
                        y4.n(i12, F(obj, j5));
                        break;
                    }
                    break;
                case 66:
                    if (u(obj, i12, i11)) {
                        y4.o(i12, E(obj, j5));
                        break;
                    }
                    break;
                case 67:
                    if (u(obj, i12, i11)) {
                        y4.p(i12, F(obj, j5));
                        break;
                    }
                    break;
                case 68:
                    if (u(obj, i12, i11)) {
                        y4.i(i12, unsafe.getObject(obj, j5), q(i11));
                        break;
                    }
                    break;
            }
            i7 = i;
            i11 += 3;
            i9 = i7;
            i10 = i5;
            i8 = 1048575;
        }
        this.f6513l.getClass();
        ((E) obj).unknownFields.e(y4);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9  */
    @Override // com.google.protobuf.InterfaceC0425t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C0400g0.a(java.lang.Object):boolean");
    }

    @Override // com.google.protobuf.InterfaceC0425t0
    public final void b(Object obj, Object obj2) {
        l(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f6504a;
            if (i >= iArr.length) {
                AbstractC0426u0.A(this.f6513l, obj, obj2);
                return;
            }
            int iV = V(i);
            long j5 = 1048575 & iV;
            int i5 = iArr[i];
            switch (U(iV)) {
                case 0:
                    if (!r(i, obj2)) {
                        break;
                    } else {
                        M0.o(obj, j5, M0.f6430b.g(obj2, j5));
                        P(i, obj);
                        break;
                    }
                case 1:
                    if (!r(i, obj2)) {
                        break;
                    } else {
                        M0.p(obj, j5, M0.f6430b.h(obj2, j5));
                        P(i, obj);
                        break;
                    }
                case 2:
                    if (!r(i, obj2)) {
                        break;
                    } else {
                        M0.r(obj, j5, M0.f6430b.j(obj2, j5));
                        P(i, obj);
                        break;
                    }
                case 3:
                    if (!r(i, obj2)) {
                        break;
                    } else {
                        M0.r(obj, j5, M0.f6430b.j(obj2, j5));
                        P(i, obj);
                        break;
                    }
                case 4:
                    if (!r(i, obj2)) {
                        break;
                    } else {
                        M0.q(obj, j5, M0.f6430b.i(obj2, j5));
                        P(i, obj);
                        break;
                    }
                case 5:
                    if (!r(i, obj2)) {
                        break;
                    } else {
                        M0.r(obj, j5, M0.f6430b.j(obj2, j5));
                        P(i, obj);
                        break;
                    }
                case 6:
                    if (!r(i, obj2)) {
                        break;
                    } else {
                        M0.q(obj, j5, M0.f6430b.i(obj2, j5));
                        P(i, obj);
                        break;
                    }
                case 7:
                    if (!r(i, obj2)) {
                        break;
                    } else {
                        M0.k(obj, j5, M0.f6430b.d(obj2, j5));
                        P(i, obj);
                        break;
                    }
                case 8:
                    if (!r(i, obj2)) {
                        break;
                    } else {
                        M0.s(obj, j5, M0.f6430b.k(obj2, j5));
                        P(i, obj);
                        break;
                    }
                case N2.n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    x(i, obj, obj2);
                    break;
                case N2.n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    if (!r(i, obj2)) {
                        break;
                    } else {
                        M0.s(obj, j5, M0.f6430b.k(obj2, j5));
                        P(i, obj);
                        break;
                    }
                case 11:
                    if (!r(i, obj2)) {
                        break;
                    } else {
                        M0.q(obj, j5, M0.f6430b.i(obj2, j5));
                        P(i, obj);
                        break;
                    }
                case N2.j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (!r(i, obj2)) {
                        break;
                    } else {
                        M0.q(obj, j5, M0.f6430b.i(obj2, j5));
                        P(i, obj);
                        break;
                    }
                case 13:
                    if (!r(i, obj2)) {
                        break;
                    } else {
                        M0.q(obj, j5, M0.f6430b.i(obj2, j5));
                        P(i, obj);
                        break;
                    }
                case 14:
                    if (!r(i, obj2)) {
                        break;
                    } else {
                        M0.r(obj, j5, M0.f6430b.j(obj2, j5));
                        P(i, obj);
                        break;
                    }
                case 15:
                    if (!r(i, obj2)) {
                        break;
                    } else {
                        M0.q(obj, j5, M0.f6430b.i(obj2, j5));
                        P(i, obj);
                        break;
                    }
                case 16:
                    if (!r(i, obj2)) {
                        break;
                    } else {
                        M0.r(obj, j5, M0.f6430b.j(obj2, j5));
                        P(i, obj);
                        break;
                    }
                case N2.n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    x(i, obj, obj2);
                    break;
                case N2.n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f6512k.b(obj, j5, obj2);
                    break;
                case 50:
                    Class cls = AbstractC0426u0.f6587a;
                    L0 l02 = M0.f6430b;
                    Object objK = l02.k(obj, j5);
                    Object objK2 = l02.k(obj2, j5);
                    this.f6514m.getClass();
                    M0.s(obj, j5, C0393c0.e(objK, objK2));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!u(obj2, i5, i)) {
                        break;
                    } else {
                        M0.s(obj, j5, M0.f6430b.k(obj2, j5));
                        Q(obj, i5, i);
                        break;
                    }
                case 60:
                    y(i, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!u(obj2, i5, i)) {
                        break;
                    } else {
                        M0.s(obj, j5, M0.f6430b.k(obj2, j5));
                        Q(obj, i5, i);
                        break;
                    }
                case 68:
                    y(i, obj, obj2);
                    break;
            }
            i += 3;
        }
    }

    @Override // com.google.protobuf.InterfaceC0425t0
    public final E c() {
        this.f6511j.getClass();
        return ((E) this.f6508e).q();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    @Override // com.google.protobuf.InterfaceC0425t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = t(r9)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r9 instanceof com.google.protobuf.E
            if (r0 == 0) goto L17
            r0 = r9
            com.google.protobuf.E r0 = (com.google.protobuf.E) r0
            r0.h()
            r0.g()
            r0.o()
        L17:
            int[] r0 = r8.f6504a
            int r1 = r0.length
            r2 = 0
        L1b:
            if (r2 >= r1) goto L80
            int r3 = r8.V(r2)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r4 = (long) r4
            int r3 = U(r3)
            r6 = 9
            if (r3 == r6) goto L6a
            r6 = 60
            if (r3 == r6) goto L54
            r6 = 68
            if (r3 == r6) goto L54
            switch(r3) {
                case 17: goto L6a;
                case 18: goto L4e;
                case 19: goto L4e;
                case 20: goto L4e;
                case 21: goto L4e;
                case 22: goto L4e;
                case 23: goto L4e;
                case 24: goto L4e;
                case 25: goto L4e;
                case 26: goto L4e;
                case 27: goto L4e;
                case 28: goto L4e;
                case 29: goto L4e;
                case 30: goto L4e;
                case 31: goto L4e;
                case 32: goto L4e;
                case 33: goto L4e;
                case 34: goto L4e;
                case 35: goto L4e;
                case 36: goto L4e;
                case 37: goto L4e;
                case 38: goto L4e;
                case 39: goto L4e;
                case 40: goto L4e;
                case 41: goto L4e;
                case 42: goto L4e;
                case 43: goto L4e;
                case 44: goto L4e;
                case 45: goto L4e;
                case 46: goto L4e;
                case 47: goto L4e;
                case 48: goto L4e;
                case 49: goto L4e;
                case 50: goto L3a;
                default: goto L39;
            }
        L39:
            goto L7d
        L3a:
            sun.misc.Unsafe r3 = com.google.protobuf.C0400g0.f6503o
            java.lang.Object r6 = r3.getObject(r9, r4)
            if (r6 == 0) goto L7d
            com.google.protobuf.c0 r7 = r8.f6514m
            r7.getClass()
            com.google.protobuf.C0393c0.g(r6)
            r3.putObject(r9, r4, r6)
            goto L7d
        L4e:
            com.google.protobuf.V r3 = r8.f6512k
            r3.a(r9, r4)
            goto L7d
        L54:
            r3 = r0[r2]
            boolean r3 = r8.u(r9, r3, r2)
            if (r3 == 0) goto L7d
            com.google.protobuf.t0 r3 = r8.q(r2)
            sun.misc.Unsafe r6 = com.google.protobuf.C0400g0.f6503o
            java.lang.Object r4 = r6.getObject(r9, r4)
            r3.d(r4)
            goto L7d
        L6a:
            boolean r3 = r8.r(r2, r9)
            if (r3 == 0) goto L7d
            com.google.protobuf.t0 r3 = r8.q(r2)
            sun.misc.Unsafe r6 = com.google.protobuf.C0400g0.f6503o
            java.lang.Object r4 = r6.getObject(r9, r4)
            r3.d(r4)
        L7d:
            int r2 = r2 + 3
            goto L1b
        L80:
            com.google.protobuf.E0 r8 = r8.f6513l
            r8.getClass()
            com.google.protobuf.E0.b(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C0400g0.d(java.lang.Object):void");
    }

    @Override // com.google.protobuf.InterfaceC0425t0
    public final int e(E e5) {
        int i;
        int i5;
        int i6;
        int iA0;
        int iY;
        int i7;
        int iP0;
        int iR0;
        Unsafe unsafe = f6503o;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = this.f6504a;
            if (i11 >= iArr.length) {
                this.f6513l.getClass();
                return e5.unknownFields.b() + i12;
            }
            int iV = V(i11);
            int iU = U(iV);
            int i13 = iArr[i11];
            int i14 = iArr[i11 + 2];
            int i15 = i14 & i8;
            if (iU <= 17) {
                if (i15 != i9) {
                    i10 = i15 == i8 ? 0 : unsafe.getInt(e5, i15);
                    i9 = i15;
                }
                i = i9;
                i5 = i10;
                i6 = 1 << (i14 >>> 20);
            } else {
                i = i9;
                i5 = i10;
                i6 = 0;
            }
            long j5 = iV & i8;
            if (iU >= EnumC0431z.f6604b.a()) {
                EnumC0431z.f6605c.a();
            }
            switch (iU) {
                case 0:
                    if (!s(e5, i11, i, i5, i6)) {
                        break;
                    } else {
                        iA0 = AbstractC0422s.a0(i13);
                        i12 += iA0;
                        break;
                    }
                case 1:
                    if (!s(e5, i11, i, i5, i6)) {
                        break;
                    } else {
                        iA0 = AbstractC0422s.e0(i13);
                        i12 += iA0;
                        break;
                    }
                case 2:
                    if (!s(e5, i11, i, i5, i6)) {
                        break;
                    } else {
                        iA0 = AbstractC0422s.i0(i13, unsafe.getLong(e5, j5));
                        i12 += iA0;
                        break;
                    }
                case 3:
                    if (!s(e5, i11, i, i5, i6)) {
                        break;
                    } else {
                        iA0 = AbstractC0422s.s0(i13, unsafe.getLong(e5, j5));
                        i12 += iA0;
                        break;
                    }
                case 4:
                    if (!s(e5, i11, i, i5, i6)) {
                        break;
                    } else {
                        iA0 = AbstractC0422s.g0(i13, unsafe.getInt(e5, j5));
                        i12 += iA0;
                        break;
                    }
                case 5:
                    if (!s(e5, i11, i, i5, i6)) {
                        break;
                    } else {
                        iA0 = AbstractC0422s.d0(i13);
                        i12 += iA0;
                        break;
                    }
                case 6:
                    if (!s(e5, i11, i, i5, i6)) {
                        break;
                    } else {
                        iA0 = AbstractC0422s.c0(i13);
                        i12 += iA0;
                        break;
                    }
                case 7:
                    if (!s(e5, i11, i, i5, i6)) {
                        break;
                    } else {
                        iA0 = AbstractC0422s.X(i13);
                        i12 += iA0;
                        break;
                    }
                case 8:
                    if (!s(e5, i11, i, i5, i6)) {
                        break;
                    } else {
                        Object object = unsafe.getObject(e5, j5);
                        iY = object instanceof AbstractC0409l ? AbstractC0422s.Y(i13, (AbstractC0409l) object) : AbstractC0422s.n0(i13, (String) object);
                        i12 = iY + i12;
                        break;
                    }
                case N2.n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    if (!s(e5, i11, i, i5, i6)) {
                        break;
                    } else {
                        iA0 = AbstractC0426u0.o(i13, unsafe.getObject(e5, j5), q(i11));
                        i12 += iA0;
                        break;
                    }
                case N2.n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    if (!s(e5, i11, i, i5, i6)) {
                        break;
                    } else {
                        iA0 = AbstractC0422s.Y(i13, (AbstractC0409l) unsafe.getObject(e5, j5));
                        i12 += iA0;
                        break;
                    }
                case 11:
                    if (!s(e5, i11, i, i5, i6)) {
                        break;
                    } else {
                        iA0 = AbstractC0422s.q0(i13, unsafe.getInt(e5, j5));
                        i12 += iA0;
                        break;
                    }
                case N2.j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (!s(e5, i11, i, i5, i6)) {
                        break;
                    } else {
                        iA0 = AbstractC0422s.b0(i13, unsafe.getInt(e5, j5));
                        i12 += iA0;
                        break;
                    }
                case 13:
                    if (!s(e5, i11, i, i5, i6)) {
                        break;
                    } else {
                        iA0 = AbstractC0422s.j0(i13);
                        i12 += iA0;
                        break;
                    }
                case 14:
                    if (!s(e5, i11, i, i5, i6)) {
                        break;
                    } else {
                        iA0 = AbstractC0422s.k0(i13);
                        i12 += iA0;
                        break;
                    }
                case 15:
                    if (!s(e5, i11, i, i5, i6)) {
                        break;
                    } else {
                        iA0 = AbstractC0422s.l0(i13, unsafe.getInt(e5, j5));
                        i12 += iA0;
                        break;
                    }
                case 16:
                    if (!s(e5, i11, i, i5, i6)) {
                        break;
                    } else {
                        iA0 = AbstractC0422s.m0(i13, unsafe.getLong(e5, j5));
                        i12 += iA0;
                        break;
                    }
                case N2.n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (!s(e5, i11, i, i5, i6)) {
                        break;
                    } else {
                        iA0 = AbstractC0422s.f0(i13, (AbstractC0388a) unsafe.getObject(e5, j5), q(i11));
                        i12 += iA0;
                        break;
                    }
                case N2.n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    iA0 = AbstractC0426u0.h(i13, (List) unsafe.getObject(e5, j5));
                    i12 += iA0;
                    break;
                case 19:
                    iA0 = AbstractC0426u0.f(i13, (List) unsafe.getObject(e5, j5));
                    i12 += iA0;
                    break;
                case 20:
                    iA0 = AbstractC0426u0.m(i13, (List) unsafe.getObject(e5, j5));
                    i12 += iA0;
                    break;
                case 21:
                    iA0 = AbstractC0426u0.x(i13, (List) unsafe.getObject(e5, j5));
                    i12 += iA0;
                    break;
                case 22:
                    iA0 = AbstractC0426u0.k(i13, (List) unsafe.getObject(e5, j5));
                    i12 += iA0;
                    break;
                case 23:
                    iA0 = AbstractC0426u0.h(i13, (List) unsafe.getObject(e5, j5));
                    i12 += iA0;
                    break;
                case 24:
                    iA0 = AbstractC0426u0.f(i13, (List) unsafe.getObject(e5, j5));
                    i12 += iA0;
                    break;
                case 25:
                    iA0 = AbstractC0426u0.a(i13, (List) unsafe.getObject(e5, j5));
                    i12 += iA0;
                    break;
                case 26:
                    iA0 = AbstractC0426u0.u(i13, (List) unsafe.getObject(e5, j5));
                    i12 += iA0;
                    break;
                case 27:
                    iA0 = AbstractC0426u0.p(i13, (List) unsafe.getObject(e5, j5), q(i11));
                    i12 += iA0;
                    break;
                case 28:
                    iA0 = AbstractC0426u0.c(i13, (List) unsafe.getObject(e5, j5));
                    i12 += iA0;
                    break;
                case 29:
                    iA0 = AbstractC0426u0.v(i13, (List) unsafe.getObject(e5, j5));
                    i12 += iA0;
                    break;
                case 30:
                    iA0 = AbstractC0426u0.d(i13, (List) unsafe.getObject(e5, j5));
                    i12 += iA0;
                    break;
                case 31:
                    iA0 = AbstractC0426u0.f(i13, (List) unsafe.getObject(e5, j5));
                    i12 += iA0;
                    break;
                case 32:
                    iA0 = AbstractC0426u0.h(i13, (List) unsafe.getObject(e5, j5));
                    i12 += iA0;
                    break;
                case 33:
                    iA0 = AbstractC0426u0.q(i13, (List) unsafe.getObject(e5, j5));
                    i12 += iA0;
                    break;
                case 34:
                    iA0 = AbstractC0426u0.s(i13, (List) unsafe.getObject(e5, j5));
                    i12 += iA0;
                    break;
                case 35:
                    i7 = AbstractC0426u0.i((List) unsafe.getObject(e5, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        iP0 = AbstractC0422s.p0(i13);
                        iR0 = AbstractC0422s.r0(i7);
                        i12 += iR0 + iP0 + i7;
                        break;
                    }
                case 36:
                    i7 = AbstractC0426u0.g((List) unsafe.getObject(e5, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        iP0 = AbstractC0422s.p0(i13);
                        iR0 = AbstractC0422s.r0(i7);
                        i12 += iR0 + iP0 + i7;
                        break;
                    }
                case 37:
                    i7 = AbstractC0426u0.n((List) unsafe.getObject(e5, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        iP0 = AbstractC0422s.p0(i13);
                        iR0 = AbstractC0422s.r0(i7);
                        i12 += iR0 + iP0 + i7;
                        break;
                    }
                case 38:
                    i7 = AbstractC0426u0.y((List) unsafe.getObject(e5, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        iP0 = AbstractC0422s.p0(i13);
                        iR0 = AbstractC0422s.r0(i7);
                        i12 += iR0 + iP0 + i7;
                        break;
                    }
                case 39:
                    i7 = AbstractC0426u0.l((List) unsafe.getObject(e5, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        iP0 = AbstractC0422s.p0(i13);
                        iR0 = AbstractC0422s.r0(i7);
                        i12 += iR0 + iP0 + i7;
                        break;
                    }
                case 40:
                    i7 = AbstractC0426u0.i((List) unsafe.getObject(e5, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        iP0 = AbstractC0422s.p0(i13);
                        iR0 = AbstractC0422s.r0(i7);
                        i12 += iR0 + iP0 + i7;
                        break;
                    }
                case 41:
                    i7 = AbstractC0426u0.g((List) unsafe.getObject(e5, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        iP0 = AbstractC0422s.p0(i13);
                        iR0 = AbstractC0422s.r0(i7);
                        i12 += iR0 + iP0 + i7;
                        break;
                    }
                case 42:
                    i7 = AbstractC0426u0.b((List) unsafe.getObject(e5, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        iP0 = AbstractC0422s.p0(i13);
                        iR0 = AbstractC0422s.r0(i7);
                        i12 += iR0 + iP0 + i7;
                        break;
                    }
                case 43:
                    i7 = AbstractC0426u0.w((List) unsafe.getObject(e5, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        iP0 = AbstractC0422s.p0(i13);
                        iR0 = AbstractC0422s.r0(i7);
                        i12 += iR0 + iP0 + i7;
                        break;
                    }
                case 44:
                    i7 = AbstractC0426u0.e((List) unsafe.getObject(e5, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        iP0 = AbstractC0422s.p0(i13);
                        iR0 = AbstractC0422s.r0(i7);
                        i12 += iR0 + iP0 + i7;
                        break;
                    }
                case 45:
                    i7 = AbstractC0426u0.g((List) unsafe.getObject(e5, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        iP0 = AbstractC0422s.p0(i13);
                        iR0 = AbstractC0422s.r0(i7);
                        i12 += iR0 + iP0 + i7;
                        break;
                    }
                case 46:
                    i7 = AbstractC0426u0.i((List) unsafe.getObject(e5, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        iP0 = AbstractC0422s.p0(i13);
                        iR0 = AbstractC0422s.r0(i7);
                        i12 += iR0 + iP0 + i7;
                        break;
                    }
                case 47:
                    i7 = AbstractC0426u0.r((List) unsafe.getObject(e5, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        iP0 = AbstractC0422s.p0(i13);
                        iR0 = AbstractC0422s.r0(i7);
                        i12 += iR0 + iP0 + i7;
                        break;
                    }
                case 48:
                    i7 = AbstractC0426u0.t((List) unsafe.getObject(e5, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        iP0 = AbstractC0422s.p0(i13);
                        iR0 = AbstractC0422s.r0(i7);
                        i12 += iR0 + iP0 + i7;
                        break;
                    }
                case 49:
                    iA0 = AbstractC0426u0.j(i13, (List) unsafe.getObject(e5, j5), q(i11));
                    i12 += iA0;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(e5, j5);
                    Object objP = p(i11);
                    this.f6514m.getClass();
                    iA0 = C0393c0.c(i13, object2, objP);
                    i12 += iA0;
                    break;
                case 51:
                    if (!u(e5, i13, i11)) {
                        break;
                    } else {
                        iA0 = AbstractC0422s.a0(i13);
                        i12 += iA0;
                        break;
                    }
                case 52:
                    if (!u(e5, i13, i11)) {
                        break;
                    } else {
                        iA0 = AbstractC0422s.e0(i13);
                        i12 += iA0;
                        break;
                    }
                case 53:
                    if (!u(e5, i13, i11)) {
                        break;
                    } else {
                        iA0 = AbstractC0422s.i0(i13, F(e5, j5));
                        i12 += iA0;
                        break;
                    }
                case 54:
                    if (!u(e5, i13, i11)) {
                        break;
                    } else {
                        iA0 = AbstractC0422s.s0(i13, F(e5, j5));
                        i12 += iA0;
                        break;
                    }
                case 55:
                    if (!u(e5, i13, i11)) {
                        break;
                    } else {
                        iA0 = AbstractC0422s.g0(i13, E(e5, j5));
                        i12 += iA0;
                        break;
                    }
                case 56:
                    if (!u(e5, i13, i11)) {
                        break;
                    } else {
                        iA0 = AbstractC0422s.d0(i13);
                        i12 += iA0;
                        break;
                    }
                case 57:
                    if (!u(e5, i13, i11)) {
                        break;
                    } else {
                        iA0 = AbstractC0422s.c0(i13);
                        i12 += iA0;
                        break;
                    }
                case 58:
                    if (!u(e5, i13, i11)) {
                        break;
                    } else {
                        iA0 = AbstractC0422s.X(i13);
                        i12 += iA0;
                        break;
                    }
                case 59:
                    if (!u(e5, i13, i11)) {
                        break;
                    } else {
                        Object object3 = unsafe.getObject(e5, j5);
                        iY = object3 instanceof AbstractC0409l ? AbstractC0422s.Y(i13, (AbstractC0409l) object3) : AbstractC0422s.n0(i13, (String) object3);
                        i12 = iY + i12;
                        break;
                    }
                case 60:
                    if (!u(e5, i13, i11)) {
                        break;
                    } else {
                        iA0 = AbstractC0426u0.o(i13, unsafe.getObject(e5, j5), q(i11));
                        i12 += iA0;
                        break;
                    }
                case 61:
                    if (!u(e5, i13, i11)) {
                        break;
                    } else {
                        iA0 = AbstractC0422s.Y(i13, (AbstractC0409l) unsafe.getObject(e5, j5));
                        i12 += iA0;
                        break;
                    }
                case 62:
                    if (!u(e5, i13, i11)) {
                        break;
                    } else {
                        iA0 = AbstractC0422s.q0(i13, E(e5, j5));
                        i12 += iA0;
                        break;
                    }
                case 63:
                    if (!u(e5, i13, i11)) {
                        break;
                    } else {
                        iA0 = AbstractC0422s.b0(i13, E(e5, j5));
                        i12 += iA0;
                        break;
                    }
                case 64:
                    if (!u(e5, i13, i11)) {
                        break;
                    } else {
                        iA0 = AbstractC0422s.j0(i13);
                        i12 += iA0;
                        break;
                    }
                case 65:
                    if (!u(e5, i13, i11)) {
                        break;
                    } else {
                        iA0 = AbstractC0422s.k0(i13);
                        i12 += iA0;
                        break;
                    }
                case 66:
                    if (!u(e5, i13, i11)) {
                        break;
                    } else {
                        iA0 = AbstractC0422s.l0(i13, E(e5, j5));
                        i12 += iA0;
                        break;
                    }
                case 67:
                    if (!u(e5, i13, i11)) {
                        break;
                    } else {
                        iA0 = AbstractC0422s.m0(i13, F(e5, j5));
                        i12 += iA0;
                        break;
                    }
                case 68:
                    if (!u(e5, i13, i11)) {
                        break;
                    } else {
                        iA0 = AbstractC0422s.f0(i13, (AbstractC0388a) unsafe.getObject(e5, j5), q(i11));
                        i12 += iA0;
                        break;
                    }
            }
            i11 += 3;
            i9 = i;
            i10 = i5;
            i8 = 1048575;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // com.google.protobuf.InterfaceC0425t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(com.google.protobuf.E r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C0400g0.f(com.google.protobuf.E, java.lang.Object):boolean");
    }

    @Override // com.google.protobuf.InterfaceC0425t0
    public final void g(Object obj, Y y4) {
        y4.getClass();
        W(obj, y4);
    }

    @Override // com.google.protobuf.InterfaceC0425t0
    public final void h(Object obj, byte[] bArr, int i, int i5, C0396e c0396e) {
        H(obj, bArr, i, i5, 0, c0396e);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.protobuf.InterfaceC0425t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(com.google.protobuf.E r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C0400g0.i(com.google.protobuf.E):int");
    }

    @Override // com.google.protobuf.InterfaceC0425t0
    public final void j(Object obj, C0208k c0208k, v vVar) throws Throwable {
        vVar.getClass();
        l(obj);
        v(this.f6513l, obj, c0208k, vVar);
    }

    public final boolean k(E e5, Object obj, int i) {
        return r(i, e5) == r(i, obj);
    }

    public final void n(int i, Object obj, Object obj2) {
        int i5 = this.f6504a[i];
        if (M0.f6430b.k(obj, V(i) & 1048575) == null) {
            return;
        }
        o(i);
    }

    public final void o(int i) {
        if (this.f6505b[((i / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final Object p(int i) {
        return this.f6505b[(i / 3) * 2];
    }

    public final InterfaceC0425t0 q(int i) {
        int i5 = (i / 3) * 2;
        Object[] objArr = this.f6505b;
        InterfaceC0425t0 interfaceC0425t0 = (InterfaceC0425t0) objArr[i5];
        if (interfaceC0425t0 != null) {
            return interfaceC0425t0;
        }
        InterfaceC0425t0 interfaceC0425t0A = C0414n0.f6548c.a((Class) objArr[i5 + 1]);
        objArr[i5] = interfaceC0425t0A;
        return interfaceC0425t0A;
    }

    public final boolean r(int i, Object obj) {
        int i5 = this.f6504a[i + 2];
        long j5 = i5 & 1048575;
        if (j5 != 1048575) {
            return ((1 << (i5 >>> 20)) & M0.f6430b.i(obj, j5)) != 0;
        }
        int iV = V(i);
        long j6 = iV & 1048575;
        switch (U(iV)) {
            case 0:
                return Double.doubleToRawLongBits(M0.f6430b.g(obj, j6)) != 0;
            case 1:
                return Float.floatToRawIntBits(M0.f6430b.h(obj, j6)) != 0;
            case 2:
                return M0.f6430b.j(obj, j6) != 0;
            case 3:
                return M0.f6430b.j(obj, j6) != 0;
            case 4:
                return M0.f6430b.i(obj, j6) != 0;
            case 5:
                return M0.f6430b.j(obj, j6) != 0;
            case 6:
                return M0.f6430b.i(obj, j6) != 0;
            case 7:
                return M0.f6430b.d(obj, j6);
            case 8:
                Object objK = M0.f6430b.k(obj, j6);
                if (objK instanceof String) {
                    return !((String) objK).isEmpty();
                }
                if (objK instanceof AbstractC0409l) {
                    return !AbstractC0409l.f6528b.equals(objK);
                }
                throw new IllegalArgumentException();
            case N2.n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return M0.f6430b.k(obj, j6) != null;
            case N2.n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return !AbstractC0409l.f6528b.equals(M0.f6430b.k(obj, j6));
            case 11:
                return M0.f6430b.i(obj, j6) != 0;
            case N2.j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return M0.f6430b.i(obj, j6) != 0;
            case 13:
                return M0.f6430b.i(obj, j6) != 0;
            case 14:
                return M0.f6430b.j(obj, j6) != 0;
            case 15:
                return M0.f6430b.i(obj, j6) != 0;
            case 16:
                return M0.f6430b.j(obj, j6) != 0;
            case N2.n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return M0.f6430b.k(obj, j6) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean s(Object obj, int i, int i5, int i6, int i7) {
        return i5 == 1048575 ? r(i, obj) : (i6 & i7) != 0;
    }

    public final boolean u(Object obj, int i, int i5) {
        return M0.f6430b.i(obj, (long) (this.f6504a[i5 + 2] & 1048575)) == i;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x06a0 A[Catch: all -> 0x06c4, TryCatch #0 {all -> 0x06c4, blocks: (B:49:0x00c7, B:122:0x069b, B:124:0x06a0, B:125:0x06a5, B:50:0x00de, B:51:0x00f9, B:52:0x0115, B:53:0x0131, B:54:0x014f, B:55:0x016a, B:56:0x017e, B:57:0x0198, B:58:0x01a4, B:59:0x01bf, B:60:0x01db, B:61:0x01f7, B:62:0x0212, B:63:0x022d, B:64:0x0248, B:65:0x0264, B:66:0x0280, B:67:0x0295, B:69:0x02ab, B:70:0x02b0, B:71:0x02c2, B:72:0x02d4, B:73:0x02e6, B:74:0x02f8, B:75:0x0310, B:76:0x0322, B:77:0x0334, B:78:0x0346, B:79:0x0358, B:80:0x036a, B:81:0x037c, B:82:0x038e, B:83:0x03a0, B:84:0x03b2, B:85:0x03c4, B:86:0x03d6, B:87:0x03e8, B:88:0x03fa, B:89:0x0412, B:90:0x0424, B:91:0x0436, B:92:0x044d, B:93:0x0457, B:94:0x0469, B:95:0x047b, B:96:0x048d, B:97:0x049f, B:98:0x04b1, B:99:0x04c3, B:100:0x04d5, B:101:0x04e7, B:102:0x0502, B:103:0x051a, B:104:0x0532, B:105:0x054b, B:106:0x0564, B:107:0x057f, B:108:0x0597, B:109:0x05ac, B:110:0x05c7, B:111:0x05d4, B:112:0x05ec, B:113:0x0605, B:114:0x061e, B:115:0x0635, B:116:0x064c, B:117:0x0663, B:118:0x067b), top: B:145:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x06ab A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(com.google.protobuf.E0 r19, java.lang.Object r20, androidx.datastore.preferences.protobuf.C0208k r21, com.google.protobuf.v r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1902
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C0400g0.v(com.google.protobuf.E0, java.lang.Object, androidx.datastore.preferences.protobuf.k, com.google.protobuf.v):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009a, code lost:
    
        r9.put(r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
    
        r10.n(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(java.lang.Object r8, int r9, java.lang.Object r10, com.google.protobuf.v r11, androidx.datastore.preferences.protobuf.C0208k r12) throws androidx.datastore.preferences.protobuf.C0221y, com.google.protobuf.M {
        /*
            r7 = this;
            int r9 = r7.V(r9)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r9 & r0
            long r0 = (long) r9
            com.google.protobuf.L0 r9 = com.google.protobuf.M0.f6430b
            java.lang.Object r9 = r9.k(r8, r0)
            com.google.protobuf.c0 r7 = r7.f6514m
            if (r9 != 0) goto L20
            r7.getClass()
            com.google.protobuf.b0 r9 = com.google.protobuf.C0391b0.f6488b
            com.google.protobuf.b0 r9 = r9.c()
            com.google.protobuf.M0.s(r8, r0, r9)
            goto L36
        L20:
            r7.getClass()
            boolean r2 = com.google.protobuf.C0393c0.d(r9)
            if (r2 == 0) goto L36
            com.google.protobuf.b0 r2 = com.google.protobuf.C0391b0.f6488b
            com.google.protobuf.b0 r2 = r2.c()
            com.google.protobuf.C0393c0.e(r2, r9)
            com.google.protobuf.M0.s(r8, r0, r2)
            r9 = r2
        L36:
            r7.getClass()
            com.google.protobuf.b0 r9 = (com.google.protobuf.C0391b0) r9
            com.google.protobuf.a0 r10 = (com.google.protobuf.C0389a0) r10
            com.google.protobuf.Z r7 = r10.f6485a
            r8 = 2
            r12.S(r8)
            java.lang.Object r10 = r12.f4522e
            com.google.protobuf.p r10 = (com.google.protobuf.AbstractC0417p) r10
            int r0 = r10.F()
            int r0 = r10.o(r0)
            java.lang.String r1 = ""
            java.lang.Object r2 = r7.f6484c
            r3 = r2
        L54:
            int r4 = r12.c()     // Catch: java.lang.Throwable -> L78
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L9a
            boolean r5 = r10.l()     // Catch: java.lang.Throwable -> L78
            if (r5 == 0) goto L64
            goto L9a
        L64:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L85
            if (r4 == r8) goto L7a
            boolean r4 = r12.T()     // Catch: java.lang.Throwable -> L78 com.google.protobuf.M -> L8d
            if (r4 == 0) goto L72
            goto L54
        L72:
            com.google.protobuf.N r4 = new com.google.protobuf.N     // Catch: java.lang.Throwable -> L78 com.google.protobuf.M -> L8d
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L78 com.google.protobuf.M -> L8d
            throw r4     // Catch: java.lang.Throwable -> L78 com.google.protobuf.M -> L8d
        L78:
            r7 = move-exception
            goto La1
        L7a:
            com.google.protobuf.U0 r4 = r7.f6483b     // Catch: java.lang.Throwable -> L78 com.google.protobuf.M -> L8d
            java.lang.Class r5 = r2.getClass()     // Catch: java.lang.Throwable -> L78 com.google.protobuf.M -> L8d
            java.lang.Object r3 = r12.s(r4, r5, r11)     // Catch: java.lang.Throwable -> L78 com.google.protobuf.M -> L8d
            goto L54
        L85:
            com.google.protobuf.Q0 r4 = r7.f6482a     // Catch: java.lang.Throwable -> L78 com.google.protobuf.M -> L8d
            r5 = 0
            java.lang.Object r1 = r12.s(r4, r5, r5)     // Catch: java.lang.Throwable -> L78 com.google.protobuf.M -> L8d
            goto L54
        L8d:
            boolean r4 = r12.T()     // Catch: java.lang.Throwable -> L78
            if (r4 == 0) goto L94
            goto L54
        L94:
            com.google.protobuf.N r7 = new com.google.protobuf.N     // Catch: java.lang.Throwable -> L78
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L78
            throw r7     // Catch: java.lang.Throwable -> L78
        L9a:
            r9.put(r1, r3)     // Catch: java.lang.Throwable -> L78
            r10.n(r0)
            return
        La1:
            r10.n(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C0400g0.w(java.lang.Object, int, java.lang.Object, com.google.protobuf.v, androidx.datastore.preferences.protobuf.k):void");
    }

    public final void x(int i, Object obj, Object obj2) {
        if (r(i, obj2)) {
            long jV = V(i) & 1048575;
            Unsafe unsafe = f6503o;
            Object object = unsafe.getObject(obj2, jV);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f6504a[i] + " is present but null: " + obj2);
            }
            InterfaceC0425t0 interfaceC0425t0Q = q(i);
            if (!r(i, obj)) {
                if (t(object)) {
                    E eC = interfaceC0425t0Q.c();
                    interfaceC0425t0Q.b(eC, object);
                    unsafe.putObject(obj, jV, eC);
                } else {
                    unsafe.putObject(obj, jV, object);
                }
                P(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jV);
            if (!t(object2)) {
                E eC2 = interfaceC0425t0Q.c();
                interfaceC0425t0Q.b(eC2, object2);
                unsafe.putObject(obj, jV, eC2);
                object2 = eC2;
            }
            interfaceC0425t0Q.b(object2, object);
        }
    }

    public final void y(int i, Object obj, Object obj2) {
        int[] iArr = this.f6504a;
        int i5 = iArr[i];
        if (u(obj2, i5, i)) {
            long jV = V(i) & 1048575;
            Unsafe unsafe = f6503o;
            Object object = unsafe.getObject(obj2, jV);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            InterfaceC0425t0 interfaceC0425t0Q = q(i);
            if (!u(obj, i5, i)) {
                if (t(object)) {
                    E eC = interfaceC0425t0Q.c();
                    interfaceC0425t0Q.b(eC, object);
                    unsafe.putObject(obj, jV, eC);
                } else {
                    unsafe.putObject(obj, jV, object);
                }
                Q(obj, i5, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jV);
            if (!t(object2)) {
                E eC2 = interfaceC0425t0Q.c();
                interfaceC0425t0Q.b(eC2, object2);
                unsafe.putObject(obj, jV, eC2);
                object2 = eC2;
            }
            interfaceC0425t0Q.b(object2, object);
        }
    }

    public final Object z(int i, Object obj) {
        InterfaceC0425t0 interfaceC0425t0Q = q(i);
        long jV = V(i) & 1048575;
        if (!r(i, obj)) {
            return interfaceC0425t0Q.c();
        }
        Object object = f6503o.getObject(obj, jV);
        if (t(object)) {
            return object;
        }
        E eC = interfaceC0425t0Q.c();
        if (object != null) {
            interfaceC0425t0Q.b(eC, object);
        }
        return eC;
    }
}
