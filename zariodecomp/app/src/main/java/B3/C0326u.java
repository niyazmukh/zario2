package b3;

/* renamed from: b3.u, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\u.1.smali */
public final class C0326u extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public C0327v f5312a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5313b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5314c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f5315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0327v f5316e;

    /* renamed from: f, reason: collision with root package name */
    public int f5317f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0326u(C0327v c0327v, Q3.c cVar) {
        super(cVar);
        this.f5316e = c0327v;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f5315d = obj;
        this.f5317f |= Integer.MIN_VALUE;
        return this.f5316e.a(null, null, this);
    }
}
