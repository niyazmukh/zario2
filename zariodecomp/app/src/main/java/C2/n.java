package C2;

import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C2\n.smali */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public static final n f1102c = new n(null, null);

    /* renamed from: a, reason: collision with root package name */
    public final B2.o f1103a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f1104b;

    public n(B2.o oVar, Boolean bool) {
        AbstractC0183a.N(oVar == null || bool == null, "Precondition can specify \"exists\" or \"updateTime\" but not both", new Object[0]);
        this.f1103a = oVar;
        this.f1104b = bool;
    }

    public final boolean a(B2.l lVar) {
        B2.o oVar = this.f1103a;
        if (oVar != null) {
            return lVar.d() && lVar.f324c.equals(oVar);
        }
        Boolean bool = this.f1104b;
        if (bool != null) {
            return bool.booleanValue() == lVar.d();
        }
        AbstractC0183a.N(oVar == null && bool == null, "Precondition should be empty", new Object[0]);
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        B2.o oVar = nVar.f1103a;
        B2.o oVar2 = this.f1103a;
        if (oVar2 == null ? oVar != null : !oVar2.equals(oVar)) {
            return false;
        }
        Boolean bool = nVar.f1104b;
        Boolean bool2 = this.f1104b;
        return bool2 != null ? bool2.equals(bool) : bool == null;
    }

    public final int hashCode() {
        B2.o oVar = this.f1103a;
        int iHashCode = (oVar != null ? oVar.f334a.hashCode() : 0) * 31;
        Boolean bool = this.f1104b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = this.f1104b;
        B2.o oVar = this.f1103a;
        if (oVar == null && bool == null) {
            return "Precondition{<none>}";
        }
        if (oVar != null) {
            return "Precondition{updateTime=" + oVar + "}";
        }
        if (bool == null) {
            AbstractC0183a.z("Invalid Precondition", new Object[0]);
            throw null;
        }
        return "Precondition{exists=" + bool + "}";
    }
}
