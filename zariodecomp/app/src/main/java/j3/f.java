package j3;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j3.1\f.smali */
public final class f extends j {

    /* renamed from: a, reason: collision with root package name */
    public final String f8049a;

    public f(String str) {
        this.f8049a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && kotlin.jvm.internal.i.a(this.f8049a, ((f) obj).f8049a);
    }

    public final int hashCode() {
        return this.f8049a.hashCode();
    }

    public final String toString() {
        return B.a.m(new StringBuilder("Error(message="), this.f8049a, ")");
    }
}
