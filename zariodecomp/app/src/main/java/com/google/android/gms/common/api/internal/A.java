package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.base.zau;
import h1.C0588a;
import h1.C0591d;
import java.util.concurrent.atomic.AtomicReference;
import q.C0826c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\internal\A.smali */
public final class A extends AbstractC0350l implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f5542a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f5543b;

    /* renamed from: c, reason: collision with root package name */
    public final zau f5544c;

    /* renamed from: d, reason: collision with root package name */
    public final C0591d f5545d;

    /* renamed from: e, reason: collision with root package name */
    public final C0826c f5546e;

    /* renamed from: f, reason: collision with root package name */
    public final C0346h f5547f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(InterfaceC0351m interfaceC0351m, C0346h c0346h) {
        super(interfaceC0351m);
        C0591d c0591d = C0591d.f7631d;
        this.f5543b = new AtomicReference(null);
        this.f5544c = new zau(Looper.getMainLooper());
        this.f5545d = c0591d;
        this.f5546e = new C0826c(0);
        this.f5547f = c0346h;
        this.mLifecycleFragment.c("ConnectionlessLifecycleHelper", this);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0350l
    public final void onActivityResult(int i, int i5, Intent intent) throws PackageManager.NameNotFoundException {
        AtomicReference atomicReference = this.f5543b;
        X x3 = (X) atomicReference.get();
        C0346h c0346h = this.f5547f;
        if (i != 1) {
            if (i == 2) {
                int iC = this.f5545d.c(getActivity(), h1.e.f7632a);
                if (iC == 0) {
                    atomicReference.set(null);
                    zau zauVar = c0346h.f5638n;
                    zauVar.sendMessage(zauVar.obtainMessage(3));
                    return;
                } else {
                    if (x3 == null) {
                        return;
                    }
                    if (x3.f5606b.f7621b == 18 && iC == 18) {
                        return;
                    }
                }
            }
        } else if (i5 == -1) {
            atomicReference.set(null);
            zau zauVar2 = c0346h.f5638n;
            zauVar2.sendMessage(zauVar2.obtainMessage(3));
            return;
        } else if (i5 == 0) {
            if (x3 == null) {
                return;
            }
            C0588a c0588a = new C0588a(1, intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, x3.f5606b.toString());
            atomicReference.set(null);
            c0346h.h(c0588a, x3.f5605a);
            return;
        }
        if (x3 != null) {
            atomicReference.set(null);
            c0346h.h(x3.f5606b, x3.f5605a);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C0588a c0588a = new C0588a(13, null);
        AtomicReference atomicReference = this.f5543b;
        X x3 = (X) atomicReference.get();
        int i = x3 == null ? -1 : x3.f5605a;
        atomicReference.set(null);
        this.f5547f.h(c0588a, i);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0350l
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f5543b.set(bundle.getBoolean("resolving_error", false) ? new X(new C0588a(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0350l
    public final void onResume() {
        super.onResume();
        if (this.f5546e.isEmpty()) {
            return;
        }
        this.f5547f.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0350l
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        X x3 = (X) this.f5543b.get();
        if (x3 == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", x3.f5605a);
        C0588a c0588a = x3.f5606b;
        bundle.putInt("failed_status", c0588a.f7621b);
        bundle.putParcelable("failed_resolution", c0588a.f7622c);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0350l
    public final void onStart() {
        super.onStart();
        this.f5542a = true;
        if (this.f5546e.isEmpty()) {
            return;
        }
        this.f5547f.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0350l
    public final void onStop() {
        this.f5542a = false;
        C0346h c0346h = this.f5547f;
        c0346h.getClass();
        synchronized (C0346h.f5625r) {
            try {
                if (c0346h.f5635k == this) {
                    c0346h.f5635k = null;
                    c0346h.f5636l.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
