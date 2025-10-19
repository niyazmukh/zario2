package W;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\V.smali */
public final class V extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public W f3553a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3554b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3555c;

    /* renamed from: d, reason: collision with root package name */
    public Y f3556d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f3557e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ W f3558f;

    /* renamed from: k, reason: collision with root package name */
    public int f3559k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(W w4, Q3.c cVar) {
        super(cVar);
        this.f3558f = w4;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3557e = obj;
        this.f3559k |= Integer.MIN_VALUE;
        return this.f3558f.b(null, this);
    }
}
