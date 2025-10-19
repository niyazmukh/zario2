package s3;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s3.1\I.smali */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final String f9725a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9726b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9727c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9728d;

    public I(String packageName, long j5, long j6, String str) {
        kotlin.jvm.internal.i.e(packageName, "packageName");
        this.f9725a = packageName;
        this.f9726b = j5;
        this.f9727c = j6;
        this.f9728d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i = (I) obj;
        return kotlin.jvm.internal.i.a(this.f9725a, i.f9725a) && this.f9726b == i.f9726b && this.f9727c == i.f9727c && kotlin.jvm.internal.i.a(this.f9728d, i.f9728d);
    }

    public final int hashCode() {
        int iE = B.a.e(B.a.e(this.f9725a.hashCode() * 31, 31, this.f9726b), 31, this.f9727c);
        String str = this.f9728d;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsageSession(packageName=");
        sb.append(this.f9725a);
        sb.append(", startMs=");
        sb.append(this.f9726b);
        sb.append(", endMs=");
        sb.append(this.f9727c);
        sb.append(", taskRootPackageName=");
        return B.a.m(sb, this.f9728d, ")");
    }
}
