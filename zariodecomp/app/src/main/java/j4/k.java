package j4;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j4\k.smali */
public final class k extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public l f8091a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8092b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f8093c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f8094d;

    /* renamed from: e, reason: collision with root package name */
    public int f8095e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, O3.d dVar) {
        super(dVar);
        this.f8094d = lVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f8093c = obj;
        this.f8095e |= Integer.MIN_VALUE;
        return this.f8094d.b(null, this);
    }
}
