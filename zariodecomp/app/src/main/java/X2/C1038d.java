package x2;

/* renamed from: x2.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\x2.1\d.smali */
public final class C1038d {

    /* renamed from: b, reason: collision with root package name */
    public static final C1038d f11024b = new C1038d(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f11025a;

    public C1038d(String str) {
        this.f11025a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1038d.class != obj.getClass()) {
            return false;
        }
        String str = ((C1038d) obj).f11025a;
        String str2 = this.f11025a;
        return str2 != null ? str2.equals(str) : str == null;
    }

    public final int hashCode() {
        String str = this.f11025a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return B.a.m(new StringBuilder("User(uid:"), this.f11025a, ")");
    }
}
