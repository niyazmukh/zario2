package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import g0.AbstractActivityC0570w;
import g0.C0542J;
import g0.C0549a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.l, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\internal\l.1.smali */
public abstract class AbstractC0350l {
    protected final InterfaceC0351m mLifecycleFragment;

    public AbstractC0350l(InterfaceC0351m interfaceC0351m) {
        this.mLifecycleFragment = interfaceC0351m;
    }

    public static InterfaceC0351m getFragment(Activity activity) {
        return getFragment(new C0349k(activity));
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity getActivity() {
        Activity activityF = this.mLifecycleFragment.f();
        com.google.android.gms.common.internal.C.f(activityF);
        return activityF;
    }

    public void onActivityResult(int i, int i5, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public abstract void onStop();

    public static InterfaceC0351m getFragment(C0349k c0349k) {
        a0 a0Var;
        b0 b0Var;
        Activity activity = c0349k.f5640a;
        if (!(activity instanceof AbstractActivityC0570w)) {
            if (activity == null) {
                throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
            }
            WeakHashMap weakHashMap = a0.f5614b;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference == null || (a0Var = (a0) weakReference.get()) == null) {
                try {
                    a0Var = (a0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (a0Var == null || a0Var.isRemoving()) {
                        a0Var = new a0();
                        activity.getFragmentManager().beginTransaction().add(a0Var, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    weakHashMap.put(activity, new WeakReference(a0Var));
                } catch (ClassCastException e5) {
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e5);
                }
            }
            return a0Var;
        }
        AbstractActivityC0570w abstractActivityC0570w = (AbstractActivityC0570w) activity;
        WeakHashMap weakHashMap2 = b0.f5616b0;
        C0542J c0542jM = abstractActivityC0570w.m();
        WeakHashMap weakHashMap3 = b0.f5616b0;
        WeakReference weakReference2 = (WeakReference) weakHashMap3.get(abstractActivityC0570w);
        if (weakReference2 == null || (b0Var = (b0) weakReference2.get()) == null) {
            try {
                b0Var = (b0) c0542jM.C("SLifecycleFragmentImpl");
                if (b0Var == null || b0Var.f7538p) {
                    b0Var = new b0();
                    C0549a c0549a = new C0549a(c0542jM);
                    c0549a.e(0, b0Var, "SLifecycleFragmentImpl", 1);
                    c0549a.d(true);
                }
                weakHashMap3.put(abstractActivityC0570w, new WeakReference(b0Var));
            } catch (ClassCastException e6) {
                throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e6);
            }
        }
        return b0Var;
    }

    public static InterfaceC0351m getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}
