package com.google.android.gms.internal.p002firebaseauthapi;

import S0.f;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaby.smali */
final class zzaby implements zzafv<zzaha> {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzaar zzb;

    public zzaby(zzaar zzaarVar, zzael zzaelVar) {
        this.zza = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzb = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zza.zza(f.s0(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzaha zzahaVar) {
        zzaha zzahaVar2 = zzahaVar;
        this.zzb.zza(new zzahv(zzahaVar2.zzb(), zzahaVar2.zza(), Long.valueOf(zzahx.zza(zzahaVar2.zza())), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
    }
}
