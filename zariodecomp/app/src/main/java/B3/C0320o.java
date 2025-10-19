package b3;

/* renamed from: b3.o, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\o.1.smali */
public final class C0320o extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5286a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0324s f5287b;

    /* renamed from: c, reason: collision with root package name */
    public int f5288c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0320o(C0324s c0324s, Q3.c cVar) {
        super(cVar);
        this.f5287b = c0324s;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f5286a = obj;
        this.f5288c |= Integer.MIN_VALUE;
        return this.f5287b.c(0, this);
    }
}
