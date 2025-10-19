package f4;

import S0.f;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\H0.smali */
public final class H0 implements O3.g, O3.h {

    /* renamed from: a, reason: collision with root package name */
    public static final H0 f7022a = new H0();

    @Override // O3.i
    public final Object fold(Object obj, X3.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // O3.i
    public final O3.g get(O3.h hVar) {
        return f.C(this, hVar);
    }

    @Override // O3.g
    public final O3.h getKey() {
        return this;
    }

    @Override // O3.i
    public final O3.i minusKey(O3.h hVar) {
        return f.R(this, hVar);
    }

    @Override // O3.i
    public final O3.i plus(O3.i iVar) {
        return f.U(this, iVar);
    }
}
