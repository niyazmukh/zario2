package E2;

import J0.B;
import N2.j0;
import N2.n0;
import a.AbstractC0183a;
import b2.InterfaceC0260A;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.firestore.FirestoreRegistrar;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import q2.d;
import y2.y;
import z3.AbstractC1081e;
import z3.l0;
import z3.m0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E2\n.smali */
public final /* synthetic */ class n implements OnSuccessListener, Continuation, d, InterfaceC0260A, H2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1474a;

    public /* synthetic */ n(int i) {
        this.f1474a = i;
    }

    @Override // q2.d
    public Object a(G g3) {
        switch (this.f1474a) {
            case 2:
                Set setH = g3.h(q2.q.a(K2.a.class));
                K2.c cVar = K2.c.c;
                if (cVar == null) {
                    synchronized (K2.c.class) {
                        try {
                            cVar = K2.c.c;
                            if (cVar == null) {
                                cVar = new K2.c(0);
                                K2.c.c = cVar;
                            }
                        } finally {
                        }
                    }
                }
                return new K2.b(setH, cVar);
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return (ScheduledExecutorService) ExecutorsRegistrar.f6393a.get();
            case 11:
                return (ScheduledExecutorService) ExecutorsRegistrar.f6395c.get();
            case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return (ScheduledExecutorService) ExecutorsRegistrar.f6394b.get();
            case 13:
                q2.m mVar = ExecutorsRegistrar.f6393a;
                return r2.i.f9634a;
            default:
                return FirestoreRegistrar.lambda$getComponents$0(g3);
        }
    }

    public Object b(Object obj) {
        ArrayList arrayList;
        J0.A a5;
        Iterator it;
        long jL;
        switch (this.f1474a) {
            case 3:
                List list = (List) obj;
                if (list == null) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList(L3.l.a0(list));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    S0.p pVar = (S0.p) it2.next();
                    ArrayList arrayList3 = pVar.f2892q;
                    J0.h progress = !arrayList3.isEmpty() ? (J0.h) arrayList3.get(0) : J0.h.f2050c;
                    UUID uuidFromString = UUID.fromString(pVar.f2878a);
                    kotlin.jvm.internal.i.d(uuidFromString, "fromString(id)");
                    HashSet hashSet = new HashSet(pVar.f2891p);
                    kotlin.jvm.internal.i.d(progress, "progress");
                    long j5 = pVar.f2882e;
                    if (j5 != 0) {
                        arrayList = arrayList2;
                        a5 = new J0.A(j5, pVar.f2883f);
                    } else {
                        arrayList = arrayList2;
                        a5 = null;
                    }
                    int i = pVar.h;
                    long j6 = pVar.f2881d;
                    int i5 = pVar.f2879b;
                    if (i5 == z) {
                        String str = S0.q.f2893x;
                        it = it2;
                        jL = AbstractC0183a.l((i5 != z || i <= 0) ? false : z, i, pVar.i, pVar.f2885j, pVar.f2886k, pVar.f2887l, j5 != 0 ? z : false, j6, pVar.f2883f, j5, pVar.f2889n);
                    } else {
                        it = it2;
                        jL = Long.MAX_VALUE;
                    }
                    ArrayList arrayList4 = arrayList;
                    arrayList4.add(new B(uuidFromString, pVar.f2879b, hashSet, pVar.f2880c, progress, i, pVar.f2888m, pVar.f2884g, j6, a5, jL, pVar.f2890o));
                    arrayList2 = arrayList4;
                    it2 = it;
                    z = true;
                }
                return arrayList2;
            default:
                w2.r rVar = (w2.r) obj;
                return rVar.f10961e == null ? rVar.f10959c : true ? new y(rVar) : new y2.t(rVar);
        }
    }

    @Override // H2.a
    public void c(H2.b bVar) {
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((AbstractC1081e) obj).b();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws Exception {
        switch (this.f1474a) {
            case 1:
                if (task.isSuccessful()) {
                    return (Void) task.getResult();
                }
                Exception exception = task.getException();
                if (exception instanceof l0) {
                    exception = F2.s.f(((l0) exception).f11363a);
                } else if (exception instanceof m0) {
                    exception = F2.s.f(((m0) exception).f11366a);
                }
                if (exception instanceof w2.p) {
                    throw exception;
                }
                throw new w2.p(exception.getMessage(), w2.o.UNKNOWN, exception);
            default:
                return task.isSuccessful() ? Tasks.forResult(null) : Tasks.forException(task.getException());
        }
    }
}
