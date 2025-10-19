package p2;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.C;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C0341c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\p2.1\q.smali */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public volatile int f9363a;

    /* renamed from: b, reason: collision with root package name */
    public final h f9364b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f9365c;

    public q(l2.f fVar) {
        fVar.a();
        Context context = fVar.f8771a;
        h hVar = new h(fVar);
        this.f9365c = false;
        this.f9363a = 0;
        this.f9364b = hVar;
        ComponentCallbacks2C0341c.b((Application) context.getApplicationContext());
        ComponentCallbacks2C0341c.f5618e.a(new C(this));
    }
}
