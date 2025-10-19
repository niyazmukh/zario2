package com.google.android.gms.internal.p001authapiphone;

import S0.f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api-phone\zzaa.smali */
final class zzaa extends zzi {
    final /* synthetic */ TaskCompletionSource zza;

    public zzaa(zzab zzabVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p001authapiphone.zzj
    public final void zzb(Status status) {
        f.X(status, null, this.zza);
    }
}
