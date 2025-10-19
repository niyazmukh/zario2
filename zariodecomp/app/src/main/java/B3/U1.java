package B3;

import A2.C0009i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\U1.smali */
public final class U1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f568a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q2 f569b;

    public /* synthetic */ U1(q2 q2Var, int i) {
        this.f568a = i;
        this.f569b = q2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f568a) {
            case 0:
                N0 n02 = (N0) this.f569b.f953c;
                n02.f495z = true;
                InterfaceC0097z interfaceC0097z = n02.f490u;
                C0009i c0009i = n02.f488s;
                interfaceC0097z.p((z3.k0) c0009i.f204b, (EnumC0094y) c0009i.f205c, (z3.a0) c0009i.f206d);
                break;
            default:
                N0 n03 = (N0) this.f569b.f953c;
                if (!n03.f495z) {
                    n03.f490u.b();
                    break;
                }
                break;
        }
    }
}
