package S0;

import J0.C0111e;
import java.util.ArrayList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S0\p.smali */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f2878a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2879b;

    /* renamed from: c, reason: collision with root package name */
    public final J0.h f2880c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2881d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2882e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2883f;

    /* renamed from: g, reason: collision with root package name */
    public final C0111e f2884g;
    public final int h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final long f2885j;

    /* renamed from: k, reason: collision with root package name */
    public final long f2886k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2887l;

    /* renamed from: m, reason: collision with root package name */
    public final int f2888m;

    /* renamed from: n, reason: collision with root package name */
    public final long f2889n;

    /* renamed from: o, reason: collision with root package name */
    public final int f2890o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f2891p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f2892q;

    public p(String id, int i, J0.h hVar, long j5, long j6, long j7, C0111e c0111e, int i5, int i6, long j8, long j9, int i7, int i8, long j10, int i9, ArrayList arrayList, ArrayList arrayList2) {
        kotlin.jvm.internal.i.e(id, "id");
        B.a.r(i, "state");
        B.a.r(i6, "backoffPolicy");
        this.f2878a = id;
        this.f2879b = i;
        this.f2880c = hVar;
        this.f2881d = j5;
        this.f2882e = j6;
        this.f2883f = j7;
        this.f2884g = c0111e;
        this.h = i5;
        this.i = i6;
        this.f2885j = j8;
        this.f2886k = j9;
        this.f2887l = i7;
        this.f2888m = i8;
        this.f2889n = j10;
        this.f2890o = i9;
        this.f2891p = arrayList;
        this.f2892q = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.i.a(this.f2878a, pVar.f2878a) && this.f2879b == pVar.f2879b && this.f2880c.equals(pVar.f2880c) && this.f2881d == pVar.f2881d && this.f2882e == pVar.f2882e && this.f2883f == pVar.f2883f && this.f2884g.equals(pVar.f2884g) && this.h == pVar.h && this.i == pVar.i && this.f2885j == pVar.f2885j && this.f2886k == pVar.f2886k && this.f2887l == pVar.f2887l && this.f2888m == pVar.f2888m && this.f2889n == pVar.f2889n && this.f2890o == pVar.f2890o && this.f2891p.equals(pVar.f2891p) && this.f2892q.equals(pVar.f2892q);
    }

    public final int hashCode() {
        return this.f2892q.hashCode() + ((this.f2891p.hashCode() + B.a.c(this.f2890o, B.a.e(B.a.c(this.f2888m, B.a.c(this.f2887l, B.a.e(B.a.e((t.h.c(this.i) + B.a.c(this.h, (this.f2884g.hashCode() + B.a.e(B.a.e(B.a.e((this.f2880c.hashCode() + ((t.h.c(this.f2879b) + (this.f2878a.hashCode() * 31)) * 31)) * 31, 31, this.f2881d), 31, this.f2882e), 31, this.f2883f)) * 31, 31)) * 31, 31, this.f2885j), 31, this.f2886k), 31), 31), 31, this.f2889n), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkInfoPojo(id=");
        sb.append(this.f2878a);
        sb.append(", state=");
        sb.append(B.a.y(this.f2879b));
        sb.append(", output=");
        sb.append(this.f2880c);
        sb.append(", initialDelay=");
        sb.append(this.f2881d);
        sb.append(", intervalDuration=");
        sb.append(this.f2882e);
        sb.append(", flexDuration=");
        sb.append(this.f2883f);
        sb.append(", constraints=");
        sb.append(this.f2884g);
        sb.append(", runAttemptCount=");
        sb.append(this.h);
        sb.append(", backoffPolicy=");
        int i = this.i;
        sb.append(i != 1 ? i != 2 ? "null" : "LINEAR" : "EXPONENTIAL");
        sb.append(", backoffDelayDuration=");
        sb.append(this.f2885j);
        sb.append(", lastEnqueueTime=");
        sb.append(this.f2886k);
        sb.append(", periodCount=");
        sb.append(this.f2887l);
        sb.append(", generation=");
        sb.append(this.f2888m);
        sb.append(", nextScheduleTimeOverride=");
        sb.append(this.f2889n);
        sb.append(", stopReason=");
        sb.append(this.f2890o);
        sb.append(", tags=");
        sb.append(this.f2891p);
        sb.append(", progress=");
        sb.append(this.f2892q);
        sb.append(')');
        return sb.toString();
    }
}
