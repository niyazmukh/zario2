package x0;

import L3.j;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.InterfaceC0231i;
import androidx.lifecycle.InterfaceC0239t;
import androidx.lifecycle.InterfaceC0241v;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.f0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n;
import androidx.lifecycle.n0;
import b.AbstractActivityC0255l;
import b.AbstractC0252i;
import b.x;
import g0.AbstractComponentCallbacksC0567t;
import g0.DialogInterfaceOnCancelListenerC0561m;
import i4.I;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.i;
import l.C0708q;
import o0.C0787j;
import q0.AbstractC0839c;
import q0.C0840d;
import r.AbstractC0854a;

/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\x0.1\a.smali */
public final class C1031a implements InterfaceC0239t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11012a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11013b;

    public /* synthetic */ C1031a(Object obj, int i) {
        this.f11012a = i;
        this.f11013b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0239t
    public final void onStateChanged(InterfaceC0241v interfaceC0241v, n nVar) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View view;
        int iNextIndex;
        switch (this.f11012a) {
            case 0:
                if (nVar != n.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC0241v.g().f(this);
                InterfaceC1033d interfaceC1033d = (InterfaceC1033d) this.f11013b;
                Bundle bundleC = interfaceC1033d.b().c("androidx.savedstate.Restarter");
                if (bundleC == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleC.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, C1031a.class.getClassLoader()).asSubclass(InterfaceC1032b.class);
                        i.d(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                i.d(objNewInstance, "{\n                constr…wInstance()\n            }");
                                if (!(interfaceC1033d instanceof n0)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                m0 m0VarE = ((n0) interfaceC1033d).e();
                                C0708q c0708qB = interfaceC1033d.b();
                                m0VarE.getClass();
                                LinkedHashMap linkedHashMap = m0VarE.f4657a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String key = (String) it.next();
                                    i.e(key, "key");
                                    f0 f0Var = (f0) linkedHashMap.get(key);
                                    i.b(f0Var);
                                    a0.a(f0Var, c0708qB, interfaceC1033d.g());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    c0708qB.g();
                                }
                            } catch (Exception e5) {
                                throw new RuntimeException(AbstractC0854a.b("Failed to instantiate ", str), e5);
                            }
                        } catch (NoSuchMethodException e6) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e6);
                        }
                    } catch (ClassNotFoundException e7) {
                        throw new RuntimeException(B.a.l("Class ", str, " wasn't found"), e7);
                    }
                }
                return;
            case 1:
                new HashMap();
                InterfaceC0231i[] interfaceC0231iArr = (InterfaceC0231i[]) this.f11013b;
                if (interfaceC0231iArr.length > 0) {
                    InterfaceC0231i interfaceC0231i = interfaceC0231iArr[0];
                    throw null;
                }
                if (interfaceC0231iArr.length <= 0) {
                    return;
                }
                InterfaceC0231i interfaceC0231i2 = interfaceC0231iArr[0];
                throw null;
            case 2:
                if (nVar != n.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + nVar).toString());
                }
                interfaceC0241v.g().f(this);
                ((b0) this.f11013b).b();
                return;
            case 3:
                if (nVar != n.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                    return;
                }
                x xVar = ((AbstractActivityC0255l) this.f11013b).f4909l;
                OnBackInvokedDispatcher invoker = AbstractC0252i.a((AbstractActivityC0255l) interfaceC0241v);
                xVar.getClass();
                i.e(invoker, "invoker");
                xVar.f4946e = invoker;
                xVar.c(xVar.f4948g);
                return;
            case 4:
                if (nVar != n.ON_STOP || (view = ((AbstractComponentCallbacksC0567t) this.f11013b).f7512J) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            default:
                int i = AbstractC0839c.f9438a[nVar.ordinal()];
                C0840d c0840d = (C0840d) this.f11013b;
                if (i == 1) {
                    DialogInterfaceOnCancelListenerC0561m dialogInterfaceOnCancelListenerC0561m = (DialogInterfaceOnCancelListenerC0561m) interfaceC0241v;
                    Iterable iterable = (Iterable) ((I) c0840d.b().f9090e.f7964a).K();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it2 = iterable.iterator();
                        while (it2.hasNext()) {
                            if (i.a(((C0787j) it2.next()).f9073f, dialogInterfaceOnCancelListenerC0561m.f7506C)) {
                                return;
                            }
                        }
                    }
                    dialogInterfaceOnCancelListenerC0561m.Y(false, false);
                    return;
                }
                Object obj = null;
                if (i == 2) {
                    DialogInterfaceOnCancelListenerC0561m dialogInterfaceOnCancelListenerC0561m2 = (DialogInterfaceOnCancelListenerC0561m) interfaceC0241v;
                    for (Object obj2 : (Iterable) ((I) c0840d.b().f9091f.f7964a).K()) {
                        if (i.a(((C0787j) obj2).f9073f, dialogInterfaceOnCancelListenerC0561m2.f7506C)) {
                            obj = obj2;
                        }
                    }
                    C0787j c0787j = (C0787j) obj;
                    if (c0787j != null) {
                        c0840d.b().b(c0787j);
                        return;
                    }
                    return;
                }
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    DialogInterfaceOnCancelListenerC0561m dialogInterfaceOnCancelListenerC0561m3 = (DialogInterfaceOnCancelListenerC0561m) interfaceC0241v;
                    for (Object obj3 : (Iterable) ((I) c0840d.b().f9091f.f7964a).K()) {
                        if (i.a(((C0787j) obj3).f9073f, dialogInterfaceOnCancelListenerC0561m3.f7506C)) {
                            obj = obj3;
                        }
                    }
                    C0787j c0787j2 = (C0787j) obj;
                    if (c0787j2 != null) {
                        c0840d.b().b(c0787j2);
                    }
                    dialogInterfaceOnCancelListenerC0561m3.f7520R.f(this);
                    return;
                }
                DialogInterfaceOnCancelListenerC0561m dialogInterfaceOnCancelListenerC0561m4 = (DialogInterfaceOnCancelListenerC0561m) interfaceC0241v;
                if (dialogInterfaceOnCancelListenerC0561m4.a0().isShowing()) {
                    return;
                }
                List list = (List) ((I) c0840d.b().f9090e.f7964a).K();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                    } else if (i.a(((C0787j) listIterator.previous()).f9073f, dialogInterfaceOnCancelListenerC0561m4.f7506C)) {
                        iNextIndex = listIterator.nextIndex();
                    }
                }
                C0787j c0787j3 = (C0787j) j.f0(iNextIndex, list);
                if (!i.a(j.j0(list), c0787j3)) {
                    Log.i("DialogFragmentNavigator", "Dialog " + dialogInterfaceOnCancelListenerC0561m4 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                }
                if (c0787j3 != null) {
                    c0840d.l(iNextIndex, c0787j3, false);
                    return;
                }
                return;
        }
    }
}
