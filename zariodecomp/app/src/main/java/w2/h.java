package w2;

import N2.n0;
import com.google.firebase.firestore.FirebaseFirestore;
import r.AbstractC0854a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w2\h.smali */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseFirestore f10931a;

    /* renamed from: b, reason: collision with root package name */
    public final B2.h f10932b;

    /* renamed from: c, reason: collision with root package name */
    public final B2.l f10933c;

    /* renamed from: d, reason: collision with root package name */
    public final C f10934d;

    public h(FirebaseFirestore firebaseFirestore, B2.h hVar, B2.l lVar, boolean z4, boolean z5) {
        firebaseFirestore.getClass();
        this.f10931a = firebaseFirestore;
        hVar.getClass();
        this.f10932b = hVar;
        this.f10933c = lVar;
        this.f10934d = new C(z5, z4);
    }

    public final Object a(k kVar) {
        n0 n0VarF;
        if (AbstractC0854a.f9542a == 0) {
            throw new NullPointerException(String.valueOf("Provided serverTimestampBehavior value must not be null."));
        }
        B2.l lVar = this.f10933c;
        if (lVar == null || (n0VarF = lVar.f326e.f(kVar.f10936a)) == null) {
            return null;
        }
        return new h1.i(this.f10931a, 24).w(n0VarF);
    }

    public final Long b(String str) {
        Number number = (Number) d(Number.class, str);
        if (number != null) {
            return Long.valueOf(number.longValue());
        }
        return null;
    }

    public final String c(String str) {
        return (String) d(String.class, str);
    }

    public final Object d(Class cls, String str) {
        Object objA = a(k.a(str));
        if (objA == null) {
            return null;
        }
        if (cls.isInstance(objA)) {
            return cls.cast(objA);
        }
        StringBuilder sbO = B.a.o("Field '", str, "' is not a ");
        sbO.append(cls.getName());
        throw new RuntimeException(sbO.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f10931a.equals(hVar.f10931a) && this.f10932b.equals(hVar.f10932b) && this.f10934d.equals(hVar.f10934d)) {
            B2.l lVar = hVar.f10933c;
            B2.l lVar2 = this.f10933c;
            if (lVar2 == null) {
                if (lVar == null) {
                    return true;
                }
            } else if (lVar != null && lVar2.f326e.equals(lVar.f326e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f10932b.f315a.hashCode() + (this.f10931a.hashCode() * 31)) * 31;
        B2.l lVar = this.f10933c;
        return this.f10934d.hashCode() + ((((iHashCode + (lVar != null ? lVar.f322a.f315a.hashCode() : 0)) * 31) + (lVar != null ? lVar.f326e.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DocumentSnapshot{key=" + this.f10932b + ", metadata=" + this.f10934d + ", doc=" + this.f10933c + '}';
    }
}
