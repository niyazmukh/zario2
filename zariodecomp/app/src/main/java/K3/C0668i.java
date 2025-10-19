package k3;

import java.time.LocalDate;

/* renamed from: k3.i, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k3.1\i.smali */
public final class C0668i {

    /* renamed from: a, reason: collision with root package name */
    public final LocalDate f8318a;

    /* renamed from: b, reason: collision with root package name */
    public final LocalDate f8319b;

    public C0668i(LocalDate localDate, LocalDate localDate2) {
        this.f8318a = localDate;
        this.f8319b = localDate2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0668i)) {
            return false;
        }
        C0668i c0668i = (C0668i) obj;
        return kotlin.jvm.internal.i.a(this.f8318a, c0668i.f8318a) && kotlin.jvm.internal.i.a(this.f8319b, c0668i.f8319b);
    }

    public final int hashCode() {
        return this.f8319b.hashCode() + (this.f8318a.hashCode() * 31);
    }

    public final String toString() {
        return "DateRangeLimits(min=" + this.f8318a + ", max=" + this.f8319b + ")";
    }
}
