package f4;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\U.smali */
public final class U extends V {

    /* renamed from: c, reason: collision with root package name */
    public final E0 f7034c;

    public U(long j5, E0 e02) {
        super(j5);
        this.f7034c = e02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7034c.run();
    }

    @Override // f4.V
    public final String toString() {
        return super.toString() + this.f7034c;
    }
}
