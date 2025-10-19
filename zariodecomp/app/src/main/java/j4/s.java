package j4;

import i4.InterfaceC0612g;
import i4.InterfaceC0613h;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j4\s.smali */
public final class s extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public h4.k f8115a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f8116b;

    /* renamed from: c, reason: collision with root package name */
    public int f8117c;

    /* renamed from: d, reason: collision with root package name */
    public int f8118d;

    /* renamed from: e, reason: collision with root package name */
    public int f8119e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f8120f;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0612g[] f8121k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ X3.a f8122l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Q3.j f8123m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0613h f8124n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(InterfaceC0612g[] interfaceC0612gArr, X3.a aVar, X3.q qVar, InterfaceC0613h interfaceC0613h, O3.d dVar) {
        super(2, dVar);
        this.f8121k = interfaceC0612gArr;
        this.f8122l = aVar;
        this.f8123m = (Q3.j) qVar;
        this.f8124n = interfaceC0613h;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        Q3.j jVar = this.f8123m;
        s sVar = new s(this.f8121k, this.f8122l, jVar, this.f8124n, dVar);
        sVar.f8120f = obj;
        return sVar;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((f4.C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e1, code lost:
    
        if (r10 != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e3, code lost:
    
        r13 = (java.lang.Object[]) r20.f8122l.invoke();
        r14 = r20.f8123m;
        r15 = r20.f8124n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ef, code lost:
    
        if (r13 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f1, code lost:
    
        r20.f8120f = r11;
        r20.f8115a = r12;
        r20.f8116b = r2;
        r20.f8117c = r10;
        r20.f8118d = r7;
        r20.f8119e = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0101, code lost:
    
        if (r14.c(r15, r11, r20) != r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0103, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0104, code lost:
    
        L3.i.t0(r11, 0, r13, 0, r11.length);
        r20.f8120f = r11;
        r20.f8115a = r12;
        r20.f8116b = r2;
        r20.f8117c = r10;
        r20.f8118d = r7;
        r20.f8119e = 3;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0119, code lost:
    
        if (r14.c(r15, r13, r20) != r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009f, code lost:
    
        if (r10 != 0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:40:0x00e1, B:34:0x00cf], limit reached: 52 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf A[LOOP:0: B:29:0x00bf->B:52:?, LOOP_START, PHI: r10 r14
  0x00bf: PHI (r10v3 int) = (r10v2 int), (r10v4 int) binds: [B:27:0x00bc, B:52:?] A[DONT_GENERATE, DONT_INLINE]
  0x00bf: PHI (r14v7 L3.v) = (r14v6 L3.v), (r14v13 L3.v) binds: [B:27:0x00bc, B:52:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r12v1, types: [h4.g] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2, types: [h4.k, h4.x] */
    /* JADX WARN: Type inference failed for: r12v3, types: [h4.k, h4.x] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6, types: [h4.k] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0101 -> B:19:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0119 -> B:49:0x011c). Please report as a decompilation issue!!! */
    @Override // Q3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
