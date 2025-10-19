package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\r.smali */
public final class r extends AbstractC0422s {

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f6573f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6574g;
    public int h;
    public final OutputStream i;

    public r(OutputStream outputStream, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i, 20);
        this.f6573f = new byte[iMax];
        this.f6574g = iMax;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.i = outputStream;
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void A0(int i, int i5) {
        V0(14);
        R0(i, 5);
        P0(i5);
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void B0(int i) {
        V0(4);
        P0(i);
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void C0(int i, long j5) {
        V0(18);
        R0(i, 1);
        Q0(j5);
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void D0(long j5) {
        V0(8);
        Q0(j5);
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void E0(int i, int i5) {
        V0(20);
        R0(i, 0);
        if (i5 >= 0) {
            S0(i5);
        } else {
            T0(i5);
        }
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void F0(int i) {
        if (i >= 0) {
            M0(i);
        } else {
            O0(i);
        }
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void G0(int i, AbstractC0388a abstractC0388a, InterfaceC0425t0 interfaceC0425t0) {
        K0(i, 2);
        M0(abstractC0388a.c(interfaceC0425t0));
        interfaceC0425t0.g(abstractC0388a, this.f6580c);
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void H0(AbstractC0388a abstractC0388a) {
        M0(((E) abstractC0388a).c(null));
        abstractC0388a.e(this);
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void I0(int i, String str) throws IOException {
        K0(i, 2);
        J0(str);
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void J0(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iR0 = AbstractC0422s.r0(length);
            int i = iR0 + length;
            int i5 = this.f6574g;
            if (i > i5) {
                byte[] bArr = new byte[length];
                int iP = P0.f6458a.P(str, bArr, 0, length);
                M0(iP);
                W0(bArr, 0, iP);
                return;
            }
            if (i > i5 - this.h) {
                U0();
            }
            int iR02 = AbstractC0422s.r0(str.length());
            int i6 = this.h;
            byte[] bArr2 = this.f6573f;
            try {
                if (iR02 == iR0) {
                    int i7 = i6 + iR02;
                    this.h = i7;
                    int iP2 = P0.f6458a.P(str, bArr2, i7, i5 - i7);
                    this.h = i6;
                    S0((iP2 - i6) - iR02);
                    this.h = iP2;
                } else {
                    int iC = P0.c(str);
                    S0(iC);
                    this.h = P0.f6458a.P(str, bArr2, this.h, iC);
                }
            } catch (O0 e5) {
                this.h = i6;
                throw e5;
            } catch (ArrayIndexOutOfBoundsException e6) {
                throw new O2.b(e6);
            }
        } catch (O0 e7) {
            u0(str, e7);
        }
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void K0(int i, int i5) {
        M0((i << 3) | i5);
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void L0(int i, int i5) {
        V0(20);
        R0(i, 0);
        S0(i5);
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void M0(int i) {
        V0(5);
        S0(i);
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void N0(int i, long j5) {
        V0(20);
        R0(i, 0);
        T0(j5);
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void O0(long j5) {
        V0(10);
        T0(j5);
    }

    public final void P0(int i) {
        int i5 = this.h;
        int i6 = i5 + 1;
        this.h = i6;
        byte[] bArr = this.f6573f;
        bArr[i5] = (byte) (i & 255);
        int i7 = i5 + 2;
        this.h = i7;
        bArr[i6] = (byte) ((i >> 8) & 255);
        int i8 = i5 + 3;
        this.h = i8;
        bArr[i7] = (byte) ((i >> 16) & 255);
        this.h = i5 + 4;
        bArr[i8] = (byte) ((i >> 24) & 255);
    }

    public final void Q0(long j5) {
        int i = this.h;
        int i5 = i + 1;
        this.h = i5;
        byte[] bArr = this.f6573f;
        bArr[i] = (byte) (j5 & 255);
        int i6 = i + 2;
        this.h = i6;
        bArr[i5] = (byte) ((j5 >> 8) & 255);
        int i7 = i + 3;
        this.h = i7;
        bArr[i6] = (byte) ((j5 >> 16) & 255);
        int i8 = i + 4;
        this.h = i8;
        bArr[i7] = (byte) (255 & (j5 >> 24));
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
    }

    public final void R0(int i, int i5) {
        S0((i << 3) | i5);
    }

    public final void S0(int i) {
        boolean z4 = AbstractC0422s.f6579e;
        byte[] bArr = this.f6573f;
        if (z4) {
            while ((i & (-128)) != 0) {
                int i5 = this.h;
                this.h = i5 + 1;
                M0.l(bArr, i5, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            int i6 = this.h;
            this.h = i6 + 1;
            M0.l(bArr, i6, (byte) i);
            return;
        }
        while ((i & (-128)) != 0) {
            int i7 = this.h;
            this.h = i7 + 1;
            bArr[i7] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        int i8 = this.h;
        this.h = i8 + 1;
        bArr[i8] = (byte) i;
    }

    public final void T0(long j5) {
        boolean z4 = AbstractC0422s.f6579e;
        byte[] bArr = this.f6573f;
        if (z4) {
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
            int i6 = this.h;
            this.h = i6 + 1;
            bArr[i6] = (byte) ((((int) j5) & 127) | 128);
            j5 >>>= 7;
        }
        int i7 = this.h;
        this.h = i7 + 1;
        bArr[i7] = (byte) j5;
    }

    public final void U0() {
        this.i.write(this.f6573f, 0, this.h);
        this.h = 0;
    }

    public final void V0(int i) {
        if (this.f6574g - this.h < i) {
            U0();
        }
    }

    @Override // com.google.protobuf.y0
    public final void W(byte[] bArr, int i, int i5) throws IOException {
        W0(bArr, i, i5);
    }

    public final void W0(byte[] bArr, int i, int i5) throws IOException {
        int i6 = this.h;
        int i7 = this.f6574g;
        int i8 = i7 - i6;
        byte[] bArr2 = this.f6573f;
        if (i8 >= i5) {
            System.arraycopy(bArr, i, bArr2, i6, i5);
            this.h += i5;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i6, i8);
        int i9 = i + i8;
        int i10 = i5 - i8;
        this.h = i7;
        U0();
        if (i10 > i7) {
            this.i.write(bArr, i9, i10);
        } else {
            System.arraycopy(bArr, i9, bArr2, 0, i10);
            this.h = i10;
        }
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void v0(byte b5) {
        if (this.h == this.f6574g) {
            U0();
        }
        int i = this.h;
        this.h = i + 1;
        this.f6573f[i] = b5;
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void w0(int i, boolean z4) {
        V0(11);
        R0(i, 0);
        byte b5 = z4 ? (byte) 1 : (byte) 0;
        int i5 = this.h;
        this.h = i5 + 1;
        this.f6573f[i5] = b5;
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void x0(byte[] bArr, int i) throws IOException {
        M0(i);
        W0(bArr, 0, i);
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void y0(int i, AbstractC0409l abstractC0409l) {
        K0(i, 2);
        z0(abstractC0409l);
    }

    @Override // com.google.protobuf.AbstractC0422s
    public final void z0(AbstractC0409l abstractC0409l) {
        M0(abstractC0409l.size());
        abstractC0409l.w(this);
    }
}
