package S2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S2\h.smali */
public final class h extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3036a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f3037b;

    /* renamed from: c, reason: collision with root package name */
    public int f3038c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(u uVar, Q3.c cVar) {
        super(cVar);
        this.f3037b = uVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3036a = obj;
        this.f3038c |= Integer.MIN_VALUE;
        return this.f3037b.f(this);
    }
}
