package A2;

import B3.C0063m1;
import E2.AbstractC0101c;
import E2.C0106i;
import E2.EnumC0105h;
import N2.j0;
import N2.n0;
import a.AbstractC0183a;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.util.SparseArray;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.textfield.TextInputLayout;
import com.google.protobuf.AbstractC0409l;
import com.niyaz.zario.ui.history.HistoryFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import k2.InterfaceFutureC0659b;
import k3.C0671l;
import l3.C0733f;
import r2.ThreadFactoryC0860a;
import s2.C0870e;
import x2.C1038d;
import z3.C1084h;
import z3.k0;

/* renamed from: A2.l, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\l.1.smali */
public final /* synthetic */ class RunnableC0012l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f213b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f214c;

    public /* synthetic */ RunnableC0012l(int i, Object obj, Object obj2) {
        this.f212a = i;
        this.f213b = obj;
        this.f214c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws Exception {
        Set<String> setUnmodifiableSet;
        T0.m this$0;
        H2.a aVar;
        int i = 0;
        int i5 = 1;
        switch (this.f212a) {
            case 0:
                r rVar = (r) this.f213b;
                Iterator it = ((ArrayList) this.f214c).iterator();
                while (it.hasNext()) {
                    C0018s c0018s = (C0018s) it.next();
                    int i6 = c0018s.f243a;
                    C0870e c0870e = c0018s.f245c;
                    S0.c cVar = rVar.h;
                    cVar.getClass();
                    Iterator it2 = c0870e.iterator();
                    while (true) {
                        s2.d dVar = (s2.d) it2;
                        if (((Iterator) dVar.f9680b).hasNext()) {
                            C0003c c0003c = new C0003c((B2.h) dVar.next(), i6);
                            cVar.f2847b = ((C0870e) cVar.f2847b).f(c0003c);
                            cVar.f2848c = ((C0870e) cVar.f2848c).f(c0003c);
                        } else {
                            C0870e c0870e2 = c0018s.f246d;
                            Iterator it3 = c0870e2.iterator();
                            while (true) {
                                s2.d dVar2 = (s2.d) it3;
                                if (((Iterator) dVar2.f9680b).hasNext()) {
                                    rVar.f233a.H().m((B2.h) dVar2.next());
                                } else {
                                    Iterator it4 = c0870e2.iterator();
                                    while (true) {
                                        s2.d dVar3 = (s2.d) it4;
                                        if (((Iterator) dVar3.f9680b).hasNext()) {
                                            C0003c c0003c2 = new C0003c((B2.h) dVar3.next(), i6);
                                            cVar.f2847b = ((C0870e) cVar.f2847b).h(c0003c2);
                                            cVar.f2848c = ((C0870e) cVar.f2848c).h(c0003c2);
                                        } else {
                                            if (!c0018s.f244b) {
                                                SparseArray sparseArray = rVar.f240j;
                                                g0 g0Var = (g0) sparseArray.get(i6);
                                                AbstractC0183a.N(g0Var != null ? 1 : i, "Can't set limbo-free snapshot version for unknown target: %s", Integer.valueOf(i6));
                                                B2.o oVar = g0Var.f197e;
                                                g0 g0Var2 = new g0(g0Var.f193a, g0Var.f194b, g0Var.f195c, g0Var.f196d, oVar, oVar, g0Var.f199g, g0Var.h);
                                                sparseArray.put(i6, g0Var2);
                                                if (r.d(g0Var, g0Var2, null)) {
                                                    rVar.i.i(g0Var2);
                                                }
                                            }
                                            i = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return;
            case 1:
                ((r) this.f213b).f235c.g((AbstractC0409l) this.f214c);
                return;
            case 2:
                ((C.b) this.f213b).h((Typeface) this.f214c);
                return;
            case 3:
                C.d dVar4 = (C.d) this.f213b;
                HashMap map = new HashMap();
                z3.a0 a0Var = (z3.a0) this.f214c;
                if (a0Var.f11278b == 0) {
                    setUnmodifiableSet = Collections.emptySet();
                } else {
                    HashSet hashSet = new HashSet(a0Var.f11278b);
                    for (int i7 = 0; i7 < a0Var.f11278b; i7++) {
                        hashSet.add(new String(a0Var.e(i7), 0));
                    }
                    setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
                }
                for (String str : setUnmodifiableSet) {
                    if (C0106i.f1454d.contains(str.toLowerCase(Locale.ENGLISH))) {
                        C1084h c1084h = z3.a0.f11275d;
                        BitSet bitSet = z3.X.f11268d;
                        map.put(str, (String) a0Var.c(new z3.V(str, c1084h)));
                    }
                }
                if (map.isEmpty()) {
                    return;
                }
                AbstractC0101c abstractC0101c = (AbstractC0101c) dVar4.f1048d;
                p1.b.p(1, abstractC0101c.getClass().getSimpleName(), "(%x) Stream received headers: %s", Integer.valueOf(System.identityHashCode(abstractC0101c)), map);
                return;
            case 4:
                C.d dVar5 = (C.d) this.f213b;
                k0 k0Var = (k0) this.f214c;
                boolean zE = k0Var.e();
                AbstractC0101c abstractC0101c2 = (AbstractC0101c) dVar5.f1048d;
                if (zE) {
                    p1.b.p(1, abstractC0101c2.getClass().getSimpleName(), "(%x) Stream closed.", Integer.valueOf(System.identityHashCode(abstractC0101c2)));
                } else {
                    p1.b.p(2, abstractC0101c2.getClass().getSimpleName(), "(%x) Stream closed with status: %s.", Integer.valueOf(System.identityHashCode(abstractC0101c2)), k0Var);
                }
                AbstractC0183a.N(abstractC0101c2.d(), "Can't handle server close on non-started stream!", new Object[0]);
                abstractC0101c2.a(E2.x.f1512e, k0Var);
                return;
            case 5:
                C0063m1 c0063m1 = (C0063m1) this.f213b;
                c0063m1.getClass();
                EnumC0105h enumC0105h = EnumC0105h.f1452b;
                EnumC0105h enumC0105h2 = (EnumC0105h) this.f214c;
                boolean zEquals = enumC0105h2.equals(enumC0105h);
                E2.u uVar = (E2.u) c0063m1.f907g;
                if (zEquals && t.h.a(uVar.f1500a, 2)) {
                    return;
                }
                if (!(enumC0105h2.equals(EnumC0105h.f1451a) && t.h.a(uVar.f1500a, 3)) && c0063m1.f901a) {
                    p1.b.p(1, "RemoteStore", "Restarting streams for network reachability change.", new Object[0]);
                    c0063m1.f();
                    return;
                }
                return;
            case 6:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f213b;
                try {
                    taskCompletionSource.setResult(((Callable) this.f214c).call());
                    return;
                } catch (Exception e5) {
                    taskCompletionSource.setException(e5);
                    throw new RuntimeException(e5);
                }
            case 7:
                Runnable runnable = (Runnable) this.f213b;
                F2.i iVar = (F2.i) this.f214c;
                try {
                    runnable.run();
                    return;
                } finally {
                    ((F2.h) iVar).f1708a.release();
                }
            case 8:
                F2.p pVar = (F2.p) this.f213b;
                pVar.getClass();
                pVar.f1733g = new Date().getTime();
                ((Runnable) this.f214c).run();
                return;
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                F2.r rVar2 = (F2.r) this.f213b;
                rVar2.getClass();
                ((Runnable) this.f214c).run();
                rVar2.f1735b.release();
                return;
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                K0.f fVar = (K0.f) this.f213b;
                S0.j jVar = (S0.j) this.f214c;
                synchronized (fVar.f2144k) {
                    try {
                        Iterator it5 = fVar.f2143j.iterator();
                        while (it5.hasNext()) {
                            ((K0.c) it5.next()).c(jVar, false);
                        }
                    } finally {
                    }
                }
                return;
            case 11:
                K0.u uVar2 = (K0.u) this.f213b;
                U0.k kVar = (U0.k) this.f214c;
                if (uVar2.f2205u.f3290a instanceof U0.a) {
                    kVar.cancel(true);
                    return;
                }
                return;
            case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                Q this$02 = (Q) this.f213b;
                kotlin.jvm.internal.i.e(this$02, "this$0");
                K0.l token = (K0.l) this.f214c;
                kotlin.jvm.internal.i.e(token, "$token");
                ((S0.l) this$02.f126c).F(token, 3);
                return;
            case 13:
                List listenersList = (List) this.f213b;
                kotlin.jvm.internal.i.e(listenersList, "$listenersList");
                Q0.f this$03 = (Q0.f) this.f214c;
                kotlin.jvm.internal.i.e(this$03, "this$0");
                Iterator it6 = listenersList.iterator();
                while (it6.hasNext()) {
                    ((P0.c) it6.next()).a(this$03.f2718e);
                }
                return;
            case 14:
                T0.r rVar3 = (T0.r) this.f213b;
                U0.k kVar2 = (U0.k) this.f214c;
                if (rVar3.f3171a.f3290a instanceof U0.a) {
                    kVar2.cancel(true);
                    return;
                } else {
                    kVar2.l(rVar3.f3174d.getForegroundInfoAsync());
                    return;
                }
            case 15:
                ConstraintTrackingWorker this$04 = (ConstraintTrackingWorker) this.f213b;
                InterfaceFutureC0659b interfaceFutureC0659b = (InterfaceFutureC0659b) this.f214c;
                kotlin.jvm.internal.i.e(this$04, "this$0");
                synchronized (this$04.f4874b) {
                    try {
                        if (this$04.f4875c) {
                            U0.k future = this$04.f4876d;
                            kotlin.jvm.internal.i.d(future, "future");
                            String str2 = W0.a.f3690a;
                            future.j(new J0.p());
                        } else {
                            this$04.f4876d.l(interfaceFutureC0659b);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 16:
                com.google.android.material.datepicker.z zVar = (com.google.android.material.datepicker.z) this.f213b;
                TextInputLayout textInputLayout = zVar.f6042a;
                Context context = textInputLayout.getContext();
                textInputLayout.setError(context.getString(2131886402) + "\n" + String.format(context.getString(2131886404), ((String) this.f214c).replace(' ', (char) 160)) + "\n" + String.format(context.getString(2131886403), zVar.f6044c.format(new Date(com.google.android.material.datepicker.D.d().getTimeInMillis())).replace(' ', (char) 160)));
                zVar.a();
                return;
            case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                Runnable runnable2 = (Runnable) this.f214c;
                this$0 = (T0.m) this.f213b;
                this$0.getClass();
                try {
                    runnable2.run();
                    return;
                } finally {
                }
            case n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                C0733f c0733f = ((HistoryFragment) this.f213b).f6706h0;
                if (c0733f == null) {
                    kotlin.jvm.internal.i.i("todayUsageAdapter");
                    throw null;
                }
                c0733f.f8806e = ((C0671l) this.f214c).i;
                c0733f.f9901a.b();
                return;
            case 19:
                q2.o oVar2 = (q2.o) this.f213b;
                H2.b bVar = (H2.b) this.f214c;
                if (oVar2.f9499b != q2.o.f9497d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (oVar2) {
                    aVar = oVar2.f9498a;
                    oVar2.f9498a = null;
                    oVar2.f9499b = bVar;
                }
                aVar.c(bVar);
                return;
            case 20:
                q2.n nVar = (q2.n) this.f213b;
                H2.b bVar2 = (H2.b) this.f214c;
                synchronized (nVar) {
                    try {
                        if (nVar.b == null) {
                            nVar.a.add(bVar2);
                        } else {
                            nVar.b.add(bVar2.get());
                        }
                    } finally {
                    }
                }
                return;
            case 21:
                ((ProfileInstallerInitializer) this.f213b).getClass();
                r0.g.a(Looper.getMainLooper()).postDelayed(new g.k((Context) this.f214c, i5), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 22:
                ThreadFactoryC0860a threadFactoryC0860a = (ThreadFactoryC0860a) this.f213b;
                Process.setThreadPriority(threadFactoryC0860a.f9611c);
                StrictMode.ThreadPolicy threadPolicy = threadFactoryC0860a.f9612d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                ((Runnable) this.f214c).run();
                return;
            case 23:
                Callable callable = (Callable) this.f213b;
                g1.i iVar2 = (g1.i) this.f214c;
                try {
                    Object objCall = callable.call();
                    r2.h hVar = (r2.h) iVar2.f7594b;
                    hVar.getClass();
                    if (objCall == null) {
                        objCall = r.h.f9560k;
                    }
                    if (r.h.f9559f.i(hVar, null, objCall)) {
                        r.h.d(hVar);
                        return;
                    }
                    return;
                } catch (Exception e6) {
                    iVar2.D(e6);
                    return;
                }
            case 24:
                Runnable command = (Runnable) this.f213b;
                kotlin.jvm.internal.i.e(command, "$command");
                this$0 = (T0.m) this.f214c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                try {
                    command.run();
                    return;
                } finally {
                }
            default:
                y2.o oVar3 = (y2.o) this.f213b;
                AbstractC0183a.N(oVar3.f11127e != null, "SyncEngine not yet initialized", new Object[0]);
                C1038d c1038d = (C1038d) this.f214c;
                p1.b.p(1, "FirestoreClient", "Credential changed. Current user: %s", c1038d.f11025a);
                X2.o oVar4 = oVar3.f11127e;
                boolean zEquals2 = ((C1038d) oVar4.f3856l).equals(c1038d);
                oVar4.f3856l = c1038d;
                if (!zEquals2) {
                    HashMap map2 = (HashMap) oVar4.f3854j;
                    Iterator it7 = map2.entrySet().iterator();
                    while (it7.hasNext()) {
                        Iterator it8 = ((List) ((Map.Entry) it7.next()).getValue()).iterator();
                        while (it8.hasNext()) {
                            ((TaskCompletionSource) it8.next()).setException(new w2.p("'waitForPendingWrites' task is cancelled due to User change.", w2.o.CANCELLED));
                        }
                    }
                    map2.clear();
                    r rVar4 = (r) oVar4.f3847a;
                    List listH = rVar4.f235c.h();
                    rVar4.c(c1038d);
                    RunnableC0010j runnableC0010j = new RunnableC0010j(rVar4, i);
                    S0.f fVar2 = rVar4.f233a;
                    fVar2.W("Start IndexManager", runnableC0010j);
                    fVar2.W("Start MutationQueue", new RunnableC0010j(rVar4, i5));
                    List listH2 = rVar4.f235c.h();
                    C0870e c0870eF = B2.h.f314c;
                    Iterator it9 = Arrays.asList(listH, listH2).iterator();
                    while (it9.hasNext()) {
                        Iterator it10 = ((List) it9.next()).iterator();
                        while (it10.hasNext()) {
                            Iterator it11 = ((C2.i) it10.next()).f1090d.iterator();
                            while (it11.hasNext()) {
                                c0870eF = c0870eF.f(((C2.h) it11.next()).f1084a);
                            }
                        }
                    }
                    oVar4.c(rVar4.f238f.G(c0870eF), null);
                }
                C0063m1 c0063m12 = (C0063m1) oVar4.f3848b;
                if (c0063m12.f901a) {
                    p1.b.p(1, "RemoteStore", "Restarting streams for new credential.", new Object[0]);
                    c0063m12.f();
                    return;
                }
                return;
        }
    }
}
