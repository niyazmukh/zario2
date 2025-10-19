package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\tasks\zzo.smali */
final class zzo implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzp zzb;

    public zzo(zzp zzpVar, Task task) {
        this.zzb = zzpVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task taskThen = this.zzb.zzb.then(this.zza.getResult());
            if (taskThen == null) {
                this.zzb.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            zzp zzpVar = this.zzb;
            Executor executor = TaskExecutors.zza;
            taskThen.addOnSuccessListener(executor, zzpVar);
            taskThen.addOnFailureListener(executor, this.zzb);
            taskThen.addOnCanceledListener(executor, this.zzb);
        } catch (RuntimeExecutionException e5) {
            if (e5.getCause() instanceof Exception) {
                this.zzb.onFailure((Exception) e5.getCause());
            } else {
                this.zzb.onFailure(e5);
            }
        } catch (CancellationException unused) {
            this.zzb.onCanceled();
        } catch (Exception e6) {
            this.zzb.onFailure(e6);
        }
    }
}
