package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\h0.smali */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f4502a;

    public h0(Unsafe unsafe) {
        this.f4502a = unsafe;
    }

    public final int a(Class cls) {
        return this.f4502a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f4502a.arrayIndexScale(cls);
    }

    public abstract boolean c(Object obj, long j5);

    public abstract double d(Object obj, long j5);

    public abstract float e(Object obj, long j5);

    public final int f(Object obj, long j5) {
        return this.f4502a.getInt(obj, j5);
    }

    public final long g(Object obj, long j5) {
        return this.f4502a.getLong(obj, j5);
    }

    public final Object h(Object obj, long j5) {
        return this.f4502a.getObject(obj, j5);
    }

    public final long i(Field field) {
        return this.f4502a.objectFieldOffset(field);
    }

    public abstract void j(Object obj, long j5, boolean z4);

    public abstract void k(Object obj, long j5, byte b5);

    public abstract void l(Object obj, long j5, double d5);

    public abstract void m(Object obj, long j5, float f2);

    public final void n(Object obj, long j5, int i) {
        this.f4502a.putInt(obj, j5, i);
    }

    public final void o(Object obj, long j5, long j6) {
        this.f4502a.putLong(obj, j5, j6);
    }

    public final void p(Object obj, long j5, Object obj2) {
        this.f4502a.putObject(obj, j5, obj2);
    }

    public boolean q() {
        Unsafe unsafe = this.f4502a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            i0.a(th);
            return false;
        }
    }

    public abstract boolean r();
}
