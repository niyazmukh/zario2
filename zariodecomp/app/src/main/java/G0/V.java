package g0;

import A2.C0004d;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\V.smali */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public int f7406a;

    /* renamed from: b, reason: collision with root package name */
    public int f7407b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0567t f7408c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f7409d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f7410e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7411f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7412g;
    public final C0548P h;

    public V(int i, int i5, C0548P fragmentStateManager, I.g gVar) {
        B.a.r(i, "finalState");
        B.a.r(i5, "lifecycleImpact");
        kotlin.jvm.internal.i.e(fragmentStateManager, "fragmentStateManager");
        AbstractComponentCallbacksC0567t fragment = fragmentStateManager.f7385c;
        kotlin.jvm.internal.i.d(fragment, "fragmentStateManager.fragment");
        B.a.r(i, "finalState");
        B.a.r(i5, "lifecycleImpact");
        kotlin.jvm.internal.i.e(fragment, "fragment");
        this.f7406a = i;
        this.f7407b = i5;
        this.f7408c = fragment;
        this.f7409d = new ArrayList();
        this.f7410e = new LinkedHashSet();
        gVar.a(new C0004d(this, 13));
        this.h = fragmentStateManager;
    }

    public final void a() {
        if (this.f7411f) {
            return;
        }
        this.f7411f = true;
        LinkedHashSet linkedHashSet = this.f7410e;
        if (linkedHashSet.isEmpty()) {
            b();
            return;
        }
        for (I.g gVar : L3.j.y0(linkedHashSet)) {
            synchronized (gVar) {
                try {
                    if (!gVar.f1913a) {
                        gVar.f1913a = true;
                        gVar.f1915c = true;
                        I.f fVar = gVar.f1914b;
                        if (fVar != null) {
                            try {
                                fVar.d();
                            } catch (Throwable th) {
                                synchronized (gVar) {
                                    gVar.f1915c = false;
                                    gVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (gVar) {
                            gVar.f1915c = false;
                            gVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.f7412g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f7412g = true;
            Iterator it = this.f7409d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.h.k();
    }

    public final void c(int i, int i5) {
        B.a.r(i, "finalState");
        B.a.r(i5, "lifecycleImpact");
        int iC = t.h.c(i5);
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = this.f7408c;
        if (iC == 0) {
            if (this.f7406a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0567t + " mFinalState = " + B.a.u(this.f7406a) + " -> " + B.a.u(i) + '.');
                }
                this.f7406a = i;
                return;
            }
            return;
        }
        if (iC == 1) {
            if (this.f7406a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0567t + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + B.a.t(this.f7407b) + " to ADDING.");
                }
                this.f7406a = 2;
                this.f7407b = 2;
                return;
            }
            return;
        }
        if (iC != 2) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0567t + " mFinalState = " + B.a.u(this.f7406a) + " -> REMOVED. mLifecycleImpact  = " + B.a.t(this.f7407b) + " to REMOVING.");
        }
        this.f7406a = 1;
        this.f7407b = 3;
    }

    public final void d() {
        int i = this.f7407b;
        C0548P c0548p = this.h;
        if (i != 2) {
            if (i == 3) {
                AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = c0548p.f7385c;
                kotlin.jvm.internal.i.d(abstractComponentCallbacksC0567t, "fragmentStateManager.fragment");
                View viewT = abstractComponentCallbacksC0567t.T();
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Clearing focus " + viewT.findFocus() + " on view " + viewT + " for Fragment " + abstractComponentCallbacksC0567t);
                }
                viewT.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t2 = c0548p.f7385c;
        kotlin.jvm.internal.i.d(abstractComponentCallbacksC0567t2, "fragmentStateManager.fragment");
        View viewFindFocus = abstractComponentCallbacksC0567t2.f7512J.findFocus();
        if (viewFindFocus != null) {
            abstractComponentCallbacksC0567t2.k().f7502k = viewFindFocus;
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC0567t2);
            }
        }
        View viewT2 = this.f7408c.T();
        if (viewT2.getParent() == null) {
            c0548p.b();
            viewT2.setAlpha(0.0f);
        }
        if (viewT2.getAlpha() == 0.0f && viewT2.getVisibility() == 0) {
            viewT2.setVisibility(4);
        }
        r rVar = abstractComponentCallbacksC0567t2.f7515M;
        viewT2.setAlpha(rVar == null ? 1.0f : rVar.f7501j);
    }

    public final String toString() {
        StringBuilder sbO = B.a.o("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        sbO.append(B.a.u(this.f7406a));
        sbO.append(" lifecycleImpact = ");
        sbO.append(B.a.t(this.f7407b));
        sbO.append(" fragment = ");
        sbO.append(this.f7408c);
        sbO.append('}');
        return sbO.toString();
    }
}
