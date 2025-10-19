package e3;

/* renamed from: e3.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e3.1\d.smali */
public final class C0481d extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f6899a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6900b;

    /* renamed from: c, reason: collision with root package name */
    public int f6901c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f6902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f6903e;

    /* renamed from: f, reason: collision with root package name */
    public int f6904f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0481d(o oVar, Q3.c cVar) {
        super(cVar);
        this.f6903e = oVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f6902d = obj;
        this.f6904f |= Integer.MIN_VALUE;
        return this.f6903e.a(0, this);
    }
}
