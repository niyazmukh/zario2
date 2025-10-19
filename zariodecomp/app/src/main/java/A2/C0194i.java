package a2;

import S0.n;
import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* renamed from: a2.i, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\a2.1\i.smali */
public final class C0194i extends AbstractC0193h {

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f4103B = {2130903992, 2130903994};

    /* renamed from: A, reason: collision with root package name */
    public final AccessibilityManager f4104A;

    public C0194i(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.f4104A = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[LOOP:0: B:3:0x0002->B:35:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static a2.C0194i f(android.view.View r7, java.lang.CharSequence r8, int r9) {
        /*
            r0 = 0
            r1 = r0
        L2:
            boolean r2 = r7 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r2 == 0) goto L9
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L2d
        L9:
            boolean r2 = r7 instanceof android.widget.FrameLayout
            if (r2 == 0) goto L1c
            int r1 = r7.getId()
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            if (r1 != r2) goto L19
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L2d
        L19:
            r1 = r7
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L1c:
            if (r7 == 0) goto L2a
            android.view.ViewParent r7 = r7.getParent()
            boolean r2 = r7 instanceof android.view.View
            if (r2 == 0) goto L29
            android.view.View r7 = (android.view.View) r7
            goto L2a
        L29:
            r7 = r0
        L2a:
            if (r7 != 0) goto L2
            r7 = r1
        L2d:
            if (r7 == 0) goto L73
            android.content.Context r0 = r7.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            int[] r2 = a2.C0194i.f4103B
            android.content.res.TypedArray r2 = r0.obtainStyledAttributes(r2)
            r3 = 0
            r4 = -1
            int r5 = r2.getResourceId(r3, r4)
            r6 = 1
            int r6 = r2.getResourceId(r6, r4)
            r2.recycle()
            if (r5 == r4) goto L53
            if (r6 == r4) goto L53
            r2 = 2131427430(0x7f0b0066, float:1.8476476E38)
            goto L56
        L53:
            r2 = 2131427363(0x7f0b0023, float:1.847634E38)
        L56:
            android.view.View r1 = r1.inflate(r2, r7, r3)
            com.google.android.material.snackbar.SnackbarContentLayout r1 = (com.google.android.material.snackbar.SnackbarContentLayout) r1
            a2.i r2 = new a2.i
            r2.<init>(r0, r7, r1, r1)
            a2.g r7 = r2.i
            android.view.View r7 = r7.getChildAt(r3)
            com.google.android.material.snackbar.SnackbarContentLayout r7 = (com.google.android.material.snackbar.SnackbarContentLayout) r7
            android.widget.TextView r7 = r7.getMessageView()
            r7.setText(r8)
            r2.f4093k = r9
            return r2
        L73:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "No suitable parent found from the given view. Please provide a valid view."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.C0194i.f(android.view.View, java.lang.CharSequence, int):a2.i");
    }

    public final void g() {
        n nVarI = n.i();
        int i = this.f4093k;
        int recommendedTimeoutMillis = i != -2 ? this.f4104A.getRecommendedTimeoutMillis(i, 3) : -2;
        C0190e c0190e = this.f4102t;
        synchronized (nVarI.f2872a) {
            try {
                if (nVarI.j(c0190e)) {
                    C0196k c0196k = (C0196k) nVarI.f2874c;
                    c0196k.f4107b = recommendedTimeoutMillis;
                    ((Handler) nVarI.f2873b).removeCallbacksAndMessages(c0196k);
                    nVarI.q((C0196k) nVarI.f2874c);
                    return;
                }
                C0196k c0196k2 = (C0196k) nVarI.f2875d;
                if (c0196k2 != null && c0196k2.f4106a.get() == c0190e) {
                    ((C0196k) nVarI.f2875d).f4107b = recommendedTimeoutMillis;
                } else {
                    nVarI.f2875d = new C0196k(recommendedTimeoutMillis, c0190e);
                }
                C0196k c0196k3 = (C0196k) nVarI.f2874c;
                if (c0196k3 == null || !nVarI.b(c0196k3, 4)) {
                    nVarI.f2874c = null;
                    nVarI.s();
                }
            } finally {
            }
        }
    }
}
