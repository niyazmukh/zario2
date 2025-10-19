package W;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\f0.smali */
public final class f0 extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f3596a;

    /* renamed from: b, reason: collision with root package name */
    public o4.c f3597b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3598c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0 f3599d;

    /* renamed from: e, reason: collision with root package name */
    public int f3600e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(i0 i0Var, Q3.c cVar) {
        super(cVar);
        this.f3599d = i0Var;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3598c = obj;
        this.f3600e |= Integer.MIN_VALUE;
        return this.f3599d.b(null, this);
    }
}
