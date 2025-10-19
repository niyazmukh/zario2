package b3;

/* renamed from: b3.B, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\B.smali */
public final class C0279B extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5120a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0294S f5121b;

    /* renamed from: c, reason: collision with root package name */
    public int f5122c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0279B(C0294S c0294s, Q3.c cVar) {
        super(cVar);
        this.f5121b = c0294s;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f5120a = obj;
        this.f5122c |= Integer.MIN_VALUE;
        return this.f5121b.b(null, this);
    }
}
