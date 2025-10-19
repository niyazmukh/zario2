package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractBinderC0347i;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzx.smali */
final class zzx extends AbstractBinderC0347i {
    final /* synthetic */ TaskCompletionSource zza;

    public zzx(zzab zzabVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0348j
    public final void onResult(Status status) {
        zzab.zzf(status, null, this.zza);
    }
}
