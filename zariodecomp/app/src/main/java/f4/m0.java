package f4;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\m0.smali */
public final class m0 extends k0 {

    /* renamed from: e, reason: collision with root package name */
    public final t0 f7074e;

    /* renamed from: f, reason: collision with root package name */
    public final n0 f7075f;

    /* renamed from: k, reason: collision with root package name */
    public final r f7076k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f7077l;

    public m0(t0 t0Var, n0 n0Var, r rVar, Object obj) {
        this.f7074e = t0Var;
        this.f7075f = n0Var;
        this.f7076k = rVar;
        this.f7077l = obj;
    }

    @Override // f4.k0
    public final boolean j() {
        return false;
    }

    @Override // f4.k0
    public final void k(Throwable th) {
        r rVar = this.f7076k;
        t0 t0Var = this.f7074e;
        t0Var.getClass();
        r rVarG = t0.G(rVar);
        n0 n0Var = this.f7075f;
        Object obj = this.f7077l;
        if (rVarG == null || !t0Var.Q(n0Var, rVarG, obj)) {
            n0Var.f7086a.d(new k4.h(2), 2);
            r rVarG2 = t0.G(rVar);
            if (rVarG2 == null || !t0Var.Q(n0Var, rVarG2, obj)) {
                t0Var.i(t0Var.s(n0Var, obj));
            }
        }
    }
}
