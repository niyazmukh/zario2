package b3;

/* renamed from: b3.p, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\p.1.smali */
public final class C0321p extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public C0324s f5289a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5290b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0324s f5291c;

    /* renamed from: d, reason: collision with root package name */
    public int f5292d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0321p(C0324s c0324s, Q3.c cVar) {
        super(cVar);
        this.f5291c = c0324s;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f5290b = obj;
        this.f5292d |= Integer.MIN_VALUE;
        return this.f5291c.d(null, 0L, null, this);
    }
}
