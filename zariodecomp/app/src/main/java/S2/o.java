package S2;

import O3.d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S2\o.smali */
public final class o extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3063a;

    /* renamed from: b, reason: collision with root package name */
    public int f3064b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3065c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, d dVar) {
        super(dVar);
        this.f3065c = pVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3063a = obj;
        this.f3064b |= Integer.MIN_VALUE;
        return this.f3065c.b(null, this);
    }
}
