package V2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\V2\j.smali */
public final class j extends m {

    /* renamed from: a, reason: collision with root package name */
    public final String f3445a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3446b = true;

    public j(String str) {
        this.f3445a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.i.a(this.f3445a, jVar.f3445a) && this.f3446b == jVar.f3446b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3446b) + (this.f3445a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(message=" + this.f3445a + ", isRetryable=" + this.f3446b + ")";
    }
}
