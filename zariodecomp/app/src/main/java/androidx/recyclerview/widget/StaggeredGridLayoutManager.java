package androidx.recyclerview.widget;

import M.B;
import M.S;
import N.n;
import N.o;
import S0.l;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import t0.AbstractC0910Q;
import t0.AbstractC0917b;
import t0.C0895B;
import t0.C0909P;
import t0.C0911S;
import t0.C0937w;
import t0.RunnableC0931q;
import t0.X;
import t0.c0;
import t0.d0;
import t0.k0;
import t0.l0;
import t0.n0;
import t0.o0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\recyclerview\widget\StaggeredGridLayoutManager.smali */
public class StaggeredGridLayoutManager extends AbstractC0910Q implements c0 {

    /* renamed from: B, reason: collision with root package name */
    public final l f4778B;

    /* renamed from: C, reason: collision with root package name */
    public final int f4779C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f4780D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f4781E;

    /* renamed from: F, reason: collision with root package name */
    public n0 f4782F;
    public final Rect G;

    /* renamed from: H, reason: collision with root package name */
    public final k0 f4783H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f4784I;

    /* renamed from: J, reason: collision with root package name */
    public int[] f4785J;

    /* renamed from: K, reason: collision with root package name */
    public final RunnableC0931q f4786K;

    /* renamed from: p, reason: collision with root package name */
    public final int f4787p;

    /* renamed from: q, reason: collision with root package name */
    public final o0[] f4788q;

    /* renamed from: r, reason: collision with root package name */
    public final f f4789r;

    /* renamed from: s, reason: collision with root package name */
    public final f f4790s;

    /* renamed from: t, reason: collision with root package name */
    public final int f4791t;

    /* renamed from: u, reason: collision with root package name */
    public int f4792u;

    /* renamed from: v, reason: collision with root package name */
    public final C0937w f4793v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4794w;

    /* renamed from: y, reason: collision with root package name */
    public final BitSet f4796y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4795x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f4797z = -1;

    /* renamed from: A, reason: collision with root package name */
    public int f4777A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i5) {
        this.f4787p = -1;
        this.f4794w = false;
        l lVar = new l(11);
        this.f4778B = lVar;
        this.f4779C = 2;
        this.G = new Rect();
        this.f4783H = new k0(this);
        this.f4784I = true;
        this.f4786K = new RunnableC0931q(this, 1);
        C0909P c0909pG = AbstractC0910Q.G(context, attributeSet, i, i5);
        int i6 = c0909pG.f9910a;
        if (i6 != 0 && i6 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i6 != this.f4791t) {
            this.f4791t = i6;
            f fVar = this.f4789r;
            this.f4789r = this.f4790s;
            this.f4790s = fVar;
            j0();
        }
        int i7 = c0909pG.f9911b;
        c(null);
        if (i7 != this.f4787p) {
            int[] iArr = (int[]) lVar.f2867b;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            lVar.f2868c = null;
            j0();
            this.f4787p = i7;
            this.f4796y = new BitSet(this.f4787p);
            this.f4788q = new o0[this.f4787p];
            for (int i8 = 0; i8 < this.f4787p; i8++) {
                this.f4788q[i8] = new o0(this, i8);
            }
            j0();
        }
        boolean z4 = c0909pG.f9912c;
        c(null);
        n0 n0Var = this.f4782F;
        if (n0Var != null && n0Var.f10083l != z4) {
            n0Var.f10083l = z4;
        }
        this.f4794w = z4;
        j0();
        C0937w c0937w = new C0937w();
        c0937w.f10154a = true;
        c0937w.f10159f = 0;
        c0937w.f10160g = 0;
        this.f4793v = c0937w;
        this.f4789r = f.a(this, this.f4791t);
        this.f4790s = f.a(this, 1 - this.f4791t);
    }

    public static int b1(int i, int i5, int i6) {
        if (i5 == 0 && i6 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i5) - i6), mode) : i;
    }

    public final int A0(d0 d0Var) {
        if (v() == 0) {
            return 0;
        }
        f fVar = this.f4789r;
        boolean z4 = !this.f4784I;
        return AbstractC0917b.c(d0Var, fVar, F0(z4), E0(z4), this, this.f4784I);
    }

    public final int B0(d0 d0Var) {
        if (v() == 0) {
            return 0;
        }
        f fVar = this.f4789r;
        boolean z4 = !this.f4784I;
        return AbstractC0917b.d(d0Var, fVar, F0(z4), E0(z4), this, this.f4784I, this.f4795x);
    }

    public final int C0(d0 d0Var) {
        if (v() == 0) {
            return 0;
        }
        f fVar = this.f4789r;
        boolean z4 = !this.f4784I;
        return AbstractC0917b.e(d0Var, fVar, F0(z4), E0(z4), this, this.f4784I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final int D0(X x3, C0937w c0937w, d0 d0Var) {
        o0 o0Var;
        ?? r6;
        int i;
        int iH;
        int iC;
        int iK;
        int iC2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 0;
        int i10 = 1;
        this.f4796y.set(0, this.f4787p, true);
        C0937w c0937w2 = this.f4793v;
        int i11 = c0937w2.i ? c0937w.f10158e == 1 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : Integer.MIN_VALUE : c0937w.f10158e == 1 ? c0937w.f10160g + c0937w.f10155b : c0937w.f10159f - c0937w.f10155b;
        int i12 = c0937w.f10158e;
        for (int i13 = 0; i13 < this.f4787p; i13++) {
            if (!this.f4788q[i13].f10090a.isEmpty()) {
                a1(this.f4788q[i13], i12, i11);
            }
        }
        int iG = this.f4795x ? this.f4789r.g() : this.f4789r.k();
        boolean z4 = false;
        while (true) {
            int i14 = c0937w.f10156c;
            if (((i14 < 0 || i14 >= d0Var.b()) ? i9 : i10) == 0 || (!c0937w2.i && this.f4796y.isEmpty())) {
                break;
            }
            View view = x3.i(c0937w.f10156c, Long.MAX_VALUE).f10004a;
            c0937w.f10156c += c0937w.f10157d;
            l0 l0Var = (l0) view.getLayoutParams();
            int iB = l0Var.f9927a.b();
            l lVar = this.f4778B;
            int[] iArr = (int[]) lVar.f2867b;
            int i15 = (iArr == null || iB >= iArr.length) ? -1 : iArr[iB];
            if (i15 == -1) {
                if (R0(c0937w.f10158e)) {
                    i8 = this.f4787p - i10;
                    i7 = -1;
                    i6 = -1;
                } else {
                    i6 = i10;
                    i7 = this.f4787p;
                    i8 = i9;
                }
                o0 o0Var2 = null;
                if (c0937w.f10158e == i10) {
                    int iK2 = this.f4789r.k();
                    int i16 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                    while (i8 != i7) {
                        o0 o0Var3 = this.f4788q[i8];
                        int iF = o0Var3.f(iK2);
                        if (iF < i16) {
                            i16 = iF;
                            o0Var2 = o0Var3;
                        }
                        i8 += i6;
                    }
                } else {
                    int iG2 = this.f4789r.g();
                    int i17 = Integer.MIN_VALUE;
                    while (i8 != i7) {
                        o0 o0Var4 = this.f4788q[i8];
                        int iH2 = o0Var4.h(iG2);
                        if (iH2 > i17) {
                            o0Var2 = o0Var4;
                            i17 = iH2;
                        }
                        i8 += i6;
                    }
                }
                o0Var = o0Var2;
                lVar.y(iB);
                ((int[]) lVar.f2867b)[iB] = o0Var.f10094e;
            } else {
                o0Var = this.f4788q[i15];
            }
            l0Var.f10061e = o0Var;
            if (c0937w.f10158e == 1) {
                r6 = 0;
                b(view, -1, false);
            } else {
                r6 = 0;
                b(view, 0, false);
            }
            if (this.f4791t == 1) {
                i = 1;
                P0(view, AbstractC0910Q.w(this.f4792u, this.f9923l, r6, ((ViewGroup.MarginLayoutParams) l0Var).width, r6), AbstractC0910Q.w(this.f9926o, this.f9924m, B() + E(), ((ViewGroup.MarginLayoutParams) l0Var).height, true));
            } else {
                i = 1;
                P0(view, AbstractC0910Q.w(this.f9925n, this.f9923l, D() + C(), ((ViewGroup.MarginLayoutParams) l0Var).width, true), AbstractC0910Q.w(this.f4792u, this.f9924m, 0, ((ViewGroup.MarginLayoutParams) l0Var).height, false));
            }
            if (c0937w.f10158e == i) {
                iC = o0Var.f(iG);
                iH = this.f4789r.c(view) + iC;
            } else {
                iH = o0Var.h(iG);
                iC = iH - this.f4789r.c(view);
            }
            if (c0937w.f10158e == 1) {
                o0 o0Var5 = l0Var.f10061e;
                o0Var5.getClass();
                l0 l0Var2 = (l0) view.getLayoutParams();
                l0Var2.f10061e = o0Var5;
                ArrayList arrayList = o0Var5.f10090a;
                arrayList.add(view);
                o0Var5.f10092c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    o0Var5.f10091b = Integer.MIN_VALUE;
                }
                if (l0Var2.f9927a.i() || l0Var2.f9927a.l()) {
                    o0Var5.f10093d = o0Var5.f10095f.f4789r.c(view) + o0Var5.f10093d;
                }
            } else {
                o0 o0Var6 = l0Var.f10061e;
                o0Var6.getClass();
                l0 l0Var3 = (l0) view.getLayoutParams();
                l0Var3.f10061e = o0Var6;
                ArrayList arrayList2 = o0Var6.f10090a;
                arrayList2.add(0, view);
                o0Var6.f10091b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    o0Var6.f10092c = Integer.MIN_VALUE;
                }
                if (l0Var3.f9927a.i() || l0Var3.f9927a.l()) {
                    o0Var6.f10093d = o0Var6.f10095f.f4789r.c(view) + o0Var6.f10093d;
                }
            }
            if (O0() && this.f4791t == 1) {
                iC2 = this.f4790s.g() - (((this.f4787p - 1) - o0Var.f10094e) * this.f4792u);
                iK = iC2 - this.f4790s.c(view);
            } else {
                iK = this.f4790s.k() + (o0Var.f10094e * this.f4792u);
                iC2 = this.f4790s.c(view) + iK;
            }
            if (this.f4791t == 1) {
                AbstractC0910Q.L(view, iK, iC, iC2, iH);
            } else {
                AbstractC0910Q.L(view, iC, iK, iH, iC2);
            }
            a1(o0Var, c0937w2.f10158e, i11);
            T0(x3, c0937w2);
            if (c0937w2.h && view.hasFocusable()) {
                i5 = 0;
                this.f4796y.set(o0Var.f10094e, false);
            } else {
                i5 = 0;
            }
            i9 = i5;
            i10 = 1;
            z4 = true;
        }
        int i18 = i9;
        if (!z4) {
            T0(x3, c0937w2);
        }
        int iK3 = c0937w2.f10158e == -1 ? this.f4789r.k() - L0(this.f4789r.k()) : K0(this.f4789r.g()) - this.f4789r.g();
        return iK3 > 0 ? Math.min(c0937w.f10155b, iK3) : i18;
    }

    public final View E0(boolean z4) {
        int iK = this.f4789r.k();
        int iG = this.f4789r.g();
        View view = null;
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            int iE = this.f4789r.e(viewU);
            int iB = this.f4789r.b(viewU);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z4) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final View F0(boolean z4) {
        int iK = this.f4789r.k();
        int iG = this.f4789r.g();
        int iV = v();
        View view = null;
        for (int i = 0; i < iV; i++) {
            View viewU = u(i);
            int iE = this.f4789r.e(viewU);
            if (this.f4789r.b(viewU) > iK && iE < iG) {
                if (iE >= iK || !z4) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final void G0(X x3, d0 d0Var, boolean z4) {
        int iG;
        int iK0 = K0(Integer.MIN_VALUE);
        if (iK0 != Integer.MIN_VALUE && (iG = this.f4789r.g() - iK0) > 0) {
            int i = iG - (-X0(-iG, x3, d0Var));
            if (!z4 || i <= 0) {
                return;
            }
            this.f4789r.p(i);
        }
    }

    @Override // t0.AbstractC0910Q
    public final int H(X x3, d0 d0Var) {
        return this.f4791t == 0 ? this.f4787p : super.H(x3, d0Var);
    }

    public final void H0(X x3, d0 d0Var, boolean z4) {
        int iK;
        int iL0 = L0(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
        if (iL0 != Integer.MAX_VALUE && (iK = iL0 - this.f4789r.k()) > 0) {
            int iX0 = iK - X0(iK, x3, d0Var);
            if (!z4 || iX0 <= 0) {
                return;
            }
            this.f4789r.p(-iX0);
        }
    }

    public final int I0() {
        if (v() == 0) {
            return 0;
        }
        return AbstractC0910Q.F(u(0));
    }

    @Override // t0.AbstractC0910Q
    public final boolean J() {
        return this.f4779C != 0;
    }

    public final int J0() {
        int iV = v();
        if (iV == 0) {
            return 0;
        }
        return AbstractC0910Q.F(u(iV - 1));
    }

    public final int K0(int i) {
        int iF = this.f4788q[0].f(i);
        for (int i5 = 1; i5 < this.f4787p; i5++) {
            int iF2 = this.f4788q[i5].f(i);
            if (iF2 > iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    public final int L0(int i) {
        int iH = this.f4788q[0].h(i);
        for (int i5 = 1; i5 < this.f4787p; i5++) {
            int iH2 = this.f4788q[i5].h(i);
            if (iH2 < iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    @Override // t0.AbstractC0910Q
    public final void M(int i) {
        super.M(i);
        for (int i5 = 0; i5 < this.f4787p; i5++) {
            o0 o0Var = this.f4788q[i5];
            int i6 = o0Var.f10091b;
            if (i6 != Integer.MIN_VALUE) {
                o0Var.f10091b = i6 + i;
            }
            int i7 = o0Var.f10092c;
            if (i7 != Integer.MIN_VALUE) {
                o0Var.f10092c = i7 + i;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M0(int r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.M0(int, int, int):void");
    }

    @Override // t0.AbstractC0910Q
    public final void N(int i) {
        super.N(i);
        for (int i5 = 0; i5 < this.f4787p; i5++) {
            o0 o0Var = this.f4788q[i5];
            int i6 = o0Var.f10091b;
            if (i6 != Integer.MIN_VALUE) {
                o0Var.f10091b = i6 + i;
            }
            int i7 = o0Var.f10092c;
            if (i7 != Integer.MIN_VALUE) {
                o0Var.f10092c = i7 + i;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View N0() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.N0():android.view.View");
    }

    public final boolean O0() {
        return A() == 1;
    }

    @Override // t0.AbstractC0910Q
    public final void P(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f9915b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f4786K);
        }
        for (int i = 0; i < this.f4787p; i++) {
            this.f4788q[i].b();
        }
        recyclerView.requestLayout();
    }

    public final void P0(View view, int i, int i5) {
        RecyclerView recyclerView = this.f9915b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.J(view));
        }
        l0 l0Var = (l0) view.getLayoutParams();
        int iB1 = b1(i, ((ViewGroup.MarginLayoutParams) l0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) l0Var).rightMargin + rect.right);
        int iB12 = b1(i5, ((ViewGroup.MarginLayoutParams) l0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) l0Var).bottomMargin + rect.bottom);
        if (s0(view, iB1, iB12, l0Var)) {
            view.measure(iB1, iB12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0063  */
    @Override // t0.AbstractC0910Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View Q(android.view.View r9, int r10, t0.X r11, t0.d0 r12) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Q(android.view.View, int, t0.X, t0.d0):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x040d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q0(t0.X r17, t0.d0 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Q0(t0.X, t0.d0, boolean):void");
    }

    @Override // t0.AbstractC0910Q
    public final void R(AccessibilityEvent accessibilityEvent) {
        super.R(accessibilityEvent);
        if (v() > 0) {
            View viewF0 = F0(false);
            View viewE0 = E0(false);
            if (viewF0 == null || viewE0 == null) {
                return;
            }
            int iF = AbstractC0910Q.F(viewF0);
            int iF2 = AbstractC0910Q.F(viewE0);
            if (iF < iF2) {
                accessibilityEvent.setFromIndex(iF);
                accessibilityEvent.setToIndex(iF2);
            } else {
                accessibilityEvent.setFromIndex(iF2);
                accessibilityEvent.setToIndex(iF);
            }
        }
    }

    public final boolean R0(int i) {
        if (this.f4791t == 0) {
            return (i == -1) != this.f4795x;
        }
        return ((i == -1) == this.f4795x) == O0();
    }

    public final void S0(int i, d0 d0Var) {
        int iI0;
        int i5;
        if (i > 0) {
            iI0 = J0();
            i5 = 1;
        } else {
            iI0 = I0();
            i5 = -1;
        }
        C0937w c0937w = this.f4793v;
        c0937w.f10154a = true;
        Z0(iI0, d0Var);
        Y0(i5);
        c0937w.f10156c = iI0 + c0937w.f10157d;
        c0937w.f10155b = Math.abs(i);
    }

    @Override // t0.AbstractC0910Q
    public final void T(X x3, d0 d0Var, View view, o oVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof l0)) {
            S(view, oVar);
            return;
        }
        l0 l0Var = (l0) layoutParams;
        if (this.f4791t == 0) {
            o0 o0Var = l0Var.f10061e;
            oVar.h(n.a(o0Var == null ? -1 : o0Var.f10094e, 1, -1, -1, false));
        } else {
            o0 o0Var2 = l0Var.f10061e;
            oVar.h(n.a(-1, -1, o0Var2 == null ? -1 : o0Var2.f10094e, 1, false));
        }
    }

    public final void T0(X x3, C0937w c0937w) {
        if (!c0937w.f10154a || c0937w.i) {
            return;
        }
        if (c0937w.f10155b == 0) {
            if (c0937w.f10158e == -1) {
                U0(x3, c0937w.f10160g);
                return;
            } else {
                V0(x3, c0937w.f10159f);
                return;
            }
        }
        int i = 1;
        if (c0937w.f10158e == -1) {
            int i5 = c0937w.f10159f;
            int iH = this.f4788q[0].h(i5);
            while (i < this.f4787p) {
                int iH2 = this.f4788q[i].h(i5);
                if (iH2 > iH) {
                    iH = iH2;
                }
                i++;
            }
            int i6 = i5 - iH;
            U0(x3, i6 < 0 ? c0937w.f10160g : c0937w.f10160g - Math.min(i6, c0937w.f10155b));
            return;
        }
        int i7 = c0937w.f10160g;
        int iF = this.f4788q[0].f(i7);
        while (i < this.f4787p) {
            int iF2 = this.f4788q[i].f(i7);
            if (iF2 < iF) {
                iF = iF2;
            }
            i++;
        }
        int i8 = iF - c0937w.f10160g;
        V0(x3, i8 < 0 ? c0937w.f10159f : Math.min(i8, c0937w.f10155b) + c0937w.f10159f);
    }

    @Override // t0.AbstractC0910Q
    public final void U(int i, int i5) {
        M0(i, i5, 1);
    }

    public final void U0(X x3, int i) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            if (this.f4789r.e(viewU) < i || this.f4789r.o(viewU) < i) {
                return;
            }
            l0 l0Var = (l0) viewU.getLayoutParams();
            l0Var.getClass();
            if (l0Var.f10061e.f10090a.size() == 1) {
                return;
            }
            o0 o0Var = l0Var.f10061e;
            ArrayList arrayList = o0Var.f10090a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            l0 l0Var2 = (l0) view.getLayoutParams();
            l0Var2.f10061e = null;
            if (l0Var2.f9927a.i() || l0Var2.f9927a.l()) {
                o0Var.f10093d -= o0Var.f10095f.f4789r.c(view);
            }
            if (size == 1) {
                o0Var.f10091b = Integer.MIN_VALUE;
            }
            o0Var.f10092c = Integer.MIN_VALUE;
            g0(viewU, x3);
        }
    }

    @Override // t0.AbstractC0910Q
    public final void V() {
        l lVar = this.f4778B;
        int[] iArr = (int[]) lVar.f2867b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        lVar.f2868c = null;
        j0();
    }

    public final void V0(X x3, int i) {
        while (v() > 0) {
            View viewU = u(0);
            if (this.f4789r.b(viewU) > i || this.f4789r.n(viewU) > i) {
                return;
            }
            l0 l0Var = (l0) viewU.getLayoutParams();
            l0Var.getClass();
            if (l0Var.f10061e.f10090a.size() == 1) {
                return;
            }
            o0 o0Var = l0Var.f10061e;
            ArrayList arrayList = o0Var.f10090a;
            View view = (View) arrayList.remove(0);
            l0 l0Var2 = (l0) view.getLayoutParams();
            l0Var2.f10061e = null;
            if (arrayList.size() == 0) {
                o0Var.f10092c = Integer.MIN_VALUE;
            }
            if (l0Var2.f9927a.i() || l0Var2.f9927a.l()) {
                o0Var.f10093d -= o0Var.f10095f.f4789r.c(view);
            }
            o0Var.f10091b = Integer.MIN_VALUE;
            g0(viewU, x3);
        }
    }

    @Override // t0.AbstractC0910Q
    public final void W(int i, int i5) {
        M0(i, i5, 8);
    }

    public final void W0() {
        if (this.f4791t == 1 || !O0()) {
            this.f4795x = this.f4794w;
        } else {
            this.f4795x = !this.f4794w;
        }
    }

    @Override // t0.AbstractC0910Q
    public final void X(int i, int i5) {
        M0(i, i5, 2);
    }

    public final int X0(int i, X x3, d0 d0Var) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        S0(i, d0Var);
        C0937w c0937w = this.f4793v;
        int iD0 = D0(x3, c0937w, d0Var);
        if (c0937w.f10155b >= iD0) {
            i = i < 0 ? -iD0 : iD0;
        }
        this.f4789r.p(-i);
        this.f4780D = this.f4795x;
        c0937w.f10155b = 0;
        T0(x3, c0937w);
        return i;
    }

    @Override // t0.AbstractC0910Q
    public final void Y(int i, int i5) {
        M0(i, i5, 4);
    }

    public final void Y0(int i) {
        C0937w c0937w = this.f4793v;
        c0937w.f10158e = i;
        c0937w.f10157d = this.f4795x != (i == -1) ? -1 : 1;
    }

    @Override // t0.AbstractC0910Q
    public final void Z(X x3, d0 d0Var) {
        Q0(x3, d0Var, true);
    }

    public final void Z0(int i, d0 d0Var) {
        int iL;
        int iL2;
        int i5;
        C0937w c0937w = this.f4793v;
        boolean z4 = false;
        c0937w.f10155b = 0;
        c0937w.f10156c = i;
        C0895B c0895b = this.f9918e;
        if (!(c0895b != null && c0895b.f9879e) || (i5 = d0Var.f9972a) == -1) {
            iL = 0;
            iL2 = 0;
        } else {
            if (this.f4795x == (i5 < i)) {
                iL = this.f4789r.l();
                iL2 = 0;
            } else {
                iL2 = this.f4789r.l();
                iL = 0;
            }
        }
        RecyclerView recyclerView = this.f9915b;
        if (recyclerView == null || !recyclerView.f4747k) {
            c0937w.f10160g = this.f4789r.f() + iL;
            c0937w.f10159f = -iL2;
        } else {
            c0937w.f10159f = this.f4789r.k() - iL2;
            c0937w.f10160g = this.f4789r.g() + iL;
        }
        c0937w.h = false;
        c0937w.f10154a = true;
        if (this.f4789r.i() == 0 && this.f4789r.f() == 0) {
            z4 = true;
        }
        c0937w.i = z4;
    }

    @Override // t0.c0
    public final PointF a(int i) {
        int iY0 = y0(i);
        PointF pointF = new PointF();
        if (iY0 == 0) {
            return null;
        }
        if (this.f4791t == 0) {
            pointF.x = iY0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iY0;
        }
        return pointF;
    }

    @Override // t0.AbstractC0910Q
    public final void a0(d0 d0Var) {
        this.f4797z = -1;
        this.f4777A = Integer.MIN_VALUE;
        this.f4782F = null;
        this.f4783H.a();
    }

    public final void a1(o0 o0Var, int i, int i5) {
        int i6 = o0Var.f10093d;
        int i7 = o0Var.f10094e;
        if (i != -1) {
            int i8 = o0Var.f10092c;
            if (i8 == Integer.MIN_VALUE) {
                o0Var.a();
                i8 = o0Var.f10092c;
            }
            if (i8 - i6 >= i5) {
                this.f4796y.set(i7, false);
                return;
            }
            return;
        }
        int i9 = o0Var.f10091b;
        if (i9 == Integer.MIN_VALUE) {
            View view = (View) o0Var.f10090a.get(0);
            l0 l0Var = (l0) view.getLayoutParams();
            o0Var.f10091b = o0Var.f10095f.f4789r.e(view);
            l0Var.getClass();
            i9 = o0Var.f10091b;
        }
        if (i9 + i6 <= i5) {
            this.f4796y.set(i7, false);
        }
    }

    @Override // t0.AbstractC0910Q
    public final void b0(Parcelable parcelable) {
        if (parcelable instanceof n0) {
            this.f4782F = (n0) parcelable;
            j0();
        }
    }

    @Override // t0.AbstractC0910Q
    public final void c(String str) {
        if (this.f4782F == null) {
            super.c(str);
        }
    }

    @Override // t0.AbstractC0910Q
    public final Parcelable c0() {
        int iH;
        int iK;
        int[] iArr;
        n0 n0Var = this.f4782F;
        if (n0Var != null) {
            n0 n0Var2 = new n0();
            n0Var2.f10078c = n0Var.f10078c;
            n0Var2.f10076a = n0Var.f10076a;
            n0Var2.f10077b = n0Var.f10077b;
            n0Var2.f10079d = n0Var.f10079d;
            n0Var2.f10080e = n0Var.f10080e;
            n0Var2.f10081f = n0Var.f10081f;
            n0Var2.f10083l = n0Var.f10083l;
            n0Var2.f10084m = n0Var.f10084m;
            n0Var2.f10085n = n0Var.f10085n;
            n0Var2.f10082k = n0Var.f10082k;
            return n0Var2;
        }
        n0 n0Var3 = new n0();
        n0Var3.f10083l = this.f4794w;
        n0Var3.f10084m = this.f4780D;
        n0Var3.f10085n = this.f4781E;
        l lVar = this.f4778B;
        if (lVar == null || (iArr = (int[]) lVar.f2867b) == null) {
            n0Var3.f10080e = 0;
        } else {
            n0Var3.f10081f = iArr;
            n0Var3.f10080e = iArr.length;
            n0Var3.f10082k = (ArrayList) lVar.f2868c;
        }
        if (v() > 0) {
            n0Var3.f10076a = this.f4780D ? J0() : I0();
            View viewE0 = this.f4795x ? E0(true) : F0(true);
            n0Var3.f10077b = viewE0 != null ? AbstractC0910Q.F(viewE0) : -1;
            int i = this.f4787p;
            n0Var3.f10078c = i;
            n0Var3.f10079d = new int[i];
            for (int i5 = 0; i5 < this.f4787p; i5++) {
                if (this.f4780D) {
                    iH = this.f4788q[i5].f(Integer.MIN_VALUE);
                    if (iH != Integer.MIN_VALUE) {
                        iK = this.f4789r.g();
                        iH -= iK;
                    }
                } else {
                    iH = this.f4788q[i5].h(Integer.MIN_VALUE);
                    if (iH != Integer.MIN_VALUE) {
                        iK = this.f4789r.k();
                        iH -= iK;
                    }
                }
                n0Var3.f10079d[i5] = iH;
            }
        } else {
            n0Var3.f10076a = -1;
            n0Var3.f10077b = -1;
            n0Var3.f10078c = 0;
        }
        return n0Var3;
    }

    @Override // t0.AbstractC0910Q
    public final boolean d() {
        return this.f4791t == 0;
    }

    @Override // t0.AbstractC0910Q
    public final void d0(int i) {
        if (i == 0) {
            z0();
        }
    }

    @Override // t0.AbstractC0910Q
    public final boolean e() {
        return this.f4791t == 1;
    }

    @Override // t0.AbstractC0910Q
    public final boolean f(C0911S c0911s) {
        return c0911s instanceof l0;
    }

    @Override // t0.AbstractC0910Q
    public final void h(int i, int i5, d0 d0Var, C0208k c0208k) {
        C0937w c0937w;
        int iF;
        int iH;
        if (this.f4791t != 0) {
            i = i5;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        S0(i, d0Var);
        int[] iArr = this.f4785J;
        if (iArr == null || iArr.length < this.f4787p) {
            this.f4785J = new int[this.f4787p];
        }
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = this.f4787p;
            c0937w = this.f4793v;
            if (i6 >= i8) {
                break;
            }
            if (c0937w.f10157d == -1) {
                iF = c0937w.f10159f;
                iH = this.f4788q[i6].h(iF);
            } else {
                iF = this.f4788q[i6].f(c0937w.f10160g);
                iH = c0937w.f10160g;
            }
            int i9 = iF - iH;
            if (i9 >= 0) {
                this.f4785J[i7] = i9;
                i7++;
            }
            i6++;
        }
        Arrays.sort(this.f4785J, 0, i7);
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = c0937w.f10156c;
            if (i11 < 0 || i11 >= d0Var.b()) {
                return;
            }
            c0208k.a(c0937w.f10156c, this.f4785J[i10]);
            c0937w.f10156c += c0937w.f10157d;
        }
    }

    @Override // t0.AbstractC0910Q
    public final int j(d0 d0Var) {
        return A0(d0Var);
    }

    @Override // t0.AbstractC0910Q
    public final int k(d0 d0Var) {
        return B0(d0Var);
    }

    @Override // t0.AbstractC0910Q
    public final int k0(int i, X x3, d0 d0Var) {
        return X0(i, x3, d0Var);
    }

    @Override // t0.AbstractC0910Q
    public final int l(d0 d0Var) {
        return C0(d0Var);
    }

    @Override // t0.AbstractC0910Q
    public final void l0(int i) {
        n0 n0Var = this.f4782F;
        if (n0Var != null && n0Var.f10076a != i) {
            n0Var.f10079d = null;
            n0Var.f10078c = 0;
            n0Var.f10076a = -1;
            n0Var.f10077b = -1;
        }
        this.f4797z = i;
        this.f4777A = Integer.MIN_VALUE;
        j0();
    }

    @Override // t0.AbstractC0910Q
    public final int m(d0 d0Var) {
        return A0(d0Var);
    }

    @Override // t0.AbstractC0910Q
    public final int m0(int i, X x3, d0 d0Var) {
        return X0(i, x3, d0Var);
    }

    @Override // t0.AbstractC0910Q
    public final int n(d0 d0Var) {
        return B0(d0Var);
    }

    @Override // t0.AbstractC0910Q
    public final int o(d0 d0Var) {
        return C0(d0Var);
    }

    @Override // t0.AbstractC0910Q
    public final void p0(Rect rect, int i, int i5) {
        int iG;
        int iG2;
        int i6 = this.f4787p;
        int iD = D() + C();
        int iB = B() + E();
        if (this.f4791t == 1) {
            int iHeight = rect.height() + iB;
            RecyclerView recyclerView = this.f9915b;
            WeakHashMap weakHashMap = S.f2363a;
            iG2 = AbstractC0910Q.g(i5, iHeight, B.d(recyclerView));
            iG = AbstractC0910Q.g(i, (this.f4792u * i6) + iD, B.e(this.f9915b));
        } else {
            int iWidth = rect.width() + iD;
            RecyclerView recyclerView2 = this.f9915b;
            WeakHashMap weakHashMap2 = S.f2363a;
            iG = AbstractC0910Q.g(i, iWidth, B.e(recyclerView2));
            iG2 = AbstractC0910Q.g(i5, (this.f4792u * i6) + iB, B.d(this.f9915b));
        }
        this.f9915b.setMeasuredDimension(iG, iG2);
    }

    @Override // t0.AbstractC0910Q
    public final C0911S r() {
        return this.f4791t == 0 ? new l0(-2, -1) : new l0(-1, -2);
    }

    @Override // t0.AbstractC0910Q
    public final C0911S s(Context context, AttributeSet attributeSet) {
        return new l0(context, attributeSet);
    }

    @Override // t0.AbstractC0910Q
    public final C0911S t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new l0((ViewGroup.MarginLayoutParams) layoutParams) : new l0(layoutParams);
    }

    @Override // t0.AbstractC0910Q
    public final void v0(RecyclerView recyclerView, int i) {
        C0895B c0895b = new C0895B(recyclerView.getContext());
        c0895b.f9875a = i;
        w0(c0895b);
    }

    @Override // t0.AbstractC0910Q
    public final int x(X x3, d0 d0Var) {
        return this.f4791t == 1 ? this.f4787p : super.x(x3, d0Var);
    }

    @Override // t0.AbstractC0910Q
    public final boolean x0() {
        return this.f4782F == null;
    }

    public final int y0(int i) {
        if (v() == 0) {
            return this.f4795x ? 1 : -1;
        }
        return (i < I0()) != this.f4795x ? -1 : 1;
    }

    public final boolean z0() {
        int iI0;
        if (v() != 0 && this.f4779C != 0 && this.f9920g) {
            if (this.f4795x) {
                iI0 = J0();
                I0();
            } else {
                iI0 = I0();
                J0();
            }
            l lVar = this.f4778B;
            if (iI0 == 0 && N0() != null) {
                int[] iArr = (int[]) lVar.f2867b;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                lVar.f2868c = null;
                this.f9919f = true;
                j0();
                return true;
            }
        }
        return false;
    }
}
