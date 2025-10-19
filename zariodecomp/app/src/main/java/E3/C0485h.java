package e3;

/* renamed from: e3.h, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e3.1\h.smali */
public final class C0485h extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public o f6915a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6916b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f6917c;

    /* renamed from: d, reason: collision with root package name */
    public int f6918d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0485h(o oVar, Q3.c cVar) {
        super(cVar);
        this.f6917c = oVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f6916b = obj;
        this.f6918d |= Integer.MIN_VALUE;
        return this.f6917c.c(this);
    }
}
