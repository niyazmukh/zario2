package z3;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\m0.smali */
public final class m0 extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f11366a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11367b;

    public m0(k0 k0Var) {
        super(k0.b(k0Var), k0Var.f11360c);
        this.f11366a = k0Var;
        this.f11367b = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this.f11367b ? super.fillInStackTrace() : this;
    }
}
