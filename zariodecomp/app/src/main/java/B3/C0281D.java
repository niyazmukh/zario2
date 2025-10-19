package b3;

/* renamed from: b3.D, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\D.smali */
public final class C0281D extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0294S f5127b;

    /* renamed from: c, reason: collision with root package name */
    public int f5128c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0281D(C0294S c0294s, Q3.c cVar) {
        super(cVar);
        this.f5127b = c0294s;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f5126a = obj;
        this.f5128c |= Integer.MIN_VALUE;
        return this.f5127b.c(null, this);
    }
}
