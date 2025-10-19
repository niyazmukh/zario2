package f4;

import k4.r;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\E0.smali */
public final class E0 extends r implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final long f7016e;

    public E0(long j5, Q3.c cVar) {
        super(cVar, cVar.getContext());
        this.f7016e = j5;
    }

    @Override // f4.t0
    public final String F() {
        return super.F() + "(timeMillis=" + this.f7016e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        E.l(this.f7045c);
        l(new D0("Timed out waiting for " + this.f7016e + " ms", this));
    }
}
