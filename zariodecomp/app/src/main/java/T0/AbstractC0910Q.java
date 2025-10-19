package t0;

import A2.C0009i;
import B3.C0043g;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.datastore.preferences.protobuf.C0208k;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import s0.AbstractC0864a;

/* renamed from: t0.Q, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\Q.smali */
public abstract class AbstractC0910Q {

    /* renamed from: a, reason: collision with root package name */
    public C0009i f9914a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f9915b;

    /* renamed from: c, reason: collision with root package name */
    public final S0.v f9916c;

    /* renamed from: d, reason: collision with root package name */
    public final S0.v f9917d;

    /* renamed from: e, reason: collision with root package name */
    public C0895B f9918e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9919f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9920g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public int f9921j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9922k;

    /* renamed from: l, reason: collision with root package name */
    public int f9923l;

    /* renamed from: m, reason: collision with root package name */
    public int f9924m;

    /* renamed from: n, reason: collision with root package name */
    public int f9925n;

    /* renamed from: o, reason: collision with root package name */
    public int f9926o;

    public AbstractC0910Q() {
        C0908O c0908o = new C0908O(this);
        g1.i iVar = new g1.i(this, 27);
        this.f9916c = new S0.v(c0908o);
        this.f9917d = new S0.v(iVar);
        this.f9919f = false;
        this.f9920g = false;
        this.h = true;
        this.i = true;
    }

    public static int F(View view) {
        return ((C0911S) view.getLayoutParams()).f9927a.b();
    }

    public static C0909P G(Context context, AttributeSet attributeSet, int i, int i5) {
        C0909P c0909p = new C0909P();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0864a.f9667a, i, i5);
        c0909p.f9910a = typedArrayObtainStyledAttributes.getInt(0, 1);
        c0909p.f9911b = typedArrayObtainStyledAttributes.getInt(10, 1);
        c0909p.f9912c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c0909p.f9913d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c0909p;
    }

    public static boolean K(int i, int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        if (i6 > 0 && i != i6) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static void L(View view, int i, int i5, int i6, int i7) {
        C0911S c0911s = (C0911S) view.getLayoutParams();
        Rect rect = c0911s.f9928b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c0911s).leftMargin, i5 + rect.top + ((ViewGroup.MarginLayoutParams) c0911s).topMargin, (i6 - rect.right) - ((ViewGroup.MarginLayoutParams) c0911s).rightMargin, (i7 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0911s).bottomMargin);
    }

    public static int g(int i, int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i5, i6) : size : Math.min(size, Math.max(i5, i6));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int w(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            int r4 = r4 - r6
            r6 = 0
            int r4 = java.lang.Math.max(r6, r4)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L1d
            if (r7 < 0) goto L12
        L10:
            r5 = r3
            goto L30
        L12:
            if (r7 != r1) goto L1a
            if (r5 == r2) goto L22
            if (r5 == 0) goto L1a
            if (r5 == r3) goto L22
        L1a:
            r5 = r6
            r7 = r5
            goto L30
        L1d:
            if (r7 < 0) goto L20
            goto L10
        L20:
            if (r7 != r1) goto L24
        L22:
            r7 = r4
            goto L30
        L24:
            if (r7 != r0) goto L1a
            if (r5 == r2) goto L2e
            if (r5 != r3) goto L2b
            goto L2e
        L2b:
            r7 = r4
            r5 = r6
            goto L30
        L2e:
            r7 = r4
            r5 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.AbstractC0910Q.w(int, int, int, int, boolean):int");
    }

    public final int A() {
        RecyclerView recyclerView = this.f9915b;
        WeakHashMap weakHashMap = M.S.f2363a;
        return M.C.d(recyclerView);
    }

    public final int B() {
        RecyclerView recyclerView = this.f9915b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f9915b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int D() {
        RecyclerView recyclerView = this.f9915b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f9915b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int H(X x3, d0 d0Var) {
        RecyclerView recyclerView = this.f9915b;
        if (recyclerView == null || recyclerView.f4757p == null || !e()) {
            return 1;
        }
        return this.f9915b.f4757p.a();
    }

    public final void I(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((C0911S) view.getLayoutParams()).f9928b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f9915b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f9915b.f4755o;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public boolean J() {
        return false;
    }

    public void M(int i) {
        RecyclerView recyclerView = this.f9915b;
        if (recyclerView != null) {
            int iE = recyclerView.f4739e.E();
            for (int i5 = 0; i5 < iE; i5++) {
                recyclerView.f4739e.D(i5).offsetLeftAndRight(i);
            }
        }
    }

    public void N(int i) {
        RecyclerView recyclerView = this.f9915b;
        if (recyclerView != null) {
            int iE = recyclerView.f4739e.E();
            for (int i5 = 0; i5 < iE; i5++) {
                recyclerView.f4739e.D(i5).offsetTopAndBottom(i);
            }
        }
    }

    public void O(RecyclerView recyclerView) {
    }

    public abstract void P(RecyclerView recyclerView);

    public abstract View Q(View view, int i, X x3, d0 d0Var);

    public void R(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f9915b;
        X x3 = recyclerView.f4733b;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z4 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f9915b.canScrollVertically(-1) && !this.f9915b.canScrollHorizontally(-1) && !this.f9915b.canScrollHorizontally(1)) {
            z4 = false;
        }
        accessibilityEvent.setScrollable(z4);
        AbstractC0902I abstractC0902I = this.f9915b.f4757p;
        if (abstractC0902I != null) {
            accessibilityEvent.setItemCount(abstractC0902I.a());
        }
    }

    public final void S(View view, N.o oVar) {
        g0 g0VarI = RecyclerView.I(view);
        if (g0VarI == null || g0VarI.i() || ((ArrayList) this.f9914a.f206d).contains(g0VarI.f10004a)) {
            return;
        }
        RecyclerView recyclerView = this.f9915b;
        T(recyclerView.f4733b, recyclerView.f4745i0, view, oVar);
    }

    public void T(X x3, d0 d0Var, View view, N.o oVar) {
        oVar.h(N.n.a(e() ? F(view) : 0, 1, d() ? F(view) : 0, 1, false));
    }

    public void U(int i, int i5) {
    }

    public void V() {
    }

    public void W(int i, int i5) {
    }

    public void X(int i, int i5) {
    }

    public void Y(int i, int i5) {
    }

    public abstract void Z(X x3, d0 d0Var);

    public abstract void a0(d0 d0Var);

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.view.View r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.AbstractC0910Q.b(android.view.View, int, boolean):void");
    }

    public void b0(Parcelable parcelable) {
    }

    public void c(String str) {
        RecyclerView recyclerView = this.f9915b;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public Parcelable c0() {
        return null;
    }

    public abstract boolean d();

    public void d0(int i) {
    }

    public abstract boolean e();

    public final void e0(X x3) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            if (!RecyclerView.I(u(iV)).p()) {
                View viewU = u(iV);
                h0(iV);
                x3.f(viewU);
            }
        }
    }

    public boolean f(C0911S c0911s) {
        return c0911s != null;
    }

    public final void f0(X x3) {
        ArrayList arrayList;
        int size = x3.f9937a.size();
        int i = size - 1;
        while (true) {
            arrayList = x3.f9937a;
            if (i < 0) {
                break;
            }
            View view = ((g0) arrayList.get(i)).f10004a;
            g0 g0VarI = RecyclerView.I(view);
            if (!g0VarI.p()) {
                g0VarI.o(false);
                if (g0VarI.k()) {
                    this.f9915b.removeDetachedView(view, false);
                }
                AbstractC0906M abstractC0906M = this.f9915b.f4721N;
                if (abstractC0906M != null) {
                    abstractC0906M.d(g0VarI);
                }
                g0VarI.o(true);
                g0 g0VarI2 = RecyclerView.I(view);
                g0VarI2.f10015n = null;
                g0VarI2.f10016o = false;
                g0VarI2.f10011j &= -33;
                x3.g(g0VarI2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = x3.f9938b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f9915b.invalidate();
        }
    }

    public final void g0(View view, X x3) {
        C0009i c0009i = this.f9914a;
        K2.c cVar = (K2.c) c0009i.f204b;
        int iIndexOfChild = ((RecyclerView) cVar.b).indexOfChild(view);
        if (iIndexOfChild >= 0) {
            if (((C0043g) c0009i.f205c).f(iIndexOfChild)) {
                c0009i.j0(view);
            }
            cVar.u(iIndexOfChild);
        }
        x3.f(view);
    }

    public void h(int i, int i5, d0 d0Var, C0208k c0208k) {
    }

    public final void h0(int i) {
        if (u(i) != null) {
            C0009i c0009i = this.f9914a;
            int iN = c0009i.N(i);
            K2.c cVar = (K2.c) c0009i.f204b;
            View childAt = ((RecyclerView) cVar.b).getChildAt(iN);
            if (childAt == null) {
                return;
            }
            if (((C0043g) c0009i.f205c).f(iN)) {
                c0009i.j0(childAt);
            }
            cVar.u(iN);
        }
    }

    public void i(int i, C0208k c0208k) {
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean i0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.C()
            int r1 = r8.E()
            int r2 = r8.f9925n
            int r3 = r8.D()
            int r2 = r2 - r3
            int r3 = r8.f9926o
            int r4 = r8.B()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.A()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lae
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7c
            goto Lb3
        L7c:
            int r1 = r8.C()
            int r2 = r8.E()
            int r3 = r8.f9925n
            int r4 = r8.D()
            int r3 = r3 - r4
            int r4 = r8.f9926o
            int r5 = r8.B()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f9915b
            android.graphics.Rect r5 = r5.f4751m
            r8.y(r13, r5)
            int r8 = r5.left
            int r8 = r8 - r11
            if (r8 >= r3) goto Lb3
            int r8 = r5.right
            int r8 = r8 - r11
            if (r8 <= r1) goto Lb3
            int r8 = r5.top
            int r8 = r8 - r10
            if (r8 >= r4) goto Lb3
            int r8 = r5.bottom
            int r8 = r8 - r10
            if (r8 > r2) goto Lae
            goto Lb3
        Lae:
            if (r11 != 0) goto Lb4
            if (r10 == 0) goto Lb3
            goto Lb4
        Lb3:
            return r0
        Lb4:
            if (r12 == 0) goto Lba
            r9.scrollBy(r11, r10)
            goto Lbd
        Lba:
            r9.b0(r11, r10, r0)
        Lbd:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.AbstractC0910Q.i0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int j(d0 d0Var);

    public final void j0() {
        RecyclerView recyclerView = this.f9915b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int k(d0 d0Var);

    public abstract int k0(int i, X x3, d0 d0Var);

    public abstract int l(d0 d0Var);

    public abstract void l0(int i);

    public abstract int m(d0 d0Var);

    public abstract int m0(int i, X x3, d0 d0Var);

    public abstract int n(d0 d0Var);

    public final void n0(RecyclerView recyclerView) {
        o0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract int o(d0 d0Var);

    public final void o0(int i, int i5) {
        this.f9925n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f9923l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.f4707y0;
        }
        this.f9926o = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i5);
        this.f9924m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.f4707y0;
        }
    }

    public final void p(X x3) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            g0 g0VarI = RecyclerView.I(viewU);
            if (!g0VarI.p()) {
                if (!g0VarI.g() || g0VarI.i() || this.f9915b.f4757p.f9902b) {
                    u(iV);
                    this.f9914a.A(iV);
                    x3.h(viewU);
                    this.f9915b.f4741f.q(g0VarI);
                } else {
                    h0(iV);
                    x3.g(g0VarI);
                }
            }
        }
    }

    public void p0(Rect rect, int i, int i5) {
        int iD = D() + C() + rect.width();
        int iB = B() + E() + rect.height();
        RecyclerView recyclerView = this.f9915b;
        WeakHashMap weakHashMap = M.S.f2363a;
        this.f9915b.setMeasuredDimension(g(i, iD, M.B.e(recyclerView)), g(i5, iB, M.B.d(this.f9915b)));
    }

    public View q(int i) {
        int iV = v();
        for (int i5 = 0; i5 < iV; i5++) {
            View viewU = u(i5);
            g0 g0VarI = RecyclerView.I(viewU);
            if (g0VarI != null && g0VarI.b() == i && !g0VarI.p() && (this.f9915b.f4745i0.f9978g || !g0VarI.i())) {
                return viewU;
            }
        }
        return null;
    }

    public final void q0(int i, int i5) {
        int iV = v();
        if (iV == 0) {
            this.f9915b.n(i, i5);
            return;
        }
        int i6 = Integer.MIN_VALUE;
        int i7 = Integer.MAX_VALUE;
        int i8 = Integer.MIN_VALUE;
        int i9 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < iV; i10++) {
            View viewU = u(i10);
            Rect rect = this.f9915b.f4751m;
            y(viewU, rect);
            int i11 = rect.left;
            if (i11 < i9) {
                i9 = i11;
            }
            int i12 = rect.right;
            if (i12 > i6) {
                i6 = i12;
            }
            int i13 = rect.top;
            if (i13 < i7) {
                i7 = i13;
            }
            int i14 = rect.bottom;
            if (i14 > i8) {
                i8 = i14;
            }
        }
        this.f9915b.f4751m.set(i9, i7, i6, i8);
        p0(this.f9915b.f4751m, i, i5);
    }

    public abstract C0911S r();

    public final void r0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f9915b = null;
            this.f9914a = null;
            this.f9925n = 0;
            this.f9926o = 0;
        } else {
            this.f9915b = recyclerView;
            this.f9914a = recyclerView.f4739e;
            this.f9925n = recyclerView.getWidth();
            this.f9926o = recyclerView.getHeight();
        }
        this.f9923l = 1073741824;
        this.f9924m = 1073741824;
    }

    public C0911S s(Context context, AttributeSet attributeSet) {
        return new C0911S(context, attributeSet);
    }

    public final boolean s0(View view, int i, int i5, C0911S c0911s) {
        return (!view.isLayoutRequested() && this.h && K(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c0911s).width) && K(view.getHeight(), i5, ((ViewGroup.MarginLayoutParams) c0911s).height)) ? false : true;
    }

    public C0911S t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0911S ? new C0911S((C0911S) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0911S((ViewGroup.MarginLayoutParams) layoutParams) : new C0911S(layoutParams);
    }

    public boolean t0() {
        return false;
    }

    public final View u(int i) {
        C0009i c0009i = this.f9914a;
        if (c0009i != null) {
            return c0009i.D(i);
        }
        return null;
    }

    public final boolean u0(View view, int i, int i5, C0911S c0911s) {
        return (this.h && K(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c0911s).width) && K(view.getMeasuredHeight(), i5, ((ViewGroup.MarginLayoutParams) c0911s).height)) ? false : true;
    }

    public final int v() {
        C0009i c0009i = this.f9914a;
        if (c0009i != null) {
            return c0009i.E();
        }
        return 0;
    }

    public abstract void v0(RecyclerView recyclerView, int i);

    public final void w0(C0895B c0895b) {
        C0895B c0895b2 = this.f9918e;
        if (c0895b2 != null && c0895b != c0895b2 && c0895b2.f9879e) {
            c0895b2.i();
        }
        this.f9918e = c0895b;
        RecyclerView recyclerView = this.f9915b;
        f0 f0Var = recyclerView.f4742f0;
        f0Var.f9997k.removeCallbacks(f0Var);
        f0Var.f9993c.abortAnimation();
        if (c0895b.h) {
            Log.w("RecyclerView", "An instance of " + c0895b.getClass().getSimpleName() + " was started more than once. Each instance of" + c0895b.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c0895b.f9876b = recyclerView;
        c0895b.f9877c = this;
        int i = c0895b.f9875a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f4745i0.f9972a = i;
        c0895b.f9879e = true;
        c0895b.f9878d = true;
        c0895b.f9880f = recyclerView.f4759q.q(i);
        c0895b.f9876b.f4742f0.a();
        c0895b.h = true;
    }

    public int x(X x3, d0 d0Var) {
        RecyclerView recyclerView = this.f9915b;
        if (recyclerView == null || recyclerView.f4757p == null || !d()) {
            return 1;
        }
        return this.f9915b.f4757p.a();
    }

    public boolean x0() {
        return false;
    }

    public void y(View view, Rect rect) {
        int[] iArr = RecyclerView.f4707y0;
        C0911S c0911s = (C0911S) view.getLayoutParams();
        Rect rect2 = c0911s.f9928b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0911s).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0911s).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0911s).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0911s).bottomMargin);
    }

    public final int z() {
        RecyclerView recyclerView = this.f9915b;
        AbstractC0902I adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }
}
