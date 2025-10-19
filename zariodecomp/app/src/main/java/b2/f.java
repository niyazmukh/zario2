package B2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B2\f.smali */
public final class f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final String f310a;

    /* renamed from: b, reason: collision with root package name */
    public final String f311b;

    public f(String str, String str2) {
        this.f310a = str;
        this.f311b = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        int iCompareTo = this.f310a.compareTo(fVar.f310a);
        return iCompareTo != 0 ? iCompareTo : this.f311b.compareTo(fVar.f311b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.f310a.equals(fVar.f310a) && this.f311b.equals(fVar.f311b);
    }

    public final int hashCode() {
        return this.f311b.hashCode() + (this.f310a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DatabaseId(");
        sb.append(this.f310a);
        sb.append(", ");
        return B.a.m(sb, this.f311b, ")");
    }
}
