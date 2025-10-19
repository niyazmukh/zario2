package W;

import f4.C0521u;

/* renamed from: W.w, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\w.1.smali */
public final class C0179w extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f3672a;

    /* renamed from: b, reason: collision with root package name */
    public O f3673b;

    /* renamed from: c, reason: collision with root package name */
    public C0521u f3674c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f3675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ O f3676e;

    /* renamed from: f, reason: collision with root package name */
    public int f3677f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0179w(O o5, Q3.c cVar) {
        super(cVar);
        this.f3676e = o5;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3675d = obj;
        this.f3677f |= Integer.MIN_VALUE;
        return O.b(this.f3676e, null, this);
    }
}
