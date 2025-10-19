package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\M0.smali */
public abstract class M0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f6429a;

    /* renamed from: b, reason: collision with root package name */
    public static final L0 f6430b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f6431c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f6432d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f6433e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f6434f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f6435g;

    static {
        byte b5 = 0;
        int i = 1;
        Unsafe unsafeJ = j();
        f6429a = unsafeJ;
        Class cls = AbstractC0392c.f6490a;
        boolean zF = f(Long.TYPE);
        boolean zF2 = f(Integer.TYPE);
        L0 k02 = null;
        if (unsafeJ != null) {
            if (!AbstractC0392c.a()) {
                k02 = new K0(unsafeJ);
            } else if (zF) {
                k02 = new J0(unsafeJ, i);
            } else if (zF2) {
                k02 = new J0(unsafeJ, b5 == true ? 1 : 0);
            }
        }
        f6430b = k02;
        f6431c = k02 == null ? false : k02.u();
        f6432d = k02 == null ? false : k02.t();
        f6433e = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field fieldE = e();
        f6434f = (fieldE == null || k02 == null) ? -1L : k02.l(fieldE);
        f6435g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(M0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static Object b(Class cls) {
        try {
            return f6429a.allocateInstance(cls);
        } catch (InstantiationException e5) {
            throw new IllegalStateException(e5);
        }
    }

    public static int c(Class cls) {
        if (f6432d) {
            return f6430b.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f6432d) {
            f6430b.b(cls);
        }
    }

    public static Field e() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC0392c.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean f(Class cls) {
        if (!AbstractC0392c.a()) {
            return false;
        }
        try {
            Class cls2 = AbstractC0392c.f6490a;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte g(byte[] bArr, long j5) {
        return f6430b.f(bArr, f6433e + j5);
    }

    public static byte h(Object obj, long j5) {
        return (byte) ((f6430b.i(obj, (-4) & j5) >>> ((int) (((~j5) & 3) << 3))) & 255);
    }

    public static byte i(Object obj, long j5) {
        return (byte) ((f6430b.i(obj, (-4) & j5) >>> ((int) ((j5 & 3) << 3))) & 255);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new I0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(Object obj, long j5, boolean z4) {
        f6430b.m(obj, j5, z4);
    }

    public static void l(byte[] bArr, long j5, byte b5) {
        f6430b.n(bArr, f6433e + j5, b5);
    }

    public static void m(Object obj, long j5, byte b5) {
        long j6 = (-4) & j5;
        int i = f6430b.i(obj, j6);
        int i5 = ((~((int) j5)) & 3) << 3;
        q(obj, j6, ((255 & b5) << i5) | (i & (~(255 << i5))));
    }

    public static void n(Object obj, long j5, byte b5) {
        long j6 = (-4) & j5;
        int i = (((int) j5) & 3) << 3;
        q(obj, j6, ((255 & b5) << i) | (f6430b.i(obj, j6) & (~(255 << i))));
    }

    public static void o(Object obj, long j5, double d5) {
        f6430b.o(obj, j5, d5);
    }

    public static void p(Object obj, long j5, float f2) {
        f6430b.p(obj, j5, f2);
    }

    public static void q(Object obj, long j5, int i) {
        f6430b.q(obj, j5, i);
    }

    public static void r(Object obj, long j5, long j6) {
        f6430b.r(obj, j5, j6);
    }

    public static void s(Object obj, long j5, Object obj2) {
        f6430b.s(obj, j5, obj2);
    }
}
