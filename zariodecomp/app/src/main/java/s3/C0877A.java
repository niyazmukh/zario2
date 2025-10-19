package s3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: s3.A, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s3.1\A.smali */
public final class C0877A {

    /* renamed from: a, reason: collision with root package name */
    public final List f9692a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9693b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9694c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9695d;

    public C0877A(List perDayUsageMs) {
        kotlin.jvm.internal.i.e(perDayUsageMs, "perDayUsageMs");
        this.f9692a = perDayUsageMs;
        ArrayList arrayList = new ArrayList();
        Iterator it = perDayUsageMs.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Number) next).longValue() > 0) {
                arrayList.add(next);
            }
        }
        this.f9693b = arrayList.size();
        Long l4 = (Long) L3.j.e0(this.f9692a);
        this.f9694c = l4 != null ? l4.longValue() : 0L;
        this.f9695d = arrayList.isEmpty() ? 0L : L3.j.p0(arrayList) / arrayList.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0877A) && kotlin.jvm.internal.i.a(this.f9692a, ((C0877A) obj).f9692a);
    }

    public final int hashCode() {
        return this.f9692a.hashCode();
    }

    public final String toString() {
        return "UsageGlobalSummary(perDayUsageMs=" + this.f9692a + ")";
    }
}
