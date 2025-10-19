package B2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B2\d.smali */
public final class d implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final k f307a;

    /* renamed from: b, reason: collision with root package name */
    public final int f308b;

    public d(int i, k kVar) {
        if (kVar == null) {
            throw new NullPointerException("Null fieldPath");
        }
        this.f307a = kVar;
        if (i == 0) {
            throw new NullPointerException("Null kind");
        }
        this.f308b = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d dVar = (d) obj;
        int iCompareTo = this.f307a.compareTo(dVar.f307a);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i = this.f308b;
        int i5 = dVar.f308b;
        if (i == 0 || i5 == 0) {
            throw null;
        }
        return i - i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f307a.equals(dVar.f307a) && t.h.a(this.f308b, dVar.f308b);
    }

    public final int hashCode() {
        return t.h.c(this.f308b) ^ ((this.f307a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Segment{fieldPath=");
        sb.append(this.f307a);
        sb.append(", kind=");
        int i = this.f308b;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "CONTAINS" : "DESCENDING" : "ASCENDING");
        sb.append("}");
        return sb.toString();
    }
}
