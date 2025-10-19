package A2;

/* renamed from: A2.j, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\j.1.smali */
public final /* synthetic */ class RunnableC0010j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f208b;

    public /* synthetic */ RunnableC0010j(r rVar, int i) {
        this.f207a = i;
        this.f208b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f207a) {
            case 0:
                this.f208b.f234b.start();
                break;
            default:
                this.f208b.f235c.start();
                break;
        }
    }
}
