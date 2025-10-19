package t0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: t0.B, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\B.smali */
public class C0895B {

    /* renamed from: a, reason: collision with root package name */
    public int f9875a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f9876b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC0910Q f9877c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9878d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9879e;

    /* renamed from: f, reason: collision with root package name */
    public View f9880f;

    /* renamed from: g, reason: collision with root package name */
    public final b0 f9881g;
    public boolean h;
    public final LinearInterpolator i;

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f9882j;

    /* renamed from: k, reason: collision with root package name */
    public PointF f9883k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f9884l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9885m;

    /* renamed from: n, reason: collision with root package name */
    public float f9886n;

    /* renamed from: o, reason: collision with root package name */
    public int f9887o;

    /* renamed from: p, reason: collision with root package name */
    public int f9888p;

    public C0895B(Context context) {
        b0 b0Var = new b0();
        b0Var.f9956d = -1;
        b0Var.f9958f = false;
        b0Var.f9959g = 0;
        b0Var.f9953a = 0;
        b0Var.f9954b = 0;
        b0Var.f9955c = Integer.MIN_VALUE;
        b0Var.f9957e = null;
        this.f9881g = b0Var;
        this.i = new LinearInterpolator();
        this.f9882j = new DecelerateInterpolator();
        this.f9885m = false;
        this.f9887o = 0;
        this.f9888p = 0;
        this.f9884l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i5, int i6, int i7, int i8) {
        if (i8 == -1) {
            return i6 - i;
        }
        if (i8 != 0) {
            if (i8 == 1) {
                return i7 - i5;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i9 = i6 - i;
        if (i9 > 0) {
            return i9;
        }
        int i10 = i7 - i5;
        if (i10 < 0) {
            return i10;
        }
        return 0;
    }

    public int b(View view, int i) {
        AbstractC0910Q abstractC0910Q = this.f9877c;
        if (abstractC0910Q == null || !abstractC0910Q.d()) {
            return 0;
        }
        C0911S c0911s = (C0911S) view.getLayoutParams();
        return a((view.getLeft() - ((C0911S) view.getLayoutParams()).f9928b.left) - ((ViewGroup.MarginLayoutParams) c0911s).leftMargin, view.getRight() + ((C0911S) view.getLayoutParams()).f9928b.right + ((ViewGroup.MarginLayoutParams) c0911s).rightMargin, abstractC0910Q.C(), abstractC0910Q.f9925n - abstractC0910Q.D(), i);
    }

    public int c(View view, int i) {
        AbstractC0910Q abstractC0910Q = this.f9877c;
        if (abstractC0910Q == null || !abstractC0910Q.e()) {
            return 0;
        }
        C0911S c0911s = (C0911S) view.getLayoutParams();
        return a((view.getTop() - ((C0911S) view.getLayoutParams()).f9928b.top) - ((ViewGroup.MarginLayoutParams) c0911s).topMargin, view.getBottom() + ((C0911S) view.getLayoutParams()).f9928b.bottom + ((ViewGroup.MarginLayoutParams) c0911s).bottomMargin, abstractC0910Q.E(), abstractC0910Q.f9926o - abstractC0910Q.B(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float fAbs = Math.abs(i);
        if (!this.f9885m) {
            this.f9886n = d(this.f9884l);
            this.f9885m = true;
        }
        return (int) Math.ceil(fAbs * this.f9886n);
    }

    public PointF f(int i) {
        Object obj = this.f9877c;
        if (obj instanceof c0) {
            return ((c0) obj).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + c0.class.getCanonicalName());
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.C0895B.g(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(android.view.View r7, t0.b0 r8) {
        /*
            r6 = this;
            android.graphics.PointF r0 = r6.f9883k
            r1 = 1
            r2 = 0
            r3 = -1
            r4 = 0
            if (r0 == 0) goto L15
            float r0 = r0.x
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L15
        Lf:
            if (r0 <= 0) goto L13
            r0 = r1
            goto L16
        L13:
            r0 = r3
            goto L16
        L15:
            r0 = r2
        L16:
            int r0 = r6.b(r7, r0)
            android.graphics.PointF r5 = r6.f9883k
            if (r5 == 0) goto L2a
            float r5 = r5.y
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L25
            goto L2a
        L25:
            if (r4 <= 0) goto L29
            r2 = r1
            goto L2a
        L29:
            r2 = r3
        L2a:
            int r7 = r6.c(r7, r2)
            int r2 = r0 * r0
            int r3 = r7 * r7
            int r3 = r3 + r2
            double r2 = (double) r3
            double r2 = java.lang.Math.sqrt(r2)
            int r2 = (int) r2
            int r2 = r6.e(r2)
            double r2 = (double) r2
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r2 = r2 / r4
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            if (r2 <= 0) goto L59
            int r0 = -r0
            int r7 = -r7
            android.view.animation.DecelerateInterpolator r6 = r6.f9882j
            r8.f9953a = r0
            r8.f9954b = r7
            r8.f9955c = r2
            r8.f9957e = r6
            r8.f9958f = r1
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.C0895B.h(android.view.View, t0.b0):void");
    }

    public final void i() {
        if (this.f9879e) {
            this.f9879e = false;
            this.f9888p = 0;
            this.f9887o = 0;
            this.f9883k = null;
            this.f9876b.f4745i0.f9972a = -1;
            this.f9880f = null;
            this.f9875a = -1;
            this.f9878d = false;
            AbstractC0910Q abstractC0910Q = this.f9877c;
            if (abstractC0910Q.f9918e == this) {
                abstractC0910Q.f9918e = null;
            }
            this.f9877c = null;
            this.f9876b = null;
        }
    }
}
