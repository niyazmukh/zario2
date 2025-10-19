package W;

/* renamed from: W.j, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\j.1.smali */
public final class C0168j extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public S0.n f3618a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3619b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S0.n f3620c;

    /* renamed from: d, reason: collision with root package name */
    public int f3621d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0168j(S0.n nVar, Q3.c cVar) {
        super(cVar);
        this.f3620c = nVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3619b = obj;
        this.f3621d |= Integer.MIN_VALUE;
        return this.f3620c.c(this);
    }
}
