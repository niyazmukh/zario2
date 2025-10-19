package B2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B2\o.smali */
public final class o implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final o f333b = new o(new l2.o(0, 0));

    /* renamed from: a, reason: collision with root package name */
    public final l2.o f334a;

    public o(l2.o oVar) {
        this.f334a = oVar;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(o oVar) {
        return this.f334a.compareTo(oVar.f334a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof o) && compareTo((o) obj) == 0;
    }

    public final int hashCode() {
        return this.f334a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SnapshotVersion(seconds=");
        l2.o oVar = this.f334a;
        sb.append(oVar.f8792a);
        sb.append(", nanos=");
        sb.append(oVar.f8793b);
        sb.append(")");
        return sb.toString();
    }
}
