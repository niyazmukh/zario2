package p2;

import android.os.HandlerThread;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.internal.p002firebaseauthapi.zze;
import k1.C0657a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\p2.1\h.smali */
public final class h {

    /* renamed from: f, reason: collision with root package name */
    public static final C0657a f9348f = new C0657a("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a, reason: collision with root package name */
    public volatile long f9349a;

    /* renamed from: b, reason: collision with root package name */
    public volatile long f9350b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9351c;

    /* renamed from: d, reason: collision with root package name */
    public final zze f9352d;

    /* renamed from: e, reason: collision with root package name */
    public final A3.a f9353e;

    public h(l2.f fVar) {
        f9348f.e("Initializing TokenRefresher", new Object[0]);
        C.f(fVar);
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        handlerThread.start();
        this.f9352d = new zze(handlerThread.getLooper());
        fVar.a();
        this.f9353e = new A3.a(this, fVar.f8772b);
        this.f9351c = 300000L;
    }

    public final void a() {
        f9348f.e("Scheduling refresh for " + (this.f9349a - this.f9351c), new Object[0]);
        this.f9352d.removeCallbacks(this.f9353e);
        this.f9350b = Math.max((this.f9349a - System.currentTimeMillis()) - this.f9351c, 0L) / 1000;
        this.f9352d.postDelayed(this.f9353e, this.f9350b * 1000);
    }
}
