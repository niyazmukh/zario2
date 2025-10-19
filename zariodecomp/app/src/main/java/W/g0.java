package W;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\g0.smali */
public final class g0 extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public o4.c f3603a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3604b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3605c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0 f3606d;

    /* renamed from: e, reason: collision with root package name */
    public int f3607e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i0 i0Var, Q3.c cVar) {
        super(cVar);
        this.f3606d = i0Var;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3605c = obj;
        this.f3607e |= Integer.MIN_VALUE;
        return this.f3606d.c(null, this);
    }
}
