package l;

import androidx.appcompat.widget.Toolbar;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\Y0.smali */
public final /* synthetic */ class Y0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8547a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f8548b;

    public /* synthetic */ Y0(Toolbar toolbar, int i) {
        this.f8547a = i;
        this.f8548b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8547a) {
            case 0:
                a1 a1Var = this.f8548b.f4281P;
                k.n nVar = a1Var == null ? null : a1Var.f8551b;
                if (nVar != null) {
                    nVar.collapseActionView();
                    break;
                }
                break;
            default:
                this.f8548b.o();
                break;
        }
    }
}
