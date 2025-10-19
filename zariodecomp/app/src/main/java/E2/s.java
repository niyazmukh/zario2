package E2;

import A3.d;
import com.google.android.gms.tasks.Tasks;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E2\s.smali */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1490a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f1491b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f1492c;

    public /* synthetic */ s(t tVar, d dVar, int i) {
        this.f1490a = i;
        this.f1491b = tVar;
        this.f1492c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1490a) {
            case 0:
                this.f1491b.a(this.f1492c);
                break;
            case 1:
                t tVar = this.f1491b;
                tVar.getClass();
                p1.b.p(1, "GrpcCallProvider", "connectivityAttemptTimer elapsed. Resetting the channel.", new Object[0]);
                if (tVar.f1496d != null) {
                    p1.b.p(1, "GrpcCallProvider", "Clearing the connectivityAttemptTimer", new Object[0]);
                    tVar.f1496d.w();
                    tVar.f1496d = null;
                }
                tVar.f1494b.b(new s(tVar, this.f1492c, 4));
                break;
            case 2:
                t tVar2 = this.f1491b;
                tVar2.getClass();
                tVar2.f1494b.b(new s(tVar2, this.f1492c, 3));
                break;
            case 3:
                this.f1491b.a(this.f1492c);
                break;
            default:
                t tVar3 = this.f1491b;
                tVar3.getClass();
                this.f1492c.v();
                tVar3.f1493a = Tasks.call(F2.o.f1726c, new r(tVar3, 0));
                break;
        }
    }
}
