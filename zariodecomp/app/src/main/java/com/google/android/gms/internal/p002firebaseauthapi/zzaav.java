package com.google.android.gms.internal.p002firebaseauthapi;

import S0.f;
import java.util.Objects;
import o2.C0800d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaav.smali */
final class zzaav implements zzafv<zzahv> {
    private final /* synthetic */ C0800d zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzael zzc;
    private final /* synthetic */ zzaar zzd;

    public zzaav(zzaar zzaarVar, C0800d c0800d, String str, zzael zzaelVar) {
        this.zza = c0800d;
        this.zzb = str;
        this.zzc = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzd = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zzc.zza(f.s0(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzahv zzahvVar) {
        this.zzd.zza(new zzagx(this.zza, zzahvVar.zzc(), this.zzb), this.zzc);
    }
}
