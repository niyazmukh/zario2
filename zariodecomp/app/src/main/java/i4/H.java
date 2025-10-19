package i4;

import f4.InterfaceC0506g0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i4\H.smali */
public final class H extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public I f7881a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0613h f7882b;

    /* renamed from: c, reason: collision with root package name */
    public J f7883c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0506g0 f7884d;

    /* renamed from: e, reason: collision with root package name */
    public Object f7885e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f7886f;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ I f7887k;

    /* renamed from: l, reason: collision with root package name */
    public int f7888l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(I i, O3.d dVar) {
        super(dVar);
        this.f7887k = i;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f7886f = obj;
        this.f7888l |= Integer.MIN_VALUE;
        this.f7887k.c(null, this);
        return P3.a.f2678a;
    }
}
