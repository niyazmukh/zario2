package W;

import java.io.FileOutputStream;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\X.smali */
public final class X extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public FileOutputStream f3565a;

    /* renamed from: b, reason: collision with root package name */
    public FileOutputStream f3566b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3567c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y f3568d;

    /* renamed from: e, reason: collision with root package name */
    public int f3569e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Y y4, Q3.c cVar) {
        super(cVar);
        this.f3568d = y4;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3567c = obj;
        this.f3569e |= Integer.MIN_VALUE;
        return this.f3568d.b(null, this);
    }
}
