package S2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S2\l.smali */
public final class l extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public u f3051a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3052b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f3053c;

    /* renamed from: d, reason: collision with root package name */
    public int f3054d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(u uVar, Q3.c cVar) {
        super(cVar);
        this.f3053c = uVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3052b = obj;
        this.f3054d |= Integer.MIN_VALUE;
        return this.f3053c.j(this);
    }
}
