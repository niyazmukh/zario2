package B2;

import A2.C0002b;
import a.AbstractC0183a;
import java.util.Collections;
import java.util.List;
import s2.C0870e;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B2\h.smali */
public final class h implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final C0002b f313b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0870e f314c;

    /* renamed from: a, reason: collision with root package name */
    public final n f315a;

    static {
        C0002b c0002b = new C0002b(5);
        f313b = c0002b;
        f314c = new C0870e(Collections.emptyList(), c0002b);
    }

    public h(n nVar) {
        AbstractC0183a.N(e(nVar), "Not a document key path: %s", nVar);
        this.f315a = nVar;
    }

    public static h b() {
        List listEmptyList = Collections.emptyList();
        n nVar = n.f332b;
        return new h(listEmptyList.isEmpty() ? n.f332b : new n(listEmptyList));
    }

    public static h c(String str) {
        n nVarL = n.l(str);
        boolean z4 = false;
        if (nVarL.f309a.size() > 4 && nVarL.g(0).equals("projects") && nVarL.g(2).equals("databases") && nVarL.g(4).equals("documents")) {
            z4 = true;
        }
        AbstractC0183a.N(z4, "Tried to parse an invalid key: %s", nVarL);
        return new h((n) nVarL.j());
    }

    public static boolean e(n nVar) {
        return nVar.f309a.size() % 2 == 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(h hVar) {
        return this.f315a.compareTo(hVar.f315a);
    }

    public final n d() {
        return (n) this.f315a.k();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        return this.f315a.equals(((h) obj).f315a);
    }

    public final int hashCode() {
        return this.f315a.hashCode();
    }

    public final String toString() {
        return this.f315a.c();
    }
}
