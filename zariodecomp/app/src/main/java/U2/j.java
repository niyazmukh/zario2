package U2;

import java.time.LocalDate;
import s3.J;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\U2\j.smali */
public final class j extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public l f3358a;

    /* renamed from: b, reason: collision with root package name */
    public LocalDate f3359b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3360c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3361d;

    /* renamed from: e, reason: collision with root package name */
    public J f3362e;

    /* renamed from: f, reason: collision with root package name */
    public long f3363f;

    /* renamed from: k, reason: collision with root package name */
    public long f3364k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f3365l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l f3366m;

    /* renamed from: n, reason: collision with root package name */
    public int f3367n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, Q3.c cVar) {
        super(cVar);
        this.f3366m = lVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3365l = obj;
        this.f3367n |= Integer.MIN_VALUE;
        return this.f3366m.g(0L, null, this);
    }
}
