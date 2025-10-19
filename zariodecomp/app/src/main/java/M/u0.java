package M;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\u0.smali */
public final class u0 {

    /* renamed from: b, reason: collision with root package name */
    public static final u0 f2426b;

    /* renamed from: a, reason: collision with root package name */
    public final s0 f2427a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f2426b = r0.f2423q;
        } else {
            f2426b = s0.f2424b;
        }
    }

    public u0(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2427a = new r0(this, windowInsets);
        } else {
            this.f2427a = new q0(this, windowInsets);
        }
    }

    public static u0 f(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        u0 u0Var = new u0(windowInsets);
        if (view != null) {
            WeakHashMap weakHashMap = S.f2363a;
            if (E.b(view)) {
                u0 u0VarA = I.a(view);
                s0 s0Var = u0Var.f2427a;
                s0Var.p(u0VarA);
                s0Var.d(view.getRootView());
            }
        }
        return u0Var;
    }

    public final int a() {
        return this.f2427a.j().f1268d;
    }

    public final int b() {
        return this.f2427a.j().f1265a;
    }

    public final int c() {
        return this.f2427a.j().f1267c;
    }

    public final int d() {
        return this.f2427a.j().f1266b;
    }

    public final WindowInsets e() {
        s0 s0Var = this.f2427a;
        if (s0Var instanceof n0) {
            return ((n0) s0Var).f2412c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        return L.b.a(this.f2427a, ((u0) obj).f2427a);
    }

    public final int hashCode() {
        s0 s0Var = this.f2427a;
        if (s0Var == null) {
            return 0;
        }
        return s0Var.hashCode();
    }

    public u0() {
        this.f2427a = new s0(this);
    }
}
