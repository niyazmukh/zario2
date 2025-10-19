package T0;

import java.util.HashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T0\w.smali */
public final class w {

    /* renamed from: e, reason: collision with root package name */
    public static final String f3185e = J0.t.f("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final g1.i f3186a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3187b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3188c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Object f3189d = new Object();

    public w(g1.i iVar) {
        this.f3186a = iVar;
    }

    public final void a(S0.j jVar) {
        synchronized (this.f3189d) {
            try {
                if (((v) this.f3187b.remove(jVar)) != null) {
                    J0.t.d().a(f3185e, "Stopping timer for " + jVar);
                    this.f3188c.remove(jVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
