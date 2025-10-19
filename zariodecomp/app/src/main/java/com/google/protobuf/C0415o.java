package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.protobuf.o, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\o.1.smali */
public final class C0415o extends AbstractC0417p {

    /* renamed from: d, reason: collision with root package name */
    public final InputStream f6551d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f6552e;

    /* renamed from: f, reason: collision with root package name */
    public int f6553f;

    /* renamed from: k, reason: collision with root package name */
    public int f6554k;

    /* renamed from: l, reason: collision with root package name */
    public int f6555l;

    /* renamed from: m, reason: collision with root package name */
    public int f6556m;

    /* renamed from: n, reason: collision with root package name */
    public int f6557n;

    /* renamed from: o, reason: collision with root package name */
    public int f6558o = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    public C0415o(InputStream inputStream) {
        Charset charset = L.f6425a;
        this.f6551d = inputStream;
        this.f6552e = new byte[4096];
        this.f6553f = 0;
        this.f6555l = 0;
        this.f6557n = 0;
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final int A() {
        return AbstractC0417p.h(O());
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final long B() {
        return AbstractC0417p.i(P());
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final String C() throws N {
        int iO = O();
        byte[] bArr = this.f6552e;
        if (iO > 0) {
            int i = this.f6553f;
            int i5 = this.f6555l;
            if (iO <= i - i5) {
                String str = new String(bArr, i5, iO, L.f6425a);
                this.f6555l += iO;
                return str;
            }
        }
        if (iO == 0) {
            return "";
        }
        if (iO < 0) {
            throw N.f();
        }
        if (iO > this.f6553f) {
            return new String(J(iO), L.f6425a);
        }
        S(iO);
        String str2 = new String(bArr, this.f6555l, iO, L.f6425a);
        this.f6555l += iO;
        return str2;
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final String D() throws IOException {
        int iO = O();
        int i = this.f6555l;
        int i5 = this.f6553f;
        int i6 = i5 - i;
        byte[] bArrJ = this.f6552e;
        if (iO <= i6 && iO > 0) {
            this.f6555l = i + iO;
        } else {
            if (iO == 0) {
                return "";
            }
            if (iO < 0) {
                throw N.f();
            }
            i = 0;
            if (iO <= i5) {
                S(iO);
                this.f6555l = iO;
            } else {
                bArrJ = J(iO);
            }
        }
        return P0.f6458a.H(bArrJ, i, iO);
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final int E() throws N {
        if (l()) {
            this.f6556m = 0;
            return 0;
        }
        int iO = O();
        this.f6556m = iO;
        if ((iO >>> 3) != 0) {
            return iO;
        }
        throw N.b();
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final int F() {
        return O();
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final long G() {
        return P();
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final boolean H(int i) throws N {
        int i5 = i & 7;
        int i6 = 0;
        if (i5 != 0) {
            if (i5 == 1) {
                T(8);
                return true;
            }
            if (i5 == 2) {
                T(O());
                return true;
            }
            if (i5 == 3) {
                I();
                e(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i5 == 4) {
                return false;
            }
            if (i5 != 5) {
                throw N.d();
            }
            T(4);
            return true;
        }
        int i7 = this.f6553f - this.f6555l;
        byte[] bArr = this.f6552e;
        if (i7 >= 10) {
            while (i6 < 10) {
                int i8 = this.f6555l;
                this.f6555l = i8 + 1;
                if (bArr[i8] < 0) {
                    i6++;
                }
            }
            throw N.e();
        }
        while (i6 < 10) {
            if (this.f6555l == this.f6553f) {
                S(1);
            }
            int i9 = this.f6555l;
            this.f6555l = i9 + 1;
            if (bArr[i9] < 0) {
                i6++;
            }
        }
        throw N.e();
        return true;
    }

    public final byte[] J(int i) throws IOException {
        byte[] bArrK = K(i);
        if (bArrK != null) {
            return bArrK;
        }
        int i5 = this.f6555l;
        int i6 = this.f6553f;
        int length = i6 - i5;
        this.f6557n += i6;
        this.f6555l = 0;
        this.f6553f = 0;
        ArrayList arrayListL = L(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f6552e, i5, bArr, 0, length);
        Iterator it = arrayListL.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] K(int i) throws IOException {
        if (i == 0) {
            return L.f6426b;
        }
        if (i < 0) {
            throw N.f();
        }
        int i5 = this.f6557n;
        int i6 = this.f6555l;
        int i7 = i5 + i6 + i;
        if (i7 - com.google.android.gms.common.api.f.API_PRIORITY_OTHER > 0) {
            throw new N("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i8 = this.f6558o;
        if (i7 > i8) {
            T((i8 - i5) - i6);
            throw N.h();
        }
        int i9 = this.f6553f - i6;
        int i10 = i - i9;
        InputStream inputStream = this.f6551d;
        if (i10 >= 4096) {
            try {
                if (i10 > inputStream.available()) {
                    return null;
                }
            } catch (N e5) {
                e5.f6436a = true;
                throw e5;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f6552e, this.f6555l, bArr, 0, i9);
        this.f6557n += this.f6553f;
        this.f6555l = 0;
        this.f6553f = 0;
        while (i9 < i) {
            try {
                int i11 = inputStream.read(bArr, i9, i - i9);
                if (i11 == -1) {
                    throw N.h();
                }
                this.f6557n += i11;
                i9 += i11;
            } catch (N e6) {
                e6.f6436a = true;
                throw e6;
            }
        }
        return bArr;
    }

    public final ArrayList L(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i5 = 0;
            while (i5 < iMin) {
                int i6 = this.f6551d.read(bArr, i5, iMin - i5);
                if (i6 == -1) {
                    throw N.h();
                }
                this.f6557n += i6;
                i5 += i6;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int M() throws N {
        int i = this.f6555l;
        if (this.f6553f - i < 4) {
            S(4);
            i = this.f6555l;
        }
        this.f6555l = i + 4;
        byte[] bArr = this.f6552e;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long N() throws N {
        int i = this.f6555l;
        if (this.f6553f - i < 8) {
            S(8);
            i = this.f6555l;
        }
        this.f6555l = i + 8;
        byte[] bArr = this.f6552e;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public final int O() {
        int i;
        int i5 = this.f6555l;
        int i6 = this.f6553f;
        if (i6 != i5) {
            int i7 = i5 + 1;
            byte[] bArr = this.f6552e;
            byte b5 = bArr[i5];
            if (b5 >= 0) {
                this.f6555l = i7;
                return b5;
            }
            if (i6 - i7 >= 9) {
                int i8 = i5 + 2;
                int i9 = (bArr[i7] << 7) ^ b5;
                if (i9 < 0) {
                    i = i9 ^ (-128);
                } else {
                    int i10 = i5 + 3;
                    int i11 = (bArr[i8] << 14) ^ i9;
                    if (i11 >= 0) {
                        i = i11 ^ 16256;
                    } else {
                        int i12 = i5 + 4;
                        int i13 = i11 ^ (bArr[i10] << 21);
                        if (i13 < 0) {
                            i = (-2080896) ^ i13;
                        } else {
                            i10 = i5 + 5;
                            byte b6 = bArr[i12];
                            int i14 = (i13 ^ (b6 << 28)) ^ 266354560;
                            if (b6 < 0) {
                                i12 = i5 + 6;
                                if (bArr[i10] < 0) {
                                    i10 = i5 + 7;
                                    if (bArr[i12] < 0) {
                                        i12 = i5 + 8;
                                        if (bArr[i10] < 0) {
                                            i10 = i5 + 9;
                                            if (bArr[i12] < 0) {
                                                int i15 = i5 + 10;
                                                if (bArr[i10] >= 0) {
                                                    i8 = i15;
                                                    i = i14;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i14;
                            }
                            i = i14;
                        }
                        i8 = i12;
                    }
                    i8 = i10;
                }
                this.f6555l = i8;
                return i;
            }
        }
        return (int) Q();
    }

    public final long P() {
        long j5;
        long j6;
        long j7;
        long j8;
        int i = this.f6555l;
        int i5 = this.f6553f;
        if (i5 != i) {
            int i6 = i + 1;
            byte[] bArr = this.f6552e;
            byte b5 = bArr[i];
            if (b5 >= 0) {
                this.f6555l = i6;
                return b5;
            }
            if (i5 - i6 >= 9) {
                int i7 = i + 2;
                int i8 = (bArr[i6] << 7) ^ b5;
                if (i8 < 0) {
                    j5 = i8 ^ (-128);
                } else {
                    int i9 = i + 3;
                    int i10 = (bArr[i7] << 14) ^ i8;
                    if (i10 >= 0) {
                        j5 = i10 ^ 16256;
                        i7 = i9;
                    } else {
                        int i11 = i + 4;
                        int i12 = i10 ^ (bArr[i9] << 21);
                        if (i12 < 0) {
                            j8 = (-2080896) ^ i12;
                        } else {
                            long j9 = i12;
                            i7 = i + 5;
                            long j10 = j9 ^ (bArr[i11] << 28);
                            if (j10 >= 0) {
                                j7 = 266354560;
                            } else {
                                i11 = i + 6;
                                long j11 = j10 ^ (bArr[i7] << 35);
                                if (j11 < 0) {
                                    j6 = -34093383808L;
                                } else {
                                    i7 = i + 7;
                                    j10 = j11 ^ (bArr[i11] << 42);
                                    if (j10 >= 0) {
                                        j7 = 4363953127296L;
                                    } else {
                                        i11 = i + 8;
                                        j11 = j10 ^ (bArr[i7] << 49);
                                        if (j11 < 0) {
                                            j6 = -558586000294016L;
                                        } else {
                                            i7 = i + 9;
                                            long j12 = (j11 ^ (bArr[i11] << 56)) ^ 71499008037633920L;
                                            if (j12 < 0) {
                                                int i13 = i + 10;
                                                if (bArr[i7] >= 0) {
                                                    i7 = i13;
                                                }
                                            }
                                            j5 = j12;
                                        }
                                    }
                                }
                                j8 = j6 ^ j11;
                            }
                            j5 = j7 ^ j10;
                        }
                        i7 = i11;
                        j5 = j8;
                    }
                }
                this.f6555l = i7;
                return j5;
            }
        }
        return Q();
    }

    public final long Q() throws N {
        long j5 = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f6555l == this.f6553f) {
                S(1);
            }
            int i5 = this.f6555l;
            this.f6555l = i5 + 1;
            j5 |= (r3 & 127) << i;
            if ((this.f6552e[i5] & 128) == 0) {
                return j5;
            }
        }
        throw N.e();
    }

    public final void R() {
        int i = this.f6553f + this.f6554k;
        this.f6553f = i;
        int i5 = this.f6557n + i;
        int i6 = this.f6558o;
        if (i5 <= i6) {
            this.f6554k = 0;
            return;
        }
        int i7 = i5 - i6;
        this.f6554k = i7;
        this.f6553f = i - i7;
    }

    public final void S(int i) throws N {
        if (U(i)) {
            return;
        }
        if (i <= (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - this.f6557n) - this.f6555l) {
            throw N.h();
        }
        throw new N("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void T(int i) throws N {
        int i5 = this.f6553f;
        int i6 = this.f6555l;
        if (i <= i5 - i6 && i >= 0) {
            this.f6555l = i6 + i;
            return;
        }
        InputStream inputStream = this.f6551d;
        if (i < 0) {
            throw N.f();
        }
        int i7 = this.f6557n;
        int i8 = i7 + i6;
        int i9 = i8 + i;
        int i10 = this.f6558o;
        if (i9 > i10) {
            T((i10 - i7) - i6);
            throw N.h();
        }
        this.f6557n = i8;
        int i11 = i5 - i6;
        this.f6553f = 0;
        this.f6555l = 0;
        while (i11 < i) {
            long j5 = i - i11;
            try {
                try {
                    long jSkip = inputStream.skip(j5);
                    if (jSkip < 0 || jSkip > j5) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i11 += (int) jSkip;
                    }
                } catch (N e5) {
                    e5.f6436a = true;
                    throw e5;
                }
            } catch (Throwable th) {
                this.f6557n += i11;
                R();
                throw th;
            }
        }
        this.f6557n += i11;
        R();
        if (i11 >= i) {
            return;
        }
        int i12 = this.f6553f;
        int i13 = i12 - this.f6555l;
        this.f6555l = i12;
        S(1);
        while (true) {
            int i14 = i - i13;
            int i15 = this.f6553f;
            if (i14 <= i15) {
                this.f6555l = i14;
                return;
            } else {
                i13 += i15;
                this.f6555l = i15;
                S(1);
            }
        }
    }

    public final boolean U(int i) throws IOException {
        int i5 = this.f6555l;
        int i6 = i5 + i;
        int i7 = this.f6553f;
        if (i6 <= i7) {
            throw new IllegalStateException(B.a.i("refillBuffer() called when ", i, " bytes were already available in buffer"));
        }
        int i8 = this.f6557n;
        if (i > (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i8) - i5 || i8 + i5 + i > this.f6558o) {
            return false;
        }
        byte[] bArr = this.f6552e;
        if (i5 > 0) {
            if (i7 > i5) {
                System.arraycopy(bArr, i5, bArr, 0, i7 - i5);
            }
            this.f6557n += i5;
            this.f6553f -= i5;
            this.f6555l = 0;
        }
        int i9 = this.f6553f;
        int iMin = Math.min(bArr.length - i9, (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - this.f6557n) - i9);
        InputStream inputStream = this.f6551d;
        try {
            int i10 = inputStream.read(bArr, i9, iMin);
            if (i10 == 0 || i10 < -1 || i10 > bArr.length) {
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i10 + "\nThe InputStream implementation is buggy.");
            }
            if (i10 <= 0) {
                return false;
            }
            this.f6553f += i10;
            R();
            if (this.f6553f >= i) {
                return true;
            }
            return U(i);
        } catch (N e5) {
            e5.f6436a = true;
            throw e5;
        }
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final void e(int i) throws N {
        if (this.f6556m != i) {
            throw N.a();
        }
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final int k() {
        return this.f6557n + this.f6555l;
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final boolean l() {
        return this.f6555l == this.f6553f && !U(1);
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final void n(int i) {
        this.f6558o = i;
        R();
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final int o(int i) throws N {
        if (i < 0) {
            throw N.f();
        }
        int i5 = this.f6557n + this.f6555l + i;
        int i6 = this.f6558o;
        if (i5 > i6) {
            throw N.h();
        }
        this.f6558o = i5;
        R();
        return i6;
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final boolean p() {
        return P() != 0;
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final C0407k q() throws IOException {
        int iO = O();
        int i = this.f6553f;
        int i5 = this.f6555l;
        int i6 = i - i5;
        byte[] bArr = this.f6552e;
        if (iO <= i6 && iO > 0) {
            C0407k c0407kK = AbstractC0409l.k(bArr, i5, iO);
            this.f6555l += iO;
            return c0407kK;
        }
        if (iO == 0) {
            return AbstractC0409l.f6528b;
        }
        if (iO < 0) {
            throw N.f();
        }
        byte[] bArrK = K(iO);
        if (bArrK != null) {
            return AbstractC0409l.k(bArrK, 0, bArrK.length);
        }
        int i7 = this.f6555l;
        int i8 = this.f6553f;
        int length = i8 - i7;
        this.f6557n += i8;
        this.f6555l = 0;
        this.f6553f = 0;
        ArrayList arrayListL = L(iO - length);
        byte[] bArr2 = new byte[iO];
        System.arraycopy(bArr, i7, bArr2, 0, length);
        Iterator it = arrayListL.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C0407k c0407k = AbstractC0409l.f6528b;
        return new C0407k(bArr2);
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final double r() {
        return Double.longBitsToDouble(N());
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final int s() {
        return O();
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final int t() {
        return M();
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final long u() {
        return N();
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final float v() {
        return Float.intBitsToFloat(M());
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final int w() {
        return O();
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final long x() {
        return P();
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final int y() {
        return M();
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final long z() {
        return N();
    }
}
