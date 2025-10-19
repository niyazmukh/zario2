package b3;

import java.util.List;

/* renamed from: b3.q, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\q.1.smali */
public final class C0322q extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public String f5293a;

    /* renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.q f5294b;

    /* renamed from: c, reason: collision with root package name */
    public int f5295c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f5296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f5297e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0324s f5298f;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f5299k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f5300l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f5301m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f5302n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0322q(String str, long j5, C0324s c0324s, List list, long j6, String str2, String str3, O3.d dVar) {
        super(2, dVar);
        this.f5296d = str;
        this.f5297e = j5;
        this.f5298f = c0324s;
        this.f5299k = list;
        this.f5300l = j6;
        this.f5301m = str2;
        this.f5302n = str3;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0322q(this.f5296d, this.f5297e, this.f5298f, this.f5299k, this.f5300l, this.f5301m, this.f5302n, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0322q) create((f4.C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0223 A[RETURN] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    @Override // Q3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.C0322q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
