package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzabo.smali */
final class zzabo implements zzafv<zzajd> {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzafv zzb;
    private final /* synthetic */ zzabl zzc;

    public zzabo(zzabl zzablVar, zzael zzaelVar, zzafv zzafvVar) {
        this.zza = zzaelVar;
        this.zzb = zzafvVar;
        Objects.requireNonNull(zzablVar);
        this.zzc = zzablVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zzb.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzajd zzajdVar) {
        zzaar.zza(this.zzc.zza, zzajdVar, this.zza, this);
    }
}
