package b3;

/* renamed from: b3.g, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\g.1.smali */
public final class C0312g extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5253a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0316k f5254b;

    /* renamed from: c, reason: collision with root package name */
    public int f5255c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0312g(C0316k c0316k, Q3.c cVar) {
        super(cVar);
        this.f5254b = c0316k;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f5253a = obj;
        this.f5255c |= Integer.MIN_VALUE;
        Object objC = this.f5254b.c(null, this);
        return objC == P3.a.f2678a ? objC : new K3.g(objC);
    }
}
