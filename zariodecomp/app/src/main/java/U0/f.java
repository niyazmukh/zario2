package U0;

import k2.InterfaceFutureC0659b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\U0\f.smali */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final k f3281a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceFutureC0659b f3282b;

    public f(k kVar, InterfaceFutureC0659b interfaceFutureC0659b) {
        this.f3281a = kVar;
        this.f3282b = interfaceFutureC0659b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3281a.f3290a != this) {
            return;
        }
        if (i.f3288f.o(this.f3281a, this, i.f(this.f3282b))) {
            i.c(this.f3281a);
        }
    }
}
