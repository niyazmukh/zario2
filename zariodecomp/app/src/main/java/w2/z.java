package w2;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.protobuf.C0421r0;
import java.util.ArrayList;
import java.util.Iterator;
import y2.C1051D;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w2\z.smali */
public final class z implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final x f10973a;

    /* renamed from: b, reason: collision with root package name */
    public final C1051D f10974b;

    /* renamed from: c, reason: collision with root package name */
    public final FirebaseFirestore f10975c;

    /* renamed from: d, reason: collision with root package name */
    public final C f10976d;

    public z(x xVar, C1051D c1051d, FirebaseFirestore firebaseFirestore) {
        xVar.getClass();
        this.f10973a = xVar;
        c1051d.getClass();
        this.f10974b = c1051d;
        firebaseFirestore.getClass();
        this.f10975c = firebaseFirestore;
        this.f10976d = new C(!c1051d.f11075f.f9681a.isEmpty(), c1051d.f11074e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f10975c.equals(zVar.f10975c) && this.f10973a.equals(zVar.f10973a) && this.f10974b.equals(zVar.f10974b) && this.f10976d.equals(zVar.f10976d);
    }

    public final ArrayList f() {
        C1051D c1051d = this.f10974b;
        ArrayList arrayList = new ArrayList(c1051d.f11071b.f318a.size());
        Iterator it = c1051d.f11071b.f319b.iterator();
        while (true) {
            s2.d dVar = (s2.d) it;
            if (!((Iterator) dVar.f9680b).hasNext()) {
                return arrayList;
            }
            B2.l lVar = (B2.l) dVar.next();
            arrayList.add(new y(this.f10975c, lVar.f322a, lVar, c1051d.f11074e, c1051d.f11075f.f9681a.f(lVar.f322a)));
        }
    }

    public final int hashCode() {
        return this.f10976d.hashCode() + ((this.f10974b.hashCode() + ((this.f10973a.hashCode() + (this.f10975c.hashCode() * 31)) * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0421r0(this, (s2.d) this.f10974b.f11071b.f319b.iterator());
    }
}
