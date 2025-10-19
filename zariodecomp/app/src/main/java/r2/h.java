package r2;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import r.C0855b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\r2.1\h.smali */
public final class h extends r.h implements ScheduledFuture {

    /* renamed from: l, reason: collision with root package name */
    public final ScheduledFuture f9633l;

    public h(g gVar) {
        this.f9633l = gVar.a(new g1.i(this, 24));
    }

    @Override // r.h
    public final void c() {
        ScheduledFuture scheduledFuture = this.f9633l;
        Object obj = this.f9561a;
        scheduledFuture.cancel((obj instanceof C0855b) && ((C0855b) obj).f9545a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f9633l.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f9633l.getDelay(timeUnit);
    }
}
