package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.api.internal.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\internal\c.1.smali */
public final class ComponentCallbacks2C0341c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e, reason: collision with root package name */
    public static final ComponentCallbacks2C0341c f5618e = new ComponentCallbacks2C0341c();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f5619a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f5620b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f5621c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f5622d = false;

    public static void b(Application application) {
        ComponentCallbacks2C0341c componentCallbacks2C0341c = f5618e;
        synchronized (componentCallbacks2C0341c) {
            try {
                if (!componentCallbacks2C0341c.f5622d) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C0341c);
                    application.registerComponentCallbacks(componentCallbacks2C0341c);
                    componentCallbacks2C0341c.f5622d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(InterfaceC0340b interfaceC0340b) {
        synchronized (f5618e) {
            this.f5621c.add(interfaceC0340b);
        }
    }

    public final void c(boolean z4) {
        synchronized (f5618e) {
            try {
                Iterator it = this.f5621c.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0340b) it.next()).a(z4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f5620b;
        boolean zCompareAndSet = this.f5619a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f5620b;
        boolean zCompareAndSet = this.f5619a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.f5619a.compareAndSet(false, true)) {
            this.f5620b.set(true);
            c(true);
        }
    }
}
