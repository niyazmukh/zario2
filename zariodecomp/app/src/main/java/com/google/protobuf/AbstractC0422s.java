package com.google.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.s, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\s.1.smali */
public abstract class AbstractC0422s extends y0 {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f6578d = Logger.getLogger(AbstractC0422s.class.getName());

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f6579e = M0.f6432d;

    /* renamed from: c, reason: collision with root package name */
    public Y f6580c;

    public static int X(int i) {
        return p0(i) + 1;
    }

    public static int Y(int i, AbstractC0409l abstractC0409l) {
        return Z(abstractC0409l) + p0(i);
    }

    public static int Z(AbstractC0409l abstractC0409l) {
        int size = abstractC0409l.size();
        return r0(size) + size;
    }

    public static int a0(int i) {
        return p0(i) + 8;
    }

    public static int b0(int i, int i5) {
        return h0(i5) + p0(i);
    }

    public static int c0(int i) {
        return p0(i) + 4;
    }

    public static int d0(int i) {
        return p0(i) + 8;
    }

    public static int e0(int i) {
        return p0(i) + 4;
    }

    public static int f0(int i, AbstractC0388a abstractC0388a, InterfaceC0425t0 interfaceC0425t0) {
        return abstractC0388a.c(interfaceC0425t0) + (p0(i) * 2);
    }

    public static int g0(int i, int i5) {
        return h0(i5) + p0(i);
    }

    public static int h0(int i) {
        if (i >= 0) {
            return r0(i);
        }
        return 10;
    }

    public static int i0(int i, long j5) {
        return t0(j5) + p0(i);
    }

    public static int j0(int i) {
        return p0(i) + 4;
    }

    public static int k0(int i) {
        return p0(i) + 8;
    }

    public static int l0(int i, int i5) {
        return r0((i5 >> 31) ^ (i5 << 1)) + p0(i);
    }

    public static int m0(int i, long j5) {
        return t0((j5 >> 63) ^ (j5 << 1)) + p0(i);
    }

    public static int n0(int i, String str) {
        return o0(str) + p0(i);
    }

    public static int o0(String str) {
        int length;
        try {
            length = P0.c(str);
        } catch (O0 unused) {
            length = str.getBytes(L.f6425a).length;
        }
        return r0(length) + length;
    }

    public static int p0(int i) {
        return r0(i << 3);
    }

    public static int q0(int i, int i5) {
        return r0(i5) + p0(i);
    }

    public static int r0(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int s0(int i, long j5) {
        return t0(j5) + p0(i);
    }

    public static int t0(long j5) {
        int i;
        if (((-128) & j5) == 0) {
            return 1;
        }
        if (j5 < 0) {
            return 10;
        }
        if (((-34359738368L) & j5) != 0) {
            j5 >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j5) != 0) {
            i += 2;
            j5 >>>= 14;
        }
        return (j5 & (-16384)) != 0 ? i + 1 : i;
    }

    public abstract void A0(int i, int i5);

    public abstract void B0(int i);

    public abstract void C0(int i, long j5);

    public abstract void D0(long j5);

    public abstract void E0(int i, int i5);

    public abstract void F0(int i);

    public abstract void G0(int i, AbstractC0388a abstractC0388a, InterfaceC0425t0 interfaceC0425t0);

    public abstract void H0(AbstractC0388a abstractC0388a);

    public abstract void I0(int i, String str);

    public abstract void J0(String str);

    public abstract void K0(int i, int i5);

    public abstract void L0(int i, int i5);

    public abstract void M0(int i);

    public abstract void N0(int i, long j5);

    public abstract void O0(long j5);

    public final void u0(String str, O0 o02) throws O2.b {
        f6578d.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) o02);
        byte[] bytes = str.getBytes(L.f6425a);
        try {
            M0(bytes.length);
            W(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e5) {
            throw new O2.b(e5);
        }
    }

    public abstract void v0(byte b5);

    public abstract void w0(int i, boolean z4);

    public abstract void x0(byte[] bArr, int i);

    public abstract void y0(int i, AbstractC0409l abstractC0409l);

    public abstract void z0(AbstractC0409l abstractC0409l);
}
