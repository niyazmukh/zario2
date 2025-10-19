package F0;

import android.view.ViewGroup;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F0\e.smali */
public final class e extends o {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1584a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1585b;

    public e(ViewGroup viewGroup) {
        this.f1585b = viewGroup;
    }

    @Override // F0.o, F0.m
    public final void a() {
        this.f1585b.suppressLayout(false);
        this.f1584a = true;
    }

    @Override // F0.m
    public final void b(n nVar) {
        if (!this.f1584a) {
            this.f1585b.suppressLayout(false);
        }
        nVar.v(this);
    }

    @Override // F0.o, F0.m
    public final void c() {
        this.f1585b.suppressLayout(false);
    }

    @Override // F0.o, F0.m
    public final void e() {
        this.f1585b.suppressLayout(true);
    }
}
