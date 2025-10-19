package androidx.recyclerview.widget;

import A2.C0009i;
import A2.T;
import B3.C0043g;
import I.m;
import L.e;
import M.B;
import M.C0128n;
import M.H;
import M.J;
import M.S;
import M.q;
import N.b;
import S0.c;
import V.d;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.datastore.preferences.protobuf.C0208k;
import com.google.android.gms.common.api.f;
import g1.i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q.C0828e;
import q.C0834k;
import s0.AbstractC0864a;
import t0.AbstractC0902I;
import t0.AbstractC0906M;
import t0.AbstractC0907N;
import t0.AbstractC0910Q;
import t0.AbstractC0912T;
import t0.AbstractC0913U;
import t0.C0895B;
import t0.C0901H;
import t0.C0905L;
import t0.C0911S;
import t0.C0914V;
import t0.C0915W;
import t0.C0916a;
import t0.C0926l;
import t0.C0933s;
import t0.InterfaceC0904K;
import t0.RunnableC0900G;
import t0.RunnableC0935u;
import t0.X;
import t0.Y;
import t0.Z;
import t0.a0;
import t0.d0;
import t0.e0;
import t0.f0;
import t0.g0;
import t0.i0;
import t0.r0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\recyclerview\widget\RecyclerView.smali */
public class RecyclerView extends ViewGroup {

    /* renamed from: A0, reason: collision with root package name */
    public static final d f4706A0;

    /* renamed from: y0, reason: collision with root package name */
    public static final int[] f4707y0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: z0, reason: collision with root package name */
    public static final Class[] f4708z0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f4709A;

    /* renamed from: B, reason: collision with root package name */
    public int f4710B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f4711C;

    /* renamed from: D, reason: collision with root package name */
    public final AccessibilityManager f4712D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f4713E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f4714F;
    public int G;

    /* renamed from: H, reason: collision with root package name */
    public int f4715H;

    /* renamed from: I, reason: collision with root package name */
    public C0905L f4716I;

    /* renamed from: J, reason: collision with root package name */
    public EdgeEffect f4717J;

    /* renamed from: K, reason: collision with root package name */
    public EdgeEffect f4718K;

    /* renamed from: L, reason: collision with root package name */
    public EdgeEffect f4719L;

    /* renamed from: M, reason: collision with root package name */
    public EdgeEffect f4720M;

    /* renamed from: N, reason: collision with root package name */
    public AbstractC0906M f4721N;

    /* renamed from: O, reason: collision with root package name */
    public int f4722O;

    /* renamed from: P, reason: collision with root package name */
    public int f4723P;

    /* renamed from: Q, reason: collision with root package name */
    public VelocityTracker f4724Q;

    /* renamed from: R, reason: collision with root package name */
    public int f4725R;

    /* renamed from: S, reason: collision with root package name */
    public int f4726S;

    /* renamed from: T, reason: collision with root package name */
    public int f4727T;

    /* renamed from: U, reason: collision with root package name */
    public int f4728U;

    /* renamed from: V, reason: collision with root package name */
    public int f4729V;

    /* renamed from: W, reason: collision with root package name */
    public AbstractC0912T f4730W;

    /* renamed from: a, reason: collision with root package name */
    public final Z f4731a;

    /* renamed from: a0, reason: collision with root package name */
    public final int f4732a0;

    /* renamed from: b, reason: collision with root package name */
    public final X f4733b;

    /* renamed from: b0, reason: collision with root package name */
    public final int f4734b0;

    /* renamed from: c, reason: collision with root package name */
    public a0 f4735c;

    /* renamed from: c0, reason: collision with root package name */
    public final float f4736c0;

    /* renamed from: d, reason: collision with root package name */
    public final T f4737d;

    /* renamed from: d0, reason: collision with root package name */
    public final float f4738d0;

    /* renamed from: e, reason: collision with root package name */
    public final C0009i f4739e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f4740e0;

    /* renamed from: f, reason: collision with root package name */
    public final c f4741f;

    /* renamed from: f0, reason: collision with root package name */
    public final f0 f4742f0;

    /* renamed from: g0, reason: collision with root package name */
    public RunnableC0935u f4743g0;

    /* renamed from: h0, reason: collision with root package name */
    public final C0208k f4744h0;

    /* renamed from: i0, reason: collision with root package name */
    public final d0 f4745i0;

    /* renamed from: j0, reason: collision with root package name */
    public AbstractC0913U f4746j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4747k;

    /* renamed from: k0, reason: collision with root package name */
    public ArrayList f4748k0;

    /* renamed from: l, reason: collision with root package name */
    public final RunnableC0900G f4749l;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f4750l0;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f4751m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f4752m0;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f4753n;

    /* renamed from: n0, reason: collision with root package name */
    public final C0901H f4754n0;

    /* renamed from: o, reason: collision with root package name */
    public final RectF f4755o;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f4756o0;

    /* renamed from: p, reason: collision with root package name */
    public AbstractC0902I f4757p;

    /* renamed from: p0, reason: collision with root package name */
    public i0 f4758p0;

    /* renamed from: q, reason: collision with root package name */
    public AbstractC0910Q f4759q;

    /* renamed from: q0, reason: collision with root package name */
    public final int[] f4760q0;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f4761r;

    /* renamed from: r0, reason: collision with root package name */
    public C0128n f4762r0;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f4763s;

    /* renamed from: s0, reason: collision with root package name */
    public final int[] f4764s0;

    /* renamed from: t, reason: collision with root package name */
    public C0933s f4765t;

    /* renamed from: t0, reason: collision with root package name */
    public final int[] f4766t0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4767u;

    /* renamed from: u0, reason: collision with root package name */
    public final int[] f4768u0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4769v;

    /* renamed from: v0, reason: collision with root package name */
    public final ArrayList f4770v0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4771w;

    /* renamed from: w0, reason: collision with root package name */
    public final RunnableC0900G f4772w0;

    /* renamed from: x, reason: collision with root package name */
    public int f4773x;

    /* renamed from: x0, reason: collision with root package name */
    public final C0901H f4774x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f4775y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4776z;

    static {
        Class cls = Integer.TYPE;
        f4708z0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f4706A0 = new d(1);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130903931);
    }

    public static RecyclerView D(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewD = D(viewGroup.getChildAt(i));
            if (recyclerViewD != null) {
                return recyclerViewD;
            }
        }
        return null;
    }

    public static g0 I(View view) {
        if (view == null) {
            return null;
        }
        return ((C0911S) view.getLayoutParams()).f9927a;
    }

    private C0128n getScrollingChildHelper() {
        if (this.f4762r0 == null) {
            this.f4762r0 = new C0128n(this);
        }
        return this.f4762r0;
    }

    public static void j(g0 g0Var) {
        WeakReference weakReference = g0Var.f10005b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == g0Var.f10004a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            g0Var.f10005b = null;
        }
    }

    public final View A(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean B(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.f4763s
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r1.get(r4)
            t0.s r5 = (t0.C0933s) r5
            int r6 = r5.f10136v
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L59
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.e(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.d(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L61
            if (r6 != 0) goto L3c
            if (r9 == 0) goto L61
        L3c:
            if (r9 == 0) goto L49
            r5.f10137w = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f10130p = r6
            goto L55
        L49:
            if (r6 == 0) goto L55
            r5.f10137w = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f10127m = r6
        L55:
            r5.g(r8)
            goto L5b
        L59:
            if (r6 != r8) goto L61
        L5b:
            r6 = 3
            if (r0 == r6) goto L61
            r11.f4765t = r5
            return r7
        L61:
            int r4 = r4 + 1
            goto Lc
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.B(android.view.MotionEvent):boolean");
    }

    public final void C(int[] iArr) {
        int iE = this.f4739e.E();
        if (iE == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = f.API_PRIORITY_OTHER;
        int i5 = Integer.MIN_VALUE;
        for (int i6 = 0; i6 < iE; i6++) {
            g0 g0VarI = I(this.f4739e.D(i6));
            if (!g0VarI.p()) {
                int iB = g0VarI.b();
                if (iB < i) {
                    i = iB;
                }
                if (iB > i5) {
                    i5 = iB;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i5;
    }

    public final g0 E(int i) {
        g0 g0Var = null;
        if (this.f4713E) {
            return null;
        }
        int iQ = this.f4739e.Q();
        for (int i5 = 0; i5 < iQ; i5++) {
            g0 g0VarI = I(this.f4739e.P(i5));
            if (g0VarI != null && !g0VarI.i() && F(g0VarI) == i) {
                if (!((ArrayList) this.f4739e.f206d).contains(g0VarI.f10004a)) {
                    return g0VarI;
                }
                g0Var = g0VarI;
            }
        }
        return g0Var;
    }

    public final int F(g0 g0Var) {
        if (g0Var.d(524) || !g0Var.f()) {
            return -1;
        }
        T t4 = this.f4737d;
        int i = g0Var.f10006c;
        ArrayList arrayList = (ArrayList) t4.f136d;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            C0916a c0916a = (C0916a) arrayList.get(i5);
            int i6 = c0916a.f9945a;
            if (i6 != 1) {
                if (i6 == 2) {
                    int i7 = c0916a.f9946b;
                    if (i7 <= i) {
                        int i8 = c0916a.f9948d;
                        if (i7 + i8 > i) {
                            return -1;
                        }
                        i -= i8;
                    } else {
                        continue;
                    }
                } else if (i6 == 8) {
                    int i9 = c0916a.f9946b;
                    if (i9 == i) {
                        i = c0916a.f9948d;
                    } else {
                        if (i9 < i) {
                            i--;
                        }
                        if (c0916a.f9948d <= i) {
                            i++;
                        }
                    }
                }
            } else if (c0916a.f9946b <= i) {
                i += c0916a.f9948d;
            }
        }
        return i;
    }

    public final long G(g0 g0Var) {
        return this.f4757p.f9902b ? g0Var.f10008e : g0Var.f10006c;
    }

    public final g0 H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return I(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect J(View view) {
        C0911S c0911s = (C0911S) view.getLayoutParams();
        boolean z4 = c0911s.f9929c;
        Rect rect = c0911s.f9928b;
        if (!z4) {
            return rect;
        }
        d0 d0Var = this.f4745i0;
        if (d0Var.f9978g && (c0911s.f9927a.l() || c0911s.f9927a.g())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f4761r;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.f4751m;
            rect2.set(0, 0, 0, 0);
            ((AbstractC0907N) arrayList.get(i)).a(rect2, view, this, d0Var);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c0911s.f9929c = false;
        return rect;
    }

    public final boolean K() {
        return !this.f4771w || this.f4713E || this.f4737d.y();
    }

    public final boolean L() {
        return this.G > 0;
    }

    public final void M(int i) {
        if (this.f4759q == null) {
            return;
        }
        setScrollState(2);
        this.f4759q.l0(i);
        awakenScrollBars();
    }

    public final void N() {
        int iQ = this.f4739e.Q();
        for (int i = 0; i < iQ; i++) {
            ((C0911S) this.f4739e.P(i).getLayoutParams()).f9929c = true;
        }
        ArrayList arrayList = this.f4733b.f9939c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            C0911S c0911s = (C0911S) ((g0) arrayList.get(i5)).f10004a.getLayoutParams();
            if (c0911s != null) {
                c0911s.f9929c = true;
            }
        }
    }

    public final void O(int i, int i5, boolean z4) {
        int i6 = i + i5;
        int iQ = this.f4739e.Q();
        for (int i7 = 0; i7 < iQ; i7++) {
            g0 g0VarI = I(this.f4739e.P(i7));
            if (g0VarI != null && !g0VarI.p()) {
                int i8 = g0VarI.f10006c;
                d0 d0Var = this.f4745i0;
                if (i8 >= i6) {
                    g0VarI.m(-i5, z4);
                    d0Var.f9977f = true;
                } else if (i8 >= i) {
                    g0VarI.a(8);
                    g0VarI.m(-i5, z4);
                    g0VarI.f10006c = i - 1;
                    d0Var.f9977f = true;
                }
            }
        }
        X x3 = this.f4733b;
        ArrayList arrayList = x3.f9939c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g0 g0Var = (g0) arrayList.get(size);
            if (g0Var != null) {
                int i9 = g0Var.f10006c;
                if (i9 >= i6) {
                    g0Var.m(-i5, z4);
                } else if (i9 >= i) {
                    g0Var.a(8);
                    x3.e(size);
                }
            }
        }
        requestLayout();
    }

    public final void P() {
        this.G++;
    }

    public final void Q(boolean z4) {
        int i;
        AccessibilityManager accessibilityManager;
        int i5 = this.G - 1;
        this.G = i5;
        if (i5 < 1) {
            this.G = 0;
            if (z4) {
                int i6 = this.f4710B;
                this.f4710B = 0;
                if (i6 != 0 && (accessibilityManager = this.f4712D) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    b.b(accessibilityEventObtain, i6);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f4770v0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    g0 g0Var = (g0) arrayList.get(size);
                    if (g0Var.f10004a.getParent() == this && !g0Var.p() && (i = g0Var.f10018q) != -1) {
                        WeakHashMap weakHashMap = S.f2363a;
                        B.s(g0Var.f10004a, i);
                        g0Var.f10018q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4723P) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f4723P = motionEvent.getPointerId(i);
            int x3 = (int) (motionEvent.getX(i) + 0.5f);
            this.f4727T = x3;
            this.f4725R = x3;
            int y4 = (int) (motionEvent.getY(i) + 0.5f);
            this.f4728U = y4;
            this.f4726S = y4;
        }
    }

    public final void S() {
        if (this.f4756o0 || !this.f4767u) {
            return;
        }
        WeakHashMap weakHashMap = S.f2363a;
        B.m(this, this.f4772w0);
        this.f4756o0 = true;
    }

    public final void T() {
        boolean z4;
        boolean z5 = false;
        if (this.f4713E) {
            T t4 = this.f4737d;
            t4.G((ArrayList) t4.f136d);
            t4.G((ArrayList) t4.f137e);
            t4.f135c = 0;
            if (this.f4714F) {
                this.f4759q.V();
            }
        }
        if (this.f4721N == null || !this.f4759q.x0()) {
            this.f4737d.p();
        } else {
            this.f4737d.F();
        }
        boolean z6 = this.f4750l0 || this.f4752m0;
        boolean z7 = this.f4771w && this.f4721N != null && ((z4 = this.f4713E) || z6 || this.f4759q.f9919f) && (!z4 || this.f4757p.f9902b);
        d0 d0Var = this.f4745i0;
        d0Var.f9979j = z7;
        if (z7 && z6 && !this.f4713E && this.f4721N != null && this.f4759q.x0()) {
            z5 = true;
        }
        d0Var.f9980k = z5;
    }

    public final void U(boolean z4) {
        this.f4714F = z4 | this.f4714F;
        this.f4713E = true;
        int iQ = this.f4739e.Q();
        for (int i = 0; i < iQ; i++) {
            g0 g0VarI = I(this.f4739e.P(i));
            if (g0VarI != null && !g0VarI.p()) {
                g0VarI.a(6);
            }
        }
        N();
        X x3 = this.f4733b;
        ArrayList arrayList = x3.f9939c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            g0 g0Var = (g0) arrayList.get(i5);
            if (g0Var != null) {
                g0Var.a(6);
                g0Var.a(1024);
            }
        }
        AbstractC0902I abstractC0902I = x3.h.f4757p;
        if (abstractC0902I == null || !abstractC0902I.f9902b) {
            x3.d();
        }
    }

    public final void V(g0 g0Var, q qVar) {
        g0Var.f10011j &= -8193;
        boolean z4 = this.f4745i0.h;
        c cVar = this.f4741f;
        if (z4 && g0Var.l() && !g0Var.i() && !g0Var.p()) {
            ((C0828e) cVar.f2848c).e(g0Var, G(g0Var));
        }
        C0834k c0834k = (C0834k) cVar.f2847b;
        r0 r0VarA = (r0) c0834k.getOrDefault(g0Var, null);
        if (r0VarA == null) {
            r0VarA = r0.a();
            c0834k.put(g0Var, r0VarA);
        }
        r0VarA.f10111b = qVar;
        r0VarA.f10110a |= 4;
    }

    public final void W(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f4751m;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0911S) {
            C0911S c0911s = (C0911S) layoutParams;
            if (!c0911s.f9929c) {
                int i = rect.left;
                Rect rect2 = c0911s.f9928b;
                rect.left = i - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f4759q.i0(this, view, this.f4751m, !this.f4771w, view2 == null);
    }

    public final void X() {
        VelocityTracker velocityTracker = this.f4724Q;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        e0(0);
        EdgeEffect edgeEffect = this.f4717J;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f4717J.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f4718K;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f4718K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4719L;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f4719L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4720M;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f4720M.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = S.f2363a;
            B.k(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean Y(int r19, int r20, android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Y(int, int, android.view.MotionEvent):boolean");
    }

    public final void Z(int i, int i5, int[] iArr) {
        g0 g0Var;
        c0();
        P();
        m.a("RV Scroll");
        d0 d0Var = this.f4745i0;
        z(d0Var);
        X x3 = this.f4733b;
        int iK0 = i != 0 ? this.f4759q.k0(i, x3, d0Var) : 0;
        int iM0 = i5 != 0 ? this.f4759q.m0(i5, x3, d0Var) : 0;
        m.b();
        int iE = this.f4739e.E();
        for (int i6 = 0; i6 < iE; i6++) {
            View viewD = this.f4739e.D(i6);
            g0 g0VarH = H(viewD);
            if (g0VarH != null && (g0Var = g0VarH.i) != null) {
                int left = viewD.getLeft();
                int top = viewD.getTop();
                View view = g0Var.f10004a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Q(true);
        d0(false);
        if (iArr != null) {
            iArr[0] = iK0;
            iArr[1] = iM0;
        }
    }

    public final void a0(int i) {
        C0895B c0895b;
        if (this.f4776z) {
            return;
        }
        setScrollState(0);
        f0 f0Var = this.f4742f0;
        f0Var.f9997k.removeCallbacks(f0Var);
        f0Var.f9993c.abortAnimation();
        AbstractC0910Q abstractC0910Q = this.f4759q;
        if (abstractC0910Q != null && (c0895b = abstractC0910Q.f9918e) != null) {
            c0895b.i();
        }
        AbstractC0910Q abstractC0910Q2 = this.f4759q;
        if (abstractC0910Q2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0910Q2.l0(i);
            awakenScrollBars();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i5) {
        AbstractC0910Q abstractC0910Q = this.f4759q;
        if (abstractC0910Q != null) {
            abstractC0910Q.getClass();
        }
        super.addFocusables(arrayList, i, i5);
    }

    public final void b0(int i, int i5, boolean z4) {
        AbstractC0910Q abstractC0910Q = this.f4759q;
        if (abstractC0910Q == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f4776z) {
            return;
        }
        if (!abstractC0910Q.d()) {
            i = 0;
        }
        if (!this.f4759q.e()) {
            i5 = 0;
        }
        if (i == 0 && i5 == 0) {
            return;
        }
        if (z4) {
            int i6 = i != 0 ? 1 : 0;
            if (i5 != 0) {
                i6 |= 2;
            }
            getScrollingChildHelper().g(i6, 1);
        }
        this.f4742f0.b(i, i5, Integer.MIN_VALUE, null);
    }

    public final void c0() {
        int i = this.f4773x + 1;
        this.f4773x = i;
        if (i != 1 || this.f4776z) {
            return;
        }
        this.f4775y = false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0911S) && this.f4759q.f((C0911S) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC0910Q abstractC0910Q = this.f4759q;
        if (abstractC0910Q != null && abstractC0910Q.d()) {
            return this.f4759q.j(this.f4745i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC0910Q abstractC0910Q = this.f4759q;
        if (abstractC0910Q != null && abstractC0910Q.d()) {
            return this.f4759q.k(this.f4745i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC0910Q abstractC0910Q = this.f4759q;
        if (abstractC0910Q != null && abstractC0910Q.d()) {
            return this.f4759q.l(this.f4745i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC0910Q abstractC0910Q = this.f4759q;
        if (abstractC0910Q != null && abstractC0910Q.e()) {
            return this.f4759q.m(this.f4745i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC0910Q abstractC0910Q = this.f4759q;
        if (abstractC0910Q != null && abstractC0910Q.e()) {
            return this.f4759q.n(this.f4745i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC0910Q abstractC0910Q = this.f4759q;
        if (abstractC0910Q != null && abstractC0910Q.e()) {
            return this.f4759q.o(this.f4745i0);
        }
        return 0;
    }

    public final void d0(boolean z4) {
        if (this.f4773x < 1) {
            this.f4773x = 1;
        }
        if (!z4 && !this.f4776z) {
            this.f4775y = false;
        }
        if (this.f4773x == 1) {
            if (z4 && this.f4775y && !this.f4776z && this.f4759q != null && this.f4757p != null) {
                o();
            }
            if (!this.f4776z) {
                this.f4775y = false;
            }
        }
        this.f4773x--;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z4) {
        return getScrollingChildHelper().a(f2, f3, z4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i5, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i5, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i5, int i6, int i7, int[] iArr) {
        return getScrollingChildHelper().d(i, i5, i6, i7, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z4;
        super.draw(canvas);
        ArrayList arrayList = this.f4761r;
        int size = arrayList.size();
        boolean z5 = false;
        for (int i = 0; i < size; i++) {
            ((AbstractC0907N) arrayList.get(i)).c(canvas, this);
        }
        EdgeEffect edgeEffect = this.f4717J;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z4 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f4747k ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f4717J;
            z4 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f4718K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f4747k) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f4718K;
            z4 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f4719L;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f4747k ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f4719L;
            z4 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f4720M;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f4747k) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f4720M;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z5 = true;
            }
            z4 |= z5;
            canvas.restoreToCount(iSave4);
        }
        if ((z4 || this.f4721N == null || arrayList.size() <= 0 || !this.f4721N.f()) ? z4 : true) {
            WeakHashMap weakHashMap = S.f2363a;
            B.k(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j5) {
        return super.drawChild(canvas, view, j5);
    }

    public final void e0(int i) {
        getScrollingChildHelper().h(i);
    }

    public final void f(g0 g0Var) {
        View view = g0Var.f10004a;
        boolean z4 = view.getParent() == this;
        this.f4733b.j(H(view));
        if (g0Var.k()) {
            this.f4739e.u(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z4) {
            this.f4739e.t(view, -1, true);
            return;
        }
        C0009i c0009i = this.f4739e;
        int iIndexOfChild = ((RecyclerView) ((K2.c) c0009i.f204b).b).indexOfChild(view);
        if (iIndexOfChild >= 0) {
            ((C0043g) c0009i.f205c).i(iIndexOfChild);
            c0009i.R(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g(AbstractC0907N abstractC0907N) {
        AbstractC0910Q abstractC0910Q = this.f4759q;
        if (abstractC0910Q != null) {
            abstractC0910Q.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f4761r;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC0907N);
        N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0910Q abstractC0910Q = this.f4759q;
        if (abstractC0910Q != null) {
            return abstractC0910Q.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0910Q abstractC0910Q = this.f4759q;
        if (abstractC0910Q != null) {
            return abstractC0910Q.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0902I getAdapter() {
        return this.f4757p;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0910Q abstractC0910Q = this.f4759q;
        if (abstractC0910Q == null) {
            return super.getBaseline();
        }
        abstractC0910Q.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i5) {
        return super.getChildDrawingOrder(i, i5);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f4747k;
    }

    public i0 getCompatAccessibilityDelegate() {
        return this.f4758p0;
    }

    public C0905L getEdgeEffectFactory() {
        return this.f4716I;
    }

    public AbstractC0906M getItemAnimator() {
        return this.f4721N;
    }

    public int getItemDecorationCount() {
        return this.f4761r.size();
    }

    public AbstractC0910Q getLayoutManager() {
        return this.f4759q;
    }

    public int getMaxFlingVelocity() {
        return this.f4734b0;
    }

    public int getMinFlingVelocity() {
        return this.f4732a0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public AbstractC0912T getOnFlingListener() {
        return this.f4730W;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f4740e0;
    }

    public C0915W getRecycledViewPool() {
        return this.f4733b.c();
    }

    public int getScrollState() {
        return this.f4722O;
    }

    public final void h(AbstractC0913U abstractC0913U) {
        if (this.f4748k0 == null) {
            this.f4748k0 = new ArrayList();
        }
        this.f4748k0.add(abstractC0913U);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(String str) {
        if (L()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + y());
        }
        if (this.f4715H > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + y()));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f4767u;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f4776z;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f2407d;
    }

    public final void k() {
        int iQ = this.f4739e.Q();
        for (int i = 0; i < iQ; i++) {
            g0 g0VarI = I(this.f4739e.P(i));
            if (!g0VarI.p()) {
                g0VarI.f10007d = -1;
                g0VarI.f10010g = -1;
            }
        }
        X x3 = this.f4733b;
        ArrayList arrayList = x3.f9939c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            g0 g0Var = (g0) arrayList.get(i5);
            g0Var.f10007d = -1;
            g0Var.f10010g = -1;
        }
        ArrayList arrayList2 = x3.f9937a;
        int size2 = arrayList2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            g0 g0Var2 = (g0) arrayList2.get(i6);
            g0Var2.f10007d = -1;
            g0Var2.f10010g = -1;
        }
        ArrayList arrayList3 = x3.f9938b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i7 = 0; i7 < size3; i7++) {
                g0 g0Var3 = (g0) x3.f9938b.get(i7);
                g0Var3.f10007d = -1;
                g0Var3.f10010g = -1;
            }
        }
    }

    public final void l(int i, int i5) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f4717J;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.f4717J.onRelease();
            zIsFinished = this.f4717J.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f4719L;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f4719L.onRelease();
            zIsFinished |= this.f4719L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4718K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i5 > 0) {
            this.f4718K.onRelease();
            zIsFinished |= this.f4718K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4720M;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i5 < 0) {
            this.f4720M.onRelease();
            zIsFinished |= this.f4720M.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = S.f2363a;
            B.k(this);
        }
    }

    public final void m() {
        if (!this.f4771w || this.f4713E) {
            m.a("RV FullInvalidate");
            o();
            m.b();
            return;
        }
        if (this.f4737d.y()) {
            T t4 = this.f4737d;
            int i = t4.f135c;
            if ((i & 4) == 0 || (i & 11) != 0) {
                if (t4.y()) {
                    m.a("RV FullInvalidate");
                    o();
                    m.b();
                    return;
                }
                return;
            }
            m.a("RV PartialInvalidate");
            c0();
            P();
            this.f4737d.F();
            if (!this.f4775y) {
                int iE = this.f4739e.E();
                int i5 = 0;
                while (true) {
                    if (i5 < iE) {
                        g0 g0VarI = I(this.f4739e.D(i5));
                        if (g0VarI != null && !g0VarI.p() && g0VarI.l()) {
                            o();
                            break;
                        }
                        i5++;
                    } else {
                        this.f4737d.o();
                        break;
                    }
                }
            }
            d0(true);
            Q(true);
            m.b();
        }
    }

    public final void n(int i, int i5) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = S.f2363a;
        setMeasuredDimension(AbstractC0910Q.g(i, paddingRight, B.e(this)), AbstractC0910Q.g(i5, getPaddingBottom() + getPaddingTop(), B.d(this)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03cd  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [t0.g0] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o() {
        /*
            Method dump skipped, instructions count: 1003
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.G = r0
            r1 = 1
            r5.f4767u = r1
            boolean r2 = r5.f4771w
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.f4771w = r2
            t0.Q r2 = r5.f4759q
            if (r2 == 0) goto L21
            r2.f9920g = r1
            r2.O(r5)
        L21:
            r5.f4756o0 = r0
            java.lang.ThreadLocal r0 = t0.RunnableC0935u.f10146e
            java.lang.Object r1 = r0.get()
            t0.u r1 = (t0.RunnableC0935u) r1
            r5.f4743g0 = r1
            if (r1 != 0) goto L6b
            t0.u r1 = new t0.u
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f10148a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f10151d = r2
            r5.f4743g0 = r1
            java.util.WeakHashMap r1 = M.S.f2363a
            android.view.Display r1 = M.C.b(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L5d
            if (r1 == 0) goto L5d
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L5d
            goto L5f
        L5d:
            r1 = 1114636288(0x42700000, float:60.0)
        L5f:
            t0.u r2 = r5.f4743g0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f10150c = r3
            r0.set(r2)
        L6b:
            t0.u r0 = r5.f4743g0
            java.util.ArrayList r0 = r0.f10148a
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0895B c0895b;
        super.onDetachedFromWindow();
        AbstractC0906M abstractC0906M = this.f4721N;
        if (abstractC0906M != null) {
            abstractC0906M.e();
        }
        setScrollState(0);
        f0 f0Var = this.f4742f0;
        f0Var.f9997k.removeCallbacks(f0Var);
        f0Var.f9993c.abortAnimation();
        AbstractC0910Q abstractC0910Q = this.f4759q;
        if (abstractC0910Q != null && (c0895b = abstractC0910Q.f9918e) != null) {
            c0895b.i();
        }
        this.f4767u = false;
        AbstractC0910Q abstractC0910Q2 = this.f4759q;
        if (abstractC0910Q2 != null) {
            abstractC0910Q2.f9920g = false;
            abstractC0910Q2.P(this);
        }
        this.f4770v0.clear();
        removeCallbacks(this.f4772w0);
        this.f4741f.getClass();
        while (r0.f10109d.a() != null) {
        }
        RunnableC0935u runnableC0935u = this.f4743g0;
        if (runnableC0935u != null) {
            runnableC0935u.f10148a.remove(this);
            this.f4743g0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f4761r;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0907N) arrayList.get(i)).b(canvas, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            t0.Q r0 = r5.f4759q
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f4776z
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            t0.Q r0 = r5.f4759q
            boolean r0 = r0.e()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            t0.Q r3 = r5.f4759q
            boolean r3 = r3.d()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            t0.Q r3 = r5.f4759q
            boolean r3 = r3.e()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            t0.Q r3 = r5.f4759q
            boolean r3 = r3.d()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6c:
            float r2 = r5.f4736c0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f4738d0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.Y(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        if (this.f4776z) {
            return false;
        }
        this.f4765t = null;
        if (B(motionEvent)) {
            X();
            setScrollState(0);
            return true;
        }
        AbstractC0910Q abstractC0910Q = this.f4759q;
        if (abstractC0910Q == null) {
            return false;
        }
        boolean zD = abstractC0910Q.d();
        boolean zE = this.f4759q.e();
        if (this.f4724Q == null) {
            this.f4724Q = VelocityTracker.obtain();
        }
        this.f4724Q.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f4709A) {
                this.f4709A = false;
            }
            this.f4723P = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            this.f4727T = x3;
            this.f4725R = x3;
            int y4 = (int) (motionEvent.getY() + 0.5f);
            this.f4728U = y4;
            this.f4726S = y4;
            if (this.f4722O == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                e0(1);
            }
            int[] iArr = this.f4766t0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = zD;
            if (zE) {
                i = (zD ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i, 0);
        } else if (actionMasked == 1) {
            this.f4724Q.clear();
            e0(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f4723P);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f4723P + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x4 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y5 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f4722O != 1) {
                int i5 = x4 - this.f4725R;
                int i6 = y5 - this.f4726S;
                if (zD == 0 || Math.abs(i5) <= this.f4729V) {
                    z4 = false;
                } else {
                    this.f4727T = x4;
                    z4 = true;
                }
                if (zE && Math.abs(i6) > this.f4729V) {
                    this.f4728U = y5;
                    z4 = true;
                }
                if (z4) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            X();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f4723P = motionEvent.getPointerId(actionIndex);
            int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f4727T = x5;
            this.f4725R = x5;
            int y6 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f4728U = y6;
            this.f4726S = y6;
        } else if (actionMasked == 6) {
            R(motionEvent);
        }
        return this.f4722O == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i5, int i6, int i7) {
        m.a("RV OnLayout");
        o();
        m.b();
        this.f4771w = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i5) {
        AbstractC0910Q abstractC0910Q = this.f4759q;
        if (abstractC0910Q == null) {
            n(i, i5);
            return;
        }
        boolean zJ = abstractC0910Q.J();
        d0 d0Var = this.f4745i0;
        if (zJ) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i5);
            this.f4759q.f9915b.n(i, i5);
            if ((mode == 1073741824 && mode2 == 1073741824) || this.f4757p == null) {
                return;
            }
            if (d0Var.f9975d == 1) {
                p();
            }
            this.f4759q.o0(i, i5);
            d0Var.i = true;
            q();
            this.f4759q.q0(i, i5);
            if (this.f4759q.t0()) {
                this.f4759q.o0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                d0Var.i = true;
                q();
                this.f4759q.q0(i, i5);
                return;
            }
            return;
        }
        if (this.f4769v) {
            this.f4759q.f9915b.n(i, i5);
            return;
        }
        if (this.f4711C) {
            c0();
            P();
            T();
            Q(true);
            if (d0Var.f9980k) {
                d0Var.f9978g = true;
            } else {
                this.f4737d.p();
                d0Var.f9978g = false;
            }
            this.f4711C = false;
            d0(false);
        } else if (d0Var.f9980k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC0902I abstractC0902I = this.f4757p;
        if (abstractC0902I != null) {
            d0Var.f9976e = abstractC0902I.a();
        } else {
            d0Var.f9976e = 0;
        }
        c0();
        this.f4759q.f9915b.n(i, i5);
        d0(false);
        d0Var.f9978g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof a0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a0 a0Var = (a0) parcelable;
        this.f4735c = a0Var;
        super.onRestoreInstanceState(a0Var.f3264a);
        AbstractC0910Q abstractC0910Q = this.f4759q;
        if (abstractC0910Q == null || (parcelable2 = this.f4735c.f9949c) == null) {
            return;
        }
        abstractC0910Q.b0(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a0 a0Var = new a0(super.onSaveInstanceState());
        a0 a0Var2 = this.f4735c;
        if (a0Var2 != null) {
            a0Var.f9949c = a0Var2.f9949c;
        } else {
            AbstractC0910Q abstractC0910Q = this.f4759q;
            if (abstractC0910Q != null) {
                a0Var.f9949c = abstractC0910Q.c0();
            } else {
                a0Var.f9949c = null;
            }
        }
        return a0Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i5, int i6, int i7) {
        super.onSizeChanged(i, i5, i6, i7);
        if (i == i6 && i5 == i7) {
            return;
        }
        this.f4720M = null;
        this.f4718K = null;
        this.f4719L = null;
        this.f4717J = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0436 A[PHI: r8 r21
  0x0436: PHI (r8v14 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v18 int) binds: [B:260:0x043e, B:263:0x0445, B:266:0x044c, B:269:0x0453, B:272:0x045f, B:256:0x0432] A[DONT_GENERATE, DONT_INLINE]
  0x0436: PHI (r21v5 android.view.MotionEvent) = 
  (r21v4 android.view.MotionEvent)
  (r21v4 android.view.MotionEvent)
  (r21v4 android.view.MotionEvent)
  (r21v4 android.view.MotionEvent)
  (r21v4 android.view.MotionEvent)
  (r21v8 android.view.MotionEvent)
 binds: [B:260:0x043e, B:263:0x0445, B:266:0x044c, B:269:0x0453, B:272:0x045f, B:256:0x0432] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f8 A[PHI: r0
  0x01f8: PHI (r0v56 int) = (r0v43 int), (r0v60 int) binds: [B:90:0x01e1, B:94:0x01f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fb  */
    /* JADX WARN: Type inference failed for: r4v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v29 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 1374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p():void");
    }

    public final void q() {
        c0();
        P();
        d0 d0Var = this.f4745i0;
        d0Var.a(6);
        this.f4737d.p();
        d0Var.f9976e = this.f4757p.a();
        d0Var.f9974c = 0;
        d0Var.f9978g = false;
        this.f4759q.Z(this.f4733b, d0Var);
        d0Var.f9977f = false;
        this.f4735c = null;
        d0Var.f9979j = d0Var.f9979j && this.f4721N != null;
        d0Var.f9975d = 4;
        Q(true);
        d0(false);
    }

    public final boolean r(int i, int i5, int[] iArr, int[] iArr2, int i6) {
        return getScrollingChildHelper().c(i, i5, iArr, iArr2, i6);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z4) {
        g0 g0VarI = I(view);
        if (g0VarI != null) {
            if (g0VarI.k()) {
                g0VarI.f10011j &= -257;
            } else if (!g0VarI.p()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + g0VarI + y());
            }
        }
        view.clearAnimation();
        I(view);
        super.removeDetachedView(view, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C0895B c0895b = this.f4759q.f9918e;
        if ((c0895b == null || !c0895b.f9879e) && !L() && view2 != null) {
            W(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        return this.f4759q.i0(this, view, rect, z4, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        ArrayList arrayList = this.f4763s;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0933s) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f4773x != 0 || this.f4776z) {
            this.f4775y = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        getScrollingChildHelper().d(i, i5, i6, i7, iArr, i8, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i5) {
        AbstractC0910Q abstractC0910Q = this.f4759q;
        if (abstractC0910Q == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f4776z) {
            return;
        }
        boolean zD = abstractC0910Q.d();
        boolean zE = this.f4759q.e();
        if (zD || zE) {
            if (!zD) {
                i = 0;
            }
            if (!zE) {
                i5 = 0;
            }
            Y(i, i5, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i5) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!L()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int iA = accessibilityEvent != null ? b.a(accessibilityEvent) : 0;
            this.f4710B |= iA != 0 ? iA : 0;
        }
    }

    public void setAccessibilityDelegateCompat(i0 i0Var) {
        this.f4758p0 = i0Var;
        S.h(this, i0Var);
    }

    public void setAdapter(AbstractC0902I abstractC0902I) {
        setLayoutFrozen(false);
        AbstractC0902I abstractC0902I2 = this.f4757p;
        Z z4 = this.f4731a;
        if (abstractC0902I2 != null) {
            abstractC0902I2.f9901a.unregisterObserver(z4);
            this.f4757p.getClass();
        }
        AbstractC0906M abstractC0906M = this.f4721N;
        if (abstractC0906M != null) {
            abstractC0906M.e();
        }
        AbstractC0910Q abstractC0910Q = this.f4759q;
        X x3 = this.f4733b;
        if (abstractC0910Q != null) {
            abstractC0910Q.e0(x3);
            this.f4759q.f0(x3);
        }
        x3.f9937a.clear();
        x3.d();
        T t4 = this.f4737d;
        t4.G((ArrayList) t4.f136d);
        t4.G((ArrayList) t4.f137e);
        t4.f135c = 0;
        AbstractC0902I abstractC0902I3 = this.f4757p;
        this.f4757p = abstractC0902I;
        if (abstractC0902I != null) {
            abstractC0902I.f9901a.registerObserver(z4);
        }
        AbstractC0902I abstractC0902I4 = this.f4757p;
        x3.f9937a.clear();
        x3.d();
        C0915W c0915wC = x3.c();
        if (abstractC0902I3 != null) {
            c0915wC.f9936b--;
        }
        if (c0915wC.f9936b == 0) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = c0915wC.f9935a;
                if (i >= sparseArray.size()) {
                    break;
                }
                ((C0914V) sparseArray.valueAt(i)).f9931a.clear();
                i++;
            }
        }
        if (abstractC0902I4 != null) {
            c0915wC.f9936b++;
        }
        this.f4745i0.f9977f = true;
        U(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0904K interfaceC0904K) {
        if (interfaceC0904K == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z4) {
        if (z4 != this.f4747k) {
            this.f4720M = null;
            this.f4718K = null;
            this.f4719L = null;
            this.f4717J = null;
        }
        this.f4747k = z4;
        super.setClipToPadding(z4);
        if (this.f4771w) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0905L c0905l) {
        c0905l.getClass();
        this.f4716I = c0905l;
        this.f4720M = null;
        this.f4718K = null;
        this.f4719L = null;
        this.f4717J = null;
    }

    public void setHasFixedSize(boolean z4) {
        this.f4769v = z4;
    }

    public void setItemAnimator(AbstractC0906M abstractC0906M) {
        AbstractC0906M abstractC0906M2 = this.f4721N;
        if (abstractC0906M2 != null) {
            abstractC0906M2.e();
            this.f4721N.f9903a = null;
        }
        this.f4721N = abstractC0906M;
        if (abstractC0906M != null) {
            abstractC0906M.f9903a = this.f4754n0;
        }
    }

    public void setItemViewCacheSize(int i) {
        X x3 = this.f4733b;
        x3.f9941e = i;
        x3.k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z4) {
        suppressLayout(z4);
    }

    public void setLayoutManager(AbstractC0910Q abstractC0910Q) {
        RecyclerView recyclerView;
        C0895B c0895b;
        if (abstractC0910Q == this.f4759q) {
            return;
        }
        setScrollState(0);
        f0 f0Var = this.f4742f0;
        f0Var.f9997k.removeCallbacks(f0Var);
        f0Var.f9993c.abortAnimation();
        AbstractC0910Q abstractC0910Q2 = this.f4759q;
        if (abstractC0910Q2 != null && (c0895b = abstractC0910Q2.f9918e) != null) {
            c0895b.i();
        }
        AbstractC0910Q abstractC0910Q3 = this.f4759q;
        X x3 = this.f4733b;
        if (abstractC0910Q3 != null) {
            AbstractC0906M abstractC0906M = this.f4721N;
            if (abstractC0906M != null) {
                abstractC0906M.e();
            }
            this.f4759q.e0(x3);
            this.f4759q.f0(x3);
            x3.f9937a.clear();
            x3.d();
            if (this.f4767u) {
                AbstractC0910Q abstractC0910Q4 = this.f4759q;
                abstractC0910Q4.f9920g = false;
                abstractC0910Q4.P(this);
            }
            this.f4759q.r0(null);
            this.f4759q = null;
        } else {
            x3.f9937a.clear();
            x3.d();
        }
        C0009i c0009i = this.f4739e;
        ((C0043g) c0009i.f205c).g();
        ArrayList arrayList = (ArrayList) c0009i.f206d;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = (RecyclerView) ((K2.c) c0009i.f204b).b;
            if (size < 0) {
                break;
            }
            g0 g0VarI = I((View) arrayList.get(size));
            if (g0VarI != null) {
                int i = g0VarI.f10017p;
                if (recyclerView.L()) {
                    g0VarI.f10018q = i;
                    recyclerView.f4770v0.add(g0VarI);
                } else {
                    WeakHashMap weakHashMap = S.f2363a;
                    B.s(g0VarI.f10004a, i);
                }
                g0VarI.f10017p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = recyclerView.getChildAt(i5);
            I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f4759q = abstractC0910Q;
        if (abstractC0910Q != null) {
            if (abstractC0910Q.f9915b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC0910Q + " is already attached to a RecyclerView:" + abstractC0910Q.f9915b.y());
            }
            abstractC0910Q.r0(this);
            if (this.f4767u) {
                AbstractC0910Q abstractC0910Q5 = this.f4759q;
                abstractC0910Q5.f9920g = true;
                abstractC0910Q5.O(this);
            }
        }
        x3.k();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        C0128n scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f2407d) {
            WeakHashMap weakHashMap = S.f2363a;
            H.z(scrollingChildHelper.f2406c);
        }
        scrollingChildHelper.f2407d = z4;
    }

    public void setOnFlingListener(AbstractC0912T abstractC0912T) {
        this.f4730W = abstractC0912T;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0913U abstractC0913U) {
        this.f4746j0 = abstractC0913U;
    }

    public void setPreserveFocusAfterLayout(boolean z4) {
        this.f4740e0 = z4;
    }

    public void setRecycledViewPool(C0915W c0915w) {
        X x3 = this.f4733b;
        if (x3.f9943g != null) {
            r0.f9936b--;
        }
        x3.f9943g = c0915w;
        if (c0915w == null || x3.h.getAdapter() == null) {
            return;
        }
        x3.f9943g.f9936b++;
    }

    public void setRecyclerListener(Y y4) {
    }

    public void setScrollState(int i) {
        C0895B c0895b;
        if (i == this.f4722O) {
            return;
        }
        this.f4722O = i;
        if (i != 2) {
            f0 f0Var = this.f4742f0;
            f0Var.f9997k.removeCallbacks(f0Var);
            f0Var.f9993c.abortAnimation();
            AbstractC0910Q abstractC0910Q = this.f4759q;
            if (abstractC0910Q != null && (c0895b = abstractC0910Q.f9918e) != null) {
                c0895b.i();
            }
        }
        AbstractC0910Q abstractC0910Q2 = this.f4759q;
        if (abstractC0910Q2 != null) {
            abstractC0910Q2.d0(i);
        }
        AbstractC0913U abstractC0913U = this.f4746j0;
        if (abstractC0913U != null) {
            abstractC0913U.a(this, i);
        }
        ArrayList arrayList = this.f4748k0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0913U) this.f4748k0.get(size)).a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f4729V = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f4729V = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(e0 e0Var) {
        this.f4733b.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z4) {
        C0895B c0895b;
        if (z4 != this.f4776z) {
            i("Do not suppressLayout in layout or scroll");
            if (!z4) {
                this.f4776z = false;
                if (this.f4775y && this.f4759q != null && this.f4757p != null) {
                    requestLayout();
                }
                this.f4775y = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f4776z = true;
            this.f4709A = true;
            setScrollState(0);
            f0 f0Var = this.f4742f0;
            f0Var.f9997k.removeCallbacks(f0Var);
            f0Var.f9993c.abortAnimation();
            AbstractC0910Q abstractC0910Q = this.f4759q;
            if (abstractC0910Q == null || (c0895b = abstractC0910Q.f9918e) == null) {
                return;
            }
            c0895b.i();
        }
    }

    public final void t(int i, int i5) {
        this.f4715H++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i5);
        AbstractC0913U abstractC0913U = this.f4746j0;
        if (abstractC0913U != null) {
            abstractC0913U.b(this, i, i5);
        }
        ArrayList arrayList = this.f4748k0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0913U) this.f4748k0.get(size)).b(this, i, i5);
            }
        }
        this.f4715H--;
    }

    public final void u() {
        if (this.f4720M != null) {
            return;
        }
        this.f4716I.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f4720M = edgeEffect;
        if (this.f4747k) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void v() {
        if (this.f4717J != null) {
            return;
        }
        this.f4716I.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f4717J = edgeEffect;
        if (this.f4747k) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void w() {
        if (this.f4719L != null) {
            return;
        }
        this.f4716I.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f4719L = edgeEffect;
        if (this.f4747k) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void x() {
        if (this.f4718K != null) {
            return;
        }
        this.f4716I.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f4718K = edgeEffect;
        if (this.f4747k) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String y() {
        return " " + super.toString() + ", adapter:" + this.f4757p + ", layout:" + this.f4759q + ", context:" + getContext();
    }

    public final void z(d0 d0Var) {
        if (getScrollState() != 2) {
            d0Var.getClass();
            return;
        }
        OverScroller overScroller = this.f4742f0.f9993c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        d0Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) throws NoSuchMethodException, SecurityException {
        char c5;
        int i5;
        Object[] objArr;
        Constructor constructor;
        super(context, attributeSet, i);
        this.f4731a = new Z(this);
        this.f4733b = new X(this);
        this.f4741f = new c(12);
        this.f4749l = new RunnableC0900G(this, 0);
        this.f4751m = new Rect();
        this.f4753n = new Rect();
        this.f4755o = new RectF();
        this.f4761r = new ArrayList();
        this.f4763s = new ArrayList();
        this.f4773x = 0;
        this.f4713E = false;
        this.f4714F = false;
        this.G = 0;
        this.f4715H = 0;
        this.f4716I = new C0905L();
        C0926l c0926l = new C0926l();
        c0926l.f9903a = null;
        c0926l.f9904b = new ArrayList();
        c0926l.f9905c = 120L;
        c0926l.f9906d = 120L;
        c0926l.f9907e = 250L;
        c0926l.f9908f = 250L;
        c0926l.f10051g = true;
        c0926l.h = new ArrayList();
        c0926l.i = new ArrayList();
        c0926l.f10052j = new ArrayList();
        c0926l.f10053k = new ArrayList();
        c0926l.f10054l = new ArrayList();
        c0926l.f10055m = new ArrayList();
        c0926l.f10056n = new ArrayList();
        c0926l.f10057o = new ArrayList();
        c0926l.f10058p = new ArrayList();
        c0926l.f10059q = new ArrayList();
        c0926l.f10060r = new ArrayList();
        this.f4721N = c0926l;
        this.f4722O = 0;
        this.f4723P = -1;
        this.f4736c0 = Float.MIN_VALUE;
        this.f4738d0 = Float.MIN_VALUE;
        this.f4740e0 = true;
        this.f4742f0 = new f0(this);
        this.f4744h0 = new C0208k();
        d0 d0Var = new d0();
        d0Var.f9972a = -1;
        d0Var.f9973b = 0;
        d0Var.f9974c = 0;
        d0Var.f9975d = 1;
        d0Var.f9976e = 0;
        d0Var.f9977f = false;
        d0Var.f9978g = false;
        d0Var.h = false;
        d0Var.i = false;
        d0Var.f9979j = false;
        d0Var.f9980k = false;
        this.f4745i0 = d0Var;
        this.f4750l0 = false;
        this.f4752m0 = false;
        C0901H c0901h = new C0901H(this);
        this.f4754n0 = c0901h;
        this.f4756o0 = false;
        this.f4760q0 = new int[2];
        this.f4764s0 = new int[2];
        this.f4766t0 = new int[2];
        this.f4768u0 = new int[2];
        this.f4770v0 = new ArrayList();
        this.f4772w0 = new RunnableC0900G(this, 1);
        this.f4774x0 = new C0901H(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4729V = viewConfiguration.getScaledTouchSlop();
        this.f4736c0 = M.T.a(viewConfiguration);
        this.f4738d0 = M.T.b(viewConfiguration);
        this.f4732a0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4734b0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f4721N.f9903a = c0901h;
        i iVar = new i(this, 26);
        T t4 = new T();
        t4.f133a = new e(30);
        t4.f136d = new ArrayList();
        t4.f137e = new ArrayList();
        t4.f135c = 0;
        t4.f134b = iVar;
        t4.f138f = new i(t4, 25);
        this.f4737d = t4;
        this.f4739e = new C0009i(new K2.c(this, 29), (char) 0);
        WeakHashMap weakHashMap = S.f2363a;
        if (J.c(this) == 0) {
            J.m(this, 8);
        }
        if (B.c(this) == 0) {
            B.s(this, 1);
        }
        this.f4712D = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new i0(this));
        int[] iArr = AbstractC0864a.f9667a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f4747k = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + y());
            }
            Resources resources = getContext().getResources();
            c5 = 2;
            i5 = 4;
            new C0933s(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(2131099804), resources.getDimensionPixelSize(2131099806), resources.getDimensionPixelOffset(2131099805));
        } else {
            c5 = 2;
            i5 = 4;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(strTrim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC0910Q.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(f4708z0);
                        objArr = new Object[i5];
                        objArr[0] = context;
                        objArr[1] = attributeSet;
                        objArr[c5] = Integer.valueOf(i);
                        objArr[3] = 0;
                    } catch (NoSuchMethodException e5) {
                        try {
                            objArr = null;
                            constructor = clsAsSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e6) {
                            e6.initCause(e5);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strTrim, e6);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((AbstractC0910Q) constructor.newInstance(objArr));
                } catch (ClassCastException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strTrim, e7);
                } catch (ClassNotFoundException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strTrim, e8);
                } catch (IllegalAccessException e9) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strTrim, e9);
                } catch (InstantiationException e10) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e10);
                } catch (InvocationTargetException e11) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e11);
                }
            }
        }
        int[] iArr2 = f4707y0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        saveAttributeDataForStyleable(context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        boolean z4 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z4);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0910Q abstractC0910Q = this.f4759q;
        if (abstractC0910Q != null) {
            return abstractC0910Q.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }
}
