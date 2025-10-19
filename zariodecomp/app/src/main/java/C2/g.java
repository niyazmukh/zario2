package C2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C2\g.smali */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final B2.k f1082a;

    /* renamed from: b, reason: collision with root package name */
    public final q f1083b;

    public g(B2.k kVar, q qVar) {
        this.f1082a = kVar;
        this.f1083b = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f1082a.equals(gVar.f1082a)) {
            return this.f1083b.equals(gVar.f1083b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1083b.hashCode() + (this.f1082a.hashCode() * 31);
    }
}
