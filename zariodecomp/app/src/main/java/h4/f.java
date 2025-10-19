package h4;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h4\f.smali */
public final class f extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7780a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f7781b;

    /* renamed from: c, reason: collision with root package name */
    public int f7782c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Q3.c cVar) {
        super(cVar);
        this.f7781b = gVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f7780a = obj;
        this.f7782c |= Integer.MIN_VALUE;
        Object objC = this.f7781b.C(null, 0, 0L, this);
        return objC == P3.a.f2678a ? objC : new n(objC);
    }
}
