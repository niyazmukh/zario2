package E2;

import N2.AbstractC0156x;
import N2.B;
import com.google.protobuf.AbstractC0388a;
import com.google.protobuf.AbstractC0409l;
import com.google.protobuf.C0407k;
import z3.b0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E2\H.smali */
public final class H extends AbstractC0101c {

    /* renamed from: s, reason: collision with root package name */
    public static final C0407k f1418s = AbstractC0409l.f6528b;

    /* renamed from: r, reason: collision with root package name */
    public final S0.l f1419r;

    public H(q qVar, F2.f fVar, S0.l lVar, v vVar) {
        com.google.android.gms.common.api.internal.F f2 = AbstractC0156x.f2610c;
        if (f2 == null) {
            synchronized (AbstractC0156x.class) {
                try {
                    f2 = AbstractC0156x.f2610c;
                    if (f2 == null) {
                        b0 b0Var = b0.f11283c;
                        String strB = com.google.android.gms.common.api.internal.F.b("google.firestore.v1.Firestore", "Listen");
                        N2.A aZ = N2.A.z();
                        com.google.protobuf.v vVar2 = G3.c.f1874a;
                        f2 = new com.google.android.gms.common.api.internal.F(b0Var, strB, new G3.b(aZ), new G3.b(B.v()), true);
                        AbstractC0156x.f2610c = f2;
                    }
                } finally {
                }
            }
        }
        super(qVar, f2, fVar, F2.e.f1694b, F2.e.f1693a, vVar);
        this.f1419r = lVar;
    }

    @Override // E2.AbstractC0101c
    public final void e(AbstractC0388a abstractC0388a) {
        f((B) abstractC0388a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0500  */
    /* JADX WARN: Type inference failed for: r2v15, types: [com.google.protobuf.J, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.ArrayList] */
    @Override // E2.AbstractC0101c
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(N2.B r32) {
        /*
            Method dump skipped, instructions count: 2041
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E2.H.f(N2.B):void");
    }
}
