package S2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S2\f.smali */
public final class f extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3030a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f3031b;

    /* renamed from: c, reason: collision with root package name */
    public int f3032c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(u uVar, Q3.c cVar) {
        super(cVar);
        this.f3031b = uVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3030a = obj;
        this.f3032c |= Integer.MIN_VALUE;
        return this.f3031b.d(this);
    }
}
