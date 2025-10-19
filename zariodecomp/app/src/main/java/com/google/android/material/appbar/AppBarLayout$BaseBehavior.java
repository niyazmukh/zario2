package com.google.android.material.appbar;

import C1.a;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\appbar\AppBarLayout$BaseBehavior.smali */
public class AppBarLayout$BaseBehavior<T> extends a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f5788b;

    /* renamed from: d, reason: collision with root package name */
    public int f5790d;

    /* renamed from: f, reason: collision with root package name */
    public VelocityTracker f5792f;

    /* renamed from: c, reason: collision with root package name */
    public int f5789c = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f5791e = -1;

    public AppBarLayout$BaseBehavior() {
    }

    @Override // y.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f5791e < 0) {
            this.f5791e = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f5788b) {
            int i = this.f5789c;
            if (i == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y4 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y4 - this.f5790d) > this.f5791e) {
                this.f5790d = y4;
                return true;
            }
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f5792f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.f5789c = -1;
        motionEvent.getX();
        motionEvent.getY();
        throw new ClassCastException();
    }

    @Override // C1.a, y.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    @Override // y.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i5, int i6) {
        throw new ClassCastException();
    }

    @Override // y.a
    public final /* synthetic */ void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i5, int[] iArr, int i6) {
        throw new ClassCastException();
    }

    @Override // y.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i5, int i6, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // y.a
    public final void m(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    @Override // y.a
    public final Parcelable n(View view) {
        throw new ClassCastException();
    }

    @Override // y.a
    public final boolean o(View view, int i, int i5) {
        throw new ClassCastException();
    }

    @Override // y.a
    public final void p(View view, View view2, int i) {
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    @Override // y.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            int r0 = r7.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L45
            r4 = 2
            if (r0 == r4) goto L2c
            r6 = 3
            if (r0 == r6) goto L49
            r6 = 6
            if (r0 == r6) goto L13
            goto L57
        L13:
            int r6 = r7.getActionIndex()
            if (r6 != 0) goto L1a
            goto L1b
        L1a:
            r2 = r3
        L1b:
            int r6 = r7.getPointerId(r2)
            r5.f5789c = r6
            float r6 = r7.getY(r2)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 + r0
            int r6 = (int) r6
            r5.f5790d = r6
            goto L57
        L2c:
            int r0 = r5.f5789c
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r1) goto L35
            return r3
        L35:
            float r7 = r7.getY(r0)
            int r7 = (int) r7
            r5.f5790d = r7
            r6.getClass()
            java.lang.ClassCastException r5 = new java.lang.ClassCastException
            r5.<init>()
            throw r5
        L45:
            android.view.VelocityTracker r0 = r5.f5792f
            if (r0 != 0) goto L61
        L49:
            r5.f5788b = r3
            r5.f5789c = r1
            android.view.VelocityTracker r6 = r5.f5792f
            if (r6 == 0) goto L57
            r6.recycle()
            r6 = 0
            r5.f5792f = r6
        L57:
            android.view.VelocityTracker r6 = r5.f5792f
            if (r6 == 0) goto L5e
            r6.addMovement(r7)
        L5e:
            boolean r5 = r5.f5788b
            return r5
        L61:
            r0.addMovement(r7)
            android.view.VelocityTracker r7 = r5.f5792f
            r0 = 1000(0x3e8, float:1.401E-42)
            r7.computeCurrentVelocity(r0)
            android.view.VelocityTracker r7 = r5.f5792f
            int r5 = r5.f5789c
            r7.getYVelocity(r5)
            r6.getClass()
            java.lang.ClassCastException r5 = new java.lang.ClassCastException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.q(android.view.View, android.view.MotionEvent):boolean");
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
