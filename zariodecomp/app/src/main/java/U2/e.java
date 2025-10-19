package U2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\U2\e.smali */
public final class e extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public l f3323a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3324b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f3325c;

    /* renamed from: d, reason: collision with root package name */
    public int f3326d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l lVar, Q3.c cVar) {
        super(cVar);
        this.f3325c = lVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3324b = obj;
        this.f3326d |= Integer.MIN_VALUE;
        return this.f3325c.b(false, this);
    }
}
