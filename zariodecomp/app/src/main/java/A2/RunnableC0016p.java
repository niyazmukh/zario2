package A2;

import B3.C0063m1;
import a.AbstractC0183a;
import android.view.View;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import g0.C0552d;
import g0.C0556h;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import x2.C1038d;
import y2.C1048A;

/* renamed from: A2.p, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\p.1.smali */
public final /* synthetic */ class RunnableC0016p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f224a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f225b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f226c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f227d;

    public /* synthetic */ RunnableC0016p(Object obj, Object obj2, Object obj3, int i) {
        this.f224a = i;
        this.f225b = obj;
        this.f226c = obj2;
        this.f227d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        switch (this.f224a) {
            case 0:
                r rVar = (r) this.f225b;
                C3.w wVar = rVar.f242l;
                int i = wVar.f1258a;
                wVar.f1258a = i + 2;
                C0023x c0023x = (C0023x) this.f226c;
                c0023x.f256a = i;
                g0 g0Var = new g0((C1048A) this.f227d, i, rVar.f233a.H().j(), H.f89a);
                c0023x.f257b = g0Var;
                rVar.i.g(g0Var);
                return;
            case 1:
                y2.l lVar = (y2.l) this.f225b;
                Executor executor = (Executor) this.f226c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f227d;
                try {
                    ((Task) lVar.call()).continueWith(executor, new C0004d(taskCompletionSource, 4));
                    return;
                } catch (Exception e5) {
                    taskCompletionSource.setException(e5);
                    return;
                } catch (Throwable th) {
                    taskCompletionSource.setException(new IllegalStateException("Unhandled throwable in callTask.", th));
                    return;
                }
            case 2:
                K0.f fVar = (K0.f) this.f225b;
                U0.k kVar = (U0.k) this.f226c;
                K0.u uVar = (K0.u) this.f227d;
                fVar.getClass();
                try {
                    zBooleanValue = ((Boolean) kVar.get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused) {
                    zBooleanValue = true;
                }
                synchronized (fVar.f2144k) {
                    try {
                        S0.j jVarR = p1.b.r(uVar.f2192d);
                        String str = jVarR.f2862a;
                        if (fVar.c(str) == uVar) {
                            fVar.b(str);
                        }
                        J0.t.d().a(K0.f.f2135l, K0.f.class.getSimpleName() + " " + str + " executed; reschedule = " + zBooleanValue);
                        Iterator it = fVar.f2143j.iterator();
                        while (it.hasNext()) {
                            ((K0.c) it.next()).c(jVarR, zBooleanValue);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 3:
                c0.l lVar2 = (c0.l) this.f225b;
                p1.b bVar = (p1.b) this.f226c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f227d;
                lVar2.getClass();
                try {
                    c0.q qVarU = AbstractC0183a.u(lVar2.f5368a);
                    if (qVarU == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    c0.p pVar = (c0.p) ((c0.h) qVarU.f5354b);
                    synchronized (pVar.f5382d) {
                        pVar.f5384f = threadPoolExecutor;
                    }
                    ((c0.h) qVarU.f5354b).a(new c0.k(bVar, threadPoolExecutor));
                    return;
                } catch (Throwable th3) {
                    bVar.E(th3);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 4:
                ArrayList arrayList = (ArrayList) this.f225b;
                g0.V v4 = (g0.V) this.f226c;
                kotlin.jvm.internal.i.e((C0556h) this.f227d, "this$0");
                if (arrayList.contains(v4)) {
                    arrayList.remove(v4);
                    View view = v4.f7408c.f7512J;
                    int i5 = v4.f7406a;
                    kotlin.jvm.internal.i.d(view, "view");
                    B.a.a(view, i5);
                    return;
                }
                return;
            case 5:
                C0556h this$0 = (C0556h) this.f225b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                C0552d animationInfo = (C0552d) this.f227d;
                kotlin.jvm.internal.i.e(animationInfo, "$animationInfo");
                this$0.f7460a.endViewTransition((View) this.f226c);
                animationInfo.d();
                return;
            default:
                X2.o oVar = ((y2.o) this.f225b).f11127e;
                oVar.b("writeMutations");
                r rVar2 = (r) oVar.f3847a;
                l2.o oVar2 = new l2.o(new Date());
                HashSet hashSet = new HashSet();
                List list = (List) this.f226c;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    hashSet.add(((C2.h) it2.next()).f1084a);
                }
                C0008h c0008h = (C0008h) rVar2.f233a.V("Locally write mutations", new C0013m(rVar2, hashSet, list, oVar2));
                int i6 = c0008h.f200a;
                HashMap map = (HashMap) oVar.i;
                Map map2 = (Map) map.get((C1038d) oVar.f3856l);
                if (map2 == null) {
                    map2 = new HashMap();
                    map.put((C1038d) oVar.f3856l, map2);
                }
                map2.put(Integer.valueOf(i6), (TaskCompletionSource) this.f227d);
                oVar.c(c0008h.f201b, null);
                ((C0063m1) oVar.f3848b).c();
                return;
        }
    }
}
