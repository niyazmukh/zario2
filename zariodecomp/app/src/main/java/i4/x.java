package i4;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i4\x.smali */
public final class x implements G, InterfaceC0612g, j4.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f7964a;

    public x(w wVar) {
        this.f7964a = wVar;
    }

    public final InterfaceC0612g a(O3.i iVar, int i, h4.a aVar) {
        return (((i < 0 || i >= 2) && i != -2) || aVar != h4.a.f7767b) ? C.k(this, iVar, i, aVar) : this;
    }

    public final Object b() {
        return ((I) this.f7964a).K();
    }

    @Override // i4.InterfaceC0612g
    public final Object c(InterfaceC0613h interfaceC0613h, O3.d dVar) throws Throwable {
        ((I) this.f7964a).c(interfaceC0613h, dVar);
        return P3.a.f2678a;
    }
}
