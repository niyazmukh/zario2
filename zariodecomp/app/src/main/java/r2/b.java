package r2;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\r2.1\b.smali */
public final /* synthetic */ class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9613a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f9614b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f9615c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f9616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9617e;

    public /* synthetic */ b(f fVar, Object obj, long j5, TimeUnit timeUnit, int i) {
        this.f9613a = i;
        this.f9614b = fVar;
        this.f9617e = obj;
        this.f9615c = j5;
        this.f9616d = timeUnit;
    }

    @Override // r2.g
    public final ScheduledFuture a(g1.i iVar) {
        switch (this.f9613a) {
            case 0:
                f fVar = this.f9614b;
                fVar.getClass();
                return fVar.f9632b.schedule(new e(fVar, (Runnable) this.f9617e, iVar, 1), this.f9615c, this.f9616d);
            default:
                f fVar2 = this.f9614b;
                fVar2.getClass();
                return fVar2.f9632b.schedule(new K0.e(fVar2, (Callable) this.f9617e, iVar, 1), this.f9615c, this.f9616d);
        }
    }
}
