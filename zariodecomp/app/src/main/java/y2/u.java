package y2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\y2.1\u.smali */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final int f11142a;

    /* renamed from: b, reason: collision with root package name */
    public final B2.k f11143b;

    public u(int i, B2.k kVar) {
        this.f11142a = i;
        this.f11143b = kVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f11142a == uVar.f11142a && this.f11143b.equals(uVar.f11143b);
    }

    public final int hashCode() {
        return this.f11143b.hashCode() + ((t.h.c(this.f11142a) + 899) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11142a == 1 ? "" : "-");
        sb.append(this.f11143b.c());
        return sb.toString();
    }
}
