package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzkz.smali */
public final class zzkz implements zzpz<zzbd, zzbd> {
    private static final zzkz zza = new zzkz();
    private static final zzps<zzof, zzbd> zzb = zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzky
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpu
        public final Object zza(zzbi zzbiVar) {
            return zzmn.zza((zzof) zzbiVar);
        }
    }, zzof.class, zzbd.class);

    public static void zzc() {
        zzpa.zza().zza(zza);
        zzpa.zza().zza(zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
    public final Class<zzbd> zza() {
        return zzbd.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
    public final Class<zzbd> zzb() {
        return zzbd.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
    public final /* synthetic */ zzbd zza(zzob zzobVar, zzok zzokVar, zzqc<zzbd> zzqcVar) throws GeneralSecurityException {
        zzaaj zzaajVarZzc;
        zzpn zzpnVar = new zzpn();
        for (int i = 0; i < zzobVar.zza(); i++) {
            zzoa zzoaVarZza = zzobVar.zza(i);
            if (zzoaVarZza.zzc().equals(zzbk.zza)) {
                zzbd zzbdVarZza = zzqcVar.zza(zzoaVarZza);
                zzbi zzbiVarZzb = zzoaVarZza.zzb();
                if (zzbiVarZzb instanceof zzlj) {
                    zzaajVarZzc = ((zzlj) zzbiVarZzb).zzh();
                } else {
                    if (!(zzbiVarZzb instanceof zzof)) {
                        throw new GeneralSecurityException("Cannot get output prefix for key of class " + zzbiVarZzb.getClass().getName() + " with parameters " + String.valueOf(zzbiVarZzb.zza()));
                    }
                    zzaajVarZzc = ((zzof) zzbiVarZzb).zzc();
                }
                zzpnVar.zza(zzaajVarZzc, new zzlb(zzbdVarZza, zzoaVarZza.zza()));
            }
        }
        return new zzla(zzpnVar.zza(), !zzokVar.zza() ? zzow.zzb().zza().zza(zzobVar, zzokVar, "hybrid_decrypt", "decrypt") : zzon.zza);
    }

    public static void zza(zzpy zzpyVar) throws GeneralSecurityException {
        zzpyVar.zza(zza);
    }
}
