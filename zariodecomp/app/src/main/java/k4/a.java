package k4;

import N2.AbstractC0156x;
import f4.C0525y;
import f4.E;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k4\a.smali */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    public static final h1.i f8366b;

    /* renamed from: c, reason: collision with root package name */
    public static final h1.i f8367c;

    /* renamed from: a, reason: collision with root package name */
    public static final h1.i f8365a = new h1.i("CLOSED", 18);

    /* renamed from: d, reason: collision with root package name */
    public static final h1.i f8368d = new h1.i("NO_THREAD_ELEMENTS", 18);

    /* renamed from: e, reason: collision with root package name */
    public static final C0525y f8369e = new C0525y(4);

    /* renamed from: f, reason: collision with root package name */
    public static final C0525y f8370f = new C0525y(5);

    /* renamed from: g, reason: collision with root package name */
    public static final C0525y f8371g = new C0525y(6);

    static {
        int i = 18;
        f8366b = new h1.i("UNDEFINED", i);
        f8367c = new h1.i("REUSABLE_CLAIMED", i);
    }

    public static final void a(X3.l lVar, Object obj, O3.i iVar) {
        B0.c cVarB = b(lVar, obj, null);
        if (cVarB != null) {
            E.o(iVar, cVarB);
        }
    }

    public static final B0.c b(X3.l lVar, Object obj, B0.c cVar) {
        try {
            lVar.invoke(obj);
        } catch (Throwable th) {
            if (cVar == null || cVar.getCause() == th) {
                return new B0.c("Exception in undelivered element handler for " + obj, th);
            }
            AbstractC0156x.c(cVar, th);
        }
        return cVar;
    }

    public static final void c(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(B.a.g(i, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object d(s sVar, long j5, X3.p pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (sVar.f8408c >= j5 && !sVar.d()) {
                return sVar;
            }
            Object obj = b.f8372a.get(sVar);
            h1.i iVar = f8365a;
            if (obj == iVar) {
                return iVar;
            }
            s sVar2 = (s) ((b) obj);
            if (sVar2 == null) {
                sVar2 = (s) pVar.invoke(Long.valueOf(sVar.f8408c + 1), sVar);
                do {
                    atomicReferenceFieldUpdater = b.f8372a;
                    if (atomicReferenceFieldUpdater.compareAndSet(sVar, null, sVar2)) {
                        if (sVar.d()) {
                            sVar.e();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(sVar) == null);
            }
            sVar = sVar2;
        }
    }

    public static final s e(Object obj) {
        if (obj != f8365a) {
            return (s) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void f(O3.i iVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = d.f8375a.iterator();
        while (it.hasNext()) {
            try {
                ((g4.b) it.next()).k(iVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC0156x.c(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            AbstractC0156x.c(th, new e(iVar));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final boolean g(Object obj) {
        return obj == f8365a;
    }

    public static final Object h(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void i(O3.i iVar, Object obj) {
        if (obj == f8368d) {
            return;
        }
        if (!(obj instanceof y)) {
            Object objFold = iVar.fold(null, f8370f);
            kotlin.jvm.internal.i.c(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((v) objFold).a(obj);
            return;
        }
        y yVar = (y) obj;
        v[] vVarArr = yVar.f8419c;
        int length = vVarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            v vVar = vVarArr[length];
            kotlin.jvm.internal.i.b(vVar);
            vVar.a(yVar.f8418b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0086 A[Catch: all -> 0x0065, DONT_GENERATE, TryCatch #2 {all -> 0x0065, blocks: (B:15:0x0045, B:17:0x0053, B:19:0x0059, B:32:0x0089, B:22:0x0067, B:24:0x0075, B:29:0x0080, B:31:0x0086, B:37:0x0096, B:40:0x009f, B:39:0x009c, B:27:0x007b), top: B:52:0x0045, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void j(O3.d r6, java.lang.Object r7) {
        /*
            boolean r0 = r6 instanceof k4.f
            if (r0 == 0) goto La9
            k4.f r6 = (k4.f) r6
            java.lang.Throwable r0 = K3.g.a(r7)
            if (r0 != 0) goto Le
            r1 = r7
            goto L14
        Le:
            f4.x r1 = new f4.x
            r2 = 0
            r1.<init>(r0, r2)
        L14:
            f4.A r0 = r6.f8378d
            Q3.c r2 = r6.f8379e
            O3.i r3 = r2.getContext()
            boolean r3 = r0.m(r3)
            r4 = 1
            if (r3 == 0) goto L30
            r6.f8380f = r1
            r6.f7025c = r4
            O3.i r7 = r2.getContext()
            r0.k(r7, r6)
            goto Lac
        L30:
            f4.Y r0 = f4.C0.a()
            boolean r3 = r0.s()
            if (r3 == 0) goto L42
            r6.f8380f = r1
            r6.f7025c = r4
            r0.p(r6)
            goto Lac
        L42:
            r0.r(r4)
            O3.i r1 = r2.getContext()     // Catch: java.lang.Throwable -> L65
            f4.B r3 = f4.B.f7000b     // Catch: java.lang.Throwable -> L65
            O3.g r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L65
            f4.g0 r1 = (f4.InterfaceC0506g0) r1     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L67
            boolean r3 = r1.isActive()     // Catch: java.lang.Throwable -> L65
            if (r3 != 0) goto L67
            java.util.concurrent.CancellationException r7 = r1.getCancellationException()     // Catch: java.lang.Throwable -> L65
            K3.f r7 = a.AbstractC0183a.v(r7)     // Catch: java.lang.Throwable -> L65
            r6.resumeWith(r7)     // Catch: java.lang.Throwable -> L65
            goto L89
        L65:
            r7 = move-exception
            goto La0
        L67:
            java.lang.Object r1 = r6.f8381k     // Catch: java.lang.Throwable -> L65
            O3.i r3 = r2.getContext()     // Catch: java.lang.Throwable -> L65
            java.lang.Object r1 = n(r3, r1)     // Catch: java.lang.Throwable -> L65
            h1.i r5 = k4.a.f8368d     // Catch: java.lang.Throwable -> L65
            if (r1 == r5) goto L7a
            f4.G0 r5 = f4.E.A(r2, r3, r1)     // Catch: java.lang.Throwable -> L65
            goto L7b
        L7a:
            r5 = 0
        L7b:
            r2.resumeWith(r7)     // Catch: java.lang.Throwable -> L93
            if (r5 == 0) goto L86
            boolean r7 = r5.U()     // Catch: java.lang.Throwable -> L65
            if (r7 == 0) goto L89
        L86:
            i(r3, r1)     // Catch: java.lang.Throwable -> L65
        L89:
            boolean r7 = r0.u()     // Catch: java.lang.Throwable -> L65
            if (r7 != 0) goto L89
        L8f:
            r0.o(r4)
            goto Lac
        L93:
            r7 = move-exception
            if (r5 == 0) goto L9c
            boolean r2 = r5.U()     // Catch: java.lang.Throwable -> L65
            if (r2 == 0) goto L9f
        L9c:
            i(r3, r1)     // Catch: java.lang.Throwable -> L65
        L9f:
            throw r7     // Catch: java.lang.Throwable -> L65
        La0:
            r6.i(r7)     // Catch: java.lang.Throwable -> La4
            goto L8f
        La4:
            r6 = move-exception
            r0.o(r4)
            throw r6
        La9:
            r6.resumeWith(r7)
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.a.j(O3.d, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070 A[PHI: r18
  0x0070: PHI (r18v2 long) = (r18v1 long), (r18v4 long) binds: [B:29:0x0062, B:33:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long k(java.lang.String r22, long r23, long r25, long r27) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.a.k(java.lang.String, long, long, long):long");
    }

    public static int l(String str, int i, int i5, int i6, int i7) {
        if ((i7 & 4) != 0) {
            i5 = 1;
        }
        if ((i7 & 8) != 0) {
            i6 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        return (int) k(str, i, i5, i6);
    }

    public static final Object m(O3.i iVar) {
        Object objFold = iVar.fold(0, f8369e);
        kotlin.jvm.internal.i.b(objFold);
        return objFold;
    }

    public static final Object n(O3.i iVar, Object obj) {
        if (obj == null) {
            obj = m(iVar);
        }
        return obj == 0 ? f8368d : obj instanceof Integer ? iVar.fold(new y(((Number) obj).intValue(), iVar), f8371g) : ((v) obj).b(iVar);
    }
}
