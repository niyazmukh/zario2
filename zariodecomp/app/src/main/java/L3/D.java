package L3;

import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\L3\D.1.smali */
public final class D extends Q3.i implements X3.p {

    /* renamed from: b, reason: collision with root package name */
    public Object f2327b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f2328c;

    /* renamed from: d, reason: collision with root package name */
    public int f2329d;

    /* renamed from: e, reason: collision with root package name */
    public int f2330e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f2331f;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2332k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2333l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Iterator f2334m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(int i, int i5, Iterator it, O3.d dVar) {
        super(dVar);
        this.f2332k = i;
        this.f2333l = i5;
        this.f2334m = it;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        D d5 = new D(this.f2332k, this.f2333l, this.f2334m, dVar);
        d5.f2331f = obj;
        return d5;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((D) create((d4.f) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0144  */
    @Override // Q3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.D.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
