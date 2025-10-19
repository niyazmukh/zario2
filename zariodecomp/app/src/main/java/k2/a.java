package K2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\K2\a.smali */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2270a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2271b;

    public a(String str, String str2) {
        this.f2270a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f2271b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f2270a.equals(aVar.f2270a) && this.f2271b.equals(aVar.f2271b);
    }

    public final int hashCode() {
        return this.f2271b.hashCode() ^ ((this.f2270a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f2270a);
        sb.append(", version=");
        return B.a.m(sb, this.f2271b, "}");
    }
}
