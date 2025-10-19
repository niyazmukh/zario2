package k3;

import java.time.LocalDate;

/* renamed from: k3.h, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k3.1\h.smali */
public final class C0667h {

    /* renamed from: a, reason: collision with root package name */
    public final LocalDate f8316a;

    /* renamed from: b, reason: collision with root package name */
    public final LocalDate f8317b;

    public C0667h(LocalDate start, LocalDate end) {
        kotlin.jvm.internal.i.e(start, "start");
        kotlin.jvm.internal.i.e(end, "end");
        this.f8316a = start;
        this.f8317b = end;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0667h)) {
            return false;
        }
        C0667h c0667h = (C0667h) obj;
        return kotlin.jvm.internal.i.a(this.f8316a, c0667h.f8316a) && kotlin.jvm.internal.i.a(this.f8317b, c0667h.f8317b);
    }

    public final int hashCode() {
        return this.f8317b.hashCode() + (this.f8316a.hashCode() * 31);
    }

    public final String toString() {
        return "DateRange(start=" + this.f8316a + ", end=" + this.f8317b + ")";
    }
}
