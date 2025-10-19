package com.google.android.material.carousel;

import A2.RunnableC0005e;
import B.a;
import I1.b;
import I1.c;
import I1.d;
import I1.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import t0.AbstractC0910Q;
import t0.C0911S;
import t0.X;
import t0.c0;
import t0.d0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\carousel\CarouselLayoutManager.smali */
public class CarouselLayoutManager extends AbstractC0910Q implements c0 {

    /* renamed from: p, reason: collision with root package name */
    public e f5900p;

    /* renamed from: q, reason: collision with root package name */
    public final View.OnLayoutChangeListener f5901q;

    public CarouselLayoutManager() {
        new G2.e();
        new c();
        this.f5901q = new View.OnLayoutChangeListener() { // from class: I1.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                CarouselLayoutManager carouselLayoutManager = this.f1920a;
                carouselLayoutManager.getClass();
                if (i == i8 && i5 == i9 && i6 == i10 && i7 == i11) {
                    return;
                }
                view.post(new RunnableC0005e(carouselLayoutManager, 10));
            }
        };
        j0();
        A0(0);
    }

    public final void A0(int i) {
        d dVar;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(a.g(i, "invalid orientation:"));
        }
        c(null);
        e eVar = this.f5900p;
        if (eVar == null || i != eVar.f1927a) {
            if (i == 0) {
                dVar = new d(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                dVar = new d(this, 0);
            }
            this.f5900p = dVar;
            j0();
        }
    }

    @Override // t0.AbstractC0910Q
    public final void O(RecyclerView recyclerView) {
        j0();
        recyclerView.addOnLayoutChangeListener(this.f5901q);
    }

    @Override // t0.AbstractC0910Q
    public final void P(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f5901q);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    @Override // t0.AbstractC0910Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View Q(android.view.View r5, int r6, t0.X r7, t0.d0 r8) {
        /*
            r4 = this;
            int r7 = r4.v()
            r8 = 0
            if (r7 != 0) goto L8
            return r8
        L8:
            I1.e r7 = r4.f5900p
            int r7 = r7.f1927a
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = -1
            r2 = 1
            if (r6 == r2) goto L53
            r3 = 2
            if (r6 == r3) goto L51
            r3 = 17
            if (r6 == r3) goto L49
            r3 = 33
            if (r6 == r3) goto L46
            r3 = 66
            if (r6 == r3) goto L3d
            r3 = 130(0x82, float:1.82E-43)
            if (r6 == r3) goto L3a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown focus request:"
            r7.<init>(r3)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "CarouselLayoutManager"
            android.util.Log.d(r7, r6)
        L38:
            r6 = r0
            goto L54
        L3a:
            if (r7 != r2) goto L38
            goto L51
        L3d:
            if (r7 != 0) goto L38
            boolean r6 = r4.z0()
            if (r6 == 0) goto L51
            goto L53
        L46:
            if (r7 != r2) goto L38
            goto L53
        L49:
            if (r7 != 0) goto L38
            boolean r6 = r4.z0()
            if (r6 == 0) goto L53
        L51:
            r6 = r2
            goto L54
        L53:
            r6 = r1
        L54:
            if (r6 != r0) goto L57
            return r8
        L57:
            r7 = 0
            if (r6 != r1) goto L8b
            int r5 = t0.AbstractC0910Q.F(r5)
            if (r5 != 0) goto L61
            return r8
        L61:
            android.view.View r5 = r4.u(r7)
            int r5 = t0.AbstractC0910Q.F(r5)
            int r5 = r5 - r2
            if (r5 < 0) goto L7a
            int r6 = r4.z()
            if (r5 < r6) goto L73
            goto L7a
        L73:
            I1.e r4 = r4.f5900p
            r4.f()
            r4 = 0
            throw r4
        L7a:
            boolean r5 = r4.z0()
            if (r5 == 0) goto L86
            int r5 = r4.v()
            int r7 = r5 + (-1)
        L86:
            android.view.View r4 = r4.u(r7)
            goto Lc6
        L8b:
            int r5 = t0.AbstractC0910Q.F(r5)
            int r6 = r4.z()
            int r6 = r6 - r2
            if (r5 != r6) goto L97
            return r8
        L97:
            int r5 = r4.v()
            int r5 = r5 - r2
            android.view.View r5 = r4.u(r5)
            int r5 = t0.AbstractC0910Q.F(r5)
            int r5 = r5 + r2
            if (r5 < 0) goto Lb5
            int r6 = r4.z()
            if (r5 < r6) goto Lae
            goto Lb5
        Lae:
            I1.e r4 = r4.f5900p
            r4.f()
            r4 = 0
            throw r4
        Lb5:
            boolean r5 = r4.z0()
            if (r5 == 0) goto Lbc
            goto Lc2
        Lbc:
            int r5 = r4.v()
            int r7 = r5 + (-1)
        Lc2:
            android.view.View r4 = r4.u(r7)
        Lc6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.Q(android.view.View, int, t0.X, t0.d0):android.view.View");
    }

    @Override // t0.AbstractC0910Q
    public final void R(AccessibilityEvent accessibilityEvent) {
        super.R(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(AbstractC0910Q.F(u(0)));
            accessibilityEvent.setToIndex(AbstractC0910Q.F(u(v() - 1)));
        }
    }

    @Override // t0.AbstractC0910Q
    public final void U(int i, int i5) {
        z();
    }

    @Override // t0.AbstractC0910Q
    public final void X(int i, int i5) {
        z();
    }

    @Override // t0.AbstractC0910Q
    public final void Z(X x3, d0 d0Var) {
        if (d0Var.b() > 0) {
            if ((y0() ? this.f9925n : this.f9926o) > 0.0f) {
                z0();
                View view = x3.i(0, Long.MAX_VALUE).f10004a;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        e0(x3);
    }

    @Override // t0.c0
    public final PointF a(int i) {
        return null;
    }

    @Override // t0.AbstractC0910Q
    public final void a0(d0 d0Var) {
        if (v() == 0) {
            return;
        }
        AbstractC0910Q.F(u(0));
    }

    @Override // t0.AbstractC0910Q
    public final boolean d() {
        return y0();
    }

    @Override // t0.AbstractC0910Q
    public final boolean e() {
        return !y0();
    }

    @Override // t0.AbstractC0910Q
    public final boolean i0(RecyclerView recyclerView, View view, Rect rect, boolean z4, boolean z5) {
        return false;
    }

    @Override // t0.AbstractC0910Q
    public final int j(d0 d0Var) {
        v();
        return 0;
    }

    @Override // t0.AbstractC0910Q
    public final int k(d0 d0Var) {
        return 0;
    }

    @Override // t0.AbstractC0910Q
    public final int k0(int i, X x3, d0 d0Var) {
        if (!y0() || v() == 0 || i == 0) {
            return 0;
        }
        View view = x3.i(0, Long.MAX_VALUE).f10004a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // t0.AbstractC0910Q
    public final int l(d0 d0Var) {
        return 0;
    }

    @Override // t0.AbstractC0910Q
    public final void l0(int i) {
    }

    @Override // t0.AbstractC0910Q
    public final int m(d0 d0Var) {
        v();
        return 0;
    }

    @Override // t0.AbstractC0910Q
    public final int m0(int i, X x3, d0 d0Var) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        View view = x3.i(0, Long.MAX_VALUE).f10004a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // t0.AbstractC0910Q
    public final int n(d0 d0Var) {
        return 0;
    }

    @Override // t0.AbstractC0910Q
    public final int o(d0 d0Var) {
        return 0;
    }

    @Override // t0.AbstractC0910Q
    public final C0911S r() {
        return new C0911S(-2, -2);
    }

    @Override // t0.AbstractC0910Q
    public final void v0(RecyclerView recyclerView, int i) {
        b bVar = new b(this, recyclerView.getContext(), 0);
        bVar.f9875a = i;
        w0(bVar);
    }

    @Override // t0.AbstractC0910Q
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (y0()) {
            rect.centerX();
        }
        throw null;
    }

    public final boolean y0() {
        return this.f5900p.f1927a == 0;
    }

    public final boolean z0() {
        return y0() && A() == 1;
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i5) {
        new c();
        this.f5901q = new View.OnLayoutChangeListener() { // from class: I1.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i6, int i52, int i62, int i7, int i8, int i9, int i10, int i11) {
                CarouselLayoutManager carouselLayoutManager = this.f1920a;
                carouselLayoutManager.getClass();
                if (i6 == i8 && i52 == i9 && i62 == i10 && i7 == i11) {
                    return;
                }
                view.post(new RunnableC0005e(carouselLayoutManager, 10));
            }
        };
        new G2.e();
        j0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A1.a.f45d);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            j0();
            A0(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
