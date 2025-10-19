package W;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\A.smali */
public final class A extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public O f3465a;

    /* renamed from: b, reason: collision with root package name */
    public j0 f3466b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3467c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f3468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ O f3469e;

    /* renamed from: f, reason: collision with root package name */
    public int f3470f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(O o5, O3.d dVar) {
        super(dVar);
        this.f3469e = o5;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3468d = obj;
        this.f3470f |= Integer.MIN_VALUE;
        return O.d(this.f3469e, false, this);
    }
}
