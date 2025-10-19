package w3;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w3.1\i.smali */
public final class i extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public l f10997a;

    /* renamed from: b, reason: collision with root package name */
    public Object f10998b;

    /* renamed from: c, reason: collision with root package name */
    public o4.a f10999c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f11000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f11001e;

    /* renamed from: f, reason: collision with root package name */
    public int f11002f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, Q3.c cVar) {
        super(cVar);
        this.f11001e = lVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f11000d = obj;
        this.f11002f |= Integer.MIN_VALUE;
        return this.f11001e.b(this);
    }
}
