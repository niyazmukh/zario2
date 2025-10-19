package C2;

import N2.n0;
import a.AbstractC0183a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C2\h.smali */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public final B2.h f1084a;

    /* renamed from: b, reason: collision with root package name */
    public final n f1085b;

    /* renamed from: c, reason: collision with root package name */
    public final List f1086c;

    public h(B2.h hVar, n nVar) {
        this(hVar, nVar, new ArrayList());
    }

    public static h c(B2.l lVar, f fVar) {
        if (!lVar.c()) {
            return null;
        }
        if (fVar != null && fVar.f1081a.isEmpty()) {
            return null;
        }
        B2.h hVar = lVar.f322a;
        if (fVar == null) {
            return t.h.a(lVar.f323b, 3) ? new e(hVar, n.f1102c) : new p(hVar, lVar.f326e, n.f1102c, new ArrayList());
        }
        B2.m mVar = lVar.f326e;
        B2.m mVar2 = new B2.m();
        HashSet hashSet = new HashSet();
        Iterator it = fVar.f1081a.iterator();
        while (it.hasNext()) {
            B2.k kVar = (B2.k) it.next();
            if (!hashSet.contains(kVar)) {
                if (mVar.f(kVar) == null && kVar.f309a.size() > 1) {
                    kVar = (B2.k) kVar.k();
                }
                mVar2.g(kVar, mVar.f(kVar));
                hashSet.add(kVar);
            }
        }
        return new m(hVar, mVar2, new f(hashSet), n.f1102c);
    }

    public abstract f a(B2.l lVar, f fVar, l2.o oVar);

    public abstract void b(B2.l lVar, k kVar);

    public abstract f d();

    public final boolean e(h hVar) {
        return this.f1084a.equals(hVar.f1084a) && this.f1085b.equals(hVar.f1085b);
    }

    public final int f() {
        return this.f1085b.hashCode() + (this.f1084a.f315a.hashCode() * 31);
    }

    public final String g() {
        return "key=" + this.f1084a + ", precondition=" + this.f1085b;
    }

    public final HashMap h(l2.o oVar, B2.l lVar) {
        List<g> list = this.f1086c;
        HashMap map = new HashMap(list.size());
        for (g gVar : list) {
            q qVar = gVar.f1083b;
            B2.m mVar = lVar.f326e;
            B2.k kVar = gVar.f1082a;
            map.put(kVar, qVar.b(mVar.f(kVar), oVar));
        }
        return map;
    }

    public final HashMap i(B2.l lVar, ArrayList arrayList) {
        List list = this.f1086c;
        HashMap map = new HashMap(list.size());
        AbstractC0183a.N(list.size() == arrayList.size(), "server transform count (%d) should match field transform count (%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(list.size()));
        for (int i = 0; i < arrayList.size(); i++) {
            g gVar = (g) list.get(i);
            q qVar = gVar.f1083b;
            B2.m mVar = lVar.f326e;
            B2.k kVar = gVar.f1082a;
            map.put(kVar, qVar.a(mVar.f(kVar), (n0) arrayList.get(i)));
        }
        return map;
    }

    public final void j(B2.l lVar) {
        AbstractC0183a.N(lVar.f322a.equals(this.f1084a), "Can only apply a mutation to a document with the same key", new Object[0]);
    }

    public h(B2.h hVar, n nVar, List list) {
        this.f1084a = hVar;
        this.f1085b = nVar;
        this.f1086c = list;
    }
}
