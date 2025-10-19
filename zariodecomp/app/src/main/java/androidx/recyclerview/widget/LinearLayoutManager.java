package androidx.recyclerview.widget;

import B.a;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.datastore.preferences.protobuf.C0208k;
import c0.f;
import t0.AbstractC0910Q;
import t0.AbstractC0917b;
import t0.C0894A;
import t0.C0895B;
import t0.C0909P;
import t0.C0911S;
import t0.C0938x;
import t0.C0939y;
import t0.C0940z;
import t0.X;
import t0.c0;
import t0.d0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\recyclerview\widget\LinearLayoutManager.smali */
public class LinearLayoutManager extends AbstractC0910Q implements c0 {

    /* renamed from: A, reason: collision with root package name */
    public final C0938x f4691A;

    /* renamed from: B, reason: collision with root package name */
    public final C0939y f4692B;

    /* renamed from: C, reason: collision with root package name */
    public final int f4693C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f4694D;

    /* renamed from: p, reason: collision with root package name */
    public int f4695p;

    /* renamed from: q, reason: collision with root package name */
    public C0940z f4696q;

    /* renamed from: r, reason: collision with root package name */
    public f f4697r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4698s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f4699t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4700u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4701v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f4702w;

    /* renamed from: x, reason: collision with root package name */
    public int f4703x;

    /* renamed from: y, reason: collision with root package name */
    public int f4704y;

    /* renamed from: z, reason: collision with root package name */
    public C0894A f4705z;

    public LinearLayoutManager(int i) {
        this.f4695p = 1;
        this.f4699t = false;
        this.f4700u = false;
        this.f4701v = false;
        this.f4702w = true;
        this.f4703x = -1;
        this.f4704y = Integer.MIN_VALUE;
        this.f4705z = null;
        this.f4691A = new C0938x();
        this.f4692B = new C0939y();
        this.f4693C = 2;
        this.f4694D = new int[2];
        X0(i);
        c(null);
        if (this.f4699t) {
            this.f4699t = false;
            j0();
        }
    }

    public final int A0(d0 d0Var) {
        if (v() == 0) {
            return 0;
        }
        E0();
        f fVar = this.f4697r;
        boolean z4 = !this.f4702w;
        return AbstractC0917b.c(d0Var, fVar, H0(z4), G0(z4), this, this.f4702w);
    }

    public final int B0(d0 d0Var) {
        if (v() == 0) {
            return 0;
        }
        E0();
        f fVar = this.f4697r;
        boolean z4 = !this.f4702w;
        return AbstractC0917b.d(d0Var, fVar, H0(z4), G0(z4), this, this.f4702w, this.f4700u);
    }

    public final int C0(d0 d0Var) {
        if (v() == 0) {
            return 0;
        }
        E0();
        f fVar = this.f4697r;
        boolean z4 = !this.f4702w;
        return AbstractC0917b.e(d0Var, fVar, H0(z4), G0(z4), this, this.f4702w);
    }

    public final int D0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f4695p == 1) ? 1 : Integer.MIN_VALUE : this.f4695p == 0 ? 1 : Integer.MIN_VALUE : this.f4695p == 1 ? -1 : Integer.MIN_VALUE : this.f4695p == 0 ? -1 : Integer.MIN_VALUE : (this.f4695p != 1 && Q0()) ? -1 : 1 : (this.f4695p != 1 && Q0()) ? 1 : -1;
    }

    public final void E0() {
        if (this.f4696q == null) {
            C0940z c0940z = new C0940z();
            c0940z.f10170a = true;
            c0940z.h = 0;
            c0940z.i = 0;
            c0940z.f10178k = null;
            this.f4696q = c0940z;
        }
    }

    public final int F0(X x3, C0940z c0940z, d0 d0Var, boolean z4) {
        int i;
        int i5 = c0940z.f10172c;
        int i6 = c0940z.f10176g;
        if (i6 != Integer.MIN_VALUE) {
            if (i5 < 0) {
                c0940z.f10176g = i6 + i5;
            }
            T0(x3, c0940z);
        }
        int i7 = c0940z.f10172c + c0940z.h;
        while (true) {
            if ((!c0940z.f10179l && i7 <= 0) || (i = c0940z.f10173d) < 0 || i >= d0Var.b()) {
                break;
            }
            C0939y c0939y = this.f4692B;
            c0939y.f10166a = 0;
            c0939y.f10167b = false;
            c0939y.f10168c = false;
            c0939y.f10169d = false;
            R0(x3, d0Var, c0940z, c0939y);
            if (!c0939y.f10167b) {
                int i8 = c0940z.f10171b;
                int i9 = c0939y.f10166a;
                c0940z.f10171b = (c0940z.f10175f * i9) + i8;
                if (!c0939y.f10168c || c0940z.f10178k != null || !d0Var.f9978g) {
                    c0940z.f10172c -= i9;
                    i7 -= i9;
                }
                int i10 = c0940z.f10176g;
                if (i10 != Integer.MIN_VALUE) {
                    int i11 = i10 + i9;
                    c0940z.f10176g = i11;
                    int i12 = c0940z.f10172c;
                    if (i12 < 0) {
                        c0940z.f10176g = i11 + i12;
                    }
                    T0(x3, c0940z);
                }
                if (z4 && c0939y.f10169d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i5 - c0940z.f10172c;
    }

    public final View G0(boolean z4) {
        return this.f4700u ? K0(0, v(), z4) : K0(v() - 1, -1, z4);
    }

    public final View H0(boolean z4) {
        return this.f4700u ? K0(v() - 1, -1, z4) : K0(0, v(), z4);
    }

    public final int I0() {
        View viewK0 = K0(v() - 1, -1, false);
        if (viewK0 == null) {
            return -1;
        }
        return AbstractC0910Q.F(viewK0);
    }

    @Override // t0.AbstractC0910Q
    public final boolean J() {
        return true;
    }

    public final View J0(int i, int i5) {
        int i6;
        int i7;
        E0();
        if (i5 <= i && i5 >= i) {
            return u(i);
        }
        if (this.f4697r.e(u(i)) < this.f4697r.k()) {
            i6 = 16644;
            i7 = 16388;
        } else {
            i6 = 4161;
            i7 = 4097;
        }
        return this.f4695p == 0 ? this.f9916c.b(i, i5, i6, i7) : this.f9917d.b(i, i5, i6, i7);
    }

    public final View K0(int i, int i5, boolean z4) {
        E0();
        int i6 = z4 ? 24579 : 320;
        return this.f4695p == 0 ? this.f9916c.b(i, i5, i6, 320) : this.f9917d.b(i, i5, i6, 320);
    }

    public View L0(X x3, d0 d0Var, int i, int i5, int i6) {
        E0();
        int iK = this.f4697r.k();
        int iG = this.f4697r.g();
        int i7 = i5 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i5) {
            View viewU = u(i);
            int iF = AbstractC0910Q.F(viewU);
            if (iF >= 0 && iF < i6) {
                if (((C0911S) viewU.getLayoutParams()).f9927a.i()) {
                    if (view2 == null) {
                        view2 = viewU;
                    }
                } else {
                    if (this.f4697r.e(viewU) < iG && this.f4697r.b(viewU) >= iK) {
                        return viewU;
                    }
                    if (view == null) {
                        view = viewU;
                    }
                }
            }
            i += i7;
        }
        return view != null ? view : view2;
    }

    public final int M0(int i, X x3, d0 d0Var, boolean z4) {
        int iG;
        int iG2 = this.f4697r.g() - i;
        if (iG2 <= 0) {
            return 0;
        }
        int i5 = -W0(-iG2, x3, d0Var);
        int i6 = i + i5;
        if (!z4 || (iG = this.f4697r.g() - i6) <= 0) {
            return i5;
        }
        this.f4697r.p(iG);
        return iG + i5;
    }

    public final int N0(int i, X x3, d0 d0Var, boolean z4) {
        int iK;
        int iK2 = i - this.f4697r.k();
        if (iK2 <= 0) {
            return 0;
        }
        int i5 = -W0(iK2, x3, d0Var);
        int i6 = i + i5;
        if (!z4 || (iK = i6 - this.f4697r.k()) <= 0) {
            return i5;
        }
        this.f4697r.p(-iK);
        return i5 - iK;
    }

    public final View O0() {
        return u(this.f4700u ? 0 : v() - 1);
    }

    @Override // t0.AbstractC0910Q
    public final void P(RecyclerView recyclerView) {
    }

    public final View P0() {
        return u(this.f4700u ? v() - 1 : 0);
    }

    @Override // t0.AbstractC0910Q
    public View Q(View view, int i, X x3, d0 d0Var) {
        int iD0;
        V0();
        if (v() == 0 || (iD0 = D0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        E0();
        Z0(iD0, (int) (this.f4697r.l() * 0.33333334f), false, d0Var);
        C0940z c0940z = this.f4696q;
        c0940z.f10176g = Integer.MIN_VALUE;
        c0940z.f10170a = false;
        F0(x3, c0940z, d0Var, true);
        View viewJ0 = iD0 == -1 ? this.f4700u ? J0(v() - 1, -1) : J0(0, v()) : this.f4700u ? J0(0, v()) : J0(v() - 1, -1);
        View viewP0 = iD0 == -1 ? P0() : O0();
        if (!viewP0.hasFocusable()) {
            return viewJ0;
        }
        if (viewJ0 == null) {
            return null;
        }
        return viewP0;
    }

    public final boolean Q0() {
        return A() == 1;
    }

    @Override // t0.AbstractC0910Q
    public final void R(AccessibilityEvent accessibilityEvent) {
        super.R(accessibilityEvent);
        if (v() > 0) {
            View viewK0 = K0(0, v(), false);
            accessibilityEvent.setFromIndex(viewK0 == null ? -1 : AbstractC0910Q.F(viewK0));
            accessibilityEvent.setToIndex(I0());
        }
    }

    public void R0(X x3, d0 d0Var, C0940z c0940z, C0939y c0939y) {
        int iE;
        int i;
        int iD;
        int i5;
        int iD2;
        View viewB = c0940z.b(x3);
        if (viewB == null) {
            c0939y.f10167b = true;
            return;
        }
        C0911S c0911s = (C0911S) viewB.getLayoutParams();
        if (c0940z.f10178k == null) {
            if (this.f4700u == (c0940z.f10175f == -1)) {
                b(viewB, -1, false);
            } else {
                b(viewB, 0, false);
            }
        } else {
            if (this.f4700u == (c0940z.f10175f == -1)) {
                b(viewB, -1, true);
            } else {
                b(viewB, 0, true);
            }
        }
        C0911S c0911s2 = (C0911S) viewB.getLayoutParams();
        Rect rectJ = this.f9915b.J(viewB);
        int i6 = rectJ.left + rectJ.right;
        int i7 = rectJ.top + rectJ.bottom;
        int iW = AbstractC0910Q.w(this.f9925n, this.f9923l, D() + C() + ((ViewGroup.MarginLayoutParams) c0911s2).leftMargin + ((ViewGroup.MarginLayoutParams) c0911s2).rightMargin + i6, ((ViewGroup.MarginLayoutParams) c0911s2).width, d());
        int iW2 = AbstractC0910Q.w(this.f9926o, this.f9924m, B() + E() + ((ViewGroup.MarginLayoutParams) c0911s2).topMargin + ((ViewGroup.MarginLayoutParams) c0911s2).bottomMargin + i7, ((ViewGroup.MarginLayoutParams) c0911s2).height, e());
        if (s0(viewB, iW, iW2, c0911s2)) {
            viewB.measure(iW, iW2);
        }
        c0939y.f10166a = this.f4697r.c(viewB);
        if (this.f4695p == 1) {
            if (Q0()) {
                iD = this.f9925n - D();
                iD2 = iD - this.f4697r.d(viewB);
            } else {
                int iC = C();
                iD = this.f4697r.d(viewB) + iC;
                iD2 = iC;
            }
            if (c0940z.f10175f == -1) {
                i5 = c0940z.f10171b;
                iE = i5 - c0939y.f10166a;
            } else {
                iE = c0940z.f10171b;
                i5 = c0939y.f10166a + iE;
            }
        } else {
            iE = E();
            int iD3 = this.f4697r.d(viewB) + iE;
            if (c0940z.f10175f == -1) {
                iD = c0940z.f10171b;
                i = iD - c0939y.f10166a;
            } else {
                i = c0940z.f10171b;
                iD = c0939y.f10166a + i;
            }
            int i8 = i;
            i5 = iD3;
            iD2 = i8;
        }
        AbstractC0910Q.L(viewB, iD2, iE, iD, i5);
        if (c0911s.f9927a.i() || c0911s.f9927a.l()) {
            c0939y.f10168c = true;
        }
        c0939y.f10169d = viewB.hasFocusable();
    }

    public void S0(X x3, d0 d0Var, C0938x c0938x, int i) {
    }

    public final void T0(X x3, C0940z c0940z) {
        if (!c0940z.f10170a || c0940z.f10179l) {
            return;
        }
        int i = c0940z.f10176g;
        int i5 = c0940z.i;
        if (c0940z.f10175f == -1) {
            int iV = v();
            if (i < 0) {
                return;
            }
            int iF = (this.f4697r.f() - i) + i5;
            if (this.f4700u) {
                for (int i6 = 0; i6 < iV; i6++) {
                    View viewU = u(i6);
                    if (this.f4697r.e(viewU) < iF || this.f4697r.o(viewU) < iF) {
                        U0(x3, 0, i6);
                        return;
                    }
                }
                return;
            }
            int i7 = iV - 1;
            for (int i8 = i7; i8 >= 0; i8--) {
                View viewU2 = u(i8);
                if (this.f4697r.e(viewU2) < iF || this.f4697r.o(viewU2) < iF) {
                    U0(x3, i7, i8);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i9 = i - i5;
        int iV2 = v();
        if (!this.f4700u) {
            for (int i10 = 0; i10 < iV2; i10++) {
                View viewU3 = u(i10);
                if (this.f4697r.b(viewU3) > i9 || this.f4697r.n(viewU3) > i9) {
                    U0(x3, 0, i10);
                    return;
                }
            }
            return;
        }
        int i11 = iV2 - 1;
        for (int i12 = i11; i12 >= 0; i12--) {
            View viewU4 = u(i12);
            if (this.f4697r.b(viewU4) > i9 || this.f4697r.n(viewU4) > i9) {
                U0(x3, i11, i12);
                return;
            }
        }
    }

    public final void U0(X x3, int i, int i5) {
        if (i == i5) {
            return;
        }
        if (i5 <= i) {
            while (i > i5) {
                View viewU = u(i);
                h0(i);
                x3.f(viewU);
                i--;
            }
            return;
        }
        for (int i6 = i5 - 1; i6 >= i; i6--) {
            View viewU2 = u(i6);
            h0(i6);
            x3.f(viewU2);
        }
    }

    public final void V0() {
        if (this.f4695p == 1 || !Q0()) {
            this.f4700u = this.f4699t;
        } else {
            this.f4700u = !this.f4699t;
        }
    }

    public final int W0(int i, X x3, d0 d0Var) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        E0();
        this.f4696q.f10170a = true;
        int i5 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        Z0(i5, iAbs, true, d0Var);
        C0940z c0940z = this.f4696q;
        int iF0 = F0(x3, c0940z, d0Var, false) + c0940z.f10176g;
        if (iF0 < 0) {
            return 0;
        }
        if (iAbs > iF0) {
            i = i5 * iF0;
        }
        this.f4697r.p(-i);
        this.f4696q.f10177j = i;
        return i;
    }

    public final void X0(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(a.g(i, "invalid orientation:"));
        }
        c(null);
        if (i != this.f4695p || this.f4697r == null) {
            f fVarA = f.a(this, i);
            this.f4697r = fVarA;
            this.f4691A.f10161a = fVarA;
            this.f4695p = i;
            j0();
        }
    }

    public void Y0(boolean z4) {
        c(null);
        if (this.f4701v == z4) {
            return;
        }
        this.f4701v = z4;
        j0();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018c  */
    @Override // t0.AbstractC0910Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Z(t0.X r18, t0.d0 r19) {
        /*
            Method dump skipped, instructions count: 1165
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.Z(t0.X, t0.d0):void");
    }

    public final void Z0(int i, int i5, boolean z4, d0 d0Var) {
        int iK;
        this.f4696q.f10179l = this.f4697r.i() == 0 && this.f4697r.f() == 0;
        this.f4696q.f10175f = i;
        int[] iArr = this.f4694D;
        iArr[0] = 0;
        iArr[1] = 0;
        y0(d0Var, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z5 = i == 1;
        C0940z c0940z = this.f4696q;
        int i6 = z5 ? iMax2 : iMax;
        c0940z.h = i6;
        if (!z5) {
            iMax = iMax2;
        }
        c0940z.i = iMax;
        if (z5) {
            c0940z.h = this.f4697r.h() + i6;
            View viewO0 = O0();
            C0940z c0940z2 = this.f4696q;
            c0940z2.f10174e = this.f4700u ? -1 : 1;
            int iF = AbstractC0910Q.F(viewO0);
            C0940z c0940z3 = this.f4696q;
            c0940z2.f10173d = iF + c0940z3.f10174e;
            c0940z3.f10171b = this.f4697r.b(viewO0);
            iK = this.f4697r.b(viewO0) - this.f4697r.g();
        } else {
            View viewP0 = P0();
            C0940z c0940z4 = this.f4696q;
            c0940z4.h = this.f4697r.k() + c0940z4.h;
            C0940z c0940z5 = this.f4696q;
            c0940z5.f10174e = this.f4700u ? 1 : -1;
            int iF2 = AbstractC0910Q.F(viewP0);
            C0940z c0940z6 = this.f4696q;
            c0940z5.f10173d = iF2 + c0940z6.f10174e;
            c0940z6.f10171b = this.f4697r.e(viewP0);
            iK = (-this.f4697r.e(viewP0)) + this.f4697r.k();
        }
        C0940z c0940z7 = this.f4696q;
        c0940z7.f10172c = i5;
        if (z4) {
            c0940z7.f10172c = i5 - iK;
        }
        c0940z7.f10176g = iK;
    }

    @Override // t0.c0
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i5 = (i < AbstractC0910Q.F(u(0))) != this.f4700u ? -1 : 1;
        return this.f4695p == 0 ? new PointF(i5, 0.0f) : new PointF(0.0f, i5);
    }

    @Override // t0.AbstractC0910Q
    public void a0(d0 d0Var) {
        this.f4705z = null;
        this.f4703x = -1;
        this.f4704y = Integer.MIN_VALUE;
        this.f4691A.d();
    }

    public final void a1(int i, int i5) {
        this.f4696q.f10172c = this.f4697r.g() - i5;
        C0940z c0940z = this.f4696q;
        c0940z.f10174e = this.f4700u ? -1 : 1;
        c0940z.f10173d = i;
        c0940z.f10175f = 1;
        c0940z.f10171b = i5;
        c0940z.f10176g = Integer.MIN_VALUE;
    }

    @Override // t0.AbstractC0910Q
    public final void b0(Parcelable parcelable) {
        if (parcelable instanceof C0894A) {
            this.f4705z = (C0894A) parcelable;
            j0();
        }
    }

    public final void b1(int i, int i5) {
        this.f4696q.f10172c = i5 - this.f4697r.k();
        C0940z c0940z = this.f4696q;
        c0940z.f10173d = i;
        c0940z.f10174e = this.f4700u ? 1 : -1;
        c0940z.f10175f = -1;
        c0940z.f10171b = i5;
        c0940z.f10176g = Integer.MIN_VALUE;
    }

    @Override // t0.AbstractC0910Q
    public final void c(String str) {
        if (this.f4705z == null) {
            super.c(str);
        }
    }

    @Override // t0.AbstractC0910Q
    public final Parcelable c0() {
        C0894A c0894a = this.f4705z;
        if (c0894a != null) {
            C0894A c0894a2 = new C0894A();
            c0894a2.f9872a = c0894a.f9872a;
            c0894a2.f9873b = c0894a.f9873b;
            c0894a2.f9874c = c0894a.f9874c;
            return c0894a2;
        }
        C0894A c0894a3 = new C0894A();
        if (v() > 0) {
            E0();
            boolean z4 = this.f4698s ^ this.f4700u;
            c0894a3.f9874c = z4;
            if (z4) {
                View viewO0 = O0();
                c0894a3.f9873b = this.f4697r.g() - this.f4697r.b(viewO0);
                c0894a3.f9872a = AbstractC0910Q.F(viewO0);
            } else {
                View viewP0 = P0();
                c0894a3.f9872a = AbstractC0910Q.F(viewP0);
                c0894a3.f9873b = this.f4697r.e(viewP0) - this.f4697r.k();
            }
        } else {
            c0894a3.f9872a = -1;
        }
        return c0894a3;
    }

    @Override // t0.AbstractC0910Q
    public final boolean d() {
        return this.f4695p == 0;
    }

    @Override // t0.AbstractC0910Q
    public final boolean e() {
        return this.f4695p == 1;
    }

    @Override // t0.AbstractC0910Q
    public final void h(int i, int i5, d0 d0Var, C0208k c0208k) {
        if (this.f4695p != 0) {
            i = i5;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        E0();
        Z0(i > 0 ? 1 : -1, Math.abs(i), true, d0Var);
        z0(d0Var, this.f4696q, c0208k);
    }

    @Override // t0.AbstractC0910Q
    public final void i(int i, C0208k c0208k) {
        boolean z4;
        int i5;
        C0894A c0894a = this.f4705z;
        if (c0894a == null || (i5 = c0894a.f9872a) < 0) {
            V0();
            z4 = this.f4700u;
            i5 = this.f4703x;
            if (i5 == -1) {
                i5 = z4 ? i - 1 : 0;
            }
        } else {
            z4 = c0894a.f9874c;
        }
        int i6 = z4 ? -1 : 1;
        for (int i7 = 0; i7 < this.f4693C && i5 >= 0 && i5 < i; i7++) {
            c0208k.a(i5, 0);
            i5 += i6;
        }
    }

    @Override // t0.AbstractC0910Q
    public final int j(d0 d0Var) {
        return A0(d0Var);
    }

    @Override // t0.AbstractC0910Q
    public int k(d0 d0Var) {
        return B0(d0Var);
    }

    @Override // t0.AbstractC0910Q
    public int k0(int i, X x3, d0 d0Var) {
        if (this.f4695p == 1) {
            return 0;
        }
        return W0(i, x3, d0Var);
    }

    @Override // t0.AbstractC0910Q
    public int l(d0 d0Var) {
        return C0(d0Var);
    }

    @Override // t0.AbstractC0910Q
    public final void l0(int i) {
        this.f4703x = i;
        this.f4704y = Integer.MIN_VALUE;
        C0894A c0894a = this.f4705z;
        if (c0894a != null) {
            c0894a.f9872a = -1;
        }
        j0();
    }

    @Override // t0.AbstractC0910Q
    public final int m(d0 d0Var) {
        return A0(d0Var);
    }

    @Override // t0.AbstractC0910Q
    public int m0(int i, X x3, d0 d0Var) {
        if (this.f4695p == 0) {
            return 0;
        }
        return W0(i, x3, d0Var);
    }

    @Override // t0.AbstractC0910Q
    public int n(d0 d0Var) {
        return B0(d0Var);
    }

    @Override // t0.AbstractC0910Q
    public int o(d0 d0Var) {
        return C0(d0Var);
    }

    @Override // t0.AbstractC0910Q
    public final View q(int i) {
        int iV = v();
        if (iV == 0) {
            return null;
        }
        int iF = i - AbstractC0910Q.F(u(0));
        if (iF >= 0 && iF < iV) {
            View viewU = u(iF);
            if (AbstractC0910Q.F(viewU) == i) {
                return viewU;
            }
        }
        return super.q(i);
    }

    @Override // t0.AbstractC0910Q
    public C0911S r() {
        return new C0911S(-2, -2);
    }

    @Override // t0.AbstractC0910Q
    public final boolean t0() {
        if (this.f9924m == 1073741824 || this.f9923l == 1073741824) {
            return false;
        }
        int iV = v();
        for (int i = 0; i < iV; i++) {
            ViewGroup.LayoutParams layoutParams = u(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // t0.AbstractC0910Q
    public void v0(RecyclerView recyclerView, int i) {
        C0895B c0895b = new C0895B(recyclerView.getContext());
        c0895b.f9875a = i;
        w0(c0895b);
    }

    @Override // t0.AbstractC0910Q
    public boolean x0() {
        return this.f4705z == null && this.f4698s == this.f4701v;
    }

    public void y0(d0 d0Var, int[] iArr) {
        int i;
        int iL = d0Var.f9972a != -1 ? this.f4697r.l() : 0;
        if (this.f4696q.f10175f == -1) {
            i = 0;
        } else {
            i = iL;
            iL = 0;
        }
        iArr[0] = iL;
        iArr[1] = i;
    }

    public void z0(d0 d0Var, C0940z c0940z, C0208k c0208k) {
        int i = c0940z.f10173d;
        if (i < 0 || i >= d0Var.b()) {
            return;
        }
        c0208k.a(i, Math.max(0, c0940z.f10176g));
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i5) {
        this.f4695p = 1;
        this.f4699t = false;
        this.f4700u = false;
        this.f4701v = false;
        this.f4702w = true;
        this.f4703x = -1;
        this.f4704y = Integer.MIN_VALUE;
        this.f4705z = null;
        this.f4691A = new C0938x();
        this.f4692B = new C0939y();
        this.f4693C = 2;
        this.f4694D = new int[2];
        C0909P c0909pG = AbstractC0910Q.G(context, attributeSet, i, i5);
        X0(c0909pG.f9910a);
        boolean z4 = c0909pG.f9912c;
        c(null);
        if (z4 != this.f4699t) {
            this.f4699t = z4;
            j0();
        }
        Y0(c0909pG.f9913d);
    }
}
