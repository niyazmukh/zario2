package M0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M0\f.smali */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f2451b;

    public /* synthetic */ f(g gVar, int i) {
        this.f2450a = i;
        this.f2451b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2450a;
        g gVar = this.f2451b;
        switch (i) {
            case 0:
                g.a(gVar);
                break;
            default:
                g.c(gVar);
                break;
        }
    }
}
