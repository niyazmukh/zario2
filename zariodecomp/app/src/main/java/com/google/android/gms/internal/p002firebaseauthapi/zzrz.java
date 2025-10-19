package com.google.android.gms.internal.p002firebaseauthapi;

import B.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzqu;
import com.google.android.gms.internal.p002firebaseauthapi.zzwx;
import java.security.GeneralSecurityException;
import r.AbstractC0854a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzrz.smali */
public final class zzrz {
    private static final zzaaj zza;
    private static final zzph<zzqu, zzqe> zzb;
    private static final zzpd<zzqe> zzc;
    private static final zznx<zzqp, zzqb> zzd;
    private static final zznt<zzqb> zze;

    static {
        zzaaj zzaajVarZzb = zzqn.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zza = zzaajVarZzb;
        zzb = zzph.zza(new zzpj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzry
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpj
            public final zzqf zza(zzcb zzcbVar) {
                zzqu zzquVar = (zzqu) zzcbVar;
                return zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.AesCmacKey").zza(((zzsz) ((zzalf) zzsz.zzb().zza(zzrz.zzb(zzquVar)).zza(zzquVar.zzc()).zze())).zzj()).zza(zzrz.zza(zzquVar.zze())).zze()));
            }
        }, zzqu.class, zzqe.class);
        zzc = zzpd.zza(new zzpf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsb
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpf
            public final zzcb zza(zzqf zzqfVar) {
                return zzrz.zzb((zzqe) zzqfVar);
            }
        }, zzaajVarZzb, zzqe.class);
        zzd = zznx.zza(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsa
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznz
            public final zzqf zza(zzbi zzbiVar, zzch zzchVar) {
                zzqp zzqpVar = (zzqp) zzbiVar;
                return zzqb.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzsw) ((zzalf) zzsw.zzb().zza(zzrz.zzb((zzqu) ((zzrn) zzqpVar.zza()))).zza(zzajv.zza(zzqpVar.zzf().zza(zzch.zza(zzchVar)))).zze())).zzj(), zzwx.zzb.SYMMETRIC, zzrz.zza(((zzqu) ((zzrn) zzqpVar.zza())).zze()), zzqpVar.zzb());
            }
        }, zzqp.class, zzqb.class);
        zze = zznt.zza(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsd
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznv
            public final zzbi zza(zzqf zzqfVar, zzch zzchVar) {
                return zzrz.zzb((zzqb) zzqfVar, zzchVar);
            }
        }, zzaajVarZzb, zzqb.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzqp zzb(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzsw zzswVarZza = zzsw.zza(zzqbVar.zzd(), zzaku.zza());
            if (zzswVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzqp.zzc().zza(zzqu.zzd().zza(zzswVarZza.zze().zzb()).zzb(zzswVarZza.zzd().zza()).zza(zza(zzqbVar.zzb())).zza()).zza(zzaal.zza(zzswVarZza.zze().zzd(), zzch.zza(zzchVar))).zza(zzqbVar.zze()).zza();
        } catch (zzall | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzqu zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzsz zzszVarZza = zzsz.zza(zzqeVar.zza().zze(), zzaku.zza());
                return zzqu.zzd().zza(zzszVarZza.zza()).zzb(zzszVarZza.zzd().zza()).zza(zza(zzqeVar.zza().zzd())).zza();
            } catch (zzall e5) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e5);
            }
        }
        throw new IllegalArgumentException(AbstractC0854a.b("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ", zzqeVar.zza().zzf()));
    }

    private static zzqu.zza zza(zzxz zzxzVar) throws GeneralSecurityException {
        int i = zzsc.zza[zzxzVar.ordinal()];
        if (i == 1) {
            return zzqu.zza.zza;
        }
        if (i == 2) {
            return zzqu.zza.zzb;
        }
        if (i == 3) {
            return zzqu.zza.zzc;
        }
        if (i == 4) {
            return zzqu.zza.zzd;
        }
        throw new GeneralSecurityException(a.g(zzxzVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    private static zztc zzb(zzqu zzquVar) {
        return (zztc) ((zzalf) zztc.zzb().zza(zzquVar.zzb()).zze());
    }

    private static zzxz zza(zzqu.zza zzaVar) throws GeneralSecurityException {
        if (zzqu.zza.zza.equals(zzaVar)) {
            return zzxz.TINK;
        }
        if (zzqu.zza.zzb.equals(zzaVar)) {
            return zzxz.CRUNCHY;
        }
        if (zzqu.zza.zzd.equals(zzaVar)) {
            return zzxz.RAW;
        }
        if (zzqu.zza.zzc.equals(zzaVar)) {
            return zzxz.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzaVar)));
    }

    public static void zza() {
        zzoz zzozVarZza = zzoz.zza();
        zzozVarZza.zza(zzb);
        zzozVarZza.zza(zzc);
        zzozVarZza.zza(zzd);
        zzozVarZza.zza(zze);
    }
}
