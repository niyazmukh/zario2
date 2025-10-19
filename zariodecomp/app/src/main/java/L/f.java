package L;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\L\f.smali */
public final class f extends e {

    /* renamed from: d, reason: collision with root package name */
    public final Object f2295d;

    public f() {
        super(12);
        this.f2295d = new Object();
    }

    @Override // L.e
    public final Object a() {
        Object objA;
        synchronized (this.f2295d) {
            objA = super.a();
        }
        return objA;
    }

    @Override // L.e
    public final boolean c(Object obj) {
        boolean zC;
        synchronized (this.f2295d) {
            zC = super.c(obj);
        }
        return zC;
    }
}
