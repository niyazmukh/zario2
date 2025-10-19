package e3;

/* renamed from: e3.k, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e3.1\k.smali */
public final class C0487k extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f6923a;

    /* renamed from: b, reason: collision with root package name */
    public V2.o f6924b;

    /* renamed from: c, reason: collision with root package name */
    public int f6925c;

    /* renamed from: d, reason: collision with root package name */
    public int f6926d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f6927e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f6928f;

    /* renamed from: k, reason: collision with root package name */
    public int f6929k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0487k(o oVar, Q3.c cVar) {
        super(cVar);
        this.f6928f = oVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f6927e = obj;
        this.f6929k |= Integer.MIN_VALUE;
        return this.f6928f.d(0, 0, this);
    }
}
