package A3;

import E2.s;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.util.Log;
import com.google.android.gms.common.api.internal.F;
import z3.AbstractC1081e;
import z3.C1079c;
import z3.EnumC1087k;
import z3.P;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A3\d.smali */
public final class d extends P {

    /* renamed from: d, reason: collision with root package name */
    public final P f272d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f273e;

    /* renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f274f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f275g = new Object();
    public Runnable h;

    public d(P p5, Context context) {
        this.f272d = p5;
        this.f273e = context;
        if (context == null) {
            this.f274f = null;
            return;
        }
        this.f274f = (ConnectivityManager) context.getSystemService("connectivity");
        try {
            w();
        } catch (SecurityException e5) {
            Log.w("AndroidChannelBuilder", "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?", e5);
        }
    }

    @Override // z3.AbstractC1080d
    public final AbstractC1081e n(F f2, C1079c c1079c) {
        return this.f272d.n(f2, c1079c);
    }

    @Override // z3.P
    public final void s() {
        this.f272d.s();
    }

    @Override // z3.P
    public final EnumC1087k t() {
        return this.f272d.t();
    }

    @Override // z3.P
    public final void u(EnumC1087k enumC1087k, s sVar) {
        this.f272d.u(enumC1087k, sVar);
    }

    @Override // z3.P
    public final P v() {
        synchronized (this.f275g) {
            try {
                Runnable runnable = this.h;
                if (runnable != null) {
                    runnable.run();
                    this.h = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f272d.v();
    }

    public final void w() {
        ConnectivityManager connectivityManager = this.f274f;
        if (connectivityManager != null) {
            int i = 0;
            b bVar = new b(this, i);
            connectivityManager.registerDefaultNetworkCallback(bVar);
            this.h = new a(i, this, bVar);
            return;
        }
        c cVar = new c(this, 0);
        this.f273e.registerReceiver(cVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.h = new a(1, this, cVar);
    }
}
