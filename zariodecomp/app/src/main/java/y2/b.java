package Y2;

import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Y2\b.smali */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f3881a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3882b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3883c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3884d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3885e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3886f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3887g;
    public final long h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f3888j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3889k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3890l;

    public b(long j5, String userId, String userEmail, String planLabel, long j6, long j7, long j8, long j9, long j10, boolean z4, int i, int i5) {
        i.e(userId, "userId");
        i.e(userEmail, "userEmail");
        i.e(planLabel, "planLabel");
        this.f3881a = j5;
        this.f3882b = userId;
        this.f3883c = userEmail;
        this.f3884d = planLabel;
        this.f3885e = j6;
        this.f3886f = j7;
        this.f3887g = j8;
        this.h = j9;
        this.i = j10;
        this.f3888j = z4;
        this.f3889k = i;
        this.f3890l = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3881a == bVar.f3881a && i.a(this.f3882b, bVar.f3882b) && i.a(this.f3883c, bVar.f3883c) && i.a(this.f3884d, bVar.f3884d) && this.f3885e == bVar.f3885e && this.f3886f == bVar.f3886f && this.f3887g == bVar.f3887g && this.h == bVar.h && this.i == bVar.i && this.f3888j == bVar.f3888j && this.f3889k == bVar.f3889k && this.f3890l == bVar.f3890l;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3890l) + B.a.c(this.f3889k, (Boolean.hashCode(this.f3888j) + B.a.e(B.a.e(B.a.e(B.a.e(B.a.e(B.a.f(B.a.f(B.a.f(Long.hashCode(this.f3881a) * 31, 31, this.f3882b), 31, this.f3883c), 31, this.f3884d), 31, this.f3885e), 31, this.f3886f), 31, this.f3887g), 31, this.h), 31, this.i)) * 31, 31);
    }

    public final String toString() {
        return "EvaluationHistoryEntry(id=" + this.f3881a + ", userId=" + this.f3882b + ", userEmail=" + this.f3883c + ", planLabel=" + this.f3884d + ", goalTimeMs=" + this.f3885e + ", dailyAverageMs=" + this.f3886f + ", finalUsageMs=" + this.f3887g + ", evaluationStartTime=" + this.h + ", evaluationEndTime=" + this.i + ", metGoal=" + this.f3888j + ", pointsDelta=" + this.f3889k + ", pointsBalanceAfter=" + this.f3890l + ")";
    }
}
