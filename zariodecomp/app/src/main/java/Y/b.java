package Y;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Y\b.smali */
public final class b extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public c f3858a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3859b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f3860c;

    /* renamed from: d, reason: collision with root package name */
    public int f3861d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Q3.c cVar2) {
        super(cVar2);
        this.f3860c = cVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3859b = obj;
        this.f3861d |= Integer.MIN_VALUE;
        return this.f3860c.a(null, this);
    }
}
