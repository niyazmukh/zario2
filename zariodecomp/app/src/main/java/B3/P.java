package B3;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\P.smali */
public final class P implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f507a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K2.c f508b;

    public /* synthetic */ P(K2.c cVar, int i) {
        this.f507a = i;
        this.f508b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f507a) {
            case 0:
                this.f508b.v(true);
                break;
            case 1:
                this.f508b.v(false);
                break;
            default:
                Y0 y02 = (Y0) this.f508b.b;
                S0.f.q("Channel must have been shut down", y02.f627J.get());
                y02.f629L = true;
                y02.D(false);
                Y0.x(y02);
                Y0.y(y02);
                break;
        }
    }
}
