package b3;

/* renamed from: b3.r, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\r.smali */
public final class C0323r extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5303a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0324s f5304b;

    /* renamed from: c, reason: collision with root package name */
    public int f5305c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0323r(C0324s c0324s, Q3.c cVar) {
        super(cVar);
        this.f5304b = c0324s;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f5303a = obj;
        this.f5305c |= Integer.MIN_VALUE;
        return this.f5304b.e(null, this);
    }
}
