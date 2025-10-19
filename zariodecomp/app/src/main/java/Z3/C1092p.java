package z3;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: z3.p, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\p.1.smali */
public final class C1092p implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final C1084h f11377d = new C1084h(3);

    /* renamed from: e, reason: collision with root package name */
    public static final long f11378e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f11379f;

    /* renamed from: k, reason: collision with root package name */
    public static final long f11380k;

    /* renamed from: a, reason: collision with root package name */
    public final C1084h f11381a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11382b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f11383c;

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f11378e = nanos;
        f11379f = -nanos;
        f11380k = TimeUnit.SECONDS.toNanos(1L);
    }

    public C1092p(long j5) {
        C1084h c1084h = f11377d;
        long jNanoTime = System.nanoTime();
        this.f11381a = c1084h;
        long jMin = Math.min(f11378e, Math.max(f11379f, j5));
        this.f11382b = jNanoTime + jMin;
        this.f11383c = jMin <= 0;
    }

    public final void a(C1092p c1092p) {
        C1084h c1084h = c1092p.f11381a;
        C1084h c1084h2 = this.f11381a;
        if (c1084h2 == c1084h) {
            return;
        }
        throw new AssertionError("Tickers (" + c1084h2 + " and " + c1092p.f11381a + ") don't match. Custom Ticker should only be used in tests!");
    }

    public final boolean b() {
        if (!this.f11383c) {
            long j5 = this.f11382b;
            this.f11381a.getClass();
            if (j5 - System.nanoTime() > 0) {
                return false;
            }
            this.f11383c = true;
        }
        return true;
    }

    public final long c(TimeUnit timeUnit) {
        this.f11381a.getClass();
        long jNanoTime = System.nanoTime();
        if (!this.f11383c && this.f11382b - jNanoTime <= 0) {
            this.f11383c = true;
        }
        return timeUnit.convert(this.f11382b - jNanoTime, TimeUnit.NANOSECONDS);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1092p c1092p = (C1092p) obj;
        a(c1092p);
        long j5 = this.f11382b - c1092p.f11382b;
        if (j5 < 0) {
            return -1;
        }
        return j5 > 0 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1092p)) {
            return false;
        }
        C1092p c1092p = (C1092p) obj;
        C1084h c1084h = this.f11381a;
        if (c1084h != null ? c1084h == c1092p.f11381a : c1092p.f11381a == null) {
            return this.f11382b == c1092p.f11382b;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.asList(this.f11381a, Long.valueOf(this.f11382b)).hashCode();
    }

    public final String toString() {
        long jC = c(TimeUnit.NANOSECONDS);
        long jAbs = Math.abs(jC);
        long j5 = f11380k;
        long j6 = jAbs / j5;
        long jAbs2 = Math.abs(jC) % j5;
        StringBuilder sb = new StringBuilder();
        if (jC < 0) {
            sb.append('-');
        }
        sb.append(j6);
        if (jAbs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb.append("s from now");
        C1084h c1084h = f11377d;
        C1084h c1084h2 = this.f11381a;
        if (c1084h2 != c1084h) {
            sb.append(" (ticker=" + c1084h2 + ")");
        }
        return sb.toString();
    }
}
