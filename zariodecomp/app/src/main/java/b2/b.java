package B2;

import A2.C0002b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B2\b.smali */
public final class b implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f300d = new b(o.f333b, h.b(), -1);

    /* renamed from: e, reason: collision with root package name */
    public static final C0002b f301e = new C0002b(6);

    /* renamed from: a, reason: collision with root package name */
    public final o f302a;

    /* renamed from: b, reason: collision with root package name */
    public final h f303b;

    /* renamed from: c, reason: collision with root package name */
    public final int f304c;

    public b(o oVar, h hVar, int i) {
        if (oVar == null) {
            throw new NullPointerException("Null readTime");
        }
        this.f302a = oVar;
        if (hVar == null) {
            throw new NullPointerException("Null documentKey");
        }
        this.f303b = hVar;
        this.f304c = i;
    }

    public static b b(l lVar) {
        return new b(lVar.f325d, lVar.f322a, -1);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(b bVar) {
        int iCompareTo = this.f302a.compareTo(bVar.f302a);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = this.f303b.compareTo(bVar.f303b);
        return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(this.f304c, bVar.f304c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f302a.equals(bVar.f302a) && this.f303b.equals(bVar.f303b) && this.f304c == bVar.f304c;
    }

    public final int hashCode() {
        return this.f304c ^ ((((this.f302a.f334a.hashCode() ^ 1000003) * 1000003) ^ this.f303b.f315a.hashCode()) * 1000003);
    }

    public final String toString() {
        return "IndexOffset{readTime=" + this.f302a + ", documentKey=" + this.f303b + ", largestBatchId=" + this.f304c + "}";
    }
}
