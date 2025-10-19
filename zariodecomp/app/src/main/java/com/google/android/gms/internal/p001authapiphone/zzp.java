package com.google.android.gms.internal.p001authapiphone;

import S0.f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api-phone\zzp.smali */
final class zzp extends zzd {
    final /* synthetic */ TaskCompletionSource zza;

    public zzp(zzr zzrVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p001authapiphone.zze
    public final void zzb(Status status, int i) {
        f.X(status, Integer.valueOf(i), this.zza);
    }
}
