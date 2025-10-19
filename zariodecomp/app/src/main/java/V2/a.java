package V2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\V2\a.smali */
public final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    public final String f3426a;

    public a(String str) {
        this.f3426a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && kotlin.jvm.internal.i.a(this.f3426a, ((a) obj).f3426a);
    }

    public final int hashCode() {
        return this.f3426a.hashCode();
    }

    public final String toString() {
        return B.a.m(new StringBuilder("Error(message="), this.f3426a, ")");
    }
}
