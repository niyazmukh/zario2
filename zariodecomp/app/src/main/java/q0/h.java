package Q0;

import J0.t;
import android.content.Context;
import android.net.ConnectivityManager;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Q0\h.smali */
public final class h extends f {

    /* renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f2720f;

    /* renamed from: g, reason: collision with root package name */
    public final A3.b f2721g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, V0.a taskExecutor) {
        super(context, taskExecutor);
        kotlin.jvm.internal.i.e(taskExecutor, "taskExecutor");
        Object systemService = this.f2715b.getSystemService("connectivity");
        kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f2720f = (ConnectivityManager) systemService;
        this.f2721g = new A3.b(this, 2);
    }

    @Override // Q0.f
    public final Object a() {
        return i.a(this.f2720f);
    }

    @Override // Q0.f
    public final void c() {
        try {
            t.d().a(i.f2722a, "Registering network callback");
            T0.j.a(this.f2720f, this.f2721g);
        } catch (IllegalArgumentException e5) {
            t.d().c(i.f2722a, "Received exception while registering network callback", e5);
        } catch (SecurityException e6) {
            t.d().c(i.f2722a, "Received exception while registering network callback", e6);
        }
    }

    @Override // Q0.f
    public final void d() {
        try {
            t.d().a(i.f2722a, "Unregistering network callback");
            T0.h.c(this.f2720f, this.f2721g);
        } catch (IllegalArgumentException e5) {
            t.d().c(i.f2722a, "Received exception while unregistering network callback", e5);
        } catch (SecurityException e6) {
            t.d().c(i.f2722a, "Received exception while unregistering network callback", e6);
        }
    }
}
