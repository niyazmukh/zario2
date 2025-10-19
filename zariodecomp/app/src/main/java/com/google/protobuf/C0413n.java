package com.google.protobuf;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.protobuf.n, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\n.1.smali */
public final class C0413n extends AbstractC0417p {

    /* renamed from: d, reason: collision with root package name */
    public final Iterator f6538d;

    /* renamed from: e, reason: collision with root package name */
    public ByteBuffer f6539e;

    /* renamed from: f, reason: collision with root package name */
    public int f6540f;

    /* renamed from: k, reason: collision with root package name */
    public int f6541k;

    /* renamed from: m, reason: collision with root package name */
    public int f6543m;

    /* renamed from: o, reason: collision with root package name */
    public long f6545o;

    /* renamed from: p, reason: collision with root package name */
    public long f6546p;

    /* renamed from: q, reason: collision with root package name */
    public long f6547q;

    /* renamed from: l, reason: collision with root package name */
    public int f6542l = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: n, reason: collision with root package name */
    public int f6544n = 0;

    public C0413n(int i, ArrayList arrayList) {
        this.f6540f = i;
        this.f6538d = arrayList.iterator();
        if (i != 0) {
            T();
            return;
        }
        this.f6539e = L.f6427c;
        this.f6545o = 0L;
        this.f6546p = 0L;
        this.f6547q = 0L;
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
        if (iO > 0) {
            long j5 = iO;
            long j6 = this.f6547q;
            long j7 = this.f6545o;
            if (j5 <= j6 - j7) {
                byte[] bArr = new byte[iO];
                M0.f6430b.c(j7, bArr, 0L, j5);
                String str = new String(bArr, L.f6425a);
                this.f6545o += j5;
                return str;
            }
        }
        if (iO > 0 && iO <= R()) {
            byte[] bArr2 = new byte[iO];
            L(bArr2, iO);
            return new String(bArr2, L.f6425a);
        }
        if (iO == 0) {
            return "";
        }
        if (iO < 0) {
            throw N.f();
        }
        throw N.h();
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final String D() throws N {
        int iO = O();
        if (iO > 0) {
            long j5 = iO;
            long j6 = this.f6547q;
            long j7 = this.f6545o;
            if (j5 <= j6 - j7) {
                String strB = P0.b(this.f6539e, (int) (j7 - this.f6546p), iO);
                this.f6545o += j5;
                return strB;
            }
        }
        if (iO >= 0 && iO <= R()) {
            byte[] bArr = new byte[iO];
            L(bArr, iO);
            return P0.f6458a.H(bArr, 0, iO);
        }
        if (iO == 0) {
            return "";
        }
        if (iO <= 0) {
            throw N.f();
        }
        throw N.h();
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final int E() throws N {
        if (l()) {
            this.f6543m = 0;
            return 0;
        }
        int iO = O();
        this.f6543m = iO;
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
        if (i5 == 0) {
            for (int i6 = 0; i6 < 10; i6++) {
                if (K() >= 0) {
                    return true;
                }
            }
            throw N.e();
        }
        if (i5 == 1) {
            S(8);
            return true;
        }
        if (i5 == 2) {
            S(O());
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
        S(4);
        return true;
    }

    public final long J() {
        return this.f6547q - this.f6545o;
    }

    public final byte K() throws N {
        if (J() == 0) {
            if (!this.f6538d.hasNext()) {
                throw N.h();
            }
            T();
        }
        long j5 = this.f6545o;
        this.f6545o = 1 + j5;
        return M0.f6430b.e(j5);
    }

    public final void L(byte[] bArr, int i) throws N {
        if (i < 0 || i > R()) {
            if (i > 0) {
                throw N.h();
            }
            if (i != 0) {
                throw N.f();
            }
            return;
        }
        int i5 = i;
        while (i5 > 0) {
            if (J() == 0) {
                if (!this.f6538d.hasNext()) {
                    throw N.h();
                }
                T();
            }
            int iMin = Math.min(i5, (int) J());
            long j5 = iMin;
            M0.f6430b.c(this.f6545o, bArr, i - i5, j5);
            i5 -= iMin;
            this.f6545o += j5;
        }
    }

    public final int M() {
        if (J() < 4) {
            return ((K() & 255) << 24) | (K() & 255) | ((K() & 255) << 8) | ((K() & 255) << 16);
        }
        long j5 = this.f6545o;
        this.f6545o = 4 + j5;
        L0 l02 = M0.f6430b;
        return ((l02.e(j5 + 3) & 255) << 24) | (l02.e(j5) & 255) | ((l02.e(1 + j5) & 255) << 8) | ((l02.e(2 + j5) & 255) << 16);
    }

    public final long N() throws N {
        long jK;
        byte bK;
        if (J() >= 8) {
            long j5 = this.f6545o;
            this.f6545o = 8 + j5;
            jK = (r0.e(j5) & 255) | ((r0.e(j5 + 1) & 255) << 8) | ((r0.e(2 + j5) & 255) << 16) | ((r0.e(3 + j5) & 255) << 24) | ((r0.e(4 + j5) & 255) << 32) | ((r0.e(5 + j5) & 255) << 40) | ((r0.e(6 + j5) & 255) << 48);
            bK = M0.f6430b.e(j5 + 7);
        } else {
            jK = (K() & 255) | ((K() & 255) << 8) | ((K() & 255) << 16) | ((K() & 255) << 24) | ((K() & 255) << 32) | ((K() & 255) << 40) | ((K() & 255) << 48);
            bK = K();
        }
        return ((bK & 255) << 56) | jK;
    }

    public final int O() {
        int i;
        long j5 = this.f6545o;
        if (this.f6547q != j5) {
            long j6 = j5 + 1;
            L0 l02 = M0.f6430b;
            byte bE = l02.e(j5);
            if (bE >= 0) {
                this.f6545o++;
                return bE;
            }
            if (this.f6547q - this.f6545o >= 10) {
                long j7 = 2 + j5;
                int iE = (l02.e(j6) << 7) ^ bE;
                if (iE < 0) {
                    i = iE ^ (-128);
                } else {
                    long j8 = 3 + j5;
                    int iE2 = (l02.e(j7) << 14) ^ iE;
                    if (iE2 >= 0) {
                        i = iE2 ^ 16256;
                    } else {
                        long j9 = 4 + j5;
                        int iE3 = iE2 ^ (l02.e(j8) << 21);
                        if (iE3 < 0) {
                            i = (-2080896) ^ iE3;
                        } else {
                            j8 = 5 + j5;
                            byte bE2 = l02.e(j9);
                            int i5 = (iE3 ^ (bE2 << 28)) ^ 266354560;
                            if (bE2 < 0) {
                                j9 = 6 + j5;
                                if (l02.e(j8) < 0) {
                                    j8 = 7 + j5;
                                    if (l02.e(j9) < 0) {
                                        j9 = 8 + j5;
                                        if (l02.e(j8) < 0) {
                                            j8 = 9 + j5;
                                            if (l02.e(j9) < 0) {
                                                long j10 = j5 + 10;
                                                if (l02.e(j8) >= 0) {
                                                    i = i5;
                                                    j7 = j10;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i5;
                            }
                            i = i5;
                        }
                        j7 = j9;
                    }
                    j7 = j8;
                }
                this.f6545o = j7;
                return i;
            }
        }
        return (int) Q();
    }

    public final long P() {
        long j5;
        long j6;
        long j7;
        long j8 = this.f6545o;
        if (this.f6547q != j8) {
            long j9 = j8 + 1;
            L0 l02 = M0.f6430b;
            byte bE = l02.e(j8);
            if (bE >= 0) {
                this.f6545o++;
                return bE;
            }
            if (this.f6547q - this.f6545o >= 10) {
                long j10 = 2 + j8;
                int iE = (l02.e(j9) << 7) ^ bE;
                if (iE < 0) {
                    j5 = iE ^ (-128);
                } else {
                    long j11 = 3 + j8;
                    int iE2 = (l02.e(j10) << 14) ^ iE;
                    if (iE2 >= 0) {
                        j5 = iE2 ^ 16256;
                    } else {
                        long j12 = 4 + j8;
                        int iE3 = iE2 ^ (l02.e(j11) << 21);
                        if (iE3 < 0) {
                            j5 = (-2080896) ^ iE3;
                            j10 = j12;
                        } else {
                            long j13 = 5 + j8;
                            long jE = (l02.e(j12) << 28) ^ iE3;
                            if (jE >= 0) {
                                j7 = 266354560;
                            } else {
                                j11 = 6 + j8;
                                long jE2 = jE ^ (l02.e(j13) << 35);
                                if (jE2 < 0) {
                                    j6 = -34093383808L;
                                } else {
                                    j13 = 7 + j8;
                                    jE = jE2 ^ (l02.e(j11) << 42);
                                    if (jE >= 0) {
                                        j7 = 4363953127296L;
                                    } else {
                                        j11 = 8 + j8;
                                        jE2 = jE ^ (l02.e(j13) << 49);
                                        if (jE2 < 0) {
                                            j6 = -558586000294016L;
                                        } else {
                                            j13 = 9 + j8;
                                            long jE3 = (jE2 ^ (l02.e(j11) << 56)) ^ 71499008037633920L;
                                            if (jE3 < 0) {
                                                long j14 = j8 + 10;
                                                if (l02.e(j13) >= 0) {
                                                    j5 = jE3;
                                                    j10 = j14;
                                                }
                                            } else {
                                                j5 = jE3;
                                                j10 = j13;
                                            }
                                        }
                                    }
                                }
                                j5 = j6 ^ jE2;
                            }
                            j5 = j7 ^ jE;
                            j10 = j13;
                        }
                    }
                    j10 = j11;
                }
                this.f6545o = j10;
                return j5;
            }
        }
        return Q();
    }

    public final long Q() throws N {
        long j5 = 0;
        for (int i = 0; i < 64; i += 7) {
            j5 |= (r3 & 127) << i;
            if ((K() & 128) == 0) {
                return j5;
            }
        }
        throw N.e();
    }

    public final int R() {
        return (int) (((this.f6540f - this.f6544n) - this.f6545o) + this.f6546p);
    }

    public final void S(int i) throws N {
        if (i < 0 || i > ((this.f6540f - this.f6544n) - this.f6545o) + this.f6546p) {
            if (i >= 0) {
                throw N.h();
            }
            throw N.f();
        }
        while (i > 0) {
            if (J() == 0) {
                if (!this.f6538d.hasNext()) {
                    throw N.h();
                }
                T();
            }
            int iMin = Math.min(i, (int) J());
            i -= iMin;
            this.f6545o += iMin;
        }
    }

    public final void T() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f6538d.next();
        this.f6539e = byteBuffer;
        this.f6544n += (int) (this.f6545o - this.f6546p);
        long jPosition = byteBuffer.position();
        this.f6545o = jPosition;
        this.f6546p = jPosition;
        this.f6547q = this.f6539e.limit();
        long j5 = M0.f6430b.j(this.f6539e, M0.f6434f);
        this.f6545o += j5;
        this.f6546p += j5;
        this.f6547q += j5;
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final void e(int i) throws N {
        if (this.f6543m != i) {
            throw N.a();
        }
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final int k() {
        return (int) ((this.f6544n + this.f6545o) - this.f6546p);
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final boolean l() {
        return (((long) this.f6544n) + this.f6545o) - this.f6546p == ((long) this.f6540f);
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final void n(int i) {
        this.f6542l = i;
        int i5 = this.f6540f + this.f6541k;
        this.f6540f = i5;
        if (i5 <= i) {
            this.f6541k = 0;
            return;
        }
        int i6 = i5 - i;
        this.f6541k = i6;
        this.f6540f = i5 - i6;
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final int o(int i) throws N {
        if (i < 0) {
            throw N.f();
        }
        int iK = k() + i;
        int i5 = this.f6542l;
        if (iK > i5) {
            throw N.h();
        }
        this.f6542l = iK;
        int i6 = this.f6540f + this.f6541k;
        this.f6540f = i6;
        if (i6 > iK) {
            int i7 = i6 - iK;
            this.f6541k = i7;
            this.f6540f = i6 - i7;
        } else {
            this.f6541k = 0;
        }
        return i5;
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final boolean p() {
        return P() != 0;
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final C0407k q() throws N {
        int iO = O();
        if (iO > 0) {
            long j5 = iO;
            long j6 = this.f6547q;
            long j7 = this.f6545o;
            if (j5 <= j6 - j7) {
                byte[] bArr = new byte[iO];
                M0.f6430b.c(j7, bArr, 0L, j5);
                this.f6545o += j5;
                C0407k c0407k = AbstractC0409l.f6528b;
                return new C0407k(bArr);
            }
        }
        if (iO > 0 && iO <= R()) {
            byte[] bArr2 = new byte[iO];
            L(bArr2, iO);
            C0407k c0407k2 = AbstractC0409l.f6528b;
            return new C0407k(bArr2);
        }
        if (iO == 0) {
            return AbstractC0409l.f6528b;
        }
        if (iO < 0) {
            throw N.f();
        }
        throw N.h();
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
