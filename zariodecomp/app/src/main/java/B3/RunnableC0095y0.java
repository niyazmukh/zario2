package B3;

import z3.EnumC1087k;

/* renamed from: B3.y0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\y0.1.smali */
public final class RunnableC0095y0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1027a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A2.G f1028b;

    public /* synthetic */ RunnableC0095y0(A2.G g3, int i) {
        this.f1027a = i;
        this.f1028b = g3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1027a) {
            case 0:
                A2.G g3 = this.f1028b;
                A0 a02 = (A0) g3.f88c;
                a02.f360n = null;
                if (a02.f370x == null) {
                    C0089w0 c0089w0 = a02.f367u;
                    C0089w0 c0089w02 = (C0089w0) g3.f87b;
                    if (c0089w0 == c0089w02) {
                        a02.f368v = c0089w02;
                        A0 a03 = (A0) this.f1028b.f88c;
                        a03.f367u = null;
                        A0.g(a03, EnumC1087k.f11342b);
                        break;
                    }
                } else {
                    S0.f.q("Unexpected non-null activeTransport", a02.f368v == null);
                    A2.G g5 = this.f1028b;
                    ((C0089w0) g5.f87b).b(((A0) g5.f88c).f370x);
                    break;
                }
                break;
            default:
                A2.G g6 = this.f1028b;
                ((A0) g6.f88c).f365s.remove((C0089w0) g6.f87b);
                if (((A0) this.f1028b.f88c).f369w.f11361a == EnumC1087k.f11345e && ((A0) this.f1028b.f88c).f365s.isEmpty()) {
                    A0 a04 = (A0) this.f1028b.f88c;
                    a04.getClass();
                    a04.f357k.execute(new s0(a04, 2));
                    break;
                }
                break;
        }
    }
}
