package com.google.android.gms.internal.p002firebaseauthapi;

import S0.f;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzabj.smali */
final class zzabj implements zzafv<zzahv> {
    final /* synthetic */ zzaar zza;
    private final /* synthetic */ zzajg zzb;
    private final /* synthetic */ zzael zzc;

    public zzabj(zzaar zzaarVar, zzajg zzajgVar, zzael zzaelVar) {
        this.zzb = zzajgVar;
        this.zzc = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zza = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zzc.zza(f.s0(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzahv zzahvVar) {
        this.zzb.zza(zzahvVar.zzc());
        this.zza.zza.zza(this.zzb, new zzabm(this, this.zzc, this));
    }
}
