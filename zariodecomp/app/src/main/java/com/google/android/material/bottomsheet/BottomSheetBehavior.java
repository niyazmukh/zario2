package com.google.android.material.bottomsheet;

import E2.j;
import F1.b;
import F1.d;
import F1.g;
import F1.h;
import M.B;
import M.C;
import M.C0116a;
import M.C0118c;
import M.C0120e;
import M.E;
import M.F;
import M.H;
import M.M;
import M.S;
import M.c0;
import M.d0;
import M.f0;
import N.i;
import N2.AbstractC0156x;
import Q1.n;
import S0.c;
import V.e;
import X1.m;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import y.C1041d;
import y.a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\bottomsheet\BottomSheetBehavior.smali */
public class BottomSheetBehavior<V extends View> extends a {

    /* renamed from: A, reason: collision with root package name */
    public final h f5814A;

    /* renamed from: B, reason: collision with root package name */
    public final ValueAnimator f5815B;

    /* renamed from: C, reason: collision with root package name */
    public final int f5816C;

    /* renamed from: D, reason: collision with root package name */
    public int f5817D;

    /* renamed from: E, reason: collision with root package name */
    public int f5818E;

    /* renamed from: F, reason: collision with root package name */
    public final float f5819F;
    public int G;

    /* renamed from: H, reason: collision with root package name */
    public final float f5820H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f5821I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f5822J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f5823K;

    /* renamed from: L, reason: collision with root package name */
    public int f5824L;

    /* renamed from: M, reason: collision with root package name */
    public e f5825M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f5826N;

    /* renamed from: O, reason: collision with root package name */
    public int f5827O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f5828P;

    /* renamed from: Q, reason: collision with root package name */
    public final float f5829Q;

    /* renamed from: R, reason: collision with root package name */
    public int f5830R;

    /* renamed from: S, reason: collision with root package name */
    public int f5831S;

    /* renamed from: T, reason: collision with root package name */
    public int f5832T;

    /* renamed from: U, reason: collision with root package name */
    public WeakReference f5833U;

    /* renamed from: V, reason: collision with root package name */
    public WeakReference f5834V;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f5835W;
    public VelocityTracker X;

    /* renamed from: Y, reason: collision with root package name */
    public int f5836Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f5837Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f5838a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f5839a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5840b;

    /* renamed from: b0, reason: collision with root package name */
    public HashMap f5841b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f5842c;

    /* renamed from: c0, reason: collision with root package name */
    public final SparseIntArray f5843c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f5844d;

    /* renamed from: d0, reason: collision with root package name */
    public final F1.e f5845d0;

    /* renamed from: e, reason: collision with root package name */
    public int f5846e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5847f;

    /* renamed from: g, reason: collision with root package name */
    public int f5848g;
    public final int h;
    public final X1.h i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f5849j;

    /* renamed from: k, reason: collision with root package name */
    public final int f5850k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5851l;

    /* renamed from: m, reason: collision with root package name */
    public int f5852m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f5853n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f5854o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f5855p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f5856q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f5857r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f5858s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f5859t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f5860u;

    /* renamed from: v, reason: collision with root package name */
    public int f5861v;

    /* renamed from: w, reason: collision with root package name */
    public int f5862w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f5863x;

    /* renamed from: y, reason: collision with root package name */
    public final m f5864y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f5865z;

    public BottomSheetBehavior() {
        this.f5838a = 0;
        this.f5840b = true;
        this.f5850k = -1;
        this.f5851l = -1;
        this.f5814A = new h(this);
        this.f5819F = 0.5f;
        this.f5820H = -1.0f;
        this.f5823K = true;
        this.f5824L = 4;
        this.f5829Q = 0.1f;
        this.f5835W = new ArrayList();
        this.f5837Z = -1;
        this.f5843c0 = new SparseIntArray();
        this.f5845d0 = new F1.e(this, 0);
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = S.f2363a;
        if (H.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewV = v(viewGroup.getChildAt(i));
                if (viewV != null) {
                    return viewV;
                }
            }
        }
        return null;
    }

    public static int w(int i, int i5, int i6, int i7) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i5, i7);
        if (i6 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i6), 1073741824);
        }
        if (size != 0) {
            i6 = Math.min(size, i6);
        }
        return View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
    }

    public final void A(int i) {
        if (i == -1) {
            if (this.f5847f) {
                return;
            } else {
                this.f5847f = true;
            }
        } else {
            if (!this.f5847f && this.f5846e == i) {
                return;
            }
            this.f5847f = false;
            this.f5846e = Math.max(0, i);
        }
        I();
    }

    public final void B(int i) throws Resources.NotFoundException {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(B.a.m(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f5821I && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i5 = (i == 6 && this.f5840b && y(i) <= this.f5817D) ? 3 : i;
        WeakReference weakReference = this.f5833U;
        if (weakReference == null || weakReference.get() == null) {
            C(i);
            return;
        }
        View view = (View) this.f5833U.get();
        b bVar = new b(this, view, i5);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = S.f2363a;
            if (E.b(view)) {
                view.post(bVar);
                return;
            }
        }
        bVar.run();
    }

    public final void C(int i) throws Resources.NotFoundException {
        if (this.f5824L == i) {
            return;
        }
        this.f5824L = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z4 = this.f5821I;
        }
        WeakReference weakReference = this.f5833U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            H(true);
        } else if (i == 6 || i == 5 || i == 4) {
            H(false);
        }
        G(i, true);
        ArrayList arrayList = this.f5835W;
        if (arrayList.size() <= 0) {
            F();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final boolean D(View view, float f2) {
        if (this.f5822J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f2 * this.f5829Q) + ((float) view.getTop())) - ((float) this.G)) / ((float) t()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        C(2);
        G(r4, true);
        r2.f5814A.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.o(r3.getLeft(), r0) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(android.view.View r3, int r4, boolean r5) throws android.content.res.Resources.NotFoundException {
        /*
            r2 = this;
            int r0 = r2.y(r4)
            V.e r1 = r2.f5825M
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.o(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.f3420r = r3
            r3 = -1
            r1.f3407c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.f3405a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.f3420r
            if (r5 == 0) goto L30
            r5 = 0
            r1.f3420r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.C(r3)
            r3 = 1
            r2.G(r4, r3)
            F1.h r2 = r2.f5814A
            r2.b(r4)
            goto L43
        L40:
            r2.C(r4)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.E(android.view.View, int, boolean):void");
    }

    public final void F() throws Resources.NotFoundException {
        View view;
        int iA;
        WeakReference weakReference = this.f5833U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        S.f(view, 524288);
        S.d(view, 0);
        S.f(view, 262144);
        S.d(view, 0);
        S.f(view, 1048576);
        S.d(view, 0);
        SparseIntArray sparseIntArray = this.f5843c0;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            S.f(view, i);
            S.d(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f5840b && this.f5824L != 6) {
            String string = view.getResources().getString(2131886144);
            j jVar = new j(this, 6);
            ArrayList arrayListB = S.b(view);
            int i5 = 0;
            while (true) {
                if (i5 >= arrayListB.size()) {
                    int i6 = 0;
                    int i7 = -1;
                    while (true) {
                        int[] iArr = S.f2364b;
                        if (i6 >= iArr.length || i7 != -1) {
                            break;
                        }
                        int i8 = iArr[i6];
                        boolean z4 = true;
                        for (int i9 = 0; i9 < arrayListB.size(); i9++) {
                            z4 &= ((i) arrayListB.get(i9)).a() != i8;
                        }
                        if (z4) {
                            i7 = i8;
                        }
                        i6++;
                    }
                    iA = i7;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((i) arrayListB.get(i5)).f2538a).getLabel())) {
                        iA = ((i) arrayListB.get(i5)).a();
                        break;
                    }
                    i5++;
                }
            }
            if (iA != -1) {
                i iVar = new i(null, iA, string, jVar, null);
                View.AccessibilityDelegate accessibilityDelegateA = M.a(view);
                C0118c c0118c = accessibilityDelegateA == null ? null : accessibilityDelegateA instanceof C0116a ? ((C0116a) accessibilityDelegateA).f2368a : new C0118c(accessibilityDelegateA);
                if (c0118c == null) {
                    c0118c = new C0118c();
                }
                S.h(view, c0118c);
                S.f(view, iVar.a());
                S.b(view).add(iVar);
                S.d(view, 0);
            }
            sparseIntArray.put(0, iA);
        }
        if (this.f5821I && this.f5824L != 5) {
            S.g(view, i.f2534j, new j(this, 5));
        }
        int i10 = this.f5824L;
        if (i10 == 3) {
            S.g(view, i.i, new j(this, this.f5840b ? 4 : 6));
            return;
        }
        if (i10 == 4) {
            S.g(view, i.h, new j(this, this.f5840b ? 3 : 6));
        } else {
            if (i10 != 6) {
                return;
            }
            S.g(view, i.i, new j(this, 4));
            S.g(view, i.h, new j(this, 3));
        }
    }

    public final void G(int i, boolean z4) {
        X1.h hVar = this.i;
        ValueAnimator valueAnimator = this.f5815B;
        if (i == 2) {
            return;
        }
        boolean z5 = this.f5824L == 3 && (this.f5863x || z());
        if (this.f5865z == z5 || hVar == null) {
            return;
        }
        this.f5865z = z5;
        if (!z4 || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            hVar.n(this.f5865z ? s() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(hVar.f3738a.i, z5 ? s() : 1.0f);
            valueAnimator.start();
        }
    }

    public final void H(boolean z4) {
        WeakReference weakReference = this.f5833U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z4) {
                if (this.f5841b0 != null) {
                    return;
                } else {
                    this.f5841b0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f5833U.get() && z4) {
                    this.f5841b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z4) {
                return;
            }
            this.f5841b0 = null;
        }
    }

    public final void I() {
        View view;
        if (this.f5833U != null) {
            r();
            if (this.f5824L != 4 || (view = (View) this.f5833U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // y.a
    public final void c(C1041d c1041d) {
        this.f5833U = null;
        this.f5825M = null;
    }

    @Override // y.a
    public final void e() {
        this.f5833U = null;
        this.f5825M = null;
    }

    @Override // y.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        e eVar;
        if (!view.isShown() || !this.f5823K) {
            this.f5826N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f5836Y = -1;
            this.f5837Z = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x3 = (int) motionEvent.getX();
            this.f5837Z = (int) motionEvent.getY();
            if (this.f5824L != 2) {
                WeakReference weakReference = this.f5834V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x3, this.f5837Z)) {
                    this.f5836Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f5839a0 = true;
                }
            }
            this.f5826N = this.f5836Y == -1 && !coordinatorLayout.o(view, x3, this.f5837Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f5839a0 = false;
            this.f5836Y = -1;
            if (this.f5826N) {
                this.f5826N = false;
                return false;
            }
        }
        if (!this.f5826N && (eVar = this.f5825M) != null && eVar.p(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f5834V;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f5826N || this.f5824L == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f5825M == null || (i = this.f5837Z) == -1 || Math.abs(((float) i) - motionEvent.getY()) <= ((float) this.f5825M.f3406b)) ? false : true;
    }

    @Override // y.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) throws Resources.NotFoundException {
        int i5 = this.f5851l;
        X1.h hVar = this.i;
        int i6 = 6;
        WeakHashMap weakHashMap = S.f2363a;
        if (B.b(coordinatorLayout) && !B.b(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f5833U == null) {
            this.f5848g = coordinatorLayout.getResources().getDimensionPixelSize(2131099769);
            boolean z4 = (this.f5853n || this.f5847f) ? false : true;
            if (this.f5854o || this.f5855p || this.f5856q || this.f5858s || this.f5859t || this.f5860u || z4) {
                d dVar = new d(this, z4);
                int iF = C.f(view);
                view.getPaddingTop();
                int iE = C.e(view);
                int paddingBottom = view.getPaddingBottom();
                n nVar = new n();
                nVar.f2807a = iF;
                nVar.f2808b = iE;
                nVar.f2809c = paddingBottom;
                H.u(view, new c(i6, dVar, nVar));
                if (E.b(view)) {
                    F.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new Q1.m());
                }
            }
            C0120e c0120e = new C0120e(view);
            if (Build.VERSION.SDK_INT >= 30) {
                view.setWindowInsetsAnimationCallback(new f0(c0120e));
            } else {
                PathInterpolator pathInterpolator = d0.e;
                Object tag = view.getTag(2131231211);
                View.OnApplyWindowInsetsListener c0Var = new c0(view, c0120e);
                view.setTag(2131231219, c0Var);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(c0Var);
                }
            }
            this.f5833U = new WeakReference(view);
            Context context = view.getContext();
            AbstractC0156x.e0(context, 2130903842, O.a.b(0.0f, 0.0f, 0.0f, 1.0f));
            AbstractC0156x.d0(context, 2130903825, 300);
            AbstractC0156x.d0(context, 2130903830, 150);
            AbstractC0156x.d0(context, 2130903829, 100);
            Resources resources = view.getResources();
            resources.getDimension(2131099837);
            resources.getDimension(2131099838);
            if (hVar != null) {
                B.q(view, hVar);
                float fI = this.f5820H;
                if (fI == -1.0f) {
                    fI = H.i(view);
                }
                hVar.l(fI);
            } else {
                ColorStateList colorStateList = this.f5849j;
                if (colorStateList != null) {
                    H.q(view, colorStateList);
                }
            }
            F();
            if (B.c(view) == 0) {
                B.s(view, 1);
            }
        }
        if (this.f5825M == null) {
            this.f5825M = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f5845d0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i);
        this.f5831S = coordinatorLayout.getWidth();
        this.f5832T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f5830R = height;
        int iMin = this.f5832T;
        int i7 = iMin - height;
        int i8 = this.f5862w;
        if (i7 < i8) {
            if (this.f5857r) {
                if (i5 != -1) {
                    iMin = Math.min(iMin, i5);
                }
                this.f5830R = iMin;
            } else {
                int iMin2 = iMin - i8;
                if (i5 != -1) {
                    iMin2 = Math.min(iMin2, i5);
                }
                this.f5830R = iMin2;
            }
        }
        this.f5817D = Math.max(0, this.f5832T - this.f5830R);
        this.f5818E = (int) ((1.0f - this.f5819F) * this.f5832T);
        r();
        int i9 = this.f5824L;
        if (i9 == 3) {
            view.offsetTopAndBottom(x());
        } else if (i9 == 6) {
            view.offsetTopAndBottom(this.f5818E);
        } else if (this.f5821I && i9 == 5) {
            view.offsetTopAndBottom(this.f5832T);
        } else if (i9 == 4) {
            view.offsetTopAndBottom(this.G);
        } else if (i9 == 1 || i9 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        G(this.f5824L, false);
        this.f5834V = new WeakReference(v(view));
        ArrayList arrayList = this.f5835W;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // y.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, this.f5850k, marginLayoutParams.width), w(i6, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f5851l, marginLayoutParams.height));
        return true;
    }

    @Override // y.a
    public final boolean i(View view) {
        WeakReference weakReference = this.f5834V;
        return (weakReference == null || view != weakReference.get() || this.f5824L == 3) ? false : true;
    }

    @Override // y.a
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i5, int[] iArr, int i6) throws Resources.NotFoundException {
        boolean z4 = this.f5823K;
        if (i6 == 1) {
            return;
        }
        WeakReference weakReference = this.f5834V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i7 = top - i5;
        if (i5 > 0) {
            if (i7 < x()) {
                int iX = top - x();
                iArr[1] = iX;
                WeakHashMap weakHashMap = S.f2363a;
                view.offsetTopAndBottom(-iX);
                C(3);
            } else {
                if (!z4) {
                    return;
                }
                iArr[1] = i5;
                WeakHashMap weakHashMap2 = S.f2363a;
                view.offsetTopAndBottom(-i5);
                C(1);
            }
        } else if (i5 < 0 && !view2.canScrollVertically(-1)) {
            int i8 = this.G;
            if (i7 > i8 && !this.f5821I) {
                int i9 = top - i8;
                iArr[1] = i9;
                WeakHashMap weakHashMap3 = S.f2363a;
                view.offsetTopAndBottom(-i9);
                C(4);
            } else {
                if (!z4) {
                    return;
                }
                iArr[1] = i5;
                WeakHashMap weakHashMap4 = S.f2363a;
                view.offsetTopAndBottom(-i5);
                C(1);
            }
        }
        u(view.getTop());
        this.f5827O = i5;
        this.f5828P = true;
    }

    @Override // y.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i5, int i6, int[] iArr) {
    }

    @Override // y.a
    public final void m(View view, Parcelable parcelable) {
        g gVar = (g) parcelable;
        int i = this.f5838a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f5846e = gVar.f1676d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f5840b = gVar.f1677e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f5821I = gVar.f1678f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f5822J = gVar.f1679k;
            }
        }
        int i5 = gVar.f1675c;
        if (i5 == 1 || i5 == 2) {
            this.f5824L = 4;
        } else {
            this.f5824L = i5;
        }
    }

    @Override // y.a
    public final Parcelable n(View view) {
        return new g(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // y.a
    public final boolean o(View view, int i, int i5) {
        this.f5827O = 0;
        this.f5828P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    @Override // y.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(android.view.View r4, android.view.View r5, int r6) throws android.content.res.Resources.NotFoundException {
        /*
            r3 = this;
            int r6 = r4.getTop()
            int r0 = r3.x()
            r1 = 3
            if (r6 != r0) goto Lf
            r3.C(r1)
            return
        Lf:
            java.lang.ref.WeakReference r6 = r3.f5834V
            if (r6 == 0) goto Lb5
            java.lang.Object r6 = r6.get()
            if (r5 != r6) goto Lb5
            boolean r5 = r3.f5828P
            if (r5 != 0) goto L1f
            goto Lb5
        L1f:
            int r5 = r3.f5827O
            r6 = 6
            if (r5 <= 0) goto L34
            boolean r5 = r3.f5840b
            if (r5 == 0) goto L2a
            goto Laf
        L2a:
            int r5 = r4.getTop()
            int r0 = r3.f5818E
            if (r5 <= r0) goto Laf
            goto Lae
        L34:
            boolean r5 = r3.f5821I
            if (r5 == 0) goto L55
            android.view.VelocityTracker r5 = r3.X
            if (r5 != 0) goto L3e
            r5 = 0
            goto L4d
        L3e:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f5842c
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r3.X
            int r0 = r3.f5836Y
            float r5 = r5.getYVelocity(r0)
        L4d:
            boolean r5 = r3.D(r4, r5)
            if (r5 == 0) goto L55
            r1 = 5
            goto Laf
        L55:
            int r5 = r3.f5827O
            r0 = 4
            if (r5 != 0) goto L93
            int r5 = r4.getTop()
            boolean r2 = r3.f5840b
            if (r2 == 0) goto L74
            int r6 = r3.f5817D
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r2 = r3.G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L97
            goto Laf
        L74:
            int r2 = r3.f5818E
            if (r5 >= r2) goto L83
            int r0 = r3.G
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r5 >= r0) goto Lae
            goto Laf
        L83:
            int r1 = r5 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
            goto Lae
        L93:
            boolean r5 = r3.f5840b
            if (r5 == 0) goto L99
        L97:
            r1 = r0
            goto Laf
        L99:
            int r5 = r4.getTop()
            int r1 = r3.f5818E
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
        Lae:
            r1 = r6
        Laf:
            r5 = 0
            r3.E(r4, r1, r5)
            r3.f5828P = r5
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.p(android.view.View, android.view.View, int):void");
    }

    @Override // y.a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f5824L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        e eVar = this.f5825M;
        if (eVar != null && (this.f5823K || i == 1)) {
            eVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f5836Y = -1;
            this.f5837Z = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (this.f5825M != null && ((this.f5823K || this.f5824L == 1) && actionMasked == 2 && !this.f5826N)) {
            float fAbs = Math.abs(this.f5837Z - motionEvent.getY());
            e eVar2 = this.f5825M;
            if (fAbs > eVar2.f3406b) {
                eVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f5826N;
    }

    public final void r() {
        int iT = t();
        if (this.f5840b) {
            this.G = Math.max(this.f5832T - iT, this.f5817D);
        } else {
            this.G = this.f5832T - iT;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float s() {
        /*
            r5 = this;
            X1.h r0 = r5.i
            r1 = 0
            if (r0 == 0) goto L6f
            java.lang.ref.WeakReference r0 = r5.f5833U
            if (r0 == 0) goto L6f
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L6f
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L6f
            java.lang.ref.WeakReference r0 = r5.f5833U
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.z()
            if (r2 == 0) goto L6f
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L6f
            X1.h r2 = r5.i
            float r2 = r2.h()
            android.view.RoundedCorner r3 = F1.a.i(r0)
            if (r3 == 0) goto L44
            int r3 = F1.a.c(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L44
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L44
            float r3 = r3 / r2
            goto L45
        L44:
            r3 = r1
        L45:
            X1.h r5 = r5.i
            X1.g r2 = r5.f3738a
            X1.m r2 = r2.f3722a
            X1.c r2 = r2.f3778f
            android.graphics.RectF r5 = r5.g()
            float r5 = r2.a(r5)
            android.view.RoundedCorner r0 = F1.a.o(r0)
            if (r0 == 0) goto L6a
            int r0 = F1.a.c(r0)
            float r0 = (float) r0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L6a
            int r2 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r2 <= 0) goto L6a
            float r1 = r0 / r5
        L6a:
            float r5 = java.lang.Math.max(r3, r1)
            return r5
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.s():float");
    }

    public final int t() {
        int iMin;
        int i;
        int i5;
        if (this.f5847f) {
            iMin = Math.min(Math.max(this.f5848g, this.f5832T - ((this.f5831S * 9) / 16)), this.f5830R);
            i = this.f5861v;
        } else {
            if (!this.f5853n && !this.f5854o && (i5 = this.f5852m) > 0) {
                return Math.max(this.f5846e, i5 + this.h);
            }
            iMin = this.f5846e;
            i = this.f5861v;
        }
        return iMin + i;
    }

    public final void u(int i) {
        if (((View) this.f5833U.get()) != null) {
            ArrayList arrayList = this.f5835W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i5 = this.G;
            if (i <= i5 && i5 != x()) {
                x();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            B.a.p(arrayList.get(0));
            throw null;
        }
    }

    public final int x() {
        if (this.f5840b) {
            return this.f5817D;
        }
        return Math.max(this.f5816C, this.f5857r ? 0 : this.f5862w);
    }

    public final int y(int i) {
        if (i == 3) {
            return x();
        }
        if (i == 4) {
            return this.G;
        }
        if (i == 5) {
            return this.f5832T;
        }
        if (i == 6) {
            return this.f5818E;
        }
        throw new IllegalArgumentException(B.a.g(i, "Invalid state to get top offset: "));
    }

    public final boolean z() {
        WeakReference weakReference = this.f5833U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f5833U.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i;
        int i5 = 0;
        this.f5838a = 0;
        this.f5840b = true;
        this.f5850k = -1;
        this.f5851l = -1;
        this.f5814A = new h(this);
        this.f5819F = 0.5f;
        this.f5820H = -1.0f;
        this.f5823K = true;
        this.f5824L = 4;
        this.f5829Q = 0.1f;
        this.f5835W = new ArrayList();
        this.f5837Z = -1;
        this.f5843c0 = new SparseIntArray();
        this.f5845d0 = new F1.e(this, i5);
        this.h = context.getResources().getDimensionPixelSize(2131100366);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A1.a.f43b);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f5849j = r1.d.x(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.f5864y = m.b(context, attributeSet, 2130903163, 2131952435).a();
        }
        m mVar = this.f5864y;
        if (mVar != null) {
            X1.h hVar = new X1.h(mVar);
            this.i = hVar;
            hVar.j(context);
            ColorStateList colorStateList = this.f5849j;
            if (colorStateList != null) {
                this.i.m(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(s(), 1.0f);
        this.f5815B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f5815B.addUpdateListener(new F1.c(this, i5));
        this.f5820H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f5850k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f5851l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            A(i);
        } else {
            A(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (this.f5821I != z4) {
            this.f5821I = z4;
            if (!z4 && this.f5824L == 5) {
                B(4);
            }
            F();
        }
        this.f5853n = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f5840b != z5) {
            this.f5840b = z5;
            if (this.f5833U != null) {
                r();
            }
            C((this.f5840b && this.f5824L == 6) ? 3 : this.f5824L);
            G(this.f5824L, true);
            F();
        }
        this.f5822J = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.f5823K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f5838a = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f2 = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f2 > 0.0f && f2 < 1.0f) {
            this.f5819F = f2;
            if (this.f5833U != null) {
                this.f5818E = (int) ((1.0f - f2) * this.f5832T);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i6 = typedValuePeekValue2.data;
                if (i6 >= 0) {
                    this.f5816C = i6;
                    G(this.f5824L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f5816C = dimensionPixelOffset;
                    G(this.f5824L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f5844d = typedArrayObtainStyledAttributes.getInt(11, 500);
            this.f5854o = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f5855p = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f5856q = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f5857r = typedArrayObtainStyledAttributes.getBoolean(20, true);
            this.f5858s = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.f5859t = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.f5860u = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.f5863x = typedArrayObtainStyledAttributes.getBoolean(23, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f5842c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
