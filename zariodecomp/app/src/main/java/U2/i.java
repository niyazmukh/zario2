package U2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\U2\i.smali */
public final class i extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f3352a;

    /* renamed from: b, reason: collision with root package name */
    public o4.c f3353b;

    /* renamed from: c, reason: collision with root package name */
    public long f3354c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f3355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f3356e;

    /* renamed from: f, reason: collision with root package name */
    public int f3357f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, Q3.c cVar) {
        super(cVar);
        this.f3356e = lVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3355d = obj;
        this.f3357f |= Integer.MIN_VALUE;
        return this.f3356e.f(0L, this);
    }
}
