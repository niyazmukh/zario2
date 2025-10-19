package S2;

import O3.d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S2\r.smali */
public final class r extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3070a;

    /* renamed from: b, reason: collision with root package name */
    public int f3071b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3072c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p pVar, d dVar) {
        super(dVar);
        this.f3072c = pVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3070a = obj;
        this.f3071b |= Integer.MIN_VALUE;
        return this.f3072c.b(null, this);
    }
}
