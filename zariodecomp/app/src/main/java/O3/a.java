package O3;

import X3.p;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\O3\a.smali */
public abstract class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final h f2654a;

    public a(h hVar) {
        this.f2654a = hVar;
    }

    @Override // O3.i
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // O3.i
    public g get(h hVar) {
        return S0.f.C(this, hVar);
    }

    @Override // O3.g
    public final h getKey() {
        return this.f2654a;
    }

    @Override // O3.i
    public i minusKey(h hVar) {
        return S0.f.R(this, hVar);
    }

    @Override // O3.i
    public final i plus(i iVar) {
        return S0.f.U(this, iVar);
    }
}
