package B2;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B2\a.smali */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final c f295e = new c(0, b.f300d);

    /* renamed from: a, reason: collision with root package name */
    public final int f296a;

    /* renamed from: b, reason: collision with root package name */
    public final String f297b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f298c;

    /* renamed from: d, reason: collision with root package name */
    public final c f299d;

    public a(int i, String str, ArrayList arrayList, c cVar) {
        this.f296a = i;
        if (str == null) {
            throw new NullPointerException("Null collectionGroup");
        }
        this.f297b = str;
        this.f298c = arrayList;
        if (cVar == null) {
            throw new NullPointerException("Null indexState");
        }
        this.f299d = cVar;
    }

    public final d a() {
        Iterator it = this.f298c.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (t.h.a(dVar.f308b, 3)) {
                return dVar;
            }
        }
        return null;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f298c.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (!t.h.a(dVar.f308b, 3)) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f296a == aVar.f296a && this.f297b.equals(aVar.f297b) && this.f298c.equals(aVar.f298c) && this.f299d.equals(aVar.f299d);
    }

    public final int hashCode() {
        return this.f299d.hashCode() ^ ((((((this.f296a ^ 1000003) * 1000003) ^ this.f297b.hashCode()) * 1000003) ^ this.f298c.hashCode()) * 1000003);
    }

    public final String toString() {
        return "FieldIndex{indexId=" + this.f296a + ", collectionGroup=" + this.f297b + ", segments=" + this.f298c + ", indexState=" + this.f299d + "}";
    }
}
