package V2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\V2\p.smali */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3461a;

    /* renamed from: b, reason: collision with root package name */
    public final o f3462b;

    public /* synthetic */ p() {
        this(false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f3461a == pVar.f3461a && kotlin.jvm.internal.i.a(this.f3462b, pVar.f3462b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f3461a) * 31;
        o oVar = this.f3462b;
        return iHashCode + (oVar == null ? 0 : oVar.hashCode());
    }

    public final String toString() {
        return "UserSession(isLoggedIn=" + this.f3461a + ", user=" + this.f3462b + ")";
    }

    public p(boolean z4, o oVar) {
        this.f3461a = z4;
        this.f3462b = oVar;
    }
}
