package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import java.util.List;
import java.util.Objects;
import o2.H;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaaz.smali */
final class zzaaz implements zzafv<zzahl> {
    private final /* synthetic */ zzafs zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ Boolean zzd;
    private final /* synthetic */ H zze;
    private final /* synthetic */ zzael zzf;
    private final /* synthetic */ zzahv zzg;

    public zzaaz(zzaar zzaarVar, zzafs zzafsVar, String str, String str2, Boolean bool, H h, zzael zzaelVar, zzahv zzahvVar) {
        this.zza = zzafsVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bool;
        this.zze = h;
        this.zzf = zzaelVar;
        this.zzg = zzahvVar;
        Objects.requireNonNull(zzaarVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzahl zzahlVar) {
        List<zzahk> listZza = zzahlVar.zza();
        if (listZza == null || listZza.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        zzahk zzahkVar = listZza.get(0);
        zzaia zzaiaVarZzf = zzahkVar.zzf();
        List<zzaib> listZza2 = zzaiaVarZzf != null ? zzaiaVarZzf.zza() : null;
        if (listZza2 != null && !listZza2.isEmpty()) {
            if (TextUtils.isEmpty(this.zzb)) {
                listZza2.get(0).zza(this.zzc);
            } else {
                int i = 0;
                while (true) {
                    if (i >= listZza2.size()) {
                        break;
                    }
                    if (listZza2.get(i).zzf().equals(this.zzb)) {
                        listZza2.get(i).zza(this.zzc);
                        break;
                    }
                    i++;
                }
            }
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            zzahkVar.zza(bool.booleanValue());
        } else {
            zzahkVar.zza(zzahkVar.zzb() - zzahkVar.zza() < 1000);
        }
        zzahkVar.zza(this.zze);
        this.zzf.zza(this.zzg, zzahkVar);
    }
}
