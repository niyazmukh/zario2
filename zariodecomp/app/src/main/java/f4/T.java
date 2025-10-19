package f4;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\T.smali */
public final class T extends V {

    /* renamed from: c, reason: collision with root package name */
    public final C0516n f7032c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ X f7033d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(X x3, long j5, C0516n c0516n) {
        super(j5);
        this.f7033d = x3;
        this.f7032c = c0516n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7032c.B(this.f7033d);
    }

    @Override // f4.V
    public final String toString() {
        return super.toString() + this.f7032c;
    }
}
