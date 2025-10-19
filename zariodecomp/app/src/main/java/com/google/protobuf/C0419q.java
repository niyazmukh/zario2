package com.google.protobuf;

/* renamed from: com.google.protobuf.q, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\q.1.smali */
public final class C0419q extends AbstractC0422s {

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f6569f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6570g;
    public int h;

    public C0419q(byte[] bArr, int i, int i5) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int i6 = i + i5;
        if ((i | i5 | (bArr.length - i6)) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i5)));
        }
        this.f6569f = bArr;
        this.h = i;
        this.f6570g = i6;
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void A0(int i, int i5) throws O2.b {
        K0(i, 5);
        B0(i5);
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void B0(int i) throws O2.b {
        try {
            byte[] bArr = this.f6569f;
            int i5 = this.h;
            int i6 = i5 + 1;
            this.h = i6;
            bArr[i5] = (byte) (i & 255);
            int i7 = i5 + 2;
            this.h = i7;
            bArr[i6] = (byte) ((i >> 8) & 255);
            int i8 = i5 + 3;
            this.h = i8;
            bArr[i7] = (byte) ((i >> 16) & 255);
            this.h = i5 + 4;
            bArr[i8] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e5) {
            throw new O2.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.f6570g), 1), e5);
        }
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void C0(int i, long j5) throws O2.b {
        K0(i, 1);
        D0(j5);
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void D0(long j5) throws O2.b {
        try {
            byte[] bArr = this.f6569f;
            int i = this.h;
            int i5 = i + 1;
            this.h = i5;
            bArr[i] = (byte) (((int) j5) & 255);
            int i6 = i + 2;
            this.h = i6;
            bArr[i5] = (byte) (((int) (j5 >> 8)) & 255);
            int i7 = i + 3;
            this.h = i7;
            bArr[i6] = (byte) (((int) (j5 >> 16)) & 255);
            int i8 = i + 4;
            this.h = i8;
            bArr[i7] = (byte) (((int) (j5 >> 24)) & 255);
            int i9 = i + 5;
            this.h = i9;
            bArr[i8] = (byte) (((int) (j5 >> 32)) & 255);
            int i10 = i + 6;
            this.h = i10;
            bArr[i9] = (byte) (((int) (j5 >> 40)) & 255);
            int i11 = i + 7;
            this.h = i11;
            bArr[i10] = (byte) (((int) (j5 >> 48)) & 255);
            this.h = i + 8;
            bArr[i11] = (byte) (((int) (j5 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e5) {
            throw new O2.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.f6570g), 1), e5);
        }
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void E0(int i, int i5) throws O2.b {
        K0(i, 0);
        F0(i5);
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void F0(int i) throws O2.b {
        if (i >= 0) {
            M0(i);
        } else {
            O0(i);
        }
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void G0(int i, AbstractC0388a abstractC0388a, InterfaceC0425t0 interfaceC0425t0) throws O2.b {
        K0(i, 2);
        M0(abstractC0388a.c(interfaceC0425t0));
        interfaceC0425t0.g(abstractC0388a, this.f6580c);
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void H0(AbstractC0388a abstractC0388a) throws O2.b {
        M0(((E) abstractC0388a).c(null));
        abstractC0388a.e(this);
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void I0(int i, String str) throws O2.b {
        K0(i, 2);
        J0(str);
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void J0(String str) throws O2.b {
        int i = this.h;
        try {
            int iR0 = AbstractC0422s.r0(str.length() * 3);
            int iR02 = AbstractC0422s.r0(str.length());
            byte[] bArr = this.f6569f;
            if (iR02 == iR0) {
                int i5 = i + iR02;
                this.h = i5;
                int iP = P0.f6458a.P(str, bArr, i5, P0());
                this.h = i;
                M0((iP - i) - iR02);
                this.h = iP;
            } else {
                M0(P0.c(str));
                this.h = P0.f6458a.P(str, bArr, this.h, P0());
            }
        } catch (O0 e5) {
            this.h = i;
            u0(str, e5);
        } catch (IndexOutOfBoundsException e6) {
            throw new O2.b(e6);
        }
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void K0(int i, int i5) throws O2.b {
        M0((i << 3) | i5);
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void L0(int i, int i5) throws O2.b {
        K0(i, 0);
        M0(i5);
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void M0(int i) throws O2.b {
        while (true) {
            int i5 = i & (-128);
            byte[] bArr = this.f6569f;
            if (i5 == 0) {
                int i6 = this.h;
                this.h = i6 + 1;
                bArr[i6] = (byte) i;
                return;
            } else {
                try {
                    int i7 = this.h;
                    this.h = i7 + 1;
                    bArr[i7] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e5) {
                    throw new O2.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.f6570g), 1), e5);
                }
            }
            throw new O2.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.f6570g), 1), e5);
        }
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void N0(int i, long j5) throws O2.b {
        K0(i, 0);
        O0(j5);
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void O0(long j5) throws O2.b {
        boolean z4 = AbstractC0422s.f6579e;
        byte[] bArr = this.f6569f;
        if (z4 && P0() >= 10) {
            while ((j5 & (-128)) != 0) {
                int i = this.h;
                this.h = i + 1;
                M0.l(bArr, i, (byte) ((((int) j5) & 127) | 128));
                j5 >>>= 7;
            }
            int i5 = this.h;
            this.h = i5 + 1;
            M0.l(bArr, i5, (byte) j5);
            return;
        }
        while ((j5 & (-128)) != 0) {
            try {
                int i6 = this.h;
                this.h = i6 + 1;
                bArr[i6] = (byte) ((((int) j5) & 127) | 128);
                j5 >>>= 7;
            } catch (IndexOutOfBoundsException e5) {
                throw new O2.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.f6570g), 1), e5);
            }
        }
        int i7 = this.h;
        this.h = i7 + 1;
        bArr[i7] = (byte) j5;
    }

    public final int P0() {
        return this.f6570g - this.h;
    }

    public final void Q0(byte[] bArr, int i, int i5) throws O2.b {
        try {
            System.arraycopy(bArr, i, this.f6569f, this.h, i5);
            this.h += i5;
        } catch (IndexOutOfBoundsException e5) {
            throw new O2.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.f6570g), Integer.valueOf(i5)), e5);
        }
    }

    @Override // com.google.protobuf.y0
    public final void W(byte[] bArr, int i, int i5) throws O2.b {
        Q0(bArr, i, i5);
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void v0(byte b5) throws O2.b {
        try {
            byte[] bArr = this.f6569f;
            int i = this.h;
            this.h = i + 1;
            bArr[i] = b5;
        } catch (IndexOutOfBoundsException e5) {
            throw new O2.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.f6570g), 1), e5);
        }
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void w0(int i, boolean z4) throws O2.b {
        K0(i, 0);
        v0(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void x0(byte[] bArr, int i) throws O2.b {
        M0(i);
        Q0(bArr, 0, i);
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void y0(int i, AbstractC0409l abstractC0409l) throws O2.b {
        K0(i, 2);
        z0(abstractC0409l);
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void z0(AbstractC0409l abstractC0409l) throws O2.b {
        M0(abstractC0409l.size());
        abstractC0409l.w(this);
    }
}
