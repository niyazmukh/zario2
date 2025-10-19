package com.google.protobuf;

import java.nio.ByteBuffer;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\y0.smali */
public abstract class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final w0 f6602a = new w0();

    /* renamed from: b, reason: collision with root package name */
    public static final x0 f6603b = new x0();

    public static int A(int i, byte[] bArr, int i5, int i6, K k5, C0396e c0396e) {
        H h = (H) k5;
        int iL = L(bArr, i5, c0396e);
        h.h(AbstractC0417p.h(c0396e.f6494a));
        while (iL < i6) {
            int iL2 = L(bArr, iL, c0396e);
            if (i != c0396e.f6494a) {
                break;
            }
            iL = L(bArr, iL2, c0396e);
            h.h(AbstractC0417p.h(c0396e.f6494a));
        }
        return iL;
    }

    public static int B(int i, byte[] bArr, int i5, int i6, K k5, C0396e c0396e) {
        W w4 = (W) k5;
        int iN = N(bArr, i5, c0396e);
        w4.h(AbstractC0417p.i(c0396e.f6495b));
        while (iN < i6) {
            int iL = L(bArr, iN, c0396e);
            if (i != c0396e.f6494a) {
                break;
            }
            iN = N(bArr, iL, c0396e);
            w4.h(AbstractC0417p.i(c0396e.f6495b));
        }
        return iN;
    }

    public static int C(byte[] bArr, int i, C0396e c0396e) throws N {
        int iL = L(bArr, i, c0396e);
        int i5 = c0396e.f6494a;
        if (i5 < 0) {
            throw N.f();
        }
        if (i5 == 0) {
            c0396e.f6496c = "";
            return iL;
        }
        c0396e.f6496c = new String(bArr, iL, i5, L.f6425a);
        return iL + i5;
    }

    public static int D(int i, byte[] bArr, int i5, int i6, K k5, C0396e c0396e) throws N {
        int iL = L(bArr, i5, c0396e);
        int i7 = c0396e.f6494a;
        if (i7 < 0) {
            throw N.f();
        }
        if (i7 == 0) {
            k5.add("");
        } else {
            k5.add(new String(bArr, iL, i7, L.f6425a));
            iL += i7;
        }
        while (iL < i6) {
            int iL2 = L(bArr, iL, c0396e);
            if (i != c0396e.f6494a) {
                break;
            }
            iL = L(bArr, iL2, c0396e);
            int i8 = c0396e.f6494a;
            if (i8 < 0) {
                throw N.f();
            }
            if (i8 == 0) {
                k5.add("");
            } else {
                k5.add(new String(bArr, iL, i8, L.f6425a));
                iL += i8;
            }
        }
        return iL;
    }

    public static int E(int i, byte[] bArr, int i5, int i6, K k5, C0396e c0396e) throws N {
        int iL = L(bArr, i5, c0396e);
        int i7 = c0396e.f6494a;
        if (i7 < 0) {
            throw N.f();
        }
        if (i7 == 0) {
            k5.add("");
        } else {
            int i8 = iL + i7;
            if (P0.f6458a.U(0, bArr, iL, i8) != 0) {
                throw N.c();
            }
            k5.add(new String(bArr, iL, i7, L.f6425a));
            iL = i8;
        }
        while (iL < i6) {
            int iL2 = L(bArr, iL, c0396e);
            if (i != c0396e.f6494a) {
                break;
            }
            iL = L(bArr, iL2, c0396e);
            int i9 = c0396e.f6494a;
            if (i9 < 0) {
                throw N.f();
            }
            if (i9 == 0) {
                k5.add("");
            } else {
                int i10 = iL + i9;
                if (P0.f6458a.U(0, bArr, iL, i10) != 0) {
                    throw N.c();
                }
                k5.add(new String(bArr, iL, i9, L.f6425a));
                iL = i10;
            }
        }
        return iL;
    }

    public static int F(byte[] bArr, int i, C0396e c0396e) throws N {
        int iL = L(bArr, i, c0396e);
        int i5 = c0396e.f6494a;
        if (i5 < 0) {
            throw N.f();
        }
        if (i5 == 0) {
            c0396e.f6496c = "";
            return iL;
        }
        c0396e.f6496c = P0.f6458a.H(bArr, iL, i5);
        return iL + i5;
    }

    public static int G(int i, byte[] bArr, int i5, int i6, D0 d02, C0396e c0396e) throws N {
        if ((i >>> 3) == 0) {
            throw N.b();
        }
        int i7 = i & 7;
        if (i7 == 0) {
            int iN = N(bArr, i5, c0396e);
            d02.d(i, Long.valueOf(c0396e.f6495b));
            return iN;
        }
        if (i7 == 1) {
            d02.d(i, Long.valueOf(l(bArr, i5)));
            return i5 + 8;
        }
        if (i7 == 2) {
            int iL = L(bArr, i5, c0396e);
            int i8 = c0396e.f6494a;
            if (i8 < 0) {
                throw N.f();
            }
            if (i8 > bArr.length - iL) {
                throw N.h();
            }
            if (i8 == 0) {
                d02.d(i, AbstractC0409l.f6528b);
            } else {
                d02.d(i, AbstractC0409l.k(bArr, iL, i8));
            }
            return iL + i8;
        }
        if (i7 != 3) {
            if (i7 != 5) {
                throw N.b();
            }
            d02.d(i, Integer.valueOf(j(bArr, i5)));
            return i5 + 4;
        }
        D0 d0C = D0.c();
        int i9 = (i & (-8)) | 4;
        int i10 = c0396e.f6497d + 1;
        c0396e.f6497d = i10;
        if (i10 >= 100) {
            throw new N("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i11 = 0;
        while (true) {
            if (i5 >= i6) {
                break;
            }
            int iL2 = L(bArr, i5, c0396e);
            int i12 = c0396e.f6494a;
            if (i12 == i9) {
                i11 = i12;
                i5 = iL2;
                break;
            }
            i11 = i12;
            i5 = G(i12, bArr, iL2, i6, d0C, c0396e);
        }
        c0396e.f6497d--;
        if (i5 > i6 || i11 != i9) {
            throw N.g();
        }
        d02.d(i, d0C);
        return i5;
    }

    public static String I(ByteBuffer byteBuffer, int i, int i5) throws N {
        if ((i | i5 | ((byteBuffer.limit() - i) - i5)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i5)));
        }
        int i6 = i + i5;
        char[] cArr = new char[i5];
        int i7 = 0;
        while (i < i6) {
            byte b5 = byteBuffer.get(i);
            if (!b(b5)) {
                break;
            }
            i++;
            cArr[i7] = (char) b5;
            i7++;
        }
        int i8 = i7;
        while (i < i6) {
            int i9 = i + 1;
            byte b6 = byteBuffer.get(i);
            if (b(b6)) {
                int i10 = i8 + 1;
                cArr[i8] = (char) b6;
                while (i9 < i6) {
                    byte b7 = byteBuffer.get(i9);
                    if (!b(b7)) {
                        break;
                    }
                    i9++;
                    cArr[i10] = (char) b7;
                    i10++;
                }
                i8 = i10;
                i = i9;
            } else if (b6 < -32) {
                if (i9 >= i6) {
                    throw N.c();
                }
                i += 2;
                c(b6, byteBuffer.get(i9), cArr, i8);
                i8++;
            } else if (b6 < -16) {
                if (i9 >= i6 - 1) {
                    throw N.c();
                }
                int i11 = i + 2;
                i += 3;
                d(b6, byteBuffer.get(i9), byteBuffer.get(i11), cArr, i8);
                i8++;
            } else {
                if (i9 >= i6 - 2) {
                    throw N.c();
                }
                byte b8 = byteBuffer.get(i9);
                int i12 = i + 3;
                byte b9 = byteBuffer.get(i + 2);
                i += 4;
                a(b6, b8, b9, byteBuffer.get(i12), cArr, i8);
                i8 += 2;
            }
        }
        return new String(cArr, 0, i8);
    }

    public static int K(int i, byte[] bArr, int i5, C0396e c0396e) {
        int i6 = i & 127;
        int i7 = i5 + 1;
        byte b5 = bArr[i5];
        if (b5 >= 0) {
            c0396e.f6494a = i6 | (b5 << 7);
            return i7;
        }
        int i8 = i6 | ((b5 & 127) << 7);
        int i9 = i5 + 2;
        byte b6 = bArr[i7];
        if (b6 >= 0) {
            c0396e.f6494a = i8 | (b6 << 14);
            return i9;
        }
        int i10 = i8 | ((b6 & 127) << 14);
        int i11 = i5 + 3;
        byte b7 = bArr[i9];
        if (b7 >= 0) {
            c0396e.f6494a = i10 | (b7 << 21);
            return i11;
        }
        int i12 = i10 | ((b7 & 127) << 21);
        int i13 = i5 + 4;
        byte b8 = bArr[i11];
        if (b8 >= 0) {
            c0396e.f6494a = i12 | (b8 << 28);
            return i13;
        }
        int i14 = i12 | ((b8 & 127) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] >= 0) {
                c0396e.f6494a = i14;
                return i15;
            }
            i13 = i15;
        }
    }

    public static int L(byte[] bArr, int i, C0396e c0396e) {
        int i5 = i + 1;
        byte b5 = bArr[i];
        if (b5 < 0) {
            return K(b5, bArr, i5, c0396e);
        }
        c0396e.f6494a = b5;
        return i5;
    }

    public static int M(int i, byte[] bArr, int i5, int i6, K k5, C0396e c0396e) {
        H h = (H) k5;
        int iL = L(bArr, i5, c0396e);
        h.h(c0396e.f6494a);
        while (iL < i6) {
            int iL2 = L(bArr, iL, c0396e);
            if (i != c0396e.f6494a) {
                break;
            }
            iL = L(bArr, iL2, c0396e);
            h.h(c0396e.f6494a);
        }
        return iL;
    }

    public static int N(byte[] bArr, int i, C0396e c0396e) {
        int i5 = i + 1;
        long j5 = bArr[i];
        if (j5 >= 0) {
            c0396e.f6495b = j5;
            return i5;
        }
        int i6 = i + 2;
        byte b5 = bArr[i5];
        long j6 = (j5 & 127) | ((b5 & 127) << 7);
        int i7 = 7;
        while (b5 < 0) {
            int i8 = i6 + 1;
            i7 += 7;
            j6 |= (r10 & 127) << i7;
            b5 = bArr[i6];
            i6 = i8;
        }
        c0396e.f6495b = j6;
        return i6;
    }

    public static int O(int i, byte[] bArr, int i5, int i6, K k5, C0396e c0396e) {
        W w4 = (W) k5;
        int iN = N(bArr, i5, c0396e);
        w4.h(c0396e.f6495b);
        while (iN < i6) {
            int iL = L(bArr, iN, c0396e);
            if (i != c0396e.f6494a) {
                break;
            }
            iN = N(bArr, iL, c0396e);
            w4.h(c0396e.f6495b);
        }
        return iN;
    }

    public static String Q(AbstractC0409l abstractC0409l) {
        StringBuilder sb = new StringBuilder(abstractC0409l.size());
        for (int i = 0; i < abstractC0409l.size(); i++) {
            byte bH = abstractC0409l.h(i);
            if (bH == 34) {
                sb.append("\\\"");
            } else if (bH == 39) {
                sb.append("\\'");
            } else if (bH != 92) {
                switch (bH) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case N2.n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                        sb.append("\\t");
                        break;
                    case N2.n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case N2.j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bH < 32 || bH > 126) {
                            sb.append('\\');
                            sb.append((char) (((bH >>> 6) & 3) + 48));
                            sb.append((char) (((bH >>> 3) & 7) + 48));
                            sb.append((char) ((bH & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bH);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static boolean R(byte b5) {
        return b5 > -65;
    }

    public static int S(Object obj, InterfaceC0425t0 interfaceC0425t0, byte[] bArr, int i, int i5, int i6, C0396e c0396e) throws N {
        C0400g0 c0400g0 = (C0400g0) interfaceC0425t0;
        int i7 = c0396e.f6497d + 1;
        c0396e.f6497d = i7;
        if (i7 >= 100) {
            throw new N("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iH = c0400g0.H(obj, bArr, i, i5, i6, c0396e);
        c0396e.f6497d--;
        c0396e.f6496c = obj;
        return iH;
    }

    public static int T(Object obj, InterfaceC0425t0 interfaceC0425t0, byte[] bArr, int i, int i5, C0396e c0396e) throws N {
        int iK = i + 1;
        int i6 = bArr[i];
        if (i6 < 0) {
            iK = K(i6, bArr, iK, c0396e);
            i6 = c0396e.f6494a;
        }
        int i7 = iK;
        if (i6 < 0 || i6 > i5 - i7) {
            throw N.h();
        }
        int i8 = c0396e.f6497d + 1;
        c0396e.f6497d = i8;
        if (i8 >= 100) {
            throw new N("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i9 = i6 + i7;
        interfaceC0425t0.h(obj, bArr, i7, i9, c0396e);
        c0396e.f6497d--;
        c0396e.f6496c = obj;
        return i9;
    }

    public static int V(int i, byte[] bArr, int i5, int i6, C0396e c0396e) throws N {
        if ((i >>> 3) == 0) {
            throw N.b();
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return N(bArr, i5, c0396e);
        }
        if (i7 == 1) {
            return i5 + 8;
        }
        if (i7 == 2) {
            return L(bArr, i5, c0396e) + c0396e.f6494a;
        }
        if (i7 != 3) {
            if (i7 == 5) {
                return i5 + 4;
            }
            throw N.b();
        }
        int i8 = (i & (-8)) | 4;
        int i9 = 0;
        while (i5 < i6) {
            i5 = L(bArr, i5, c0396e);
            i9 = c0396e.f6494a;
            if (i9 == i8) {
                break;
            }
            i5 = V(i9, bArr, i5, i6, c0396e);
        }
        if (i5 > i6 || i9 != i8) {
            throw N.g();
        }
        return i5;
    }

    public static void a(byte b5, byte b6, byte b7, byte b8, char[] cArr, int i) throws N {
        if (!R(b6)) {
            if ((((b6 + 112) + (b5 << 28)) >> 30) == 0 && !R(b7) && !R(b8)) {
                int i5 = ((b5 & 7) << 18) | ((b6 & 63) << 12) | ((b7 & 63) << 6) | (b8 & 63);
                cArr[i] = (char) ((i5 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i5 & 1023) + 56320);
                return;
            }
        }
        throw N.c();
    }

    public static boolean b(byte b5) {
        return b5 >= 0;
    }

    public static void c(byte b5, byte b6, char[] cArr, int i) throws N {
        if (b5 < -62 || R(b6)) {
            throw N.c();
        }
        cArr[i] = (char) (((b5 & 31) << 6) | (b6 & 63));
    }

    public static void d(byte b5, byte b6, byte b7, char[] cArr, int i) throws N {
        if (R(b6) || ((b5 == -32 && b6 < -96) || ((b5 == -19 && b6 >= -96) || R(b7)))) {
            throw N.c();
        }
        cArr[i] = (char) (((b5 & 15) << 12) | ((b6 & 63) << 6) | (b7 & 63));
    }

    public static int e(int i, byte[] bArr, int i5, int i6, K k5, C0396e c0396e) {
        f fVar = (f) k5;
        int iN = N(bArr, i5, c0396e);
        fVar.h(c0396e.f6495b != 0);
        while (iN < i6) {
            int iL = L(bArr, iN, c0396e);
            if (i != c0396e.f6494a) {
                break;
            }
            iN = N(bArr, iL, c0396e);
            fVar.h(c0396e.f6495b != 0);
        }
        return iN;
    }

    public static int f(byte[] bArr, int i, C0396e c0396e) throws N {
        int iL = L(bArr, i, c0396e);
        int i5 = c0396e.f6494a;
        if (i5 < 0) {
            throw N.f();
        }
        if (i5 > bArr.length - iL) {
            throw N.h();
        }
        if (i5 == 0) {
            c0396e.f6496c = AbstractC0409l.f6528b;
            return iL;
        }
        c0396e.f6496c = AbstractC0409l.k(bArr, iL, i5);
        return iL + i5;
    }

    public static int g(int i, byte[] bArr, int i5, int i6, K k5, C0396e c0396e) throws N {
        int iL = L(bArr, i5, c0396e);
        int i7 = c0396e.f6494a;
        if (i7 < 0) {
            throw N.f();
        }
        if (i7 > bArr.length - iL) {
            throw N.h();
        }
        if (i7 == 0) {
            k5.add(AbstractC0409l.f6528b);
        } else {
            k5.add(AbstractC0409l.k(bArr, iL, i7));
            iL += i7;
        }
        while (iL < i6) {
            int iL2 = L(bArr, iL, c0396e);
            if (i != c0396e.f6494a) {
                break;
            }
            iL = L(bArr, iL2, c0396e);
            int i8 = c0396e.f6494a;
            if (i8 < 0) {
                throw N.f();
            }
            if (i8 > bArr.length - iL) {
                throw N.h();
            }
            if (i8 == 0) {
                k5.add(AbstractC0409l.f6528b);
            } else {
                k5.add(AbstractC0409l.k(bArr, iL, i8));
                iL += i8;
            }
        }
        return iL;
    }

    public static double h(byte[] bArr, int i) {
        return Double.longBitsToDouble(l(bArr, i));
    }

    public static int i(int i, byte[] bArr, int i5, int i6, K k5, C0396e c0396e) {
        AbstractC0424t abstractC0424t = (AbstractC0424t) k5;
        abstractC0424t.h(h(bArr, i5));
        int i7 = i5 + 8;
        while (i7 < i6) {
            int iL = L(bArr, i7, c0396e);
            if (i != c0396e.f6494a) {
                break;
            }
            abstractC0424t.h(Double.longBitsToDouble(l(bArr, iL)));
            i7 = iL + 8;
        }
        return i7;
    }

    public static int j(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int k(int i, byte[] bArr, int i5, int i6, K k5, C0396e c0396e) {
        H h = (H) k5;
        h.h(j(bArr, i5));
        int i7 = i5 + 4;
        while (i7 < i6) {
            int iL = L(bArr, i7, c0396e);
            if (i != c0396e.f6494a) {
                break;
            }
            h.h(j(bArr, iL));
            i7 = iL + 4;
        }
        return i7;
    }

    public static long l(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static int m(int i, byte[] bArr, int i5, int i6, K k5, C0396e c0396e) {
        W w4 = (W) k5;
        w4.h(l(bArr, i5));
        int i7 = i5 + 8;
        while (i7 < i6) {
            int iL = L(bArr, i7, c0396e);
            if (i != c0396e.f6494a) {
                break;
            }
            w4.h(l(bArr, iL));
            i7 = iL + 8;
        }
        return i7;
    }

    public static float n(byte[] bArr, int i) {
        return Float.intBitsToFloat(j(bArr, i));
    }

    public static int o(int i, byte[] bArr, int i5, int i6, K k5, C0396e c0396e) {
        A a5 = (A) k5;
        a5.h(n(bArr, i5));
        int i7 = i5 + 4;
        while (i7 < i6) {
            int iL = L(bArr, i7, c0396e);
            if (i != c0396e.f6494a) {
                break;
            }
            a5.h(Float.intBitsToFloat(j(bArr, iL)));
            i7 = iL + 4;
        }
        return i7;
    }

    public static int p(InterfaceC0425t0 interfaceC0425t0, int i, byte[] bArr, int i5, int i6, K k5, C0396e c0396e) throws N {
        int i7 = (i & (-8)) | 4;
        E eC = interfaceC0425t0.c();
        int iS = S(eC, interfaceC0425t0, bArr, i5, i6, i7, c0396e);
        interfaceC0425t0.d(eC);
        c0396e.f6496c = eC;
        k5.add(eC);
        while (iS < i6) {
            int iL = L(bArr, iS, c0396e);
            if (i != c0396e.f6494a) {
                break;
            }
            E eC2 = interfaceC0425t0.c();
            int iS2 = S(eC2, interfaceC0425t0, bArr, iL, i6, i7, c0396e);
            interfaceC0425t0.d(eC2);
            c0396e.f6496c = eC2;
            k5.add(eC2);
            iS = iS2;
        }
        return iS;
    }

    public static int q(InterfaceC0425t0 interfaceC0425t0, int i, byte[] bArr, int i5, int i6, K k5, C0396e c0396e) throws N {
        E eC = interfaceC0425t0.c();
        int iT = T(eC, interfaceC0425t0, bArr, i5, i6, c0396e);
        interfaceC0425t0.d(eC);
        c0396e.f6496c = eC;
        k5.add(eC);
        while (iT < i6) {
            int iL = L(bArr, iT, c0396e);
            if (i != c0396e.f6494a) {
                break;
            }
            E eC2 = interfaceC0425t0.c();
            int iT2 = T(eC2, interfaceC0425t0, bArr, iL, i6, c0396e);
            interfaceC0425t0.d(eC2);
            c0396e.f6496c = eC2;
            k5.add(eC2);
            iT = iT2;
        }
        return iT;
    }

    public static int r(byte[] bArr, int i, K k5, C0396e c0396e) throws N {
        f fVar = (f) k5;
        int iL = L(bArr, i, c0396e);
        int i5 = c0396e.f6494a + iL;
        while (iL < i5) {
            iL = N(bArr, iL, c0396e);
            fVar.h(c0396e.f6495b != 0);
        }
        if (iL == i5) {
            return iL;
        }
        throw N.h();
    }

    public static int s(byte[] bArr, int i, K k5, C0396e c0396e) throws N {
        AbstractC0424t abstractC0424t = (AbstractC0424t) k5;
        int iL = L(bArr, i, c0396e);
        int i5 = c0396e.f6494a + iL;
        while (iL < i5) {
            abstractC0424t.h(Double.longBitsToDouble(l(bArr, iL)));
            iL += 8;
        }
        if (iL == i5) {
            return iL;
        }
        throw N.h();
    }

    public static int t(byte[] bArr, int i, K k5, C0396e c0396e) throws N {
        H h = (H) k5;
        int iL = L(bArr, i, c0396e);
        int i5 = c0396e.f6494a + iL;
        while (iL < i5) {
            h.h(j(bArr, iL));
            iL += 4;
        }
        if (iL == i5) {
            return iL;
        }
        throw N.h();
    }

    public static int u(byte[] bArr, int i, K k5, C0396e c0396e) throws N {
        W w4 = (W) k5;
        int iL = L(bArr, i, c0396e);
        int i5 = c0396e.f6494a + iL;
        while (iL < i5) {
            w4.h(l(bArr, iL));
            iL += 8;
        }
        if (iL == i5) {
            return iL;
        }
        throw N.h();
    }

    public static int v(byte[] bArr, int i, K k5, C0396e c0396e) throws N {
        A a5 = (A) k5;
        int iL = L(bArr, i, c0396e);
        int i5 = c0396e.f6494a + iL;
        while (iL < i5) {
            a5.h(Float.intBitsToFloat(j(bArr, iL)));
            iL += 4;
        }
        if (iL == i5) {
            return iL;
        }
        throw N.h();
    }

    public static int w(byte[] bArr, int i, K k5, C0396e c0396e) throws N {
        H h = (H) k5;
        int iL = L(bArr, i, c0396e);
        int i5 = c0396e.f6494a + iL;
        while (iL < i5) {
            iL = L(bArr, iL, c0396e);
            h.h(AbstractC0417p.h(c0396e.f6494a));
        }
        if (iL == i5) {
            return iL;
        }
        throw N.h();
    }

    public static int x(byte[] bArr, int i, K k5, C0396e c0396e) throws N {
        W w4 = (W) k5;
        int iL = L(bArr, i, c0396e);
        int i5 = c0396e.f6494a + iL;
        while (iL < i5) {
            iL = N(bArr, iL, c0396e);
            w4.h(AbstractC0417p.i(c0396e.f6495b));
        }
        if (iL == i5) {
            return iL;
        }
        throw N.h();
    }

    public static int y(byte[] bArr, int i, K k5, C0396e c0396e) throws N {
        H h = (H) k5;
        int iL = L(bArr, i, c0396e);
        int i5 = c0396e.f6494a + iL;
        while (iL < i5) {
            iL = L(bArr, iL, c0396e);
            h.h(c0396e.f6494a);
        }
        if (iL == i5) {
            return iL;
        }
        throw N.h();
    }

    public static int z(byte[] bArr, int i, K k5, C0396e c0396e) throws N {
        W w4 = (W) k5;
        int iL = L(bArr, i, c0396e);
        int i5 = c0396e.f6494a + iL;
        while (iL < i5) {
            iL = N(bArr, iL, c0396e);
            w4.h(c0396e.f6495b);
        }
        if (iL == i5) {
            return iL;
        }
        throw N.h();
    }

    public abstract String H(byte[] bArr, int i, int i5);

    public abstract String J(ByteBuffer byteBuffer, int i, int i5);

    public abstract int P(String str, byte[] bArr, int i, int i5);

    public abstract int U(int i, byte[] bArr, int i5, int i6);

    public abstract void W(byte[] bArr, int i, int i5);
}
