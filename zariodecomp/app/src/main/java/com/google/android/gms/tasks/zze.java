package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\tasks\zze.smali */
final class zze implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzf zzb;

    public zze(zzf zzfVar, Task task) {
        this.zzb = zzfVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task task = (Task) this.zzb.zzb.then(this.zza);
            if (task == null) {
                this.zzb.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            zzf zzfVar = this.zzb;
            Executor executor = TaskExecutors.zza;
            task.addOnSuccessListener(executor, zzfVar);
            task.addOnFailureListener(executor, this.zzb);
            task.addOnCanceledListener(executor, this.zzb);
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
