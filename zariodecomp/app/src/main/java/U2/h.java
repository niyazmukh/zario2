package U2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\U2\h.smali */
public final class h extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f3343a;

    /* renamed from: b, reason: collision with root package name */
    public o4.a f3344b;

    /* renamed from: c, reason: collision with root package name */
    public long f3345c;

    /* renamed from: d, reason: collision with root package name */
    public long f3346d;

    /* renamed from: e, reason: collision with root package name */
    public long f3347e;

    /* renamed from: f, reason: collision with root package name */
    public long f3348f;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f3349k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f3350l;

    /* renamed from: m, reason: collision with root package name */
    public int f3351m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, Q3.c cVar) {
        super(cVar);
        this.f3350l = lVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3349k = obj;
        this.f3351m |= Integer.MIN_VALUE;
        return this.f3350l.e(0L, 0L, 0L, this);
    }
}
