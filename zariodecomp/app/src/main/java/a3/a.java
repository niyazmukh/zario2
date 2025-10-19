package A3;

import B3.I1;
import J0.j;
import J0.r;
import J0.t;
import K0.f;
import K0.u;
import N2.j0;
import N2.n0;
import O0.l;
import S0.q;
import T0.g;
import T0.m;
import T0.s;
import U0.k;
import a.AbstractC0183a;
import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import androidx.work.Worker;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import f4.A;
import f4.C0495a0;
import f4.C0516n;
import f4.E;
import g1.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import k2.InterfaceFutureC0659b;
import p2.h;
import t0.C0919d;
import t0.C0920e;
import t0.C0927m;
import t0.C0928n;
import t0.C0930p;
import t0.RunnableC0918c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A3\a.smali */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f264a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f265b;

    /* renamed from: c, reason: collision with root package name */
    public Object f266c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f264a = i;
        this.f265b = obj;
        this.f266c = obj2;
    }

    private final void a() {
        try {
            ((Runnable) this.f265b).run();
            synchronized (((m) this.f266c).f3158b) {
                ((m) this.f266c).a();
            }
        } catch (Throwable th) {
            synchronized (((m) this.f266c).f3158b) {
                ((m) this.f266c).a();
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v86, types: [O3.i, k4.g] */
    @Override // java.lang.Runnable
    public final void run() throws Exception {
        q qVar;
        String str;
        String str2;
        C0930p c0930p;
        int i;
        int[] iArr;
        switch (this.f264a) {
            case 0:
                ((d) this.f265b).f274f.unregisterNetworkCallback((b) this.f266c);
                return;
            case 1:
                ((d) this.f265b).f273e.unregisterReceiver((c) this.f266c);
                return;
            case 2:
                C.b bVar = (C.b) ((i) this.f266c).f7594b;
                if (bVar != null) {
                    bVar.h((Typeface) this.f265b);
                    return;
                }
                return;
            case 3:
                ((J.d) this.f266c).a(this.f265b);
                return;
            case 4:
                C0516n c0516n = (C0516n) this.f266c;
                try {
                    c0516n.resumeWith(((InterfaceFutureC0659b) this.f265b).get());
                    return;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        cause = th;
                    }
                    if (th instanceof CancellationException) {
                        c0516n.n(cause);
                        return;
                    } else {
                        c0516n.resumeWith(AbstractC0183a.v(cause));
                        return;
                    }
                }
            case 5:
                try {
                    ((Worker) this.f265b).getClass();
                    throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
                } catch (Throwable th2) {
                    ((k) this.f266c).k(th2);
                    return;
                }
            case 6:
                if (((u) this.f265b).f2205u.f3290a instanceof U0.a) {
                    return;
                }
                try {
                    ((k) this.f266c).get();
                    t.d().a(u.f2188w, "Starting work for " + ((u) this.f265b).f2192d.f2897c);
                    u uVar = (u) this.f265b;
                    uVar.f2205u.l(uVar.f2193e.startWork());
                    return;
                } catch (Throwable th3) {
                    ((u) this.f265b).f2205u.k(th3);
                    return;
                }
            case 7:
                String str3 = (String) this.f266c;
                u uVar2 = (u) this.f265b;
                try {
                    try {
                        try {
                            r rVar = (r) uVar2.f2205u.get();
                            if (rVar == null) {
                                t.d().b(u.f2188w, uVar2.f2192d.f2897c + " returned a null result. Treating it as a failure.");
                            } else {
                                t.d().a(u.f2188w, uVar2.f2192d.f2897c + " returned a " + rVar + ".");
                                uVar2.f2195k = rVar;
                            }
                        } catch (InterruptedException | ExecutionException e5) {
                            t.d().c(u.f2188w, str3 + " failed because it threw an exception/error", e5);
                        }
                    } catch (CancellationException e6) {
                        t tVarD = t.d();
                        String str4 = u.f2188w;
                        String str5 = str3 + " was cancelled";
                        if (tVarD.f2064a <= 4) {
                            Log.i(str4, str5, e6);
                        }
                    }
                    uVar2.b();
                    return;
                } catch (Throwable th4) {
                    uVar2.b();
                    throw th4;
                }
            case 8:
                t tVarD2 = t.d();
                String str6 = L0.a.f2296e;
                StringBuilder sb = new StringBuilder("Scheduling work ");
                q qVar2 = (q) this.f266c;
                sb.append(qVar2.f2895a);
                tVarD2.a(str6, sb.toString());
                ((L0.a) this.f265b).f2297a.d(qVar2);
                return;
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                f fVar = ((R0.a) this.f265b).f2823a.f2177f;
                String str7 = (String) this.f266c;
                synchronized (fVar.f2144k) {
                    try {
                        u uVarC = fVar.c(str7);
                        qVar = uVarC != null ? uVarC.f2192d : null;
                    } finally {
                    }
                }
                if (qVar == null || !qVar.b()) {
                    return;
                }
                synchronized (((R0.a) this.f265b).f2825c) {
                    ((R0.a) this.f265b).f2828f.put(p1.b.r(qVar), qVar);
                    R0.a aVar = (R0.a) this.f265b;
                    ((R0.a) this.f265b).f2829k.put(p1.b.r(qVar), l.a(aVar.f2830l, qVar, (A) ((S0.i) aVar.f2824b).f2859b, aVar));
                }
                return;
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                synchronized (((g) this.f265b).f3152c) {
                    try {
                        Object objB = ((g) this.f265b).f3153d.b(this.f266c);
                        g gVar = (g) this.f265b;
                        Object obj = gVar.f3150a;
                        if (obj == null && objB != null) {
                            gVar.f3150a = objB;
                            gVar.f3154e.h(objB);
                        } else if (obj != null && !obj.equals(objB)) {
                            g gVar2 = (g) this.f265b;
                            gVar2.f3150a = objB;
                            gVar2.f3154e.h(objB);
                        }
                    } finally {
                    }
                }
                return;
            case 11:
                a();
                return;
            case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                if (((T0.r) this.f265b).f3171a.f3290a instanceof U0.a) {
                    return;
                }
                try {
                    j jVar = (j) ((k) this.f266c).get();
                    if (jVar == null) {
                        throw new IllegalStateException("Worker was marked important (" + ((T0.r) this.f265b).f3173c.f2897c + ") but did not provide ForegroundInfo");
                    }
                    t.d().a(T0.r.f3170k, "Updating notification for " + ((T0.r) this.f265b).f3173c.f2897c);
                    T0.r rVar2 = (T0.r) this.f265b;
                    k kVar = rVar2.f3171a;
                    s sVar = rVar2.f3175e;
                    Context context = rVar2.f3172b;
                    UUID id = rVar2.f3174d.getId();
                    sVar.getClass();
                    k kVar2 = new k();
                    sVar.f3177a.c(new I1(sVar, kVar2, id, jVar, context, 1));
                    kVar.l(kVar2);
                    return;
                } catch (Throwable th5) {
                    ((T0.r) this.f265b).f3171a.k(th5);
                    return;
                }
            case 13:
                ((C0516n) this.f265b).B((C0495a0) this.f266c);
                return;
            case 14:
                ((C0516n) this.f266c).B((g4.d) this.f265b);
                return;
            case 15:
                int i5 = 0;
                while (true) {
                    try {
                        ((Runnable) this.f266c).run();
                    } catch (Throwable th6) {
                        E.o(O3.j.f2661a, th6);
                    }
                    ?? r02 = (k4.g) this.f265b;
                    Runnable runnableO = r02.o();
                    if (runnableO == null) {
                        return;
                    }
                    this.f266c = runnableO;
                    i5++;
                    if (i5 >= 16) {
                        A a5 = r02.f8384d;
                        if (a5.m((O3.i) r02)) {
                            a5.k((O3.i) r02, this);
                            return;
                        }
                    }
                }
            case 16:
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(l2.f.d((String) this.f266c));
                if (firebaseAuth.f6373f != null) {
                    Task taskB = firebaseAuth.b(true);
                    h.f9348f.e("Token refreshing started", new Object[0]);
                    taskB.addOnFailureListener(new h1.i(this));
                    return;
                }
                return;
            default:
                RunnableC0918c runnableC0918c = (RunnableC0918c) this.f265b;
                C0919d c0919d = runnableC0918c.f9964e;
                if (c0919d.f9971g == runnableC0918c.f9962c) {
                    List list = runnableC0918c.f9961b;
                    c0919d.f9969e = list;
                    c0919d.f9970f = Collections.unmodifiableList(list);
                    C0927m c0927m = (C0927m) this.f266c;
                    C0920e c0920e = new C0920e(c0919d.f9965a);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = c0927m.f10062a;
                    int size = arrayList2.size() - 1;
                    int i6 = c0927m.f10066e;
                    int i7 = c0927m.f10067f;
                    while (size >= 0) {
                        C0930p c0930p2 = (C0930p) arrayList2.get(size);
                        int i8 = c0930p2.f10098c;
                        int i9 = c0930p2.f10096a + i8;
                        int i10 = c0930p2.f10097b + i8;
                        int[] iArr2 = c0927m.f10063b;
                        String str8 = "unknown flag for pos ";
                        ArrayList arrayList3 = arrayList2;
                        boolean z4 = c0927m.f10068g;
                        C0919d c0919d2 = c0919d;
                        K2.c cVar = c0927m.f10065d;
                        if (i9 < i6) {
                            int i11 = i6 - i9;
                            if (z4) {
                                int i12 = i11 - 1;
                                while (i12 >= 0) {
                                    RunnableC0918c runnableC0918c2 = runnableC0918c;
                                    int i13 = i9 + i12;
                                    int i14 = iArr2[i13];
                                    int i15 = size;
                                    int i16 = i14 & 31;
                                    if (i16 != 0) {
                                        iArr = iArr2;
                                        if (i16 == 4 || i16 == 8) {
                                            int i17 = i14 >> 5;
                                            c0930p = c0930p2;
                                            i = i8;
                                            C0928n c0928nB = C0927m.b(i17, arrayList, false);
                                            str2 = str8;
                                            c0920e.d(i13, c0928nB.f10074b - 1);
                                            if (i16 == 4) {
                                                int i18 = c0928nB.f10074b - 1;
                                                cVar.s(i13, i17);
                                                c0920e.b(i18, 1);
                                            }
                                        } else {
                                            if (i16 != 16) {
                                                StringBuilder sbN = B.a.n(str8, i13, " ");
                                                sbN.append(Long.toBinaryString(i16));
                                                throw new IllegalStateException(sbN.toString());
                                            }
                                            arrayList.add(new C0928n(i13, i13, true));
                                            str2 = str8;
                                            c0930p = c0930p2;
                                            i = i8;
                                        }
                                    } else {
                                        str2 = str8;
                                        c0930p = c0930p2;
                                        i = i8;
                                        iArr = iArr2;
                                        int i19 = 1;
                                        c0920e.e(i13, 1);
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            ((C0928n) it.next()).f10074b -= i19;
                                            i19 = 1;
                                        }
                                    }
                                    i12--;
                                    runnableC0918c = runnableC0918c2;
                                    c0930p2 = c0930p;
                                    size = i15;
                                    iArr2 = iArr;
                                    i8 = i;
                                    str8 = str2;
                                }
                            } else {
                                c0920e.e(i9, i11);
                            }
                        }
                        RunnableC0918c runnableC0918c3 = runnableC0918c;
                        int i20 = size;
                        String str9 = str8;
                        C0930p c0930p3 = c0930p2;
                        int i21 = i8;
                        int[] iArr3 = iArr2;
                        if (i10 < i7) {
                            int i22 = i7 - i10;
                            if (z4) {
                                int i23 = i22 - 1;
                                while (i23 >= 0) {
                                    int i24 = i10 + i23;
                                    int i25 = c0927m.f10064c[i24];
                                    int i26 = i25 & 31;
                                    if (i26 == 0) {
                                        str = str9;
                                        int i27 = 1;
                                        c0920e.c(i9, 1);
                                        Iterator it2 = arrayList.iterator();
                                        while (it2.hasNext()) {
                                            ((C0928n) it2.next()).f10074b += i27;
                                            i27 = 1;
                                        }
                                    } else if (i26 == 4 || i26 == 8) {
                                        str = str9;
                                        int i28 = i25 >> 5;
                                        c0920e.d(C0927m.b(i28, arrayList, true).f10074b, i9);
                                        if (i26 == 4) {
                                            cVar.s(i28, i24);
                                            c0920e.b(i9, 1);
                                        }
                                    } else {
                                        if (i26 != 16) {
                                            StringBuilder sbN2 = B.a.n(str9, i24, " ");
                                            sbN2.append(Long.toBinaryString(i26));
                                            throw new IllegalStateException(sbN2.toString());
                                        }
                                        arrayList.add(new C0928n(i24, i9, false));
                                        str = str9;
                                    }
                                    i23--;
                                    str9 = str;
                                }
                            } else {
                                c0920e.c(i9, i22);
                            }
                        }
                        int i29 = i21 - 1;
                        while (i29 >= 0) {
                            C0930p c0930p4 = c0930p3;
                            int i30 = c0930p4.f10096a + i29;
                            if ((iArr3[i30] & 31) == 2) {
                                cVar.s(i30, c0930p4.f10097b + i29);
                                c0920e.b(i30, 1);
                            }
                            i29--;
                            c0930p3 = c0930p4;
                        }
                        C0930p c0930p5 = c0930p3;
                        i6 = c0930p5.f10096a;
                        i7 = c0930p5.f10097b;
                        size = i20 - 1;
                        arrayList2 = arrayList3;
                        c0919d = c0919d2;
                        runnableC0918c = runnableC0918c3;
                    }
                    c0920e.a();
                    c0919d.a(runnableC0918c.f9963d);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ a(int i, Object obj, Object obj2, boolean z4) {
        this.f264a = i;
        this.f266c = obj;
        this.f265b = obj2;
    }

    public a(h hVar, String str) {
        this.f264a = 16;
        Objects.requireNonNull(hVar);
        this.f265b = hVar;
        C.d(str);
        this.f266c = str;
    }
}
