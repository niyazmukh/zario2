package z3;

import A2.C0020u;
import B3.A1;
import B3.C0069p;
import B3.P0;
import B3.W0;
import B3.b2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\c0.smali */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f11292a;

    /* renamed from: b, reason: collision with root package name */
    public final A1 f11293b;

    /* renamed from: c, reason: collision with root package name */
    public final p0 f11294c;

    /* renamed from: d, reason: collision with root package name */
    public final b2 f11295d;

    /* renamed from: e, reason: collision with root package name */
    public final W0 f11296e;

    /* renamed from: f, reason: collision with root package name */
    public final C0069p f11297f;

    /* renamed from: g, reason: collision with root package name */
    public final P0 f11298g;

    public c0(Integer num, A1 a12, p0 p0Var, b2 b2Var, W0 w02, C0069p c0069p, P0 p02) {
        S0.f.l(num, "defaultPort not set");
        this.f11292a = num.intValue();
        S0.f.l(a12, "proxyDetector not set");
        this.f11293b = a12;
        this.f11294c = p0Var;
        this.f11295d = b2Var;
        this.f11296e = w02;
        this.f11297f = c0069p;
        this.f11298g = p02;
    }

    public final String toString() {
        C0020u c0020uX = r1.d.X(this);
        c0020uX.d("defaultPort", String.valueOf(this.f11292a));
        c0020uX.a(this.f11293b, "proxyDetector");
        c0020uX.a(this.f11294c, "syncContext");
        c0020uX.a(this.f11295d, "serviceConfigParser");
        c0020uX.a(this.f11296e, "scheduledExecutorService");
        c0020uX.a(this.f11297f, "channelLogger");
        c0020uX.a(this.f11298g, "executor");
        c0020uX.a(null, "overrideAuthority");
        return c0020uX.toString();
    }
}
