package i4;

/* renamed from: i4.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i4\d.1.smali */
public final class C0609d extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7903a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0610e f7904b;

    /* renamed from: c, reason: collision with root package name */
    public int f7905c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0609d(C0610e c0610e, O3.d dVar) {
        super(dVar);
        this.f7904b = c0610e;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f7903a = obj;
        this.f7905c |= Integer.MIN_VALUE;
        return this.f7904b.b(null, this);
    }
}
