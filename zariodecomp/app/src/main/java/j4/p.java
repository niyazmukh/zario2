package j4;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j4\p.smali */
public final class p extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f8106b;

    /* renamed from: c, reason: collision with root package name */
    public int f8107c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, O3.d dVar) {
        super(dVar);
        this.f8106b = qVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f8105a = obj;
        this.f8107c |= Integer.MIN_VALUE;
        return this.f8106b.b(null, this);
    }
}
