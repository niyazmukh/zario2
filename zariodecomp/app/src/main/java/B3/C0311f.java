package b3;

/* renamed from: b3.f, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\f.1.smali */
public final class C0311f extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public String f5244a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5245b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5246c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5247d;

    /* renamed from: e, reason: collision with root package name */
    public int f5248e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f5249f;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0316k f5250k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f5251l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f5252m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0311f(C0316k c0316k, String str, String str2, O3.d dVar) {
        super(2, dVar);
        this.f5250k = c0316k;
        this.f5251l = str;
        this.f5252m = str2;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        C0311f c0311f = new C0311f(this.f5250k, this.f5251l, this.f5252m, dVar);
        c0311f.f5249f = obj;
        return c0311f;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0311f) create((f4.C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e3 A[Catch: all -> 0x0048, TryCatch #2 {all -> 0x0048, blocks: (B:47:0x00dd, B:49:0x00e3, B:50:0x00ea, B:54:0x00f4, B:46:0x00d9, B:15:0x0044, B:33:0x00ab, B:20:0x0055, B:27:0x007e, B:29:0x0084, B:55:0x00f9, B:56:0x0100, B:23:0x0067), top: B:64:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f3  */
    @Override // Q3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.C0311f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
