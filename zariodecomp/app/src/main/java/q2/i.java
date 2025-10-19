package q2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q2.1\i.smali */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final q f9489a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9490b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9491c;

    public i(int i, int i5, Class cls) {
        this(q.a(cls), i, i5);
    }

    public static i a(Class cls) {
        return new i(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f9489a.equals(iVar.f9489a) && this.f9490b == iVar.f9490b && this.f9491c == iVar.f9491c;
    }

    public final int hashCode() {
        return this.f9491c ^ ((((this.f9489a.hashCode() ^ 1000003) * 1000003) ^ this.f9490b) * 1000003);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f9489a);
        sb.append(", type=");
        int i = this.f9490b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i5 = this.f9491c;
        if (i5 == 0) {
            str = "direct";
        } else if (i5 == 1) {
            str = "provider";
        } else {
            if (i5 != 2) {
                throw new AssertionError(B.a.g(i5, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return B.a.m(sb, str, "}");
    }

    public i(q qVar, int i, int i5) {
        this.f9489a = qVar;
        this.f9490b = i;
        this.f9491c = i5;
    }
}
