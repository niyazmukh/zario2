package w2;

import N2.AbstractC0156x;
import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w2\p.smali */
public final class p extends l2.h {

    /* renamed from: a, reason: collision with root package name */
    public final o f10950a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, o oVar, Exception exc) {
        super(str, exc);
        com.google.android.gms.common.internal.C.e(str, "Detail message must not be empty");
        AbstractC0156x.i(str, "Provided message must not be null.");
        AbstractC0183a.N(oVar != o.OK, "A FirebaseFirestoreException should never be thrown for OK", new Object[0]);
        AbstractC0156x.i(oVar, "Provided code must not be null.");
        this.f10950a = oVar;
    }

    public p(String str, o oVar) {
        super(str);
        AbstractC0183a.N(oVar != o.OK, "A FirebaseFirestoreException should never be thrown for OK", new Object[0]);
        this.f10950a = oVar;
    }
}
