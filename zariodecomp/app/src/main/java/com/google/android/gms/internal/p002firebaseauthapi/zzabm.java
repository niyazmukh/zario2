package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.Objects;
import o2.u;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzabm.smali */
final class zzabm implements zzafv<zzajj> {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzafv zzb;
    private final /* synthetic */ zzabj zzc;

    public zzabm(zzabj zzabjVar, zzael zzaelVar, zzafv zzafvVar) {
        this.zza = zzaelVar;
        this.zzb = zzafvVar;
        Objects.requireNonNull(zzabjVar);
        this.zzc = zzabjVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zzb.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final void zza(zzajj zzajjVar) {
        zzajj zzajjVar2 = zzajjVar;
        if (TextUtils.isEmpty(zzajjVar2.zze())) {
            this.zzc.zza.zza(new zzahv(zzajjVar2.zzd(), zzajjVar2.zzb(), Long.valueOf(zzajjVar2.zza()), "Bearer"), null, "phone", Boolean.valueOf(zzajjVar2.zzf()), null, this.zza, this.zzb);
        } else {
            this.zza.zza(new Status(17025, null, null, null), new u(null, null, zzajjVar2.zzc(), zzajjVar2.zze(), true));
        }
    }
}
