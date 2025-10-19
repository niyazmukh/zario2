package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.StrictMode;
import h1.C0588a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import n1.C0763a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\internal\M.smali */
public final class M implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5681a;

    /* renamed from: b, reason: collision with root package name */
    public int f5682b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5683c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f5684d;

    /* renamed from: e, reason: collision with root package name */
    public final L f5685e;

    /* renamed from: f, reason: collision with root package name */
    public ComponentName f5686f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ O f5687g;

    public M(O o5, L l4) {
        Objects.requireNonNull(o5);
        this.f5687g = o5;
        this.f5685e = l4;
        this.f5681a = new HashMap();
        this.f5682b = 2;
    }

    public final C0588a a(String str, Executor executor) throws RemoteException {
        C0588a c0588a;
        try {
            Intent intentA = E.a(this.f5687g.f5690e, this.f5685e);
            this.f5682b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(o1.d.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                O o5 = this.f5687g;
                C0763a c0763a = o5.f5692g;
                Context context = o5.f5690e;
                L l4 = this.f5685e;
                boolean zB = c0763a.b(context, str, intentA, this, executor);
                this.f5683c = zB;
                if (zB) {
                    o5.f5691f.sendMessageDelayed(o5.f5691f.obtainMessage(1, l4), o5.i);
                    c0588a = C0588a.f7619e;
                } else {
                    this.f5682b = 2;
                    try {
                        o5.f5692g.a(o5.f5690e, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    c0588a = new C0588a(16);
                }
                return c0588a;
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (D e5) {
            return e5.f5665a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        O o5 = this.f5687g;
        synchronized (o5.f5689d) {
            try {
                o5.f5691f.removeMessages(1, this.f5685e);
                this.f5684d = iBinder;
                this.f5686f = componentName;
                Iterator it = this.f5681a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f5682b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        O o5 = this.f5687g;
        synchronized (o5.f5689d) {
            try {
                o5.f5691f.removeMessages(1, this.f5685e);
                this.f5684d = null;
                this.f5686f = componentName;
                Iterator it = this.f5681a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f5682b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
