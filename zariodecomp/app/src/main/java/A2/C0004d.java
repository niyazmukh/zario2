package A2;

import E2.C0106i;
import N2.C0144h;
import N2.n0;
import android.content.Context;
import android.util.Log;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.niyaz.zario.ui.permissions.PermissionsFragment;
import d.InterfaceC0436b;
import d3.C0445a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import p2.InterfaceC0821a;
import s2.AbstractC0869c;
import u0.C0954B;
import x2.C1035a;
import x2.C1037c;
import y0.C1042a;
import y0.InterfaceC1043b;
import y0.InterfaceC1044c;

/* renamed from: A2.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\d.1.smali */
public final /* synthetic */ class C0004d implements F2.q, Continuation, q2.d, InterfaceC1043b, OnSuccessListener, N.d, I.f, InterfaceC0436b, H2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f177b;

    public /* synthetic */ C0004d(Object obj, int i) {
        this.f176a = i;
        this.f177b = obj;
    }

    @Override // q2.d
    public Object a(E2.G g3) {
        switch (this.f176a) {
            case 5:
                return new G2.d((Context) g3.a(Context.class), ((l2.f) g3.a(l2.f.class)).e(), g3.h(q2.q.a(G2.e.class)), g3.b(K2.b.class), (Executor) g3.c((q2.q) this.f177b));
            default:
                return this.f177b;
        }
    }

    @Override // y0.InterfaceC1043b
    public InterfaceC1044c b(C1042a c1042a) {
        Context context = (Context) this.f177b;
        C0954B callback = c1042a.f11045c;
        kotlin.jvm.internal.i.e(callback, "callback");
        String str = c1042a.f11044b;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new z0.g(context, str, callback, true, true);
    }

    @Override // H2.a
    public void c(H2.b bVar) {
        int i = this.f176a;
        Object obj = this.f177b;
        switch (i) {
            case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                synchronized (((C1035a) obj)) {
                    B.a.p(bVar.get());
                }
                return;
            default:
                C1037c c1037c = (C1037c) obj;
                synchronized (c1037c) {
                    c1037c.f11020b = (InterfaceC0821a) bVar.get();
                    c1037c.k();
                    ((FirebaseAuth) c1037c.f11020b).a(c1037c.f11019a);
                }
                return;
        }
    }

    @Override // I.f
    public void d() {
        ((g0.V) this.f177b).a();
    }

    public Object e(Object obj) {
        y2.o oVar;
        FirebaseFirestore firebaseFirestore = (FirebaseFirestore) this.f177b;
        F2.f fVar = (F2.f) obj;
        synchronized (firebaseFirestore.i) {
            B2.f fVar2 = firebaseFirestore.f6399c;
            String str = firebaseFirestore.f6400d;
            w2.r rVar = firebaseFirestore.h;
            oVar = new y2.o(firebaseFirestore.f6398b, new C0020u(fVar2, str, rVar.f10957a, rVar.f10958b, 4), firebaseFirestore.f6401e, firebaseFirestore.f6402f, fVar, firebaseFirestore.f6404j, (y2.t) firebaseFirestore.f6397a.b(rVar));
        }
        return oVar;
    }

    @Override // F2.q
    public Object get() {
        C0004d c0004d;
        C0006f c0006f = (C0006f) this.f177b;
        C0004d c0004d2 = c0006f.f190c;
        InterfaceC0007g interfaceC0007g = ((r) c0004d2.f177b).f234b;
        HashSet hashSet = new HashSet();
        int i = c0006f.f192e;
        int size = i;
        while (size > 0) {
            String strQ = interfaceC0007g.q();
            if (strQ == null || hashSet.contains(strQ)) {
                break;
            }
            p1.b.p(1, "IndexBackfiller", "Processing collection: %s", strQ);
            InterfaceC0007g interfaceC0007g2 = ((r) c0004d2.f177b).f234b;
            C0009i c0009i = ((r) c0006f.f191d.f177b).f238f;
            B2.b bVarC = interfaceC0007g2.c(strQ);
            Map mapD = ((J) c0009i.f204b).d(strQ, bVarC, size);
            HashMap mapN = size - mapD.size() > 0 ? ((InterfaceC0001a) c0009i.f206d).n(bVarC.f304c, size - mapD.size(), strQ) : new HashMap();
            int iMax = -1;
            for (C2.d dVar : mapN.values()) {
                C0006f c0006f2 = c0006f;
                if (mapD.containsKey(dVar.f1079b.f1084a)) {
                    c0004d = c0004d2;
                } else {
                    C2.h hVar = dVar.f1079b;
                    c0004d = c0004d2;
                    boolean z4 = hVar instanceof C2.m;
                    B2.h hVar2 = hVar.f1084a;
                    mapD.put(hVar2, z4 ? ((J) c0009i.f204b).f(hVar2) : B2.l.g(hVar2));
                }
                iMax = Math.max(iMax, dVar.f1078a);
                c0006f = c0006f2;
                c0004d2 = c0004d;
            }
            C0006f c0006f3 = c0006f;
            C0004d c0004d3 = c0004d2;
            c0009i.Z(mapN, mapD.keySet());
            C0008h c0008hA = C0008h.a(iMax, c0009i.y(mapD, mapN, Collections.emptySet()));
            AbstractC0869c abstractC0869c = c0008hA.f201b;
            interfaceC0007g2.e(abstractC0869c);
            Iterator it = abstractC0869c.iterator();
            B2.b bVar = bVarC;
            while (it.hasNext()) {
                B2.b bVarB = B2.b.b((B2.l) ((Map.Entry) it.next()).getValue());
                if (bVarB.compareTo(bVar) > 0) {
                    bVar = bVarB;
                }
            }
            B2.b bVar2 = new B2.b(bVar.f302a, bVar.f303b, Math.max(c0008hA.f200a, bVarC.f304c));
            p1.b.p(1, "IndexBackfiller", "Updating offset: %s", bVar2);
            interfaceC0007g2.l(strQ, bVar2);
            size -= abstractC0869c.size();
            hashSet.add(strQ);
            c0006f = c0006f3;
            c0004d2 = c0004d3;
        }
        return Integer.valueOf(i - size);
    }

    @Override // d.InterfaceC0436b
    public void j(Object obj) {
        Boolean bool = (Boolean) obj;
        Log.d("PermissionsFragment", "Notification permission result: " + bool);
        PermissionsFragment permissionsFragment = (PermissionsFragment) this.f177b;
        permissionsFragment.Z().b();
        kotlin.jvm.internal.i.b(bool);
        permissionsFragment.d0(bool.booleanValue());
        permissionsFragment.c0((C0445a) permissionsFragment.Z().f6801b.K());
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        Object obj2 = this.f177b;
        switch (this.f176a) {
            case 8:
                int i = HiddenActivity.f4402c;
                ((R.c) obj2).invoke(obj);
                break;
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                int i5 = HiddenActivity.f4402c;
                ((R.c) obj2).invoke(obj);
                break;
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                int i6 = HiddenActivity.f4402c;
                ((R.c) obj2).invoke(obj);
                break;
            default:
                int i7 = HiddenActivity.f4402c;
                ((R.c) obj2).invoke(obj);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws Exception {
        switch (this.f176a) {
            case 2:
                C0106i c0106i = (C0106i) this.f177b;
                c0106i.getClass();
                if (!task.isSuccessful()) {
                    if ((task.getException() instanceof w2.p) && ((w2.p) task.getException()).f10950a == w2.o.UNAUTHENTICATED) {
                        E2.q qVar = c0106i.f1457c;
                        qVar.f1483b.j();
                        synchronized (qVar.f1484c) {
                        }
                    }
                    throw task.getException();
                }
                C0144h c0144h = (C0144h) task.getResult();
                B2.o oVarO = S0.l.o(c0144h.v());
                int iY = c0144h.y();
                ArrayList arrayList = new ArrayList(iY);
                for (int i = 0; i < iY; i++) {
                    arrayList.add(S0.l.m(c0144h.x(i), oVarO));
                }
                return arrayList;
            default:
                boolean zIsSuccessful = task.isSuccessful();
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f177b;
                if (zIsSuccessful) {
                    taskCompletionSource.setResult(task.getResult());
                    return null;
                }
                taskCompletionSource.setException(task.getException());
                return null;
        }
    }
}
