package S2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S2\n.smali */
public final class n extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3060a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f3061b;

    /* renamed from: c, reason: collision with root package name */
    public int f3062c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(u uVar, Q3.c cVar) {
        super(cVar);
        this.f3061b = uVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3060a = obj;
        this.f3062c |= Integer.MIN_VALUE;
        return this.f3061b.l(this);
    }
}
