package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaah.smali */
public final class zzaah {
    public static byte[] zza(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 32);
        bArrCopyOf[0] = (byte) (bArrCopyOf[0] & 248);
        byte b5 = (byte) (bArrCopyOf[31] & 127);
        bArrCopyOf[31] = b5;
        bArrCopyOf[31] = (byte) (b5 | 64);
        zzng.zza(jArr, bArrCopyOf, bArr2);
        return zznm.zzc(jArr);
    }

    public static byte[] zza() {
        byte[] bArrZza = zzqd.zza(32);
        bArrZza[0] = (byte) (bArrZza[0] | 7);
        byte b5 = (byte) (bArrZza[31] & 63);
        bArrZza[31] = b5;
        bArrZza[31] = (byte) (b5 | 128);
        return bArrZza;
    }

    public static byte[] zza(byte[] bArr) throws InvalidKeyException {
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[32];
            bArr2[0] = 9;
            return zza(bArr, bArr2);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }
}
