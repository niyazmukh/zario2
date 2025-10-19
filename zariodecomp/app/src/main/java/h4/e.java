package h4;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h4\e.smali */
public final class e extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7777a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f7778b;

    /* renamed from: c, reason: collision with root package name */
    public int f7779c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, Q3.c cVar) {
        super(cVar);
        this.f7778b = gVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f7777a = obj;
        this.f7779c |= Integer.MIN_VALUE;
        Object objB = g.B(this.f7778b, this);
        return objB == P3.a.f2678a ? objB : new n(objB);
    }
}
