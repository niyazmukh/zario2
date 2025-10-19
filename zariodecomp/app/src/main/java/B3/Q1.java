package B3;

import g2.AbstractC0582e;
import g2.AbstractC0583f;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\Q1.smali */
public final class Q1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f520a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f521b;

    /* renamed from: c, reason: collision with root package name */
    public long f522c;

    public long a(TimeUnit timeUnit) {
        return timeUnit.convert(this.f521b ? System.nanoTime() - this.f522c : 0L, TimeUnit.NANOSECONDS);
    }

    public void b() {
        S0.f.q("This stopwatch is already running.", !this.f521b);
        this.f521b = true;
        this.f522c = System.nanoTime();
    }

    public String toString() {
        String str;
        switch (this.f520a) {
            case 2:
                long jNanoTime = this.f521b ? System.nanoTime() - this.f522c : 0L;
                TimeUnit timeUnit = TimeUnit.DAYS;
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.HOURS;
                    if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MINUTES;
                        if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.SECONDS;
                            if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                                timeUnit = TimeUnit.MILLISECONDS;
                                if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                                    timeUnit = TimeUnit.MICROSECONDS;
                                    if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                                        timeUnit = timeUnit2;
                                    }
                                }
                            }
                        }
                    }
                }
                double dConvert = jNanoTime / timeUnit2.convert(1L, timeUnit);
                StringBuilder sb = new StringBuilder();
                int i = AbstractC0582e.f7602a;
                sb.append(String.format(Locale.ROOT, "%.4g", Double.valueOf(dConvert)));
                sb.append(" ");
                switch (AbstractC0583f.f7603a[timeUnit.ordinal()]) {
                    case 1:
                        str = "ns";
                        break;
                    case 2:
                        str = "μs";
                        break;
                    case 3:
                        str = "ms";
                        break;
                    case 4:
                        str = "s";
                        break;
                    case 5:
                        str = "min";
                        break;
                    case 6:
                        str = "h";
                        break;
                    case 7:
                        str = "d";
                        break;
                    default:
                        throw new AssertionError();
                }
                sb.append(str);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public Q1(long j5, boolean z4) {
        this.f520a = 0;
        this.f521b = z4;
        this.f522c = j5;
    }
}
