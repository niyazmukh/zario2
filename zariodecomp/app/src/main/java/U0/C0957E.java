package u0;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: u0.E, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u0.1\E.smali */
public final class C0957E extends androidx.lifecycle.D {

    /* renamed from: l, reason: collision with root package name */
    public final x f10373l;

    /* renamed from: m, reason: collision with root package name */
    public final S0.e f10374m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f10375n;

    /* renamed from: o, reason: collision with root package name */
    public final S0.r f10376o;

    /* renamed from: p, reason: collision with root package name */
    public final C0962c f10377p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f10378q;

    /* renamed from: r, reason: collision with root package name */
    public final AtomicBoolean f10379r;

    /* renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f10380s;

    /* renamed from: t, reason: collision with root package name */
    public final RunnableC0956D f10381t;

    /* renamed from: u, reason: collision with root package name */
    public final RunnableC0956D f10382u;

    public C0957E(x xVar, S0.e container, S0.r rVar, String[] strArr) {
        kotlin.jvm.internal.i.e(container, "container");
        this.f10373l = xVar;
        this.f10374m = container;
        this.f10375n = true;
        this.f10376o = rVar;
        this.f10377p = new C0962c(strArr, this, 1);
        this.f10378q = new AtomicBoolean(true);
        this.f10379r = new AtomicBoolean(false);
        this.f10380s = new AtomicBoolean(false);
        this.f10381t = new RunnableC0956D(this, 0);
        this.f10382u = new RunnableC0956D(this, 1);
    }

    @Override // androidx.lifecycle.D
    public final void f() {
        Executor executor;
        S0.e eVar = this.f10374m;
        eVar.getClass();
        ((Set) eVar.f2852b).add(this);
        boolean z4 = this.f10375n;
        x xVar = this.f10373l;
        if (z4) {
            executor = xVar.f10461c;
            if (executor == null) {
                kotlin.jvm.internal.i.i("internalTransactionExecutor");
                throw null;
            }
        } else {
            executor = xVar.f10460b;
            if (executor == null) {
                kotlin.jvm.internal.i.i("internalQueryExecutor");
                throw null;
            }
        }
        executor.execute(this.f10381t);
    }

    @Override // androidx.lifecycle.D
    public final void g() {
        S0.e eVar = this.f10374m;
        eVar.getClass();
        ((Set) eVar.f2852b).remove(this);
    }
}
