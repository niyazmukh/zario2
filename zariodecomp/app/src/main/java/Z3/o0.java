package z3;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\o0.smali */
public final class o0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f11374a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11375b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11376c;

    public o0(Runnable runnable) {
        this.f11374a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f11375b) {
            return;
        }
        this.f11376c = true;
        this.f11374a.run();
    }
}
