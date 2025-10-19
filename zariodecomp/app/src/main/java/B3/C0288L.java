package b3;

/* renamed from: b3.L, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\L.smali */
public final class C0288L extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public C0294S f5159a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5160b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5161c;

    /* renamed from: d, reason: collision with root package name */
    public long f5162d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f5163e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0294S f5164f;

    /* renamed from: k, reason: collision with root package name */
    public int f5165k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0288L(C0294S c0294s, Q3.c cVar) {
        super(cVar);
        this.f5164f = c0294s;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f5163e = obj;
        this.f5165k |= Integer.MIN_VALUE;
        return this.f5164f.e(null, 0L, 0L, 0L, null, null, this);
    }
}
