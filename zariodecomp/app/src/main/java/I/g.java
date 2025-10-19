package I;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\I\g.smali */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1913a;

    /* renamed from: b, reason: collision with root package name */
    public f f1914b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1915c;

    public final void a(f fVar) {
        synchronized (this) {
            while (this.f1915c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f1914b == fVar) {
                return;
            }
            this.f1914b = fVar;
            if (this.f1913a) {
                fVar.d();
            }
        }
    }
}
