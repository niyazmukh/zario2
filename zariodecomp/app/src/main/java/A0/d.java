package a0;

import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\a0.1\d.smali */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f4022a;

    public d(String name) {
        i.e(name, "name");
        this.f4022a = name;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        return i.a(this.f4022a, ((d) obj).f4022a);
    }

    public final int hashCode() {
        return this.f4022a.hashCode();
    }

    public final String toString() {
        return this.f4022a;
    }
}
