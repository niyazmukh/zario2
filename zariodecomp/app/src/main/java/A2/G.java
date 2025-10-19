package A2;

import B3.A0;
import B3.C0089w0;
import B3.InterfaceC0042f1;
import B3.RunnableC0083u0;
import B3.RunnableC0095y0;
import N2.AbstractC0156x;
import a.AbstractC0183a;
import android.os.Bundle;
import androidx.lifecycle.C0242x;
import androidx.lifecycle.EnumC0236o;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import l.C0708q;
import n.C0759d;
import n.C0761f;
import o0.C0789l;
import s2.AbstractC0869c;
import s2.C0870e;
import x0.C1031a;
import x0.InterfaceC1033d;
import y2.C1048A;
import z3.AbstractC1080d;
import z3.k0;
import z3.p0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\G.smali */
public final class G implements InterfaceC0042f1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f86a;

    /* renamed from: b, reason: collision with root package name */
    public Object f87b;

    /* renamed from: c, reason: collision with root package name */
    public Object f88c;

    public G(InterfaceC1033d interfaceC1033d) {
        this.f87b = interfaceC1033d;
        this.f88c = new C0708q();
    }

    public static C0870e b(y2.v vVar, AbstractC0869c abstractC0869c) {
        C0870e c0870e = new C0870e(Collections.emptyList(), new G1.d(vVar.c()));
        Iterator it = abstractC0869c.iterator();
        while (it.hasNext()) {
            B2.l lVar = (B2.l) ((Map.Entry) it.next()).getValue();
            if (vVar.e(lVar)) {
                c0870e = c0870e.f(lVar);
            }
        }
        return c0870e;
    }

    public static boolean e(y2.v vVar, int i, C0870e c0870e, B2.o oVar) {
        if (!(vVar.f11149f != -1)) {
            return false;
        }
        AbstractC0869c abstractC0869c = c0870e.f9681a;
        if (i != abstractC0869c.size()) {
            return true;
        }
        B2.l lVar = (B2.l) abstractC0869c.i();
        if (lVar == null) {
            return false;
        }
        return lVar.c() || t.h.a(lVar.f327f, 2) || lVar.f324c.compareTo(oVar) > 0;
    }

    public AbstractC0869c a(C0870e c0870e, y2.v vVar, B2.b bVar) {
        AbstractC0869c abstractC0869cH = ((C0009i) this.f87b).H(vVar, bVar, null);
        Iterator it = c0870e.iterator();
        while (true) {
            s2.d dVar = (s2.d) it;
            if (!((Iterator) dVar.f9680b).hasNext()) {
                return abstractC0869cH;
            }
            B2.l lVar = (B2.l) dVar.next();
            abstractC0869cH = abstractC0869cH.k(lVar.f322a, lVar);
        }
    }

    public IllegalArgumentException c(String str) {
        String str2;
        B2.k kVar = (B2.k) this.f88c;
        if (kVar == null || kVar.h()) {
            str2 = "";
        } else {
            str2 = " (found in field " + kVar.c() + ")";
        }
        return new IllegalArgumentException(B.a.l("Invalid data. ", str, str2));
    }

    public boolean d() {
        String str;
        C.d dVar = (C.d) this.f87b;
        int iC = t.h.c(dVar.f1046b);
        if (iC == 0 || iC == 1 || iC == 2) {
            return true;
        }
        if (iC == 3 || iC == 4) {
            return false;
        }
        int i = dVar.f1046b;
        if (i == 1) {
            str = "Set";
        } else if (i == 2) {
            str = "MergeSet";
        } else if (i == 3) {
            str = "Update";
        } else if (i == 4) {
            str = "Argument";
        } else {
            if (i != 5) {
                throw null;
            }
            str = "ArrayArgument";
        }
        AbstractC0183a.z("Unexpected case for UserDataSource: %s", str);
        throw null;
    }

    public void f() {
        InterfaceC1033d interfaceC1033d = (InterfaceC1033d) this.f87b;
        C0242x c0242xG = interfaceC1033d.g();
        if (c0242xG.f4672d != EnumC0236o.f4659b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        c0242xG.a(new C1031a(interfaceC1033d, 0));
        C0708q c0708q = (C0708q) this.f88c;
        c0708q.getClass();
        if (c0708q.f8661c) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        c0242xG.a(new C0789l(c0708q, 2));
        c0708q.f8661c = true;
        this.f86a = true;
    }

    public AbstractC0869c g(y2.v vVar) {
        if (vVar.f()) {
            return null;
        }
        C1048A c1048aG = vVar.g();
        int iA = ((InterfaceC0007g) this.f88c).a(c1048aG);
        if (t.h.a(iA, 1)) {
            return null;
        }
        if ((vVar.f11149f != -1) && t.h.a(iA, 2)) {
            return g(vVar.d(-1L));
        }
        List listM = ((InterfaceC0007g) this.f88c).m(c1048aG);
        AbstractC0183a.N(listM != null, "index manager must return results for partial and full indexes.", new Object[0]);
        AbstractC0869c abstractC0869cG = ((C0009i) this.f87b).G(listM);
        B2.b bVarN = ((InterfaceC0007g) this.f88c).n(c1048aG);
        C0870e c0870eB = b(vVar, abstractC0869cG);
        return e(vVar, ((ArrayList) listM).size(), c0870eB, bVarN.f302a) ? g(vVar.d(-1L)) : a(c0870eB, vVar, bVarN);
    }

    public void h(Bundle bundle) {
        if (!this.f86a) {
            f();
        }
        C0242x c0242xG = ((InterfaceC1033d) this.f87b).g();
        if (c0242xG.f4672d.compareTo(EnumC0236o.f4661d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c0242xG.f4672d).toString());
        }
        C0708q c0708q = (C0708q) this.f88c;
        if (!c0708q.f8661c) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c0708q.f8662d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c0708q.f8659a = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c0708q.f8662d = true;
    }

    public void i(Bundle outBundle) {
        kotlin.jvm.internal.i.e(outBundle, "outBundle");
        C0708q c0708q = (C0708q) this.f88c;
        c0708q.getClass();
        Bundle bundle = new Bundle();
        Bundle bundle2 = (Bundle) c0708q.f8659a;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        C0761f c0761f = (C0761f) c0708q.f8664f;
        c0761f.getClass();
        C0759d c0759d = new C0759d(c0761f);
        c0761f.f8961c.put(c0759d, Boolean.FALSE);
        while (c0759d.hasNext()) {
            Map.Entry entry = (Map.Entry) c0759d.next();
            bundle.putBundle((String) entry.getKey(), ((x0.c) entry.getValue()).a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }

    public void j(w2.g gVar, Map map, w2.B b5) {
        FirebaseFirestore firebaseFirestore = (FirebaseFirestore) this.f87b;
        firebaseFirestore.getClass();
        if (gVar.f10930b != firebaseFirestore) {
            throw new IllegalArgumentException("Provided document reference is from a different Cloud Firestore instance.");
        }
        AbstractC0156x.i(b5, "Provided options must not be null.");
        if (this.f86a) {
            throw new IllegalStateException("A write batch can no longer be used after commit() has been called.");
        }
        boolean z4 = b5.f10914a;
        g1.i iVar = firebaseFirestore.f6403g;
        ((ArrayList) this.f88c).add((z4 ? iVar.z(map) : iVar.A(map)).i0(gVar.f10929a, C2.n.f1102c));
    }

    public void k(ScheduledFuture scheduledFuture) {
        synchronized (this.f87b) {
            if (!this.f86a) {
                this.f88c = scheduledFuture;
            }
        }
    }

    public void l(boolean z4) {
        C0089w0 c0089w0 = (C0089w0) this.f87b;
        A0 a02 = (A0) this.f88c;
        a02.getClass();
        a02.f357k.execute(new RunnableC0083u0(0, a02, c0089w0, z4));
    }

    public void m(k0 k0Var) {
        A0 a02 = (A0) this.f88c;
        a02.i.m(2, "{0} SHUTDOWN with {1}", ((C0089w0) this.f87b).c(), A0.j(k0Var));
        this.f86a = true;
        a02.f357k.execute(new B3.I(15, this, k0Var));
    }

    public void n() {
        S0.f.q("transportShutdown() must be called before transportTerminated().", this.f86a);
        A0 a02 = (A0) this.f88c;
        AbstractC1080d abstractC1080d = a02.i;
        C0089w0 c0089w0 = (C0089w0) this.f87b;
        abstractC1080d.m(2, "{0} Terminated", c0089w0.c());
        RunnableC0083u0 runnableC0083u0 = new RunnableC0083u0(0, a02, c0089w0, false);
        p0 p0Var = a02.f357k;
        p0Var.execute(runnableC0083u0);
        Iterator it = a02.f356j.iterator();
        if (!it.hasNext()) {
            p0Var.execute(new RunnableC0095y0(this, 1));
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            c0089w0.e();
            throw null;
        }
    }

    public G(C.d dVar, B2.k kVar, boolean z4) {
        this.f87b = dVar;
        this.f88c = kVar;
        this.f86a = z4;
    }

    public G(Object obj) {
        this.f87b = obj;
    }
}
