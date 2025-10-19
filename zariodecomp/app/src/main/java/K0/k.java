package K0;

import J0.C0108b;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\K0\k.smali */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2155a = J0.t.f("Schedulers");

    public static void a(S0.t tVar, J0.u uVar, ArrayList arrayList) {
        if (arrayList.size() > 0) {
            uVar.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                tVar.m(((S0.q) it.next()).f2895a, jCurrentTimeMillis);
            }
        }
    }

    public static void b(C0108b c0108b, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        S0.t tVarV = workDatabase.v();
        workDatabase.c();
        try {
            ArrayList arrayListF = tVarV.f();
            a(tVarV, c0108b.f2026c, arrayListF);
            ArrayList arrayListE = tVarV.e(c0108b.f2031j);
            a(tVarV, c0108b.f2026c, arrayListE);
            arrayListE.addAll(arrayListF);
            ArrayList arrayListD = tVarV.d();
            workDatabase.o();
            workDatabase.j();
            if (arrayListE.size() > 0) {
                S0.q[] qVarArr = (S0.q[]) arrayListE.toArray(new S0.q[arrayListE.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    h hVar = (h) it.next();
                    if (hVar.e()) {
                        hVar.d(qVarArr);
                    }
                }
            }
            if (arrayListD.size() > 0) {
                S0.q[] qVarArr2 = (S0.q[]) arrayListD.toArray(new S0.q[arrayListD.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    h hVar2 = (h) it2.next();
                    if (!hVar2.e()) {
                        hVar2.d(qVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.j();
            throw th;
        }
    }
}
