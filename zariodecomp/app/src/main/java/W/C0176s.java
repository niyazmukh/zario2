package W;

/* renamed from: W.s, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\s.1.smali */
public final class C0176s extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3658a;

    /* renamed from: b, reason: collision with root package name */
    public int f3659b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S2.p f3660c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0176s(S2.p pVar, O3.d dVar) {
        super(dVar);
        this.f3660c = pVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3658a = obj;
        this.f3659b |= Integer.MIN_VALUE;
        return this.f3660c.b(null, this);
    }
}
