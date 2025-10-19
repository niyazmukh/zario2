package androidx.lifecycle;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\B.smali */
public final class B extends C implements InterfaceC0239t {

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0241v f4570e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ D f4571f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(D d5, InterfaceC0241v interfaceC0241v, H h) {
        super(d5, h);
        this.f4571f = d5;
        this.f4570e = interfaceC0241v;
    }

    @Override // androidx.lifecycle.C
    public final void b() {
        this.f4570e.g().f(this);
    }

    @Override // androidx.lifecycle.C
    public final boolean c(InterfaceC0241v interfaceC0241v) {
        return this.f4570e == interfaceC0241v;
    }

    @Override // androidx.lifecycle.C
    public final boolean d() {
        return this.f4570e.g().f4672d.compareTo(EnumC0236o.f4661d) >= 0;
    }

    @Override // androidx.lifecycle.InterfaceC0239t
    public final void onStateChanged(InterfaceC0241v interfaceC0241v, n nVar) {
        InterfaceC0241v interfaceC0241v2 = this.f4570e;
        EnumC0236o enumC0236o = interfaceC0241v2.g().f4672d;
        if (enumC0236o == EnumC0236o.f4658a) {
            this.f4571f.i(this.f4572a);
            return;
        }
        EnumC0236o enumC0236o2 = null;
        while (enumC0236o2 != enumC0236o) {
            a(d());
            enumC0236o2 = enumC0236o;
            enumC0236o = interfaceC0241v2.g().f4672d;
        }
    }
}
