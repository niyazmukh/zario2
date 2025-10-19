package M;

import android.view.WindowInsets;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\k0.smali */
public class k0 extends m0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f2401c;

    public k0() {
        this.f2401c = new WindowInsets.Builder();
    }

    @Override // M.m0
    public u0 b() {
        a();
        u0 u0VarF = u0.f(null, this.f2401c.build());
        u0VarF.f2427a.o(this.f2403b);
        return u0VarF;
    }

    @Override // M.m0
    public void d(D.c cVar) {
        this.f2401c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // M.m0
    public void e(D.c cVar) {
        this.f2401c.setSystemGestureInsets(cVar.d());
    }

    @Override // M.m0
    public void f(D.c cVar) {
        this.f2401c.setSystemWindowInsets(cVar.d());
    }

    @Override // M.m0
    public void g(D.c cVar) {
        this.f2401c.setTappableElementInsets(cVar.d());
    }

    public void h(D.c cVar) {
        this.f2401c.setStableInsets(cVar.d());
    }

    public k0(u0 u0Var) {
        WindowInsets.Builder builder;
        super(u0Var);
        WindowInsets windowInsetsE = u0Var.e();
        if (windowInsetsE != null) {
            builder = new WindowInsets.Builder(windowInsetsE);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.f2401c = builder;
    }
}
