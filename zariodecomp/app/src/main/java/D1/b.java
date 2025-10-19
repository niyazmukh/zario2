package D1;

import M.C;
import M.S;
import S0.n;
import a2.AbstractC0193h;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import g1.i;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\D1\b.smali */
public final class b extends p1.b {

    /* renamed from: f, reason: collision with root package name */
    public int f1316f;

    /* renamed from: g, reason: collision with root package name */
    public int f1317g = -1;
    public final /* synthetic */ SwipeDismissBehavior h;

    public b(SwipeDismissBehavior swipeDismissBehavior) {
        this.h = swipeDismissBehavior;
    }

    @Override // p1.b
    public final void G(View view, int i) {
        this.f1317g = i;
        this.f1316f = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.h;
            swipeDismissBehavior.f5810d = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f5810d = false;
        }
    }

    @Override // p1.b
    public final void H(int i) {
        i iVar = this.h.f5808b;
        if (iVar != null) {
            AbstractC0193h abstractC0193h = (AbstractC0193h) iVar.f7594b;
            if (i == 0) {
                n.i().o(abstractC0193h.f4102t);
            } else if (i == 1 || i == 2) {
                n.i().n(abstractC0193h.f4102t);
            }
        }
    }

    @Override // p1.b
    public final void I(View view, int i, int i5) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.h;
        float f2 = width * swipeDismissBehavior.f5812f;
        float width2 = view.getWidth() * swipeDismissBehavior.f5813g;
        float fAbs = Math.abs(i - this.f1316f);
        if (fAbs <= f2) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f2) / (width2 - f2))), 1.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    @Override // p1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = 1
            r0 = -1
            r8.f1317g = r0
            int r0 = r9.getWidth()
            r1 = 0
            int r2 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.h
            r4 = 0
            if (r2 == 0) goto L39
            java.util.WeakHashMap r5 = M.S.f2363a
            int r5 = M.C.d(r9)
            if (r5 != r11) goto L1a
            r5 = r11
            goto L1b
        L1a:
            r5 = r4
        L1b:
            int r6 = r3.f5811e
            r7 = 2
            if (r6 != r7) goto L21
            goto L55
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r2 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r2 >= 0) goto L6a
            goto L55
        L2a:
            if (r2 <= 0) goto L6a
            goto L55
        L2d:
            if (r6 != r11) goto L6a
            if (r5 == 0) goto L34
            if (r2 <= 0) goto L6a
            goto L55
        L34:
            int r2 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r2 >= 0) goto L6a
            goto L55
        L39:
            int r2 = r9.getLeft()
            int r5 = r8.f1316f
            int r2 = r2 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r3.getClass()
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r2 = java.lang.Math.abs(r2)
            if (r2 < r5) goto L6a
        L55:
            int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r10 < 0) goto L64
            int r10 = r9.getLeft()
            int r1 = r8.f1316f
            if (r10 >= r1) goto L62
            goto L64
        L62:
            int r1 = r1 + r0
            goto L68
        L64:
            int r8 = r8.f1316f
            int r1 = r8 - r0
        L68:
            r4 = r11
            goto L6c
        L6a:
            int r1 = r8.f1316f
        L6c:
            V.e r8 = r3.f5807a
            int r10 = r9.getTop()
            boolean r8 = r8.o(r1, r10)
            if (r8 == 0) goto L83
            B3.u0 r8 = new B3.u0
            r8.<init>(r11, r3, r9, r4)
            java.util.WeakHashMap r10 = M.S.f2363a
            M.B.m(r9, r8)
            goto L8c
        L83:
            if (r4 == 0) goto L8c
            g1.i r8 = r3.f5808b
            if (r8 == 0) goto L8c
            r8.x(r9)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D1.b.J(android.view.View, float, float):void");
    }

    @Override // p1.b
    public final boolean S(View view, int i) {
        int i5 = this.f1317g;
        return (i5 == -1 || i5 == i) && this.h.r(view);
    }

    @Override // p1.b
    public final int l(View view, int i) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = S.f2363a;
        boolean z4 = C.d(view) == 1;
        int i5 = this.h.f5811e;
        if (i5 == 0) {
            if (z4) {
                width = this.f1316f - view.getWidth();
                width2 = this.f1316f;
            } else {
                width = this.f1316f;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i5 != 1) {
            width = this.f1316f - view.getWidth();
            width2 = this.f1316f + view.getWidth();
        } else if (z4) {
            width = this.f1316f;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f1316f - view.getWidth();
            width2 = this.f1316f;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // p1.b
    public final int m(View view, int i) {
        return view.getTop();
    }

    @Override // p1.b
    public final int v(View view) {
        return view.getWidth();
    }
}
