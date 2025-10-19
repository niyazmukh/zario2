package T0;

import A2.RunnableC0012l;
import android.content.Context;
import android.os.Build;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T0\r.smali */
public final class r implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public static final String f3170k = J0.t.f("WorkForegroundRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final U0.k f3171a = new U0.k();

    /* renamed from: b, reason: collision with root package name */
    public final Context f3172b;

    /* renamed from: c, reason: collision with root package name */
    public final S0.q f3173c;

    /* renamed from: d, reason: collision with root package name */
    public final J0.s f3174d;

    /* renamed from: e, reason: collision with root package name */
    public final s f3175e;

    /* renamed from: f, reason: collision with root package name */
    public final V0.a f3176f;

    public r(Context context, S0.q qVar, J0.s sVar, s sVar2, V0.a aVar) {
        this.f3172b = context;
        this.f3173c = qVar;
        this.f3174d = sVar;
        this.f3175e = sVar2;
        this.f3176f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f3173c.f2909q || Build.VERSION.SDK_INT >= 31) {
            this.f3171a.j(null);
            return;
        }
        U0.k kVar = new U0.k();
        S0.i iVar = (S0.i) this.f3176f;
        ((V0.b) iVar.f2861d).execute(new RunnableC0012l(14, this, kVar));
        kVar.a(new A3.a(12, this, kVar), (V0.b) iVar.f2861d);
    }
}
