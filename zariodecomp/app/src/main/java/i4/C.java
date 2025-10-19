package i4;

import O3.j;
import f4.A0;
import f4.u0;
import j4.AbstractC0632b;
import j4.AbstractC0636f;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i4\C.smali */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public static final h1.i f7874a = new h1.i("NO_VALUE", 18);

    /* renamed from: b, reason: collision with root package name */
    public static final h1.i f7875b;

    /* renamed from: c, reason: collision with root package name */
    public static final h1.i f7876c;

    static {
        int i = 18;
        f7875b = new h1.i("NONE", i);
        f7876c = new h1.i("PENDING", i);
    }

    public static final B a(int i, int i5, h4.a aVar) {
        if (i < 0) {
            throw new IllegalArgumentException(B.a.g(i, "replay cannot be negative, but was ").toString());
        }
        if (i5 < 0) {
            throw new IllegalArgumentException(B.a.g(i5, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i <= 0 && i5 <= 0 && aVar != h4.a.f7766a) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
        }
        int i6 = i5 + i;
        if (i6 < 0) {
            i6 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        return new B(i, i6, aVar);
    }

    public static final I b(Object obj) {
        if (obj == null) {
            obj = AbstractC0632b.f8071b;
        }
        return new I(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(i4.K r4, W.r r5, java.lang.Throwable r6, Q3.c r7) {
        /*
            boolean r0 = r7 instanceof i4.j
            if (r0 == 0) goto L13
            r0 = r7
            i4.j r0 = (i4.j) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            i4.j r0 = new i4.j
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            P3.a r1 = P3.a.f2678a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Throwable r6 = r0.a
            a.AbstractC0183a.m0(r7)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r4 = move-exception
            goto L44
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            a.AbstractC0183a.m0(r7)
            r0.a = r6     // Catch: java.lang.Throwable -> L29
            r0.c = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r5.c(r4, r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L41
            goto L43
        L41:
            K3.k r1 = K3.k.f2288a
        L43:
            return r1
        L44:
            if (r6 == 0) goto L4b
            if (r6 == r4) goto L4b
            N2.AbstractC0156x.c(r4, r6)
        L4b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.C.c(i4.K, W.r, java.lang.Throwable, Q3.c):java.lang.Object");
    }

    public static final void d(Object[] objArr, long j5, Object obj) {
        objArr[((int) j5) & (objArr.length - 1)] = obj;
    }

    public static InterfaceC0612g e(InterfaceC0612g interfaceC0612g, int i) {
        h4.a aVar = h4.a.f7766a;
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(B.a.g(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i == -1) {
            aVar = h4.a.f7767b;
            i = 0;
        }
        boolean z4 = interfaceC0612g instanceof j4.v;
        j jVar = j.f2661a;
        return z4 ? ((j4.v) interfaceC0612g).a(jVar, i, aVar) : new j4.i(interfaceC0612g, jVar, i, aVar);
    }

    public static final Object f(InterfaceC0612g interfaceC0612g, X3.p pVar, Q3.j jVar) {
        int i = r.f7949a;
        Object objC = e(new j4.n(new q(pVar, (O3.d) null), interfaceC0612g, j.f2661a, -2, h4.a.f7766a), 0).c(j4.x.f8128a, jVar);
        P3.a aVar = P3.a.f2678a;
        K3.k kVar = K3.k.f2288a;
        if (objC != aVar) {
            objC = kVar;
        }
        return objC == aVar ? objC : kVar;
    }

    public static final InterfaceC0612g g(InterfaceC0612g interfaceC0612g) {
        if (interfaceC0612g instanceof G) {
            return interfaceC0612g;
        }
        if (!(interfaceC0612g instanceof C0611f)) {
            return new C0611f(interfaceC0612g);
        }
        ((C0611f) interfaceC0612g).getClass();
        return interfaceC0612g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0056, B:29:0x006b, B:31:0x0073, B:20:0x0047, B:24:0x0052), top: B:52:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v5, types: [h4.x] */
    /* JADX WARN: Type inference failed for: r8v7, types: [h4.x] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0085 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(i4.InterfaceC0613h r7, h4.k r8, boolean r9, Q3.c r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof i4.C0614i
            if (r0 == 0) goto L13
            r0 = r10
            i4.i r0 = (i4.C0614i) r0
            int r1 = r0.f7916f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7916f = r1
            goto L18
        L13:
            i4.i r0 = new i4.i
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f7915e
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f7916f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L3f
            if (r2 != r4) goto L37
            boolean r9 = r0.f7914d
            h4.c r7 = r0.f7913c
            h4.x r8 = r0.f7912b
            i4.h r2 = r0.f7911a
            a.AbstractC0183a.m0(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r2
            goto L56
        L35:
            r7 = move-exception
            goto L90
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            boolean r9 = r0.f7914d
            h4.c r7 = r0.f7913c
            h4.x r8 = r0.f7912b
            i4.h r2 = r0.f7911a
            a.AbstractC0183a.m0(r10)     // Catch: java.lang.Throwable -> L35
            goto L6b
        L4b:
            a.AbstractC0183a.m0(r10)
            boolean r10 = r7 instanceof i4.K
            if (r10 != 0) goto Lab
            h4.c r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L56:
            r0.f7911a = r7     // Catch: java.lang.Throwable -> L35
            r0.f7912b = r8     // Catch: java.lang.Throwable -> L35
            r0.f7913c = r10     // Catch: java.lang.Throwable -> L35
            r0.f7914d = r9     // Catch: java.lang.Throwable -> L35
            r0.f7916f = r5     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r10.a(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L67
            return r1
        L67:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L6b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L88
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.f7911a = r2     // Catch: java.lang.Throwable -> L35
            r0.f7912b = r8     // Catch: java.lang.Throwable -> L35
            r0.f7913c = r7     // Catch: java.lang.Throwable -> L35
            r0.f7914d = r9     // Catch: java.lang.Throwable -> L35
            r0.f7916f = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r2.b(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r1) goto L32
            return r1
        L88:
            if (r9 == 0) goto L8d
            r8.cancel(r3)
        L8d:
            K3.k r7 = K3.k.f2288a
            return r7
        L90:
            throw r7     // Catch: java.lang.Throwable -> L91
        L91:
            r10 = move-exception
            if (r9 == 0) goto Laa
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L9b
            r3 = r7
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L9b:
            if (r3 != 0) goto La7
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r3.<init>(r9)
            r3.initCause(r7)
        La7:
            r8.cancel(r3)
        Laa:
            throw r10
        Lab:
            i4.K r7 = (i4.K) r7
            java.lang.Throwable r7 = r7.f7892a
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.C.h(i4.h, h4.k, boolean, Q3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object i(i4.InterfaceC0612g r6, Q3.c r7) {
        /*
            boolean r0 = r7 instanceof i4.t
            if (r0 == 0) goto L13
            r0 = r7
            i4.t r0 = (i4.t) r0
            int r1 = r0.f7955d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7955d = r1
            goto L18
        L13:
            i4.t r0 = new i4.t
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f7954c
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f7955d
            h1.i r3 = j4.AbstractC0632b.f8071b
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            i4.s r6 = r0.f7953b
            kotlin.jvm.internal.r r0 = r0.f7952a
            a.AbstractC0183a.m0(r7)     // Catch: j4.C0631a -> L2d
            goto L5e
        L2d:
            r7 = move-exception
            goto L5a
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            a.AbstractC0183a.m0(r7)
            kotlin.jvm.internal.r r7 = new kotlin.jvm.internal.r
            r7.<init>()
            r7.f8431a = r3
            i4.s r2 = new i4.s
            r5 = 0
            r2.<init>(r7, r5)
            r0.f7952a = r7     // Catch: j4.C0631a -> L56
            r0.f7953b = r2     // Catch: j4.C0631a -> L56
            r0.f7955d = r4     // Catch: j4.C0631a -> L56
            java.lang.Object r6 = r6.c(r2, r0)     // Catch: j4.C0631a -> L56
            if (r6 != r1) goto L54
            goto L62
        L54:
            r0 = r7
            goto L5e
        L56:
            r6 = move-exception
            r0 = r7
            r7 = r6
            r6 = r2
        L5a:
            i4.h r1 = r7.f8069a
            if (r1 != r6) goto L6b
        L5e:
            java.lang.Object r1 = r0.f8431a
            if (r1 == r3) goto L63
        L62:
            return r1
        L63:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Expected at least one element"
            r6.<init>(r7)
            throw r6
        L6b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.C.i(i4.g, Q3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(i4.InterfaceC0612g r5, Q3.c r6) {
        /*
            boolean r0 = r6 instanceof i4.u
            if (r0 == 0) goto L13
            r0 = r6
            i4.u r0 = (i4.u) r0
            int r1 = r0.f7959d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7959d = r1
            goto L18
        L13:
            i4.u r0 = new i4.u
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f7958c
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f7959d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            i4.s r5 = r0.f7957b
            kotlin.jvm.internal.r r0 = r0.f7956a
            a.AbstractC0183a.m0(r6)     // Catch: j4.C0631a -> L2b
            goto L5a
        L2b:
            r6 = move-exception
            goto L56
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            a.AbstractC0183a.m0(r6)
            kotlin.jvm.internal.r r6 = new kotlin.jvm.internal.r
            r6.<init>()
            i4.s r2 = new i4.s
            r4 = 1
            r2.<init>(r6, r4)
            r0.f7956a = r6     // Catch: j4.C0631a -> L52
            r0.f7957b = r2     // Catch: j4.C0631a -> L52
            r0.f7959d = r3     // Catch: j4.C0631a -> L52
            java.lang.Object r5 = r5.c(r2, r0)     // Catch: j4.C0631a -> L52
            if (r5 != r1) goto L50
            goto L5c
        L50:
            r0 = r6
            goto L5a
        L52:
            r5 = move-exception
            r0 = r6
            r6 = r5
            r5 = r2
        L56:
            i4.h r1 = r6.f8069a
            if (r1 != r5) goto L5d
        L5a:
            java.lang.Object r1 = r0.f8431a
        L5c:
            return r1
        L5d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.C.j(i4.g, Q3.c):java.lang.Object");
    }

    public static final InterfaceC0612g k(y yVar, O3.i iVar, int i, h4.a aVar) {
        return ((i == 0 || i == -3) && aVar == h4.a.f7766a) ? yVar : new j4.i(yVar, iVar, i, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final x l(InterfaceC0612g interfaceC0612g, f4.C c5, Object obj) {
        S0.l lVar;
        AbstractC0636f abstractC0636f;
        InterfaceC0612g interfaceC0612gE;
        int i = 9;
        Object obj2 = E.f7879a;
        h4.k.f7814j.getClass();
        h4.j jVar = h4.j.f7812a;
        if (!(interfaceC0612g instanceof AbstractC0636f) || (interfaceC0612gE = (abstractC0636f = (AbstractC0636f) interfaceC0612g).e()) == null) {
            h4.a aVar = h4.a.f7766a;
            lVar = new S0.l(i, interfaceC0612g, j.f2661a);
        } else {
            int i5 = abstractC0636f.f8081b;
            if (i5 == -3 || i5 == -2 || i5 == 0) {
                h4.a aVar2 = h4.a.f7766a;
            }
            lVar = new S0.l(i, interfaceC0612gE, abstractC0636f.f8080a);
        }
        I iB = b(obj);
        f4.D d5 = obj2.equals(obj2) ? f4.D.f7002a : f4.D.f7005d;
        v vVar = new v((InterfaceC0612g) lVar.f2867b, iB, obj, null);
        O3.i iVarU = f4.E.u(c5, (O3.i) lVar.f2868c);
        f4.a u0Var = d5 == f4.D.f7003b ? new u0(iVarU, vVar) : new A0(iVarU, true);
        u0Var.T(d5, u0Var, vVar);
        return new x(iB);
    }
}
