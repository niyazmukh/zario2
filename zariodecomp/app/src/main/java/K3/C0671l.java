package k3;

import java.util.List;
import java.util.Set;

/* renamed from: k3.l, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k3.1\l.smali */
public final class C0671l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8326a;

    /* renamed from: b, reason: collision with root package name */
    public final List f8327b;

    /* renamed from: c, reason: collision with root package name */
    public final List f8328c;

    /* renamed from: d, reason: collision with root package name */
    public final C0667h f8329d;

    /* renamed from: e, reason: collision with root package name */
    public final C0668i f8330e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8331f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8332g;
    public final long h;
    public final Set i;

    /* renamed from: j, reason: collision with root package name */
    public final long f8333j;

    public C0671l(boolean z4, List list, List list2, C0667h c0667h, C0668i c0668i, String str, boolean z5, long j5, Set set, long j6) {
        this.f8326a = z4;
        this.f8327b = list;
        this.f8328c = list2;
        this.f8329d = c0667h;
        this.f8330e = c0668i;
        this.f8331f = str;
        this.f8332g = z5;
        this.h = j5;
        this.i = set;
        this.f8333j = j6;
    }

    public static C0671l a(C0671l c0671l, boolean z4, List list, List list2, C0667h c0667h, C0668i c0668i, String str, boolean z5, long j5, Set set, long j6, int i) {
        boolean z6 = (i & 1) != 0 ? c0671l.f8326a : z4;
        List entries = (i & 2) != 0 ? c0671l.f8327b : list;
        List hourlyUsage = (i & 4) != 0 ? c0671l.f8328c : list2;
        C0667h dateRange = (i & 8) != 0 ? c0671l.f8329d : c0667h;
        C0668i dateLimits = (i & 16) != 0 ? c0671l.f8330e : c0668i;
        String dateLabel = (i & 32) != 0 ? c0671l.f8331f : str;
        boolean z7 = (i & 64) != 0 ? c0671l.f8332g : z5;
        long j7 = (i & 128) != 0 ? c0671l.h : j5;
        Set selectedPackages = (i & 256) != 0 ? c0671l.i : set;
        long j8 = (i & 512) != 0 ? c0671l.f8333j : j6;
        c0671l.getClass();
        kotlin.jvm.internal.i.e(entries, "entries");
        kotlin.jvm.internal.i.e(hourlyUsage, "hourlyUsage");
        kotlin.jvm.internal.i.e(dateRange, "dateRange");
        kotlin.jvm.internal.i.e(dateLimits, "dateLimits");
        kotlin.jvm.internal.i.e(dateLabel, "dateLabel");
        kotlin.jvm.internal.i.e(selectedPackages, "selectedPackages");
        return new C0671l(z6, entries, hourlyUsage, dateRange, dateLimits, dateLabel, z7, j7, selectedPackages, j8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0671l)) {
            return false;
        }
        C0671l c0671l = (C0671l) obj;
        return this.f8326a == c0671l.f8326a && kotlin.jvm.internal.i.a(this.f8327b, c0671l.f8327b) && kotlin.jvm.internal.i.a(this.f8328c, c0671l.f8328c) && kotlin.jvm.internal.i.a(this.f8329d, c0671l.f8329d) && kotlin.jvm.internal.i.a(this.f8330e, c0671l.f8330e) && kotlin.jvm.internal.i.a(this.f8331f, c0671l.f8331f) && this.f8332g == c0671l.f8332g && this.h == c0671l.h && kotlin.jvm.internal.i.a(this.i, c0671l.i) && this.f8333j == c0671l.f8333j;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8333j) + ((this.i.hashCode() + B.a.e((Boolean.hashCode(this.f8332g) + B.a.f((this.f8330e.hashCode() + ((this.f8329d.hashCode() + ((this.f8328c.hashCode() + ((this.f8327b.hashCode() + (Boolean.hashCode(this.f8326a) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f8331f)) * 31, 31, this.h)) * 31);
    }

    public final String toString() {
        return "UsageUiState(isLoading=" + this.f8326a + ", entries=" + this.f8327b + ", hourlyUsage=" + this.f8328c + ", dateRange=" + this.f8329d + ", dateLimits=" + this.f8330e + ", dateLabel=" + this.f8331f + ", chartEmpty=" + this.f8332g + ", maxHourlyDurationMs=" + this.h + ", selectedPackages=" + this.i + ", totalUsageMs=" + this.f8333j + ")";
    }
}
