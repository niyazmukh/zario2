package A2;

import N2.n0;
import a.AbstractC0183a;
import android.util.Log;
import android.view.View;
import com.google.android.gms.tasks.TaskCompletionSource;
import g0.C0552d;
import g0.C0556h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import x2.C1038d;

/* renamed from: A2.m, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\m.1.smali */
public final /* synthetic */ class C0013m implements F2.q, I.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f215a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f216b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f217c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f218d;

    public /* synthetic */ C0013m(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f215a = obj;
        this.f216b = obj2;
        this.f217c = obj3;
        this.f218d = obj4;
    }

    public void a(C1038d c1038d) {
        y2.o oVar = (y2.o) this.f215a;
        oVar.getClass();
        if (!((AtomicBoolean) this.f216b).compareAndSet(false, true)) {
            ((F2.f) this.f218d).b(new RunnableC0012l(25, oVar, c1038d));
        } else {
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f217c;
            AbstractC0183a.N(!taskCompletionSource.getTask().isComplete(), "Already fulfilled first user task", new Object[0]);
            taskCompletionSource.setResult(c1038d);
        }
    }

    @Override // I.f
    public void d() {
        C0556h this$0 = (C0556h) this.f216b;
        kotlin.jvm.internal.i.e(this$0, "this$0");
        C0552d animationInfo = (C0552d) this.f217c;
        kotlin.jvm.internal.i.e(animationInfo, "$animationInfo");
        g0.V operation = (g0.V) this.f218d;
        kotlin.jvm.internal.i.e(operation, "$operation");
        View view = (View) this.f215a;
        view.clearAnimation();
        this$0.f7460a.endViewTransition(view);
        animationInfo.d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + operation + " has been cancelled.");
        }
    }

    @Override // F2.q
    public Object get() {
        r rVar = (r) this.f215a;
        HashMap mapH = rVar.f237e.h((HashSet) this.f216b);
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : mapH.entrySet()) {
            if (!((B2.l) entry.getValue()).e()) {
                hashSet.add((B2.h) entry.getKey());
            }
        }
        C0009i c0009i = rVar.f238f;
        c0009i.getClass();
        HashMap map = new HashMap();
        c0009i.Z(map, mapH.keySet());
        HashMap mapY = c0009i.y(mapH, map, new HashSet());
        ArrayList arrayList = new ArrayList();
        List<C2.h> list = (List) this.f217c;
        for (C2.h hVar : list) {
            B2.l lVar = ((F) mapY.get(hVar.f1084a)).f84a;
            B2.m mVar = null;
            for (C2.g gVar : hVar.f1086c) {
                n0 n0VarC = gVar.f1083b.c(lVar.f326e.f(gVar.f1082a));
                if (n0VarC != null) {
                    if (mVar == null) {
                        mVar = new B2.m();
                    }
                    mVar.g(gVar.f1082a, n0VarC);
                }
            }
            if (mVar != null) {
                arrayList.add(new C2.m(hVar.f1084a, mVar, B2.m.c(mVar.b().N()), new C2.n(null, Boolean.TRUE)));
            }
        }
        C2.i iVarD = rVar.f235c.d((l2.o) this.f218d, arrayList, list);
        HashMap map2 = new HashMap();
        Iterator it = iVarD.b().iterator();
        while (it.hasNext()) {
            B2.h hVar2 = (B2.h) it.next();
            B2.l lVar2 = ((F) mapY.get(hVar2)).f84a;
            C2.f fVarA = iVarD.a(lVar2, ((F) mapY.get(hVar2)).f85b);
            if (hashSet.contains(hVar2)) {
                fVarA = null;
            }
            C2.h hVarC = C2.h.c(lVar2, fVarA);
            if (hVarC != null) {
                map2.put(hVar2, hVarC);
            }
            if (!lVar2.e()) {
                lVar2.b(B2.o.f333b);
            }
        }
        InterfaceC0001a interfaceC0001a = rVar.f236d;
        int i = iVarD.f1087a;
        interfaceC0001a.a(i, map2);
        return C0008h.a(i, mapY);
    }
}
