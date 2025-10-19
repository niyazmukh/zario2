package A2;

import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\Z.smali */
public enum Z {
    NO_DOCUMENT(1),
    FOUND_DOCUMENT(2),
    UNKNOWN_DOCUMENT(3),
    INVALID_DOCUMENT(4);


    /* renamed from: a, reason: collision with root package name */
    public final int f163a;

    Z(int i) {
        this.f163a = i;
    }

    public static Z a(B2.l lVar) {
        if (t.h.a(lVar.f323b, 3)) {
            return NO_DOCUMENT;
        }
        if (lVar.d()) {
            return FOUND_DOCUMENT;
        }
        if (t.h.a(lVar.f323b, 4)) {
            return UNKNOWN_DOCUMENT;
        }
        AbstractC0183a.N(!lVar.e(), "MutableDocument has an unknown type", new Object[0]);
        return INVALID_DOCUMENT;
    }
}
