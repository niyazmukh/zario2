package i4;

/* renamed from: i4.k, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i4\k.1.smali */
public final class C0615k extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7917a;

    /* renamed from: b, reason: collision with root package name */
    public int f7918b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f7919c;

    /* renamed from: d, reason: collision with root package name */
    public Object f7920d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0613h f7921e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0615k(l lVar, O3.d dVar) {
        super(dVar);
        this.f7919c = lVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f7917a = obj;
        this.f7918b |= Integer.MIN_VALUE;
        return this.f7919c.c(null, this);
    }
}
