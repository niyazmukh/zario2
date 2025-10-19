package B3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\T0.smali */
public final class T0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f548a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V0 f549b;

    public /* synthetic */ T0(V0 v02, int i) {
        this.f548a = i;
        this.f549b = v02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        switch (this.f548a) {
            case 0:
                V0 v02 = this.f549b;
                if (v02.f576g.f623E == null) {
                    AtomicReference atomicReference = v02.f573d;
                    if (atomicReference.get() == Y0.f617m0) {
                        atomicReference.set(null);
                    }
                    v02.f576g.f626I.m(Y0.f614j0);
                    return;
                }
                return;
            case 1:
                if (this.f549b.f573d.get() == Y0.f617m0) {
                    this.f549b.f573d.set(null);
                }
                LinkedHashSet linkedHashSet = this.f549b.f576g.f623E;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        ((U0) it.next()).a("Channel is forcefully shutdown", null);
                    }
                }
                S0.n nVar = this.f549b.f576g.f626I;
                z3.k0 k0Var = Y0.f613i0;
                nVar.m(k0Var);
                synchronized (nVar.f2872a) {
                    arrayList = new ArrayList((HashSet) nVar.f2873b);
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC0091x) it2.next()).h(k0Var);
                }
                ((Y0) nVar.f2875d).f625H.d(k0Var);
                return;
            default:
                this.f549b.f576g.A();
                return;
        }
    }
}
