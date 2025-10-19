package B3;

import A2.RunnableC0005e;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import z3.AbstractC1080d;
import z3.C1077a;
import z3.C1078b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\Z1.smali */
public final class Z1 extends AbstractC1080d {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1080d f700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a2 f701e;

    public Z1(a2 a2Var, AbstractC1080d abstractC1080d) {
        this.f701e = a2Var;
        this.f700d = abstractC1080d;
    }

    @Override // z3.AbstractC1080d
    public final void o(z3.k0 k0Var) {
        this.f700d.o(k0Var);
        this.f701e.f739c.execute(new RunnableC0005e(this, 5));
    }

    @Override // z3.AbstractC1080d
    public final void p(z3.e0 e0Var) {
        C1077a c1077a = a2.f736d;
        C1078b c1078b = e0Var.f11305b;
        if (c1078b.f11280a.get(c1077a) != null) {
            throw new IllegalStateException("RetryingNameResolver can only be used once to wrap a NameResolver");
        }
        Collections.emptyList();
        C1078b c1078b2 = C1078b.f11279b;
        c1078b.getClass();
        Y1 y12 = new Y1(this.f701e);
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(c1077a, y12);
        for (Map.Entry entry : c1078b.f11280a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((C1077a) entry.getKey(), entry.getValue());
            }
        }
        this.f700d.p(new z3.e0(e0Var.f11304a, new C1078b(identityHashMap), e0Var.f11306c));
    }
}
