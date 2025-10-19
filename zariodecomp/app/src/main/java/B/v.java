package b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b.1\v.smali */
public final class v implements InterfaceC0246c {

    /* renamed from: a, reason: collision with root package name */
    public final n f4939a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f4940b;

    public v(x xVar, n onBackPressedCallback) {
        kotlin.jvm.internal.i.e(onBackPressedCallback, "onBackPressedCallback");
        this.f4940b = xVar;
        this.f4939a = onBackPressedCallback;
    }

    @Override // b.InterfaceC0246c
    public final void cancel() {
        x xVar = this.f4940b;
        L3.h hVar = xVar.f4943b;
        n nVar = this.f4939a;
        hVar.remove(nVar);
        if (kotlin.jvm.internal.i.a(xVar.f4944c, nVar)) {
            nVar.getClass();
            xVar.f4944c = null;
        }
        nVar.f4921b.remove(this);
        c4.a aVar = nVar.f4922c;
        if (aVar != null) {
            aVar.invoke();
        }
        nVar.f4922c = null;
    }
}
