package B3;

import z3.EnumC1087k;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\K0.smali */
public final class K0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f449a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y0 f450b;

    public /* synthetic */ K0(Y0 y02, int i) {
        this.f449a = i;
        this.f450b = y02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f449a) {
            case 0:
                this.f450b.z(true);
                break;
            case 1:
                Y0 y02 = this.f450b;
                if (!y02.f627J.get() && y02.f619A != null) {
                    y02.z(false);
                    Y0.w(y02);
                    break;
                }
                break;
            case 2:
                this.f450b.A();
                if (this.f450b.f620B != null) {
                    this.f450b.f620B.getClass();
                }
                Q0 q02 = this.f450b.f619A;
                if (q02 != null) {
                    ((z3.M) q02.f518d.f2873b).e();
                    break;
                }
                break;
            case 3:
                Y0 y03 = this.f450b;
                y03.f635R.l(2, "Entering SHUTDOWN state");
                y03.f664u.b(EnumC1087k.f11345e);
                break;
            case 4:
                Y0 y04 = this.f450b;
                if (!y04.f628K) {
                    y04.f628K = true;
                    Y0.x(y04);
                    break;
                }
                break;
            default:
                Y0 y05 = this.f450b;
                if (y05.f619A != null) {
                    Y0.w(y05);
                    break;
                }
                break;
        }
    }
}
