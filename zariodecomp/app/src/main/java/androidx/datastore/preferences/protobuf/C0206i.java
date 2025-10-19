package androidx.datastore.preferences.protobuf;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\i.1.smali */
public final class C0206i extends AbstractC0207j {

    /* renamed from: c, reason: collision with root package name */
    public final FileInputStream f4503c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f4504d;

    /* renamed from: e, reason: collision with root package name */
    public int f4505e;

    /* renamed from: f, reason: collision with root package name */
    public int f4506f;

    /* renamed from: g, reason: collision with root package name */
    public int f4507g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f4508j = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    public C0206i(FileInputStream fileInputStream) {
        Charset charset = AbstractC0220x.f4563a;
        this.f4503c = fileInputStream;
        this.f4504d = new byte[4096];
        this.f4505e = 0;
        this.f4507g = 0;
        this.i = 0;
    }

    public final byte[] A(int i) throws IOException {
        if (i == 0) {
            return AbstractC0220x.f4564b;
        }
        if (i < 0) {
            throw C0222z.d();
        }
        int i5 = this.i;
        int i6 = this.f4507g;
        int i7 = i5 + i6 + i;
        if (i7 - com.google.android.gms.common.api.f.API_PRIORITY_OTHER > 0) {
            throw new C0222z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i8 = this.f4508j;
        if (i7 > i8) {
            J((i8 - i5) - i6);
            throw C0222z.e();
        }
        int i9 = this.f4505e - i6;
        int i10 = i - i9;
        FileInputStream fileInputStream = this.f4503c;
        if (i10 >= 4096) {
            try {
                if (i10 > fileInputStream.available()) {
                    return null;
                }
            } catch (C0222z e5) {
                e5.f4565a = true;
                throw e5;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f4504d, this.f4507g, bArr, 0, i9);
        this.i += this.f4505e;
        this.f4507g = 0;
        this.f4505e = 0;
        while (i9 < i) {
            try {
                int i11 = fileInputStream.read(bArr, i9, i - i9);
                if (i11 == -1) {
                    throw C0222z.e();
                }
                this.i += i11;
                i9 += i11;
            } catch (C0222z e6) {
                e6.f4565a = true;
                throw e6;
            }
        }
        return bArr;
    }

    public final ArrayList B(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i5 = 0;
            while (i5 < iMin) {
                int i6 = this.f4503c.read(bArr, i5, iMin - i5);
                if (i6 == -1) {
                    throw C0222z.e();
                }
                this.i += i6;
                i5 += i6;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int C() throws C0222z {
        int i = this.f4507g;
        if (this.f4505e - i < 4) {
            I(4);
            i = this.f4507g;
        }
        this.f4507g = i + 4;
        byte[] bArr = this.f4504d;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long D() throws C0222z {
        int i = this.f4507g;
        if (this.f4505e - i < 8) {
            I(8);
            i = this.f4507g;
        }
        this.f4507g = i + 8;
        byte[] bArr = this.f4504d;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public final int E() {
        int i;
        int i5 = this.f4507g;
        int i6 = this.f4505e;
        if (i6 != i5) {
            int i7 = i5 + 1;
            byte[] bArr = this.f4504d;
            byte b5 = bArr[i5];
            if (b5 >= 0) {
                this.f4507g = i7;
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
                this.f4507g = i8;
                return i;
            }
        }
        return (int) G();
    }

    public final long F() {
        long j5;
        long j6;
        long j7;
        long j8;
        int i = this.f4507g;
        int i5 = this.f4505e;
        if (i5 != i) {
            int i6 = i + 1;
            byte[] bArr = this.f4504d;
            byte b5 = bArr[i];
            if (b5 >= 0) {
                this.f4507g = i6;
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
                this.f4507g = i7;
                return j5;
            }
        }
        return G();
    }

    public final long G() throws C0222z {
        long j5 = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f4507g == this.f4505e) {
                I(1);
            }
            int i5 = this.f4507g;
            this.f4507g = i5 + 1;
            j5 |= (r3 & 127) << i;
            if ((this.f4504d[i5] & 128) == 0) {
                return j5;
            }
        }
        throw C0222z.c();
    }

    public final void H() {
        int i = this.f4505e + this.f4506f;
        this.f4505e = i;
        int i5 = this.i + i;
        int i6 = this.f4508j;
        if (i5 <= i6) {
            this.f4506f = 0;
            return;
        }
        int i7 = i5 - i6;
        this.f4506f = i7;
        this.f4505e = i - i7;
    }

    public final void I(int i) throws C0222z {
        if (K(i)) {
            return;
        }
        if (i <= (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - this.i) - this.f4507g) {
            throw C0222z.e();
        }
        throw new C0222z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void J(int i) throws C0222z {
        int i5 = this.f4505e;
        int i6 = this.f4507g;
        int i7 = i5 - i6;
        if (i <= i7 && i >= 0) {
            this.f4507g = i6 + i;
            return;
        }
        FileInputStream fileInputStream = this.f4503c;
        if (i < 0) {
            throw C0222z.d();
        }
        int i8 = this.i;
        int i9 = i8 + i6;
        int i10 = i9 + i;
        int i11 = this.f4508j;
        if (i10 > i11) {
            J((i11 - i8) - i6);
            throw C0222z.e();
        }
        this.i = i9;
        this.f4505e = 0;
        this.f4507g = 0;
        while (i7 < i) {
            long j5 = i - i7;
            try {
                try {
                    long jSkip = fileInputStream.skip(j5);
                    if (jSkip < 0 || jSkip > j5) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i7 += (int) jSkip;
                    }
                } catch (C0222z e5) {
                    e5.f4565a = true;
                    throw e5;
                }
            } catch (Throwable th) {
                this.i += i7;
                H();
                throw th;
            }
        }
        this.i += i7;
        H();
        if (i7 >= i) {
            return;
        }
        int i12 = this.f4505e;
        int i13 = i12 - this.f4507g;
        this.f4507g = i12;
        I(1);
        while (true) {
            int i14 = i - i13;
            int i15 = this.f4505e;
            if (i14 <= i15) {
                this.f4507g = i14;
                return;
            } else {
                i13 += i15;
                this.f4507g = i15;
                I(1);
            }
        }
    }

    public final boolean K(int i) throws IOException {
        int i5 = this.f4507g;
        int i6 = i5 + i;
        int i7 = this.f4505e;
        if (i6 <= i7) {
            throw new IllegalStateException(B.a.i("refillBuffer() called when ", i, " bytes were already available in buffer"));
        }
        int i8 = this.i;
        if (i > (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i8) - i5 || i8 + i5 + i > this.f4508j) {
            return false;
        }
        byte[] bArr = this.f4504d;
        if (i5 > 0) {
            if (i7 > i5) {
                System.arraycopy(bArr, i5, bArr, 0, i7 - i5);
            }
            this.i += i5;
            this.f4505e -= i5;
            this.f4507g = 0;
        }
        int i9 = this.f4505e;
        int iMin = Math.min(bArr.length - i9, (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - this.i) - i9);
        FileInputStream fileInputStream = this.f4503c;
        try {
            int i10 = fileInputStream.read(bArr, i9, iMin);
            if (i10 == 0 || i10 < -1 || i10 > bArr.length) {
                throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i10 + "\nThe InputStream implementation is buggy.");
            }
            if (i10 <= 0) {
                return false;
            }
            this.f4505e += i10;
            H();
            if (this.f4505e >= i) {
                return true;
            }
            return K(i);
        } catch (C0222z e5) {
            e5.f4565a = true;
            throw e5;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final void a(int i) throws C0222z {
        if (this.h != i) {
            throw new C0222z("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final int b() {
        return this.i + this.f4507g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final boolean c() {
        return this.f4507g == this.f4505e && !K(1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final void d(int i) {
        this.f4508j = i;
        H();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final int e(int i) throws C0222z {
        if (i < 0) {
            throw C0222z.d();
        }
        int i5 = this.i + this.f4507g + i;
        if (i5 < 0) {
            throw new C0222z("Failed to parse the message.");
        }
        int i6 = this.f4508j;
        if (i5 > i6) {
            throw C0222z.e();
        }
        this.f4508j = i5;
        H();
        return i6;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final boolean f() {
        return F() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final C0204g g() throws IOException {
        int iE = E();
        int i = this.f4505e;
        int i5 = this.f4507g;
        int i6 = i - i5;
        byte[] bArr = this.f4504d;
        if (iE <= i6 && iE > 0) {
            C0204g c0204gH = C0204g.h(bArr, i5, iE);
            this.f4507g += iE;
            return c0204gH;
        }
        if (iE == 0) {
            return C0204g.f4493c;
        }
        if (iE < 0) {
            throw C0222z.d();
        }
        byte[] bArrA = A(iE);
        if (bArrA != null) {
            return C0204g.h(bArrA, 0, bArrA.length);
        }
        int i7 = this.f4507g;
        int i8 = this.f4505e;
        int length = i8 - i7;
        this.i += i8;
        this.f4507g = 0;
        this.f4505e = 0;
        ArrayList arrayListB = B(iE - length);
        byte[] bArr2 = new byte[iE];
        System.arraycopy(bArr, i7, bArr2, 0, length);
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C0204g c0204g = C0204g.f4493c;
        return new C0204g(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final double h() {
        return Double.longBitsToDouble(D());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final int i() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final int j() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final long k() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final float l() {
        return Float.intBitsToFloat(C());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final int m() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final long n() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final int o() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final long p() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final int q() {
        int iE = E();
        return (-(iE & 1)) ^ (iE >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final long r() {
        long jF = F();
        return (-(jF & 1)) ^ (jF >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final String s() throws C0222z {
        int iE = E();
        byte[] bArr = this.f4504d;
        if (iE > 0) {
            int i = this.f4505e;
            int i5 = this.f4507g;
            if (iE <= i - i5) {
                String str = new String(bArr, i5, iE, AbstractC0220x.f4563a);
                this.f4507g += iE;
                return str;
            }
        }
        if (iE == 0) {
            return "";
        }
        if (iE < 0) {
            throw C0222z.d();
        }
        if (iE > this.f4505e) {
            return new String(z(iE), AbstractC0220x.f4563a);
        }
        I(iE);
        String str2 = new String(bArr, this.f4507g, iE, AbstractC0220x.f4563a);
        this.f4507g += iE;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final String t() throws IOException {
        int iE = E();
        int i = this.f4507g;
        int i5 = this.f4505e;
        int i6 = i5 - i;
        byte[] bArrZ = this.f4504d;
        if (iE <= i6 && iE > 0) {
            this.f4507g = i + iE;
        } else {
            if (iE == 0) {
                return "";
            }
            if (iE < 0) {
                throw C0222z.d();
            }
            i = 0;
            if (iE <= i5) {
                I(iE);
                this.f4507g = iE;
            } else {
                bArrZ = z(iE);
            }
        }
        return l0.f4529a.s(bArrZ, i, iE);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final int u() throws C0222z {
        if (c()) {
            this.h = 0;
            return 0;
        }
        int iE = E();
        this.h = iE;
        if ((iE >>> 3) != 0) {
            return iE;
        }
        throw new C0222z("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final int v() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final long w() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final boolean x(int i) throws C0222z {
        int i5 = i & 7;
        int i6 = 0;
        if (i5 != 0) {
            if (i5 == 1) {
                J(8);
                return true;
            }
            if (i5 == 2) {
                J(E());
                return true;
            }
            if (i5 == 3) {
                y();
                a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i5 == 4) {
                return false;
            }
            if (i5 != 5) {
                throw C0222z.b();
            }
            J(4);
            return true;
        }
        int i7 = this.f4505e - this.f4507g;
        byte[] bArr = this.f4504d;
        if (i7 >= 10) {
            while (i6 < 10) {
                int i8 = this.f4507g;
                this.f4507g = i8 + 1;
                if (bArr[i8] < 0) {
                    i6++;
                }
            }
            throw C0222z.c();
        }
        while (i6 < 10) {
            if (this.f4507g == this.f4505e) {
                I(1);
            }
            int i9 = this.f4507g;
            this.f4507g = i9 + 1;
            if (bArr[i9] < 0) {
                i6++;
            }
        }
        throw C0222z.c();
        return true;
    }

    public final byte[] z(int i) throws IOException {
        byte[] bArrA = A(i);
        if (bArrA != null) {
            return bArrA;
        }
        int i5 = this.f4507g;
        int i6 = this.f4505e;
        int length = i6 - i5;
        this.i += i6;
        this.f4507g = 0;
        this.f4505e = 0;
        ArrayList arrayListB = B(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f4504d, i5, bArr, 0, length);
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }
}
