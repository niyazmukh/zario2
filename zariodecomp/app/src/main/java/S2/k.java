package S2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S2\k.smali */
public final class k extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public u f3047a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3048b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f3049c;

    /* renamed from: d, reason: collision with root package name */
    public int f3050d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(u uVar, Q3.c cVar) {
        super(cVar);
        this.f3049c = uVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3048b = obj;
        this.f3050d |= Integer.MIN_VALUE;
        return this.f3049c.i(this);
    }
}
