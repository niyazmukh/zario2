package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzhy.smali */
public final class zzhy extends zzhu {
    public zzhy(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzhu
    public final int zza() {
        return 24;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzhu
    public final /* bridge */ /* synthetic */ void zza(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        super.zza(byteBuffer, bArr, bArr2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzhu
    public final /* bridge */ /* synthetic */ byte[] zza(byte[] bArr, ByteBuffer byteBuffer) {
        return super.zza(bArr, byteBuffer);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzhu
    public final int[] zza(int[] iArr, int i) {
        if (iArr.length == 6) {
            int[] iArr2 = new int[16];
            zzhp.zza(iArr2, zzhp.zzb(this.zza, iArr));
            iArr2[12] = i;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length << 5)));
    }
}
