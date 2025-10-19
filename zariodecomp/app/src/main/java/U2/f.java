package U2;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\U2\f.smali */
public final class f extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public l f3327a;

    /* renamed from: b, reason: collision with root package name */
    public ZoneId f3328b;

    /* renamed from: c, reason: collision with root package name */
    public LocalDate f3329c;

    /* renamed from: d, reason: collision with root package name */
    public List f3330d;

    /* renamed from: e, reason: collision with root package name */
    public int f3331e;

    /* renamed from: f, reason: collision with root package name */
    public int f3332f;

    /* renamed from: k, reason: collision with root package name */
    public long f3333k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f3334l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l f3335m;

    /* renamed from: n, reason: collision with root package name */
    public int f3336n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l lVar, Q3.c cVar) {
        super(cVar);
        this.f3335m = lVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f3334l = obj;
        this.f3336n |= Integer.MIN_VALUE;
        return this.f3335m.c(0, this);
    }
}
