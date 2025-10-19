package C2;

import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C2\e.smali */
public final class e extends h {
    @Override // C2.h
    public final f a(B2.l lVar, f fVar, l2.o oVar) {
        j(lVar);
        if (!this.f1085b.a(lVar)) {
            return fVar;
        }
        lVar.b(lVar.f324c);
        lVar.f327f = 1;
        lVar.f324c = B2.o.f333b;
        return null;
    }

    @Override // C2.h
    public final void b(B2.l lVar, k kVar) {
        j(lVar);
        AbstractC0183a.N(kVar.f1098b.isEmpty(), "Transform results received by DeleteMutation.", new Object[0]);
        lVar.b(kVar.f1097a);
        lVar.f327f = 2;
    }

    @Override // C2.h
    public final f d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        return e((e) obj);
    }

    public final int hashCode() {
        return f();
    }

    public final String toString() {
        return "DeleteMutation{" + g() + "}";
    }
}
