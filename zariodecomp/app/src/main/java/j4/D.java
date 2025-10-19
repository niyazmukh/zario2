package j4;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j4\D.smali */
public final class D implements O3.d, Q3.d {

    /* renamed from: a, reason: collision with root package name */
    public final O3.d f8064a;

    /* renamed from: b, reason: collision with root package name */
    public final O3.i f8065b;

    public D(O3.d dVar, O3.i iVar) {
        this.f8064a = dVar;
        this.f8065b = iVar;
    }

    @Override // Q3.d
    public final Q3.d getCallerFrame() {
        O3.d dVar = this.f8064a;
        if (dVar instanceof Q3.d) {
            return (Q3.d) dVar;
        }
        return null;
    }

    @Override // O3.d
    public final O3.i getContext() {
        return this.f8065b;
    }

    @Override // O3.d
    public final void resumeWith(Object obj) {
        this.f8064a.resumeWith(obj);
    }
}
