package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzacb.smali */
final class zzacb implements zzafv<zzahl> {
    private final /* synthetic */ zzafv zza;
    private final /* synthetic */ zzael zzb;
    private final /* synthetic */ zzahv zzc;

    public zzacb(zzacc zzaccVar, zzafv zzafvVar, zzael zzaelVar, zzahv zzahvVar) {
        this.zza = zzafvVar;
        this.zzb = zzaelVar;
        this.zzc = zzahvVar;
        Objects.requireNonNull(zzaccVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzahl zzahlVar) {
        List<zzahk> listZza = zzahlVar.zza();
        if (listZza == null || listZza.isEmpty()) {
            this.zza.zza("No users");
        } else {
            this.zzb.zza(this.zzc, listZza.get(0));
        }
    }
}
