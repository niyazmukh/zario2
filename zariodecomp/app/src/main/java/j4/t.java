package j4;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j4\t.smali */
public final class t implements O3.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O3.i f8125a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f8126b;

    public t(O3.i iVar, Throwable th) {
        this.f8125a = iVar;
        this.f8126b = th;
    }

    @Override // O3.i
    public final Object fold(Object obj, X3.p pVar) {
        return this.f8125a.fold(obj, pVar);
    }

    @Override // O3.i
    public final O3.g get(O3.h hVar) {
        return this.f8125a.get(hVar);
    }

    @Override // O3.i
    public final O3.i minusKey(O3.h hVar) {
        return this.f8125a.minusKey(hVar);
    }

    @Override // O3.i
    public final O3.i plus(O3.i iVar) {
        return this.f8125a.plus(iVar);
    }
}
