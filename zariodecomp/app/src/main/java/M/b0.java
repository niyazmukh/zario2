package M;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\b0.smali */
public final class b0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f2369a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f2370b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f2371c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f2373e;

    public b0(i0 i0Var, u0 u0Var, u0 u0Var2, int i, View view) {
        this.f2369a = i0Var;
        this.f2370b = u0Var;
        this.f2371c = u0Var2;
        this.f2372d = i;
        this.f2373e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f2;
        i0 i0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        i0 i0Var2 = this.f2369a;
        i0Var2.f2396a.d(animatedFraction);
        float fB = i0Var2.f2396a.b();
        PathInterpolator pathInterpolator = d0.e;
        int i = Build.VERSION.SDK_INT;
        u0 u0Var = this.f2370b;
        m0 l0Var = i >= 30 ? new l0(u0Var) : new k0(u0Var);
        int i5 = 1;
        while (i5 <= 256) {
            int i6 = this.f2372d & i5;
            s0 s0Var = u0Var.f2427a;
            if (i6 == 0) {
                l0Var.c(i5, s0Var.f(i5));
                f2 = fB;
                i0Var = i0Var2;
            } else {
                D.c cVarF = s0Var.f(i5);
                D.c cVarF2 = this.f2371c.f2427a.f(i5);
                int i7 = (int) (((cVarF.f1265a - cVarF2.f1265a) * r10) + 0.5d);
                int i8 = (int) (((cVarF.f1266b - cVarF2.f1266b) * r10) + 0.5d);
                f2 = fB;
                int i9 = (int) (((cVarF.f1267c - cVarF2.f1267c) * r10) + 0.5d);
                float f3 = (cVarF.f1268d - cVarF2.f1268d) * (1.0f - fB);
                i0Var = i0Var2;
                int i10 = (int) (f3 + 0.5d);
                int iMax = Math.max(0, cVarF.f1265a - i7);
                int iMax2 = Math.max(0, cVarF.f1266b - i8);
                int iMax3 = Math.max(0, cVarF.f1267c - i9);
                int iMax4 = Math.max(0, cVarF.f1268d - i10);
                if (iMax != i7 || iMax2 != i8 || iMax3 != i9 || iMax4 != i10) {
                    cVarF = D.c.b(iMax, iMax2, iMax3, iMax4);
                }
                l0Var.c(i5, cVarF);
            }
            i5 <<= 1;
            fB = f2;
            i0Var2 = i0Var;
        }
        d0.g(this.f2373e, l0Var.b(), Collections.singletonList(i0Var2));
    }
}
