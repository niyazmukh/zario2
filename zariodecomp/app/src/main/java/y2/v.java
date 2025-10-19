package y2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\y2.1\v.smali */
public final class v {
    public static final u h;
    public static final u i;

    /* renamed from: a, reason: collision with root package name */
    public final List f11144a;

    /* renamed from: b, reason: collision with root package name */
    public List f11145b;

    /* renamed from: c, reason: collision with root package name */
    public C1048A f11146c;

    /* renamed from: d, reason: collision with root package name */
    public final List f11147d;

    /* renamed from: e, reason: collision with root package name */
    public final B2.n f11148e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11149f;

    /* renamed from: g, reason: collision with root package name */
    public final C1054c f11150g;

    static {
        B2.k kVar = B2.k.f320b;
        h = new u(1, kVar);
        i = new u(2, kVar);
    }

    public v(B2.n nVar, List list, List list2, long j5, C1054c c1054c) {
        this.f11148e = nVar;
        this.f11144a = list2;
        this.f11147d = list;
        this.f11149f = j5;
        this.f11150g = c1054c;
    }

    public static v a(B2.n nVar) {
        return new v(nVar, Collections.emptyList(), Collections.emptyList(), -1L, null);
    }

    public final TreeSet b() {
        TreeSet treeSet = new TreeSet();
        Iterator it = this.f11147d.iterator();
        while (it.hasNext()) {
            for (j jVar : ((k) it.next()).c()) {
                if (jVar.f()) {
                    treeSet.add(jVar.f11112c);
                }
            }
        }
        return treeSet;
    }

    public final synchronized List c() {
        int i5;
        try {
            if (this.f11145b == null) {
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                for (u uVar : this.f11144a) {
                    arrayList.add(uVar);
                    hashSet.add(uVar.f11143b.c());
                }
                if (this.f11144a.size() > 0) {
                    List list = this.f11144a;
                    i5 = ((u) list.get(list.size() - 1)).f11142a;
                } else {
                    i5 = 1;
                }
                Iterator it = b().iterator();
                while (it.hasNext()) {
                    B2.k kVar = (B2.k) it.next();
                    if (!hashSet.contains(kVar.c()) && !kVar.equals(B2.k.f320b)) {
                        arrayList.add(new u(i5, kVar));
                    }
                }
                if (!hashSet.contains(B2.k.f320b.c())) {
                    arrayList.add(t.h.a(i5, 1) ? h : i);
                }
                this.f11145b = Collections.unmodifiableList(arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f11145b;
    }

    public final v d(long j5) {
        return new v(this.f11148e, this.f11147d, this.f11144a, j5, this.f11150g);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x010d  */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(B2.l r14) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.v.e(B2.l):boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        return g().equals(((v) obj).g());
    }

    public final boolean f() {
        if (!this.f11147d.isEmpty() || this.f11149f != -1 || this.f11150g != null) {
            return false;
        }
        List list = this.f11144a;
        return list.isEmpty() || (list.size() == 1 && ((u) list.get(0)).f11143b.equals(B2.k.f320b));
    }

    public final synchronized C1048A g() {
        if (this.f11146c == null) {
            List listC = c();
            synchronized (this) {
                this.f11146c = new C1048A(this.f11148e, null, this.f11147d, listC, this.f11149f, this.f11150g, null);
            }
        }
        return this.f11146c;
    }

    public final int hashCode() {
        return t.h.c(1) + (g().hashCode() * 31);
    }

    public final String toString() {
        return "Query(target=" + g().toString() + ";limitType=LIMIT_TO_FIRST)";
    }
}
