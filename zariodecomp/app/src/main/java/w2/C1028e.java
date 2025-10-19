package w2;

import a.AbstractC0183a;
import y2.C1051D;

/* renamed from: w2.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w2\e.1.smali */
public final /* synthetic */ class C1028e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10922a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10923b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f10924c;

    public /* synthetic */ C1028e(Object obj, i iVar, int i) {
        this.f10922a = i;
        this.f10923b = obj;
        this.f10924c = iVar;
    }

    @Override // w2.i
    public final void a(Object obj, p pVar) {
        switch (this.f10922a) {
            case 0:
                C1051D c1051d = (C1051D) obj;
                g gVar = (g) this.f10923b;
                gVar.getClass();
                C1027d c1027d = (C1027d) this.f10924c;
                if (pVar == null) {
                    AbstractC0183a.N(c1051d != null, "Got event without value or error set", new Object[0]);
                    AbstractC0183a.N(c1051d.f11071b.f318a.size() <= 1, "Too many documents returned on a document query", new Object[0]);
                    B2.l lVar = (B2.l) c1051d.f11071b.f318a.g(gVar.f10929a);
                    c1027d.a(lVar != null ? new h(gVar.f10930b, lVar.f322a, lVar, c1051d.f11074e, c1051d.f11075f.f9681a.f(lVar.f322a)) : new h(gVar.f10930b, gVar.f10929a, null, c1051d.f11074e, false), null);
                    break;
                } else {
                    c1027d.a(null, pVar);
                    break;
                }
            default:
                C1051D c1051d2 = (C1051D) obj;
                x xVar = (x) this.f10923b;
                xVar.getClass();
                C1027d c1027d2 = (C1027d) this.f10924c;
                if (pVar == null) {
                    AbstractC0183a.N(c1051d2 != null, "Got event without value or error set", new Object[0]);
                    c1027d2.a(new z(xVar, c1051d2, xVar.f10972b), null);
                    break;
                } else {
                    c1027d2.a(null, pVar);
                    break;
                }
        }
    }
}
