package C2;

import java.util.HashMap;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C2\p.smali */
public final class p extends h {

    /* renamed from: d, reason: collision with root package name */
    public final B2.m f1106d;

    public p(B2.h hVar, B2.m mVar, n nVar, List list) {
        super(hVar, nVar, list);
        this.f1106d = mVar;
    }

    @Override // C2.h
    public final f a(B2.l lVar, f fVar, l2.o oVar) {
        j(lVar);
        if (!this.f1085b.a(lVar)) {
            return fVar;
        }
        HashMap mapH = h(oVar, lVar);
        B2.m mVar = new B2.m(this.f1106d.b());
        mVar.h(mapH);
        lVar.a(lVar.f324c, mVar);
        lVar.f327f = 1;
        lVar.f324c = B2.o.f333b;
        return null;
    }

    @Override // C2.h
    public final void b(B2.l lVar, k kVar) {
        j(lVar);
        B2.m mVar = new B2.m(this.f1106d.b());
        mVar.h(i(lVar, kVar.f1098b));
        lVar.a(kVar.f1097a, mVar);
        lVar.f327f = 2;
    }

    @Override // C2.h
    public final f d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return e(pVar) && this.f1106d.equals(pVar.f1106d) && this.f1086c.equals(pVar.f1086c);
    }

    public final int hashCode() {
        return this.f1106d.hashCode() + (f() * 31);
    }

    public final String toString() {
        return "SetMutation{" + g() + ", value=" + this.f1106d + "}";
    }
}
