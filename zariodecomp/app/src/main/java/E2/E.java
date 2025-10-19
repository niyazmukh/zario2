package E2;

import a.AbstractC0183a;
import com.google.protobuf.AbstractC0409l;
import com.google.protobuf.J;
import r1.d;
import z3.k0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E2\E.smali */
public final class E extends d {

    /* renamed from: d, reason: collision with root package name */
    public final F f1402d;

    /* renamed from: e, reason: collision with root package name */
    public final J f1403e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0409l f1404f;

    /* renamed from: g, reason: collision with root package name */
    public final k0 f1405g;

    public E(F f2, J j5, AbstractC0409l abstractC0409l, k0 k0Var) {
        AbstractC0183a.N(k0Var == null || f2 == F.f1408c, "Got cause for a target change that was not a removal", new Object[0]);
        this.f1402d = f2;
        this.f1403e = j5;
        this.f1404f = abstractC0409l;
        if (k0Var == null || k0Var.e()) {
            this.f1405g = null;
        } else {
            this.f1405g = k0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || E.class != obj.getClass()) {
            return false;
        }
        E e5 = (E) obj;
        if (this.f1402d != e5.f1402d) {
            return false;
        }
        if (!((com.google.protobuf.H) this.f1403e).equals(e5.f1403e) || !this.f1404f.equals(e5.f1404f)) {
            return false;
        }
        k0 k0Var = e5.f1405g;
        k0 k0Var2 = this.f1405g;
        return k0Var2 != null ? k0Var != null && k0Var2.f11358a.equals(k0Var.f11358a) : k0Var == null;
    }

    public final int hashCode() {
        int iHashCode = (this.f1404f.hashCode() + ((((com.google.protobuf.H) this.f1403e).hashCode() + (this.f1402d.hashCode() * 31)) * 31)) * 31;
        k0 k0Var = this.f1405g;
        return iHashCode + (k0Var != null ? k0Var.f11358a.hashCode() : 0);
    }

    public final String toString() {
        return "WatchTargetChange{changeType=" + this.f1402d + ", targetIds=" + this.f1403e + '}';
    }
}
