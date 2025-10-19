package C2;

import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C2\r.smali */
public final class r extends h {
    @Override // C2.h
    public final f a(B2.l lVar, f fVar, l2.o oVar) {
        AbstractC0183a.z("VerifyMutation should only be used in Transactions.", new Object[0]);
        throw null;
    }

    @Override // C2.h
    public final void b(B2.l lVar, k kVar) {
        AbstractC0183a.z("VerifyMutation should only be used in Transactions.", new Object[0]);
        throw null;
    }

    @Override // C2.h
    public final f d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        return e((r) obj);
    }

    public final int hashCode() {
        return f();
    }

    public final String toString() {
        return "VerifyMutation{" + g() + "}";
    }
}
