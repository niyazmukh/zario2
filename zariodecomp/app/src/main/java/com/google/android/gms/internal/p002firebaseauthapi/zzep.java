package com.google.android.gms.internal.p002firebaseauthapi;

import B.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzwx;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzep.smali */
public final class zzep implements zzba {
    private static final byte[] zza = new byte[0];
    private static final Set<String> zzb;
    private final String zzc;
    private final zzcb zzd;
    private final zzba zze;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    private zzep(zzxb zzxbVar, zzba zzbaVar) {
        if (!zzb.contains(zzxbVar.zzf())) {
            throw new IllegalArgumentException(a.l("Unsupported DEK key type: ", zzxbVar.zzf(), ". Only Tink AEAD key types are supported."));
        }
        this.zzc = zzxbVar.zzf();
        this.zzd = zzcj.zza(((zzxb) ((zzalf) zzxb.zza(zzxbVar).zza(zzxz.RAW).zze())).zzk());
        this.zze = zzbaVar;
    }

    public static zzba zza(zzcy zzcyVar, zzba zzbaVar) throws GeneralSecurityException {
        try {
            return new zzep(zzxb.zza(zzcj.zza(zzcyVar), zzaku.zza()), zzbaVar);
        } catch (zzall e5) {
            throw new GeneralSecurityException(e5);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzba
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzbi zzbiVarZza = zzop.zza().zza(this.zzd, (Integer) null);
        byte[] bArrZzb = this.zze.zzb(((zzqb) zzoz.zza().zza(zzbiVarZza, zzqb.class, zzbf.zza())).zzd().zzd(), zza);
        if (bArrZzb.length > 4096) {
            throw new GeneralSecurityException("length of encrypted DEK too large");
        }
        byte[] bArrZzb2 = ((zzba) zzpa.zza().zza(zzbiVarZza, zzba.class)).zzb(bArr, bArr2);
        return ByteBuffer.allocate(bArrZzb.length + 4 + bArrZzb2.length).putInt(bArrZzb.length).put(bArrZzb).put(bArrZzb2).array();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzba
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i > 0 && i <= 4096 && i <= bArr.length - 4) {
                byte[] bArr3 = new byte[i];
                byteBufferWrap.get(bArr3, 0, i);
                byte[] bArr4 = new byte[byteBufferWrap.remaining()];
                byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
                return ((zzba) zzpa.zza().zza(zzoz.zza().zza((zzoz) zzqb.zza(this.zzc, zzajv.zza(this.zze.zza(bArr3, zza)), zzwx.zzb.SYMMETRIC, zzxz.RAW, null), zzbf.zza()), zzba.class)).zza(bArr4, bArr2);
            }
            throw new GeneralSecurityException("length of encrypted DEK too large");
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e5) {
            throw new GeneralSecurityException("invalid ciphertext", e5);
        }
    }
}
