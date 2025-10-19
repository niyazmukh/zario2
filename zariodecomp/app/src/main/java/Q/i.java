package Q;

import M.C0118c;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Q\i.smali */
public final class i extends C0118c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2705d;

    public /* synthetic */ i(int i) {
        this.f2705d = i;
    }

    @Override // M.C0118c
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f2705d) {
            case 0:
                super.c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                N.q.c(accessibilityEvent, nestedScrollView.getScrollX());
                N.q.d(accessibilityEvent, nestedScrollView.getScrollRange());
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // M.C0118c
    public final void d(View view, N.o oVar) {
        int scrollRange;
        switch (this.f2705d) {
            case 0:
                View.AccessibilityDelegate accessibilityDelegate = this.f2375a;
                AccessibilityNodeInfo accessibilityNodeInfo = oVar.f2543a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityNodeInfo.setClassName(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    accessibilityNodeInfo.setScrollable(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        oVar.b(N.i.f2533g);
                        oVar.b(N.i.f2535k);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        oVar.b(N.i.f2532f);
                        oVar.b(N.i.f2536l);
                        break;
                    }
                }
                break;
            case 1:
                View.AccessibilityDelegate accessibilityDelegate2 = this.f2375a;
                AccessibilityNodeInfo accessibilityNodeInfo2 = oVar.f2543a;
                accessibilityDelegate2.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCollectionInfo(null);
                break;
            case 2:
                View.AccessibilityDelegate accessibilityDelegate3 = this.f2375a;
                AccessibilityNodeInfo accessibilityNodeInfo3 = oVar.f2543a;
                accessibilityDelegate3.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setScrollable(false);
                break;
            default:
                View.AccessibilityDelegate accessibilityDelegate4 = this.f2375a;
                AccessibilityNodeInfo accessibilityNodeInfo4 = oVar.f2543a;
                accessibilityDelegate4.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                accessibilityNodeInfo4.setCollectionInfo(null);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    @Override // M.C0118c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean g(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            int r0 = r3.f2705d
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r3 = super.g(r4, r5, r6)
            return r3
        La:
            boolean r3 = super.g(r4, r5, r6)
            r6 = 1
            if (r3 == 0) goto L13
            goto La0
        L13:
            androidx.core.widget.NestedScrollView r4 = (androidx.core.widget.NestedScrollView) r4
            boolean r3 = r4.isEnabled()
            r0 = 0
            if (r3 != 0) goto L1f
        L1c:
            r6 = r0
            goto La0
        L1f:
            int r3 = r4.getHeight()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.graphics.Matrix r2 = r4.getMatrix()
            boolean r2 = r2.isIdentity()
            if (r2 == 0) goto L3c
            boolean r2 = r4.getGlobalVisibleRect(r1)
            if (r2 == 0) goto L3c
            int r3 = r1.height()
        L3c:
            r1 = 4096(0x1000, float:5.74E-42)
            if (r5 == r1) goto L76
            r1 = 8192(0x2000, float:1.148E-41)
            if (r5 == r1) goto L4f
            r1 = 16908344(0x1020038, float:2.3877386E-38)
            if (r5 == r1) goto L4f
            r1 = 16908346(0x102003a, float:2.3877392E-38)
            if (r5 == r1) goto L76
            goto L1c
        L4f:
            int r5 = r4.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r4.getPaddingTop()
            int r3 = r3 - r5
            int r5 = r4.getScrollY()
            int r5 = r5 - r3
            int r3 = java.lang.Math.max(r5, r0)
            int r5 = r4.getScrollY()
            if (r3 == r5) goto L1c
            int r5 = r4.getScrollX()
            int r0 = r0 - r5
            int r5 = r4.getScrollY()
            int r3 = r3 - r5
            r4.u(r0, r3, r6)
            goto La0
        L76:
            int r5 = r4.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r4.getPaddingTop()
            int r3 = r3 - r5
            int r5 = r4.getScrollY()
            int r5 = r5 + r3
            int r3 = r4.getScrollRange()
            int r3 = java.lang.Math.min(r5, r3)
            int r5 = r4.getScrollY()
            if (r3 == r5) goto L1c
            int r5 = r4.getScrollX()
            int r0 = r0 - r5
            int r5 = r4.getScrollY()
            int r3 = r3 - r5
            r4.u(r0, r3, r6)
        La0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.i.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
