package T2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T2\g.smali */
public final class g extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3222a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f3223b;

    /* renamed from: c, reason: collision with root package name */
    public int f3224c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(u uVar, Q3.c cVar) {
        super(cVar);
        this.f3223b = uVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3222a = obj;
        this.f3224c |= Integer.MIN_VALUE;
        return this.f3223b.a(this);
    }
}
