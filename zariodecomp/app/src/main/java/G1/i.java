package g1;

import A2.C0009i;
import A2.G;
import A2.X;
import A2.Z;
import A2.a0;
import B2.n;
import B2.p;
import F2.s;
import N2.C0138a;
import N2.E;
import N2.m0;
import N2.n0;
import W.j0;
import W.k0;
import a.AbstractC0183a;
import a2.AbstractC0193h;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.protobuf.A0;
import com.google.protobuf.AbstractC0409l;
import com.google.protobuf.B0;
import d.C0435a;
import d.InterfaceC0436b;
import g.y;
import g0.AbstractComponentCallbacksC0567t;
import g0.C;
import g0.C0538F;
import g0.C0542J;
import i4.I;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import k.x;
import l.C0693i;
import l2.o;
import t0.AbstractC0910Q;
import t0.C0911S;
import t0.C0916a;
import t0.g0;
import t0.q0;
import w2.C1024a;
import w2.t;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g1.1\i.smali */
public class i implements x, InterfaceC0436b, k.j, Continuation, q0 {

    /* renamed from: c, reason: collision with root package name */
    public static i f7592c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7593a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7594b;

    public /* synthetic */ i(int i, boolean z4) {
        this.f7593a = i;
    }

    public static n0 B(o oVar) {
        int i = (oVar.f8793b / 1000) * 1000;
        m0 m0VarT = n0.T();
        A0 a0A = B0.A();
        a0A.d();
        B0.v((B0) a0A.f6410b, oVar.f8792a);
        a0A.d();
        B0.w((B0) a0A.f6410b, i);
        m0VarT.d();
        n0.v((n0) m0VarT.f6410b, (B0) a0A.b());
        return (n0) m0VarT.b();
    }

    public static synchronized i F(Context context) {
        i iVar;
        Context applicationContext = context.getApplicationContext();
        synchronized (i.class) {
            iVar = f7592c;
            if (iVar == null) {
                iVar = new i(applicationContext);
                f7592c = iVar;
            }
        }
        return iVar;
        return iVar;
    }

    public C0009i A(Map map) {
        C.d dVar = new C.d(1, 7);
        return new C0009i(m(map, new G(dVar, B2.k.f321c, false)), (Object) null, Collections.unmodifiableList((ArrayList) dVar.f1048d), 24);
    }

    public boolean C(int i, int i5, Bundle bundle) {
        return false;
    }

    public void D(Exception exc) {
        r2.h hVar = (r2.h) this.f7594b;
        hVar.getClass();
        if (r.h.f9559f.i(hVar, null, new r.c(exc))) {
            r.h.d(hVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void E(W.j0 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "newState"
            kotlin.jvm.internal.i.e(r6, r0)
        L5:
            java.lang.Object r0 = r5.f7594b
            i4.I r0 = (i4.I) r0
            java.lang.Object r1 = r0.K()
            r2 = r1
            W.j0 r2 = (W.j0) r2
            boolean r3 = r2 instanceof W.b0
            if (r3 == 0) goto L16
            r3 = 1
            goto L1c
        L16:
            W.k0 r3 = W.k0.f3631b
            boolean r3 = kotlin.jvm.internal.i.a(r2, r3)
        L1c:
            if (r3 == 0) goto L1f
            goto L29
        L1f:
            boolean r3 = r2 instanceof W.C0162d
            if (r3 == 0) goto L2b
            int r3 = r2.f3622a
            int r4 = r6.f3622a
            if (r4 <= r3) goto L2f
        L29:
            r2 = r6
            goto L2f
        L2b:
            boolean r3 = r2 instanceof W.Z
            if (r3 == 0) goto L36
        L2f:
            boolean r0 = r0.J(r1, r2)
            if (r0 == 0) goto L5
            return
        L36:
            B0.c r5 = new B0.c
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.i.E(W.j0):void");
    }

    public synchronized void G() {
        C0573b c0573b = (C0573b) this.f7594b;
        ReentrantLock reentrantLock = c0573b.f7574a;
        reentrantLock.lock();
        try {
            c0573b.f7575b.edit().clear().apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // k.x
    public void a(k.l lVar, boolean z4) {
        ((y) this.f7594b).q(lVar);
    }

    @Override // t0.q0
    public View b(int i) {
        return ((AbstractC0910Q) this.f7594b).u(i);
    }

    @Override // t0.q0
    public int c() {
        AbstractC0910Q abstractC0910Q = (AbstractC0910Q) this.f7594b;
        return abstractC0910Q.f9926o - abstractC0910Q.B();
    }

    @Override // k.x
    public boolean d(k.l lVar) {
        Window.Callback callback = ((y) this.f7594b).f7288p.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, lVar);
        return true;
    }

    @Override // t0.q0
    public int e() {
        return ((AbstractC0910Q) this.f7594b).E();
    }

    @Override // k.j
    public boolean f(k.l lVar, MenuItem menuItem) {
        switch (this.f7593a) {
            case 20:
                K2.c cVar = ((ActionMenuView) this.f7594b).f4203D;
                if (cVar != null) {
                    Iterator it = ((CopyOnWriteArrayList) ((Toolbar) cVar.b).f4276K.f205c).iterator();
                    while (it.hasNext()) {
                        if (((C) it.next()).f7304a.o()) {
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                ((Toolbar) this.f7594b).getClass();
                break;
        }
        return false;
    }

    @Override // t0.q0
    public int g(View view) {
        C0911S c0911s = (C0911S) view.getLayoutParams();
        ((AbstractC0910Q) this.f7594b).getClass();
        return view.getBottom() + ((C0911S) view.getLayoutParams()).f9928b.bottom + ((ViewGroup.MarginLayoutParams) c0911s).bottomMargin;
    }

    @Override // t0.q0
    public int h(View view) {
        C0911S c0911s = (C0911S) view.getLayoutParams();
        ((AbstractC0910Q) this.f7594b).getClass();
        return (view.getTop() - ((C0911S) view.getLayoutParams()).f9928b.top) - ((ViewGroup.MarginLayoutParams) c0911s).topMargin;
    }

    public boolean i(n nVar) {
        AbstractC0183a.N(nVar.f309a.size() % 2 == 1, "Expected a collection path.", new Object[0]);
        String strF = nVar.f();
        n nVar2 = (n) nVar.k();
        HashMap map = (HashMap) this.f7594b;
        HashSet hashSet = (HashSet) map.get(strF);
        if (hashSet == null) {
            hashSet = new HashSet();
            map.put(strF, hashSet);
        }
        return hashSet.add(nVar2);
    }

    @Override // d.InterfaceC0436b
    public void j(Object obj) {
        C0435a c0435a = (C0435a) obj;
        C0542J c0542j = (C0542J) this.f7594b;
        C0538F c0538f = (C0538F) c0542j.f7319D.pollLast();
        if (c0538f == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = c0538f.f7308a;
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567tE = c0542j.f7331c.e(str);
        if (abstractComponentCallbacksC0567tE != null) {
            abstractComponentCallbacksC0567tE.A(c0538f.f7309b, c0435a.f6765a, c0435a.f6766b);
        } else {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    public void k(Object obj, String str) {
        ((ArrayList) this.f7594b).add(str + "=" + obj);
    }

    public void l(X x3) {
        while (true) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f7594b;
            S0.e eVar = null;
            if (!concurrentHashMap.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                Iterator it = concurrentHashMap.keySet().iterator();
                int i = 0;
                while (it.hasNext() && arrayList.size() < 900) {
                    a0 a0Var = (a0) it.next();
                    Z z4 = (Z) concurrentHashMap.remove(a0Var);
                    if (z4 != null) {
                        i++;
                        arrayList.add(a0Var.f164a);
                        int size = arrayList.size();
                        arrayList.add(Integer.valueOf(a0Var.f165b));
                        int size2 = arrayList.size();
                        arrayList.add(Integer.valueOf(a0Var.f166c));
                        int size3 = arrayList.size();
                        arrayList.add(Integer.valueOf(z4.f163a));
                        int size4 = arrayList.size();
                        sb.append(" WHEN path=?");
                        sb.append(size);
                        sb.append(" AND read_time_seconds=?");
                        sb.append(size2);
                        sb.append(" AND read_time_nanos=?");
                        sb.append(size3);
                        sb.append(" THEN ?");
                        sb.append(size4);
                        if (sb2.length() > 0) {
                            sb2.append(" OR");
                        }
                        sb2.append(" (path=?");
                        sb2.append(size);
                        sb2.append(" AND read_time_seconds=?");
                        sb2.append(size2);
                        sb2.append(" AND read_time_nanos=?");
                        sb2.append(size3);
                        sb2.append(')');
                    }
                }
                if (i != 0) {
                    eVar = new S0.e("UPDATE remote_documents SET document_type = CASE" + ((Object) sb) + " ELSE NULL END WHERE" + ((Object) sb2), arrayList.toArray());
                }
            }
            if (eVar == null) {
                return;
            } else {
                x3.y0((String) eVar.f2851a, (Object[]) eVar.f2852b);
            }
        }
    }

    public B2.m m(Map map, G g3) {
        if (map.getClass().isArray()) {
            throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was an array");
        }
        n0 n0VarY = y(F2.n.b(map, F2.m.f1719d), g3);
        if (n0VarY.R() == 11) {
            return new B2.m(n0VarY);
        }
        E2.n nVar = s.f1736a;
        throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was of type: ".concat(map.getClass().getName()));
    }

    public N.o n(int i) {
        return null;
    }

    @Override // k.j
    public void o(k.l lVar) {
        switch (this.f7593a) {
            case 20:
                i iVar = ((ActionMenuView) this.f7594b).f4209y;
                if (iVar != null) {
                    iVar.o(lVar);
                    break;
                }
                break;
            default:
                Toolbar toolbar = (Toolbar) this.f7594b;
                C0693i c0693i = toolbar.f4287a.f4208x;
                if (c0693i == null || !c0693i.j()) {
                    Iterator it = ((CopyOnWriteArrayList) toolbar.f4276K.f205c).iterator();
                    while (it.hasNext()) {
                        ((C) it.next()).f7304a.s();
                    }
                    break;
                }
                break;
        }
    }

    public void p(C0916a c0916a) {
        int i = c0916a.f9945a;
        RecyclerView recyclerView = (RecyclerView) this.f7594b;
        if (i == 1) {
            recyclerView.f4759q.U(c0916a.f9946b, c0916a.f9948d);
            return;
        }
        if (i == 2) {
            recyclerView.f4759q.X(c0916a.f9946b, c0916a.f9948d);
        } else if (i == 4) {
            recyclerView.f4759q.Y(c0916a.f9946b, c0916a.f9948d);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f4759q.W(c0916a.f9946b, c0916a.f9948d);
        }
    }

    public N.o q(int i) {
        return null;
    }

    public g0 r(int i) {
        RecyclerView recyclerView = (RecyclerView) this.f7594b;
        int iQ = recyclerView.f4739e.Q();
        int i5 = 0;
        g0 g0Var = null;
        while (true) {
            if (i5 >= iQ) {
                break;
            }
            g0 g0VarI = RecyclerView.I(recyclerView.f4739e.P(i5));
            if (g0VarI != null && !g0VarI.i() && g0VarI.f10006c == i) {
                if (!((ArrayList) recyclerView.f4739e.f206d).contains(g0VarI.f10004a)) {
                    g0Var = g0VarI;
                    break;
                }
                g0Var = g0VarI;
            }
            i5++;
        }
        if (g0Var == null || ((ArrayList) recyclerView.f4739e.f206d).contains(g0Var.f10004a)) {
            return null;
        }
        return g0Var;
    }

    public j0 s() {
        return (j0) ((I) this.f7594b).K();
    }

    public void t(Object obj, int i, int i5) {
        int i6;
        int i7;
        RecyclerView recyclerView = (RecyclerView) this.f7594b;
        int iQ = recyclerView.f4739e.Q();
        int i8 = i5 + i;
        for (int i9 = 0; i9 < iQ; i9++) {
            View viewP = recyclerView.f4739e.P(i9);
            g0 g0VarI = RecyclerView.I(viewP);
            if (g0VarI != null && !g0VarI.p() && (i7 = g0VarI.f10006c) >= i && i7 < i8) {
                g0VarI.a(2);
                if (obj == null) {
                    g0VarI.a(1024);
                } else if ((1024 & g0VarI.f10011j) == 0) {
                    if (g0VarI.f10012k == null) {
                        ArrayList arrayList = new ArrayList();
                        g0VarI.f10012k = arrayList;
                        g0VarI.f10013l = Collections.unmodifiableList(arrayList);
                    }
                    g0VarI.f10012k.add(obj);
                }
                ((C0911S) viewP.getLayoutParams()).f9929c = true;
            }
        }
        t0.X x3 = recyclerView.f4733b;
        ArrayList arrayList2 = x3.f9939c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            g0 g0Var = (g0) arrayList2.get(size);
            if (g0Var != null && (i6 = g0Var.f10006c) >= i && i6 < i8) {
                g0Var.a(2);
                x3.e(size);
            }
        }
        recyclerView.f4752m0 = true;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return ((RecaptchaTasksClient) task.getResult()).executeTask((RecaptchaAction) this.f7594b);
        }
        Exception exception = task.getException();
        com.google.android.gms.common.internal.C.f(exception);
        if (!(exception instanceof p2.o)) {
            return Tasks.forException(exception);
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Ignoring error related to fetching recaptcha config - " + exception.getMessage());
        }
        return Tasks.forResult("");
    }

    public String toString() {
        switch (this.f7593a) {
            case 3:
                return ((ArrayList) this.f7594b).toString();
            case 7:
                StringBuilder sb = new StringBuilder();
                String[] strArr = (String[]) this.f7594b;
                int length = strArr.length / 2;
                for (int i = 0; i < length; i++) {
                    int i5 = i * 2;
                    String str = null;
                    sb.append((i5 < 0 || i5 >= strArr.length) ? null : strArr[i5]);
                    sb.append(": ");
                    int i6 = i5 + 1;
                    if (i6 >= 0 && i6 < strArr.length) {
                        str = strArr[i6];
                    }
                    sb.append(str);
                    sb.append("\n");
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public InputStream u() {
        InputStream inputStream = (InputStream) this.f7594b;
        this.f7594b = null;
        return inputStream;
    }

    public void v(int i, int i5) {
        RecyclerView recyclerView = (RecyclerView) this.f7594b;
        int iQ = recyclerView.f4739e.Q();
        for (int i6 = 0; i6 < iQ; i6++) {
            g0 g0VarI = RecyclerView.I(recyclerView.f4739e.P(i6));
            if (g0VarI != null && !g0VarI.p() && g0VarI.f10006c >= i) {
                g0VarI.m(i5, false);
                recyclerView.f4745i0.f9977f = true;
            }
        }
        ArrayList arrayList = recyclerView.f4733b.f9939c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            g0 g0Var = (g0) arrayList.get(i7);
            if (g0Var != null && g0Var.f10006c >= i) {
                g0Var.m(i5, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f4750l0 = true;
    }

    public void w(int i, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        RecyclerView recyclerView = (RecyclerView) this.f7594b;
        int iQ = recyclerView.f4739e.Q();
        int i13 = -1;
        if (i < i5) {
            i7 = i;
            i6 = i5;
            i8 = -1;
        } else {
            i6 = i;
            i7 = i5;
            i8 = 1;
        }
        for (int i14 = 0; i14 < iQ; i14++) {
            g0 g0VarI = RecyclerView.I(recyclerView.f4739e.P(i14));
            if (g0VarI != null && (i12 = g0VarI.f10006c) >= i7 && i12 <= i6) {
                if (i12 == i) {
                    g0VarI.m(i5 - i, false);
                } else {
                    g0VarI.m(i8, false);
                }
                recyclerView.f4745i0.f9977f = true;
            }
        }
        t0.X x3 = recyclerView.f4733b;
        x3.getClass();
        if (i < i5) {
            i10 = i;
            i9 = i5;
        } else {
            i9 = i;
            i10 = i5;
            i13 = 1;
        }
        ArrayList arrayList = x3.f9939c;
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            g0 g0Var = (g0) arrayList.get(i15);
            if (g0Var != null && (i11 = g0Var.f10006c) >= i10 && i11 <= i9) {
                if (i11 == i) {
                    g0Var.m(i5 - i, false);
                } else {
                    g0Var.m(i13, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f4750l0 = true;
    }

    public void x(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((AbstractC0193h) this.f7594b).a(0);
    }

    public n0 y(Object obj, G g3) {
        boolean z4 = obj instanceof Map;
        B2.k kVar = (B2.k) g3.f88c;
        C.d dVar = (C.d) g3.f87b;
        if (z4) {
            Map map = (Map) obj;
            if (map.isEmpty()) {
                if (kVar != null && !kVar.h()) {
                    ((HashSet) dVar.f1047c).add(kVar);
                }
                m0 m0VarT = n0.T();
                m0VarT.i(E.w());
                return (n0) m0VarT.b();
            }
            N2.C cB = E.B();
            for (Map.Entry entry : map.entrySet()) {
                if (!(entry.getKey() instanceof String)) {
                    throw g3.c(String.format("Non-String Map key (%s) is not allowed", entry.getValue()));
                }
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                G g5 = new G(dVar, kVar == null ? null : (B2.k) kVar.b(str), false);
                if (str.isEmpty()) {
                    throw g5.c("Document fields must not be empty");
                }
                if (g5.d() && str.startsWith("__") && str.endsWith("__")) {
                    throw g5.c("Document fields cannot begin and end with \"__\"");
                }
                n0 n0VarY = y(value, g5);
                if (n0VarY != null) {
                    cB.f(n0VarY, str);
                }
            }
            m0 m0VarT2 = n0.T();
            m0VarT2.h(cB);
            return (n0) m0VarT2.b();
        }
        if (obj instanceof w2.n) {
            w2.n nVar = (w2.n) obj;
            if (!g3.d()) {
                throw g3.c(nVar.a().concat("() can only be used with set() and update()"));
            }
            if (kVar == null) {
                throw g3.c(nVar.a().concat("() is not currently supported inside arrays"));
            }
            if (nVar instanceof w2.l) {
                int i = dVar.f1046b;
                if (i != 2) {
                    if (i != 3) {
                        throw g3.c("FieldValue.delete() can only be used with update() and set() with SetOptions.merge()");
                    }
                    AbstractC0183a.N(kVar.f309a.size() > 0, "FieldValue.delete() at the top level should have already been handled.", new Object[0]);
                    throw g3.c("FieldValue.delete() can only appear at the top level of your update data");
                }
                ((HashSet) dVar.f1047c).add(kVar);
            } else {
                if (!(nVar instanceof w2.m)) {
                    E2.n nVar2 = s.f1736a;
                    AbstractC0183a.z("Unknown FieldValue type: %s", nVar == null ? "null" : nVar.getClass().getName());
                    throw null;
                }
                ((ArrayList) dVar.f1048d).add(new C2.g(kVar, C2.o.f1105a));
            }
            return null;
        }
        if (kVar != null) {
            ((HashSet) dVar.f1047c).add(kVar);
        }
        if (obj instanceof List) {
            if (g3.f86a && dVar.f1046b != 5) {
                throw g3.c("Nested arrays are not supported");
            }
            C0138a c0138aB = N2.b.B();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                n0 n0VarY2 = y(it.next(), new G(dVar, null, true));
                if (n0VarY2 == null) {
                    m0 m0VarT3 = n0.T();
                    m0VarT3.d();
                    n0.C((n0) m0VarT3.f6410b);
                    n0VarY2 = (n0) m0VarT3.b();
                }
                c0138aB.d();
                N2.b.v((N2.b) c0138aB.f6410b, n0VarY2);
            }
            m0 m0VarT4 = n0.T();
            m0VarT4.f(c0138aB);
            return (n0) m0VarT4.b();
        }
        if (obj == null) {
            m0 m0VarT5 = n0.T();
            m0VarT5.d();
            n0.C((n0) m0VarT5.f6410b);
            return (n0) m0VarT5.b();
        }
        if (obj instanceof Integer) {
            m0 m0VarT6 = n0.T();
            long jIntValue = ((Integer) obj).intValue();
            m0VarT6.d();
            n0.E((n0) m0VarT6.f6410b, jIntValue);
            return (n0) m0VarT6.b();
        }
        if (obj instanceof Long) {
            m0 m0VarT7 = n0.T();
            long jLongValue = ((Long) obj).longValue();
            m0VarT7.d();
            n0.E((n0) m0VarT7.f6410b, jLongValue);
            return (n0) m0VarT7.b();
        }
        if (obj instanceof Float) {
            m0 m0VarT8 = n0.T();
            m0VarT8.g(((Float) obj).doubleValue());
            return (n0) m0VarT8.b();
        }
        if (obj instanceof Double) {
            m0 m0VarT9 = n0.T();
            m0VarT9.g(((Double) obj).doubleValue());
            return (n0) m0VarT9.b();
        }
        if (obj instanceof Boolean) {
            m0 m0VarT10 = n0.T();
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            m0VarT10.d();
            n0.D((n0) m0VarT10.f6410b, zBooleanValue);
            return (n0) m0VarT10.b();
        }
        if (obj instanceof String) {
            m0 m0VarT11 = n0.T();
            m0VarT11.j((String) obj);
            return (n0) m0VarT11.b();
        }
        if (obj instanceof Date) {
            return B(new o((Date) obj));
        }
        if (obj instanceof o) {
            return B((o) obj);
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            m0 m0VarT12 = n0.T();
            Q2.a aVarA = Q2.b.A();
            aVarA.d();
            Q2.b.v((Q2.b) aVarA.f6410b, tVar.f10968a);
            aVarA.d();
            Q2.b.w((Q2.b) aVarA.f6410b, tVar.f10969b);
            m0VarT12.d();
            n0.z((n0) m0VarT12.f6410b, (Q2.b) aVarA.b());
            return (n0) m0VarT12.b();
        }
        if (obj instanceof C1024a) {
            m0 m0VarT13 = n0.T();
            AbstractC0409l abstractC0409l = ((C1024a) obj).f10918a;
            m0VarT13.d();
            n0.x((n0) m0VarT13.f6410b, abstractC0409l);
            return (n0) m0VarT13.b();
        }
        if (!(obj instanceof w2.g)) {
            if (!(obj instanceof w2.E)) {
                if (obj.getClass().isArray()) {
                    throw g3.c("Arrays are not supported; use a List instead");
                }
                E2.n nVar3 = s.f1736a;
                throw g3.c("Unsupported type: ".concat(obj.getClass().getName()));
            }
            N2.C cB2 = E.B();
            cB2.f(p.f340f, "__type__");
            double[] dArr = ((w2.E) obj).f10917a;
            ArrayList arrayList = new ArrayList(dArr.length);
            for (int i5 = 0; i5 < dArr.length; i5++) {
                arrayList.add(i5, Double.valueOf(dArr[i5]));
            }
            cB2.f(y(arrayList, g3), "value");
            m0 m0VarT14 = n0.T();
            m0VarT14.h(cB2);
            return (n0) m0VarT14.b();
        }
        w2.g gVar = (w2.g) obj;
        B2.f fVar = (B2.f) this.f7594b;
        String str2 = fVar.f311b;
        String str3 = fVar.f310a;
        FirebaseFirestore firebaseFirestore = gVar.f10930b;
        if (firebaseFirestore != null) {
            B2.f fVar2 = firebaseFirestore.f6399c;
            if (!fVar2.equals(fVar)) {
                throw g3.c("Document reference is for database " + fVar2.f310a + "/" + fVar2.f311b + " but should be for database " + str3 + "/" + str2);
            }
        }
        m0 m0VarT15 = n0.T();
        String str4 = "projects/" + str3 + "/databases/" + str2 + "/documents/" + gVar.f10929a.f315a.c();
        m0VarT15.d();
        n0.y((n0) m0VarT15.f6410b, str4);
        return (n0) m0VarT15.b();
    }

    public C0009i z(Map map) {
        C.d dVar = new C.d(2, 7);
        return new C0009i(m(map, new G(dVar, B2.k.f321c, false)), new C2.f((HashSet) dVar.f1047c), Collections.unmodifiableList((ArrayList) dVar.f1048d), 24);
    }

    public /* synthetic */ i(Object obj, int i) {
        this.f7593a = i;
        this.f7594b = obj;
    }

    public i(Context context) {
        this.f7593a = 0;
        C0573b c0573bA = C0573b.a(context);
        this.f7594b = c0573bA;
        c0573bA.b();
        c0573bA.c();
    }

    public i(E2.G g3, RecaptchaAction recaptchaAction) {
        this.f7593a = 23;
        this.f7594b = recaptchaAction;
        Objects.requireNonNull(g3);
    }

    public i(WorkDatabase workDatabase) {
        this.f7593a = 11;
        kotlin.jvm.internal.i.e(workDatabase, "workDatabase");
        this.f7594b = workDatabase;
    }

    public i(boolean z4) {
        this.f7593a = 13;
        this.f7594b = new AtomicBoolean(z4);
    }

    public i(K2.c cVar) {
        this.f7593a = 7;
        ArrayList arrayList = (ArrayList) cVar.b;
        this.f7594b = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public i(int i) {
        this.f7593a = i;
        switch (i) {
            case 2:
                this.f7594b = new ConcurrentHashMap();
                break;
            case 3:
                this.f7594b = new ArrayList();
                break;
            case 8:
                this.f7594b = Handler.createAsync(Looper.getMainLooper());
                break;
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                this.f7594b = new N.p(this);
                break;
            case N2.j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                this.f7594b = i4.C.b(k0.f3631b);
                break;
            default:
                this.f7594b = new HashMap();
                break;
        }
    }
}
