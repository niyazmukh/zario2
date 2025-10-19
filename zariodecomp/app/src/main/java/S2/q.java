package S2;

import O3.d;
import i4.InterfaceC0612g;
import i4.InterfaceC0613h;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S2\q.smali */
public final class q implements InterfaceC0612g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3068a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i4.x f3069b;

    public /* synthetic */ q(i4.x xVar, int i) {
        this.f3068a = i;
        this.f3069b = xVar;
    }

    @Override // i4.InterfaceC0612g
    public final Object c(InterfaceC0613h interfaceC0613h, d dVar) throws Throwable {
        switch (this.f3068a) {
            case 0:
                this.f3069b.c(new p(interfaceC0613h, 0), dVar);
                break;
            default:
                this.f3069b.c(new p(interfaceC0613h, 1), dVar);
                break;
        }
        return P3.a.f2678a;
    }
}
