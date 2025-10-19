package V;

import M.B;
import M.C0118c;
import M.S;
import N.o;
import N.r;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.common.api.f;
import g1.i;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\V\b.smali */
public abstract class b extends C0118c {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f3388n = new Rect(f.API_PRIORITY_OTHER, f.API_PRIORITY_OTHER, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final X1.e f3389o = new X1.e();

    /* renamed from: p, reason: collision with root package name */
    public static final G2.e f3390p = new G2.e();
    public final AccessibilityManager h;
    public final View i;

    /* renamed from: j, reason: collision with root package name */
    public a f3395j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f3391d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f3392e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f3393f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f3394g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f3396k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f3397l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f3398m = Integer.MIN_VALUE;

    public b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.i = view;
        this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = S.f2363a;
        if (B.c(view) == 0) {
            B.s(view, 1);
        }
    }

    @Override // M.C0118c
    public final i b(View view) {
        if (this.f3395j == null) {
            this.f3395j = new a(this);
        }
        return this.f3395j;
    }

    @Override // M.C0118c
    public final void d(View view, o oVar) {
        this.f2375a.onInitializeAccessibilityNodeInfo(view, oVar.f2543a);
        t(oVar);
    }

    public final boolean j(int i) {
        if (this.f3397l != i) {
            return false;
        }
        this.f3397l = Integer.MIN_VALUE;
        v(i, false);
        x(i, 8);
        return true;
    }

    public final AccessibilityEvent k(int i, int i5) {
        View view = this.i;
        if (i == -1) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i5);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
            return accessibilityEventObtain;
        }
        AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i5);
        o oVarR = r(i);
        accessibilityEventObtain2.getText().add(oVarR.g());
        AccessibilityNodeInfo accessibilityNodeInfo = oVarR.f2543a;
        accessibilityEventObtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityEventObtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityEventObtain2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityEventObtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityEventObtain2.setChecked(accessibilityNodeInfo.isChecked());
        if (accessibilityEventObtain2.getText().isEmpty() && accessibilityEventObtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain2.setClassName(accessibilityNodeInfo.getClassName());
        r.a(accessibilityEventObtain2, view, i);
        accessibilityEventObtain2.setPackageName(view.getContext().getPackageName());
        return accessibilityEventObtain2;
    }

    public final o l(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        o oVar = new o(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        accessibilityNodeInfoObtain.setClassName("android.view.View");
        Rect rect = f3388n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        View view = this.i;
        accessibilityNodeInfoObtain.setParent(view);
        u(i, oVar);
        if (oVar.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f3392e;
        oVar.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(view.getContext().getPackageName());
        oVar.f2544b = i;
        accessibilityNodeInfoObtain.setSource(view, i);
        if (this.f3396k == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            oVar.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            oVar.a(64);
        }
        boolean z4 = this.f3397l == i;
        if (z4) {
            oVar.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            oVar.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z4);
        int[] iArr = this.f3394g;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.f3391d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            oVar.f(rect3);
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f3393f;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                accessibilityNodeInfoObtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view2 = (View) parent;
                            if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                break;
                            }
                            parent = view2.getParent();
                        } else if (parent != null) {
                            accessibilityNodeInfoObtain.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return oVar;
    }

    public final boolean m(MotionEvent motionEvent) {
        int i;
        AccessibilityManager accessibilityManager = this.h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iN = n(motionEvent.getX(), motionEvent.getY());
            int i5 = this.f3398m;
            if (i5 != iN) {
                this.f3398m = iN;
                x(iN, 128);
                x(i5, 256);
            }
            return iN != Integer.MIN_VALUE;
        }
        if (action != 10 || (i = this.f3398m) == Integer.MIN_VALUE) {
            return false;
        }
        if (i != Integer.MIN_VALUE) {
            this.f3398m = Integer.MIN_VALUE;
            x(i, 256);
        }
        return true;
    }

    public abstract int n(float f2, float f3);

    public abstract void o(ArrayList arrayList);

    public final void p(int i) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventK = k(i, 2048);
        N.b.b(accessibilityEventK, 0);
        parent.requestSendAccessibilityEvent(view, accessibilityEventK);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(int r20, android.graphics.Rect r21) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: V.b.q(int, android.graphics.Rect):boolean");
    }

    public final o r(int i) {
        if (i != -1) {
            return l(i);
        }
        View view = this.i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
        o oVar = new o(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = S.f2363a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        o(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            oVar.f2543a.addChild(view, ((Integer) arrayList.get(i5)).intValue());
        }
        return oVar;
    }

    public abstract boolean s(int i, int i5, Bundle bundle);

    public void t(o oVar) {
    }

    public abstract void u(int i, o oVar);

    public void v(int i, boolean z4) {
    }

    public final boolean w(int i) {
        int i5;
        View view = this.i;
        if ((!view.isFocused() && !view.requestFocus()) || (i5 = this.f3397l) == i) {
            return false;
        }
        if (i5 != Integer.MIN_VALUE) {
            j(i5);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f3397l = i;
        v(i, true);
        x(i, 8);
        return true;
    }

    public final void x(int i, int i5) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, k(i, i5));
    }
}
