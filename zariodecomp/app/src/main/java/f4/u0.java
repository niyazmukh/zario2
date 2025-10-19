package f4;

import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\u0.smali */
public final class u0 extends A0 {

    /* renamed from: d, reason: collision with root package name */
    public final O3.d f7100d;

    /* JADX WARN: Multi-variable type inference failed */
    public u0(O3.i iVar, X3.p pVar) {
        super(iVar, false);
        this.f7100d = ((Q3.a) pVar).create(this, this);
    }

    @Override // f4.t0
    public final void J() {
        try {
            k4.a.j(p1.b.x(this.f7100d), K3.k.f2288a);
        } catch (Throwable th) {
            resumeWith(AbstractC0183a.v(th));
            throw th;
        }
    }
}
