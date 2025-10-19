package r2;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\r2.1\d.smali */
public final /* synthetic */ class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f9622b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f9623c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f9624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f9625e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f9626f;

    public /* synthetic */ d(f fVar, Runnable runnable, long j5, long j6, TimeUnit timeUnit, int i) {
        this.f9621a = i;
        this.f9622b = fVar;
        this.f9623c = runnable;
        this.f9624d = j5;
        this.f9625e = j6;
        this.f9626f = timeUnit;
    }

    @Override // r2.g
    public final ScheduledFuture a(g1.i iVar) {
        switch (this.f9621a) {
            case 0:
                f fVar = this.f9622b;
                fVar.getClass();
                return fVar.f9632b.scheduleAtFixedRate(new e(fVar, this.f9623c, iVar, 0), this.f9624d, this.f9625e, this.f9626f);
            default:
                f fVar2 = this.f9622b;
                fVar2.getClass();
                return fVar2.f9632b.scheduleWithFixedDelay(new e(fVar2, this.f9623c, iVar, 2), this.f9624d, this.f9625e, this.f9626f);
        }
    }
}
