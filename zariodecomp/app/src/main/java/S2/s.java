package S2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S2\s.smali */
public final class s extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f3073a;

    /* renamed from: b, reason: collision with root package name */
    public long f3074b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3075c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f3076d;

    /* renamed from: e, reason: collision with root package name */
    public int f3077e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, Q3.c cVar) {
        super(cVar);
        this.f3076d = uVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3075c = obj;
        this.f3077e |= Integer.MIN_VALUE;
        return this.f3076d.m(this);
    }
}
