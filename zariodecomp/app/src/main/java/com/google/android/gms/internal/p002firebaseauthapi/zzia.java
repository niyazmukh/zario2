package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzia.smali */
public final class zzia implements zzba {
    private final zzba zza;
    private final byte[] zzb;

    private zzia(zzba zzbaVar, byte[] bArr) {
        this.zza = zzbaVar;
        if (bArr.length != 0 && bArr.length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.zzb = bArr;
    }

    public static zzba zza(zzof zzofVar) throws GeneralSecurityException {
        byte[] bArrZzb;
        zzqb zzqbVarZza = zzofVar.zza(zzbf.zza());
        zzba zzbaVar = (zzba) zznq.zza().zza(zzqbVarZza.zzf(), zzba.class).zzb(zzqbVarZza.zzd());
        zzxz zzxzVarZzb = zzqbVarZza.zzb();
        int i = zzhz.zza[zzxzVarZzb.ordinal()];
        if (i == 1) {
            bArrZzb = zzpe.zza.zzb();
        } else if (i == 2 || i == 3) {
            bArrZzb = zzpe.zza(zzofVar.zzb().intValue()).zzb();
        } else {
            if (i != 4) {
                throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(zzxzVarZzb)));
            }
            bArrZzb = zzpe.zzb(zzofVar.zzb().intValue()).zzb();
        }
        return new zzia(zzbaVar, bArrZzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzba
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.zzb;
        return bArr3.length == 0 ? this.zza.zzb(bArr, bArr2) : zzyz.zza(bArr3, this.zza.zzb(bArr, bArr2));
    }

    public static zzba zza(zzba zzbaVar, zzaaj zzaajVar) {
        return new zzia(zzbaVar, zzaajVar.zzb());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzba
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzqn.zza(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
