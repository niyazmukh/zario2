package T2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T2\s.smali */
public final class s extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3248a;

    /* renamed from: b, reason: collision with root package name */
    public int f3249b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O0.j f3250c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(O0.j jVar, O3.d dVar) {
        super(dVar);
        this.f3250c = jVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3248a = obj;
        this.f3249b |= Integer.MIN_VALUE;
        return this.f3250c.b(null, this);
    }
}
