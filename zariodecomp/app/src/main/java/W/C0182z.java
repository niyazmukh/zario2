package W;

/* renamed from: W.z, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\z.1.smali */
public final class C0182z extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public O f3685a;

    /* renamed from: b, reason: collision with root package name */
    public int f3686b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3687c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f3688d;

    /* renamed from: e, reason: collision with root package name */
    public int f3689e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0182z(O o5, Q3.c cVar) {
        super(cVar);
        this.f3688d = o5;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3687c = obj;
        this.f3689e |= Integer.MIN_VALUE;
        return this.f3688d.h(this);
    }
}
