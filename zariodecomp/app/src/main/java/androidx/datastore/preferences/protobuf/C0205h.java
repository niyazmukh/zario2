package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\h.1.smali */
public final class C0205h extends AbstractC0207j {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f4497c;

    /* renamed from: d, reason: collision with root package name */
    public int f4498d;

    /* renamed from: e, reason: collision with root package name */
    public int f4499e;

    /* renamed from: f, reason: collision with root package name */
    public int f4500f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4501g;
    public int h;
    public int i = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    public C0205h(byte[] bArr, int i, int i5, boolean z4) {
        this.f4497c = bArr;
        this.f4498d = i5 + i;
        this.f4500f = i;
        this.f4501g = i;
    }

    public final long A() throws C0222z {
        int i = this.f4500f;
        if (this.f4498d - i < 8) {
            throw C0222z.e();
        }
        this.f4500f = i + 8;
        byte[] bArr = this.f4497c;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public final int B() {
        int i;
        int i5 = this.f4500f;
        int i6 = this.f4498d;
        if (i6 != i5) {
            int i7 = i5 + 1;
            byte[] bArr = this.f4497c;
            byte b5 = bArr[i5];
            if (b5 >= 0) {
                this.f4500f = i7;
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
                this.f4500f = i8;
                return i;
            }
        }
        return (int) D();
    }

    public final long C() {
        long j5;
        long j6;
        long j7;
        long j8;
        int i = this.f4500f;
        int i5 = this.f4498d;
        if (i5 != i) {
            int i6 = i + 1;
            byte[] bArr = this.f4497c;
            byte b5 = bArr[i];
            if (b5 >= 0) {
                this.f4500f = i6;
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
                this.f4500f = i7;
                return j5;
            }
        }
        return D();
    }

    public final long D() throws C0222z {
        long j5 = 0;
        for (int i = 0; i < 64; i += 7) {
            int i5 = this.f4500f;
            if (i5 == this.f4498d) {
                throw C0222z.e();
            }
            this.f4500f = i5 + 1;
            j5 |= (r3 & 127) << i;
            if ((this.f4497c[i5] & 128) == 0) {
                return j5;
            }
        }
        throw C0222z.c();
    }

    public final void E() {
        int i = this.f4498d + this.f4499e;
        this.f4498d = i;
        int i5 = i - this.f4501g;
        int i6 = this.i;
        if (i5 <= i6) {
            this.f4499e = 0;
            return;
        }
        int i7 = i5 - i6;
        this.f4499e = i7;
        this.f4498d = i - i7;
    }

    public final void F(int i) throws C0222z {
        if (i >= 0) {
            int i5 = this.f4498d;
            int i6 = this.f4500f;
            if (i <= i5 - i6) {
                this.f4500f = i6 + i;
                return;
            }
        }
        if (i >= 0) {
            throw C0222z.e();
        }
        throw C0222z.d();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final void a(int i) throws C0222z {
        if (this.h != i) {
            throw new C0222z("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final int b() {
        return this.f4500f - this.f4501g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final boolean c() {
        return this.f4500f == this.f4498d;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final void d(int i) {
        this.i = i;
        E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final int e(int i) throws C0222z {
        if (i < 0) {
            throw C0222z.d();
        }
        int iB = b() + i;
        if (iB < 0) {
            throw new C0222z("Failed to parse the message.");
        }
        int i5 = this.i;
        if (iB > i5) {
            throw C0222z.e();
        }
        this.i = iB;
        E();
        return i5;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final boolean f() {
        return C() != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.datastore.preferences.protobuf.C0204g g() throws androidx.datastore.preferences.protobuf.C0222z {
        /*
            r4 = this;
            int r0 = r4.B()
            byte[] r1 = r4.f4497c
            if (r0 <= 0) goto L19
            int r2 = r4.f4498d
            int r3 = r4.f4500f
            int r2 = r2 - r3
            if (r0 > r2) goto L19
            androidx.datastore.preferences.protobuf.g r1 = androidx.datastore.preferences.protobuf.C0204g.h(r1, r3, r0)
            int r2 = r4.f4500f
            int r2 = r2 + r0
            r4.f4500f = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            androidx.datastore.preferences.protobuf.g r4 = androidx.datastore.preferences.protobuf.C0204g.f4493c
            return r4
        L1e:
            if (r0 <= 0) goto L2f
            int r2 = r4.f4498d
            int r3 = r4.f4500f
            int r2 = r2 - r3
            if (r0 > r2) goto L2f
            int r0 = r0 + r3
            r4.f4500f = r0
            byte[] r4 = java.util.Arrays.copyOfRange(r1, r3, r0)
            goto L35
        L2f:
            if (r0 > 0) goto L42
            if (r0 != 0) goto L3d
            byte[] r4 = androidx.datastore.preferences.protobuf.AbstractC0220x.f4564b
        L35:
            androidx.datastore.preferences.protobuf.g r0 = androidx.datastore.preferences.protobuf.C0204g.f4493c
            androidx.datastore.preferences.protobuf.g r0 = new androidx.datastore.preferences.protobuf.g
            r0.<init>(r4)
            return r0
        L3d:
            androidx.datastore.preferences.protobuf.z r4 = androidx.datastore.preferences.protobuf.C0222z.d()
            throw r4
        L42:
            androidx.datastore.preferences.protobuf.z r4 = androidx.datastore.preferences.protobuf.C0222z.e()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0205h.g():androidx.datastore.preferences.protobuf.g");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final double h() {
        return Double.longBitsToDouble(A());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final int i() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final int j() {
        return z();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final long k() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final float l() {
        return Float.intBitsToFloat(z());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final int m() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final long n() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final int o() {
        return z();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final long p() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final int q() {
        int iB = B();
        return (-(iB & 1)) ^ (iB >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final long r() {
        long jC = C();
        return (-(jC & 1)) ^ (jC >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final String s() throws C0222z {
        int iB = B();
        if (iB > 0) {
            int i = this.f4498d;
            int i5 = this.f4500f;
            if (iB <= i - i5) {
                String str = new String(this.f4497c, i5, iB, AbstractC0220x.f4563a);
                this.f4500f += iB;
                return str;
            }
        }
        if (iB == 0) {
            return "";
        }
        if (iB < 0) {
            throw C0222z.d();
        }
        throw C0222z.e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final String t() throws C0222z {
        int iB = B();
        if (iB > 0) {
            int i = this.f4498d;
            int i5 = this.f4500f;
            if (iB <= i - i5) {
                String strS = l0.f4529a.s(this.f4497c, i5, iB);
                this.f4500f += iB;
                return strS;
            }
        }
        if (iB == 0) {
            return "";
        }
        if (iB <= 0) {
            throw C0222z.d();
        }
        throw C0222z.e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final int u() throws C0222z {
        if (c()) {
            this.h = 0;
            return 0;
        }
        int iB = B();
        this.h = iB;
        if ((iB >>> 3) != 0) {
            return iB;
        }
        throw new C0222z("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final int v() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final long w() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0207j
    public final boolean x(int i) throws C0222z {
        int i5 = i & 7;
        int i6 = 0;
        if (i5 != 0) {
            if (i5 == 1) {
                F(8);
                return true;
            }
            if (i5 == 2) {
                F(B());
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
            F(4);
            return true;
        }
        int i7 = this.f4498d - this.f4500f;
        byte[] bArr = this.f4497c;
        if (i7 >= 10) {
            while (i6 < 10) {
                int i8 = this.f4500f;
                this.f4500f = i8 + 1;
                if (bArr[i8] < 0) {
                    i6++;
                }
            }
            throw C0222z.c();
        }
        while (i6 < 10) {
            int i9 = this.f4500f;
            if (i9 == this.f4498d) {
                throw C0222z.e();
            }
            this.f4500f = i9 + 1;
            if (bArr[i9] < 0) {
                i6++;
            }
        }
        throw C0222z.c();
        return true;
    }

    public final int z() throws C0222z {
        int i = this.f4500f;
        if (this.f4498d - i < 4) {
            throw C0222z.e();
        }
        this.f4500f = i + 4;
        byte[] bArr = this.f4497c;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }
}
