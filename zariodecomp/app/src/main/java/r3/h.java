package r3;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\r3.1\h.smali */
public final class h extends k {

    /* renamed from: a, reason: collision with root package name */
    public final String f9653a;

    public h(String str) {
        this.f9653a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && kotlin.jvm.internal.i.a(this.f9653a, ((h) obj).f9653a);
    }

    public final int hashCode() {
        return this.f9653a.hashCode();
    }

    public final String toString() {
        return B.a.m(new StringBuilder("Error(message="), this.f9653a, ")");
    }
}
