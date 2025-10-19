package V2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\V2\q.smali */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3463a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3464b;

    public /* synthetic */ q() {
        this(null, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f3463a == qVar.f3463a && kotlin.jvm.internal.i.a(this.f3464b, qVar.f3464b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f3463a) * 31;
        String str = this.f3464b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValidationResult(isValid=");
        sb.append(this.f3463a);
        sb.append(", errorMessage=");
        return B.a.m(sb, this.f3464b, ")");
    }

    public q(String str, boolean z4) {
        this.f3463a = z4;
        this.f3464b = str;
    }
}
