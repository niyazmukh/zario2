package k3;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k3.1\m.smali */
public final class m extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8334a;

    /* renamed from: b, reason: collision with root package name */
    public int f8335b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S2.p f8336c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(S2.p pVar, O3.d dVar) {
        super(dVar);
        this.f8336c = pVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f8334a = obj;
        this.f8335b |= Integer.MIN_VALUE;
        return this.f8336c.b(null, this);
    }
}
