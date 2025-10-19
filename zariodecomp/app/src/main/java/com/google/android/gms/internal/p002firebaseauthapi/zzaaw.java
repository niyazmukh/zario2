package com.google.android.gms.internal.p002firebaseauthapi;

import S0.f;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaaw.smali */
final class zzaaw implements zzafv<zzajh> {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzaar zzb;

    public zzaaw(zzaar zzaarVar, zzael zzaelVar) {
        this.zza = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzb = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zza.zza(f.s0(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzajh zzajhVar) {
        zzajh zzajhVar2 = zzajhVar;
        if (zzajhVar2.zzf()) {
            this.zza.zza(new zzaas(zzajhVar2.zzc(), zzajhVar2.zze(), null));
        } else {
            this.zzb.zza(new zzahv(zzajhVar2.zzd(), zzajhVar2.zzb(), Long.valueOf(zzajhVar2.zza()), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
        }
    }
}
