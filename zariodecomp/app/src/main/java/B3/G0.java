package B3;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\G0.smali */
public final class G0 {

    /* renamed from: k, reason: collision with root package name */
    public static final long f412k = TimeUnit.SECONDS.toNanos(10);

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f413a;

    /* renamed from: b, reason: collision with root package name */
    public final Q1 f414b;

    /* renamed from: c, reason: collision with root package name */
    public final h1.i f415c;

    /* renamed from: d, reason: collision with root package name */
    public int f416d;

    /* renamed from: e, reason: collision with root package name */
    public ScheduledFuture f417e;

    /* renamed from: f, reason: collision with root package name */
    public ScheduledFuture f418f;

    /* renamed from: g, reason: collision with root package name */
    public final H0 f419g;
    public final H0 h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final long f420j;

    static {
        TimeUnit.MILLISECONDS.toNanos(10L);
    }

    public G0(h1.i iVar, ScheduledExecutorService scheduledExecutorService, long j5, long j6) {
        Q1 q12 = new Q1(2);
        this.f416d = 1;
        this.f419g = new H0(new E0(this, 0));
        this.h = new H0(new E0(this, 1));
        this.f415c = iVar;
        S0.f.l(scheduledExecutorService, "scheduler");
        this.f413a = scheduledExecutorService;
        this.f414b = q12;
        this.i = j5;
        this.f420j = j6;
        q12.f521b = false;
        q12.b();
    }

    public final synchronized void a() {
        try {
            Q1 q12 = this.f414b;
            q12.f521b = false;
            q12.b();
            int i = this.f416d;
            if (i == 2) {
                this.f416d = 3;
            } else if (i == 4 || i == 5) {
                ScheduledFuture scheduledFuture = this.f417e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (this.f416d == 5) {
                    this.f416d = 1;
                } else {
                    this.f416d = 2;
                    S0.f.q("There should be no outstanding pingFuture", this.f418f == null);
                    this.f418f = this.f413a.schedule(this.h, this.i, TimeUnit.NANOSECONDS);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            int i = this.f416d;
            if (i == 1) {
                this.f416d = 2;
                if (this.f418f == null) {
                    ScheduledExecutorService scheduledExecutorService = this.f413a;
                    H0 h02 = this.h;
                    long j5 = this.i;
                    Q1 q12 = this.f414b;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    this.f418f = scheduledExecutorService.schedule(h02, j5 - q12.a(timeUnit), timeUnit);
                }
            } else if (i == 5) {
                this.f416d = 4;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
