package b3;

/* renamed from: b3.j, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\j.1.smali */
public final class C0315j extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public R2.a f5263a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5264b;

    /* renamed from: c, reason: collision with root package name */
    public String f5265c;

    /* renamed from: d, reason: collision with root package name */
    public int f5266d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f5267e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0316k f5268f;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ R2.a f5269k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0315j(C0316k c0316k, R2.a aVar, O3.d dVar) {
        super(2, dVar);
        this.f5268f = c0316k;
        this.f5269k = aVar;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        C0315j c0315j = new C0315j(this.f5268f, this.f5269k, dVar);
        c0315j.f5267e = obj;
        return c0315j;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0315j) create((f4.C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3 A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:43:0x00bd, B:45:0x00c3, B:46:0x00ca, B:42:0x00b8, B:15:0x0036, B:20:0x0049, B:27:0x0070, B:29:0x0076, B:47:0x00e3, B:48:0x00ea, B:23:0x0059), top: B:54:0x0008 }] */
    @Override // Q3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.C0315j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
