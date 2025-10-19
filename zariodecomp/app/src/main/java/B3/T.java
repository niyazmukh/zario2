package B3;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\T.smali */
public final class T implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f545a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f546b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W f547c;

    public /* synthetic */ T(W w4, int i, int i5) {
        this.f545a = i5;
        this.f547c = w4;
        this.f546b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f545a) {
            case 0:
                this.f547c.f583c.i(this.f546b);
                break;
            case 1:
                this.f547c.f583c.k(this.f546b);
                break;
            default:
                this.f547c.f583c.b(this.f546b);
                break;
        }
    }
}
