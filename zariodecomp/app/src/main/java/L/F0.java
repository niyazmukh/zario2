package l;

import android.content.Context;
import k.l;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\F0.smali */
public final class F0 extends C0725z0 implements A0 {

    /* renamed from: E, reason: collision with root package name */
    public K2.c f8449E;

    @Override // l.A0
    public final void c(l lVar, k.n nVar) {
        K2.c cVar = this.f8449E;
        if (cVar != null) {
            cVar.c(lVar, nVar);
        }
    }

    @Override // l.A0
    public final void n(l lVar, k.n nVar) {
        K2.c cVar = this.f8449E;
        if (cVar != null) {
            cVar.n(lVar, nVar);
        }
    }

    @Override // l.C0725z0
    public final C0703n0 q(Context context, boolean z4) {
        E0 e02 = new E0(context, z4);
        e02.setHoverListener(this);
        return e02;
    }
}
