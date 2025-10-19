package B2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B2\l.smali */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final h f322a;

    /* renamed from: b, reason: collision with root package name */
    public int f323b;

    /* renamed from: c, reason: collision with root package name */
    public o f324c;

    /* renamed from: d, reason: collision with root package name */
    public o f325d;

    /* renamed from: e, reason: collision with root package name */
    public m f326e;

    /* renamed from: f, reason: collision with root package name */
    public int f327f;

    public l(h hVar) {
        this.f322a = hVar;
        this.f325d = o.f333b;
    }

    public static l g(h hVar) {
        o oVar = o.f333b;
        return new l(hVar, 1, oVar, oVar, new m(), 3);
    }

    public static l h(h hVar, o oVar) {
        l lVar = new l(hVar);
        lVar.b(oVar);
        return lVar;
    }

    public final void a(o oVar, m mVar) {
        this.f324c = oVar;
        this.f323b = 2;
        this.f326e = mVar;
        this.f327f = 3;
    }

    public final void b(o oVar) {
        this.f324c = oVar;
        this.f323b = 3;
        this.f326e = new m();
        this.f327f = 3;
    }

    public final boolean c() {
        return t.h.a(this.f327f, 1);
    }

    public final boolean d() {
        return t.h.a(this.f323b, 2);
    }

    public final boolean e() {
        return !t.h.a(this.f323b, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f322a.equals(lVar.f322a) && this.f324c.equals(lVar.f324c) && t.h.a(this.f323b, lVar.f323b) && t.h.a(this.f327f, lVar.f327f)) {
            return this.f326e.equals(lVar.f326e);
        }
        return false;
    }

    public final l f() {
        return new l(this.f322a, this.f323b, this.f324c, this.f325d, new m(this.f326e.b()), this.f327f);
    }

    public final int hashCode() {
        return this.f322a.f315a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Document{key=");
        sb.append(this.f322a);
        sb.append(", version=");
        sb.append(this.f324c);
        sb.append(", readTime=");
        sb.append(this.f325d);
        sb.append(", type=");
        int i = this.f323b;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "UNKNOWN_DOCUMENT" : "NO_DOCUMENT" : "FOUND_DOCUMENT" : "INVALID");
        sb.append(", documentState=");
        int i5 = this.f327f;
        sb.append(i5 != 1 ? i5 != 2 ? i5 != 3 ? "null" : "SYNCED" : "HAS_COMMITTED_MUTATIONS" : "HAS_LOCAL_MUTATIONS");
        sb.append(", value=");
        sb.append(this.f326e);
        sb.append('}');
        return sb.toString();
    }

    public l(h hVar, int i, o oVar, o oVar2, m mVar, int i5) {
        this.f322a = hVar;
        this.f324c = oVar;
        this.f325d = oVar2;
        this.f323b = i;
        this.f327f = i5;
        this.f326e = mVar;
    }
}
