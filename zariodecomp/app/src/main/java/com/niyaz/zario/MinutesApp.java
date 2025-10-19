package com.niyaz.zario;

import J0.InterfaceC0107a;
import S2.u;
import android.app.Application;
import android.content.IntentFilter;
import android.util.Log;
import b3.C0304b;
import com.niyaz.zario.worker.MonitoringWorkScheduler;
import dagger.hilt.android.HiltAndroidApp;
import dagger.hilt.android.internal.managers.ApplicationComponentManager;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import f4.C;
import f4.E;

@HiltAndroidApp
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\MinutesApp.smali */
public final class MinutesApp extends Application implements InterfaceC0107a, GeneratedComponentManagerHolder {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6617a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ApplicationComponentManager f6618b = new ApplicationComponentManager(new m(this));

    /* renamed from: c, reason: collision with root package name */
    public i0.a f6619c;

    /* renamed from: d, reason: collision with root package name */
    public u f6620d;

    /* renamed from: e, reason: collision with root package name */
    public C f6621e;

    /* renamed from: f, reason: collision with root package name */
    public MonitoringWorkScheduler f6622f;

    /* renamed from: k, reason: collision with root package name */
    public C0304b f6623k;

    /* renamed from: l, reason: collision with root package name */
    public w3.m f6624l;

    public final void a() {
        if (!this.f6617a) {
            this.f6617a = true;
            ((q) this.f6618b.generatedComponent()).injectMinutesApp((MinutesApp) UnsafeCasts.unsafeCast(this));
        }
        super.onCreate();
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    public final GeneratedComponentManager componentManager() {
        return this.f6618b;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return this.f6618b.generatedComponent();
    }

    @Override // android.app.Application
    public final void onCreate() {
        a();
        Log.i("MinutesApp", "Application created; WorkManager configured via Configuration.Provider");
        C0304b c0304b = this.f6623k;
        if (c0304b == null) {
            kotlin.jvm.internal.i.i("firebaseAuthInitializer");
            throw null;
        }
        o2.o oVar = c0304b.f5219a.f6373f;
        if (oVar != null) {
            Log.i("FirebaseAuthInit", "Restored Firebase user " + ((p2.e) oVar).f9329b.f9320a);
        } else {
            Log.i("FirebaseAuthInit", "No authenticated Firebase user found; awaiting email sign-in");
        }
        w3.m mVar = this.f6624l;
        if (mVar == null) {
            kotlin.jvm.internal.i.i("usageTrackingInitializer");
            throw null;
        }
        registerActivityLifecycleCallbacks(mVar.f11008a);
        w3.f fVar = mVar.f11009b;
        fVar.getClass();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        registerReceiver(fVar.f10987a, intentFilter);
        C c5 = this.f6621e;
        if (c5 != null) {
            E.t(c5, null, null, new p(this, null), 3);
        } else {
            kotlin.jvm.internal.i.i("applicationScope");
            throw null;
        }
    }
}
