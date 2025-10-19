package k3;

import java.time.LocalDate;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k3.1\s.smali */
public final class s extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public u f8346a;

    /* renamed from: b, reason: collision with root package name */
    public LocalDate f8347b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f8348c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f8349d;

    /* renamed from: e, reason: collision with root package name */
    public int f8350e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, Q3.c cVar) {
        super(cVar);
        this.f8349d = uVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f8348c = obj;
        this.f8350e |= Integer.MIN_VALUE;
        return u.c(this.f8349d, null, this);
    }
}
