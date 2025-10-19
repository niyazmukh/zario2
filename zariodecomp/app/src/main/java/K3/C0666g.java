package k3;

import java.util.List;
import java.util.Map;

/* renamed from: k3.g, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k3.1\g.smali */
public final class C0666g {

    /* renamed from: a, reason: collision with root package name */
    public final List f8314a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f8315b;

    public C0666g(List list, Map map) {
        this.f8314a = list;
        this.f8315b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0666g)) {
            return false;
        }
        C0666g c0666g = (C0666g) obj;
        return kotlin.jvm.internal.i.a(this.f8314a, c0666g.f8314a) && kotlin.jvm.internal.i.a(this.f8315b, c0666g.f8315b);
    }

    public final int hashCode() {
        return this.f8315b.hashCode() + (this.f8314a.hashCode() * 31);
    }

    public final String toString() {
        return "UsageAggregation(hourlyBars=" + this.f8314a + ", packageTotals=" + this.f8315b + ")";
    }
}
