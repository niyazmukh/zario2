package U2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\U2\g.smali */
public final class g extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f3337a;

    /* renamed from: b, reason: collision with root package name */
    public o4.c f3338b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3339c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f3340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f3341e;

    /* renamed from: f, reason: collision with root package name */
    public int f3342f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, Q3.c cVar) {
        super(cVar);
        this.f3341e = lVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3340d = obj;
        this.f3342f |= Integer.MIN_VALUE;
        return this.f3341e.d(false, this);
    }
}
