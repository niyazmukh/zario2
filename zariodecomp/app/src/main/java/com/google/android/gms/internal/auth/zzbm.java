package com.google.android.gms.internal.auth;

import S0.f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import e1.b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzbm.smali */
final class zzbm extends zzbd {
    final /* synthetic */ TaskCompletionSource zza;

    public zzbm(zzbo zzboVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    public final void zzb(b bVar) {
        f.X(new Status(bVar.f6847a, null, null, null), bVar, this.zza);
    }
}
