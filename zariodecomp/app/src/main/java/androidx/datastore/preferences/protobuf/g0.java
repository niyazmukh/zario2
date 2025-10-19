package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\g0.smali */
public final class g0 extends h0 {
    @Override // androidx.datastore.preferences.protobuf.h0
    public final boolean c(Object obj, long j5) {
        return this.f4502a.getBoolean(obj, j5);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final double d(Object obj, long j5) {
        return this.f4502a.getDouble(obj, j5);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final float e(Object obj, long j5) {
        return this.f4502a.getFloat(obj, j5);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void j(Object obj, long j5, boolean z4) {
        this.f4502a.putBoolean(obj, j5, z4);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void k(Object obj, long j5, byte b5) {
        this.f4502a.putByte(obj, j5, b5);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void l(Object obj, long j5, double d5) {
        this.f4502a.putDouble(obj, j5, d5);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void m(Object obj, long j5, float f2) {
        this.f4502a.putFloat(obj, j5, f2);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final boolean q() {
        if (!super.q()) {
            return false;
        }
        try {
            Class<?> cls = this.f4502a.getClass();
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
            i0.a(th);
            return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final boolean r() {
        Unsafe unsafe = this.f4502a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (i0.g() != null) {
                    try {
                        Class<?> cls3 = this.f4502a.getClass();
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
                        i0.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                i0.a(th2);
            }
        }
        return false;
    }
}
