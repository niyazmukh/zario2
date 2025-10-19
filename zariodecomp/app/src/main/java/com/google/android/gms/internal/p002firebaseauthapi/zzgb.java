package com.google.android.gms.internal.p002firebaseauthapi;

import B.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzge;
import java.security.GeneralSecurityException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzgb.smali */
public final class zzgb extends zzcw {
    private final zzge zza;
    private final zzaal zzb;
    private final zzaaj zzc;
    private final Integer zzd;

    private zzgb(zzge zzgeVar, zzaal zzaalVar, zzaaj zzaajVar, Integer num) {
        this.zza = zzgeVar;
        this.zzb = zzaalVar;
        this.zzc = zzaajVar;
        this.zzd = num;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcw, com.google.android.gms.internal.p002firebaseauthapi.zzbi
    public final /* synthetic */ zzcb zza() {
        return (zzge) zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbi
    public final Integer zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcw
    /* renamed from: zzc */
    public final /* synthetic */ zzcy zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcw
    public final zzaaj zzd() {
        return this.zzc;
    }

    public final zzaal zze() {
        return this.zzb;
    }

    public static zzgb zza(zzge.zza zzaVar, zzaal zzaalVar, Integer num) throws GeneralSecurityException {
        zzaaj zzaajVarZzb;
        zzge.zza zzaVar2 = zzge.zza.zzc;
        if (zzaVar != zzaVar2 && num == null) {
            throw new GeneralSecurityException(a.l("For given Variant ", String.valueOf(zzaVar), " the value of idRequirement must be non-null"));
        }
        if (zzaVar == zzaVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzaalVar.zza() != 32) {
            throw new GeneralSecurityException(a.g(zzaalVar.zza(), "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
        }
        zzge zzgeVarZza = zzge.zza(zzaVar);
        if (zzgeVarZza.zzb() == zzaVar2) {
            zzaajVarZzb = zzpe.zza;
        } else if (zzgeVarZza.zzb() == zzge.zza.zzb) {
            zzaajVarZzb = zzpe.zza(num.intValue());
        } else {
            if (zzgeVarZza.zzb() != zzge.zza.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(String.valueOf(zzgeVarZza.zzb())));
            }
            zzaajVarZzb = zzpe.zzb(num.intValue());
        }
        return new zzgb(zzgeVarZza, zzaalVar, zzaajVarZzb, num);
    }
}
