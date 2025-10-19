package b3;

/* renamed from: b3.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\c.1.smali */
public final class C0306c extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5226a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0316k f5227b;

    /* renamed from: c, reason: collision with root package name */
    public int f5228c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0306c(C0316k c0316k, Q3.c cVar) {
        super(cVar);
        this.f5227b = c0316k;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f5226a = obj;
        this.f5228c |= Integer.MIN_VALUE;
        Object objB = this.f5227b.b(null, null, this);
        return objB == P3.a.f2678a ? objB : new K3.g(objB);
    }
}
