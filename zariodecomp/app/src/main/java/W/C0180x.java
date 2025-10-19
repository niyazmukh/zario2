package W;

/* renamed from: W.x, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\x.1.smali */
public final class C0180x extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public O f3678a;

    /* renamed from: b, reason: collision with root package name */
    public o4.c f3679b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3680c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f3681d;

    /* renamed from: e, reason: collision with root package name */
    public int f3682e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0180x(O o5, Q3.c cVar) {
        super(cVar);
        this.f3681d = o5;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3680c = obj;
        this.f3682e |= Integer.MIN_VALUE;
        return O.c(this.f3681d, this);
    }
}
