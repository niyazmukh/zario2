package w2;

import N2.AbstractC0156x;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.List;

/* renamed from: w2.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w2\b.1.smali */
public final class C1025b extends x {
    public C1025b(B2.n nVar, FirebaseFirestore firebaseFirestore) {
        super(y2.v.a(nVar), firebaseFirestore);
        if (nVar.f309a.size() % 2 == 1) {
            return;
        }
        throw new IllegalArgumentException("Invalid collection reference. Collection references must have an odd number of segments, but " + nVar.c() + " has " + nVar.f309a.size());
    }

    public final g b(String str) {
        AbstractC0156x.i(str, "Provided document path must not be null.");
        B2.n nVar = (B2.n) this.f10971a.f11148e.a(B2.n.l(str));
        List list = nVar.f309a;
        if (list.size() % 2 == 0) {
            return new g(new B2.h(nVar), this.f10972b);
        }
        throw new IllegalArgumentException("Invalid document reference. Document references must have an even number of segments, but " + nVar.c() + " has " + list.size());
    }
}
