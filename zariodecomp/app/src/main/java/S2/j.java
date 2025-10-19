package S2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S2\j.smali */
public final class j extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3044a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f3045b;

    /* renamed from: c, reason: collision with root package name */
    public int f3046c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(u uVar, Q3.c cVar) {
        super(cVar);
        this.f3045b = uVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3044a = obj;
        this.f3046c |= Integer.MIN_VALUE;
        return this.f3045b.h(this);
    }
}
