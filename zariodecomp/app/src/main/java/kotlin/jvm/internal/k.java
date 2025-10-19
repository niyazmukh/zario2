package kotlin.jvm.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\kotlin\jvm\internal\k.smali */
public final class k implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Class f8426a;

    public k(Class jClass) {
        i.e(jClass, "jClass");
        this.f8426a = jClass;
    }

    @Override // kotlin.jvm.internal.c
    public final Class a() {
        return this.f8426a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f8426a, ((k) obj).f8426a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8426a.hashCode();
    }

    public final String toString() {
        return this.f8426a.toString() + " (Kotlin reflection is not available)";
    }
}
