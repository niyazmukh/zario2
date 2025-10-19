package b3;

/* renamed from: b3.F, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\F.smali */
public final class C0282F extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public C0294S f5129a;

    /* renamed from: b, reason: collision with root package name */
    public String f5130b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5131c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5132d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f5133e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0294S f5134f;

    /* renamed from: k, reason: collision with root package name */
    public int f5135k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0282F(C0294S c0294s, Q3.c cVar) {
        super(cVar);
        this.f5134f = c0294s;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f5133e = obj;
        this.f5135k |= Integer.MIN_VALUE;
        return this.f5134f.d(null, null, null, null, 0, this);
    }
}
