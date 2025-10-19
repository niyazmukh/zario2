package m3;

import f4.C;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m3.1\n.smali */
public final class n extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public V2.n f8875a;

    /* renamed from: b, reason: collision with root package name */
    public Long f8876b;

    /* renamed from: c, reason: collision with root package name */
    public long f8877c;

    /* renamed from: d, reason: collision with root package name */
    public long f8878d;

    /* renamed from: e, reason: collision with root package name */
    public int f8879e;

    /* renamed from: f, reason: collision with root package name */
    public int f8880f;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q f8881k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, O3.d dVar) {
        super(2, dVar);
        this.f8881k = qVar;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new n(this.f8881k, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    @Override // Q3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
