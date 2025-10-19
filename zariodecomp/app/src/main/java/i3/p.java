package I3;

import java.util.concurrent.atomic.AtomicLong;
import z3.AbstractC1083g;
import z3.k0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\I3\p.smali */
public final class p extends AbstractC1083g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f1970b;

    public p(q qVar) {
        this.f1970b = qVar;
    }

    @Override // z3.AbstractC1083g
    public final void m(k0 k0Var) {
        k kVar = this.f1970b.f1971a;
        boolean zE = k0Var.e();
        n nVar = kVar.f1950a;
        if (nVar.f1965e == null && nVar.f1966f == null) {
            return;
        }
        if (zE) {
            ((AtomicLong) kVar.f1951b.f2867b).getAndIncrement();
        } else {
            ((AtomicLong) kVar.f1951b.f2868c).getAndIncrement();
        }
    }
}
