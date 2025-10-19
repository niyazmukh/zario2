package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzkb;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzze.smali */
public final class zzze implements zzbg {
    static final zznl<zzzi, zzkb.zzc> zza = zznl.zza().zza(zzzi.NIST_P256, zzkb.zzc.zza).zza(zzzi.NIST_P384, zzkb.zzc.zzb).zza(zzzi.NIST_P521, zzkb.zzc.zzc).zza();
    static final zznl<zzzh, zzkb.zze> zzb = zznl.zza().zza(zzzh.UNCOMPRESSED, zzkb.zze.zzb).zza(zzzh.COMPRESSED, zzkb.zze.zza).zza(zzzh.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, zzkb.zze.zzc).zza();

    private zzze(ECPublicKey eCPublicKey, byte[] bArr, String str, zzzh zzzhVar, zzlr zzlrVar, byte[] bArr2) throws GeneralSecurityException {
        zznj.zza(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        new zzzg(eCPublicKey);
    }

    public static zzbg zza(zzkh zzkhVar) throws GeneralSecurityException {
        zzzi zzziVar = (zzzi) zza.zza((zznl<zzzi, zzkb.zzc>) ((zzkb) ((zzlg) zzkhVar.zza())).zzd());
        byte[] byteArray = zzkhVar.zzf().getAffineX().toByteArray();
        byte[] byteArray2 = zzkhVar.zzf().getAffineY().toByteArray();
        ECParameterSpec eCParameterSpecZza = zzzf.zza(zzziVar);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, byteArray), new BigInteger(1, byteArray2));
        zznj.zza(eCPoint, eCParameterSpecZza.getCurve());
        ECPublicKey eCPublicKey = (ECPublicKey) zzzj.zze.zza("EC").generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpecZza));
        byte[] bArrZzb = new byte[0];
        if (((zzkb) ((zzlg) zzkhVar.zza())).zzh() != null) {
            bArrZzb = ((zzkb) ((zzlg) zzkhVar.zza())).zzh().zzb();
        }
        return new zzze(eCPublicKey, bArrZzb, zza(((zzkb) ((zzlg) zzkhVar.zza())).zze()), (zzzh) zzb.zza((zznl<zzzh, zzkb.zze>) ((zzkb) ((zzlg) zzkhVar.zza())).zzf()), zzln.zza((zzkb) ((zzlg) zzkhVar.zza())), zzkhVar.zzd().zzb());
    }

    public static final String zza(zzkb.zzb zzbVar) throws GeneralSecurityException {
        if (zzbVar.equals(zzkb.zzb.zza)) {
            return "HmacSha1";
        }
        if (zzbVar.equals(zzkb.zzb.zzb)) {
            return "HmacSha224";
        }
        if (zzbVar.equals(zzkb.zzb.zzc)) {
            return "HmacSha256";
        }
        if (zzbVar.equals(zzkb.zzb.zzd)) {
            return "HmacSha384";
        }
        if (zzbVar.equals(zzkb.zzb.zze)) {
            return "HmacSha512";
        }
        throw new GeneralSecurityException("hash unsupported for EciesAeadHkdf: ".concat(String.valueOf(zzbVar)));
    }
}
