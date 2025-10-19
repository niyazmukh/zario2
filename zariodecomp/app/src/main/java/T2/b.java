package T2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T2\b.smali */
public final class b extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public e f3200a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3201b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f3202c;

    /* renamed from: d, reason: collision with root package name */
    public int f3203d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, Q3.c cVar) {
        super(cVar);
        this.f3202c = eVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3201b = obj;
        this.f3203d |= Integer.MIN_VALUE;
        return this.f3202c.a(this);
    }
}
