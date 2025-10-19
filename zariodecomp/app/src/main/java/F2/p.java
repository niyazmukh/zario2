package F2;

import A2.C0009i;
import A2.RunnableC0012l;
import java.util.Date;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F2\p.smali */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final f f1727a;

    /* renamed from: b, reason: collision with root package name */
    public final e f1728b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1729c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1730d;

    /* renamed from: e, reason: collision with root package name */
    public long f1731e;
    public C0009i h;

    /* renamed from: g, reason: collision with root package name */
    public long f1733g = new Date().getTime();

    /* renamed from: f, reason: collision with root package name */
    public long f1732f = 0;

    public p(f fVar, e eVar, long j5, long j6) {
        this.f1727a = fVar;
        this.f1728b = eVar;
        this.f1729c = j5;
        this.f1730d = j6;
        this.f1731e = j6;
    }

    public final void a(Runnable runnable) {
        C0009i c0009i = this.h;
        if (c0009i != null) {
            c0009i.w();
            this.h = null;
        }
        long jRandom = this.f1732f + ((long) ((Math.random() - 0.5d) * this.f1732f));
        long jMax = Math.max(0L, new Date().getTime() - this.f1733g);
        long jMax2 = Math.max(0L, jRandom - jMax);
        if (this.f1732f > 0) {
            p1.b.p(1, p.class.getSimpleName(), "Backing off for %d ms (base delay: %d ms, delay with jitter: %d ms, last attempt: %d ms ago)", Long.valueOf(jMax2), Long.valueOf(this.f1732f), Long.valueOf(jRandom), Long.valueOf(jMax));
        }
        this.h = this.f1727a.a(this.f1728b, jMax2, new RunnableC0012l(8, this, runnable));
        long j5 = (long) (this.f1732f * 1.5d);
        this.f1732f = j5;
        long j6 = this.f1729c;
        if (j5 < j6) {
            this.f1732f = j6;
        } else {
            long j7 = this.f1731e;
            if (j5 > j7) {
                this.f1732f = j7;
            }
        }
        this.f1731e = this.f1730d;
    }
}
