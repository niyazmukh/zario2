package w2;

import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w2\r.smali */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f10957a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10958b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10959c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10960d;

    /* renamed from: e, reason: collision with root package name */
    public final v f10961e;

    public r(q qVar) {
        this.f10957a = qVar.f10951a;
        this.f10958b = qVar.f10952b;
        this.f10959c = qVar.f10953c;
        this.f10960d = qVar.f10954d;
        this.f10961e = qVar.f10955e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f10958b == rVar.f10958b && this.f10959c == rVar.f10959c && this.f10960d == rVar.f10960d && this.f10957a.equals(rVar.f10957a)) {
            return Objects.equals(this.f10961e, rVar.f10961e);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f10957a.hashCode() * 31) + (this.f10958b ? 1 : 0)) * 31) + (this.f10959c ? 1 : 0)) * 31;
        long j5 = this.f10960d;
        int i = (iHashCode + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        v vVar = this.f10961e;
        return i + (vVar != null ? vVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FirebaseFirestoreSettings{host=");
        sb.append(this.f10957a);
        sb.append(", sslEnabled=");
        sb.append(this.f10958b);
        sb.append(", persistenceEnabled=");
        sb.append(this.f10959c);
        sb.append(", cacheSizeBytes=");
        sb.append(this.f10960d);
        sb.append(", cacheSettings=");
        v vVar = this.f10961e;
        sb.append(vVar);
        if (sb.toString() == null) {
            return "null";
        }
        return vVar.toString() + "}";
    }
}
