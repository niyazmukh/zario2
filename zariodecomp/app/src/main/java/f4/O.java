package f4;

import java.util.concurrent.ScheduledFuture;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\O.smali */
public final class O implements P {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f7028a;

    public O(ScheduledFuture scheduledFuture) {
        this.f7028a = scheduledFuture;
    }

    @Override // f4.P
    public final void a() {
        this.f7028a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f7028a + ']';
    }
}
