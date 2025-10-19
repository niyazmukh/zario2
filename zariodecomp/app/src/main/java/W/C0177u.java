package W;

/* renamed from: W.u, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\u.1.smali */
public final class C0177u extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public O f3665a;

    /* renamed from: b, reason: collision with root package name */
    public o4.c f3666b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3667c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f3668d;

    /* renamed from: e, reason: collision with root package name */
    public int f3669e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0177u(O o5, Q3.c cVar) {
        super(cVar);
        this.f3668d = o5;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3667c = obj;
        this.f3669e |= Integer.MIN_VALUE;
        return O.a(this.f3668d, this);
    }
}
