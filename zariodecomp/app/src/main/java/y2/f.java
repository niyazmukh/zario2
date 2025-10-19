package Y2;

import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Y2\f.smali */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f3913a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f3914b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3915c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3916d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3917e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3918f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3919g;
    public final long h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final long f3920j;

    /* renamed from: k, reason: collision with root package name */
    public final e f3921k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3922l;

    /* renamed from: m, reason: collision with root package name */
    public final Long f3923m;

    /* renamed from: n, reason: collision with root package name */
    public final long f3924n;

    public f(long j5, Long l4, String userId, String userEmail, String planLabel, long j6, long j7, long j8, String packageName, long j9, e syncType, int i, Long l5, long j10) {
        i.e(userId, "userId");
        i.e(userEmail, "userEmail");
        i.e(planLabel, "planLabel");
        i.e(packageName, "packageName");
        i.e(syncType, "syncType");
        this.f3913a = j5;
        this.f3914b = l4;
        this.f3915c = userId;
        this.f3916d = userEmail;
        this.f3917e = planLabel;
        this.f3918f = j6;
        this.f3919g = j7;
        this.h = j8;
        this.i = packageName;
        this.f3920j = j9;
        this.f3921k = syncType;
        this.f3922l = i;
        this.f3923m = l5;
        this.f3924n = j10;
    }

    public static f a(f fVar, Long l4, int i, Long l5, int i5) {
        long j5 = fVar.f3913a;
        Long l6 = (i5 & 2) != 0 ? fVar.f3914b : l4;
        String userId = fVar.f3915c;
        String userEmail = fVar.f3916d;
        String planLabel = fVar.f3917e;
        long j6 = fVar.f3918f;
        long j7 = fVar.f3919g;
        long j8 = fVar.h;
        String packageName = fVar.i;
        long j9 = fVar.f3920j;
        e syncType = fVar.f3921k;
        int i6 = (i5 & 2048) != 0 ? fVar.f3922l : i;
        Long l7 = (i5 & 4096) != 0 ? fVar.f3923m : l5;
        long j10 = fVar.f3924n;
        fVar.getClass();
        i.e(userId, "userId");
        i.e(userEmail, "userEmail");
        i.e(planLabel, "planLabel");
        i.e(packageName, "packageName");
        i.e(syncType, "syncType");
        return new f(j5, l6, userId, userEmail, planLabel, j6, j7, j8, packageName, j9, syncType, i6, l7, j10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f3913a == fVar.f3913a && i.a(this.f3914b, fVar.f3914b) && i.a(this.f3915c, fVar.f3915c) && i.a(this.f3916d, fVar.f3916d) && i.a(this.f3917e, fVar.f3917e) && this.f3918f == fVar.f3918f && this.f3919g == fVar.f3919g && this.h == fVar.h && i.a(this.i, fVar.i) && this.f3920j == fVar.f3920j && this.f3921k == fVar.f3921k && this.f3922l == fVar.f3922l && i.a(this.f3923m, fVar.f3923m) && this.f3924n == fVar.f3924n;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f3913a) * 31;
        Long l4 = this.f3914b;
        int iC = B.a.c(this.f3922l, (this.f3921k.hashCode() + B.a.e(B.a.f(B.a.e(B.a.e(B.a.e(B.a.f(B.a.f(B.a.f((iHashCode + (l4 == null ? 0 : l4.hashCode())) * 31, 31, this.f3915c), 31, this.f3916d), 31, this.f3917e), 31, this.f3918f), 31, this.f3919g), 31, this.h), 31, this.i), 31, this.f3920j)) * 31, 31);
        Long l5 = this.f3923m;
        return Long.hashCode(this.f3924n) + ((iC + (l5 != null ? l5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PendingHourlySyncEntity(id=" + this.f3913a + ", parentCycleId=" + this.f3914b + ", userId=" + this.f3915c + ", userEmail=" + this.f3916d + ", planLabel=" + this.f3917e + ", cycleStartTime=" + this.f3918f + ", hourStartTime=" + this.f3919g + ", hourEndTime=" + this.h + ", packageName=" + this.i + ", usageMs=" + this.f3920j + ", syncType=" + this.f3921k + ", attempts=" + this.f3922l + ", lastAttemptAt=" + this.f3923m + ", createdAt=" + this.f3924n + ")";
    }

    public /* synthetic */ f(String str, String str2, String str3, long j5, long j6, long j7, String str4, long j8, e eVar) {
        this(0L, null, str, str2, str3, j5, j6, j7, str4, j8, eVar, 0, null, System.currentTimeMillis());
    }
}
