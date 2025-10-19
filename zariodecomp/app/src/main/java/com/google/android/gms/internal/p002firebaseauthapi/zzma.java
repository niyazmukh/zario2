package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzkg;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzma.smali */
public final class zzma implements zzbd {
    private static final byte[] zza = new byte[0];
    private final zzme zzb;
    private final zzmf zzc;
    private final zzmc zzd;
    private final zzly zze;
    private final int zzf;
    private final byte[] zzg;

    private zzma(zzme zzmeVar, zzmf zzmfVar, zzmc zzmcVar, zzly zzlyVar, int i, zzaaj zzaajVar) {
        this.zzb = zzmeVar;
        this.zzc = zzmfVar;
        this.zzd = zzmcVar;
        this.zze = zzlyVar;
        this.zzf = i;
        this.zzg = zzaajVar.zzb();
    }

    public static zzbd zza(zzki zzkiVar) throws GeneralSecurityException {
        int i;
        zzkg zzkgVar = (zzkg) ((zzlg) zzkiVar.zza());
        zzmf zzmfVarZza = zzmh.zza(zzkgVar.zze());
        zzmc zzmcVarZza = zzmh.zza(zzkgVar.zzd());
        zzly zzlyVarZza = zzmh.zza(zzkgVar.zzb());
        zzkg.zzf zzfVarZze = zzkgVar.zze();
        zzkg.zzf zzfVar = zzkg.zzf.zzd;
        if (zzfVarZze.equals(zzfVar)) {
            i = 32;
        } else if (zzfVarZze.equals(zzkg.zzf.zza)) {
            i = 65;
        } else if (zzfVarZze.equals(zzkg.zzf.zzb)) {
            i = 97;
        } else {
            if (!zzfVarZze.equals(zzkg.zzf.zzc)) {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            i = 133;
        }
        int i5 = i;
        zzkg.zzf zzfVarZze2 = ((zzkg) ((zzlg) zzkiVar.zza())).zze();
        if (zzfVarZze2.equals(zzfVar) || zzfVarZze2.equals(zzkg.zzf.zza) || zzfVarZze2.equals(zzkg.zzf.zzb) || zzfVarZze2.equals(zzkg.zzf.zzc)) {
            return new zzma(new zzme(zzaaj.zza(zzkiVar.zzf().zza(zzbf.zza())), ((zzkq) ((zzli) zzkiVar.zzc())).zze()), zzmfVarZza, zzmcVarZza, zzlyVarZza, i5, zzkiVar.zzh());
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbd
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzg;
        int length = bArr3.length + this.zzf;
        if (bArr.length >= length) {
            if (zzqn.zza(bArr3, bArr)) {
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                return zzmb.zza(Arrays.copyOfRange(bArr, this.zzg.length, length), this.zzb, this.zzc, this.zzd, this.zze, bArr2).zza(bArr, length, zza);
            }
            throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        }
        throw new GeneralSecurityException("Ciphertext is too short.");
    }
}
