package b3;

/* renamed from: b3.m, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\m.1.smali */
public final class C0318m extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public C0324s f5275a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5276b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0324s f5277c;

    /* renamed from: d, reason: collision with root package name */
    public int f5278d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0318m(C0324s c0324s, Q3.c cVar) {
        super(cVar);
        this.f5277c = c0324s;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f5276b = obj;
        this.f5278d |= Integer.MIN_VALUE;
        return this.f5277c.b(null, null, 0, this);
    }
}
