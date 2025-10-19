package com.google.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\K0.smali */
public final class K0 extends L0 {
    @Override // com.google.protobuf.L0
    public final void c(long j5, byte[] bArr, long j6, long j7) {
        this.f6428a.copyMemory((Object) null, j5, bArr, M0.f6433e + j6, j7);
    }

    @Override // com.google.protobuf.L0
    public final boolean d(Object obj, long j5) {
        return this.f6428a.getBoolean(obj, j5);
    }

    @Override // com.google.protobuf.L0
    public final byte e(long j5) {
        return this.f6428a.getByte(j5);
    }

    @Override // com.google.protobuf.L0
    public final byte f(Object obj, long j5) {
        return this.f6428a.getByte(obj, j5);
    }

    @Override // com.google.protobuf.L0
    public final double g(Object obj, long j5) {
        return this.f6428a.getDouble(obj, j5);
    }

    @Override // com.google.protobuf.L0
    public final float h(Object obj, long j5) {
        return this.f6428a.getFloat(obj, j5);
    }

    @Override // com.google.protobuf.L0
    public final void m(Object obj, long j5, boolean z4) {
        this.f6428a.putBoolean(obj, j5, z4);
    }

    @Override // com.google.protobuf.L0
    public final void n(Object obj, long j5, byte b5) {
        this.f6428a.putByte(obj, j5, b5);
    }

    @Override // com.google.protobuf.L0
    public final void o(Object obj, long j5, double d5) {
        this.f6428a.putDouble(obj, j5, d5);
    }

    @Override // com.google.protobuf.L0
    public final void p(Object obj, long j5, float f2) {
        this.f6428a.putFloat(obj, j5, f2);
    }

    @Override // com.google.protobuf.L0
    public final boolean t() {
        if (!super.t()) {
            return false;
        }
        try {
            Class<?> cls = this.f6428a.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            M0.a(th);
            return false;
        }
    }

    @Override // com.google.protobuf.L0
    public final boolean u() {
        Unsafe unsafe = this.f6428a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (M0.e() != null) {
                    try {
                        Class<?> cls3 = this.f6428a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        M0.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                M0.a(th2);
            }
        }
        return false;
    }
}
