package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\i0.smali */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f4509a;

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f4510b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f4511c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f4512d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f4513e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f4514f;

    static {
        byte b5 = 0;
        int i = 1;
        Unsafe unsafeI = i();
        f4509a = unsafeI;
        Class cls = AbstractC0200c.f4478a;
        boolean zH = h(Long.TYPE);
        boolean zH2 = h(Integer.TYPE);
        h0 g0Var = null;
        if (unsafeI != null) {
            if (!AbstractC0200c.a()) {
                g0Var = new g0(unsafeI);
            } else if (zH) {
                g0Var = new f0(unsafeI, i);
            } else if (zH2) {
                g0Var = new f0(unsafeI, b5 == true ? 1 : 0);
            }
        }
        f4510b = g0Var;
        f4511c = g0Var == null ? false : g0Var.r();
        f4512d = g0Var == null ? false : g0Var.q();
        f4513e = e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(Object[].class);
        f(Object[].class);
        Field fieldG = g();
        if (fieldG != null && g0Var != null) {
            g0Var.i(fieldG);
        }
        f4514f = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(i0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean b(Object obj, long j5) {
        return ((byte) ((f4510b.f(obj, (-4) & j5) >>> ((int) (((~j5) & 3) << 3))) & 255)) != 0;
    }

    public static boolean c(Object obj, long j5) {
        return ((byte) ((f4510b.f(obj, (-4) & j5) >>> ((int) ((j5 & 3) << 3))) & 255)) != 0;
    }

    public static Object d(Class cls) {
        try {
            return f4509a.allocateInstance(cls);
        } catch (InstantiationException e5) {
            throw new IllegalStateException(e5);
        }
    }

    public static int e(Class cls) {
        if (f4512d) {
            return f4510b.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (f4512d) {
            f4510b.b(cls);
        }
    }

    public static Field g() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC0200c.a()) {
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

    public static boolean h(Class cls) {
        if (!AbstractC0200c.a()) {
            return false;
        }
        try {
            Class cls2 = AbstractC0200c.f4478a;
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

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new e0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j5, byte b5) {
        f4510b.k(bArr, f4513e + j5, b5);
    }

    public static void k(Object obj, long j5, byte b5) {
        long j6 = (-4) & j5;
        int iF = f4510b.f(obj, j6);
        int i = ((~((int) j5)) & 3) << 3;
        m(obj, j6, ((255 & b5) << i) | (iF & (~(255 << i))));
    }

    public static void l(Object obj, long j5, byte b5) {
        long j6 = (-4) & j5;
        int i = (((int) j5) & 3) << 3;
        m(obj, j6, ((255 & b5) << i) | (f4510b.f(obj, j6) & (~(255 << i))));
    }

    public static void m(Object obj, long j5, int i) {
        f4510b.n(obj, j5, i);
    }

    public static void n(Object obj, long j5, long j6) {
        f4510b.o(obj, j5, j6);
    }

    public static void o(Object obj, long j5, Object obj2) {
        f4510b.p(obj, j5, obj2);
    }
}
