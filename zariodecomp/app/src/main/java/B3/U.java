package B3;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\U.smali */
public final class U implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f553a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W f554b;

    public /* synthetic */ U(W w4, int i) {
        this.f553a = i;
        this.f554b = w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f553a) {
            case 0:
                this.f554b.f583c.l();
                break;
            case 1:
                this.f554b.o();
                break;
            case 2:
                this.f554b.f583c.flush();
                break;
            default:
                this.f554b.f583c.m();
                break;
        }
    }
}
