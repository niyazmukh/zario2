package h4;

import M.InterfaceC0119d;
import N2.AbstractC0156x;
import f4.I0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h4\r.smali */
public final class r extends g {

    /* renamed from: p, reason: collision with root package name */
    public final a f7820p;

    public r(int i, a aVar, X3.l lVar) {
        super(i, lVar);
        this.f7820p = aVar;
        if (aVar != a.f7766a) {
            if (i < 1) {
                throw new IllegalArgumentException(B.a.i("Buffered channel capacity must be at least 1, but ", i, " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + kotlin.jvm.internal.s.a(g.class).b() + " instead").toString());
        }
    }

    public final Object J(Object obj, boolean z4) {
        o oVar;
        X3.l lVar;
        B0.c cVarB;
        a aVar = a.f7768c;
        K3.k kVar = K3.k.f2288a;
        if (this.f7820p == aVar) {
            Object objC = super.c(obj);
            if (!(objC instanceof m) || (objC instanceof l)) {
                return objC;
            }
            if (!z4 || (lVar = this.f7793b) == null || (cVarB = k4.a.b(lVar, obj, null)) == null) {
                return kVar;
            }
            throw cVarB;
        }
        InterfaceC0119d interfaceC0119d = i.f7798d;
        o oVar2 = (o) g.f7787k.get(this);
        while (true) {
            long andIncrement = g.f7783c.getAndIncrement(this);
            long j5 = andIncrement & 1152921504606846975L;
            boolean zU = u(andIncrement, false);
            int i = i.f7796b;
            long j6 = i;
            long j7 = j5 / j6;
            int i5 = (int) (j5 % j6);
            if (oVar2.f8408c != j7) {
                o oVarA = g.a(this, j7, oVar2);
                if (oVarA != null) {
                    oVar = oVarA;
                } else if (zU) {
                    return new l(r());
                }
            } else {
                oVar = oVar2;
            }
            int iF = g.f(this, oVar, i5, obj, j5, interfaceC0119d, zU);
            if (iF == 0) {
                oVar.b();
                return kVar;
            }
            if (iF == 1) {
                return kVar;
            }
            if (iF == 2) {
                if (zU) {
                    oVar.i();
                    return new l(r());
                }
                I0 i02 = interfaceC0119d instanceof I0 ? (I0) interfaceC0119d : null;
                if (i02 != null) {
                    i02.b(oVar, i5 + i);
                }
                m((oVar.f8408c * j6) + i5);
                return kVar;
            }
            if (iF == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iF == 4) {
                if (j5 < g.f7784d.get(this)) {
                    oVar.b();
                }
                return new l(r());
            }
            if (iF == 5) {
                oVar.b();
            }
            oVar2 = oVar;
        }
    }

    @Override // h4.g, h4.y
    public final Object c(Object obj) {
        return J(obj, false);
    }

    @Override // h4.g, h4.y
    public final Object d(O3.d dVar, Object obj) throws Throwable {
        B0.c cVarB;
        if (!(J(obj, true) instanceof l)) {
            return K3.k.f2288a;
        }
        X3.l lVar = this.f7793b;
        if (lVar == null || (cVarB = k4.a.b(lVar, obj, null)) == null) {
            throw r();
        }
        AbstractC0156x.c(cVarB, r());
        throw cVarB;
    }

    @Override // h4.g
    public final boolean x() {
        return this.f7820p == a.f7767b;
    }
}
