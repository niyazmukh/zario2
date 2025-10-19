package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\tasks\zzz.smali */
final class zzz implements Runnable {
    final /* synthetic */ zzw zza;
    final /* synthetic */ Callable zzb;

    public zzz(zzw zzwVar, Callable callable) {
        this.zza = zzwVar;
        this.zzb = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.zzb(this.zzb.call());
        } catch (Exception e5) {
            this.zza.zza(e5);
        } catch (Throwable th) {
            this.zza.zza(new RuntimeException(th));
        }
    }
}
