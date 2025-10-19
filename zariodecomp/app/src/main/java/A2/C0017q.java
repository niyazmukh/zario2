package A2;

import B3.C0043g;
import B3.C0063m1;
import B3.InterfaceC0091x;
import N2.C0143g;
import a.AbstractC0183a;
import android.util.SparseArray;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.protobuf.AbstractC0409l;
import com.google.protobuf.C0407k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import z3.AbstractC1081e;
import z3.AbstractC1083g;
import z3.C1079c;
import z3.C1091o;
import z3.k0;

/* renamed from: A2.q, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\q.1.smali */
public final /* synthetic */ class C0017q implements F2.q, OnCompleteListener, w2.F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f228a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f229b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f230c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f231d;

    public /* synthetic */ C0017q(Object obj, Object obj2, Object obj3, int i) {
        this.f228a = i;
        this.f229b = obj;
        this.f230c = obj2;
        this.f231d = obj3;
    }

    @Override // w2.F
    public void a(G g3) {
        int i = 0;
        for (Object obj : (List) this.f229b) {
            int i5 = i + 1;
            if (i < 0) {
                L3.k.Z();
                throw null;
            }
            Map map = (Map) obj;
            g3.j(((w2.g) this.f231d).a("hourly_usage").b(r1.d.b((String) this.f230c, map, i)), map, w2.B.f10913b);
            i = i5;
        }
    }

    @Override // F2.q
    public Object get() {
        f0 f0Var;
        r rVar;
        long j5;
        Iterator it;
        r rVar2 = (r) this.f229b;
        C2.j jVar = (C2.j) this.f230c;
        S0.f fVar = rVar2.f233a;
        long j6 = fVar.H().j();
        Iterator it2 = ((Map) jVar.f1092b).entrySet().iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            f0Var = rVar2.i;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            Integer num = (Integer) entry.getKey();
            int iIntValue = num.intValue();
            E2.z zVar = (E2.z) entry.getValue();
            SparseArray sparseArray = rVar2.f240j;
            g0 g0Var = (g0) sparseArray.get(iIntValue);
            if (g0Var != null) {
                f0Var.e(zVar.f1519e, iIntValue);
                f0Var.b(zVar.f1517c, iIntValue);
                g0 g0VarB = g0Var.b(j6);
                if (((Map) jVar.f1094d).containsKey(num)) {
                    C0407k c0407k = AbstractC0409l.f6528b;
                    B2.o oVar = B2.o.f333b;
                    g0 g0VarA = g0VarB.a(c0407k, oVar);
                    j5 = j6;
                    it = it2;
                    rVar = rVar2;
                    g0VarB = new g0(g0VarA.f193a, g0VarA.f194b, g0VarA.f195c, g0VarA.f196d, g0VarA.f197e, oVar, g0VarA.f199g, null);
                } else {
                    rVar = rVar2;
                    j5 = j6;
                    it = it2;
                    AbstractC0409l abstractC0409l = zVar.f1515a;
                    if (!abstractC0409l.isEmpty()) {
                        g0VarB = g0VarB.a(abstractC0409l, (B2.o) jVar.f1093c);
                    }
                }
                sparseArray.put(iIntValue, g0VarB);
                if (r.d(g0Var, g0VarB, zVar)) {
                    f0Var.i(g0VarB);
                }
                j6 = j5;
                it2 = it;
                rVar2 = rVar;
            }
        }
        r rVar3 = rVar2;
        Map map = (Map) jVar.f1095e;
        for (B2.h hVar : map.keySet()) {
            if (((Set) jVar.f1096f).contains(hVar)) {
                fVar.H().g(hVar);
            }
        }
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Set setKeySet = map.keySet();
        J j7 = rVar3.f237e;
        HashMap mapH = j7.h(setKeySet);
        Iterator it3 = map.entrySet().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) it3.next();
            B2.h hVar2 = (B2.h) entry2.getKey();
            B2.l lVar = (B2.l) entry2.getValue();
            B2.l lVar2 = (B2.l) mapH.get(hVar2);
            if (lVar.d() != lVar2.d()) {
                hashSet.add(hVar2);
            }
            if (t.h.a(lVar.f323b, 3) && lVar.f324c.equals(B2.o.f333b)) {
                arrayList.add(lVar.f322a);
                map2.put(hVar2, lVar);
            } else if (!lVar2.e() || lVar.f324c.compareTo(lVar2.f324c) > 0 || (lVar.f324c.compareTo(lVar2.f324c) == 0 && (lVar2.c() || t.h.a(lVar2.f327f, 2)))) {
                AbstractC0183a.N(true ^ B2.o.f333b.equals(lVar.f325d), "Cannot add a document when the remote version is zero", new Object[0]);
                j7.g(lVar, lVar.f325d);
                map2.put(hVar2, lVar);
            } else {
                p1.b.p(1, "LocalStore", "Ignoring outdated watch update for %s.Current version: %s  Watch version: %s", hVar2, lVar2.f324c, lVar.f324c);
            }
        }
        j7.a(arrayList);
        B2.o oVarD = f0Var.d();
        B2.o oVar2 = B2.o.f333b;
        B2.o oVar3 = (B2.o) this.f231d;
        if (!oVar3.equals(oVar2)) {
            AbstractC0183a.N(oVar3.compareTo(oVarD) >= 0, "Watch stream reverted to previous snapshot?? (%s < %s)", oVar3, oVarD);
            f0Var.f(oVar3);
        }
        return rVar3.f238f.L(map2, hashSet);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f228a) {
            case 1:
                z3.a0 a0Var = new z3.a0();
                Task task2 = (Task) this.f229b;
                boolean zIsSuccessful = task2.isSuccessful();
                C0063m1 c0063m1 = (C0063m1) this.f230c;
                if (zIsSuccessful) {
                    String str = (String) task2.getResult();
                    p1.b.p(1, "FirestoreCallCredentials", "Successfully fetched auth token.", new Object[0]);
                    if (str != null) {
                        a0Var.f(E2.l.f1467c, "Bearer ".concat(str));
                    }
                } else {
                    Exception exception = task2.getException();
                    if (exception instanceof l2.b) {
                        p1.b.p(1, "FirestoreCallCredentials", "Firebase Auth API not available, not using authentication.", new Object[0]);
                    } else {
                        if (!(exception instanceof J2.a)) {
                            p1.b.p(2, "FirestoreCallCredentials", "Failed to get auth token: %s.", exception);
                            c0063m1.b(k0.f11351j.f(exception));
                            return;
                        }
                        p1.b.p(1, "FirestoreCallCredentials", "No user signed in, not using authentication.", new Object[0]);
                    }
                }
                Task task3 = (Task) this.f231d;
                if (task3.isSuccessful()) {
                    String str2 = (String) task3.getResult();
                    if (str2 != null && !str2.isEmpty()) {
                        p1.b.p(1, "FirestoreCallCredentials", "Successfully fetched AppCheck token.", new Object[0]);
                        a0Var.f(E2.l.f1468d, str2);
                    }
                } else {
                    Exception exception2 = task3.getException();
                    if (!(exception2 instanceof l2.b)) {
                        p1.b.p(2, "FirestoreCallCredentials", "Failed to get AppCheck token: %s.", exception2);
                        c0063m1.b(k0.f11351j.f(exception2));
                        return;
                    }
                    p1.b.p(1, "FirestoreCallCredentials", "Firebase AppCheck API not available.", new Object[0]);
                }
                S0.f.q("apply() or fail() already called", !c0063m1.f901a);
                z3.a0 a0Var2 = (z3.a0) c0063m1.f904d;
                a0Var2.d(a0Var);
                C1091o c1091o = (C1091o) c0063m1.f906f;
                C1091o c1091oA = c1091o.a();
                try {
                    InterfaceC0091x interfaceC0091xF = ((B3.A) c0063m1.f902b).f((com.google.android.gms.common.api.internal.F) c0063m1.f903c, a0Var2, (C1079c) c0063m1.f905e, (AbstractC1083g[]) c0063m1.h);
                    c1091o.c(c1091oA);
                    c0063m1.d(interfaceC0091xF);
                    return;
                } catch (Throwable th) {
                    c1091o.c(c1091oA);
                    throw th;
                }
            case 2:
                E2.q qVar = (E2.q) this.f229b;
                qVar.getClass();
                AbstractC1081e abstractC1081e = (AbstractC1081e) task.getResult();
                abstractC1081e.e(new E2.p(qVar, (TaskCompletionSource) this.f230c), qVar.a());
                abstractC1081e.c(2);
                abstractC1081e.d((C0143g) this.f231d);
                abstractC1081e.b();
                return;
            default:
                E2.q qVar2 = (E2.q) this.f229b;
                qVar2.getClass();
                AbstractC1081e abstractC1081e2 = (AbstractC1081e) task.getResult();
                AbstractC1081e[] abstractC1081eArr = (AbstractC1081e[]) this.f230c;
                abstractC1081eArr[0] = abstractC1081e2;
                C.d dVar = (C.d) this.f231d;
                abstractC1081e2.e(new E2.m(qVar2, dVar, abstractC1081eArr), qVar2.a());
                ((C0043g) dVar.f1047c).h(new RunnableC0005e(dVar, 6));
                abstractC1081eArr[0].c(1);
                return;
        }
    }
}
