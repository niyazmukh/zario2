package J0;

import java.util.HashSet;
import java.util.UUID;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\J0\B.smali */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f2013a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2014b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f2015c;

    /* renamed from: d, reason: collision with root package name */
    public final h f2016d;

    /* renamed from: e, reason: collision with root package name */
    public final h f2017e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2018f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2019g;
    public final C0111e h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final A f2020j;

    /* renamed from: k, reason: collision with root package name */
    public final long f2021k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2022l;

    public B(UUID uuid, int i, HashSet hashSet, h hVar, h hVar2, int i5, int i6, C0111e c0111e, long j5, A a5, long j6, int i7) {
        B.a.r(i, "state");
        this.f2013a = uuid;
        this.f2014b = i;
        this.f2015c = hashSet;
        this.f2016d = hVar;
        this.f2017e = hVar2;
        this.f2018f = i5;
        this.f2019g = i6;
        this.h = c0111e;
        this.i = j5;
        this.f2020j = a5;
        this.f2021k = j6;
        this.f2022l = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !B.class.equals(obj.getClass())) {
            return false;
        }
        B b5 = (B) obj;
        if (this.f2018f == b5.f2018f && this.f2019g == b5.f2019g && this.f2013a.equals(b5.f2013a) && this.f2014b == b5.f2014b && this.f2016d.equals(b5.f2016d) && this.h.equals(b5.h) && this.i == b5.i && kotlin.jvm.internal.i.a(this.f2020j, b5.f2020j) && this.f2021k == b5.f2021k && this.f2022l == b5.f2022l && this.f2015c.equals(b5.f2015c)) {
            return this.f2017e.equals(b5.f2017e);
        }
        return false;
    }

    public final int hashCode() {
        int iE = B.a.e((this.h.hashCode() + ((((((this.f2017e.hashCode() + ((this.f2015c.hashCode() + ((this.f2016d.hashCode() + ((t.h.c(this.f2014b) + (this.f2013a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f2018f) * 31) + this.f2019g) * 31)) * 31, 31, this.i);
        A a5 = this.f2020j;
        return Integer.hashCode(this.f2022l) + B.a.e((iE + (a5 != null ? a5.hashCode() : 0)) * 31, 31, this.f2021k);
    }

    public final String toString() {
        return "WorkInfo{id='" + this.f2013a + "', state=" + B.a.y(this.f2014b) + ", outputData=" + this.f2016d + ", tags=" + this.f2015c + ", progress=" + this.f2017e + ", runAttemptCount=" + this.f2018f + ", generation=" + this.f2019g + ", constraints=" + this.h + ", initialDelayMillis=" + this.i + ", periodicityInfo=" + this.f2020j + ", nextScheduleTimeMillis=" + this.f2021k + "}, stopReason=" + this.f2022l;
    }
}
