package B3;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import z3.C1091o;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\H.smali */
public abstract class H implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f428a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f429b;

    public /* synthetic */ H(Object obj, int i) {
        this.f428a = i;
        this.f429b = obj;
    }

    public static void a(K0.r rVar, String str) {
        K0.u uVarB;
        WorkDatabase workDatabase = rVar.f2174c;
        S0.t tVarV = workDatabase.v();
        S0.c cVarQ = workDatabase.q();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int i = tVarV.i(str2);
            if (i != 3 && i != 4) {
                WorkDatabase_Impl workDatabase_Impl = tVarV.f2920a;
                workDatabase_Impl.b();
                S0.h hVar = tVarV.f2924e;
                z0.i iVarA = hVar.a();
                if (str2 == null) {
                    iVarA.f(1);
                } else {
                    iVarA.c(1, str2);
                }
                workDatabase_Impl.c();
                try {
                    iVarA.e();
                    workDatabase_Impl.o();
                } finally {
                    workDatabase_Impl.j();
                    hVar.q(iVarA);
                }
            }
            linkedList.addAll(cVarQ.d(str2));
        }
        K0.f fVar = rVar.f2177f;
        synchronized (fVar.f2144k) {
            J0.t.d().a(K0.f.f2135l, "Processor cancelling " + str);
            fVar.i.add(str);
            uVarB = fVar.b(str);
        }
        K0.f.d(str, uVarB, 1);
        Iterator it = rVar.f2176e.iterator();
        while (it.hasNext()) {
            ((K0.h) it.next()).a(str);
        }
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f428a) {
            case 0:
                C1091o c1091o = (C1091o) this.f429b;
                C1091o c1091oA = c1091o.a();
                try {
                    c();
                    return;
                } finally {
                    c1091o.c(c1091oA);
                }
            case 1:
                C3.c cVar = (C3.c) this.f429b;
                try {
                    if (cVar.f1119m == null) {
                        throw new IOException("Unable to perform write due to unavailable sink.");
                    }
                    b();
                    return;
                } catch (Exception e5) {
                    cVar.f1114d.p(e5);
                    return;
                }
            default:
                S0.c cVar2 = (S0.c) this.f429b;
                try {
                    d();
                    cVar2.n(J0.z.f2070g);
                    return;
                } catch (Throwable th) {
                    cVar2.n(new J0.w(th));
                    return;
                }
        }
    }

    public H() {
        this.f428a = 2;
        this.f429b = new S0.c(5);
    }
}
