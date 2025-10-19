package u3;

import s3.C0889l;
import s3.z;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u3.1\g.smali */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final long f10503a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10504b;

    /* renamed from: c, reason: collision with root package name */
    public final z f10505c;

    /* renamed from: d, reason: collision with root package name */
    public final C0889l f10506d;

    /* renamed from: e, reason: collision with root package name */
    public final i f10507e;

    public g(long j5, String str, z type, C0889l c0889l) {
        b bVar = b.f10484a;
        kotlin.jvm.internal.i.e(type, "type");
        this.f10503a = j5;
        this.f10504b = str;
        this.f10505c = type;
        this.f10506d = c0889l;
        this.f10507e = i.f10510c;
    }

    @Override // u3.h
    public final b a() {
        return b.f10485b;
    }

    @Override // u3.h
    public final i b() {
        return this.f10507e;
    }

    @Override // u3.h
    public final long c() {
        return this.f10503a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f10503a != gVar.f10503a) {
            return false;
        }
        b bVar = b.f10484a;
        return this.f10504b.equals(gVar.f10504b) && this.f10505c == gVar.f10505c && this.f10506d.equals(gVar.f10506d);
    }

    public final int hashCode() {
        return this.f10506d.hashCode() + ((this.f10505c.hashCode() + B.a.f((b.f10485b.hashCode() + (Long.hashCode(this.f10503a) * 31)) * 31, 31, this.f10504b)) * 31);
    }

    public final String toString() {
        return "UsageStats(epochMillis=" + this.f10503a + ", confidence=" + b.f10485b + ", packageName=" + this.f10504b + ", type=" + this.f10505c + ", backingEvent=" + this.f10506d + ")";
    }
}
