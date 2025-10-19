package s3;

/* renamed from: s3.l, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s3.1\l.1.smali */
public final class C0889l {

    /* renamed from: a, reason: collision with root package name */
    public final long f9787a;

    /* renamed from: b, reason: collision with root package name */
    public final z f9788b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9789c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f9790d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9791e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9792f;

    public C0889l(long j5, z type, String str, Integer num, String str2, String str3) {
        kotlin.jvm.internal.i.e(type, "type");
        this.f9787a = j5;
        this.f9788b = type;
        this.f9789c = str;
        this.f9790d = num;
        this.f9791e = str2;
        this.f9792f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0889l)) {
            return false;
        }
        C0889l c0889l = (C0889l) obj;
        return this.f9787a == c0889l.f9787a && this.f9788b == c0889l.f9788b && kotlin.jvm.internal.i.a(this.f9789c, c0889l.f9789c) && kotlin.jvm.internal.i.a(this.f9790d, c0889l.f9790d) && kotlin.jvm.internal.i.a(this.f9791e, c0889l.f9791e) && kotlin.jvm.internal.i.a(this.f9792f, c0889l.f9792f);
    }

    public final int hashCode() {
        int iF = B.a.f((this.f9788b.hashCode() + (Long.hashCode(this.f9787a) * 31)) * 31, 31, this.f9789c);
        Integer num = this.f9790d;
        int iHashCode = (iF + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f9791e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9792f;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsageEvent(timestampMs=");
        sb.append(this.f9787a);
        sb.append(", type=");
        sb.append(this.f9788b);
        sb.append(", packageName=");
        sb.append(this.f9789c);
        sb.append(", instanceId=");
        sb.append(this.f9790d);
        sb.append(", taskRootPackageName=");
        sb.append(this.f9791e);
        sb.append(", taskRootClassName=");
        return B.a.m(sb, this.f9792f, ")");
    }
}
