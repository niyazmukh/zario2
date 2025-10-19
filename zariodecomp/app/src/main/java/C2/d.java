package C2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C2\d.smali */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f1078a;

    /* renamed from: b, reason: collision with root package name */
    public final h f1079b;

    public d(int i, h hVar) {
        this.f1078a = i;
        this.f1079b = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f1078a == dVar.f1078a && this.f1079b.equals(dVar.f1079b);
    }

    public final int hashCode() {
        return this.f1079b.hashCode() ^ ((this.f1078a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Overlay{largestBatchId=" + this.f1078a + ", mutation=" + this.f1079b + "}";
    }
}
