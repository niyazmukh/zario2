package i4;

import O0.j;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i4\p.smali */
public final class p extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public j f7939a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7940b;

    /* renamed from: c, reason: collision with root package name */
    public int f7941c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f7942d;

    /* renamed from: e, reason: collision with root package name */
    public Object f7943e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(j jVar, O3.d dVar) {
        super(dVar);
        this.f7942d = jVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f7940b = obj;
        this.f7941c |= Integer.MIN_VALUE;
        return this.f7942d.b(null, this);
    }
}
