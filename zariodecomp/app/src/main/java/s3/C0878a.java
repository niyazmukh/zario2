package s3;

import java.time.Clock;
import java.time.Duration;
import java.time.ZoneId;
import java.util.Set;

/* renamed from: s3.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s3.1\a.1.smali */
public final class C0878a {

    /* renamed from: a, reason: collision with root package name */
    public final Duration f9741a;

    /* renamed from: b, reason: collision with root package name */
    public final Duration f9742b;

    /* renamed from: c, reason: collision with root package name */
    public final Duration f9743c;

    /* renamed from: d, reason: collision with root package name */
    public final Duration f9744d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f9745e;

    /* renamed from: f, reason: collision with root package name */
    public final Set f9746f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f9747g;
    public final ZoneId h;
    public final Clock i;

    public C0878a(Set suppressedTaskRootPackages, Set suppressedTaskRootClassNames) {
        Duration mergeGap = Duration.ofMinutes(1L);
        Duration taskContinuityGap = Duration.ofSeconds(30L);
        Duration sliceDuration = Duration.ofHours(12L);
        Duration maxLookback = Duration.ofDays(8L);
        ZoneId zoneId = ZoneId.systemDefault();
        Clock clock = Clock.systemDefaultZone();
        kotlin.jvm.internal.i.e(mergeGap, "mergeGap");
        kotlin.jvm.internal.i.e(taskContinuityGap, "taskContinuityGap");
        kotlin.jvm.internal.i.e(sliceDuration, "sliceDuration");
        kotlin.jvm.internal.i.e(maxLookback, "maxLookback");
        kotlin.jvm.internal.i.e(suppressedTaskRootPackages, "suppressedTaskRootPackages");
        kotlin.jvm.internal.i.e(suppressedTaskRootClassNames, "suppressedTaskRootClassNames");
        kotlin.jvm.internal.i.e(zoneId, "zoneId");
        kotlin.jvm.internal.i.e(clock, "clock");
        this.f9741a = mergeGap;
        this.f9742b = taskContinuityGap;
        this.f9743c = sliceDuration;
        this.f9744d = maxLookback;
        this.f9745e = suppressedTaskRootPackages;
        this.f9746f = suppressedTaskRootClassNames;
        this.f9747g = true;
        this.h = zoneId;
        this.i = clock;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0878a)) {
            return false;
        }
        C0878a c0878a = (C0878a) obj;
        return kotlin.jvm.internal.i.a(this.f9741a, c0878a.f9741a) && kotlin.jvm.internal.i.a(this.f9742b, c0878a.f9742b) && kotlin.jvm.internal.i.a(this.f9743c, c0878a.f9743c) && kotlin.jvm.internal.i.a(this.f9744d, c0878a.f9744d) && kotlin.jvm.internal.i.a(this.f9745e, c0878a.f9745e) && kotlin.jvm.internal.i.a(this.f9746f, c0878a.f9746f) && this.f9747g == c0878a.f9747g && kotlin.jvm.internal.i.a(this.h, c0878a.h) && kotlin.jvm.internal.i.a(this.i, c0878a.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((Boolean.hashCode(this.f9747g) + ((this.f9746f.hashCode() + ((this.f9745e.hashCode() + ((this.f9744d.hashCode() + ((this.f9743c.hashCode() + ((this.f9742b.hashCode() + (this.f9741a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "UsageAggregationConfig(mergeGap=" + this.f9741a + ", taskContinuityGap=" + this.f9742b + ", sliceDuration=" + this.f9743c + ", maxLookback=" + this.f9744d + ", suppressedTaskRootPackages=" + this.f9745e + ", suppressedTaskRootClassNames=" + this.f9746f + ", enableFilteredEventQuery=" + this.f9747g + ", zoneId=" + this.h + ", clock=" + this.i + ")";
    }
}
