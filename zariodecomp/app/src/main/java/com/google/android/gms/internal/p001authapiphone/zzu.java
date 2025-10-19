package com.google.android.gms.internal.p001authapiphone;

import S0.f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractBinderC0347i;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api-phone\zzu.smali */
final class zzu extends AbstractBinderC0347i {
    final /* synthetic */ TaskCompletionSource zza;

    public zzu(zzv zzvVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0348j
    public final void onResult(Status status) {
        if (status.f5535a == 6) {
            this.zza.trySetException(C.j(status));
        } else {
            f.X(status, null, this.zza);
        }
    }
}
