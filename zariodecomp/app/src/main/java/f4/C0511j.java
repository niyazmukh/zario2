package f4;

import java.util.concurrent.ScheduledFuture;

/* renamed from: f4.j, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\j.1.smali */
public final class C0511j implements InterfaceC0513k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7068a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7069b;

    public /* synthetic */ C0511j(Object obj, int i) {
        this.f7068a = i;
        this.f7069b = obj;
    }

    @Override // f4.InterfaceC0513k
    public final void a(Throwable th) {
        switch (this.f7068a) {
            case 0:
                ((ScheduledFuture) this.f7069b).cancel(false);
                break;
            case 1:
                ((X3.l) this.f7069b).invoke(th);
                break;
            default:
                ((P) this.f7069b).a();
                break;
        }
    }

    public final String toString() {
        switch (this.f7068a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f7069b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((X3.l) this.f7069b).getClass().getSimpleName() + '@' + E.m(this) + ']';
            default:
                return "DisposeOnCancel[" + ((P) this.f7069b) + ']';
        }
    }
}
