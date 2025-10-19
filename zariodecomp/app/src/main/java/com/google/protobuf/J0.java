package com.google.protobuf;

import sun.misc.Unsafe;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\J0.smali */
public final class J0 extends L0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6424b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J0(Unsafe unsafe, int i) {
        super(unsafe);
        this.f6424b = i;
    }

    @Override // com.google.protobuf.L0
    public final void c(long j5, byte[] bArr, long j6, long j7) {
        switch (this.f6424b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.L0
    public final boolean d(Object obj, long j5) {
        switch (this.f6424b) {
            case 0:
                if (M0.f6435g) {
                    if (M0.h(obj, j5) == 0) {
                    }
                } else if (M0.i(obj, j5) == 0) {
                }
                break;
            default:
                if (M0.f6435g) {
                    if (M0.h(obj, j5) == 0) {
                    }
                } else if (M0.i(obj, j5) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // com.google.protobuf.L0
    public final byte e(long j5) {
        switch (this.f6424b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.L0
    public final byte f(Object obj, long j5) {
        switch (this.f6424b) {
            case 0:
                if (!M0.f6435g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!M0.f6435g) {
                    break;
                } else {
                    break;
                }
        }
        return M0.i(obj, j5);
    }

    @Override // com.google.protobuf.L0
    public final double g(Object obj, long j5) {
        switch (this.f6424b) {
        }
        return Double.longBitsToDouble(j(obj, j5));
    }

    @Override // com.google.protobuf.L0
    public final float h(Object obj, long j5) {
        switch (this.f6424b) {
        }
        return Float.intBitsToFloat(i(obj, j5));
    }

    @Override // com.google.protobuf.L0
    public final void m(Object obj, long j5, boolean z4) {
        switch (this.f6424b) {
            case 0:
                if (!M0.f6435g) {
                    M0.n(obj, j5, z4 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    M0.m(obj, j5, z4 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!M0.f6435g) {
                    M0.n(obj, j5, z4 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    M0.m(obj, j5, z4 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // com.google.protobuf.L0
    public final void n(Object obj, long j5, byte b5) {
        switch (this.f6424b) {
            case 0:
                if (!M0.f6435g) {
                    M0.n(obj, j5, b5);
                    break;
                } else {
                    M0.m(obj, j5, b5);
                    break;
                }
            default:
                if (!M0.f6435g) {
                    M0.n(obj, j5, b5);
                    break;
                } else {
                    M0.m(obj, j5, b5);
                    break;
                }
        }
    }

    @Override // com.google.protobuf.L0
    public final void o(Object obj, long j5, double d5) {
        switch (this.f6424b) {
            case 0:
                r(obj, j5, Double.doubleToLongBits(d5));
                break;
            default:
                r(obj, j5, Double.doubleToLongBits(d5));
                break;
        }
    }

    @Override // com.google.protobuf.L0
    public final void p(Object obj, long j5, float f2) {
        switch (this.f6424b) {
            case 0:
                q(obj, j5, Float.floatToIntBits(f2));
                break;
            default:
                q(obj, j5, Float.floatToIntBits(f2));
                break;
        }
    }

    @Override // com.google.protobuf.L0
    public final boolean u() {
        switch (this.f6424b) {
        }
        return false;
    }
}
