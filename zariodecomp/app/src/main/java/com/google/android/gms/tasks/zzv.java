package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.api.internal.AbstractC0350l;
import com.google.android.gms.common.api.internal.InterfaceC0351m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\tasks\zzv.smali */
final class zzv extends AbstractC0350l {
    private final List zza;

    private zzv(InterfaceC0351m interfaceC0351m) {
        super(interfaceC0351m);
        this.zza = new ArrayList();
        this.mLifecycleFragment.c("TaskOnStopCallback", this);
    }

    public static zzv zza(Activity activity) {
        zzv zzvVar;
        InterfaceC0351m fragment = AbstractC0350l.getFragment(activity);
        synchronized (fragment) {
            try {
                zzvVar = (zzv) fragment.d(zzv.class, "TaskOnStopCallback");
                if (zzvVar == null) {
                    zzvVar = new zzv(fragment);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzvVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0350l
    public final void onStop() {
        synchronized (this.zza) {
            try {
                Iterator it = this.zza.iterator();
                while (it.hasNext()) {
                    zzq zzqVar = (zzq) ((WeakReference) it.next()).get();
                    if (zzqVar != null) {
                        zzqVar.zzc();
                    }
                }
                this.zza.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(zzq zzqVar) {
        synchronized (this.zza) {
            this.zza.add(new WeakReference(zzqVar));
        }
    }
}
