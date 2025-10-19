package C3;

import B3.C0046h;
import B3.k2;
import B3.l2;
import B3.o2;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C3\f.smali */
public final class f implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final K2.c f1134a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f1135b;

    /* renamed from: c, reason: collision with root package name */
    public final K2.c f1136c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f1137d;

    /* renamed from: e, reason: collision with root package name */
    public final o2 f1138e;

    /* renamed from: f, reason: collision with root package name */
    public final SSLSocketFactory f1139f;

    /* renamed from: k, reason: collision with root package name */
    public final D3.c f1140k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1141l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f1142m;

    /* renamed from: n, reason: collision with root package name */
    public final C0046h f1143n;

    /* renamed from: o, reason: collision with root package name */
    public final long f1144o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1145p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1146q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1147r;

    public f(K2.c cVar, K2.c cVar2, SSLSocketFactory sSLSocketFactory, D3.c cVar3, int i, boolean z4, long j5, long j6, int i5, int i6, o2 o2Var) {
        this.f1134a = cVar;
        this.f1135b = (Executor) l2.a((k2) cVar.b);
        this.f1136c = cVar2;
        this.f1137d = (ScheduledExecutorService) l2.a((k2) cVar2.b);
        this.f1139f = sSLSocketFactory;
        this.f1140k = cVar3;
        this.f1141l = i;
        this.f1142m = z4;
        this.f1143n = new C0046h(j5);
        this.f1144o = j6;
        this.f1145p = i5;
        this.f1146q = i6;
        S0.f.l(o2Var, "transportTracerFactory");
        this.f1138e = o2Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1147r) {
            return;
        }
        this.f1147r = true;
        l2.b((k2) this.f1134a.b, this.f1135b);
        l2.b((k2) this.f1136c.b, this.f1137d);
    }
}
