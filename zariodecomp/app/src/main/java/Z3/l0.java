package z3;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\l0.smali */
public final class l0 extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f11363a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11364b;

    public l0(k0 k0Var) {
        super(k0.b(k0Var), k0Var.f11360c);
        this.f11363a = k0Var;
        this.f11364b = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this.f11364b ? super.fillInStackTrace() : this;
    }
}
