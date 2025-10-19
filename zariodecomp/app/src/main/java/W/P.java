package W;

import java.io.FileInputStream;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\P.smali */
public final class P extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f3539a;

    /* renamed from: b, reason: collision with root package name */
    public FileInputStream f3540b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3541c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f3542d;

    /* renamed from: e, reason: collision with root package name */
    public int f3543e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(Q q5, Q3.c cVar) {
        super(cVar);
        this.f3542d = q5;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3541c = obj;
        this.f3543e |= Integer.MIN_VALUE;
        return Q.a(this.f3542d, this);
    }
}
