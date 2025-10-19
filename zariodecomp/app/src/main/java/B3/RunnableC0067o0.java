package B3;

/* renamed from: B3.o0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\o0.1.smali */
public final class RunnableC0067o0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f926a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F0 f927b;

    public RunnableC0067o0(F0 f02, long j5) {
        this.f927b = f02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f926a) {
            case 0:
                this.f927b.getClass();
                break;
            default:
                ((C3.m) this.f927b.f407a.f7641b).d(z3.k0.f11355n.g("Keepalive failed. The connection is likely gone"));
                break;
        }
    }

    public RunnableC0067o0(F0 f02, z3.l0 l0Var) {
        this.f927b = f02;
    }
}
