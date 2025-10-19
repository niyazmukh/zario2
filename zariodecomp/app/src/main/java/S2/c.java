package S2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S2\c.smali */
public final class c extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3024a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f3025b;

    /* renamed from: c, reason: collision with root package name */
    public int f3026c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(u uVar, Q3.c cVar) {
        super(cVar);
        this.f3025b = uVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3024a = obj;
        this.f3026c |= Integer.MIN_VALUE;
        return this.f3025b.a(this);
    }
}
