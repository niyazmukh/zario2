package W;

import java.io.Serializable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\D.smali */
public final class D extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f3479a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3480b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f3481c;

    /* renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.r f3482d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3483e;

    /* renamed from: f, reason: collision with root package name */
    public int f3484f;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f3485k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O f3486l;

    /* renamed from: m, reason: collision with root package name */
    public int f3487m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(O o5, Q3.c cVar) {
        super(cVar);
        this.f3486l = o5;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3485k = obj;
        this.f3487m |= Integer.MIN_VALUE;
        return O.e(this.f3486l, false, this);
    }
}
