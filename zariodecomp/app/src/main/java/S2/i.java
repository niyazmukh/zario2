package S2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S2\i.smali */
public final class i extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public u f3039a;

    /* renamed from: b, reason: collision with root package name */
    public int f3040b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3041c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f3042d;

    /* renamed from: e, reason: collision with root package name */
    public int f3043e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(u uVar, Q3.c cVar) {
        super(cVar);
        this.f3042d = uVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3041c = obj;
        this.f3043e |= Integer.MIN_VALUE;
        return this.f3042d.g(this);
    }
}
