package t0;

import M.C0118c;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\i0.smali */
public final class i0 extends C0118c {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f10033d;

    /* renamed from: e, reason: collision with root package name */
    public final h0 f10034e;

    public i0(RecyclerView recyclerView) {
        this.f10033d = recyclerView;
        h0 h0Var = this.f10034e;
        if (h0Var != null) {
            this.f10034e = h0Var;
        } else {
            this.f10034e = new h0(this);
        }
    }

    @Override // M.C0118c
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f10033d.K()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().R(accessibilityEvent);
        }
    }

    @Override // M.C0118c
    public final void d(View view, N.o oVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2375a;
        AccessibilityNodeInfo accessibilityNodeInfo = oVar.f2543a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.f10033d;
        if (recyclerView.K() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC0910Q layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f9915b;
        X x3 = recyclerView2.f4733b;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f9915b.canScrollHorizontally(-1)) {
            oVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f9915b.canScrollVertically(1) || layoutManager.f9915b.canScrollHorizontally(1)) {
            oVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        d0 d0Var = recyclerView2.f4745i0;
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.H(x3, d0Var), layoutManager.x(x3, d0Var), false, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056 A[PHI: r3
  0x0056: PHI (r3v11 int) = (r3v7 int), (r3v15 int) binds: [B:27:0x0072, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // M.C0118c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(android.view.View r3, int r4, android.os.Bundle r5) {
        /*
            r2 = this;
            boolean r3 = super.g(r3, r4, r5)
            r5 = 1
            if (r3 == 0) goto L8
            return r5
        L8:
            androidx.recyclerview.widget.RecyclerView r2 = r2.f10033d
            boolean r3 = r2.K()
            r0 = 0
            if (r3 != 0) goto L8c
            t0.Q r3 = r2.getLayoutManager()
            if (r3 == 0) goto L8c
            t0.Q r2 = r2.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r3 = r2.f9915b
            t0.X r1 = r3.f4733b
            r1 = 4096(0x1000, float:5.74E-42)
            if (r4 == r1) goto L58
            r1 = 8192(0x2000, float:1.148E-41)
            if (r4 == r1) goto L2a
            r3 = r0
            r4 = r3
            goto L80
        L2a:
            r4 = -1
            boolean r3 = r3.canScrollVertically(r4)
            if (r3 == 0) goto L3f
            int r3 = r2.f9926o
            int r1 = r2.E()
            int r3 = r3 - r1
            int r1 = r2.B()
            int r3 = r3 - r1
            int r3 = -r3
            goto L40
        L3f:
            r3 = r0
        L40:
            androidx.recyclerview.widget.RecyclerView r1 = r2.f9915b
            boolean r4 = r1.canScrollHorizontally(r4)
            if (r4 == 0) goto L56
            int r4 = r2.f9925n
            int r1 = r2.C()
            int r4 = r4 - r1
            int r1 = r2.D()
            int r4 = r4 - r1
            int r4 = -r4
            goto L80
        L56:
            r4 = r0
            goto L80
        L58:
            boolean r3 = r3.canScrollVertically(r5)
            if (r3 == 0) goto L6b
            int r3 = r2.f9926o
            int r4 = r2.E()
            int r3 = r3 - r4
            int r4 = r2.B()
            int r3 = r3 - r4
            goto L6c
        L6b:
            r3 = r0
        L6c:
            androidx.recyclerview.widget.RecyclerView r4 = r2.f9915b
            boolean r4 = r4.canScrollHorizontally(r5)
            if (r4 == 0) goto L56
            int r4 = r2.f9925n
            int r1 = r2.C()
            int r4 = r4 - r1
            int r1 = r2.D()
            int r4 = r4 - r1
        L80:
            if (r3 != 0) goto L86
            if (r4 != 0) goto L86
            r5 = r0
            goto L8b
        L86:
            androidx.recyclerview.widget.RecyclerView r2 = r2.f9915b
            r2.b0(r4, r3, r5)
        L8b:
            return r5
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.i0.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
