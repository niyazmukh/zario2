package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\M.smali */
public final class M implements V {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f4430n = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Unsafe f4431o = i0.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f4432a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f4433b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4434c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4435d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0198a f4436e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4437f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f4438g;
    public final int h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final O f4439j;

    /* renamed from: k, reason: collision with root package name */
    public final B f4440k;

    /* renamed from: l, reason: collision with root package name */
    public final d0 f4441l;

    /* renamed from: m, reason: collision with root package name */
    public final I f4442m;

    public M(int[] iArr, Object[] objArr, int i, int i5, AbstractC0198a abstractC0198a, int[] iArr2, int i6, int i7, O o5, B b5, d0 d0Var, C0212o c0212o, I i8) {
        this.f4432a = iArr;
        this.f4433b = objArr;
        this.f4434c = i;
        this.f4435d = i5;
        this.f4437f = abstractC0198a instanceof AbstractC0218v;
        this.f4438g = iArr2;
        this.h = i6;
        this.i = i7;
        this.f4439j = o5;
        this.f4440k = b5;
        this.f4441l = d0Var;
        this.f4436e = abstractC0198a;
        this.f4442m = i8;
    }

    public static long A(Object obj, long j5) {
        return ((Long) i0.f4510b.h(obj, j5)).longValue();
    }

    public static Field G(Class cls, String str) {
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

    public static int L(int i) {
        return (i & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0218v) {
            return ((AbstractC0218v) obj).i();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.datastore.preferences.protobuf.M x(androidx.datastore.preferences.protobuf.U r33, androidx.datastore.preferences.protobuf.O r34, androidx.datastore.preferences.protobuf.B r35, androidx.datastore.preferences.protobuf.d0 r36, androidx.datastore.preferences.protobuf.C0212o r37, androidx.datastore.preferences.protobuf.I r38) {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.x(androidx.datastore.preferences.protobuf.U, androidx.datastore.preferences.protobuf.O, androidx.datastore.preferences.protobuf.B, androidx.datastore.preferences.protobuf.d0, androidx.datastore.preferences.protobuf.o, androidx.datastore.preferences.protobuf.I):androidx.datastore.preferences.protobuf.M");
    }

    public static long y(int i) {
        return i & 1048575;
    }

    public static int z(Object obj, long j5) {
        return ((Integer) i0.f4510b.h(obj, j5)).intValue();
    }

    public final int B(int i) {
        if (i < this.f4434c || i > this.f4435d) {
            return -1;
        }
        int[] iArr = this.f4432a;
        int length = (iArr.length / 3) - 1;
        int i5 = 0;
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

    public final void C(Object obj, long j5, C0208k c0208k, V v4, C0211n c0211n) throws C0221y {
        int iU;
        this.f4440k.getClass();
        InterfaceC0219w interfaceC0219wB = B.b(obj, j5);
        int i = c0208k.f4519b;
        if ((i & 7) != 3) {
            throw C0222z.b();
        }
        do {
            AbstractC0218v abstractC0218vC = v4.c();
            c0208k.d(abstractC0218vC, v4, c0211n);
            v4.d(abstractC0218vC);
            ((T) interfaceC0219wB).add(abstractC0218vC);
            AbstractC0207j abstractC0207j = (AbstractC0207j) c0208k.f4522e;
            if (abstractC0207j.c() || c0208k.f4521d != 0) {
                return;
            } else {
                iU = abstractC0207j.u();
            }
        } while (iU == i);
        c0208k.f4521d = iU;
    }

    public final void D(Object obj, int i, C0208k c0208k, V v4, C0211n c0211n) throws C0222z {
        int iU;
        this.f4440k.getClass();
        InterfaceC0219w interfaceC0219wB = B.b(obj, i & 1048575);
        int i5 = c0208k.f4519b;
        if ((i5 & 7) != 2) {
            throw C0222z.b();
        }
        do {
            AbstractC0218v abstractC0218vC = v4.c();
            c0208k.f(abstractC0218vC, v4, c0211n);
            v4.d(abstractC0218vC);
            ((T) interfaceC0219wB).add(abstractC0218vC);
            AbstractC0207j abstractC0207j = (AbstractC0207j) c0208k.f4522e;
            if (abstractC0207j.c() || c0208k.f4521d != 0) {
                return;
            } else {
                iU = abstractC0207j.u();
            }
        } while (iU == i5);
        c0208k.f4521d = iU;
    }

    public final void E(int i, C0208k c0208k, Object obj) throws C0221y, com.google.protobuf.M {
        if ((536870912 & i) != 0) {
            c0208k.S(2);
            i0.o(obj, i & 1048575, ((AbstractC0207j) c0208k.f4522e).t());
        } else if (!this.f4437f) {
            i0.o(obj, i & 1048575, c0208k.j());
        } else {
            c0208k.S(2);
            i0.o(obj, i & 1048575, ((AbstractC0207j) c0208k.f4522e).s());
        }
    }

    public final void F(int i, C0208k c0208k, Object obj) throws C0221y, com.google.protobuf.M {
        boolean z4 = (536870912 & i) != 0;
        B b5 = this.f4440k;
        if (z4) {
            b5.getClass();
            c0208k.L(B.b(obj, i & 1048575), true);
        } else {
            b5.getClass();
            c0208k.L(B.b(obj, i & 1048575), false);
        }
    }

    public final void H(int i, Object obj) {
        int i5 = this.f4432a[i + 2];
        long j5 = 1048575 & i5;
        if (j5 == 1048575) {
            return;
        }
        i0.m(obj, j5, (1 << (i5 >>> 20)) | i0.f4510b.f(obj, j5));
    }

    public final void I(Object obj, int i, int i5) {
        i0.m(obj, this.f4432a[i5 + 2] & 1048575, i);
    }

    public final void J(Object obj, int i, AbstractC0198a abstractC0198a) {
        f4431o.putObject(obj, M(i) & 1048575, abstractC0198a);
        H(i, obj);
    }

    public final void K(Object obj, int i, int i5, AbstractC0198a abstractC0198a) {
        f4431o.putObject(obj, M(i5) & 1048575, abstractC0198a);
        I(obj, i, i5);
    }

    public final int M(int i) {
        return this.f4432a[i + 1];
    }

    public final void N(Object obj, E e5) throws O2.b {
        int i;
        int i5;
        int i6;
        int i7;
        int[] iArr = this.f4432a;
        int length = iArr.length;
        Unsafe unsafe = f4431o;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i11 < length) {
            int iM = M(i11);
            int i12 = iArr[i11];
            int iL = L(iM);
            if (iL <= 17) {
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
            long j5 = iM & i8;
            switch (iL) {
                case 0:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        e5.c(i12, i0.f4510b.d(obj, j5));
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case 1:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        e5.g(i12, i0.f4510b.e(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case 2:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        e5.j(i12, unsafe.getLong(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case 3:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        e5.q(i12, unsafe.getLong(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case 4:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        e5.i(i12, unsafe.getInt(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case 5:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        e5.f(i12, unsafe.getLong(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case 6:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        e5.e(i12, unsafe.getInt(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case 7:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        e5.a(i12, i0.f4510b.c(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case 8:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        Object object = unsafe.getObject(obj, j5);
                        if (object instanceof String) {
                            ((C0209l) e5.f4420a).k1(i12, (String) object);
                        } else {
                            e5.b(i12, (C0204g) object);
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
                    if (o(obj, i11, i7, i5, i6)) {
                        e5.k(i12, unsafe.getObject(obj, j5), m(i11));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case N2.n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        e5.b(i12, (C0204g) unsafe.getObject(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case 11:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        e5.p(i12, unsafe.getInt(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case N2.j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        e5.d(i12, unsafe.getInt(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case 13:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        e5.l(i12, unsafe.getInt(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case 14:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        e5.m(i12, unsafe.getLong(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case 15:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        e5.n(i12, unsafe.getInt(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case 16:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        e5.o(i12, unsafe.getLong(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case N2.n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i7 = i;
                    if (o(obj, i11, i, i5, i6)) {
                        e5.h(i12, unsafe.getObject(obj, j5), m(i11));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                case N2.n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    W.E(iArr[i11], (List) unsafe.getObject(obj, j5), e5, false);
                    break;
                case 19:
                    W.I(iArr[i11], (List) unsafe.getObject(obj, j5), e5, false);
                    break;
                case 20:
                    W.L(iArr[i11], (List) unsafe.getObject(obj, j5), e5, false);
                    break;
                case 21:
                    W.T(iArr[i11], (List) unsafe.getObject(obj, j5), e5, false);
                    break;
                case 22:
                    W.K(iArr[i11], (List) unsafe.getObject(obj, j5), e5, false);
                    break;
                case 23:
                    W.H(iArr[i11], (List) unsafe.getObject(obj, j5), e5, false);
                    break;
                case 24:
                    W.G(iArr[i11], (List) unsafe.getObject(obj, j5), e5, false);
                    break;
                case 25:
                    W.C(iArr[i11], (List) unsafe.getObject(obj, j5), e5, false);
                    break;
                case 26:
                    W.R(iArr[i11], (List) unsafe.getObject(obj, j5), e5);
                    break;
                case 27:
                    W.M(iArr[i11], (List) unsafe.getObject(obj, j5), e5, m(i11));
                    break;
                case 28:
                    W.D(iArr[i11], (List) unsafe.getObject(obj, j5), e5);
                    break;
                case 29:
                    W.S(iArr[i11], (List) unsafe.getObject(obj, j5), e5, false);
                    break;
                case 30:
                    W.F(iArr[i11], (List) unsafe.getObject(obj, j5), e5, false);
                    break;
                case 31:
                    W.N(iArr[i11], (List) unsafe.getObject(obj, j5), e5, false);
                    break;
                case 32:
                    W.O(iArr[i11], (List) unsafe.getObject(obj, j5), e5, false);
                    break;
                case 33:
                    W.P(iArr[i11], (List) unsafe.getObject(obj, j5), e5, false);
                    break;
                case 34:
                    W.Q(iArr[i11], (List) unsafe.getObject(obj, j5), e5, false);
                    break;
                case 35:
                    W.E(iArr[i11], (List) unsafe.getObject(obj, j5), e5, true);
                    break;
                case 36:
                    W.I(iArr[i11], (List) unsafe.getObject(obj, j5), e5, true);
                    break;
                case 37:
                    W.L(iArr[i11], (List) unsafe.getObject(obj, j5), e5, true);
                    break;
                case 38:
                    W.T(iArr[i11], (List) unsafe.getObject(obj, j5), e5, true);
                    break;
                case 39:
                    W.K(iArr[i11], (List) unsafe.getObject(obj, j5), e5, true);
                    break;
                case 40:
                    W.H(iArr[i11], (List) unsafe.getObject(obj, j5), e5, true);
                    break;
                case 41:
                    W.G(iArr[i11], (List) unsafe.getObject(obj, j5), e5, true);
                    break;
                case 42:
                    W.C(iArr[i11], (List) unsafe.getObject(obj, j5), e5, true);
                    break;
                case 43:
                    W.S(iArr[i11], (List) unsafe.getObject(obj, j5), e5, true);
                    break;
                case 44:
                    W.F(iArr[i11], (List) unsafe.getObject(obj, j5), e5, true);
                    break;
                case 45:
                    W.N(iArr[i11], (List) unsafe.getObject(obj, j5), e5, true);
                    break;
                case 46:
                    W.O(iArr[i11], (List) unsafe.getObject(obj, j5), e5, true);
                    break;
                case 47:
                    W.P(iArr[i11], (List) unsafe.getObject(obj, j5), e5, true);
                    break;
                case 48:
                    W.Q(iArr[i11], (List) unsafe.getObject(obj, j5), e5, true);
                    break;
                case 49:
                    W.J(iArr[i11], (List) unsafe.getObject(obj, j5), e5, m(i11));
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j5);
                    if (object2 != null) {
                        int i15 = 2;
                        Object obj2 = this.f4433b[(i11 / 3) * 2];
                        this.f4442m.getClass();
                        F f2 = ((G) obj2).f4424a;
                        C0209l c0209l = (C0209l) e5.f4420a;
                        c0209l.getClass();
                        for (Map.Entry entry : ((H) object2).entrySet()) {
                            c0209l.m1(i12, i15);
                            c0209l.o1(G.a(f2, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            C0214q.b(c0209l, f2.f4421a, 1, key);
                            C0214q.b(c0209l, f2.f4422b, 2, value);
                            i15 = 2;
                        }
                        break;
                    }
                    break;
                case 51:
                    if (q(obj, i12, i11)) {
                        e5.c(i12, ((Double) i0.f4510b.h(obj, j5)).doubleValue());
                        break;
                    }
                    break;
                case 52:
                    if (q(obj, i12, i11)) {
                        e5.g(i12, ((Float) i0.f4510b.h(obj, j5)).floatValue());
                        break;
                    }
                    break;
                case 53:
                    if (q(obj, i12, i11)) {
                        e5.j(i12, A(obj, j5));
                        break;
                    }
                    break;
                case 54:
                    if (q(obj, i12, i11)) {
                        e5.q(i12, A(obj, j5));
                        break;
                    }
                    break;
                case 55:
                    if (q(obj, i12, i11)) {
                        e5.i(i12, z(obj, j5));
                        break;
                    }
                    break;
                case 56:
                    if (q(obj, i12, i11)) {
                        e5.f(i12, A(obj, j5));
                        break;
                    }
                    break;
                case 57:
                    if (q(obj, i12, i11)) {
                        e5.e(i12, z(obj, j5));
                        break;
                    }
                    break;
                case 58:
                    if (q(obj, i12, i11)) {
                        e5.a(i12, ((Boolean) i0.f4510b.h(obj, j5)).booleanValue());
                        break;
                    }
                    break;
                case 59:
                    if (q(obj, i12, i11)) {
                        Object object3 = unsafe.getObject(obj, j5);
                        if (object3 instanceof String) {
                            ((C0209l) e5.f4420a).k1(i12, (String) object3);
                            break;
                        } else {
                            e5.b(i12, (C0204g) object3);
                            break;
                        }
                    }
                    break;
                case 60:
                    if (q(obj, i12, i11)) {
                        e5.k(i12, unsafe.getObject(obj, j5), m(i11));
                        break;
                    }
                    break;
                case 61:
                    if (q(obj, i12, i11)) {
                        e5.b(i12, (C0204g) unsafe.getObject(obj, j5));
                        break;
                    }
                    break;
                case 62:
                    if (q(obj, i12, i11)) {
                        e5.p(i12, z(obj, j5));
                        break;
                    }
                    break;
                case 63:
                    if (q(obj, i12, i11)) {
                        e5.d(i12, z(obj, j5));
                        break;
                    }
                    break;
                case 64:
                    if (q(obj, i12, i11)) {
                        e5.l(i12, z(obj, j5));
                        break;
                    }
                    break;
                case 65:
                    if (q(obj, i12, i11)) {
                        e5.m(i12, A(obj, j5));
                        break;
                    }
                    break;
                case 66:
                    if (q(obj, i12, i11)) {
                        e5.n(i12, z(obj, j5));
                        break;
                    }
                    break;
                case 67:
                    if (q(obj, i12, i11)) {
                        e5.o(i12, A(obj, j5));
                        break;
                    }
                    break;
                case 68:
                    if (q(obj, i12, i11)) {
                        e5.h(i12, unsafe.getObject(obj, j5), m(i11));
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
        this.f4441l.getClass();
        ((AbstractC0218v) obj).unknownFields.d(e5);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00dd  */
    @Override // androidx.datastore.preferences.protobuf.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.a(java.lang.Object):boolean");
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void b(Object obj, Object obj2) {
        if (!p(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f4432a;
            if (i >= iArr.length) {
                W.A(this.f4441l, obj, obj2);
                return;
            }
            int iM = M(i);
            long j5 = 1048575 & iM;
            int i5 = iArr[i];
            switch (L(iM)) {
                case 0:
                    if (!n(i, obj2)) {
                        break;
                    } else {
                        h0 h0Var = i0.f4510b;
                        h0Var.l(obj, j5, h0Var.d(obj2, j5));
                        H(i, obj);
                        break;
                    }
                case 1:
                    if (!n(i, obj2)) {
                        break;
                    } else {
                        h0 h0Var2 = i0.f4510b;
                        h0Var2.m(obj, j5, h0Var2.e(obj2, j5));
                        H(i, obj);
                        break;
                    }
                case 2:
                    if (!n(i, obj2)) {
                        break;
                    } else {
                        i0.n(obj, j5, i0.f4510b.g(obj2, j5));
                        H(i, obj);
                        break;
                    }
                case 3:
                    if (!n(i, obj2)) {
                        break;
                    } else {
                        i0.n(obj, j5, i0.f4510b.g(obj2, j5));
                        H(i, obj);
                        break;
                    }
                case 4:
                    if (!n(i, obj2)) {
                        break;
                    } else {
                        i0.m(obj, j5, i0.f4510b.f(obj2, j5));
                        H(i, obj);
                        break;
                    }
                case 5:
                    if (!n(i, obj2)) {
                        break;
                    } else {
                        i0.n(obj, j5, i0.f4510b.g(obj2, j5));
                        H(i, obj);
                        break;
                    }
                case 6:
                    if (!n(i, obj2)) {
                        break;
                    } else {
                        i0.m(obj, j5, i0.f4510b.f(obj2, j5));
                        H(i, obj);
                        break;
                    }
                case 7:
                    if (!n(i, obj2)) {
                        break;
                    } else {
                        h0 h0Var3 = i0.f4510b;
                        h0Var3.j(obj, j5, h0Var3.c(obj2, j5));
                        H(i, obj);
                        break;
                    }
                case 8:
                    if (!n(i, obj2)) {
                        break;
                    } else {
                        i0.o(obj, j5, i0.f4510b.h(obj2, j5));
                        H(i, obj);
                        break;
                    }
                case N2.n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    t(i, obj, obj2);
                    break;
                case N2.n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    if (!n(i, obj2)) {
                        break;
                    } else {
                        i0.o(obj, j5, i0.f4510b.h(obj2, j5));
                        H(i, obj);
                        break;
                    }
                case 11:
                    if (!n(i, obj2)) {
                        break;
                    } else {
                        i0.m(obj, j5, i0.f4510b.f(obj2, j5));
                        H(i, obj);
                        break;
                    }
                case N2.j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (!n(i, obj2)) {
                        break;
                    } else {
                        i0.m(obj, j5, i0.f4510b.f(obj2, j5));
                        H(i, obj);
                        break;
                    }
                case 13:
                    if (!n(i, obj2)) {
                        break;
                    } else {
                        i0.m(obj, j5, i0.f4510b.f(obj2, j5));
                        H(i, obj);
                        break;
                    }
                case 14:
                    if (!n(i, obj2)) {
                        break;
                    } else {
                        i0.n(obj, j5, i0.f4510b.g(obj2, j5));
                        H(i, obj);
                        break;
                    }
                case 15:
                    if (!n(i, obj2)) {
                        break;
                    } else {
                        i0.m(obj, j5, i0.f4510b.f(obj2, j5));
                        H(i, obj);
                        break;
                    }
                case 16:
                    if (!n(i, obj2)) {
                        break;
                    } else {
                        i0.n(obj, j5, i0.f4510b.g(obj2, j5));
                        H(i, obj);
                        break;
                    }
                case N2.n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    t(i, obj, obj2);
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
                    this.f4440k.getClass();
                    h0 h0Var4 = i0.f4510b;
                    InterfaceC0219w interfaceC0219wH = (InterfaceC0219w) h0Var4.h(obj, j5);
                    InterfaceC0219w interfaceC0219w = (InterfaceC0219w) h0Var4.h(obj2, j5);
                    T t4 = (T) interfaceC0219wH;
                    int i6 = t4.f4453c;
                    int i7 = ((T) interfaceC0219w).f4453c;
                    if (i6 > 0 && i7 > 0) {
                        if (!((AbstractC0199b) interfaceC0219wH).f4477a) {
                            interfaceC0219wH = t4.h(i7 + i6);
                        }
                        ((AbstractC0199b) interfaceC0219wH).addAll(interfaceC0219w);
                    }
                    if (i6 > 0) {
                        interfaceC0219w = interfaceC0219wH;
                    }
                    i0.o(obj, j5, interfaceC0219w);
                    break;
                case 50:
                    Class cls = W.f4458a;
                    h0 h0Var5 = i0.f4510b;
                    Object objH = h0Var5.h(obj, j5);
                    Object objH2 = h0Var5.h(obj2, j5);
                    this.f4442m.getClass();
                    i0.o(obj, j5, I.b(objH, objH2));
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
                    if (!q(obj2, i5, i)) {
                        break;
                    } else {
                        i0.o(obj, j5, i0.f4510b.h(obj2, j5));
                        I(obj, i5, i);
                        break;
                    }
                case 60:
                    u(i, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!q(obj2, i5, i)) {
                        break;
                    } else {
                        i0.o(obj, j5, i0.f4510b.h(obj2, j5));
                        I(obj, i5, i);
                        break;
                    }
                case 68:
                    u(i, obj, obj2);
                    break;
            }
            i += 3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final AbstractC0218v c() {
        this.f4439j.getClass();
        return ((AbstractC0218v) this.f4436e).k();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    @Override // androidx.datastore.preferences.protobuf.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = p(r9)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r9 instanceof androidx.datastore.preferences.protobuf.AbstractC0218v
            if (r0 == 0) goto L17
            r0 = r9
            androidx.datastore.preferences.protobuf.v r0 = (androidx.datastore.preferences.protobuf.AbstractC0218v) r0
            r0.d()
            r0.c()
            r0.j()
        L17:
            int[] r0 = r8.f4432a
            int r1 = r0.length
            r2 = 0
        L1b:
            if (r2 >= r1) goto L83
            int r3 = r8.M(r2)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r4 = (long) r4
            int r3 = L(r3)
            r6 = 9
            if (r3 == r6) goto L6d
            r6 = 60
            if (r3 == r6) goto L57
            r6 = 68
            if (r3 == r6) goto L57
            switch(r3) {
                case 17: goto L6d;
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
            goto L80
        L3a:
            sun.misc.Unsafe r3 = androidx.datastore.preferences.protobuf.M.f4431o
            java.lang.Object r6 = r3.getObject(r9, r4)
            if (r6 == 0) goto L80
            androidx.datastore.preferences.protobuf.I r7 = r8.f4442m
            r7.getClass()
            androidx.datastore.preferences.protobuf.I.c(r6)
            r3.putObject(r9, r4, r6)
            goto L80
        L4e:
            androidx.datastore.preferences.protobuf.B r3 = r8.f4440k
            r3.getClass()
            androidx.datastore.preferences.protobuf.B.a(r9, r4)
            goto L80
        L57:
            r3 = r0[r2]
            boolean r3 = r8.q(r9, r3, r2)
            if (r3 == 0) goto L80
            androidx.datastore.preferences.protobuf.V r3 = r8.m(r2)
            sun.misc.Unsafe r6 = androidx.datastore.preferences.protobuf.M.f4431o
            java.lang.Object r4 = r6.getObject(r9, r4)
            r3.d(r4)
            goto L80
        L6d:
            boolean r3 = r8.n(r2, r9)
            if (r3 == 0) goto L80
            androidx.datastore.preferences.protobuf.V r3 = r8.m(r2)
            sun.misc.Unsafe r6 = androidx.datastore.preferences.protobuf.M.f4431o
            java.lang.Object r4 = r6.getObject(r9, r4)
            r3.d(r4)
        L80:
            int r2 = r2 + 3
            goto L1b
        L83:
            androidx.datastore.preferences.protobuf.d0 r8 = r8.f4441l
            r8.getClass()
            androidx.datastore.preferences.protobuf.d0.b(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.d(java.lang.Object):void");
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void e(Object obj, C0208k c0208k, C0211n c0211n) throws Throwable {
        c0211n.getClass();
        if (p(obj)) {
            r(this.f4441l, obj, c0208k, c0211n);
        } else {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void f(Object obj, E e5) throws O2.b {
        e5.getClass();
        N(obj, e5);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(androidx.datastore.preferences.protobuf.AbstractC0218v r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.g(androidx.datastore.preferences.protobuf.v):int");
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final int h(AbstractC0218v abstractC0218v) {
        int i;
        int i5;
        int i6;
        int iE0;
        int iD0;
        int i7;
        int iS0;
        int iU0;
        Unsafe unsafe = f4431o;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = this.f4432a;
            if (i11 >= iArr.length) {
                this.f4441l.getClass();
                return abstractC0218v.unknownFields.b() + i12;
            }
            int iM = M(i11);
            int iL = L(iM);
            int i13 = iArr[i11];
            int i14 = iArr[i11 + 2];
            int i15 = i14 & i8;
            if (iL <= 17) {
                if (i15 != i9) {
                    i10 = i15 == i8 ? 0 : unsafe.getInt(abstractC0218v, i15);
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
            long j5 = iM & i8;
            if (iL >= r.f4544b.a()) {
                r.f4545c.a();
            }
            switch (iL) {
                case 0:
                    if (!o(abstractC0218v, i11, i, i5, i6)) {
                        break;
                    } else {
                        iE0 = C0209l.E0(i13);
                        i12 += iE0;
                        break;
                    }
                case 1:
                    if (!o(abstractC0218v, i11, i, i5, i6)) {
                        break;
                    } else {
                        iE0 = C0209l.I0(i13);
                        i12 += iE0;
                        break;
                    }
                case 2:
                    if (!o(abstractC0218v, i11, i, i5, i6)) {
                        break;
                    } else {
                        iE0 = C0209l.L0(i13, unsafe.getLong(abstractC0218v, j5));
                        i12 += iE0;
                        break;
                    }
                case 3:
                    if (!o(abstractC0218v, i11, i, i5, i6)) {
                        break;
                    } else {
                        iE0 = C0209l.V0(i13, unsafe.getLong(abstractC0218v, j5));
                        i12 += iE0;
                        break;
                    }
                case 4:
                    if (!o(abstractC0218v, i11, i, i5, i6)) {
                        break;
                    } else {
                        iE0 = C0209l.K0(i13, unsafe.getInt(abstractC0218v, j5));
                        i12 += iE0;
                        break;
                    }
                case 5:
                    if (!o(abstractC0218v, i11, i, i5, i6)) {
                        break;
                    } else {
                        iE0 = C0209l.H0(i13);
                        i12 += iE0;
                        break;
                    }
                case 6:
                    if (!o(abstractC0218v, i11, i, i5, i6)) {
                        break;
                    } else {
                        iE0 = C0209l.G0(i13);
                        i12 += iE0;
                        break;
                    }
                case 7:
                    if (!o(abstractC0218v, i11, i, i5, i6)) {
                        break;
                    } else {
                        iE0 = C0209l.C0(i13);
                        i12 += iE0;
                        break;
                    }
                case 8:
                    if (!o(abstractC0218v, i11, i, i5, i6)) {
                        break;
                    } else {
                        Object object = unsafe.getObject(abstractC0218v, j5);
                        iD0 = object instanceof C0204g ? C0209l.D0(i13, (C0204g) object) : C0209l.Q0(i13, (String) object);
                        i12 = iD0 + i12;
                        break;
                    }
                case N2.n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    if (!o(abstractC0218v, i11, i, i5, i6)) {
                        break;
                    } else {
                        iE0 = W.o(i13, unsafe.getObject(abstractC0218v, j5), m(i11));
                        i12 += iE0;
                        break;
                    }
                case N2.n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    if (!o(abstractC0218v, i11, i, i5, i6)) {
                        break;
                    } else {
                        iE0 = C0209l.D0(i13, (C0204g) unsafe.getObject(abstractC0218v, j5));
                        i12 += iE0;
                        break;
                    }
                case 11:
                    if (!o(abstractC0218v, i11, i, i5, i6)) {
                        break;
                    } else {
                        iE0 = C0209l.T0(i13, unsafe.getInt(abstractC0218v, j5));
                        i12 += iE0;
                        break;
                    }
                case N2.j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (!o(abstractC0218v, i11, i, i5, i6)) {
                        break;
                    } else {
                        iE0 = C0209l.F0(i13, unsafe.getInt(abstractC0218v, j5));
                        i12 += iE0;
                        break;
                    }
                case 13:
                    if (!o(abstractC0218v, i11, i, i5, i6)) {
                        break;
                    } else {
                        iE0 = C0209l.M0(i13);
                        i12 += iE0;
                        break;
                    }
                case 14:
                    if (!o(abstractC0218v, i11, i, i5, i6)) {
                        break;
                    } else {
                        iE0 = C0209l.N0(i13);
                        i12 += iE0;
                        break;
                    }
                case 15:
                    if (!o(abstractC0218v, i11, i, i5, i6)) {
                        break;
                    } else {
                        iE0 = C0209l.O0(i13, unsafe.getInt(abstractC0218v, j5));
                        i12 += iE0;
                        break;
                    }
                case 16:
                    if (!o(abstractC0218v, i11, i, i5, i6)) {
                        break;
                    } else {
                        iE0 = C0209l.P0(i13, unsafe.getLong(abstractC0218v, j5));
                        i12 += iE0;
                        break;
                    }
                case N2.n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (!o(abstractC0218v, i11, i, i5, i6)) {
                        break;
                    } else {
                        iE0 = C0209l.J0(i13, (AbstractC0198a) unsafe.getObject(abstractC0218v, j5), m(i11));
                        i12 += iE0;
                        break;
                    }
                case N2.n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    iE0 = W.h(i13, (List) unsafe.getObject(abstractC0218v, j5));
                    i12 += iE0;
                    break;
                case 19:
                    iE0 = W.f(i13, (List) unsafe.getObject(abstractC0218v, j5));
                    i12 += iE0;
                    break;
                case 20:
                    iE0 = W.m(i13, (List) unsafe.getObject(abstractC0218v, j5));
                    i12 += iE0;
                    break;
                case 21:
                    iE0 = W.x(i13, (List) unsafe.getObject(abstractC0218v, j5));
                    i12 += iE0;
                    break;
                case 22:
                    iE0 = W.k(i13, (List) unsafe.getObject(abstractC0218v, j5));
                    i12 += iE0;
                    break;
                case 23:
                    iE0 = W.h(i13, (List) unsafe.getObject(abstractC0218v, j5));
                    i12 += iE0;
                    break;
                case 24:
                    iE0 = W.f(i13, (List) unsafe.getObject(abstractC0218v, j5));
                    i12 += iE0;
                    break;
                case 25:
                    iE0 = W.a(i13, (List) unsafe.getObject(abstractC0218v, j5));
                    i12 += iE0;
                    break;
                case 26:
                    iE0 = W.u(i13, (List) unsafe.getObject(abstractC0218v, j5));
                    i12 += iE0;
                    break;
                case 27:
                    iE0 = W.p(i13, (List) unsafe.getObject(abstractC0218v, j5), m(i11));
                    i12 += iE0;
                    break;
                case 28:
                    iE0 = W.c(i13, (List) unsafe.getObject(abstractC0218v, j5));
                    i12 += iE0;
                    break;
                case 29:
                    iE0 = W.v(i13, (List) unsafe.getObject(abstractC0218v, j5));
                    i12 += iE0;
                    break;
                case 30:
                    iE0 = W.d(i13, (List) unsafe.getObject(abstractC0218v, j5));
                    i12 += iE0;
                    break;
                case 31:
                    iE0 = W.f(i13, (List) unsafe.getObject(abstractC0218v, j5));
                    i12 += iE0;
                    break;
                case 32:
                    iE0 = W.h(i13, (List) unsafe.getObject(abstractC0218v, j5));
                    i12 += iE0;
                    break;
                case 33:
                    iE0 = W.q(i13, (List) unsafe.getObject(abstractC0218v, j5));
                    i12 += iE0;
                    break;
                case 34:
                    iE0 = W.s(i13, (List) unsafe.getObject(abstractC0218v, j5));
                    i12 += iE0;
                    break;
                case 35:
                    i7 = W.i((List) unsafe.getObject(abstractC0218v, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        iS0 = C0209l.S0(i13);
                        iU0 = C0209l.U0(i7);
                        i12 += iU0 + iS0 + i7;
                        break;
                    }
                case 36:
                    i7 = W.g((List) unsafe.getObject(abstractC0218v, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        iS0 = C0209l.S0(i13);
                        iU0 = C0209l.U0(i7);
                        i12 += iU0 + iS0 + i7;
                        break;
                    }
                case 37:
                    i7 = W.n((List) unsafe.getObject(abstractC0218v, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        iS0 = C0209l.S0(i13);
                        iU0 = C0209l.U0(i7);
                        i12 += iU0 + iS0 + i7;
                        break;
                    }
                case 38:
                    i7 = W.y((List) unsafe.getObject(abstractC0218v, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        iS0 = C0209l.S0(i13);
                        iU0 = C0209l.U0(i7);
                        i12 += iU0 + iS0 + i7;
                        break;
                    }
                case 39:
                    i7 = W.l((List) unsafe.getObject(abstractC0218v, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        iS0 = C0209l.S0(i13);
                        iU0 = C0209l.U0(i7);
                        i12 += iU0 + iS0 + i7;
                        break;
                    }
                case 40:
                    i7 = W.i((List) unsafe.getObject(abstractC0218v, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        iS0 = C0209l.S0(i13);
                        iU0 = C0209l.U0(i7);
                        i12 += iU0 + iS0 + i7;
                        break;
                    }
                case 41:
                    i7 = W.g((List) unsafe.getObject(abstractC0218v, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        iS0 = C0209l.S0(i13);
                        iU0 = C0209l.U0(i7);
                        i12 += iU0 + iS0 + i7;
                        break;
                    }
                case 42:
                    i7 = W.b((List) unsafe.getObject(abstractC0218v, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        iS0 = C0209l.S0(i13);
                        iU0 = C0209l.U0(i7);
                        i12 += iU0 + iS0 + i7;
                        break;
                    }
                case 43:
                    i7 = W.w((List) unsafe.getObject(abstractC0218v, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        iS0 = C0209l.S0(i13);
                        iU0 = C0209l.U0(i7);
                        i12 += iU0 + iS0 + i7;
                        break;
                    }
                case 44:
                    i7 = W.e((List) unsafe.getObject(abstractC0218v, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        iS0 = C0209l.S0(i13);
                        iU0 = C0209l.U0(i7);
                        i12 += iU0 + iS0 + i7;
                        break;
                    }
                case 45:
                    i7 = W.g((List) unsafe.getObject(abstractC0218v, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        iS0 = C0209l.S0(i13);
                        iU0 = C0209l.U0(i7);
                        i12 += iU0 + iS0 + i7;
                        break;
                    }
                case 46:
                    i7 = W.i((List) unsafe.getObject(abstractC0218v, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        iS0 = C0209l.S0(i13);
                        iU0 = C0209l.U0(i7);
                        i12 += iU0 + iS0 + i7;
                        break;
                    }
                case 47:
                    i7 = W.r((List) unsafe.getObject(abstractC0218v, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        iS0 = C0209l.S0(i13);
                        iU0 = C0209l.U0(i7);
                        i12 += iU0 + iS0 + i7;
                        break;
                    }
                case 48:
                    i7 = W.t((List) unsafe.getObject(abstractC0218v, j5));
                    if (i7 <= 0) {
                        break;
                    } else {
                        iS0 = C0209l.S0(i13);
                        iU0 = C0209l.U0(i7);
                        i12 += iU0 + iS0 + i7;
                        break;
                    }
                case 49:
                    iE0 = W.j(i13, (List) unsafe.getObject(abstractC0218v, j5), m(i11));
                    i12 += iE0;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(abstractC0218v, j5);
                    Object obj = this.f4433b[(i11 / 3) * 2];
                    this.f4442m.getClass();
                    iE0 = I.a(i13, object2, obj);
                    i12 += iE0;
                    break;
                case 51:
                    if (!q(abstractC0218v, i13, i11)) {
                        break;
                    } else {
                        iE0 = C0209l.E0(i13);
                        i12 += iE0;
                        break;
                    }
                case 52:
                    if (!q(abstractC0218v, i13, i11)) {
                        break;
                    } else {
                        iE0 = C0209l.I0(i13);
                        i12 += iE0;
                        break;
                    }
                case 53:
                    if (!q(abstractC0218v, i13, i11)) {
                        break;
                    } else {
                        iE0 = C0209l.L0(i13, A(abstractC0218v, j5));
                        i12 += iE0;
                        break;
                    }
                case 54:
                    if (!q(abstractC0218v, i13, i11)) {
                        break;
                    } else {
                        iE0 = C0209l.V0(i13, A(abstractC0218v, j5));
                        i12 += iE0;
                        break;
                    }
                case 55:
                    if (!q(abstractC0218v, i13, i11)) {
                        break;
                    } else {
                        iE0 = C0209l.K0(i13, z(abstractC0218v, j5));
                        i12 += iE0;
                        break;
                    }
                case 56:
                    if (!q(abstractC0218v, i13, i11)) {
                        break;
                    } else {
                        iE0 = C0209l.H0(i13);
                        i12 += iE0;
                        break;
                    }
                case 57:
                    if (!q(abstractC0218v, i13, i11)) {
                        break;
                    } else {
                        iE0 = C0209l.G0(i13);
                        i12 += iE0;
                        break;
                    }
                case 58:
                    if (!q(abstractC0218v, i13, i11)) {
                        break;
                    } else {
                        iE0 = C0209l.C0(i13);
                        i12 += iE0;
                        break;
                    }
                case 59:
                    if (!q(abstractC0218v, i13, i11)) {
                        break;
                    } else {
                        Object object3 = unsafe.getObject(abstractC0218v, j5);
                        iD0 = object3 instanceof C0204g ? C0209l.D0(i13, (C0204g) object3) : C0209l.Q0(i13, (String) object3);
                        i12 = iD0 + i12;
                        break;
                    }
                case 60:
                    if (!q(abstractC0218v, i13, i11)) {
                        break;
                    } else {
                        iE0 = W.o(i13, unsafe.getObject(abstractC0218v, j5), m(i11));
                        i12 += iE0;
                        break;
                    }
                case 61:
                    if (!q(abstractC0218v, i13, i11)) {
                        break;
                    } else {
                        iE0 = C0209l.D0(i13, (C0204g) unsafe.getObject(abstractC0218v, j5));
                        i12 += iE0;
                        break;
                    }
                case 62:
                    if (!q(abstractC0218v, i13, i11)) {
                        break;
                    } else {
                        iE0 = C0209l.T0(i13, z(abstractC0218v, j5));
                        i12 += iE0;
                        break;
                    }
                case 63:
                    if (!q(abstractC0218v, i13, i11)) {
                        break;
                    } else {
                        iE0 = C0209l.F0(i13, z(abstractC0218v, j5));
                        i12 += iE0;
                        break;
                    }
                case 64:
                    if (!q(abstractC0218v, i13, i11)) {
                        break;
                    } else {
                        iE0 = C0209l.M0(i13);
                        i12 += iE0;
                        break;
                    }
                case 65:
                    if (!q(abstractC0218v, i13, i11)) {
                        break;
                    } else {
                        iE0 = C0209l.N0(i13);
                        i12 += iE0;
                        break;
                    }
                case 66:
                    if (!q(abstractC0218v, i13, i11)) {
                        break;
                    } else {
                        iE0 = C0209l.O0(i13, z(abstractC0218v, j5));
                        i12 += iE0;
                        break;
                    }
                case 67:
                    if (!q(abstractC0218v, i13, i11)) {
                        break;
                    } else {
                        iE0 = C0209l.P0(i13, A(abstractC0218v, j5));
                        i12 += iE0;
                        break;
                    }
                case 68:
                    if (!q(abstractC0218v, i13, i11)) {
                        break;
                    } else {
                        iE0 = C0209l.J0(i13, (AbstractC0198a) unsafe.getObject(abstractC0218v, j5), m(i11));
                        i12 += iE0;
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
    @Override // androidx.datastore.preferences.protobuf.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(androidx.datastore.preferences.protobuf.AbstractC0218v r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.i(androidx.datastore.preferences.protobuf.v, java.lang.Object):boolean");
    }

    public final boolean j(AbstractC0218v abstractC0218v, Object obj, int i) {
        return n(i, abstractC0218v) == n(i, obj);
    }

    public final void k(int i, Object obj, Object obj2) {
        int i5 = this.f4432a[i];
        if (i0.f4510b.h(obj, M(i) & 1048575) == null) {
            return;
        }
        l(i);
    }

    public final void l(int i) {
        if (this.f4433b[((i / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final V m(int i) {
        int i5 = (i / 3) * 2;
        Object[] objArr = this.f4433b;
        V v4 = (V) objArr[i5];
        if (v4 != null) {
            return v4;
        }
        V vA = S.f4448c.a((Class) objArr[i5 + 1]);
        objArr[i5] = vA;
        return vA;
    }

    public final boolean n(int i, Object obj) {
        int i5 = this.f4432a[i + 2];
        long j5 = i5 & 1048575;
        if (j5 != 1048575) {
            return ((1 << (i5 >>> 20)) & i0.f4510b.f(obj, j5)) != 0;
        }
        int iM = M(i);
        long j6 = iM & 1048575;
        switch (L(iM)) {
            case 0:
                return Double.doubleToRawLongBits(i0.f4510b.d(obj, j6)) != 0;
            case 1:
                return Float.floatToRawIntBits(i0.f4510b.e(obj, j6)) != 0;
            case 2:
                return i0.f4510b.g(obj, j6) != 0;
            case 3:
                return i0.f4510b.g(obj, j6) != 0;
            case 4:
                return i0.f4510b.f(obj, j6) != 0;
            case 5:
                return i0.f4510b.g(obj, j6) != 0;
            case 6:
                return i0.f4510b.f(obj, j6) != 0;
            case 7:
                return i0.f4510b.c(obj, j6);
            case 8:
                Object objH = i0.f4510b.h(obj, j6);
                if (objH instanceof String) {
                    return !((String) objH).isEmpty();
                }
                if (objH instanceof C0204g) {
                    return !C0204g.f4493c.equals(objH);
                }
                throw new IllegalArgumentException();
            case N2.n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return i0.f4510b.h(obj, j6) != null;
            case N2.n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return !C0204g.f4493c.equals(i0.f4510b.h(obj, j6));
            case 11:
                return i0.f4510b.f(obj, j6) != 0;
            case N2.j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return i0.f4510b.f(obj, j6) != 0;
            case 13:
                return i0.f4510b.f(obj, j6) != 0;
            case 14:
                return i0.f4510b.g(obj, j6) != 0;
            case 15:
                return i0.f4510b.f(obj, j6) != 0;
            case 16:
                return i0.f4510b.g(obj, j6) != 0;
            case N2.n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return i0.f4510b.h(obj, j6) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean o(Object obj, int i, int i5, int i6, int i7) {
        return i5 == 1048575 ? n(i, obj) : (i6 & i7) != 0;
    }

    public final boolean q(Object obj, int i, int i5) {
        return i0.f4510b.f(obj, (long) (this.f4432a[i5 + 2] & 1048575)) == i;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x064b A[Catch: all -> 0x025f, TryCatch #5 {all -> 0x025f, blocks: (B:122:0x0646, B:124:0x064b, B:125:0x0650, B:69:0x025a, B:72:0x0262, B:73:0x0275, B:74:0x0288, B:75:0x029b, B:76:0x02ae, B:77:0x02c7, B:78:0x02da, B:79:0x02ed, B:80:0x0300, B:81:0x0313, B:82:0x0326, B:83:0x0339, B:84:0x034c, B:85:0x035f, B:86:0x0372, B:87:0x0385, B:88:0x0398, B:89:0x03ab, B:90:0x03be, B:91:0x03d7, B:92:0x03ea, B:93:0x03fd, B:94:0x0411, B:95:0x0419, B:96:0x042c, B:97:0x043f, B:98:0x0452, B:99:0x0465, B:100:0x0478, B:101:0x048b, B:102:0x049e, B:103:0x04b1, B:104:0x04ca, B:105:0x04e0, B:106:0x04f6, B:107:0x050d, B:108:0x0524, B:109:0x053d, B:110:0x0553, B:111:0x0566, B:112:0x057f, B:113:0x058a, B:114:0x05a2, B:115:0x05b9, B:116:0x05d0, B:117:0x05e6, B:118:0x05fc, B:119:0x0611, B:120:0x0629), top: B:152:0x0646 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0656 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(androidx.datastore.preferences.protobuf.d0 r20, java.lang.Object r21, androidx.datastore.preferences.protobuf.C0208k r22, androidx.datastore.preferences.protobuf.C0211n r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.r(androidx.datastore.preferences.protobuf.d0, java.lang.Object, androidx.datastore.preferences.protobuf.k, androidx.datastore.preferences.protobuf.n):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        r9.put(r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        r10.d(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(java.lang.Object r8, int r9, java.lang.Object r10, androidx.datastore.preferences.protobuf.C0211n r11, androidx.datastore.preferences.protobuf.C0208k r12) throws androidx.datastore.preferences.protobuf.C0221y, com.google.protobuf.M {
        /*
            r7 = this;
            int r9 = r7.M(r9)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r9 & r0
            long r0 = (long) r9
            androidx.datastore.preferences.protobuf.h0 r9 = androidx.datastore.preferences.protobuf.i0.f4510b
            java.lang.Object r9 = r9.h(r8, r0)
            androidx.datastore.preferences.protobuf.I r7 = r7.f4442m
            if (r9 != 0) goto L20
            r7.getClass()
            androidx.datastore.preferences.protobuf.H r9 = androidx.datastore.preferences.protobuf.H.f4425b
            androidx.datastore.preferences.protobuf.H r9 = r9.b()
            androidx.datastore.preferences.protobuf.i0.o(r8, r0, r9)
            goto L37
        L20:
            r7.getClass()
            r2 = r9
            androidx.datastore.preferences.protobuf.H r2 = (androidx.datastore.preferences.protobuf.H) r2
            boolean r2 = r2.f4426a
            if (r2 != 0) goto L37
            androidx.datastore.preferences.protobuf.H r2 = androidx.datastore.preferences.protobuf.H.f4425b
            androidx.datastore.preferences.protobuf.H r2 = r2.b()
            androidx.datastore.preferences.protobuf.I.b(r2, r9)
            androidx.datastore.preferences.protobuf.i0.o(r8, r0, r2)
            r9 = r2
        L37:
            r7.getClass()
            androidx.datastore.preferences.protobuf.H r9 = (androidx.datastore.preferences.protobuf.H) r9
            androidx.datastore.preferences.protobuf.G r10 = (androidx.datastore.preferences.protobuf.G) r10
            androidx.datastore.preferences.protobuf.F r7 = r10.f4424a
            r8 = 2
            r12.S(r8)
            java.lang.Object r10 = r12.f4522e
            androidx.datastore.preferences.protobuf.j r10 = (androidx.datastore.preferences.protobuf.AbstractC0207j) r10
            int r0 = r10.v()
            int r0 = r10.e(r0)
            java.lang.String r1 = ""
            Z.i r2 = r7.f4423c
            r3 = r2
        L55:
            int r4 = r12.c()     // Catch: java.lang.Throwable -> L79
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L9b
            boolean r5 = r10.c()     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L65
            goto L9b
        L65:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L86
            if (r4 == r8) goto L7b
            boolean r4 = r12.T()     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0221y -> L8e
            if (r4 == 0) goto L73
            goto L55
        L73:
            androidx.datastore.preferences.protobuf.z r4 = new androidx.datastore.preferences.protobuf.z     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0221y -> L8e
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0221y -> L8e
            throw r4     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0221y -> L8e
        L79:
            r7 = move-exception
            goto La2
        L7b:
            androidx.datastore.preferences.protobuf.o0 r4 = r7.f4422b     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0221y -> L8e
            java.lang.Class r5 = r2.getClass()     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0221y -> L8e
            java.lang.Object r3 = r12.r(r4, r5, r11)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0221y -> L8e
            goto L55
        L86:
            androidx.datastore.preferences.protobuf.m0 r4 = r7.f4421a     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0221y -> L8e
            r5 = 0
            java.lang.Object r1 = r12.r(r4, r5, r5)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0221y -> L8e
            goto L55
        L8e:
            boolean r4 = r12.T()     // Catch: java.lang.Throwable -> L79
            if (r4 == 0) goto L95
            goto L55
        L95:
            androidx.datastore.preferences.protobuf.z r7 = new androidx.datastore.preferences.protobuf.z     // Catch: java.lang.Throwable -> L79
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L79
            throw r7     // Catch: java.lang.Throwable -> L79
        L9b:
            r9.put(r1, r3)     // Catch: java.lang.Throwable -> L79
            r10.d(r0)
            return
        La2:
            r10.d(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.s(java.lang.Object, int, java.lang.Object, androidx.datastore.preferences.protobuf.n, androidx.datastore.preferences.protobuf.k):void");
    }

    public final void t(int i, Object obj, Object obj2) {
        if (n(i, obj2)) {
            long jM = M(i) & 1048575;
            Unsafe unsafe = f4431o;
            Object object = unsafe.getObject(obj2, jM);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f4432a[i] + " is present but null: " + obj2);
            }
            V vM = m(i);
            if (!n(i, obj)) {
                if (p(object)) {
                    AbstractC0218v abstractC0218vC = vM.c();
                    vM.b(abstractC0218vC, object);
                    unsafe.putObject(obj, jM, abstractC0218vC);
                } else {
                    unsafe.putObject(obj, jM, object);
                }
                H(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM);
            if (!p(object2)) {
                AbstractC0218v abstractC0218vC2 = vM.c();
                vM.b(abstractC0218vC2, object2);
                unsafe.putObject(obj, jM, abstractC0218vC2);
                object2 = abstractC0218vC2;
            }
            vM.b(object2, object);
        }
    }

    public final void u(int i, Object obj, Object obj2) {
        int[] iArr = this.f4432a;
        int i5 = iArr[i];
        if (q(obj2, i5, i)) {
            long jM = M(i) & 1048575;
            Unsafe unsafe = f4431o;
            Object object = unsafe.getObject(obj2, jM);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            V vM = m(i);
            if (!q(obj, i5, i)) {
                if (p(object)) {
                    AbstractC0218v abstractC0218vC = vM.c();
                    vM.b(abstractC0218vC, object);
                    unsafe.putObject(obj, jM, abstractC0218vC);
                } else {
                    unsafe.putObject(obj, jM, object);
                }
                I(obj, i5, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM);
            if (!p(object2)) {
                AbstractC0218v abstractC0218vC2 = vM.c();
                vM.b(abstractC0218vC2, object2);
                unsafe.putObject(obj, jM, abstractC0218vC2);
                object2 = abstractC0218vC2;
            }
            vM.b(object2, object);
        }
    }

    public final Object v(int i, Object obj) {
        V vM = m(i);
        long jM = M(i) & 1048575;
        if (!n(i, obj)) {
            return vM.c();
        }
        Object object = f4431o.getObject(obj, jM);
        if (p(object)) {
            return object;
        }
        AbstractC0218v abstractC0218vC = vM.c();
        if (object != null) {
            vM.b(abstractC0218vC, object);
        }
        return abstractC0218vC;
    }

    public final Object w(Object obj, int i, int i5) {
        V vM = m(i5);
        if (!q(obj, i, i5)) {
            return vM.c();
        }
        Object object = f4431o.getObject(obj, M(i5) & 1048575);
        if (p(object)) {
            return object;
        }
        AbstractC0218v abstractC0218vC = vM.c();
        if (object != null) {
            vM.b(abstractC0218vC, object);
        }
        return abstractC0218vC;
    }
}
