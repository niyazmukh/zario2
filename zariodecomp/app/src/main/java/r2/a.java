package R2;

import V2.f;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\R2\a.smali */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2836a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2837b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2838c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2839d;

    /* renamed from: e, reason: collision with root package name */
    public final f f2840e;

    public a(String str, String str2, String str3, String str4, f condition) {
        i.e(condition, "condition");
        this.f2836a = str;
        this.f2837b = str2;
        this.f2838c = str3;
        this.f2839d = str4;
        this.f2840e = condition;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.f2836a, aVar.f2836a) && i.a(this.f2837b, aVar.f2837b) && i.a(this.f2838c, aVar.f2838c) && i.a(this.f2839d, aVar.f2839d) && this.f2840e == aVar.f2840e;
    }

    public final int hashCode() {
        return this.f2840e.hashCode() + B.a.f(B.a.f(B.a.f(this.f2836a.hashCode() * 31, 31, this.f2837b), 31, this.f2838c), 31, this.f2839d);
    }

    public final String toString() {
        return "SignupRequest(email=" + this.f2836a + ", password=" + this.f2837b + ", yearOfBirth=" + this.f2838c + ", gender=" + this.f2839d + ", condition=" + this.f2840e + ")";
    }
}
