package w0;

import e4.m;
import java.util.Locale;
import kotlin.jvm.internal.i;
import u0.v;

/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w0.1\a.smali */
public final class C1021a {

    /* renamed from: a, reason: collision with root package name */
    public final String f10873a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10874b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10875c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10876d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10877e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10878f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10879g;

    public C1021a(String str, String str2, boolean z4, int i, String str3, int i5) {
        this.f10873a = str;
        this.f10874b = str2;
        this.f10875c = z4;
        this.f10876d = i;
        this.f10877e = str3;
        this.f10878f = i5;
        Locale US = Locale.US;
        i.d(US, "US");
        String upperCase = str2.toUpperCase(US);
        i.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
        this.f10879g = m.l0(upperCase, "INT") ? 3 : (m.l0(upperCase, "CHAR") || m.l0(upperCase, "CLOB") || m.l0(upperCase, "TEXT")) ? 2 : m.l0(upperCase, "BLOB") ? 5 : (m.l0(upperCase, "REAL") || m.l0(upperCase, "FLOA") || m.l0(upperCase, "DOUB")) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1021a)) {
            return false;
        }
        C1021a c1021a = (C1021a) obj;
        if (this.f10876d != c1021a.f10876d) {
            return false;
        }
        if (!this.f10873a.equals(c1021a.f10873a) || this.f10875c != c1021a.f10875c) {
            return false;
        }
        int i = c1021a.f10878f;
        String str = c1021a.f10877e;
        String str2 = this.f10877e;
        int i5 = this.f10878f;
        if (i5 == 1 && i == 2 && str2 != null && !v.d(str2, str)) {
            return false;
        }
        if (i5 != 2 || i != 1 || str == null || v.d(str, str2)) {
            return (i5 == 0 || i5 != i || (str2 == null ? str == null : v.d(str2, str))) && this.f10879g == c1021a.f10879g;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f10873a.hashCode() * 31) + this.f10879g) * 31) + (this.f10875c ? 1231 : 1237)) * 31) + this.f10876d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f10873a);
        sb.append("', type='");
        sb.append(this.f10874b);
        sb.append("', affinity='");
        sb.append(this.f10879g);
        sb.append("', notNull=");
        sb.append(this.f10875c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.f10876d);
        sb.append(", defaultValue='");
        String str = this.f10877e;
        if (str == null) {
            str = "undefined";
        }
        return B.a.m(sb, str, "'}");
    }
}
