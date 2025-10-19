package F0;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.HashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F0\j.smali */
public final class j extends n {

    /* renamed from: B, reason: collision with root package name */
    public static final String[] f1604B = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: A, reason: collision with root package name */
    public final int f1605A;

    public j(int i) {
        this();
        this.f1605A = i;
    }

    public static void G(s sVar) {
        int visibility = sVar.f1644b.getVisibility();
        HashMap map = sVar.f1643a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = sVar.f1644b;
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static F0.y I(F0.s r8, F0.s r9) {
        /*
            F0.y r0 = new F0.y
            r0.<init>()
            r1 = 0
            r0.f1657a = r1
            r0.f1658b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f1643a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f1659c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f1661e = r6
            goto L33
        L2f:
            r0.f1659c = r3
            r0.f1661e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f1643a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f1660d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f1662f = r2
            goto L56
        L52:
            r0.f1660d = r3
            r0.f1662f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f1659c
            int r9 = r0.f1660d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f1661e
            android.view.ViewGroup r4 = r0.f1662f
            if (r3 != r4) goto L68
            return r0
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f1658b = r1
            r0.f1657a = r2
            goto L9f
        L71:
            if (r9 != 0) goto L9f
            r0.f1658b = r2
            r0.f1657a = r2
            goto L9f
        L78:
            android.view.ViewGroup r8 = r0.f1662f
            if (r8 != 0) goto L81
            r0.f1658b = r1
            r0.f1657a = r2
            goto L9f
        L81:
            android.view.ViewGroup r8 = r0.f1661e
            if (r8 != 0) goto L9f
            r0.f1658b = r2
            r0.f1657a = r2
            goto L9f
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f1660d
            if (r8 != 0) goto L95
            r0.f1658b = r2
            r0.f1657a = r2
            goto L9f
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f1659c
            if (r8 != 0) goto L9f
            r0.f1658b = r1
            r0.f1657a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.j.I(F0.s, F0.s):F0.y");
    }

    public final ObjectAnimator H(View view, float f2, float f3) {
        int i = 0;
        if (f2 == f3) {
            return null;
        }
        c cVar = t.f1646a;
        view.setTransitionAlpha(f2);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, t.f1646a, f3);
        objectAnimatorOfFloat.addListener(new i(view));
        a(new h(view, i));
        return objectAnimatorOfFloat;
    }

    @Override // F0.n
    public final void d(s sVar) {
        G(sVar);
    }

    @Override // F0.n
    public final void g(s sVar) {
        G(sVar);
        HashMap map = sVar.f1643a;
        c cVar = t.f1646a;
        map.put("android:fade:transitionAlpha", Float.valueOf(sVar.f1644b.getTransitionAlpha()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (I(n(r3, false), q(r3, false)).f1657a != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0204  */
    @Override // F0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator k(android.widget.FrameLayout r22, F0.s r23, F0.s r24) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.j.k(android.widget.FrameLayout, F0.s, F0.s):android.animation.Animator");
    }

    @Override // F0.n
    public final String[] p() {
        return f1604B;
    }

    @Override // F0.n
    public final boolean r(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f1643a.containsKey("android:visibility:visibility") != sVar.f1643a.containsKey("android:visibility:visibility")) {
            return false;
        }
        y yVarI = I(sVar, sVar2);
        if (yVarI.f1657a) {
            return yVarI.f1659c == 0 || yVarI.f1660d == 0;
        }
        return false;
    }

    public j() {
        this.f1605A = 3;
    }
}
