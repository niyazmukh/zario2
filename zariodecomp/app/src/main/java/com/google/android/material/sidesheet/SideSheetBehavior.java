package com.google.android.material.sidesheet;

import A2.C0014n;
import M.B;
import M.E;
import M.H;
import M.L;
import M.S;
import N.i;
import N2.AbstractC0156x;
import V.e;
import X1.h;
import X1.l;
import X1.m;
import Y1.b;
import a.AbstractC0183a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import r1.d;
import y.C1041d;
import y.a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\sidesheet\SideSheetBehavior.smali */
public class SideSheetBehavior<V extends View> extends a {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0183a f6090a;

    /* renamed from: b, reason: collision with root package name */
    public final h f6091b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f6092c;

    /* renamed from: d, reason: collision with root package name */
    public final m f6093d;

    /* renamed from: e, reason: collision with root package name */
    public final F1.h f6094e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6095f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6096g;
    public int h;
    public e i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6097j;

    /* renamed from: k, reason: collision with root package name */
    public final float f6098k;

    /* renamed from: l, reason: collision with root package name */
    public int f6099l;

    /* renamed from: m, reason: collision with root package name */
    public int f6100m;

    /* renamed from: n, reason: collision with root package name */
    public int f6101n;

    /* renamed from: o, reason: collision with root package name */
    public int f6102o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f6103p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f6104q;

    /* renamed from: r, reason: collision with root package name */
    public final int f6105r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f6106s;

    /* renamed from: t, reason: collision with root package name */
    public int f6107t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f6108u;

    /* renamed from: v, reason: collision with root package name */
    public final F1.e f6109v;

    public SideSheetBehavior() {
        this.f6094e = new F1.h(this);
        this.f6096g = true;
        this.h = 5;
        this.f6098k = 0.1f;
        this.f6105r = -1;
        this.f6108u = new LinkedHashSet();
        this.f6109v = new F1.e(this, 1);
    }

    @Override // y.a
    public final void c(C1041d c1041d) {
        this.f6103p = null;
        this.i = null;
    }

    @Override // y.a
    public final void e() {
        this.f6103p = null;
        this.i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    @Override // y.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.MotionEvent r5) {
        /*
            r2 = this;
            boolean r3 = r4.isShown()
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L12
            java.util.WeakHashMap r3 = M.S.f2363a
            java.lang.CharSequence r3 = M.L.b(r4)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L5c
        L12:
            boolean r3 = r2.f6096g
            if (r3 == 0) goto L5c
            int r3 = r5.getActionMasked()
            if (r3 != 0) goto L26
            android.view.VelocityTracker r4 = r2.f6106s
            if (r4 == 0) goto L26
            r4.recycle()
            r4 = 0
            r2.f6106s = r4
        L26:
            android.view.VelocityTracker r4 = r2.f6106s
            if (r4 != 0) goto L30
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r2.f6106s = r4
        L30:
            android.view.VelocityTracker r4 = r2.f6106s
            r4.addMovement(r5)
            if (r3 == 0) goto L44
            if (r3 == r0) goto L3d
            r4 = 3
            if (r3 == r4) goto L3d
            goto L4b
        L3d:
            boolean r3 = r2.f6097j
            if (r3 == 0) goto L4b
            r2.f6097j = r1
            return r1
        L44:
            float r3 = r5.getX()
            int r3 = (int) r3
            r2.f6107t = r3
        L4b:
            boolean r3 = r2.f6097j
            if (r3 != 0) goto L5a
            V.e r2 = r2.i
            if (r2 == 0) goto L5a
            boolean r2 = r2.p(r5)
            if (r2 == 0) goto L5a
            goto L5b
        L5a:
            r0 = r1
        L5b:
            return r0
        L5c:
            r2.f6097j = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.f(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // y.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) throws Resources.NotFoundException {
        View view2;
        View view3;
        int i5;
        View viewFindViewById;
        int iJ = 0;
        int i6 = 1;
        h hVar = this.f6091b;
        WeakHashMap weakHashMap = S.f2363a;
        if (B.b(coordinatorLayout) && !B.b(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f6103p == null) {
            this.f6103p = new WeakReference(view);
            Context context = view.getContext();
            AbstractC0156x.e0(context, 2130903842, O.a.b(0.0f, 0.0f, 0.0f, 1.0f));
            AbstractC0156x.d0(context, 2130903825, 300);
            AbstractC0156x.d0(context, 2130903830, 150);
            AbstractC0156x.d0(context, 2130903829, 100);
            Resources resources = view.getResources();
            resources.getDimension(2131099842);
            resources.getDimension(2131099841);
            resources.getDimension(2131099843);
            if (hVar != null) {
                B.q(view, hVar);
                float fI = this.f6095f;
                if (fI == -1.0f) {
                    fI = H.i(view);
                }
                hVar.l(fI);
            } else {
                ColorStateList colorStateList = this.f6092c;
                if (colorStateList != null) {
                    H.q(view, colorStateList);
                }
            }
            int i7 = this.h == 5 ? 4 : 0;
            if (view.getVisibility() != i7) {
                view.setVisibility(i7);
            }
            u();
            if (B.c(view) == 0) {
                B.s(view, 1);
            }
            if (L.b(view) == null) {
                S.i(view, view.getResources().getString(2131886490));
            }
        }
        int i8 = Gravity.getAbsoluteGravity(((C1041d) view.getLayoutParams()).f11029c, i) == 3 ? 1 : 0;
        AbstractC0183a abstractC0183a = this.f6090a;
        if (abstractC0183a == null || abstractC0183a.L() != i8) {
            m mVar = this.f6093d;
            C1041d c1041d = null;
            if (i8 == 0) {
                this.f6090a = new Y1.a(this, i6);
                if (mVar != null) {
                    WeakReference weakReference = this.f6103p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof C1041d)) {
                        c1041d = (C1041d) view3.getLayoutParams();
                    }
                    if (c1041d == null || ((ViewGroup.MarginLayoutParams) c1041d).rightMargin <= 0) {
                        l lVarE = mVar.e();
                        lVarE.f3768f = new X1.a(0.0f);
                        lVarE.f3769g = new X1.a(0.0f);
                        m mVarA = lVarE.a();
                        if (hVar != null) {
                            hVar.setShapeAppearanceModel(mVarA);
                        }
                    }
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalArgumentException(B.a.i("Invalid sheet edge position value: ", i8, ". Must be 0 or 1."));
                }
                this.f6090a = new Y1.a(this, iJ);
                if (mVar != null) {
                    WeakReference weakReference2 = this.f6103p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof C1041d)) {
                        c1041d = (C1041d) view2.getLayoutParams();
                    }
                    if (c1041d == null || ((ViewGroup.MarginLayoutParams) c1041d).leftMargin <= 0) {
                        l lVarE2 = mVar.e();
                        lVarE2.f3767e = new X1.a(0.0f);
                        lVarE2.h = new X1.a(0.0f);
                        m mVarA2 = lVarE2.a();
                        if (hVar != null) {
                            hVar.setShapeAppearanceModel(mVarA2);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f6109v);
        }
        int iJ2 = this.f6090a.J(view);
        coordinatorLayout.q(view, i);
        this.f6100m = coordinatorLayout.getWidth();
        this.f6101n = this.f6090a.K(coordinatorLayout);
        this.f6099l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f6102o = marginLayoutParams != null ? this.f6090a.k(marginLayoutParams) : 0;
        int i9 = this.h;
        if (i9 == 1 || i9 == 2) {
            iJ = iJ2 - this.f6090a.J(view);
        } else if (i9 != 3) {
            if (i9 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.h);
            }
            iJ = this.f6090a.F();
        }
        view.offsetLeftAndRight(iJ);
        if (this.f6104q == null && (i5 = this.f6105r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i5)) != null) {
            this.f6104q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f6108u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // y.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i6, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // y.a
    public final void m(View view, Parcelable parcelable) {
        int i = ((b) parcelable).f3873c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // y.a
    public final Parcelable n(View view) {
        return new b(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // y.a
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (s()) {
            this.i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f6106s) != null) {
            velocityTracker.recycle();
            this.f6106s = null;
        }
        if (this.f6106s == null) {
            this.f6106s = VelocityTracker.obtain();
        }
        this.f6106s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.f6097j && s()) {
            float fAbs = Math.abs(this.f6107t - motionEvent.getX());
            e eVar = this.i;
            if (fAbs > eVar.f3406b) {
                eVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f6097j;
    }

    public final void r(int i) {
        View view;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference weakReference = this.f6103p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i5 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i5) {
            view.setVisibility(i5);
        }
        Iterator it = this.f6108u.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        u();
    }

    public final boolean s() {
        return this.i != null && (this.f6096g || this.h == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        r(2);
        r2.f6094e.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L19
            r0 = 5
            if (r4 != r0) goto Ld
            a.a r0 = r2.f6090a
            int r0 = r0.F()
            goto L1f
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Invalid state to get outer edge offset: "
            java.lang.String r3 = B.a.g(r4, r3)
            r2.<init>(r3)
            throw r2
        L19:
            a.a r0 = r2.f6090a
            int r0 = r0.D()
        L1f:
            V.e r1 = r2.i
            if (r1 == 0) goto L57
            if (r5 == 0) goto L30
            int r3 = r3.getTop()
            boolean r3 = r1.o(r0, r3)
            if (r3 == 0) goto L57
            goto L4d
        L30:
            int r5 = r3.getTop()
            r1.f3420r = r3
            r3 = -1
            r1.f3407c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L4b
            int r5 = r1.f3405a
            if (r5 != 0) goto L4b
            android.view.View r5 = r1.f3420r
            if (r5 == 0) goto L4b
            r5 = 0
            r1.f3420r = r5
        L4b:
            if (r3 == 0) goto L57
        L4d:
            r3 = 2
            r2.r(r3)
            F1.h r2 = r2.f6094e
            r2.b(r4)
            goto L5a
        L57:
            r2.r(r4)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.t(android.view.View, int, boolean):void");
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f6103p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        S.f(view, 262144);
        S.d(view, 0);
        S.f(view, 1048576);
        S.d(view, 0);
        int i = 5;
        if (this.h != 5) {
            S.g(view, i.f2534j, new C0014n(this, i));
        }
        int i5 = 3;
        if (this.h != 3) {
            S.g(view, i.h, new C0014n(this, i5));
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f6094e = new F1.h(this);
        this.f6096g = true;
        this.h = 5;
        this.f6098k = 0.1f;
        this.f6105r = -1;
        this.f6108u = new LinkedHashSet();
        this.f6109v = new F1.e(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A1.a.f35D);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f6092c = d.x(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f6093d = m.b(context, attributeSet, 0, 2131952580).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f6105r = resourceId;
            WeakReference weakReference = this.f6104q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f6104q = null;
            WeakReference weakReference2 = this.f6103p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = S.f2363a;
                    if (E.c(view)) {
                        view.requestLayout();
                    }
                }
            }
        }
        m mVar = this.f6093d;
        if (mVar != null) {
            h hVar = new h(mVar);
            this.f6091b = hVar;
            hVar.j(context);
            ColorStateList colorStateList = this.f6092c;
            if (colorStateList != null) {
                this.f6091b.m(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.f6091b.setTint(typedValue.data);
            }
        }
        this.f6095f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f6096g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
