package s3;

/* renamed from: s3.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s3.1\c.1.smali */
public final class C0880c {

    /* renamed from: a, reason: collision with root package name */
    public final String f9749a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9750b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9751c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9752d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9753e;

    public C0880c(long j5, long j6, long j7, String packageName, String str) {
        kotlin.jvm.internal.i.e(packageName, "packageName");
        this.f9749a = packageName;
        this.f9750b = j5;
        this.f9751c = j6;
        this.f9752d = j7;
        this.f9753e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0880c)) {
            return false;
        }
        C0880c c0880c = (C0880c) obj;
        return kotlin.jvm.internal.i.a(this.f9749a, c0880c.f9749a) && this.f9750b == c0880c.f9750b && this.f9751c == c0880c.f9751c && this.f9752d == c0880c.f9752d && kotlin.jvm.internal.i.a(this.f9753e, c0880c.f9753e);
    }

    public final int hashCode() {
        int iE = B.a.e(B.a.e(B.a.e(this.f9749a.hashCode() * 31, 31, this.f9750b), 31, this.f9751c), 31, this.f9752d);
        String str = this.f9753e;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "SessionSlice(packageName=" + this.f9749a + ", startMs=" + this.f9750b + ", endMs=" + this.f9751c + ", dayStartMs=" + this.f9752d + ", taskRootPackageName=" + this.f9753e + ")";
    }
}
