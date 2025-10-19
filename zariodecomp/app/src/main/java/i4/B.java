package i4;

import com.google.protobuf.AbstractC0417p;
import f4.C0511j;
import f4.C0516n;
import j4.AbstractC0632b;
import j4.AbstractC0633c;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i4\B.smali */
public class B extends AbstractC0417p implements y, InterfaceC0613h, InterfaceC0612g, j4.v {

    /* renamed from: d, reason: collision with root package name */
    public final int f7866d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7867e;

    /* renamed from: f, reason: collision with root package name */
    public final h4.a f7868f;

    /* renamed from: k, reason: collision with root package name */
    public Object[] f7869k;

    /* renamed from: l, reason: collision with root package name */
    public long f7870l;

    /* renamed from: m, reason: collision with root package name */
    public long f7871m;

    /* renamed from: n, reason: collision with root package name */
    public int f7872n;

    /* renamed from: o, reason: collision with root package name */
    public int f7873o;

    public B(int i, int i5, h4.a aVar) {
        this.f7866d = i;
        this.f7867e = i5;
        this.f7868f = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:15:0x0031, B:32:0x0079, B:34:0x0081, B:38:0x0094, B:41:0x009b, B:42:0x009f, B:43:0x00a0, B:22:0x004b), top: B:52:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.protobuf.p] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [i4.B] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [i4.h] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [j4.c] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [i4.D] */
    /* JADX WARN: Type inference failed for: r9v8, types: [i4.D] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ae -> B:16:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void L(i4.B r8, i4.InterfaceC0613h r9, O3.d r10) {
        /*
            boolean r0 = r10 instanceof i4.A
            if (r0 == 0) goto L13
            r0 = r10
            i4.A r0 = (i4.A) r0
            int r1 = r0.f7865k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7865k = r1
            goto L18
        L13:
            i4.A r0 = new i4.A
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f7863e
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f7865k
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L5e
            r8 = 1
            if (r2 == r8) goto L4f
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            f4.g0 r8 = r0.f7862d
            i4.D r9 = r0.f7861c
            i4.h r2 = r0.f7860b
            i4.B r5 = r0.f7859a
            a.AbstractC0183a.m0(r10)     // Catch: java.lang.Throwable -> L38
        L34:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L76
        L38:
            r8 = move-exception
            goto Lb4
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            f4.g0 r8 = r0.f7862d
            i4.D r9 = r0.f7861c
            i4.h r2 = r0.f7860b
            i4.B r5 = r0.f7859a
            a.AbstractC0183a.m0(r10)     // Catch: java.lang.Throwable -> L38
            goto L79
        L4f:
            i4.D r9 = r0.f7861c
            i4.h r8 = r0.f7860b
            i4.B r2 = r0.f7859a
            a.AbstractC0183a.m0(r10)     // Catch: java.lang.Throwable -> L5b
            r10 = r8
            r8 = r2
            goto L6a
        L5b:
            r8 = move-exception
            r5 = r2
            goto Lb4
        L5e:
            a.AbstractC0183a.m0(r10)
            j4.c r10 = r8.d()
            i4.D r10 = (i4.D) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L6a:
            O3.i r2 = r0.getContext()     // Catch: java.lang.Throwable -> Lb1
            f4.B r5 = f4.B.f7000b     // Catch: java.lang.Throwable -> Lb1
            O3.g r2 = r2.get(r5)     // Catch: java.lang.Throwable -> Lb1
            f4.g0 r2 = (f4.InterfaceC0506g0) r2     // Catch: java.lang.Throwable -> Lb1
        L76:
            r5 = r8
            r8 = r2
            r2 = r10
        L79:
            java.lang.Object r10 = r5.U(r9)     // Catch: java.lang.Throwable -> L38
            h1.i r6 = i4.C.f7874a     // Catch: java.lang.Throwable -> L38
            if (r10 != r6) goto L92
            r0.f7859a = r5     // Catch: java.lang.Throwable -> L38
            r0.f7860b = r2     // Catch: java.lang.Throwable -> L38
            r0.f7861c = r9     // Catch: java.lang.Throwable -> L38
            r0.f7862d = r8     // Catch: java.lang.Throwable -> L38
            r0.f7865k = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r5.J(r9, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L79
            return
        L92:
            if (r8 == 0) goto La0
            boolean r6 = r8.isActive()     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L9b
            goto La0
        L9b:
            java.util.concurrent.CancellationException r8 = r8.getCancellationException()     // Catch: java.lang.Throwable -> L38
            throw r8     // Catch: java.lang.Throwable -> L38
        La0:
            r0.f7859a = r5     // Catch: java.lang.Throwable -> L38
            r0.f7860b = r2     // Catch: java.lang.Throwable -> L38
            r0.f7861c = r9     // Catch: java.lang.Throwable -> L38
            r0.f7862d = r8     // Catch: java.lang.Throwable -> L38
            r0.f7865k = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r2.b(r10, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L34
            return
        Lb1:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lb4:
            r5.j(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.B.L(i4.B, i4.h, O3.d):void");
    }

    public final Object J(D d5, A a5) {
        C0516n c0516n = new C0516n(1, p1.b.x(a5));
        c0516n.s();
        synchronized (this) {
            if (T(d5) < 0) {
                d5.f7878b = c0516n;
            } else {
                c0516n.resumeWith(K3.k.f2288a);
            }
        }
        Object objR = c0516n.r();
        return objR == P3.a.f2678a ? objR : K3.k.f2288a;
    }

    public final void K() {
        if (this.f7867e != 0 || this.f7873o > 1) {
            Object[] objArr = this.f7869k;
            kotlin.jvm.internal.i.b(objArr);
            while (this.f7873o > 0) {
                long jP = P();
                int i = this.f7872n;
                int i5 = this.f7873o;
                if (objArr[((int) ((jP + (i + i5)) - 1)) & (objArr.length - 1)] != C.f7874a) {
                    return;
                }
                this.f7873o = i5 - 1;
                C.d(objArr, P() + this.f7872n + this.f7873o, null);
            }
        }
    }

    public final void M() {
        AbstractC0633c[] abstractC0633cArr;
        Object[] objArr = this.f7869k;
        kotlin.jvm.internal.i.b(objArr);
        C.d(objArr, P(), null);
        this.f7872n--;
        long jP = P() + 1;
        if (this.f7870l < jP) {
            this.f7870l = jP;
        }
        if (this.f7871m < jP) {
            if (this.f6562a != 0 && (abstractC0633cArr = (AbstractC0633c[]) this.f6564c) != null) {
                for (AbstractC0633c abstractC0633c : abstractC0633cArr) {
                    if (abstractC0633c != null) {
                        D d5 = (D) abstractC0633c;
                        long j5 = d5.f7877a;
                        if (j5 >= 0 && j5 < jP) {
                            d5.f7877a = jP;
                        }
                    }
                }
            }
            this.f7871m = jP;
        }
    }

    public final void N(Object obj) {
        int i = this.f7872n + this.f7873o;
        Object[] objArrQ = this.f7869k;
        if (objArrQ == null) {
            objArrQ = Q(null, 0, 2);
        } else if (i >= objArrQ.length) {
            objArrQ = Q(objArrQ, i, objArrQ.length * 2);
        }
        C.d(objArrQ, P() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final O3.d[] O(O3.d[] dVarArr) {
        AbstractC0633c[] abstractC0633cArr;
        D d5;
        C0516n c0516n;
        int length = dVarArr.length;
        if (this.f6562a != 0 && (abstractC0633cArr = (AbstractC0633c[]) this.f6564c) != null) {
            int length2 = abstractC0633cArr.length;
            int i = 0;
            dVarArr = dVarArr;
            while (i < length2) {
                AbstractC0633c abstractC0633c = abstractC0633cArr[i];
                if (abstractC0633c != null && (c0516n = (d5 = (D) abstractC0633c).f7878b) != null && T(d5) >= 0) {
                    int length3 = dVarArr.length;
                    dVarArr = dVarArr;
                    if (length >= length3) {
                        ?? CopyOf = Arrays.copyOf(dVarArr, Math.max(2, dVarArr.length * 2));
                        kotlin.jvm.internal.i.d(CopyOf, "copyOf(...)");
                        dVarArr = CopyOf;
                    }
                    dVarArr[length] = c0516n;
                    d5.f7878b = null;
                    length++;
                }
                i++;
                dVarArr = dVarArr;
            }
        }
        return dVarArr;
    }

    public final long P() {
        return Math.min(this.f7871m, this.f7870l);
    }

    public final Object[] Q(Object[] objArr, int i, int i5) {
        if (i5 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i5];
        this.f7869k = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long jP = P();
        for (int i6 = 0; i6 < i; i6++) {
            long j5 = i6 + jP;
            C.d(objArr2, j5, objArr[((int) j5) & (objArr.length - 1)]);
        }
        return objArr2;
    }

    public final boolean R(Object obj) {
        int i;
        boolean z4;
        O3.d[] dVarArrO = AbstractC0632b.f8070a;
        synchronized (this) {
            if (S(obj)) {
                dVarArrO = O(dVarArrO);
                z4 = true;
            } else {
                z4 = false;
            }
        }
        for (O3.d dVar : dVarArrO) {
            if (dVar != null) {
                dVar.resumeWith(K3.k.f2288a);
            }
        }
        return z4;
    }

    public final boolean S(Object obj) {
        int i = this.f6562a;
        int i5 = this.f7866d;
        if (i == 0) {
            if (i5 != 0) {
                N(obj);
                int i6 = this.f7872n + 1;
                this.f7872n = i6;
                if (i6 > i5) {
                    M();
                }
                this.f7871m = P() + this.f7872n;
            }
            return true;
        }
        int i7 = this.f7872n;
        int i8 = this.f7867e;
        if (i7 >= i8 && this.f7871m <= this.f7870l) {
            int iOrdinal = this.f7868f.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return true;
                }
                throw new B0.c();
            }
        }
        N(obj);
        int i9 = this.f7872n + 1;
        this.f7872n = i9;
        if (i9 > i8) {
            M();
        }
        long jP = P() + this.f7872n;
        long j5 = this.f7870l;
        if (((int) (jP - j5)) > i5) {
            V(1 + j5, this.f7871m, P() + this.f7872n, P() + this.f7872n + this.f7873o);
        }
        return true;
    }

    public final long T(D d5) {
        long j5 = d5.f7877a;
        if (j5 < P() + this.f7872n) {
            return j5;
        }
        if (this.f7867e <= 0 && j5 <= P() && this.f7873o != 0) {
            return j5;
        }
        return -1L;
    }

    public final Object U(D d5) {
        Object obj;
        O3.d[] dVarArrW = AbstractC0632b.f8070a;
        synchronized (this) {
            try {
                long jT = T(d5);
                if (jT < 0) {
                    obj = C.f7874a;
                } else {
                    long j5 = d5.f7877a;
                    Object[] objArr = this.f7869k;
                    kotlin.jvm.internal.i.b(objArr);
                    Object obj2 = objArr[((int) jT) & (objArr.length - 1)];
                    if (obj2 instanceof z) {
                        obj2 = ((z) obj2).f7967c;
                    }
                    d5.f7877a = jT + 1;
                    Object obj3 = obj2;
                    dVarArrW = W(j5);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (O3.d dVar : dVarArrW) {
            if (dVar != null) {
                dVar.resumeWith(K3.k.f2288a);
            }
        }
        return obj;
    }

    public final void V(long j5, long j6, long j7, long j8) {
        long jMin = Math.min(j6, j5);
        for (long jP = P(); jP < jMin; jP++) {
            Object[] objArr = this.f7869k;
            kotlin.jvm.internal.i.b(objArr);
            C.d(objArr, jP, null);
        }
        this.f7870l = j5;
        this.f7871m = j6;
        this.f7872n = (int) (j7 - jMin);
        this.f7873o = (int) (j8 - j7);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final O3.d[] W(long r23) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.B.W(long):O3.d[]");
    }

    public final InterfaceC0612g a(O3.i iVar, int i, h4.a aVar) {
        return C.k(this, iVar, i, aVar);
    }

    @Override // i4.InterfaceC0613h
    public final Object b(Object obj, O3.d dVar) {
        O3.d[] dVarArrO;
        z zVar;
        if (R(obj)) {
            return K3.k.f2288a;
        }
        C0516n c0516n = new C0516n(1, p1.b.x(dVar));
        c0516n.s();
        O3.d[] dVarArrO2 = AbstractC0632b.f8070a;
        synchronized (this) {
            try {
                if (S(obj)) {
                    c0516n.resumeWith(K3.k.f2288a);
                    dVarArrO = O(dVarArrO2);
                    zVar = null;
                } else {
                    z zVar2 = new z(this, this.f7872n + this.f7873o + P(), obj, c0516n);
                    N(zVar2);
                    this.f7873o++;
                    if (this.f7867e == 0) {
                        dVarArrO2 = O(dVarArrO2);
                    }
                    dVarArrO = dVarArrO2;
                    zVar = zVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zVar != null) {
            c0516n.v(new C0511j(zVar, 2));
        }
        for (O3.d dVar2 : dVarArrO) {
            if (dVar2 != null) {
                dVar2.resumeWith(K3.k.f2288a);
            }
        }
        Object objR = c0516n.r();
        P3.a aVar = P3.a.f2678a;
        if (objR != aVar) {
            objR = K3.k.f2288a;
        }
        return objR == aVar ? objR : K3.k.f2288a;
    }

    @Override // i4.InterfaceC0612g
    public final Object c(InterfaceC0613h interfaceC0613h, O3.d dVar) {
        L(this, interfaceC0613h, dVar);
        return P3.a.f2678a;
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final AbstractC0633c f() {
        D d5 = new D();
        d5.f7877a = -1L;
        return d5;
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final AbstractC0633c[] g() {
        return new D[2];
    }
}
