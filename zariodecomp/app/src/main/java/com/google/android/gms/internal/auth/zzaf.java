package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzaf.smali */
final class zzaf extends zzah {
    final /* synthetic */ zzag zza;

    public zzaf(zzag zzagVar) {
        this.zza = zzagVar;
    }

    @Override // com.google.android.gms.internal.auth.zzah, Y0.c
    public final void zzc(boolean z4) {
        this.zza.setResult((zzag) new zzak(z4 ? Status.f5530e : zzal.zza));
    }
}
