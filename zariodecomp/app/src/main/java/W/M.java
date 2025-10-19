package W;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\M.smali */
public final class M extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.p f3516a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3517b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f3518c;

    /* renamed from: d, reason: collision with root package name */
    public int f3519d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(O o5, Q3.c cVar) {
        super(cVar);
        this.f3518c = o5;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3517b = obj;
        this.f3519d |= Integer.MIN_VALUE;
        return this.f3518c.j(null, false, this);
    }
}
