package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\internal\Q.smali */
public final class Q extends com.google.android.gms.common.api.v implements com.google.android.gms.common.api.t {

    /* renamed from: a, reason: collision with root package name */
    public Q f5597a = null;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5598b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f5599c;

    public Q(WeakReference weakReference) {
        com.google.android.gms.common.internal.C.g(weakReference, "GoogleApiClient reference must not be null");
        this.f5599c = weakReference;
        com.google.android.gms.common.api.o oVar = (com.google.android.gms.common.api.o) weakReference.get();
        new P(this, oVar != null ? ((G) oVar).f5573b.getLooper() : Looper.getMainLooper());
    }

    public final void a(Status status) {
        synchronized (this.f5598b) {
            synchronized (this.f5598b) {
            }
        }
    }
}
