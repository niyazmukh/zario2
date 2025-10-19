package W;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\U.smali */
public final class U extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public W f3547a;

    /* renamed from: b, reason: collision with root package name */
    public Q f3548b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3549c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f3550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ W f3551e;

    /* renamed from: f, reason: collision with root package name */
    public int f3552f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(W w4, Q3.c cVar) {
        super(cVar);
        this.f3551e = w4;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3550d = obj;
        this.f3552f |= Integer.MIN_VALUE;
        return this.f3551e.a(null, this);
    }
}
