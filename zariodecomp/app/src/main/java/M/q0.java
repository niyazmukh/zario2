package M;

import android.view.WindowInsets;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\q0.smali */
public class q0 extends p0 {

    /* renamed from: n, reason: collision with root package name */
    public D.c f2420n;

    /* renamed from: o, reason: collision with root package name */
    public D.c f2421o;

    /* renamed from: p, reason: collision with root package name */
    public D.c f2422p;

    public q0(u0 u0Var, WindowInsets windowInsets) {
        super(u0Var, windowInsets);
        this.f2420n = null;
        this.f2421o = null;
        this.f2422p = null;
    }

    @Override // M.s0
    public D.c g() {
        if (this.f2421o == null) {
            this.f2421o = D.c.c(this.f2412c.getMandatorySystemGestureInsets());
        }
        return this.f2421o;
    }

    @Override // M.s0
    public D.c i() {
        if (this.f2420n == null) {
            this.f2420n = D.c.c(this.f2412c.getSystemGestureInsets());
        }
        return this.f2420n;
    }

    @Override // M.s0
    public D.c k() {
        if (this.f2422p == null) {
            this.f2422p = D.c.c(this.f2412c.getTappableElementInsets());
        }
        return this.f2422p;
    }

    @Override // M.s0
    public u0 l(int i, int i5, int i6, int i7) {
        return u0.f(null, this.f2412c.inset(i, i5, i6, i7));
    }
}
