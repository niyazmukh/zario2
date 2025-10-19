package i4;

import O0.j;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i4\o.smali */
public final class o extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7935a;

    /* renamed from: b, reason: collision with root package name */
    public int f7936b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T2.d f7937c;

    /* renamed from: d, reason: collision with root package name */
    public j f7938d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(T2.d dVar, O3.d dVar2) {
        super(dVar2);
        this.f7937c = dVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f7935a = obj;
        this.f7936b |= Integer.MIN_VALUE;
        return this.f7937c.c(null, this);
    }
}
