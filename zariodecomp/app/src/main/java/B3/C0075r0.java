package B3;

import z3.InterfaceC1074C;

/* renamed from: B3.r0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\r0.1.smali */
public final class C0075r0 extends AbstractC0073q0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f957c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1074C f958d;

    public /* synthetic */ C0075r0(InterfaceC1074C interfaceC1074C, int i) {
        this.f957c = i;
        this.f958d = interfaceC1074C;
    }

    @Override // B3.AbstractC0073q0
    public final void a() {
        switch (this.f957c) {
            case 0:
                A0 a02 = (A0) this.f958d;
                ((X0) a02.f352d.f953c).f602j.f645c0.c(a02, true);
                break;
            case 1:
                ((Y0) this.f958d).A();
                break;
            default:
                ((C3.m) this.f958d).h.l(true);
                break;
        }
    }

    @Override // B3.AbstractC0073q0
    public final void b() {
        switch (this.f957c) {
            case 0:
                A0 a02 = (A0) this.f958d;
                ((X0) a02.f352d.f953c).f602j.f645c0.c(a02, false);
                break;
            case 1:
                Y0 y02 = (Y0) this.f958d;
                if (!y02.f627J.get()) {
                    y02.C();
                    break;
                }
                break;
            default:
                ((C3.m) this.f958d).h.l(false);
                break;
        }
    }
}
