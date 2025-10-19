package androidx.recyclerview.widget;

import B.a;
import M.B;
import M.S;
import N.n;
import N.o;
import S0.e;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.datastore.preferences.protobuf.C0208k;
import java.util.Arrays;
import java.util.WeakHashMap;
import t0.AbstractC0910Q;
import t0.C0911S;
import t0.C0936v;
import t0.C0938x;
import t0.C0939y;
import t0.C0940z;
import t0.X;
import t0.d0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\recyclerview\widget\GridLayoutManager.smali */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public boolean f4684E;

    /* renamed from: F, reason: collision with root package name */
    public int f4685F;
    public int[] G;

    /* renamed from: H, reason: collision with root package name */
    public View[] f4686H;

    /* renamed from: I, reason: collision with root package name */
    public final SparseIntArray f4687I;

    /* renamed from: J, reason: collision with root package name */
    public final SparseIntArray f4688J;

    /* renamed from: K, reason: collision with root package name */
    public final e f4689K;

    /* renamed from: L, reason: collision with root package name */
    public final Rect f4690L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i5) {
        super(context, attributeSet, i, i5);
        this.f4684E = false;
        this.f4685F = -1;
        this.f4687I = new SparseIntArray();
        this.f4688J = new SparseIntArray();
        this.f4689K = new e(11);
        this.f4690L = new Rect();
        j1(AbstractC0910Q.G(context, attributeSet, i, i5).f9911b);
    }

    @Override // t0.AbstractC0910Q
    public final int H(X x3, d0 d0Var) {
        if (this.f4695p == 0) {
            return this.f4685F;
        }
        if (d0Var.b() < 1) {
            return 0;
        }
        return f1(d0Var.b() - 1, x3, d0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View L0(X x3, d0 d0Var, int i, int i5, int i6) {
        E0();
        int iK = this.f4697r.k();
        int iG = this.f4697r.g();
        int i7 = i5 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i5) {
            View viewU = u(i);
            int iF = AbstractC0910Q.F(viewU);
            if (iF >= 0 && iF < i6 && g1(iF, x3, d0Var) == 0) {
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

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e1, code lost:
    
        if (r13 == (r2 > r15)) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011c  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC0910Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View Q(android.view.View r23, int r24, t0.X r25, t0.d0 r26) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.Q(android.view.View, int, t0.X, t0.d0):android.view.View");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v38 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void R0(X x3, d0 d0Var, C0940z c0940z, C0939y c0939y) {
        int i;
        int i5;
        int i6;
        int iD;
        int iC;
        int iD2;
        int i7;
        int iW;
        int iW2;
        ?? r8;
        int i8;
        View viewB;
        int iJ = this.f4697r.j();
        boolean z4 = iJ != 1073741824;
        int i9 = v() > 0 ? this.G[this.f4685F] : 0;
        if (z4) {
            k1();
        }
        boolean z5 = c0940z.f10174e == 1;
        int iG1 = this.f4685F;
        if (!z5) {
            iG1 = g1(c0940z.f10173d, x3, d0Var) + h1(c0940z.f10173d, x3, d0Var);
        }
        int i10 = 0;
        while (i10 < this.f4685F && (i8 = c0940z.f10173d) >= 0 && i8 < d0Var.b() && iG1 > 0) {
            int i11 = c0940z.f10173d;
            int iH1 = h1(i11, x3, d0Var);
            if (iH1 > this.f4685F) {
                throw new IllegalArgumentException("Item at position " + i11 + " requires " + iH1 + " spans but GridLayoutManager has only " + this.f4685F + " spans.");
            }
            iG1 -= iH1;
            if (iG1 < 0 || (viewB = c0940z.b(x3)) == null) {
                break;
            }
            this.f4686H[i10] = viewB;
            i10++;
        }
        if (i10 == 0) {
            c0939y.f10167b = true;
            return;
        }
        if (z5) {
            i6 = 1;
            i5 = i10;
            i = 0;
        } else {
            i = i10 - 1;
            i5 = -1;
            i6 = -1;
        }
        int i12 = 0;
        while (i != i5) {
            View view = this.f4686H[i];
            C0936v c0936v = (C0936v) view.getLayoutParams();
            int iH12 = h1(AbstractC0910Q.F(view), x3, d0Var);
            c0936v.f10153f = iH12;
            c0936v.f10152e = i12;
            i12 += iH12;
            i += i6;
        }
        float f2 = 0.0f;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            View view2 = this.f4686H[i14];
            if (c0940z.f10178k != null) {
                r8 = 0;
                r8 = 0;
                if (z5) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z5) {
                r8 = 0;
                b(view2, -1, false);
            } else {
                r8 = 0;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.f9915b;
            Rect rect = this.f4690L;
            if (recyclerView == null) {
                rect.set(r8, r8, r8, r8);
            } else {
                rect.set(recyclerView.J(view2));
            }
            i1(view2, iJ, r8);
            int iC2 = this.f4697r.c(view2);
            if (iC2 > i13) {
                i13 = iC2;
            }
            float fD = (this.f4697r.d(view2) * 1.0f) / ((C0936v) view2.getLayoutParams()).f10153f;
            if (fD > f2) {
                f2 = fD;
            }
        }
        if (z4) {
            c1(Math.max(Math.round(f2 * this.f4685F), i9));
            i13 = 0;
            for (int i15 = 0; i15 < i10; i15++) {
                View view3 = this.f4686H[i15];
                i1(view3, 1073741824, true);
                int iC3 = this.f4697r.c(view3);
                if (iC3 > i13) {
                    i13 = iC3;
                }
            }
        }
        for (int i16 = 0; i16 < i10; i16++) {
            View view4 = this.f4686H[i16];
            if (this.f4697r.c(view4) != i13) {
                C0936v c0936v2 = (C0936v) view4.getLayoutParams();
                Rect rect2 = c0936v2.f9928b;
                int i17 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0936v2).topMargin + ((ViewGroup.MarginLayoutParams) c0936v2).bottomMargin;
                int i18 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c0936v2).leftMargin + ((ViewGroup.MarginLayoutParams) c0936v2).rightMargin;
                int iE1 = e1(c0936v2.f10152e, c0936v2.f10153f);
                if (this.f4695p == 1) {
                    iW2 = AbstractC0910Q.w(iE1, 1073741824, i18, ((ViewGroup.MarginLayoutParams) c0936v2).width, false);
                    iW = View.MeasureSpec.makeMeasureSpec(i13 - i17, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13 - i18, 1073741824);
                    iW = AbstractC0910Q.w(iE1, 1073741824, i17, ((ViewGroup.MarginLayoutParams) c0936v2).height, false);
                    iW2 = iMakeMeasureSpec;
                }
                if (u0(view4, iW2, iW, (C0911S) view4.getLayoutParams())) {
                    view4.measure(iW2, iW);
                }
            }
        }
        c0939y.f10166a = i13;
        if (this.f4695p != 1) {
            if (c0940z.f10175f == -1) {
                int i19 = c0940z.f10171b;
                iC = i19 - i13;
                iD = i19;
            } else {
                int i20 = c0940z.f10171b;
                iD = i20 + i13;
                iC = i20;
            }
            iD2 = 0;
            i7 = 0;
        } else if (c0940z.f10175f == -1) {
            int i21 = c0940z.f10171b;
            iC = 0;
            iD = 0;
            i7 = i21 - i13;
            iD2 = i21;
        } else {
            i7 = c0940z.f10171b;
            iD2 = i7 + i13;
            iC = 0;
            iD = 0;
        }
        for (int i22 = 0; i22 < i10; i22++) {
            View view5 = this.f4686H[i22];
            C0936v c0936v3 = (C0936v) view5.getLayoutParams();
            if (this.f4695p != 1) {
                int iE = E() + this.G[c0936v3.f10152e];
                i7 = iE;
                iD2 = this.f4697r.d(view5) + iE;
            } else if (Q0()) {
                int iC4 = C() + this.G[this.f4685F - c0936v3.f10152e];
                iD = iC4;
                iC = iC4 - this.f4697r.d(view5);
            } else {
                iC = C() + this.G[c0936v3.f10152e];
                iD = this.f4697r.d(view5) + iC;
            }
            AbstractC0910Q.L(view5, iC, i7, iD, iD2);
            if (c0936v3.f9927a.i() || c0936v3.f9927a.l()) {
                c0939y.f10168c = true;
            }
            c0939y.f10169d = view5.hasFocusable() | c0939y.f10169d;
        }
        Arrays.fill(this.f4686H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void S0(X x3, d0 d0Var, C0938x c0938x, int i) {
        k1();
        if (d0Var.b() > 0 && !d0Var.f9978g) {
            boolean z4 = i == 1;
            int iG1 = g1(c0938x.f10162b, x3, d0Var);
            if (z4) {
                while (iG1 > 0) {
                    int i5 = c0938x.f10162b;
                    if (i5 <= 0) {
                        break;
                    }
                    int i6 = i5 - 1;
                    c0938x.f10162b = i6;
                    iG1 = g1(i6, x3, d0Var);
                }
            } else {
                int iB = d0Var.b() - 1;
                int i7 = c0938x.f10162b;
                while (i7 < iB) {
                    int i8 = i7 + 1;
                    int iG12 = g1(i8, x3, d0Var);
                    if (iG12 <= iG1) {
                        break;
                    }
                    i7 = i8;
                    iG1 = iG12;
                }
                c0938x.f10162b = i7;
            }
        }
        d1();
    }

    @Override // t0.AbstractC0910Q
    public final void T(X x3, d0 d0Var, View view, o oVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0936v)) {
            S(view, oVar);
            return;
        }
        C0936v c0936v = (C0936v) layoutParams;
        int iF1 = f1(c0936v.f9927a.b(), x3, d0Var);
        if (this.f4695p == 0) {
            oVar.h(n.a(c0936v.f10152e, c0936v.f10153f, iF1, 1, false));
        } else {
            oVar.h(n.a(iF1, 1, c0936v.f10152e, c0936v.f10153f, false));
        }
    }

    @Override // t0.AbstractC0910Q
    public final void U(int i, int i5) {
        e eVar = this.f4689K;
        eVar.u();
        ((SparseIntArray) eVar.f2852b).clear();
    }

    @Override // t0.AbstractC0910Q
    public final void V() {
        e eVar = this.f4689K;
        eVar.u();
        ((SparseIntArray) eVar.f2852b).clear();
    }

    @Override // t0.AbstractC0910Q
    public final void W(int i, int i5) {
        e eVar = this.f4689K;
        eVar.u();
        ((SparseIntArray) eVar.f2852b).clear();
    }

    @Override // t0.AbstractC0910Q
    public final void X(int i, int i5) {
        e eVar = this.f4689K;
        eVar.u();
        ((SparseIntArray) eVar.f2852b).clear();
    }

    @Override // t0.AbstractC0910Q
    public final void Y(int i, int i5) {
        e eVar = this.f4689K;
        eVar.u();
        ((SparseIntArray) eVar.f2852b).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Y0(boolean z4) {
        if (z4) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.Y0(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC0910Q
    public final void Z(X x3, d0 d0Var) {
        boolean z4 = d0Var.f9978g;
        SparseIntArray sparseIntArray = this.f4688J;
        SparseIntArray sparseIntArray2 = this.f4687I;
        if (z4) {
            int iV = v();
            for (int i = 0; i < iV; i++) {
                C0936v c0936v = (C0936v) u(i).getLayoutParams();
                int iB = c0936v.f9927a.b();
                sparseIntArray2.put(iB, c0936v.f10153f);
                sparseIntArray.put(iB, c0936v.f10152e);
            }
        }
        super.Z(x3, d0Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC0910Q
    public final void a0(d0 d0Var) {
        super.a0(d0Var);
        this.f4684E = false;
    }

    public final void c1(int i) {
        int i5;
        int[] iArr = this.G;
        int i6 = this.f4685F;
        if (iArr == null || iArr.length != i6 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i6 + 1];
        }
        int i7 = 0;
        iArr[0] = 0;
        int i8 = i / i6;
        int i9 = i % i6;
        int i10 = 0;
        for (int i11 = 1; i11 <= i6; i11++) {
            i7 += i9;
            if (i7 <= 0 || i6 - i7 >= i9) {
                i5 = i8;
            } else {
                i5 = i8 + 1;
                i7 -= i6;
            }
            i10 += i5;
            iArr[i11] = i10;
        }
        this.G = iArr;
    }

    public final void d1() {
        View[] viewArr = this.f4686H;
        if (viewArr == null || viewArr.length != this.f4685F) {
            this.f4686H = new View[this.f4685F];
        }
    }

    public final int e1(int i, int i5) {
        if (this.f4695p != 1 || !Q0()) {
            int[] iArr = this.G;
            return iArr[i5 + i] - iArr[i];
        }
        int[] iArr2 = this.G;
        int i6 = this.f4685F;
        return iArr2[i6 - i] - iArr2[(i6 - i) - i5];
    }

    @Override // t0.AbstractC0910Q
    public final boolean f(C0911S c0911s) {
        return c0911s instanceof C0936v;
    }

    public final int f1(int i, X x3, d0 d0Var) {
        boolean z4 = d0Var.f9978g;
        e eVar = this.f4689K;
        if (!z4) {
            int i5 = this.f4685F;
            eVar.getClass();
            return e.s(i, i5);
        }
        int iB = x3.b(i);
        if (iB != -1) {
            int i6 = this.f4685F;
            eVar.getClass();
            return e.s(iB, i6);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int g1(int i, X x3, d0 d0Var) {
        boolean z4 = d0Var.f9978g;
        e eVar = this.f4689K;
        if (!z4) {
            int i5 = this.f4685F;
            eVar.getClass();
            return i % i5;
        }
        int i6 = this.f4688J.get(i, -1);
        if (i6 != -1) {
            return i6;
        }
        int iB = x3.b(i);
        if (iB != -1) {
            int i7 = this.f4685F;
            eVar.getClass();
            return iB % i7;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public final int h1(int i, X x3, d0 d0Var) {
        boolean z4 = d0Var.f9978g;
        e eVar = this.f4689K;
        if (!z4) {
            eVar.getClass();
            return 1;
        }
        int i5 = this.f4687I.get(i, -1);
        if (i5 != -1) {
            return i5;
        }
        if (x3.b(i) != -1) {
            eVar.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    public final void i1(View view, int i, boolean z4) {
        int iW;
        int iW2;
        C0936v c0936v = (C0936v) view.getLayoutParams();
        Rect rect = c0936v.f9928b;
        int i5 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0936v).topMargin + ((ViewGroup.MarginLayoutParams) c0936v).bottomMargin;
        int i6 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0936v).leftMargin + ((ViewGroup.MarginLayoutParams) c0936v).rightMargin;
        int iE1 = e1(c0936v.f10152e, c0936v.f10153f);
        if (this.f4695p == 1) {
            iW2 = AbstractC0910Q.w(iE1, i, i6, ((ViewGroup.MarginLayoutParams) c0936v).width, false);
            iW = AbstractC0910Q.w(this.f4697r.l(), this.f9924m, i5, ((ViewGroup.MarginLayoutParams) c0936v).height, true);
        } else {
            int iW3 = AbstractC0910Q.w(iE1, i, i5, ((ViewGroup.MarginLayoutParams) c0936v).height, false);
            int iW4 = AbstractC0910Q.w(this.f4697r.l(), this.f9923l, i6, ((ViewGroup.MarginLayoutParams) c0936v).width, true);
            iW = iW3;
            iW2 = iW4;
        }
        C0911S c0911s = (C0911S) view.getLayoutParams();
        if (z4 ? u0(view, iW2, iW, c0911s) : s0(view, iW2, iW, c0911s)) {
            view.measure(iW2, iW);
        }
    }

    public final void j1(int i) {
        if (i == this.f4685F) {
            return;
        }
        this.f4684E = true;
        if (i < 1) {
            throw new IllegalArgumentException(a.g(i, "Span count should be at least 1. Provided "));
        }
        this.f4685F = i;
        this.f4689K.u();
        j0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC0910Q
    public final int k(d0 d0Var) {
        return B0(d0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC0910Q
    public final int k0(int i, X x3, d0 d0Var) {
        k1();
        d1();
        return super.k0(i, x3, d0Var);
    }

    public final void k1() {
        int iB;
        int iE;
        if (this.f4695p == 1) {
            iB = this.f9925n - D();
            iE = C();
        } else {
            iB = this.f9926o - B();
            iE = E();
        }
        c1(iB - iE);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC0910Q
    public final int l(d0 d0Var) {
        return C0(d0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC0910Q
    public final int m0(int i, X x3, d0 d0Var) {
        k1();
        d1();
        return super.m0(i, x3, d0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC0910Q
    public final int n(d0 d0Var) {
        return B0(d0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC0910Q
    public final int o(d0 d0Var) {
        return C0(d0Var);
    }

    @Override // t0.AbstractC0910Q
    public final void p0(Rect rect, int i, int i5) {
        int iG;
        int iG2;
        if (this.G == null) {
            super.p0(rect, i, i5);
        }
        int iD = D() + C();
        int iB = B() + E();
        if (this.f4695p == 1) {
            int iHeight = rect.height() + iB;
            RecyclerView recyclerView = this.f9915b;
            WeakHashMap weakHashMap = S.f2363a;
            iG2 = AbstractC0910Q.g(i5, iHeight, B.d(recyclerView));
            int[] iArr = this.G;
            iG = AbstractC0910Q.g(i, iArr[iArr.length - 1] + iD, B.e(this.f9915b));
        } else {
            int iWidth = rect.width() + iD;
            RecyclerView recyclerView2 = this.f9915b;
            WeakHashMap weakHashMap2 = S.f2363a;
            iG = AbstractC0910Q.g(i, iWidth, B.e(recyclerView2));
            int[] iArr2 = this.G;
            iG2 = AbstractC0910Q.g(i5, iArr2[iArr2.length - 1] + iB, B.d(this.f9915b));
        }
        this.f9915b.setMeasuredDimension(iG, iG2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC0910Q
    public final C0911S r() {
        return this.f4695p == 0 ? new C0936v(-2, -1) : new C0936v(-1, -2);
    }

    @Override // t0.AbstractC0910Q
    public final C0911S s(Context context, AttributeSet attributeSet) {
        C0936v c0936v = new C0936v(context, attributeSet);
        c0936v.f10152e = -1;
        c0936v.f10153f = 0;
        return c0936v;
    }

    @Override // t0.AbstractC0910Q
    public final C0911S t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C0936v c0936v = new C0936v((ViewGroup.MarginLayoutParams) layoutParams);
            c0936v.f10152e = -1;
            c0936v.f10153f = 0;
            return c0936v;
        }
        C0936v c0936v2 = new C0936v(layoutParams);
        c0936v2.f10152e = -1;
        c0936v2.f10153f = 0;
        return c0936v2;
    }

    @Override // t0.AbstractC0910Q
    public final int x(X x3, d0 d0Var) {
        if (this.f4695p == 1) {
            return this.f4685F;
        }
        if (d0Var.b() < 1) {
            return 0;
        }
        return f1(d0Var.b() - 1, x3, d0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC0910Q
    public final boolean x0() {
        return this.f4705z == null && !this.f4684E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void z0(d0 d0Var, C0940z c0940z, C0208k c0208k) {
        int i;
        int i5 = this.f4685F;
        for (int i6 = 0; i6 < this.f4685F && (i = c0940z.f10173d) >= 0 && i < d0Var.b() && i5 > 0; i6++) {
            c0208k.a(c0940z.f10173d, Math.max(0, c0940z.f10176g));
            this.f4689K.getClass();
            i5--;
            c0940z.f10173d += c0940z.f10174e;
        }
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f4684E = false;
        this.f4685F = -1;
        this.f4687I = new SparseIntArray();
        this.f4688J = new SparseIntArray();
        this.f4689K = new e(11);
        this.f4690L = new Rect();
        j1(i);
    }
}
