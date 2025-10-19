package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\c0.smali */
public final class c0 {

    /* renamed from: f, reason: collision with root package name */
    public static final c0 f4480f = new c0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f4481a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f4482b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f4483c;

    /* renamed from: d, reason: collision with root package name */
    public int f4484d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4485e;

    public c0(int i, int[] iArr, Object[] objArr, boolean z4) {
        this.f4481a = i;
        this.f4482b = iArr;
        this.f4483c = objArr;
        this.f4485e = z4;
    }

    public final void a(int i) {
        int[] iArr = this.f4482b;
        if (i > iArr.length) {
            int i5 = this.f4481a;
            int i6 = (i5 / 2) + i5;
            if (i6 >= i) {
                i = i6;
            }
            if (i < 8) {
                i = 8;
            }
            this.f4482b = Arrays.copyOf(iArr, i);
            this.f4483c = Arrays.copyOf(this.f4483c, i);
        }
    }

    public final int b() {
        int iV0;
        int i = this.f4484d;
        if (i != -1) {
            return i;
        }
        int iB = 0;
        for (int i5 = 0; i5 < this.f4481a; i5++) {
            int i6 = this.f4482b[i5];
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i8 == 0) {
                iV0 = C0209l.V0(i7, ((Long) this.f4483c[i5]).longValue());
            } else if (i8 == 1) {
                ((Long) this.f4483c[i5]).getClass();
                iV0 = C0209l.H0(i7);
            } else if (i8 == 2) {
                iV0 = C0209l.D0(i7, (C0204g) this.f4483c[i5]);
            } else if (i8 == 3) {
                iB = ((c0) this.f4483c[i5]).b() + (C0209l.S0(i7) * 2) + iB;
            } else {
                if (i8 != 5) {
                    throw new IllegalStateException(C0222z.b());
                }
                ((Integer) this.f4483c[i5]).getClass();
                iV0 = C0209l.G0(i7);
            }
            iB = iV0 + iB;
        }
        this.f4484d = iB;
        return iB;
    }

    public final void c(int i, Object obj) {
        if (!this.f4485e) {
            throw new UnsupportedOperationException();
        }
        a(this.f4481a + 1);
        int[] iArr = this.f4482b;
        int i5 = this.f4481a;
        iArr[i5] = i;
        this.f4483c[i5] = obj;
        this.f4481a = i5 + 1;
    }

    public final void d(E e5) {
        if (this.f4481a == 0) {
            return;
        }
        e5.getClass();
        for (int i = 0; i < this.f4481a; i++) {
            int i5 = this.f4482b[i];
            Object obj = this.f4483c[i];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                e5.j(i6, ((Long) obj).longValue());
            } else if (i7 == 1) {
                e5.f(i6, ((Long) obj).longValue());
            } else if (i7 == 2) {
                e5.b(i6, (C0204g) obj);
            } else if (i7 == 3) {
                C0209l c0209l = (C0209l) e5.f4420a;
                c0209l.m1(i6, 3);
                ((c0) obj).d(e5);
                c0209l.m1(i6, 4);
            } else {
                if (i7 != 5) {
                    throw new RuntimeException(C0222z.b());
                }
                e5.e(i6, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        int i = this.f4481a;
        if (i == c0Var.f4481a) {
            int[] iArr = this.f4482b;
            int[] iArr2 = c0Var.f4482b;
            int i5 = 0;
            while (true) {
                if (i5 >= i) {
                    Object[] objArr = this.f4483c;
                    Object[] objArr2 = c0Var.f4483c;
                    int i6 = this.f4481a;
                    for (int i7 = 0; i7 < i6; i7++) {
                        if (objArr[i7].equals(objArr2[i7])) {
                        }
                    }
                    return true;
                }
                if (iArr[i5] != iArr2[i5]) {
                    break;
                }
                i5++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f4481a;
        int i5 = (527 + i) * 31;
        int[] iArr = this.f4482b;
        int iHashCode = 17;
        int i6 = 17;
        for (int i7 = 0; i7 < i; i7++) {
            i6 = (i6 * 31) + iArr[i7];
        }
        int i8 = (i5 + i6) * 31;
        Object[] objArr = this.f4483c;
        int i9 = this.f4481a;
        for (int i10 = 0; i10 < i9; i10++) {
            iHashCode = (iHashCode * 31) + objArr[i10].hashCode();
        }
        return i8 + iHashCode;
    }
}
