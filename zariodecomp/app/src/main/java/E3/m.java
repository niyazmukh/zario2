package e3;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e3.1\m.smali */
public final class m extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public o f6933a;

    /* renamed from: b, reason: collision with root package name */
    public V2.o f6934b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6935c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f6936d;

    /* renamed from: e, reason: collision with root package name */
    public int f6937e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, Q3.c cVar) {
        super(cVar);
        this.f6936d = oVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f6935c = obj;
        this.f6937e |= Integer.MIN_VALUE;
        return this.f6936d.e(null, this);
    }
}
