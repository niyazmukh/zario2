package v3;

import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v3.1\e.smali */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f10682a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10683b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10684c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10685d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10686e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10687f;

    public e(String packageName, long j5, long j6, long j7, long j8, String str) {
        i.e(packageName, "packageName");
        this.f10682a = packageName;
        this.f10683b = j5;
        this.f10684c = j6;
        this.f10685d = j7;
        this.f10686e = j8;
        this.f10687f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return i.a(this.f10682a, eVar.f10682a) && this.f10683b == eVar.f10683b && this.f10684c == eVar.f10684c && this.f10685d == eVar.f10685d && this.f10686e == eVar.f10686e && i.a(this.f10687f, eVar.f10687f);
    }

    public final int hashCode() {
        int iE = B.a.e(B.a.e(B.a.e(B.a.e(this.f10682a.hashCode() * 31, 31, this.f10683b), 31, this.f10684c), 31, this.f10685d), 31, this.f10686e);
        String str = this.f10687f;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsageSessionEntity(packageName=");
        sb.append(this.f10682a);
        sb.append(", startMs=");
        sb.append(this.f10683b);
        sb.append(", endMs=");
        sb.append(this.f10684c);
        sb.append(", durationMs=");
        sb.append(this.f10685d);
        sb.append(", dayStartMs=");
        sb.append(this.f10686e);
        sb.append(", taskRootPackageName=");
        return B.a.m(sb, this.f10687f, ")");
    }
}
