package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzbr.smali */
final class zzbr extends zzbd {
    final /* synthetic */ zzbs zza;

    public zzbr(zzbs zzbsVar) {
        this.zza = zzbsVar;
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    public final void zzc(String str) {
        zzbs zzbsVar = this.zza;
        if (str != null) {
            zzbsVar.setResult((zzbs) new zzbv(str));
        } else {
            zzbsVar.setResult((zzbs) new zzbv(new Status(3006, null, null, null)));
        }
    }
}
