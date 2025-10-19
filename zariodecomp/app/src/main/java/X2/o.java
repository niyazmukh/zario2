package X2;

import A2.C0002b;
import A2.C0003c;
import A2.C0017q;
import A2.C0018s;
import A2.C0020u;
import A2.H;
import A2.RunnableC0012l;
import A2.RunnableC0015o;
import A2.g0;
import A2.r;
import B3.C0063m1;
import C3.w;
import C3.x;
import E2.z;
import S0.s;
import a.AbstractC0183a;
import android.database.Cursor;
import android.os.CancellationSignal;
import b3.C0300Y;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.niyaz.zario.data.local.AppDatabase_Impl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import q.C0828e;
import s2.AbstractC0869c;
import s2.C0870e;
import u0.AbstractC0967h;
import u0.C0955C;
import x2.C1038d;
import y2.C1048A;
import y2.C1050C;
import y2.C1051D;
import y2.C1057f;
import y2.v;
import z2.C1071b;
import z3.j0;
import z3.k0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\X2\o.smali */
public final class o implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3847a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3848b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3849c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3850d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3851e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3852f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3853g;
    public final Object h;
    public final Object i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f3854j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f3855k;

    /* renamed from: l, reason: collision with root package name */
    public Object f3856l;

    /* renamed from: m, reason: collision with root package name */
    public Object f3857m;

    public o(AppDatabase_Impl appDatabase_Impl) {
        this.f3851e = new X1.e();
        this.f3847a = appDatabase_Impl;
        this.f3848b = new S0.b(appDatabase_Impl, 9);
        this.f3849c = new S0.b(appDatabase_Impl, 10);
        this.f3850d = new m(this, appDatabase_Impl);
        this.f3852f = new s(appDatabase_Impl, 1);
        this.f3853g = new s(appDatabase_Impl, 2);
        this.h = new s(appDatabase_Impl, 3);
        this.i = new n(this, appDatabase_Impl);
        this.f3854j = new S0.h(appDatabase_Impl, 23);
        this.f3855k = new S0.h(appDatabase_Impl, 24);
        this.f3856l = new S0.h(appDatabase_Impl, 21);
        this.f3857m = new S0.h(appDatabase_Impl, 22);
    }

    public static void g(k0 k0Var, String str, Object... objArr) {
        j0 j0Var = k0Var.f11358a;
        String str2 = k0Var.f11359b;
        if (str2 == null) {
            str2 = "";
        }
        if ((j0Var == j0.FAILED_PRECONDITION && str2.contains("requires an index")) || j0Var == j0.PERMISSION_DENIED) {
            p1.b.p(2, "Firestore", "%s: %s", String.format(str, objArr), k0Var);
        }
    }

    public void a(C0828e c0828e) {
        ArrayList arrayList;
        Object objV;
        Y2.e eVar;
        if (c0828e.f() == 0) {
            return;
        }
        if (c0828e.f() > 999) {
            C0828e c0828e2 = new C0828e(999);
            int iF = c0828e.f();
            int i = 0;
            int i5 = 0;
            while (i < iF) {
                c0828e2.e(c0828e.g(i), c0828e.d(i));
                i++;
                i5++;
                if (i5 == 999) {
                    a(c0828e2);
                    c0828e2.a();
                    i5 = 0;
                }
            }
            if (i5 > 0) {
                a(c0828e2);
                return;
            }
            return;
        }
        StringBuilder sbB = t.h.b("SELECT `id`,`parentCycleId`,`userId`,`userEmail`,`planLabel`,`cycleStartTime`,`hourStartTime`,`hourEndTime`,`packageName`,`usageMs`,`syncType`,`attempts`,`lastAttemptAt`,`createdAt` FROM `pending_hourly_sync` WHERE `parentCycleId` IN (");
        int iF2 = c0828e.f();
        u0.o.a(iF2, sbB);
        sbB.append(")");
        C0955C c0955cK = C0955C.k(iF2, sbB.toString());
        int i6 = 1;
        for (int i7 = 0; i7 < c0828e.f(); i7++) {
            c0955cK.d(i6, c0828e.d(i7));
            i6++;
        }
        Cursor cursorF = AbstractC0967h.f((AppDatabase_Impl) this.f3847a, c0955cK, false);
        try {
            int iF3 = C1071b.f(cursorF, "parentCycleId");
            if (iF3 == -1) {
                return;
            }
            while (cursorF.moveToNext()) {
                Long lValueOf = cursorF.isNull(iF3) ? null : Long.valueOf(cursorF.getLong(iF3));
                if (lValueOf != null && (arrayList = (ArrayList) c0828e.c(lValueOf.longValue(), null)) != null) {
                    long j5 = cursorF.getLong(0);
                    Long lValueOf2 = cursorF.isNull(1) ? null : Long.valueOf(cursorF.getLong(1));
                    String string = cursorF.isNull(2) ? null : cursorF.getString(2);
                    String string2 = cursorF.isNull(3) ? null : cursorF.getString(3);
                    String string3 = cursorF.isNull(4) ? null : cursorF.getString(4);
                    long j6 = cursorF.getLong(5);
                    long j7 = cursorF.getLong(6);
                    long j8 = cursorF.getLong(7);
                    String string4 = cursorF.isNull(8) ? null : cursorF.getString(8);
                    long j9 = cursorF.getLong(9);
                    String string5 = cursorF.isNull(10) ? null : cursorF.getString(10);
                    if (string5 != null) {
                        try {
                            objV = Y2.e.valueOf(string5);
                        } catch (Throwable th) {
                            objV = AbstractC0183a.v(th);
                        }
                        if (objV instanceof K3.f) {
                            objV = null;
                        }
                        eVar = (Y2.e) objV;
                    } else {
                        eVar = null;
                    }
                    arrayList.add(new Y2.f(j5, lValueOf2, string, string2, string3, j6, j7, j8, string4, j9, eVar, cursorF.getInt(11), cursorF.isNull(12) ? null : Long.valueOf(cursorF.getLong(12)), cursorF.getLong(13)));
                }
            }
        } finally {
            cursorF.close();
        }
    }

    public void b(String str) {
        AbstractC0183a.N(((x) this.f3857m) != null, "Trying to call %s before setting callback", str);
    }

    public void c(AbstractC0869c abstractC0869c, C2.j jVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((HashMap) this.f3849c).entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            r rVar = (r) this.f3847a;
            if (!zHasNext) {
                ((x) this.f3857m).b(arrayList);
                rVar.f233a.W("notifyLocalViewChanges", new RunnableC0012l(0, rVar, arrayList2));
                return;
            }
            y2.x xVar = (y2.x) ((Map.Entry) it.next()).getValue();
            C1050C c1050c = xVar.f11159c;
            z zVar = null;
            C0020u c0020uC = c1050c.c(abstractC0869c, null);
            boolean z4 = false;
            if (c0020uC.f250b) {
                c0020uC = c1050c.c((AbstractC0869c) rVar.b(xVar.f11157a, false).f2935b, c0020uC);
            }
            int i = xVar.f11158b;
            if (jVar != null) {
                zVar = (z) ((Map) jVar.f1092b).get(Integer.valueOf(i));
            }
            if (jVar != null) {
                if (((Map) jVar.f1094d).get(Integer.valueOf(i)) != null) {
                    z4 = true;
                }
            }
            S0.c cVarA = xVar.f11159c.a(c0020uC, zVar, z4);
            n(i, (List) cVarA.f2848c);
            C1051D c1051d = (C1051D) cVarA.f2847b;
            if (c1051d != null) {
                arrayList.add(c1051d);
                ArrayList arrayList3 = new ArrayList();
                C0002b c0002b = B2.h.f313b;
                C0870e c0870e = new C0870e(arrayList3, c0002b);
                C0870e c0870e2 = new C0870e(new ArrayList(), c0002b);
                Iterator it2 = c1051d.f11073d.iterator();
                while (it2.hasNext()) {
                    C1057f c1057f = (C1057f) it2.next();
                    int iOrdinal = c1057f.f11091a.ordinal();
                    B2.l lVar = c1057f.f11092b;
                    if (iOrdinal == 0) {
                        c0870e2 = c0870e2.f(lVar.f322a);
                    } else if (iOrdinal == 1) {
                        c0870e = c0870e.f(lVar.f322a);
                    }
                }
                arrayList2.add(new C0018s(i, c1051d.f11074e, c0870e, c0870e2));
            }
        }
    }

    public void d(C2.j jVar) {
        b("handleRemoteEvent");
        for (Map.Entry entry : ((Map) jVar.f1092b).entrySet()) {
            Integer num = (Integer) entry.getKey();
            z zVar = (z) entry.getValue();
            y2.z zVar2 = (y2.z) ((HashMap) this.f3853g).get(num);
            if (zVar2 != null) {
                int size = zVar.f1517c.f9681a.size();
                C0870e c0870e = zVar.f1518d;
                int size2 = c0870e.f9681a.size() + size;
                C0870e c0870e2 = zVar.f1519e;
                AbstractC0183a.N(c0870e2.f9681a.size() + size2 <= 1, "Limbo resolution for single document contains multiple changes.", new Object[0]);
                if (zVar.f1517c.f9681a.size() > 0) {
                    zVar2.f11161b = true;
                } else if (c0870e.f9681a.size() > 0) {
                    AbstractC0183a.N(zVar2.f11161b, "Received change for limbo target document without add.", new Object[0]);
                } else if (c0870e2.f9681a.size() > 0) {
                    AbstractC0183a.N(zVar2.f11161b, "Received remove for limbo target document without add.", new Object[0]);
                    zVar2.f11161b = false;
                }
            }
        }
        r rVar = (r) this.f3847a;
        c((AbstractC0869c) rVar.f233a.V("Apply remote event", new C0017q(rVar, jVar, (B2.o) jVar.f1093c, 0)), jVar);
    }

    public int e(v vVar, boolean z4) {
        b("listen");
        HashMap map = (HashMap) this.f3849c;
        AbstractC0183a.N(!map.containsKey(vVar), "We already listen to query: %s", vVar);
        C1048A c1048aG = vVar.g();
        r rVar = (r) this.f3847a;
        g0 g0VarA = rVar.a(c1048aG);
        int i = g0VarA.f194b;
        S0.v vVarB = rVar.b(vVar, true);
        HashMap map2 = (HashMap) this.f3850d;
        boolean z5 = (map2.get(Integer.valueOf(i)) != null ? ((y2.x) map.get((v) ((List) map2.get(Integer.valueOf(i))).get(0))).f11159c.f11064b : 1) == 3;
        C0870e c0870e = B2.h.f314c;
        z zVar = new z(g0VarA.f199g, z5, c0870e, c0870e, c0870e);
        C1050C c1050c = new C1050C(vVar, (C0870e) vVarB.f2936c);
        S0.c cVarA = c1050c.a(c1050c.c((AbstractC0869c) vVarB.f2935b, null), zVar, false);
        n(i, (List) cVarA.f2848c);
        map.put(vVar, new y2.x(vVar, i, c1050c));
        if (!map2.containsKey(Integer.valueOf(i))) {
            map2.put(Integer.valueOf(i), new ArrayList(1));
        }
        ((List) map2.get(Integer.valueOf(i))).add(vVar);
        ((x) this.f3857m).b(Collections.singletonList((C1051D) cVarA.f2847b));
        if (z4) {
            ((C0063m1) this.f3848b).e(g0VarA);
        }
        return g0VarA.f194b;
    }

    public Object f(int i, C0300Y c0300y) {
        Y2.e eVar = Y2.e.f3910a;
        C0955C c0955cK = C0955C.k(2, "\n        SELECT * FROM pending_hourly_sync\n        WHERE syncType = ? AND parentCycleId IS NULL\n        ORDER BY hourStartTime\n        LIMIT ?\n        ");
        c0955cK.c(1, "LIVE");
        c0955cK.d(2, i);
        return C1071b.e((AppDatabase_Impl) this.f3847a, false, new CancellationSignal(), new l(this, c0955cK, 2), c0300y);
    }

    public void h(int i, k0 k0Var) {
        Map map = (Map) ((HashMap) this.i).get((C1038d) this.f3856l);
        if (map != null) {
            Integer numValueOf = Integer.valueOf(i);
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) map.get(numValueOf);
            if (taskCompletionSource != null) {
                if (k0Var != null) {
                    taskCompletionSource.setException(F2.s.f(k0Var));
                } else {
                    taskCompletionSource.setResult(null);
                }
                map.remove(numValueOf);
            }
        }
    }

    public void i() {
        while (true) {
            LinkedHashSet linkedHashSet = (LinkedHashSet) this.f3851e;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            HashMap map = (HashMap) this.f3852f;
            if (map.size() >= 100) {
                return;
            }
            Iterator it = linkedHashSet.iterator();
            B2.h hVar = (B2.h) it.next();
            it.remove();
            w wVar = (w) this.f3855k;
            int i = wVar.f1258a;
            wVar.f1258a = i + 2;
            ((HashMap) this.f3853g).put(Integer.valueOf(i), new y2.z(hVar));
            map.put(hVar, Integer.valueOf(i));
            ((C0063m1) this.f3848b).e(new g0(v.a(hVar.f315a).g(), i, -1L, H.f92d));
        }
    }

    public void j(int i, k0 k0Var) {
        HashMap map = (HashMap) this.f3850d;
        for (v vVar : (List) map.get(Integer.valueOf(i))) {
            ((HashMap) this.f3849c).remove(vVar);
            if (!k0Var.e()) {
                HashMap map2 = (HashMap) ((x) this.f3857m).f1261c;
                y2.h hVar = (y2.h) map2.get(vVar);
                if (hVar != null) {
                    Iterator it = hVar.f11096a.iterator();
                    while (it.hasNext()) {
                        y2.w wVar = (y2.w) it.next();
                        wVar.f11153c.a(null, F2.s.f(k0Var));
                    }
                }
                map2.remove(vVar);
                g(k0Var, "Listen for %s failed", vVar);
            }
        }
        map.remove(Integer.valueOf(i));
        S0.c cVar = (S0.c) this.h;
        C0870e c0870eP = cVar.p(i);
        cVar.r(i);
        Iterator it2 = c0870eP.iterator();
        while (true) {
            s2.d dVar = (s2.d) it2;
            if (!((Iterator) dVar.f9680b).hasNext()) {
                return;
            }
            B2.h hVar2 = (B2.h) dVar.next();
            if (!cVar.b(hVar2)) {
                k(hVar2);
            }
        }
    }

    public void k(B2.h hVar) {
        ((LinkedHashSet) this.f3851e).remove(hVar);
        HashMap map = (HashMap) this.f3852f;
        Integer num = (Integer) map.get(hVar);
        if (num != null) {
            ((C0063m1) this.f3848b).l(num.intValue());
            map.remove(hVar);
            ((HashMap) this.f3853g).remove(num);
            i();
        }
    }

    public void l(int i) {
        HashMap map = (HashMap) this.f3854j;
        if (map.containsKey(Integer.valueOf(i))) {
            Iterator it = ((List) map.get(Integer.valueOf(i))).iterator();
            while (it.hasNext()) {
                ((TaskCompletionSource) it.next()).setResult(null);
            }
            map.remove(Integer.valueOf(i));
        }
    }

    public void m(v vVar, boolean z4) {
        b("stopListening");
        HashMap map = (HashMap) this.f3849c;
        y2.x xVar = (y2.x) map.get(vVar);
        AbstractC0183a.N(xVar != null, "Trying to stop listening to a query not found", new Object[0]);
        map.remove(vVar);
        int i = xVar.f11158b;
        List list = (List) ((HashMap) this.f3850d).get(Integer.valueOf(i));
        list.remove(vVar);
        if (list.isEmpty()) {
            r rVar = (r) this.f3847a;
            rVar.f233a.W("Release target", new RunnableC0015o(rVar, i, 0));
            if (z4) {
                ((C0063m1) this.f3848b).l(i);
            }
            j(i, k0.f11348e);
        }
    }

    public void n(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y2.s sVar = (y2.s) it.next();
            int iOrdinal = sVar.a.ordinal();
            S0.c cVar = (S0.c) this.h;
            B2.h hVar = sVar.b;
            if (iOrdinal == 0) {
                cVar.getClass();
                C0003c c0003c = new C0003c(hVar, i);
                cVar.f2847b = ((C0870e) cVar.f2847b).f(c0003c);
                cVar.f2848c = ((C0870e) cVar.f2848c).f(c0003c);
                if (!((HashMap) this.f3852f).containsKey(hVar)) {
                    LinkedHashSet linkedHashSet = (LinkedHashSet) this.f3851e;
                    if (!linkedHashSet.contains(hVar)) {
                        p1.b.p(1, "o", "New document in limbo: %s", hVar);
                        linkedHashSet.add(hVar);
                        i();
                    }
                }
            } else {
                if (iOrdinal != 1) {
                    AbstractC0183a.z("Unknown limbo change type: %s", sVar.a);
                    throw null;
                }
                p1.b.p(1, "o", "Document no longer in limbo: %s", hVar);
                cVar.getClass();
                C0003c c0003c2 = new C0003c(hVar, i);
                cVar.f2847b = ((C0870e) cVar.f2847b).h(c0003c2);
                cVar.f2848c = ((C0870e) cVar.f2848c).h(c0003c2);
                if (!cVar.b(hVar)) {
                    k(hVar);
                }
            }
        }
    }

    public o(r rVar, C0063m1 c0063m1, C1038d c1038d) {
        this.f3847a = rVar;
        this.f3848b = c0063m1;
        this.f3849c = new HashMap();
        this.f3850d = new HashMap();
        this.f3851e = new LinkedHashSet();
        this.f3852f = new HashMap();
        this.f3853g = new HashMap();
        this.h = new S0.c(2);
        this.i = new HashMap();
        this.f3855k = new w(1, 1);
        this.f3856l = c1038d;
        this.f3854j = new HashMap();
    }
}
