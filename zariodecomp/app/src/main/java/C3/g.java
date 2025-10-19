package C3;

import B3.AbstractC0056k0;
import B3.G0;
import B3.Z0;
import B3.o2;
import B3.q2;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocketFactory;
import z3.AbstractC1095t;
import z3.Q;
import z3.r0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C3\g.smali */
public final class g extends AbstractC1095t {

    /* renamed from: m, reason: collision with root package name */
    public static final D3.c f1148m;

    /* renamed from: n, reason: collision with root package name */
    public static final long f1149n;

    /* renamed from: o, reason: collision with root package name */
    public static final K2.c f1150o;

    /* renamed from: a, reason: collision with root package name */
    public final Z0 f1151a;

    /* renamed from: e, reason: collision with root package name */
    public SSLSocketFactory f1155e;

    /* renamed from: b, reason: collision with root package name */
    public final o2 f1152b = q2.f950d;

    /* renamed from: c, reason: collision with root package name */
    public final K2.c f1153c = f1150o;

    /* renamed from: d, reason: collision with root package name */
    public final K2.c f1154d = new K2.c(AbstractC0056k0.f872q, 5);

    /* renamed from: f, reason: collision with root package name */
    public final D3.c f1156f = f1148m;

    /* renamed from: g, reason: collision with root package name */
    public int f1157g = 1;
    public long h = Long.MAX_VALUE;
    public final long i = AbstractC0056k0.f867l;

    /* renamed from: j, reason: collision with root package name */
    public final int f1158j = 65535;

    /* renamed from: k, reason: collision with root package name */
    public final int f1159k = 4194304;

    /* renamed from: l, reason: collision with root package name */
    public final int f1160l = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    static {
        Logger.getLogger(g.class.getName());
        D3.b bVar = new D3.b(D3.c.f1344e);
        bVar.a(D3.a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, D3.a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, D3.a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, D3.a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, D3.a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, D3.a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        bVar.b(D3.m.TLS_1_2);
        if (!bVar.f1340a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        bVar.f1341b = true;
        f1148m = new D3.c(bVar);
        f1149n = TimeUnit.DAYS.toNanos(1000L);
        f1150o = new K2.c(new X1.e(), 5);
        EnumSet.of(r0.f11395a, r0.f11396b);
    }

    public g(String str) {
        this.f1151a = new Z0(str, new h1.i(this, 3), new g1.i(this, 5));
    }

    @Override // z3.Q
    public final void b(TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(30L);
        this.h = nanos;
        long jMax = Math.max(nanos, G0.f412k);
        this.h = jMax;
        if (jMax >= f1149n) {
            this.h = Long.MAX_VALUE;
        }
    }

    @Override // z3.Q
    public final void c() {
        this.f1157g = 2;
    }

    @Override // z3.AbstractC1095t
    public final Q d() {
        return this.f1151a;
    }
}
