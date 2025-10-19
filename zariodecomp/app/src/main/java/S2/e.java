package S2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S2\e.smali */
public final class e extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3027a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f3028b;

    /* renamed from: c, reason: collision with root package name */
    public int f3029c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(u uVar, Q3.c cVar) {
        super(cVar);
        this.f3028b = uVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3027a = obj;
        this.f3029c |= Integer.MIN_VALUE;
        return this.f3028b.c(this);
    }
}
