package i4;

import f4.InterfaceC0506g0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i4\A.smali */
public final class A extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public B f7859a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0613h f7860b;

    /* renamed from: c, reason: collision with root package name */
    public D f7861c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0506g0 f7862d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f7863e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ B f7864f;

    /* renamed from: k, reason: collision with root package name */
    public int f7865k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(B b5, O3.d dVar) {
        super(dVar);
        this.f7864f = b5;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f7863e = obj;
        this.f7865k |= Integer.MIN_VALUE;
        B.L(this.f7864f, null, this);
        return P3.a.f2678a;
    }
}
