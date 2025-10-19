package com.google.android.gms.internal.p002firebaseauthapi;

import S0.f;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzabi.smali */
final class zzabi implements zzafv<zzajj> {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzaar zzb;

    public zzabi(zzaar zzaarVar, zzael zzaelVar) {
        this.zza = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzb = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zza.zza(f.s0(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzajj zzajjVar) {
        zzajj zzajjVar2 = zzajjVar;
        this.zzb.zza(new zzahv(zzajjVar2.zzd(), zzajjVar2.zzb(), Long.valueOf(zzajjVar2.zza()), "Bearer"), null, null, Boolean.valueOf(zzajjVar2.zzf()), null, this.zza, this);
    }
}
