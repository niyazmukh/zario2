package T2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T2\h.smali */
public final class h extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.p f3225a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3226b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f3227c;

    /* renamed from: d, reason: collision with root package name */
    public int f3228d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(u uVar, Q3.c cVar) {
        super(cVar);
        this.f3227c = uVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3226b = obj;
        this.f3228d |= Integer.MIN_VALUE;
        return this.f3227c.b(this);
    }
}
