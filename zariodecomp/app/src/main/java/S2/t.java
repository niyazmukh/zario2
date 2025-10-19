package S2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S2\t.smali */
public final class t extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f3078a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3079b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3080c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f3081d;

    /* renamed from: e, reason: collision with root package name */
    public int f3082e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, Q3.c cVar) {
        super(cVar);
        this.f3081d = uVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3080c = obj;
        this.f3082e |= Integer.MIN_VALUE;
        return this.f3081d.n(null, this);
    }
}
