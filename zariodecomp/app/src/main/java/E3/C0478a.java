package e3;

/* renamed from: e3.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e3.1\a.smali */
public final class C0478a extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6886a;

    /* renamed from: b, reason: collision with root package name */
    public int f6887b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O0.j f6888c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0478a(O0.j jVar, O3.d dVar) {
        super(dVar);
        this.f6888c = jVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f6886a = obj;
        this.f6887b |= Integer.MIN_VALUE;
        return this.f6888c.b(null, this);
    }
}
