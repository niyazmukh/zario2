package X2;

import java.util.ArrayList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\X2\d.smali */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Y2.d f3821a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3822b;

    public d(Y2.d dVar, ArrayList hourly) {
        kotlin.jvm.internal.i.e(hourly, "hourly");
        this.f3821a = dVar;
        this.f3822b = hourly;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f3821a.equals(dVar.f3821a) && kotlin.jvm.internal.i.a(this.f3822b, dVar.f3822b);
    }

    public final int hashCode() {
        return this.f3822b.hashCode() + (this.f3821a.hashCode() * 31);
    }

    public final String toString() {
        return "PendingCycleWithHourly(cycle=" + this.f3821a + ", hourly=" + this.f3822b + ")";
    }
}
