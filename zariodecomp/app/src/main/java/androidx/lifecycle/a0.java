package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import f4.B0;
import f4.N;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import k0.AbstractC0653c;
import l.C0708q;
import x0.C1031a;
import x0.InterfaceC1033d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\a0.smali */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f4626a = new g0();

    /* renamed from: b, reason: collision with root package name */
    public static final g0 f4627b = new g0();

    /* renamed from: c, reason: collision with root package name */
    public static final g0 f4628c = new g0();

    public static final void a(f0 f0Var, C0708q registry, C0242x lifecycle) {
        kotlin.jvm.internal.i.e(registry, "registry");
        kotlin.jvm.internal.i.e(lifecycle, "lifecycle");
        Y y4 = (Y) f0Var.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (y4 == null || y4.c) {
            return;
        }
        y4.a(lifecycle, registry);
        l(lifecycle, registry);
    }

    public static final Y b(C0708q registry, C0242x lifecycle, String str, Bundle bundle) {
        kotlin.jvm.internal.i.e(registry, "registry");
        kotlin.jvm.internal.i.e(lifecycle, "lifecycle");
        Bundle bundleC = registry.c(str);
        Class[] clsArr = X.f4620f;
        Y y4 = new Y(str, c(bundleC, bundle));
        y4.a(lifecycle, registry);
        l(lifecycle, registry);
        return y4;
    }

    public static X c(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new X();
            }
            HashMap map = new HashMap();
            for (String key : bundle2.keySet()) {
                kotlin.jvm.internal.i.d(key, "key");
                map.put(key, bundle2.get(key));
            }
            return new X(map);
        }
        ClassLoader classLoader = X.class.getClassLoader();
        kotlin.jvm.internal.i.b(classLoader);
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = parcelableArrayList.get(i);
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
        }
        return new X(linkedHashMap);
    }

    public static final X d(AbstractC0653c abstractC0653c) {
        kotlin.jvm.internal.i.e(abstractC0653c, "<this>");
        InterfaceC1033d interfaceC1033d = (InterfaceC1033d) abstractC0653c.a(f4626a);
        if (interfaceC1033d == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        n0 n0Var = (n0) abstractC0653c.a(f4627b);
        if (n0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) abstractC0653c.a(f4628c);
        String str = (String) abstractC0653c.a(g0.f4649b);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        x0.c cVarD = interfaceC1033d.b().d();
        b0 b0Var = cVarD instanceof b0 ? (b0) cVarD : null;
        if (b0Var == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap = ((c0) new l0(n0Var, new Z()).b(c0.class, "androidx.lifecycle.internal.SavedStateHandlesVM")).f4637a;
        X x3 = (X) linkedHashMap.get(str);
        if (x3 != null) {
            return x3;
        }
        Class[] clsArr = X.f4620f;
        b0Var.b();
        Bundle bundle2 = b0Var.f4633c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = b0Var.f4633c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = b0Var.f4633c;
        if (bundle5 != null && bundle5.isEmpty()) {
            b0Var.f4633c = null;
        }
        X xC = c(bundle3, bundle);
        linkedHashMap.put(str, xC);
        return xC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(Activity activity, n event) {
        C0242x c0242xG;
        kotlin.jvm.internal.i.e(activity, "activity");
        kotlin.jvm.internal.i.e(event, "event");
        if (!(activity instanceof InterfaceC0241v) || (c0242xG = ((InterfaceC0241v) activity).g()) == null) {
            return;
        }
        c0242xG.d(event);
    }

    public static final void f(InterfaceC1033d interfaceC1033d) {
        EnumC0236o enumC0236o = interfaceC1033d.g().f4672d;
        if (enumC0236o != EnumC0236o.f4659b && enumC0236o != EnumC0236o.f4660c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC1033d.b().d() == null) {
            b0 b0Var = new b0(interfaceC1033d.b(), (n0) interfaceC1033d);
            interfaceC1033d.b().f("androidx.lifecycle.internal.SavedStateHandlesProvider", b0Var);
            interfaceC1033d.g().a(new C1031a(b0Var, 2));
        }
    }

    public static final q g(InterfaceC0241v interfaceC0241v) {
        q qVar;
        C0242x c0242xG = interfaceC0241v.g();
        kotlin.jvm.internal.i.e(c0242xG, "<this>");
        loop0: while (true) {
            AtomicReference atomicReference = c0242xG.f4669a;
            qVar = (q) atomicReference.get();
            if (qVar == null) {
                B0 b0D = f4.E.d();
                m4.e eVar = N.f7027a;
                qVar = new q(c0242xG, S0.f.U(b0D, ((g4.d) k4.n.f8401a).f7610f));
                while (!atomicReference.compareAndSet(null, qVar)) {
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                m4.e eVar2 = N.f7027a;
                f4.E.t(qVar, ((g4.d) k4.n.f8401a).f7610f, null, new C0237p(qVar, null), 2);
                break loop0;
            }
            break;
        }
        return qVar;
    }

    public static final f4.C h(f0 f0Var) {
        f4.C c5 = (f4.C) f0Var.getTag("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (c5 != null) {
            return c5;
        }
        B0 b0D = f4.E.d();
        m4.e eVar = N.f7027a;
        return (f4.C) f0Var.setTagIfAbsent("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new C0227e(S0.f.U(b0D, ((g4.d) k4.n.f8401a).f7610f)));
    }

    public static void i(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        U.Companion.getClass();
        activity.registerActivityLifecycleCallbacks(new U());
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new V(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static final Object j(g0.S s4, X3.p pVar, Q3.j jVar) {
        Object objG;
        s4.d();
        C0242x c0242x = s4.f7399e;
        EnumC0236o enumC0236o = c0242x.f4672d;
        EnumC0236o enumC0236o2 = EnumC0236o.f4658a;
        K3.k kVar = K3.k.f2288a;
        if (enumC0236o == enumC0236o2 || (objG = f4.E.g(new S(c0242x, pVar, null), jVar)) != P3.a.f2678a) {
            objG = kVar;
        }
        return objG == P3.a.f2678a ? objG : kVar;
    }

    public static final void k(View view, InterfaceC0241v interfaceC0241v) {
        kotlin.jvm.internal.i.e(view, "<this>");
        view.setTag(2131231335, interfaceC0241v);
    }

    public static void l(C0242x c0242x, C0708q c0708q) {
        EnumC0236o enumC0236o = c0242x.f4672d;
        if (enumC0236o == EnumC0236o.f4659b || enumC0236o.compareTo(EnumC0236o.f4661d) >= 0) {
            c0708q.g();
        } else {
            c0242x.a(new C0229g(c0242x, c0708q));
        }
    }
}
