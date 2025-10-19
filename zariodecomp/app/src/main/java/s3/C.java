package s3;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s3.1\C.smali */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final long f9702a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9703b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9704c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9705d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9706e;

    /* renamed from: f, reason: collision with root package name */
    public final B f9707f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f9708g;

    public C(long j5, String str, int i, String str2, String str3, B b5, Integer num) {
        this.f9702a = j5;
        this.f9703b = str;
        this.f9704c = i;
        this.f9705d = str2;
        this.f9706e = str3;
        this.f9707f = b5;
        this.f9708g = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c5 = (C) obj;
        return this.f9702a == c5.f9702a && kotlin.jvm.internal.i.a(this.f9703b, c5.f9703b) && this.f9704c == c5.f9704c && kotlin.jvm.internal.i.a(this.f9705d, c5.f9705d) && kotlin.jvm.internal.i.a(this.f9706e, c5.f9706e) && this.f9707f == c5.f9707f && kotlin.jvm.internal.i.a(this.f9708g, c5.f9708g);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f9702a) * 31;
        String str = this.f9703b;
        int iC = B.a.c(this.f9704c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f9705d;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9706e;
        int iHashCode3 = (this.f9707f.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        Integer num = this.f9708g;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "DroppedEvent(timestampMs=" + this.f9702a + ", packageName=" + this.f9703b + ", eventType=" + this.f9704c + ", taskRootPackageName=" + this.f9705d + ", taskRootClassName=" + this.f9706e + ", dropReason=" + this.f9707f + ", instanceId=" + this.f9708g + ")";
    }
}
