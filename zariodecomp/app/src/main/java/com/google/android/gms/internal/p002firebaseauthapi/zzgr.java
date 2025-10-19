package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzgr.smali */
public final class zzgr {
    private static final ThreadLocal<Cipher> zza = new zzgu();

    public static AlgorithmParameterSpec zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static SecretKey zzb(byte[] bArr) throws InvalidAlgorithmParameterException {
        zzaai.zza(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec zza(byte[] bArr, int i, int i5) {
        Integer numZzb = zzqn.zzb();
        return (numZzb == null || numZzb.intValue() > 19) ? new GCMParameterSpec(128, bArr, i, i5) : new IvParameterSpec(bArr, i, i5);
    }

    public static Cipher zza() {
        return zza.get();
    }
}
