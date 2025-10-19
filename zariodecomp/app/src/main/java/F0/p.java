package F0;

import java.util.ArrayList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F0\p.smali */
public final class p extends o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q.b f1636a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f1637b;

    public p(q qVar, q.b bVar) {
        this.f1637b = qVar;
        this.f1636a = bVar;
    }

    @Override // F0.m
    public final void b(n nVar) {
        ((ArrayList) this.f1636a.getOrDefault(this.f1637b.f1639b, null)).remove(nVar);
        nVar.v(this);
    }
}
