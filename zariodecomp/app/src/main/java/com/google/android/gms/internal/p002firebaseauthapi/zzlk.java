package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzlk.smali */
final class zzlk implements zzly {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzly
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzly
    public final int zzb() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzly
    public final byte[] zzc() {
        return zzmk.zzk;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzly
    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) throws InvalidAlgorithmParameterException {
        if (bArr.length != 32) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
        }
        if (zzhv.zza()) {
            return zzhv.zza(bArr).zza(bArr2, bArr3, i, bArr4);
        }
        return new zzht(bArr).zza(bArr2, Arrays.copyOfRange(bArr3, i, bArr3.length), bArr4);
    }
}
