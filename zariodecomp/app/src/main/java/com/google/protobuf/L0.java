package com.google.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\L0.smali */
public abstract class L0 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f6428a;

    public L0(Unsafe unsafe) {
        this.f6428a = unsafe;
    }

    public final int a(Class cls) {
        return this.f6428a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f6428a.arrayIndexScale(cls);
    }

    public abstract void c(long j5, byte[] bArr, long j6, long j7);

    public abstract boolean d(Object obj, long j5);

    public abstract byte e(long j5);

    public abstract byte f(Object obj, long j5);

    public abstract double g(Object obj, long j5);

    public abstract float h(Object obj, long j5);

    public final int i(Object obj, long j5) {
        return this.f6428a.getInt(obj, j5);
    }

    public final long j(Object obj, long j5) {
        return this.f6428a.getLong(obj, j5);
    }

    public final Object k(Object obj, long j5) {
        return this.f6428a.getObject(obj, j5);
    }

    public final long l(Field field) {
        return this.f6428a.objectFieldOffset(field);
    }

    public abstract void m(Object obj, long j5, boolean z4);

    public abstract void n(Object obj, long j5, byte b5);

    public abstract void o(Object obj, long j5, double d5);

    public abstract void p(Object obj, long j5, float f2);

    public final void q(Object obj, long j5, int i) {
        this.f6428a.putInt(obj, j5, i);
    }

    public final void r(Object obj, long j5, long j6) {
        this.f6428a.putLong(obj, j5, j6);
    }

    public final void s(Object obj, long j5, Object obj2) {
        this.f6428a.putObject(obj, j5, obj2);
    }

    public boolean t() {
        Unsafe unsafe = this.f6428a;
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
            M0.a(th);
            return false;
        }
    }

    public abstract boolean u();
}
