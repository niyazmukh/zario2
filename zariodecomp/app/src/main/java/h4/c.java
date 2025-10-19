package h4;

import a.AbstractC0183a;
import f4.C0516n;
import f4.E;
import f4.I0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h4\c.smali */
public final class c implements I0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f7773a = i.f7808p;

    /* renamed from: b, reason: collision with root package name */
    public C0516n f7774b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f7775c;

    public c(g gVar) {
        this.f7775c = gVar;
    }

    public final Object a(Q3.c cVar) throws Throwable {
        o oVar;
        Object obj;
        o oVar2;
        boolean z4 = false;
        byte b5 = 0;
        byte b6 = 0;
        Object obj2 = this.f7773a;
        if (obj2 == i.f7808p || obj2 == i.f7804l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g.f7788l;
            g gVar = this.f7775c;
            o oVar3 = (o) atomicReferenceFieldUpdater.get(gVar);
            while (!gVar.v()) {
                long andIncrement = g.f7784d.getAndIncrement(gVar);
                long j5 = i.f7796b;
                long j6 = andIncrement / j5;
                int i = (int) (andIncrement % j5);
                if (oVar3.f8408c != j6) {
                    o oVarO = gVar.o(j6, oVar3);
                    if (oVarO == null) {
                        continue;
                    } else {
                        oVar = oVarO;
                    }
                } else {
                    oVar = oVar3;
                }
                Object objG = gVar.G(oVar, i, andIncrement, null);
                h1.i iVar = i.f7805m;
                if (objG == iVar) {
                    throw new IllegalStateException("unreachable");
                }
                h1.i iVar2 = i.f7807o;
                if (objG == iVar2) {
                    if (andIncrement < gVar.s()) {
                        oVar.b();
                    }
                    oVar3 = oVar;
                } else {
                    if (objG == i.f7806n) {
                        g gVar2 = this.f7775c;
                        C0516n c0516nN = E.n(p1.b.x(cVar));
                        try {
                            this.f7774b = c0516nN;
                            o oVar4 = oVar;
                            Object objG2 = gVar2.G(oVar, i, andIncrement, this);
                            if (objG2 == iVar) {
                                b(oVar4, i);
                            } else {
                                X3.q bVar = null;
                                X3.l lVar = gVar2.f7793b;
                                if (objG2 == iVar2) {
                                    if (andIncrement < gVar2.s()) {
                                        oVar4.b();
                                    }
                                    o oVar5 = (o) g.f7788l.get(gVar2);
                                    while (true) {
                                        if (gVar2.v()) {
                                            C0516n c0516n = this.f7774b;
                                            kotlin.jvm.internal.i.b(c0516n);
                                            this.f7774b = null;
                                            this.f7773a = i.f7804l;
                                            Throwable thP = gVar.p();
                                            if (thP == null) {
                                                c0516n.resumeWith(Boolean.FALSE);
                                            } else {
                                                c0516n.resumeWith(AbstractC0183a.v(thP));
                                            }
                                        } else {
                                            long andIncrement2 = g.f7784d.getAndIncrement(gVar2);
                                            long j7 = i.f7796b;
                                            long j8 = andIncrement2 / j7;
                                            int i5 = (int) (andIncrement2 % j7);
                                            if (oVar5.f8408c != j8) {
                                                o oVarO2 = gVar2.o(j8, oVar5);
                                                if (oVarO2 != null) {
                                                    oVar2 = oVarO2;
                                                }
                                            } else {
                                                oVar2 = oVar5;
                                            }
                                            Object objG3 = gVar2.G(oVar2, i5, andIncrement2, this);
                                            if (objG3 == i.f7805m) {
                                                b(oVar2, i5);
                                                break;
                                            }
                                            if (objG3 == i.f7807o) {
                                                if (andIncrement2 < gVar2.s()) {
                                                    oVar2.b();
                                                }
                                                oVar5 = oVar2;
                                            } else {
                                                if (objG3 == i.f7806n) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                oVar2.b();
                                                this.f7773a = objG3;
                                                this.f7774b = null;
                                                obj = Boolean.TRUE;
                                                if (lVar != null) {
                                                    bVar = new b(b6 == true ? 1 : 0, lVar, objG3);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    oVar4.b();
                                    this.f7773a = objG2;
                                    this.f7774b = null;
                                    obj = Boolean.TRUE;
                                    if (lVar != null) {
                                        bVar = new b(b5 == true ? 1 : 0, lVar, objG2);
                                    }
                                }
                                c0516nN.a(obj, bVar);
                            }
                            Object objR = c0516nN.r();
                            P3.a aVar = P3.a.f2678a;
                            return objR;
                        } catch (Throwable th) {
                            c0516nN.z();
                            throw th;
                        }
                    }
                    oVar.b();
                    this.f7773a = objG;
                    z4 = true;
                }
            }
            this.f7773a = i.f7804l;
            Throwable thP2 = gVar.p();
            if (thP2 != null) {
                int i6 = k4.t.f8409a;
                throw thP2;
            }
        } else {
            z4 = true;
        }
        return Boolean.valueOf(z4);
    }

    @Override // f4.I0
    public final void b(k4.s sVar, int i) {
        C0516n c0516n = this.f7774b;
        if (c0516n != null) {
            c0516n.b(sVar, i);
        }
    }

    public final Object c() throws Throwable {
        Object obj = this.f7773a;
        h1.i iVar = i.f7808p;
        if (obj == iVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f7773a = iVar;
        if (obj != i.f7804l) {
            return obj;
        }
        Throwable thQ = this.f7775c.q();
        int i = k4.t.f8409a;
        throw thQ;
    }
}
