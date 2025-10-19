package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzkg;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzmk.smali */
public final class zzmk {
    public static final byte[] zza = zza(1, 0);
    public static final byte[] zzb;
    public static final byte[] zzc;
    public static final byte[] zzd;
    public static final byte[] zze;
    public static final byte[] zzf;
    public static final byte[] zzg;
    public static final byte[] zzh;
    public static final byte[] zzi;
    public static final byte[] zzj;
    public static final byte[] zzk;
    public static final byte[] zzl;
    private static final byte[] zzm;
    private static final byte[] zzn;
    private static final byte[] zzo;

    static {
        zza(1, 2);
        zzb = zza(2, 32);
        zzc = zza(2, 16);
        zzd = zza(2, 17);
        zze = zza(2, 18);
        zzf = zza(2, 1);
        zzg = zza(2, 2);
        zzh = zza(2, 3);
        zzi = zza(2, 1);
        zzj = zza(2, 2);
        zzk = zza(2, 3);
        zzl = new byte[0];
        Charset charset = zzqn.zza;
        zzm = "KEM".getBytes(charset);
        zzn = "HPKE".getBytes(charset);
        zzo = "HPKE-v1".getBytes(charset);
    }

    public static int zza(zzkg.zzf zzfVar) throws GeneralSecurityException {
        if (zzfVar == zzkg.zzf.zzd || zzfVar == zzkg.zzf.zza) {
            return 32;
        }
        if (zzfVar == zzkg.zzf.zzb) {
            return 48;
        }
        if (zzfVar == zzkg.zzf.zzc) {
            return 66;
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    public static int zzb(zzkg.zzf zzfVar) throws GeneralSecurityException {
        if (zzfVar == zzkg.zzf.zzd) {
            return 32;
        }
        if (zzfVar == zzkg.zzf.zza) {
            return 65;
        }
        if (zzfVar == zzkg.zzf.zzb) {
            return 97;
        }
        if (zzfVar == zzkg.zzf.zzc) {
            return 133;
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    public static zzzi zzc(zzkg.zzf zzfVar) throws GeneralSecurityException {
        if (zzfVar == zzkg.zzf.zza) {
            return zzzi.NIST_P256;
        }
        if (zzfVar == zzkg.zzf.zzb) {
            return zzzi.NIST_P384;
        }
        if (zzfVar == zzkg.zzf.zzc) {
            return zzzi.NIST_P521;
        }
        throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
    }

    public static byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return zzyz.zza(zzn, bArr, bArr2, bArr3);
    }

    private static byte[] zza(int i, int i5) {
        if (i > 4 || i < 0) {
            throw new IllegalArgumentException("capacity must be between 0 and 4");
        }
        if (i5 >= 0 && (i >= 4 || i5 < (1 << (i << 3)))) {
            byte[] bArr = new byte[i];
            for (int i6 = 0; i6 < i; i6++) {
                bArr[i6] = (byte) (i5 >> (((i - i6) - 1) * 8));
            }
            return bArr;
        }
        throw new IllegalArgumentException("value too large");
    }

    public static byte[] zza(byte[] bArr) {
        return zzyz.zza(zzm, bArr);
    }

    public static byte[] zza(String str, byte[] bArr, byte[] bArr2) {
        return zzyz.zza(zzo, bArr2, str.getBytes(zzqn.zza), bArr);
    }

    public static byte[] zza(String str, byte[] bArr, byte[] bArr2, int i) {
        return zzyz.zza(zza(2, i), zzo, bArr2, str.getBytes(zzqn.zza), bArr);
    }
}
