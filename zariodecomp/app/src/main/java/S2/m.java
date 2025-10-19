package S2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S2\m.smali */
public final class m extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public u f3055a;

    /* renamed from: b, reason: collision with root package name */
    public V2.n f3056b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3057c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f3058d;

    /* renamed from: e, reason: collision with root package name */
    public int f3059e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(u uVar, Q3.c cVar) {
        super(cVar);
        this.f3058d = uVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3057c = obj;
        this.f3059e |= Integer.MIN_VALUE;
        return this.f3058d.k(null, this);
    }
}
