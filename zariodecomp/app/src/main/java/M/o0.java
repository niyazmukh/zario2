package M;

import android.view.WindowInsets;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\o0.smali */
public abstract class o0 extends n0 {

    /* renamed from: m, reason: collision with root package name */
    public D.c f2417m;

    public o0(u0 u0Var, WindowInsets windowInsets) {
        super(u0Var, windowInsets);
        this.f2417m = null;
    }

    @Override // M.s0
    public u0 b() {
        return u0.f(null, this.f2412c.consumeStableInsets());
    }

    @Override // M.s0
    public u0 c() {
        return u0.f(null, this.f2412c.consumeSystemWindowInsets());
    }

    @Override // M.s0
    public final D.c h() {
        if (this.f2417m == null) {
            WindowInsets windowInsets = this.f2412c;
            this.f2417m = D.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f2417m;
    }

    @Override // M.s0
    public boolean m() {
        return this.f2412c.isConsumed();
    }
}
