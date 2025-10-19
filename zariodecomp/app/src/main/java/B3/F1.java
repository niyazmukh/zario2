package B3;

import java.util.concurrent.TimeUnit;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\F1.smali */
public final class F1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f408a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G1 f409b;

    public /* synthetic */ F1(G1 g12, int i) {
        this.f408a = i;
        this.f409b = g12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f408a) {
            case 0:
                G1 g12 = this.f409b;
                if (!g12.f426f) {
                    g12.f427g = null;
                    break;
                } else {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    long jA = g12.f425e - g12.f424d.a(timeUnit);
                    if (jA <= 0) {
                        g12.f426f = false;
                        g12.f427g = null;
                        g12.f423c.run();
                        break;
                    } else {
                        g12.f427g = g12.f421a.schedule(new F1(g12, 1), jA, timeUnit);
                        break;
                    }
                }
            default:
                G1 g13 = this.f409b;
                g13.f422b.execute(new F1(g13, 0));
                break;
        }
    }
}
