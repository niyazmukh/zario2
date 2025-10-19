package B2;

import java.util.Iterator;
import s2.AbstractC0869c;
import s2.C0870e;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B2\j.smali */
public final class j implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0869c f318a;

    /* renamed from: b, reason: collision with root package name */
    public final C0870e f319b;

    public j(AbstractC0869c abstractC0869c, C0870e c0870e) {
        this.f318a = abstractC0869c;
        this.f319b = c0870e;
    }

    public final boolean equals(Object obj) {
        s2.d dVar;
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f318a.size() != jVar.f318a.size()) {
            return false;
        }
        Iterator it = this.f319b.iterator();
        Iterator it2 = jVar.f319b.iterator();
        do {
            dVar = (s2.d) it;
            if (!((Iterator) dVar.f9680b).hasNext()) {
                return true;
            }
        } while (((l) dVar.next()).equals((l) ((s2.d) it2).next()));
        return false;
    }

    public final j f(h hVar) {
        AbstractC0869c abstractC0869c = this.f318a;
        l lVar = (l) abstractC0869c.g(hVar);
        return lVar == null ? this : new j(abstractC0869c.m(hVar), this.f319b.h(lVar));
    }

    public final int hashCode() {
        Iterator it = this.f319b.iterator();
        int iHashCode = 0;
        while (true) {
            s2.d dVar = (s2.d) it;
            if (!((Iterator) dVar.f9680b).hasNext()) {
                return iHashCode;
            }
            l lVar = (l) dVar.next();
            iHashCode = lVar.f326e.hashCode() + ((lVar.f322a.f315a.hashCode() + (iHashCode * 31)) * 31);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f319b.iterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = this.f319b.iterator();
        boolean z4 = true;
        while (true) {
            s2.d dVar = (s2.d) it;
            if (!((Iterator) dVar.f9680b).hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            l lVar = (l) dVar.next();
            if (z4) {
                z4 = false;
            } else {
                sb.append(", ");
            }
            sb.append(lVar);
        }
    }
}
