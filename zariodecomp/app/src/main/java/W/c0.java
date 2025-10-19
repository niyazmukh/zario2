package W;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\c0.smali */
public final class c0 extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public S0.n f3576a;

    /* renamed from: b, reason: collision with root package name */
    public o4.a f3577b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3578c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S0.n f3579d;

    /* renamed from: e, reason: collision with root package name */
    public int f3580e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(S0.n nVar, Q3.c cVar) {
        super(cVar);
        this.f3579d = nVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3578c = obj;
        this.f3580e |= Integer.MIN_VALUE;
        return this.f3579d.p(this);
    }
}
