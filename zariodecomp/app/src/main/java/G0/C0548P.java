package g0;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.C0242x;
import androidx.lifecycle.EnumC0236o;
import androidx.lifecycle.l0;
import b2.ViewOnAttachStateChangeListenerC0275n;
import h0.C0585a;
import h0.C0587c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import l0.C0726a;
import l0.C0728c;
import q.C0835l;
import x0.C1031a;

/* renamed from: g0.P, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\P.smali */
public final class C0548P {

    /* renamed from: a, reason: collision with root package name */
    public final S0.e f7383a;

    /* renamed from: b, reason: collision with root package name */
    public final S0.n f7384b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0567t f7385c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7386d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f7387e = -1;

    public C0548P(S0.e eVar, S0.n nVar, AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        this.f7383a = eVar;
        this.f7384b = nVar;
        this.f7385c = abstractComponentCallbacksC0567t;
    }

    public final void a() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = this.f7385c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0567t);
        }
        Bundle bundle = abstractComponentCallbacksC0567t.f7528b;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        abstractComponentCallbacksC0567t.f7547y.N();
        abstractComponentCallbacksC0567t.f7527a = 3;
        abstractComponentCallbacksC0567t.f7510H = false;
        abstractComponentCallbacksC0567t.z();
        if (!abstractComponentCallbacksC0567t.f7510H) {
            throw new X(B.a.j("Fragment ", abstractComponentCallbacksC0567t, " did not call through to super.onActivityCreated()"));
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0567t);
        }
        if (abstractComponentCallbacksC0567t.f7512J != null) {
            Bundle bundle2 = abstractComponentCallbacksC0567t.f7528b;
            Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0567t.f7529c;
            if (sparseArray != null) {
                abstractComponentCallbacksC0567t.f7512J.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0567t.f7529c = null;
            }
            abstractComponentCallbacksC0567t.f7510H = false;
            abstractComponentCallbacksC0567t.P(bundle3);
            if (!abstractComponentCallbacksC0567t.f7510H) {
                throw new X(B.a.j("Fragment ", abstractComponentCallbacksC0567t, " did not call through to super.onViewStateRestored()"));
            }
            if (abstractComponentCallbacksC0567t.f7512J != null) {
                abstractComponentCallbacksC0567t.f7521S.c(androidx.lifecycle.n.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0567t.f7528b = null;
        C0542J c0542j = abstractComponentCallbacksC0567t.f7547y;
        c0542j.f7321F = false;
        c0542j.G = false;
        c0542j.f7327M.f7368f = false;
        c0542j.t(4);
        this.f7383a.c(false);
    }

    public final void b() {
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t;
        View view;
        View view2;
        int iIndexOfChild = -1;
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t2 = this.f7385c;
        View view3 = abstractComponentCallbacksC0567t2.f7511I;
        while (true) {
            abstractComponentCallbacksC0567t = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(2131230954);
            AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t3 = tag instanceof AbstractComponentCallbacksC0567t ? (AbstractComponentCallbacksC0567t) tag : null;
            if (abstractComponentCallbacksC0567t3 != null) {
                abstractComponentCallbacksC0567t = abstractComponentCallbacksC0567t3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t4 = abstractComponentCallbacksC0567t2.f7548z;
        if (abstractComponentCallbacksC0567t != null && !abstractComponentCallbacksC0567t.equals(abstractComponentCallbacksC0567t4)) {
            int i = abstractComponentCallbacksC0567t2.f7505B;
            C0587c c0587c = h0.d.f7618a;
            h0.d.b(new C0585a(abstractComponentCallbacksC0567t2, "Attempting to nest fragment " + abstractComponentCallbacksC0567t2 + " within the view of parent fragment " + abstractComponentCallbacksC0567t + " via container with ID " + i + " without using parent's childFragmentManager"));
            h0.d.a(abstractComponentCallbacksC0567t2).getClass();
        }
        S0.n nVar = this.f7384b;
        nVar.getClass();
        ViewGroup viewGroup = abstractComponentCallbacksC0567t2.f7511I;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) nVar.f2872a;
            int iIndexOf = arrayList.indexOf(abstractComponentCallbacksC0567t2);
            int i5 = iIndexOf - 1;
            while (true) {
                if (i5 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t5 = (AbstractComponentCallbacksC0567t) arrayList.get(iIndexOf);
                        if (abstractComponentCallbacksC0567t5.f7511I == viewGroup && (view = abstractComponentCallbacksC0567t5.f7512J) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t6 = (AbstractComponentCallbacksC0567t) arrayList.get(i5);
                    if (abstractComponentCallbacksC0567t6.f7511I == viewGroup && (view2 = abstractComponentCallbacksC0567t6.f7512J) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i5--;
                }
            }
        }
        abstractComponentCallbacksC0567t2.f7511I.addView(abstractComponentCallbacksC0567t2.f7512J, iIndexOfChild);
    }

    public final void c() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = this.f7385c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0567t);
        }
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t2 = abstractComponentCallbacksC0567t.f7533k;
        C0548P c0548p = null;
        S0.n nVar = this.f7384b;
        if (abstractComponentCallbacksC0567t2 != null) {
            C0548P c0548p2 = (C0548P) ((HashMap) nVar.f2873b).get(abstractComponentCallbacksC0567t2.f7531e);
            if (c0548p2 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0567t + " declared target fragment " + abstractComponentCallbacksC0567t.f7533k + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0567t.f7534l = abstractComponentCallbacksC0567t.f7533k.f7531e;
            abstractComponentCallbacksC0567t.f7533k = null;
            c0548p = c0548p2;
        } else {
            String str = abstractComponentCallbacksC0567t.f7534l;
            if (str != null && (c0548p = (C0548P) ((HashMap) nVar.f2873b).get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(abstractComponentCallbacksC0567t);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(B.a.m(sb, abstractComponentCallbacksC0567t.f7534l, " that does not belong to this FragmentManager!"));
            }
        }
        if (c0548p != null) {
            c0548p.k();
        }
        C0542J c0542j = abstractComponentCallbacksC0567t.f7545w;
        abstractComponentCallbacksC0567t.f7546x = c0542j.f7347u;
        abstractComponentCallbacksC0567t.f7548z = c0542j.f7349w;
        S0.e eVar = this.f7383a;
        eVar.i(false);
        ArrayList arrayList = abstractComponentCallbacksC0567t.X;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC0566s) it.next()).a();
        }
        arrayList.clear();
        abstractComponentCallbacksC0567t.f7547y.b(abstractComponentCallbacksC0567t.f7546x, abstractComponentCallbacksC0567t.i(), abstractComponentCallbacksC0567t);
        abstractComponentCallbacksC0567t.f7527a = 0;
        abstractComponentCallbacksC0567t.f7510H = false;
        abstractComponentCallbacksC0567t.C(abstractComponentCallbacksC0567t.f7546x.f7552b);
        if (!abstractComponentCallbacksC0567t.f7510H) {
            throw new X(B.a.j("Fragment ", abstractComponentCallbacksC0567t, " did not call through to super.onAttach()"));
        }
        C0542J c0542j2 = abstractComponentCallbacksC0567t.f7545w;
        Iterator it2 = c0542j2.f7340n.iterator();
        while (it2.hasNext()) {
            ((InterfaceC0546N) it2.next()).a(c0542j2, abstractComponentCallbacksC0567t);
        }
        C0542J c0542j3 = abstractComponentCallbacksC0567t.f7547y;
        c0542j3.f7321F = false;
        c0542j3.G = false;
        c0542j3.f7327M.f7368f = false;
        c0542j3.t(0);
        eVar.d(false);
    }

    public final int d() {
        Object next;
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = this.f7385c;
        if (abstractComponentCallbacksC0567t.f7545w == null) {
            return abstractComponentCallbacksC0567t.f7527a;
        }
        int iMin = this.f7387e;
        int iOrdinal = abstractComponentCallbacksC0567t.f7519Q.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0567t.f7540r) {
            if (abstractComponentCallbacksC0567t.f7541s) {
                iMin = Math.max(this.f7387e, 2);
                View view = abstractComponentCallbacksC0567t.f7512J;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f7387e < 4 ? Math.min(iMin, abstractComponentCallbacksC0567t.f7527a) : Math.min(iMin, 1);
            }
        }
        if (!abstractComponentCallbacksC0567t.f7537o) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0567t.f7511I;
        if (viewGroup != null) {
            C0556h c0556hG = C0556h.g(viewGroup, abstractComponentCallbacksC0567t.p());
            c0556hG.getClass();
            V vE = c0556hG.e(abstractComponentCallbacksC0567t);
            int i = vE != null ? vE.f7407b : 0;
            Iterator it = c0556hG.f7462c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                V v4 = (V) next;
                if (kotlin.jvm.internal.i.a(v4.f7408c, abstractComponentCallbacksC0567t) && !v4.f7411f) {
                    break;
                }
            }
            V v5 = (V) next;
            i = v5 != null ? v5.f7407b : 0;
            int i5 = i == 0 ? -1 : W.f7413a[t.h.c(i)];
            if (i5 != -1 && i5 != 1) {
                i = i;
            }
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (abstractComponentCallbacksC0567t.f7538p) {
            iMin = abstractComponentCallbacksC0567t.y() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0567t.f7513K && abstractComponentCallbacksC0567t.f7527a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + abstractComponentCallbacksC0567t);
        }
        return iMin;
    }

    public final void e() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = this.f7385c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0567t);
        }
        Bundle bundle = abstractComponentCallbacksC0567t.f7528b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        if (abstractComponentCallbacksC0567t.f7517O) {
            abstractComponentCallbacksC0567t.f7527a = 1;
            abstractComponentCallbacksC0567t.U();
            return;
        }
        S0.e eVar = this.f7383a;
        eVar.j(false);
        abstractComponentCallbacksC0567t.f7547y.N();
        abstractComponentCallbacksC0567t.f7527a = 1;
        abstractComponentCallbacksC0567t.f7510H = false;
        abstractComponentCallbacksC0567t.f7520R.a(new C1031a(abstractComponentCallbacksC0567t, 4));
        abstractComponentCallbacksC0567t.D(bundle2);
        abstractComponentCallbacksC0567t.f7517O = true;
        if (!abstractComponentCallbacksC0567t.f7510H) {
            throw new X(B.a.j("Fragment ", abstractComponentCallbacksC0567t, " did not call through to super.onCreate()"));
        }
        abstractComponentCallbacksC0567t.f7520R.d(androidx.lifecycle.n.ON_CREATE);
        eVar.e(false);
    }

    public final void f() throws Resources.NotFoundException {
        String resourceName;
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = this.f7385c;
        if (abstractComponentCallbacksC0567t.f7540r) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0567t);
        }
        Bundle bundle = abstractComponentCallbacksC0567t.f7528b;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterI = abstractComponentCallbacksC0567t.I(bundle2);
        ViewGroup viewGroup2 = abstractComponentCallbacksC0567t.f7511I;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = abstractComponentCallbacksC0567t.f7505B;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException(B.a.j("Cannot create fragment ", abstractComponentCallbacksC0567t, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0567t.f7545w.f7348v.Y(i);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0567t.f7542t) {
                        try {
                            resourceName = abstractComponentCallbacksC0567t.q().getResourceName(abstractComponentCallbacksC0567t.f7505B);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0567t.f7505B) + " (" + resourceName + ") for fragment " + abstractComponentCallbacksC0567t);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C0587c c0587c = h0.d.f7618a;
                    h0.d.b(new C0585a(abstractComponentCallbacksC0567t, "Attempting to add fragment " + abstractComponentCallbacksC0567t + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    h0.d.a(abstractComponentCallbacksC0567t).getClass();
                }
            }
        }
        abstractComponentCallbacksC0567t.f7511I = viewGroup;
        abstractComponentCallbacksC0567t.Q(layoutInflaterI, viewGroup, bundle2);
        if (abstractComponentCallbacksC0567t.f7512J != null) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + abstractComponentCallbacksC0567t);
            }
            abstractComponentCallbacksC0567t.f7512J.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0567t.f7512J.setTag(2131230954, abstractComponentCallbacksC0567t);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC0567t.f7507D) {
                abstractComponentCallbacksC0567t.f7512J.setVisibility(8);
            }
            View view = abstractComponentCallbacksC0567t.f7512J;
            WeakHashMap weakHashMap = M.S.f2363a;
            if (M.E.b(view)) {
                M.F.c(abstractComponentCallbacksC0567t.f7512J);
            } else {
                View view2 = abstractComponentCallbacksC0567t.f7512J;
                view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0275n(view2, 1));
            }
            Bundle bundle3 = abstractComponentCallbacksC0567t.f7528b;
            if (bundle3 != null) {
                bundle3.getBundle("savedInstanceState");
            }
            abstractComponentCallbacksC0567t.O(abstractComponentCallbacksC0567t.f7512J);
            abstractComponentCallbacksC0567t.f7547y.t(2);
            this.f7383a.o(false);
            int visibility = abstractComponentCallbacksC0567t.f7512J.getVisibility();
            abstractComponentCallbacksC0567t.k().f7501j = abstractComponentCallbacksC0567t.f7512J.getAlpha();
            if (abstractComponentCallbacksC0567t.f7511I != null && visibility == 0) {
                View viewFindFocus = abstractComponentCallbacksC0567t.f7512J.findFocus();
                if (viewFindFocus != null) {
                    abstractComponentCallbacksC0567t.k().f7502k = viewFindFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC0567t);
                    }
                }
                abstractComponentCallbacksC0567t.f7512J.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0567t.f7527a = 2;
    }

    public final void g() {
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567tD;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = this.f7385c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0567t);
        }
        boolean zIsChangingConfigurations = true;
        boolean z4 = abstractComponentCallbacksC0567t.f7538p && !abstractComponentCallbacksC0567t.y();
        S0.n nVar = this.f7384b;
        if (z4 && !abstractComponentCallbacksC0567t.f7539q) {
            nVar.r(null, abstractComponentCallbacksC0567t.f7531e);
        }
        if (!z4) {
            C0545M c0545m = (C0545M) nVar.f2875d;
            if (!((c0545m.f7363a.containsKey(abstractComponentCallbacksC0567t.f7531e) && c0545m.f7366d) ? c0545m.f7367e : true)) {
                String str = abstractComponentCallbacksC0567t.f7534l;
                if (str != null && (abstractComponentCallbacksC0567tD = nVar.d(str)) != null && abstractComponentCallbacksC0567tD.f7509F) {
                    abstractComponentCallbacksC0567t.f7533k = abstractComponentCallbacksC0567tD;
                }
                abstractComponentCallbacksC0567t.f7527a = 0;
                return;
            }
        }
        C0569v c0569v = abstractComponentCallbacksC0567t.f7546x;
        if (c0569v != null) {
            zIsChangingConfigurations = ((C0545M) nVar.f2875d).f7367e;
        } else {
            AbstractActivityC0570w abstractActivityC0570w = c0569v.f7552b;
            if (abstractActivityC0570w != null) {
                zIsChangingConfigurations = true ^ abstractActivityC0570w.isChangingConfigurations();
            }
        }
        if ((z4 && !abstractComponentCallbacksC0567t.f7539q) || zIsChangingConfigurations) {
            ((C0545M) nVar.f2875d).b(abstractComponentCallbacksC0567t, false);
        }
        abstractComponentCallbacksC0567t.f7547y.k();
        abstractComponentCallbacksC0567t.f7520R.d(androidx.lifecycle.n.ON_DESTROY);
        abstractComponentCallbacksC0567t.f7527a = 0;
        abstractComponentCallbacksC0567t.f7510H = false;
        abstractComponentCallbacksC0567t.f7517O = false;
        abstractComponentCallbacksC0567t.F();
        if (!abstractComponentCallbacksC0567t.f7510H) {
            throw new X(B.a.j("Fragment ", abstractComponentCallbacksC0567t, " did not call through to super.onDestroy()"));
        }
        this.f7383a.f(false);
        Iterator it = nVar.f().iterator();
        while (it.hasNext()) {
            C0548P c0548p = (C0548P) it.next();
            if (c0548p != null) {
                String str2 = abstractComponentCallbacksC0567t.f7531e;
                AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t2 = c0548p.f7385c;
                if (str2.equals(abstractComponentCallbacksC0567t2.f7534l)) {
                    abstractComponentCallbacksC0567t2.f7533k = abstractComponentCallbacksC0567t;
                    abstractComponentCallbacksC0567t2.f7534l = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0567t.f7534l;
        if (str3 != null) {
            abstractComponentCallbacksC0567t.f7533k = nVar.d(str3);
        }
        nVar.l(this);
    }

    public final void h() {
        View view;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = this.f7385c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0567t);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0567t.f7511I;
        if (viewGroup != null && (view = abstractComponentCallbacksC0567t.f7512J) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0567t.f7547y.t(1);
        if (abstractComponentCallbacksC0567t.f7512J != null) {
            S s4 = abstractComponentCallbacksC0567t.f7521S;
            s4.d();
            if (s4.f7399e.f4672d.compareTo(EnumC0236o.f4660c) >= 0) {
                abstractComponentCallbacksC0567t.f7521S.c(androidx.lifecycle.n.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC0567t.f7527a = 1;
        abstractComponentCallbacksC0567t.f7510H = false;
        abstractComponentCallbacksC0567t.G();
        if (!abstractComponentCallbacksC0567t.f7510H) {
            throw new X(B.a.j("Fragment ", abstractComponentCallbacksC0567t, " did not call through to super.onDestroyView()"));
        }
        C0835l c0835l = ((C0728c) new l0(abstractComponentCallbacksC0567t.e(), C0728c.f8751c).a(C0728c.class)).f8752a;
        int iF = c0835l.f();
        for (int i = 0; i < iF; i++) {
            ((C0726a) c0835l.g(i)).k();
        }
        abstractComponentCallbacksC0567t.f7543u = false;
        this.f7383a.p(false);
        abstractComponentCallbacksC0567t.f7511I = null;
        abstractComponentCallbacksC0567t.f7512J = null;
        abstractComponentCallbacksC0567t.f7521S = null;
        abstractComponentCallbacksC0567t.f7522T.j(null);
        abstractComponentCallbacksC0567t.f7541s = false;
    }

    public final void i() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = this.f7385c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0567t);
        }
        abstractComponentCallbacksC0567t.f7527a = -1;
        abstractComponentCallbacksC0567t.f7510H = false;
        abstractComponentCallbacksC0567t.H();
        if (!abstractComponentCallbacksC0567t.f7510H) {
            throw new X(B.a.j("Fragment ", abstractComponentCallbacksC0567t, " did not call through to super.onDetach()"));
        }
        C0542J c0542j = abstractComponentCallbacksC0567t.f7547y;
        if (!c0542j.f7322H) {
            c0542j.k();
            abstractComponentCallbacksC0567t.f7547y = new C0542J();
        }
        this.f7383a.g(false);
        abstractComponentCallbacksC0567t.f7527a = -1;
        abstractComponentCallbacksC0567t.f7546x = null;
        abstractComponentCallbacksC0567t.f7548z = null;
        abstractComponentCallbacksC0567t.f7545w = null;
        if (!abstractComponentCallbacksC0567t.f7538p || abstractComponentCallbacksC0567t.y()) {
            C0545M c0545m = (C0545M) this.f7384b.f2875d;
            boolean z4 = true;
            if (c0545m.f7363a.containsKey(abstractComponentCallbacksC0567t.f7531e) && c0545m.f7366d) {
                z4 = c0545m.f7367e;
            }
            if (!z4) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0567t);
        }
        abstractComponentCallbacksC0567t.v();
    }

    public final void j() {
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = this.f7385c;
        if (abstractComponentCallbacksC0567t.f7540r && abstractComponentCallbacksC0567t.f7541s && !abstractComponentCallbacksC0567t.f7543u) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0567t);
            }
            Bundle bundle = abstractComponentCallbacksC0567t.f7528b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            abstractComponentCallbacksC0567t.Q(abstractComponentCallbacksC0567t.I(bundle2), null, bundle2);
            View view = abstractComponentCallbacksC0567t.f7512J;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0567t.f7512J.setTag(2131230954, abstractComponentCallbacksC0567t);
                if (abstractComponentCallbacksC0567t.f7507D) {
                    abstractComponentCallbacksC0567t.f7512J.setVisibility(8);
                }
                Bundle bundle3 = abstractComponentCallbacksC0567t.f7528b;
                if (bundle3 != null) {
                    bundle3.getBundle("savedInstanceState");
                }
                abstractComponentCallbacksC0567t.O(abstractComponentCallbacksC0567t.f7512J);
                abstractComponentCallbacksC0567t.f7547y.t(2);
                this.f7383a.o(false);
                abstractComponentCallbacksC0567t.f7527a = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0147, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            Method dump skipped, instructions count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.C0548P.k():void");
    }

    public final void l() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = this.f7385c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0567t);
        }
        abstractComponentCallbacksC0567t.f7547y.t(5);
        if (abstractComponentCallbacksC0567t.f7512J != null) {
            abstractComponentCallbacksC0567t.f7521S.c(androidx.lifecycle.n.ON_PAUSE);
        }
        abstractComponentCallbacksC0567t.f7520R.d(androidx.lifecycle.n.ON_PAUSE);
        abstractComponentCallbacksC0567t.f7527a = 6;
        abstractComponentCallbacksC0567t.f7510H = true;
        this.f7383a.h(false);
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = this.f7385c;
        Bundle bundle = abstractComponentCallbacksC0567t.f7528b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (abstractComponentCallbacksC0567t.f7528b.getBundle("savedInstanceState") == null) {
            abstractComponentCallbacksC0567t.f7528b.putBundle("savedInstanceState", new Bundle());
        }
        abstractComponentCallbacksC0567t.f7529c = abstractComponentCallbacksC0567t.f7528b.getSparseParcelableArray("viewState");
        abstractComponentCallbacksC0567t.f7530d = abstractComponentCallbacksC0567t.f7528b.getBundle("viewRegistryState");
        C0547O c0547o = (C0547O) abstractComponentCallbacksC0567t.f7528b.getParcelable("state");
        if (c0547o != null) {
            abstractComponentCallbacksC0567t.f7534l = c0547o.f7380p;
            abstractComponentCallbacksC0567t.f7535m = c0547o.f7381q;
            abstractComponentCallbacksC0567t.f7514L = c0547o.f7382r;
        }
        if (abstractComponentCallbacksC0567t.f7514L) {
            return;
        }
        abstractComponentCallbacksC0567t.f7513K = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            r7 = this;
            r0 = 3
            java.lang.String r1 = "FragmentManager"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            g0.t r2 = r7.f7385c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "moveto RESUMED: "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1c:
            g0.r r0 = r2.f7515M
            r3 = 0
            if (r0 != 0) goto L23
            r0 = r3
            goto L25
        L23:
            android.view.View r0 = r0.f7502k
        L25:
            if (r0 == 0) goto L7d
            android.view.View r4 = r2.f7512J
            if (r0 != r4) goto L2c
            goto L36
        L2c:
            android.view.ViewParent r4 = r0.getParent()
        L30:
            if (r4 == 0) goto L7d
            android.view.View r5 = r2.f7512J
            if (r4 != r5) goto L78
        L36:
            boolean r4 = r0.requestFocus()
            r5 = 2
            boolean r5 = android.util.Log.isLoggable(r1, r5)
            if (r5 == 0) goto L7d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "requestFocus: Restoring focused view "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = " "
            r5.append(r0)
            if (r4 == 0) goto L55
            java.lang.String r0 = "succeeded"
            goto L57
        L55:
            java.lang.String r0 = "failed"
        L57:
            r5.append(r0)
            java.lang.String r0 = " on Fragment "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = " resulting in focused view "
            r5.append(r0)
            android.view.View r0 = r2.f7512J
            android.view.View r0 = r0.findFocus()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.v(r1, r0)
            goto L7d
        L78:
            android.view.ViewParent r4 = r4.getParent()
            goto L30
        L7d:
            g0.r r0 = r2.k()
            r0.f7502k = r3
            g0.J r0 = r2.f7547y
            r0.N()
            g0.J r0 = r2.f7547y
            r1 = 1
            r0.x(r1)
            r0 = 7
            r2.f7527a = r0
            r1 = 0
            r2.f7510H = r1
            r2.K()
            boolean r4 = r2.f7510H
            if (r4 == 0) goto Lcd
            androidx.lifecycle.x r4 = r2.f7520R
            androidx.lifecycle.n r5 = androidx.lifecycle.n.ON_RESUME
            r4.d(r5)
            android.view.View r4 = r2.f7512J
            if (r4 == 0) goto Lad
            g0.S r4 = r2.f7521S
            androidx.lifecycle.x r4 = r4.f7399e
            r4.d(r5)
        Lad:
            g0.J r4 = r2.f7547y
            r4.f7321F = r1
            r4.G = r1
            g0.M r5 = r4.f7327M
            r5.f7368f = r1
            r4.t(r0)
            S0.e r0 = r7.f7383a
            r0.k(r1)
            S0.n r7 = r7.f7384b
            java.lang.String r0 = r2.f7531e
            r7.r(r3, r0)
            r2.f7528b = r3
            r2.f7529c = r3
            r2.f7530d = r3
            return
        Lcd:
            g0.X r7 = new g0.X
            java.lang.String r0 = "Fragment "
            java.lang.String r1 = " did not call through to super.onResume()"
            java.lang.String r0 = B.a.j(r0, r2, r1)
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.C0548P.n():void");
    }

    public final Bundle o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = this.f7385c;
        if (abstractComponentCallbacksC0567t.f7527a == -1 && (bundle = abstractComponentCallbacksC0567t.f7528b) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new C0547O(abstractComponentCallbacksC0567t));
        if (abstractComponentCallbacksC0567t.f7527a > -1) {
            Bundle bundle3 = new Bundle();
            abstractComponentCallbacksC0567t.L(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f7383a.l(false);
            Bundle bundle4 = new Bundle();
            abstractComponentCallbacksC0567t.f7524V.i(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleU = abstractComponentCallbacksC0567t.f7547y.U();
            if (!bundleU.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleU);
            }
            if (abstractComponentCallbacksC0567t.f7512J != null) {
                p();
            }
            SparseArray<? extends Parcelable> sparseArray = abstractComponentCallbacksC0567t.f7529c;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = abstractComponentCallbacksC0567t.f7530d;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = abstractComponentCallbacksC0567t.f7532f;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void p() {
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = this.f7385c;
        if (abstractComponentCallbacksC0567t.f7512J == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC0567t + " with view " + abstractComponentCallbacksC0567t.f7512J);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0567t.f7512J.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0567t.f7529c = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0567t.f7521S.f7400f.i(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0567t.f7530d = bundle;
    }

    public final void q() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = this.f7385c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0567t);
        }
        abstractComponentCallbacksC0567t.f7547y.N();
        abstractComponentCallbacksC0567t.f7547y.x(true);
        abstractComponentCallbacksC0567t.f7527a = 5;
        abstractComponentCallbacksC0567t.f7510H = false;
        abstractComponentCallbacksC0567t.M();
        if (!abstractComponentCallbacksC0567t.f7510H) {
            throw new X(B.a.j("Fragment ", abstractComponentCallbacksC0567t, " did not call through to super.onStart()"));
        }
        C0242x c0242x = abstractComponentCallbacksC0567t.f7520R;
        androidx.lifecycle.n nVar = androidx.lifecycle.n.ON_START;
        c0242x.d(nVar);
        if (abstractComponentCallbacksC0567t.f7512J != null) {
            abstractComponentCallbacksC0567t.f7521S.f7399e.d(nVar);
        }
        C0542J c0542j = abstractComponentCallbacksC0567t.f7547y;
        c0542j.f7321F = false;
        c0542j.G = false;
        c0542j.f7327M.f7368f = false;
        c0542j.t(5);
        this.f7383a.m(false);
    }

    public final void r() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = this.f7385c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0567t);
        }
        C0542J c0542j = abstractComponentCallbacksC0567t.f7547y;
        c0542j.G = true;
        c0542j.f7327M.f7368f = true;
        c0542j.t(4);
        if (abstractComponentCallbacksC0567t.f7512J != null) {
            abstractComponentCallbacksC0567t.f7521S.c(androidx.lifecycle.n.ON_STOP);
        }
        abstractComponentCallbacksC0567t.f7520R.d(androidx.lifecycle.n.ON_STOP);
        abstractComponentCallbacksC0567t.f7527a = 4;
        abstractComponentCallbacksC0567t.f7510H = false;
        abstractComponentCallbacksC0567t.N();
        if (!abstractComponentCallbacksC0567t.f7510H) {
            throw new X(B.a.j("Fragment ", abstractComponentCallbacksC0567t, " did not call through to super.onStop()"));
        }
        this.f7383a.n(false);
    }

    public C0548P(S0.e eVar, S0.n nVar, ClassLoader classLoader, C0536D c0536d, Bundle bundle) {
        this.f7383a = eVar;
        this.f7384b = nVar;
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567tB = ((C0547O) bundle.getParcelable("state")).b(c0536d);
        this.f7385c = abstractComponentCallbacksC0567tB;
        abstractComponentCallbacksC0567tB.f7528b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        abstractComponentCallbacksC0567tB.W(bundle2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + abstractComponentCallbacksC0567tB);
        }
    }

    public C0548P(S0.e eVar, S0.n nVar, AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t, Bundle bundle) {
        this.f7383a = eVar;
        this.f7384b = nVar;
        this.f7385c = abstractComponentCallbacksC0567t;
        abstractComponentCallbacksC0567t.f7529c = null;
        abstractComponentCallbacksC0567t.f7530d = null;
        abstractComponentCallbacksC0567t.f7544v = 0;
        abstractComponentCallbacksC0567t.f7541s = false;
        abstractComponentCallbacksC0567t.f7537o = false;
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t2 = abstractComponentCallbacksC0567t.f7533k;
        abstractComponentCallbacksC0567t.f7534l = abstractComponentCallbacksC0567t2 != null ? abstractComponentCallbacksC0567t2.f7531e : null;
        abstractComponentCallbacksC0567t.f7533k = null;
        abstractComponentCallbacksC0567t.f7528b = bundle;
        abstractComponentCallbacksC0567t.f7532f = bundle.getBundle("arguments");
    }
}
