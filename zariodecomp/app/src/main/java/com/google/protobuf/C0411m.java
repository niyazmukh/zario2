package com.google.protobuf;

/* renamed from: com.google.protobuf.m, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\m.1.smali */
public final class C0411m extends AbstractC0417p {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f6531d;

    /* renamed from: e, reason: collision with root package name */
    public int f6532e;

    /* renamed from: f, reason: collision with root package name */
    public int f6533f;

    /* renamed from: k, reason: collision with root package name */
    public int f6534k;

    /* renamed from: l, reason: collision with root package name */
    public final int f6535l;

    /* renamed from: m, reason: collision with root package name */
    public int f6536m;

    /* renamed from: n, reason: collision with root package name */
    public int f6537n = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    public C0411m(byte[] bArr, int i, int i5, boolean z4) {
        this.f6531d = bArr;
        this.f6532e = i5 + i;
        this.f6534k = i;
        this.f6535l = i;
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final int A() {
        return AbstractC0417p.h(L());
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final long B() {
        return AbstractC0417p.i(M());
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final String C() throws N {
        int iL = L();
        if (iL > 0) {
            int i = this.f6532e;
            int i5 = this.f6534k;
            if (iL <= i - i5) {
                String str = new String(this.f6531d, i5, iL, L.f6425a);
                this.f6534k += iL;
                return str;
            }
        }
        if (iL == 0) {
            return "";
        }
        if (iL < 0) {
            throw N.f();
        }
        throw N.h();
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final String D() throws N {
        int iL = L();
        if (iL > 0) {
            int i = this.f6532e;
            int i5 = this.f6534k;
            if (iL <= i - i5) {
                String strH = P0.f6458a.H(this.f6531d, i5, iL);
                this.f6534k += iL;
                return strH;
            }
        }
        if (iL == 0) {
            return "";
        }
        if (iL <= 0) {
            throw N.f();
        }
        throw N.h();
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final int E() throws N {
        if (l()) {
            this.f6536m = 0;
            return 0;
        }
        int iL = L();
        this.f6536m = iL;
        if ((iL >>> 3) != 0) {
            return iL;
        }
        throw N.b();
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final int F() {
        return L();
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final long G() {
        return M();
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final boolean H(int i) throws N {
        int i5 = i & 7;
        int i6 = 0;
        if (i5 != 0) {
            if (i5 == 1) {
                P(8);
                return true;
            }
            if (i5 == 2) {
                P(L());
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
            P(4);
            return true;
        }
        int i7 = this.f6532e - this.f6534k;
        byte[] bArr = this.f6531d;
        if (i7 >= 10) {
            while (i6 < 10) {
                int i8 = this.f6534k;
                this.f6534k = i8 + 1;
                if (bArr[i8] < 0) {
                    i6++;
                }
            }
            throw N.e();
        }
        while (i6 < 10) {
            int i9 = this.f6534k;
            if (i9 == this.f6532e) {
                throw N.h();
            }
            this.f6534k = i9 + 1;
            if (bArr[i9] < 0) {
                i6++;
            }
        }
        throw N.e();
        return true;
    }

    public final int J() throws N {
        int i = this.f6534k;
        if (this.f6532e - i < 4) {
            throw N.h();
        }
        this.f6534k = i + 4;
        byte[] bArr = this.f6531d;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long K() throws N {
        int i = this.f6534k;
        if (this.f6532e - i < 8) {
            throw N.h();
        }
        this.f6534k = i + 8;
        byte[] bArr = this.f6531d;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public final int L() {
        int i;
        int i5 = this.f6534k;
        int i6 = this.f6532e;
        if (i6 != i5) {
            int i7 = i5 + 1;
            byte[] bArr = this.f6531d;
            byte b5 = bArr[i5];
            if (b5 >= 0) {
                this.f6534k = i7;
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
                this.f6534k = i8;
                return i;
            }
        }
        return (int) N();
    }

    public final long M() {
        long j5;
        long j6;
        long j7;
        long j8;
        int i = this.f6534k;
        int i5 = this.f6532e;
        if (i5 != i) {
            int i6 = i + 1;
            byte[] bArr = this.f6531d;
            byte b5 = bArr[i];
            if (b5 >= 0) {
                this.f6534k = i6;
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
                this.f6534k = i7;
                return j5;
            }
        }
        return N();
    }

    public final long N() throws N {
        long j5 = 0;
        for (int i = 0; i < 64; i += 7) {
            int i5 = this.f6534k;
            if (i5 == this.f6532e) {
                throw N.h();
            }
            this.f6534k = i5 + 1;
            j5 |= (r3 & 127) << i;
            if ((this.f6531d[i5] & 128) == 0) {
                return j5;
            }
        }
        throw N.e();
    }

    public final void O() {
        int i = this.f6532e + this.f6533f;
        this.f6532e = i;
        int i5 = i - this.f6535l;
        int i6 = this.f6537n;
        if (i5 <= i6) {
            this.f6533f = 0;
            return;
        }
        int i7 = i5 - i6;
        this.f6533f = i7;
        this.f6532e = i - i7;
    }

    public final void P(int i) throws N {
        if (i >= 0) {
            int i5 = this.f6532e;
            int i6 = this.f6534k;
            if (i <= i5 - i6) {
                this.f6534k = i6 + i;
                return;
            }
        }
        if (i >= 0) {
            throw N.h();
        }
        throw N.f();
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final void e(int i) throws N {
        if (this.f6536m != i) {
            throw N.a();
        }
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final int k() {
        return this.f6534k - this.f6535l;
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final boolean l() {
        return this.f6534k == this.f6532e;
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final void n(int i) {
        this.f6537n = i;
        O();
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final int o(int i) throws N {
        if (i < 0) {
            throw N.f();
        }
        int iK = k() + i;
        if (iK < 0) {
            throw N.g();
        }
        int i5 = this.f6537n;
        if (iK > i5) {
            throw N.h();
        }
        this.f6537n = iK;
        O();
        return i5;
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final boolean p() {
        return M() != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    @Override // com.google.protobuf.AbstractC0417p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.protobuf.C0407k q() throws com.google.protobuf.N {
        /*
            r4 = this;
            int r0 = r4.L()
            byte[] r1 = r4.f6531d
            if (r0 <= 0) goto L19
            int r2 = r4.f6532e
            int r3 = r4.f6534k
            int r2 = r2 - r3
            if (r0 > r2) goto L19
            com.google.protobuf.k r1 = com.google.protobuf.AbstractC0409l.k(r1, r3, r0)
            int r2 = r4.f6534k
            int r2 = r2 + r0
            r4.f6534k = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            com.google.protobuf.k r4 = com.google.protobuf.AbstractC0409l.f6528b
            return r4
        L1e:
            if (r0 <= 0) goto L2f
            int r2 = r4.f6532e
            int r3 = r4.f6534k
            int r2 = r2 - r3
            if (r0 > r2) goto L2f
            int r0 = r0 + r3
            r4.f6534k = r0
            byte[] r4 = java.util.Arrays.copyOfRange(r1, r3, r0)
            goto L35
        L2f:
            if (r0 > 0) goto L42
            if (r0 != 0) goto L3d
            byte[] r4 = com.google.protobuf.L.f6426b
        L35:
            com.google.protobuf.k r0 = com.google.protobuf.AbstractC0409l.f6528b
            com.google.protobuf.k r0 = new com.google.protobuf.k
            r0.<init>(r4)
            return r0
        L3d:
            com.google.protobuf.N r4 = com.google.protobuf.N.f()
            throw r4
        L42:
            com.google.protobuf.N r4 = com.google.protobuf.N.h()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C0411m.q():com.google.protobuf.k");
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final double r() {
        return Double.longBitsToDouble(K());
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final int s() {
        return L();
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final int t() {
        return J();
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final long u() {
        return K();
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final float v() {
        return Float.intBitsToFloat(J());
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final int w() {
        return L();
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final long x() {
        return M();
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final int y() {
        return J();
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final long z() {
        return K();
    }
}
