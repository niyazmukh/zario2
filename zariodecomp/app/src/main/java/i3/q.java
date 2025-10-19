package I3;

import h2.C0593b;
import z3.AbstractC1082f;
import z3.AbstractC1083g;
import z3.a0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\I3\q.smali */
public final class q extends AbstractC1082f {

    /* renamed from: a, reason: collision with root package name */
    public final k f1971a;

    /* renamed from: b, reason: collision with root package name */
    public final q f1972b;

    public q(k kVar, q qVar) {
        this.f1971a = kVar;
        this.f1972b = qVar;
    }

    @Override // z3.AbstractC1082f
    public final AbstractC1083g a(C0593b c0593b, a0 a0Var) {
        q qVar = this.f1972b;
        return qVar != null ? new o(this, qVar.a(c0593b, a0Var)) : new p(this);
    }
}
