package o3;

/* renamed from: o3.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o3.1\e.smali */
public final class C0811e {

    /* renamed from: a, reason: collision with root package name */
    public final long f9240a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9241b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC0812f f9242c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9243d;

    public C0811e(long j5, String str, EnumC0812f enumC0812f, int i) {
        this.f9240a = j5;
        this.f9241b = str;
        this.f9242c = enumC0812f;
        this.f9243d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0811e)) {
            return false;
        }
        C0811e c0811e = (C0811e) obj;
        return this.f9240a == c0811e.f9240a && kotlin.jvm.internal.i.a(this.f9241b, c0811e.f9241b) && this.f9242c == c0811e.f9242c && this.f9243d == c0811e.f9243d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9243d) + ((this.f9242c.hashCode() + B.a.f(Long.hashCode(this.f9240a) * 31, 31, this.f9241b)) * 31);
    }

    public final String toString() {
        return "ProfileCycleItem(id=" + this.f9240a + ", dateLabel=" + this.f9241b + ", statusLabel=" + this.f9242c + ", pointsAfter=" + this.f9243d + ")";
    }
}
