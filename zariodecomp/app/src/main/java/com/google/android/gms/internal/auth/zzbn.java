package com.google.android.gms.internal.auth;

import S0.f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzbn.smali */
final class zzbn extends zzbd {
    final /* synthetic */ TaskCompletionSource zza;

    public zzbn(zzbo zzboVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    public final void zzc(String str) {
        f.X(str != null ? Status.f5530e : new Status(3006, null, null, null), str, this.zza);
    }
}
