package U2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\U2\k.smali */
public final class k extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f3368a;

    /* renamed from: b, reason: collision with root package name */
    public o4.a f3369b;

    /* renamed from: c, reason: collision with root package name */
    public long f3370c;

    /* renamed from: d, reason: collision with root package name */
    public long f3371d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f3372e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f3373f;

    /* renamed from: k, reason: collision with root package name */
    public int f3374k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, Q3.c cVar) {
        super(cVar);
        this.f3373f = lVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3372e = obj;
        this.f3374k |= Integer.MIN_VALUE;
        return this.f3373f.h(0L, 0L, this);
    }
}
