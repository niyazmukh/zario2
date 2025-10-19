package i4;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i4\n.smali */
public final class n extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public C0610e f7930a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7931b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f7932c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0610e f7933d;

    /* renamed from: e, reason: collision with root package name */
    public int f7934e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(C0610e c0610e, O3.d dVar) {
        super(dVar);
        this.f7933d = c0610e;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f7932c = obj;
        this.f7934e |= Integer.MIN_VALUE;
        return this.f7933d.b(null, this);
    }
}
