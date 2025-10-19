package W;

import i4.InterfaceC0613h;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\t.1.smali */
public final class t extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public C0162d f3661a;

    /* renamed from: b, reason: collision with root package name */
    public int f3662b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3663c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f3664d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(O o5, O3.d dVar) {
        super(2, dVar);
        this.f3664d = o5;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        t tVar = new t(this.f3664d, dVar);
        tVar.f3663c = obj;
        return tVar;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((InterfaceC0613h) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    @Override // Q3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
