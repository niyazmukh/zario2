package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\f0.smali */
public final class f0 extends h0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4492b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Unsafe unsafe, int i) {
        super(unsafe);
        this.f4492b = i;
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final boolean c(Object obj, long j5) {
        switch (this.f4492b) {
            case 0:
                if (!i0.f4514f) {
                    break;
                } else {
                    break;
                }
            default:
                if (!i0.f4514f) {
                    break;
                } else {
                    break;
                }
        }
        return i0.c(obj, j5);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final double d(Object obj, long j5) {
        switch (this.f4492b) {
        }
        return Double.longBitsToDouble(g(obj, j5));
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final float e(Object obj, long j5) {
        switch (this.f4492b) {
        }
        return Float.intBitsToFloat(f(obj, j5));
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void j(Object obj, long j5, boolean z4) {
        switch (this.f4492b) {
            case 0:
                if (!i0.f4514f) {
                    i0.l(obj, j5, z4 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    i0.k(obj, j5, z4 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!i0.f4514f) {
                    i0.l(obj, j5, z4 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    i0.k(obj, j5, z4 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void k(Object obj, long j5, byte b5) {
        switch (this.f4492b) {
            case 0:
                if (!i0.f4514f) {
                    i0.l(obj, j5, b5);
                    break;
                } else {
                    i0.k(obj, j5, b5);
                    break;
                }
            default:
                if (!i0.f4514f) {
                    i0.l(obj, j5, b5);
                    break;
                } else {
                    i0.k(obj, j5, b5);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void l(Object obj, long j5, double d5) {
        switch (this.f4492b) {
            case 0:
                o(obj, j5, Double.doubleToLongBits(d5));
                break;
            default:
                o(obj, j5, Double.doubleToLongBits(d5));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void m(Object obj, long j5, float f2) {
        switch (this.f4492b) {
            case 0:
                n(obj, j5, Float.floatToIntBits(f2));
                break;
            default:
                n(obj, j5, Float.floatToIntBits(f2));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final boolean r() {
        switch (this.f4492b) {
        }
        return false;
    }
}
