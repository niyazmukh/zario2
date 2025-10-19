package f4;

import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\a.1.smali */
public abstract class a extends t0 implements O3.d, C {

    /* renamed from: c, reason: collision with root package name */
    public final O3.i f7045c;

    public a(O3.i iVar, boolean z4) {
        super(z4);
        A((InterfaceC0506g0) iVar.get(B.f7000b));
        this.f7045c = iVar.plus(this);
    }

    @Override // f4.t0
    public final void I(Object obj) {
        if (!(obj instanceof C0524x)) {
            S(obj);
            return;
        }
        C0524x c0524x = (C0524x) obj;
        Throwable th = c0524x.f7107a;
        c0524x.getClass();
        R(th, C0524x.f7106b.get(c0524x) != 0);
    }

    public void R(Throwable th, boolean z4) {
    }

    public void S(Object obj) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T(D d5, a aVar, X3.p pVar) {
        int iOrdinal = d5.ordinal();
        K3.k kVar = K3.k.f2288a;
        if (iOrdinal == 0) {
            try {
                k4.a.j(p1.b.x(((Q3.a) pVar).create(aVar, this)), kVar);
                return;
            } finally {
                resumeWith(AbstractC0183a.v(th));
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                p1.b.x(((Q3.a) pVar).create(aVar, this)).resumeWith(kVar);
                return;
            }
            if (iOrdinal != 3) {
                throw new B0.c();
            }
            try {
                O3.i iVar = this.f7045c;
                Object objN = k4.a.n(iVar, null);
                try {
                    kotlin.jvm.internal.u.c(2, pVar);
                    Object objInvoke = pVar.invoke(aVar, this);
                    if (objInvoke != P3.a.f2678a) {
                        resumeWith(objInvoke);
                    }
                } finally {
                    k4.a.i(iVar, objN);
                }
            } catch (Throwable th) {
            }
        }
    }

    @Override // f4.C
    public final O3.i e() {
        return this.f7045c;
    }

    @Override // O3.d
    public final O3.i getContext() {
        return this.f7045c;
    }

    @Override // f4.t0
    public final String o() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // O3.d
    public final void resumeWith(Object obj) {
        Throwable thA = K3.g.a(obj);
        if (thA != null) {
            obj = new C0524x(thA, false);
        }
        Object objE = E(obj);
        if (objE == E.f7012e) {
            return;
        }
        j(objE);
    }

    @Override // f4.t0
    public final void z(B0.c cVar) {
        E.o(this.f7045c, cVar);
    }
}
