package I3;

import java.util.IdentityHashMap;
import java.util.Map;
import z3.AbstractC1098w;
import z3.C1077a;
import z3.C1078b;
import z3.L;
import z3.M;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\I3\g.smali */
public final class g extends b {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1098w f1944a;

    /* renamed from: b, reason: collision with root package name */
    public final L f1945b;

    public g(AbstractC1098w abstractC1098w, L l4) {
        S0.f.l(abstractC1098w, "delegate");
        this.f1944a = abstractC1098w;
        S0.f.l(l4, "healthListener");
        this.f1945b = l4;
    }

    @Override // z3.AbstractC1098w
    public final C1078b c() {
        C1078b c1078bC = this.f1944a.c();
        c1078bC.getClass();
        C1077a c1077a = M.f11255d;
        Boolean bool = Boolean.TRUE;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(c1077a, bool);
        for (Map.Entry entry : c1078bC.f11280a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((C1077a) entry.getKey(), entry.getValue());
            }
        }
        return new C1078b(identityHashMap);
    }

    @Override // z3.AbstractC1098w
    public final void o(L l4) {
        this.f1944a.o(new f(this, l4, 0));
    }

    @Override // I3.b
    public final AbstractC1098w q() {
        return this.f1944a;
    }
}
