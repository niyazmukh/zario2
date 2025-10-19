package i4;

/* renamed from: i4.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i4\b.1.smali */
public final class C0607b extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public h4.v f7897a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7898b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0608c f7899c;

    /* renamed from: d, reason: collision with root package name */
    public int f7900d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0607b(C0608c c0608c, Q3.c cVar) {
        super(cVar);
        this.f7899c = c0608c;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f7898b = obj;
        this.f7900d |= Integer.MIN_VALUE;
        return this.f7899c.b(null, this);
    }
}
