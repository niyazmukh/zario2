package e3;

/* renamed from: e3.g, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e3.1\g.smali */
public final class C0484g extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public o f6911a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6912b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f6913c;

    /* renamed from: d, reason: collision with root package name */
    public int f6914d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0484g(o oVar, Q3.c cVar) {
        super(cVar);
        this.f6913c = oVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f6912b = obj;
        this.f6914d |= Integer.MIN_VALUE;
        return this.f6913c.b(this);
    }
}
