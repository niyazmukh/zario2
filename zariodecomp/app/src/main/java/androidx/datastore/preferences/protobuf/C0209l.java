package androidx.datastore.preferences.protobuf;

import B3.C0057k1;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\l.1.smali */
public final class C0209l extends S0.f {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f4523g = Logger.getLogger(C0209l.class.getName());
    public static final boolean h = i0.f4512d;

    /* renamed from: b, reason: collision with root package name */
    public E f4524b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f4525c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4526d;

    /* renamed from: e, reason: collision with root package name */
    public int f4527e;

    /* renamed from: f, reason: collision with root package name */
    public final C0057k1 f4528f;

    public C0209l(C0057k1 c0057k1, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i, 20);
        this.f4525c = new byte[iMax];
        this.f4526d = iMax;
        this.f4528f = c0057k1;
    }

    public static int C0(int i) {
        return S0(i) + 1;
    }

    public static int D0(int i, C0204g c0204g) {
        int iS0 = S0(i);
        int size = c0204g.size();
        return U0(size) + size + iS0;
    }

    public static int E0(int i) {
        return S0(i) + 8;
    }

    public static int F0(int i, int i5) {
        return W0(i5) + S0(i);
    }

    public static int G0(int i) {
        return S0(i) + 4;
    }

    public static int H0(int i) {
        return S0(i) + 8;
    }

    public static int I0(int i) {
        return S0(i) + 4;
    }

    public static int J0(int i, AbstractC0198a abstractC0198a, V v4) {
        return abstractC0198a.a(v4) + (S0(i) * 2);
    }

    public static int K0(int i, int i5) {
        return W0(i5) + S0(i);
    }

    public static int L0(int i, long j5) {
        return W0(j5) + S0(i);
    }

    public static int M0(int i) {
        return S0(i) + 4;
    }

    public static int N0(int i) {
        return S0(i) + 8;
    }

    public static int O0(int i, int i5) {
        return U0((i5 >> 31) ^ (i5 << 1)) + S0(i);
    }

    public static int P0(int i, long j5) {
        return W0((j5 >> 63) ^ (j5 << 1)) + S0(i);
    }

    public static int Q0(int i, String str) {
        return R0(str) + S0(i);
    }

    public static int R0(String str) {
        int length;
        try {
            length = l0.a(str);
        } catch (k0 unused) {
            length = str.getBytes(AbstractC0220x.f4563a).length;
        }
        return U0(length) + length;
    }

    public static int S0(int i) {
        return U0(i << 3);
    }

    public static int T0(int i, int i5) {
        return U0(i5) + S0(i);
    }

    public static int U0(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int V0(int i, long j5) {
        return W0(j5) + S0(i);
    }

    public static int W0(long j5) {
        return (640 - (Long.numberOfLeadingZeros(j5) * 9)) >>> 6;
    }

    public final void A0(int i) {
        boolean z4 = h;
        byte[] bArr = this.f4525c;
        if (z4) {
            while ((i & (-128)) != 0) {
                int i5 = this.f4527e;
                this.f4527e = i5 + 1;
                i0.j(bArr, i5, (byte) ((i | 128) & 255));
                i >>>= 7;
            }
            int i6 = this.f4527e;
            this.f4527e = i6 + 1;
            i0.j(bArr, i6, (byte) i);
            return;
        }
        while ((i & (-128)) != 0) {
            int i7 = this.f4527e;
            this.f4527e = i7 + 1;
            bArr[i7] = (byte) ((i | 128) & 255);
            i >>>= 7;
        }
        int i8 = this.f4527e;
        this.f4527e = i8 + 1;
        bArr[i8] = (byte) i;
    }

    public final void B0(long j5) {
        boolean z4 = h;
        byte[] bArr = this.f4525c;
        if (z4) {
            while ((j5 & (-128)) != 0) {
                int i = this.f4527e;
                this.f4527e = i + 1;
                i0.j(bArr, i, (byte) ((((int) j5) | 128) & 255));
                j5 >>>= 7;
            }
            int i5 = this.f4527e;
            this.f4527e = i5 + 1;
            i0.j(bArr, i5, (byte) j5);
            return;
        }
        while ((j5 & (-128)) != 0) {
            int i6 = this.f4527e;
            this.f4527e = i6 + 1;
            bArr[i6] = (byte) ((((int) j5) | 128) & 255);
            j5 >>>= 7;
        }
        int i7 = this.f4527e;
        this.f4527e = i7 + 1;
        bArr[i7] = (byte) j5;
    }

    public final void X0() {
        this.f4528f.write(this.f4525c, 0, this.f4527e);
        this.f4527e = 0;
    }

    public final void Y0(int i) {
        if (this.f4526d - this.f4527e < i) {
            X0();
        }
    }

    public final void Z0(byte b5) {
        if (this.f4527e == this.f4526d) {
            X0();
        }
        int i = this.f4527e;
        this.f4527e = i + 1;
        this.f4525c[i] = b5;
    }

    public final void a1(byte[] bArr, int i, int i5) {
        int i6 = this.f4527e;
        int i7 = this.f4526d;
        int i8 = i7 - i6;
        byte[] bArr2 = this.f4525c;
        if (i8 >= i5) {
            System.arraycopy(bArr, i, bArr2, i6, i5);
            this.f4527e += i5;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i6, i8);
        int i9 = i + i8;
        int i10 = i5 - i8;
        this.f4527e = i7;
        X0();
        if (i10 > i7) {
            this.f4528f.write(bArr, i9, i10);
        } else {
            System.arraycopy(bArr, i9, bArr2, 0, i10);
            this.f4527e = i10;
        }
    }

    public final void b1(int i, boolean z4) {
        Y0(11);
        z0(i, 0);
        byte b5 = z4 ? (byte) 1 : (byte) 0;
        int i5 = this.f4527e;
        this.f4527e = i5 + 1;
        this.f4525c[i5] = b5;
    }

    public final void c1(int i, C0204g c0204g) {
        m1(i, 2);
        d1(c0204g);
    }

    public final void d1(C0204g c0204g) {
        o1(c0204g.size());
        k0(c0204g.f4496b, c0204g.j(), c0204g.size());
    }

    public final void e1(int i, int i5) {
        Y0(14);
        z0(i, 5);
        x0(i5);
    }

    public final void f1(int i) {
        Y0(4);
        x0(i);
    }

    public final void g1(int i, long j5) {
        Y0(18);
        z0(i, 1);
        y0(j5);
    }

    public final void h1(long j5) {
        Y0(8);
        y0(j5);
    }

    public final void i1(int i, int i5) {
        Y0(20);
        z0(i, 0);
        if (i5 >= 0) {
            A0(i5);
        } else {
            B0(i5);
        }
    }

    public final void j1(int i) {
        if (i >= 0) {
            o1(i);
        } else {
            q1(i);
        }
    }

    @Override // S0.f
    public final void k0(byte[] bArr, int i, int i5) {
        a1(bArr, i, i5);
    }

    public final void k1(int i, String str) throws O2.b {
        m1(i, 2);
        l1(str);
    }

    public final void l1(String str) throws O2.b {
        try {
            int length = str.length() * 3;
            int iU0 = U0(length);
            int i = iU0 + length;
            int i5 = this.f4526d;
            if (i > i5) {
                byte[] bArr = new byte[length];
                int iT = l0.f4529a.t(str, bArr, 0, length);
                o1(iT);
                a1(bArr, 0, iT);
                return;
            }
            if (i > i5 - this.f4527e) {
                X0();
            }
            int iU02 = U0(str.length());
            int i6 = this.f4527e;
            byte[] bArr2 = this.f4525c;
            try {
                if (iU02 == iU0) {
                    int i7 = i6 + iU02;
                    this.f4527e = i7;
                    int iT2 = l0.f4529a.t(str, bArr2, i7, i5 - i7);
                    this.f4527e = i6;
                    A0((iT2 - i6) - iU02);
                    this.f4527e = iT2;
                } else {
                    int iA = l0.a(str);
                    A0(iA);
                    this.f4527e = l0.f4529a.t(str, bArr2, this.f4527e, iA);
                }
            } catch (k0 e5) {
                this.f4527e = i6;
                throw e5;
            } catch (ArrayIndexOutOfBoundsException e6) {
                throw new O2.b(e6);
            }
        } catch (k0 e7) {
            f4523g.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e7);
            byte[] bytes = str.getBytes(AbstractC0220x.f4563a);
            try {
                o1(bytes.length);
                k0(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e8) {
                throw new O2.b(e8);
            }
        }
    }

    public final void m1(int i, int i5) {
        o1((i << 3) | i5);
    }

    public final void n1(int i, int i5) {
        Y0(20);
        z0(i, 0);
        A0(i5);
    }

    public final void o1(int i) {
        Y0(5);
        A0(i);
    }

    public final void p1(int i, long j5) {
        Y0(20);
        z0(i, 0);
        B0(j5);
    }

    public final void q1(long j5) {
        Y0(10);
        B0(j5);
    }

    public final void x0(int i) {
        int i5 = this.f4527e;
        int i6 = i5 + 1;
        this.f4527e = i6;
        byte[] bArr = this.f4525c;
        bArr[i5] = (byte) (i & 255);
        int i7 = i5 + 2;
        this.f4527e = i7;
        bArr[i6] = (byte) ((i >> 8) & 255);
        int i8 = i5 + 3;
        this.f4527e = i8;
        bArr[i7] = (byte) ((i >> 16) & 255);
        this.f4527e = i5 + 4;
        bArr[i8] = (byte) ((i >> 24) & 255);
    }

    public final void y0(long j5) {
        int i = this.f4527e;
        int i5 = i + 1;
        this.f4527e = i5;
        byte[] bArr = this.f4525c;
        bArr[i] = (byte) (j5 & 255);
        int i6 = i + 2;
        this.f4527e = i6;
        bArr[i5] = (byte) ((j5 >> 8) & 255);
        int i7 = i + 3;
        this.f4527e = i7;
        bArr[i6] = (byte) ((j5 >> 16) & 255);
        int i8 = i + 4;
        this.f4527e = i8;
        bArr[i7] = (byte) (255 & (j5 >> 24));
        int i9 = i + 5;
        this.f4527e = i9;
        bArr[i8] = (byte) (((int) (j5 >> 32)) & 255);
        int i10 = i + 6;
        this.f4527e = i10;
        bArr[i9] = (byte) (((int) (j5 >> 40)) & 255);
        int i11 = i + 7;
        this.f4527e = i11;
        bArr[i10] = (byte) (((int) (j5 >> 48)) & 255);
        this.f4527e = i + 8;
        bArr[i11] = (byte) (((int) (j5 >> 56)) & 255);
    }

    public final void z0(int i, int i5) {
        A0((i << 3) | i5);
    }
}
