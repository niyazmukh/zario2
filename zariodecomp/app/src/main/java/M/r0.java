package M;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\r0.smali */
public final class r0 extends q0 {

    /* renamed from: q, reason: collision with root package name */
    public static final u0 f2423q = u0.f(null, WindowInsets.CONSUMED);

    public r0(u0 u0Var, WindowInsets windowInsets) {
        super(u0Var, windowInsets);
    }

    @Override // M.n0, M.s0
    public final void d(View view) {
    }

    @Override // M.n0, M.s0
    public D.c f(int i) {
        return D.c.c(this.f2412c.getInsets(t0.a(i)));
    }
}
