package E2;

import a.AbstractC0183a;

/* renamed from: E2.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E2\a.1.smali */
public final /* synthetic */ class RunnableC0100a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1424a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0101c f1425b;

    public /* synthetic */ RunnableC0100a(AbstractC0101c abstractC0101c, int i) {
        this.f1424a = i;
        this.f1425b = abstractC0101c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1424a) {
            case 0:
                AbstractC0101c abstractC0101c = this.f1425b;
                x xVar = abstractC0101c.h;
                AbstractC0183a.N(xVar == x.f1513f, "State should still be backoff but was %s", xVar);
                abstractC0101c.h = x.f1508a;
                abstractC0101c.g();
                AbstractC0183a.N(abstractC0101c.d(), "Stream should have started", new Object[0]);
                break;
            default:
                AbstractC0101c abstractC0101c2 = this.f1425b;
                if (abstractC0101c2.c()) {
                    abstractC0101c2.h = x.f1511d;
                    break;
                }
                break;
        }
    }
}
