package Y2;

import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Y2\c.smali */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f3891a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3892b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3893c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3894d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3895e;

    public c(long j5, long j6, long j7, String key, String userId) {
        i.e(key, "key");
        i.e(userId, "userId");
        this.f3891a = key;
        this.f3892b = userId;
        this.f3893c = j5;
        this.f3894d = j6;
        this.f3895e = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return i.a(this.f3891a, cVar.f3891a) && i.a(this.f3892b, cVar.f3892b) && this.f3893c == cVar.f3893c && this.f3894d == cVar.f3894d && this.f3895e == cVar.f3895e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3895e) + B.a.e(B.a.e(B.a.f(this.f3891a.hashCode() * 31, 31, this.f3892b), 31, this.f3893c), 31, this.f3894d);
    }

    public final String toString() {
        return "HourlySyncStateEntity(key=" + this.f3891a + ", userId=" + this.f3892b + ", cycleStartTime=" + this.f3893c + ", lastSyncedHourStart=" + this.f3894d + ", updatedAt=" + this.f3895e + ")";
    }
}
