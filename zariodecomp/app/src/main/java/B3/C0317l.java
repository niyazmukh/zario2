package b3;

/* renamed from: b3.l, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\l.1.smali */
public final class C0317l {

    /* renamed from: a, reason: collision with root package name */
    public final String f5273a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5274b;

    public C0317l(String id, String str) {
        kotlin.jvm.internal.i.e(id, "id");
        this.f5273a = id;
        this.f5274b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0317l)) {
            return false;
        }
        C0317l c0317l = (C0317l) obj;
        return kotlin.jvm.internal.i.a(this.f5273a, c0317l.f5273a) && kotlin.jvm.internal.i.a(this.f5274b, c0317l.f5274b);
    }

    public final int hashCode() {
        return this.f5274b.hashCode() + (this.f5273a.hashCode() * 31);
    }

    public final String toString() {
        return "UserIdentity(id=" + this.f5273a + ", email=" + this.f5274b + ")";
    }
}
