package M;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\c0.smali */
public final class c0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0120e f2377a;

    /* renamed from: b, reason: collision with root package name */
    public u0 f2378b;

    public c0(View view, C0120e c0120e) {
        u0 u0VarB;
        this.f2377a = c0120e;
        WeakHashMap weakHashMap = S.f2363a;
        u0 u0VarA = I.a(view);
        if (u0VarA != null) {
            u0VarB = (Build.VERSION.SDK_INT >= 30 ? new l0(u0VarA) : new k0(u0VarA)).b();
        } else {
            u0VarB = null;
        }
        this.f2378b = u0VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        s0 s0Var;
        if (!view.isLaidOut()) {
            this.f2378b = u0.f(view, windowInsets);
            return d0.i(view, windowInsets);
        }
        u0 u0VarF = u0.f(view, windowInsets);
        if (this.f2378b == null) {
            WeakHashMap weakHashMap = S.f2363a;
            this.f2378b = I.a(view);
        }
        if (this.f2378b == null) {
            this.f2378b = u0VarF;
            return d0.i(view, windowInsets);
        }
        C0120e c0120eJ = d0.j(view);
        if (c0120eJ != null && Objects.equals((WindowInsets) c0120eJ.f2380b, windowInsets)) {
            return d0.i(view, windowInsets);
        }
        u0 u0Var = this.f2378b;
        int i = 1;
        int i5 = 0;
        while (true) {
            s0Var = u0VarF.f2427a;
            if (i > 256) {
                break;
            }
            if (!s0Var.f(i).equals(u0Var.f2427a.f(i))) {
                i5 |= i;
            }
            i <<= 1;
        }
        if (i5 == 0) {
            return d0.i(view, windowInsets);
        }
        u0 u0Var2 = this.f2378b;
        i0 i0Var = new i0(i5, (i5 & 8) != 0 ? s0Var.f(8).f1268d > u0Var2.f2427a.f(8).f1268d ? d0.e : d0.f : d0.g, 160L);
        i0Var.f2396a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(i0Var.f2396a.a());
        D.c cVarF = s0Var.f(i5);
        D.c cVarF2 = u0Var2.f2427a.f(i5);
        int iMin = Math.min(cVarF.f1265a, cVarF2.f1265a);
        int i6 = cVarF.f1266b;
        int i7 = cVarF2.f1266b;
        int iMin2 = Math.min(i6, i7);
        int i8 = cVarF.f1267c;
        int i9 = cVarF2.f1267c;
        int iMin3 = Math.min(i8, i9);
        int i10 = cVarF.f1268d;
        int i11 = i5;
        int i12 = cVarF2.f1268d;
        S0.v vVar = new S0.v(5, D.c.b(iMin, iMin2, iMin3, Math.min(i10, i12)), D.c.b(Math.max(cVarF.f1265a, cVarF2.f1265a), Math.max(i6, i7), Math.max(i8, i9), Math.max(i10, i12)));
        d0.f(view, windowInsets, false);
        duration.addUpdateListener(new b0(i0Var, u0VarF, u0Var2, i11, view));
        duration.addListener(new F0.k(i0Var, view, 2));
        u.a(view, new B3.J(view, i0Var, vVar, duration));
        this.f2378b = u0VarF;
        return d0.i(view, windowInsets);
    }
}
