package V2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\V2\o.smali */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f3452a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3453b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3454c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3455d;

    /* renamed from: e, reason: collision with root package name */
    public final f f3456e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3457f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3458g;
    public final boolean h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3459j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3460k;

    public /* synthetic */ o(String str, String str2, String str3, String str4, f fVar, int i, int i5, int i6, boolean z4, int i7) {
        this(str, str2, str3, str4, fVar, (i7 & 32) != 0 ? 100 : i, false, false, (i7 & 256) != 0 ? 5 : i5, (i7 & 512) != 0 ? 20 : i6, (i7 & 1024) != 0 ? false : z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.i.a(this.f3452a, oVar.f3452a) && kotlin.jvm.internal.i.a(this.f3453b, oVar.f3453b) && kotlin.jvm.internal.i.a(this.f3454c, oVar.f3454c) && kotlin.jvm.internal.i.a(this.f3455d, oVar.f3455d) && this.f3456e == oVar.f3456e && this.f3457f == oVar.f3457f && this.f3458g == oVar.f3458g && this.h == oVar.h && this.i == oVar.i && this.f3459j == oVar.f3459j && this.f3460k == oVar.f3460k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3460k) + B.a.c(this.f3459j, B.a.c(this.i, (Boolean.hashCode(this.h) + ((Boolean.hashCode(this.f3458g) + B.a.c(this.f3457f, (this.f3456e.hashCode() + B.a.f(B.a.f(B.a.f(this.f3452a.hashCode() * 31, 31, this.f3453b), 31, this.f3454c), 31, this.f3455d)) * 31, 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "User(email=" + this.f3452a + ", id=" + this.f3453b + ", yearOfBirth=" + this.f3454c + ", gender=" + this.f3455d + ", condition=" + this.f3456e + ", points=" + this.f3457f + ", hasNotificationPermission=" + this.f3458g + ", hasUsageStatsPermission=" + this.h + ", flexibleReward=" + this.i + ", flexiblePenalty=" + this.f3459j + ", hasSetFlexibleStakes=" + this.f3460k + ")";
    }

    public o(String email, String id, String yearOfBirth, String gender, f condition, int i, boolean z4, boolean z5, int i5, int i6, boolean z6) {
        kotlin.jvm.internal.i.e(email, "email");
        kotlin.jvm.internal.i.e(id, "id");
        kotlin.jvm.internal.i.e(yearOfBirth, "yearOfBirth");
        kotlin.jvm.internal.i.e(gender, "gender");
        kotlin.jvm.internal.i.e(condition, "condition");
        this.f3452a = email;
        this.f3453b = id;
        this.f3454c = yearOfBirth;
        this.f3455d = gender;
        this.f3456e = condition;
        this.f3457f = i;
        this.f3458g = z4;
        this.h = z5;
        this.i = i5;
        this.f3459j = i6;
        this.f3460k = z6;
    }
}
