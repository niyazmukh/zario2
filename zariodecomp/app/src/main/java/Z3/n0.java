package z3;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\n0.smali */
public final class n0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o0 f11368a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B3.J f11369b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f11370c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p0 f11371d;

    public n0(p0 p0Var, o0 o0Var, B3.J j5, long j6) {
        this.f11371d = p0Var;
        this.f11368a = o0Var;
        this.f11369b = j5;
        this.f11370c = j6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11371d.execute(this.f11368a);
    }

    public final String toString() {
        return this.f11369b.toString() + "(scheduled in SynchronizationContext with delay of " + this.f11370c + ")";
    }
}
