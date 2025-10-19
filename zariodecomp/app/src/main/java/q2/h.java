package q2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q2.1\h.smali */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final q f9487a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9488b;

    public h(q qVar, boolean z4) {
        this.f9487a = qVar;
        this.f9488b = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return hVar.f9487a.equals(this.f9487a) && hVar.f9488b == this.f9488b;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f9488b).hashCode() ^ ((this.f9487a.hashCode() ^ 1000003) * 1000003);
    }
}
