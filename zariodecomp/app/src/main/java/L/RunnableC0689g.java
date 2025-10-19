package l;

import android.view.View;
import k.l;

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\g.1.smali */
public final class RunnableC0689g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C0685e f8587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0693i f8588b;

    public RunnableC0689g(C0693i c0693i, C0685e c0685e) {
        this.f8588b = c0693i;
        this.f8587a = c0685e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k.j jVar;
        C0693i c0693i = this.f8588b;
        l lVar = c0693i.f8596c;
        if (lVar != null && (jVar = lVar.f8222e) != null) {
            jVar.o(lVar);
        }
        View view = (View) c0693i.f8601l;
        if (view != null && view.getWindowToken() != null) {
            C0685e c0685e = this.f8587a;
            if (c0685e.b()) {
                c0693i.f8612w = c0685e;
            } else if (c0685e.f8287e != null) {
                c0685e.d(0, 0, false, false);
                c0693i.f8612w = c0685e;
            }
        }
        c0693i.f8614y = null;
    }
}
