package i4;

/* renamed from: i4.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i4\a.1.smali */
public final class C0606a extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public j4.y f7893a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7894b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O0.i f7895c;

    /* renamed from: d, reason: collision with root package name */
    public int f7896d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0606a(O0.i iVar, O3.d dVar) {
        super(dVar);
        this.f7895c = iVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f7894b = obj;
        this.f7896d |= Integer.MIN_VALUE;
        return this.f7895c.c(null, this);
    }
}
