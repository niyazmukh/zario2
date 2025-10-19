package i4;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i4\m.smali */
public final class m extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7924a;

    /* renamed from: b, reason: collision with root package name */
    public int f7925b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T2.d f7926c;

    /* renamed from: d, reason: collision with root package name */
    public T2.d f7927d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0613h f7928e;

    /* renamed from: f, reason: collision with root package name */
    public j4.y f7929f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(T2.d dVar, O3.d dVar2) {
        super(dVar2);
        this.f7926c = dVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f7924a = obj;
        this.f7925b |= Integer.MIN_VALUE;
        return this.f7926c.c(null, this);
    }
}
