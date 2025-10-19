package B3;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\Y.smali */
public final class Y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f609a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f610b;

    public Y(I i, boolean z4) {
        this.f610b = i;
        this.f609a = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4 = this.f609a;
        I i = this.f610b;
        if (z4) {
            C0027a0 c0027a0 = (C0027a0) i.f433b;
            c0027a0.f722l = true;
            if (c0027a0.i > 0) {
                Q1 q12 = c0027a0.f721k;
                q12.f521b = false;
                q12.b();
            }
        }
        ((C0027a0) i.f433b).f727q = false;
    }
}
