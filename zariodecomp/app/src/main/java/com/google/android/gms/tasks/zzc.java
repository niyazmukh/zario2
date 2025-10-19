package com.google.android.gms.tasks;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\tasks\zzc.smali */
final class zzc implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzd zzb;

    public zzc(zzd zzdVar, Task task) {
        this.zzb = zzdVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zza.isCanceled()) {
            this.zzb.zzc.zzc();
            return;
        }
        try {
            this.zzb.zzc.zzb(this.zzb.zzb.then(this.zza));
        } catch (RuntimeExecutionException e5) {
            if (e5.getCause() instanceof Exception) {
                this.zzb.zzc.zza((Exception) e5.getCause());
            } else {
                this.zzb.zzc.zza(e5);
            }
        } catch (Exception e6) {
            this.zzb.zzc.zza(e6);
        }
    }
}
