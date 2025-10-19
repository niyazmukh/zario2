package F0;

import android.view.View;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F0\h.smali */
public final class h extends o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1599a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1600b;

    public /* synthetic */ h() {
        this.f1599a = 2;
    }

    @Override // F0.m
    public final void b(n nVar) {
        switch (this.f1599a) {
            case 0:
                c cVar = t.f1646a;
                ((View) this.f1600b).setTransitionAlpha(1.0f);
                nVar.v(this);
                break;
            case 1:
                ((n) this.f1600b).x();
                nVar.v(this);
                break;
            default:
                a aVar = (a) this.f1600b;
                int i = aVar.f1579C - 1;
                aVar.f1579C = i;
                if (i == 0) {
                    aVar.f1580D = false;
                    aVar.m();
                }
                nVar.v(this);
                break;
        }
    }

    @Override // F0.o, F0.m
    public void d(n nVar) {
        switch (this.f1599a) {
            case 2:
                a aVar = (a) this.f1600b;
                if (!aVar.f1580D) {
                    aVar.E();
                    aVar.f1580D = true;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ h(Object obj, int i) {
        this.f1599a = i;
        this.f1600b = obj;
    }
}
