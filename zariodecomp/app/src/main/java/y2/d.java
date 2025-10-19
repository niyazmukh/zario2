package Y2;

import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Y2\d.smali */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f3896a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3897b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3898c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3899d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3900e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3901f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3902g;
    public final long h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final long f3903j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3904k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3905l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3906m;

    /* renamed from: n, reason: collision with root package name */
    public final int f3907n;

    /* renamed from: o, reason: collision with root package name */
    public final Long f3908o;

    /* renamed from: p, reason: collision with root package name */
    public final long f3909p;

    public d(long j5, String userId, String userEmail, String historyDocumentId, String planLabel, long j6, long j7, long j8, long j9, long j10, boolean z4, int i, int i5, int i6, Long l4, long j11) {
        i.e(userId, "userId");
        i.e(userEmail, "userEmail");
        i.e(historyDocumentId, "historyDocumentId");
        i.e(planLabel, "planLabel");
        this.f3896a = j5;
        this.f3897b = userId;
        this.f3898c = userEmail;
        this.f3899d = historyDocumentId;
        this.f3900e = planLabel;
        this.f3901f = j6;
        this.f3902g = j7;
        this.h = j8;
        this.i = j9;
        this.f3903j = j10;
        this.f3904k = z4;
        this.f3905l = i;
        this.f3906m = i5;
        this.f3907n = i6;
        this.f3908o = l4;
        this.f3909p = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f3896a == dVar.f3896a && i.a(this.f3897b, dVar.f3897b) && i.a(this.f3898c, dVar.f3898c) && i.a(this.f3899d, dVar.f3899d) && i.a(this.f3900e, dVar.f3900e) && this.f3901f == dVar.f3901f && this.f3902g == dVar.f3902g && this.h == dVar.h && this.i == dVar.i && this.f3903j == dVar.f3903j && this.f3904k == dVar.f3904k && this.f3905l == dVar.f3905l && this.f3906m == dVar.f3906m && this.f3907n == dVar.f3907n && i.a(this.f3908o, dVar.f3908o) && this.f3909p == dVar.f3909p;
    }

    public final int hashCode() {
        int iC = B.a.c(this.f3907n, B.a.c(this.f3906m, B.a.c(this.f3905l, (Boolean.hashCode(this.f3904k) + B.a.e(B.a.e(B.a.e(B.a.e(B.a.e(B.a.f(B.a.f(B.a.f(B.a.f(Long.hashCode(this.f3896a) * 31, 31, this.f3897b), 31, this.f3898c), 31, this.f3899d), 31, this.f3900e), 31, this.f3901f), 31, this.f3902g), 31, this.h), 31, this.i), 31, this.f3903j)) * 31, 31), 31), 31);
        Long l4 = this.f3908o;
        return Long.hashCode(this.f3909p) + ((iC + (l4 == null ? 0 : l4.hashCode())) * 31);
    }

    public final String toString() {
        return "PendingCycleSyncEntity(id=" + this.f3896a + ", userId=" + this.f3897b + ", userEmail=" + this.f3898c + ", historyDocumentId=" + this.f3899d + ", planLabel=" + this.f3900e + ", goalTimeMs=" + this.f3901f + ", dailyAverageMs=" + this.f3902g + ", finalUsageMs=" + this.h + ", evaluationStartTime=" + this.i + ", evaluationEndTime=" + this.f3903j + ", metGoal=" + this.f3904k + ", pointsDelta=" + this.f3905l + ", pointsBalanceAfter=" + this.f3906m + ", attempts=" + this.f3907n + ", lastAttemptAt=" + this.f3908o + ", createdAt=" + this.f3909p + ")";
    }
}
