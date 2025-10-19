package B3;

import A2.C0020u;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\L0.smali */
public final class L0 extends z3.K {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f453a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f454b;

    public L0(Throwable th) {
        z3.k0 k0VarF = z3.k0.f11354m.g("Panic! This is a bug!").f(th);
        z3.I i = z3.I.f11245e;
        S0.f.g("drop status shouldn't be OK", !k0VarF.e());
        this.f454b = new z3.I(null, null, k0VarF, true);
    }

    @Override // z3.K
    public final z3.I a(C0099z1 c0099z1) {
        switch (this.f453a) {
            case 0:
                return (z3.I) this.f454b;
            default:
                return z3.I.a((z3.k0) this.f454b);
        }
    }

    public String toString() {
        switch (this.f453a) {
            case 0:
                C0020u c0020u = new C0020u(L0.class.getSimpleName());
                c0020u.a((z3.I) this.f454b, "panicPickResult");
                return c0020u.toString();
            default:
                return super.toString();
        }
    }

    public L0(z3.k0 k0Var) {
        this.f454b = k0Var;
    }
}
