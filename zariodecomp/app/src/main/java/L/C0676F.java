package l;

import k.InterfaceC0639C;

/* renamed from: l.F, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\F.smali */
public final class C0676F extends AbstractViewOnTouchListenerC0709q0 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ M f8447n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ P f8448o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0676F(P p5, P p6, M m5) {
        super(p6);
        this.f8448o = p5;
        this.f8447n = m5;
    }

    @Override // l.AbstractViewOnTouchListenerC0709q0
    public final InterfaceC0639C b() {
        return this.f8447n;
    }

    @Override // l.AbstractViewOnTouchListenerC0709q0
    public final boolean c() {
        P p5 = this.f8448o;
        if (p5.getInternalPopup().b()) {
            return true;
        }
        p5.f8487f.e(H.b(p5), H.a(p5));
        return true;
    }
}
