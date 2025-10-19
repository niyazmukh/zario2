package B3;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\T1.smali */
public final class T1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V1 f551b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q2 f552c;

    public /* synthetic */ T1(q2 q2Var, V1 v12, int i) {
        this.f550a = i;
        this.f552c = q2Var;
        this.f551b = v12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q2 q2Var = this.f552c;
        switch (this.f550a) {
            case 0:
                ((N0) q2Var.f953c).f473b.execute(new N(this, 9));
                break;
            default:
                N0 n02 = (N0) q2Var.f953c;
                z3.V v4 = N0.f465E;
                n02.r(this.f551b);
                break;
        }
    }
}
