package com.google.protobuf;

import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\D0.smali */
public final class D0 {

    /* renamed from: f, reason: collision with root package name */
    public static final D0 f6412f = new D0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f6413a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f6414b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f6415c;

    /* renamed from: d, reason: collision with root package name */
    public int f6416d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6417e;

    public D0(int i, int[] iArr, Object[] objArr, boolean z4) {
        this.f6413a = i;
        this.f6414b = iArr;
        this.f6415c = objArr;
        this.f6417e = z4;
    }

    public static D0 c() {
        return new D0(0, new int[8], new Object[8], true);
    }

    public final void a(int i) {
        int[] iArr = this.f6414b;
        if (i > iArr.length) {
            int i5 = this.f6413a;
            int i6 = (i5 / 2) + i5;
            if (i6 >= i) {
                i = i6;
            }
            if (i < 8) {
                i = 8;
            }
            this.f6414b = Arrays.copyOf(iArr, i);
            this.f6415c = Arrays.copyOf(this.f6415c, i);
        }
    }

    public final int b() {
        int iS0;
        int i = this.f6416d;
        if (i != -1) {
            return i;
        }
        int iB = 0;
        for (int i5 = 0; i5 < this.f6413a; i5++) {
            int i6 = this.f6414b[i5];
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i8 == 0) {
                iS0 = AbstractC0422s.s0(i7, ((Long) this.f6415c[i5]).longValue());
            } else if (i8 == 1) {
                ((Long) this.f6415c[i5]).getClass();
                iS0 = AbstractC0422s.d0(i7);
            } else if (i8 == 2) {
                iS0 = AbstractC0422s.Y(i7, (AbstractC0409l) this.f6415c[i5]);
            } else if (i8 == 3) {
                iB = ((D0) this.f6415c[i5]).b() + (AbstractC0422s.p0(i7) * 2) + iB;
            } else {
                if (i8 != 5) {
                    throw new IllegalStateException(N.d());
                }
                ((Integer) this.f6415c[i5]).getClass();
                iS0 = AbstractC0422s.c0(i7);
            }
            iB = iS0 + iB;
        }
        this.f6416d = iB;
        return iB;
    }

    public final void d(int i, Object obj) {
        if (!this.f6417e) {
            throw new UnsupportedOperationException();
        }
        a(this.f6413a + 1);
        int[] iArr = this.f6414b;
        int i5 = this.f6413a;
        iArr[i5] = i;
        this.f6415c[i5] = obj;
        this.f6413a = i5 + 1;
    }

    public final void e(Y y4) {
        if (this.f6413a == 0) {
            return;
        }
        y4.getClass();
        for (int i = 0; i < this.f6413a; i++) {
            int i5 = this.f6414b[i];
            Object obj = this.f6415c[i];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                y4.k(i6, ((Long) obj).longValue());
            } else if (i7 == 1) {
                y4.g(i6, ((Long) obj).longValue());
            } else if (i7 == 2) {
                y4.c(i6, (AbstractC0409l) obj);
            } else if (i7 == 3) {
                AbstractC0422s abstractC0422s = (AbstractC0422s) y4.f6481a;
                abstractC0422s.K0(i6, 3);
                ((D0) obj).e(y4);
                abstractC0422s.K0(i6, 4);
            } else {
                if (i7 != 5) {
                    throw new RuntimeException(N.d());
                }
                y4.f(i6, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof D0)) {
            return false;
        }
        D0 d02 = (D0) obj;
        int i = this.f6413a;
        if (i == d02.f6413a) {
            int[] iArr = this.f6414b;
            int[] iArr2 = d02.f6414b;
            int i5 = 0;
            while (true) {
                if (i5 >= i) {
                    Object[] objArr = this.f6415c;
                    Object[] objArr2 = d02.f6415c;
                    int i6 = this.f6413a;
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
        int i = this.f6413a;
        int i5 = (527 + i) * 31;
        int[] iArr = this.f6414b;
        int iHashCode = 17;
        int i6 = 17;
        for (int i7 = 0; i7 < i; i7++) {
            i6 = (i6 * 31) + iArr[i7];
        }
        int i8 = (i5 + i6) * 31;
        Object[] objArr = this.f6415c;
        int i9 = this.f6413a;
        for (int i10 = 0; i10 < i9; i10++) {
            iHashCode = (iHashCode * 31) + objArr[i10].hashCode();
        }
        return i8 + iHashCode;
    }
}
