package T0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T0\v.smali */
public final class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final w f3183a;

    /* renamed from: b, reason: collision with root package name */
    public final S0.j f3184b;

    public v(w wVar, S0.j jVar) {
        this.f3183a = wVar;
        this.f3184b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f3183a.f3189d) {
            try {
                if (((v) this.f3183a.f3187b.remove(this.f3184b)) != null) {
                    u uVar = (u) this.f3183a.f3188c.remove(this.f3184b);
                    if (uVar != null) {
                        S0.j jVar = this.f3184b;
                        M0.g gVar = (M0.g) uVar;
                        J0.t.d().a(M0.g.f2452s, "Exceeded time limits on execution for " + jVar);
                        gVar.f2460l.execute(new M0.f(gVar, 0));
                    }
                } else {
                    J0.t.d().a("WrkTimerRunnable", "Timer with " + this.f3184b + " is already marked as complete.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
