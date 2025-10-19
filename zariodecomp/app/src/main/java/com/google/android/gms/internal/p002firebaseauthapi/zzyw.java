package com.google.android.gms.internal.p002firebaseauthapi;

import B.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.p002firebaseauthapi.zziv;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzyw.smali */
public final class zzyw implements zzba {
    private static final zziv.zza zza = zziv.zza.zza;
    private static final ThreadLocal<Cipher> zzb = new zzyv();
    private final byte[] zzc;
    private final zzsq zzd;
    private final SecretKeySpec zze;
    private final int zzf;

    private zzyw(byte[] bArr, int i, byte[] bArr2) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.zzf = i;
        zzaai.zza(bArr.length);
        this.zze = new SecretKeySpec(bArr, "AES");
        this.zzd = zzzz.zza(zzso.zza(zzsr.zza(bArr.length), zzaal.zza(bArr, zzbf.zza())));
        this.zzc = bArr2;
    }

    public static zzba zza(zzdl zzdlVar) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (((zzdq) ((zzcy) zzdlVar.zza())).zzd() == 16) {
            return new zzyw(zzdlVar.zzf().zza(zzbf.zza()), ((zzdq) ((zzcy) zzdlVar.zza())).zzb(), zzdlVar.zzd().zzb());
        }
        throw new GeneralSecurityException(a.g(((zzdq) ((zzcy) zzdlVar.zza())).zzd(), "AesEaxJce only supports 16 byte tag size, not "));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzba
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.zzc;
        int length2 = f.API_PRIORITY_OTHER - bArr3.length;
        int i = this.zzf;
        if (length > (length2 - i) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i + bArr.length + 16);
        byte[] bArrZza = zzqd.zza(this.zzf);
        System.arraycopy(bArrZza, 0, bArrCopyOf, this.zzc.length, this.zzf);
        byte[] bArrZza2 = zza(0, bArrZza, 0, bArrZza.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrZza3 = zza(1, bArr2, 0, bArr2.length);
        Cipher cipher = zzb.get();
        cipher.init(1, this.zze, new IvParameterSpec(bArrZza2));
        cipher.doFinal(bArr, 0, bArr.length, bArrCopyOf, this.zzc.length + this.zzf);
        byte[] bArrZza4 = zza(2, bArrCopyOf, this.zzc.length + this.zzf, bArr.length);
        int length3 = this.zzc.length + bArr.length + this.zzf;
        for (int i5 = 0; i5 < 16; i5++) {
            bArrCopyOf[length3 + i5] = (byte) ((bArrZza3[i5] ^ bArrZza2[i5]) ^ bArrZza4[i5]);
        }
        return bArrCopyOf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzba
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.zzc;
        int length2 = ((length - bArr3.length) - this.zzf) - 16;
        if (length2 >= 0) {
            if (zzqn.zza(bArr3, bArr)) {
                byte[] bArrZza = zza(0, bArr, this.zzc.length, this.zzf);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                byte[] bArrZza2 = zza(1, bArr2, 0, bArr2.length);
                byte[] bArrZza3 = zza(2, bArr, this.zzc.length + this.zzf, length2);
                int length3 = bArr.length - 16;
                byte b5 = 0;
                for (int i = 0; i < 16; i++) {
                    b5 = (byte) (b5 | (((bArr[length3 + i] ^ bArrZza2[i]) ^ bArrZza[i]) ^ bArrZza3[i]));
                }
                if (b5 == 0) {
                    Cipher cipher = zzb.get();
                    cipher.init(1, this.zze, new IvParameterSpec(bArrZza));
                    return cipher.doFinal(bArr, this.zzc.length + this.zzf, length2);
                }
                throw new AEADBadTagException("tag mismatch");
            }
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    private final byte[] zza(int i, byte[] bArr, int i5, int i6) {
        byte[] bArr2 = new byte[i6 + 16];
        bArr2[15] = (byte) i;
        System.arraycopy(bArr, i5, bArr2, 16, i6);
        return this.zzd.zza(bArr2, 16);
    }
}
