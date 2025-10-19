package C2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C2\m.smali */
public final class m extends h {

    /* renamed from: d, reason: collision with root package name */
    public final B2.m f1100d;

    /* renamed from: e, reason: collision with root package name */
    public final f f1101e;

    public m(B2.h hVar, B2.m mVar, f fVar, n nVar) {
        this(hVar, mVar, fVar, nVar, new ArrayList());
    }

    @Override // C2.h
    public final f a(B2.l lVar, f fVar, l2.o oVar) {
        j(lVar);
        if (!this.f1085b.a(lVar)) {
            return fVar;
        }
        HashMap mapH = h(oVar, lVar);
        HashMap mapK = k();
        B2.m mVar = lVar.f326e;
        mVar.h(mapK);
        mVar.h(mapH);
        lVar.a(lVar.f324c, lVar.f326e);
        lVar.f327f = 1;
        lVar.f324c = B2.o.f333b;
        if (fVar == null) {
            return null;
        }
        HashSet hashSet = new HashSet(fVar.f1081a);
        hashSet.addAll(this.f1101e.f1081a);
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f1086c.iterator();
        while (it.hasNext()) {
            arrayList.add(((g) it.next()).f1082a);
        }
        hashSet.addAll(arrayList);
        return new f(hashSet);
    }

    @Override // C2.h
    public final void b(B2.l lVar, k kVar) {
        j(lVar);
        if (!this.f1085b.a(lVar)) {
            lVar.f324c = kVar.f1097a;
            lVar.f323b = 4;
            lVar.f326e = new B2.m();
            lVar.f327f = 2;
            return;
        }
        HashMap mapI = i(lVar, kVar.f1098b);
        B2.m mVar = lVar.f326e;
        mVar.h(k());
        mVar.h(mapI);
        lVar.a(kVar.f1097a, lVar.f326e);
        lVar.f327f = 2;
    }

    @Override // C2.h
    public final f d() {
        return this.f1101e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return e(mVar) && this.f1100d.equals(mVar.f1100d) && this.f1086c.equals(mVar.f1086c);
    }

    public final int hashCode() {
        return this.f1100d.hashCode() + (f() * 31);
    }

    public final HashMap k() {
        HashMap map = new HashMap();
        Iterator it = this.f1101e.f1081a.iterator();
        while (it.hasNext()) {
            B2.k kVar = (B2.k) it.next();
            if (!kVar.h()) {
                map.put(kVar, this.f1100d.f(kVar));
            }
        }
        return map;
    }

    public final String toString() {
        return "PatchMutation{" + g() + ", mask=" + this.f1101e + ", value=" + this.f1100d + "}";
    }

    public m(B2.h hVar, B2.m mVar, f fVar, n nVar, List list) {
        super(hVar, nVar, list);
        this.f1100d = mVar;
        this.f1101e = fVar;
    }
}
