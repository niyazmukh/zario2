package E2;

import A2.C0020u;
import A3.d;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import x1.AbstractC1034a;
import z3.AbstractC1080d;
import z3.C1079c;
import z3.C1084h;
import z3.P;
import z3.Q;
import z3.S;
import z3.T;
import z3.U;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E2\r.smali */
public final /* synthetic */ class r implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1488a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1489b;

    public /* synthetic */ r(Object obj, int i) {
        this.f1488a = i;
        this.f1489b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        U u2;
        List list;
        switch (this.f1488a) {
            case 0:
                t tVar = (t) this.f1489b;
                Context context = tVar.f1497e;
                C0020u c0020u = tVar.f1498f;
                try {
                    AbstractC1034a.a(context);
                } catch (h1.f | h1.g | IllegalStateException e5) {
                    p1.b.p(2, "GrpcCallProvider", "Failed to update ssl context: %s", e5);
                }
                String str = (String) c0020u.f253e;
                Logger logger = U.f11263c;
                synchronized (U.class) {
                    try {
                        if (U.f11264d == null) {
                            List<S> listK = AbstractC1080d.k(S.class, U.a(), S.class.getClassLoader(), new C1084h(7));
                            U.f11264d = new U();
                            for (S s4 : listK) {
                                U.f11263c.fine("Service loader found " + s4);
                                U u4 = U.f11264d;
                                synchronized (u4) {
                                    S0.f.g("isAvailable() returned false", s4.b());
                                    u4.f11265a.add(s4);
                                }
                            }
                            U u5 = U.f11264d;
                            synchronized (u5) {
                                ArrayList arrayList = new ArrayList(u5.f11265a);
                                Collections.sort(arrayList, Collections.reverseOrder(new T()));
                                u5.f11266b = Collections.unmodifiableList(arrayList);
                            }
                        }
                        u2 = U.f11264d;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                synchronized (u2) {
                    list = u2.f11266b;
                }
                S s5 = list.isEmpty() ? null : (S) list.get(0);
                if (s5 == null) {
                    throw new B0.c("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
                }
                Q qA = s5.a(str);
                if (!c0020u.f250b) {
                    qA.c();
                }
                qA.b(TimeUnit.SECONDS);
                A3.e eVar = new A3.e(qA);
                eVar.f277b = context;
                P pA = eVar.a();
                tVar.f1494b.b(new s(tVar, (d) pA, i));
                C1079c c1079cC = C1079c.i.c(H3.b.f1911a, H3.a.f1909a);
                l lVar = tVar.f1499g;
                K0.t tVarB = C1079c.b(c1079cC);
                tVarB.f2183c = lVar;
                C1079c c1079c = new C1079c(tVarB);
                F2.d dVar = tVar.f1494b.f1704a;
                K0.t tVarB2 = C1079c.b(c1079c);
                tVarB2.f2182b = dVar;
                tVar.f1495c = new C1079c(tVarB2);
                p1.b.p(1, "GrpcCallProvider", "Channel successfully reset.", new Object[0]);
                return pA;
            case 1:
                ((Runnable) this.f1489b).run();
                return null;
            default:
                WorkDatabase workDatabase = (WorkDatabase) ((g1.i) this.f1489b).f7594b;
                Long lR = workDatabase.r().r("next_alarm_manager_id");
                int iLongValue = lR != null ? (int) lR.longValue() : 0;
                workDatabase.r().t(new S0.d("next_alarm_manager_id", Long.valueOf(iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0)));
                return Integer.valueOf(iLongValue);
        }
    }
}
