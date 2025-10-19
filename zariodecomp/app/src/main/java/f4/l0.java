package f4;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\l0.smali */
public final class l0 extends C0516n {

    /* renamed from: m, reason: collision with root package name */
    public final t0 f7071m;

    public l0(O3.d dVar, t0 t0Var) {
        super(1, dVar);
        this.f7071m = t0Var;
    }

    @Override // f4.C0516n
    public final Throwable q(t0 t0Var) {
        Throwable thB;
        t0 t0Var2 = this.f7071m;
        t0Var2.getClass();
        Object obj = t0.f7098a.get(t0Var2);
        return (!(obj instanceof n0) || (thB = ((n0) obj).b()) == null) ? obj instanceof C0524x ? ((C0524x) obj).f7107a : t0Var.getCancellationException() : thB;
    }

    @Override // f4.C0516n
    public final String y() {
        return "AwaitContinuation";
    }
}
