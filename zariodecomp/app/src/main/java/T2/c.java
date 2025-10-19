package T2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T2\c.smali */
public final class c extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3204a;

    /* renamed from: b, reason: collision with root package name */
    public int f3205b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O0.j f3206c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(O0.j jVar, O3.d dVar) {
        super(dVar);
        this.f3206c = jVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3204a = obj;
        this.f3205b |= Integer.MIN_VALUE;
        return this.f3206c.b(null, this);
    }
}
