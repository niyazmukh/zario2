package com.google.android.gms.internal.p002firebaseauthapi;

import B.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzev;
import com.google.android.gms.internal.p002firebaseauthapi.zzwx;
import java.security.GeneralSecurityException;
import r.AbstractC0854a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzex.smali */
final class zzex {
    private static final zzaaj zza;
    private static final zzph<zzev, zzqe> zzb;
    private static final zzpd<zzqe> zzc;
    private static final zznx<zzet, zzqb> zzd;
    private static final zznt<zzqb> zze;

    static {
        zzaaj zzaajVarZzb = zzqn.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zza = zzaajVarZzb;
        zzb = zzph.zza(new zzew(), zzev.class, zzqe.class);
        zzc = zzpd.zza(new zzpf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzez
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpf
            public final zzcb zza(zzqf zzqfVar) {
                return zzex.zzb((zzqe) zzqfVar);
            }
        }, zzaajVarZzb, zzqe.class);
        zzd = zznx.zza(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzey
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznz
            public final zzqf zza(zzbi zzbiVar, zzch zzchVar) {
                zzet zzetVar = (zzet) zzbiVar;
                return zzqb.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzxn) ((zzalf) zzxn.zzb().zza((zzxq) ((zzalf) zzxq.zza().zza(((zzev) ((zzcy) zzetVar.zza())).zzc()).zze())).zze())).zzj(), zzwx.zzb.REMOTE, zzex.zza(((zzev) ((zzcy) zzetVar.zza())).zzb()), zzetVar.zzb());
            }
        }, zzet.class, zzqb.class);
        zze = zznt.zza(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfb
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznv
            public final zzbi zza(zzqf zzqfVar, zzch zzchVar) {
                return zzex.zzb((zzqb) zzqfVar, zzchVar);
            }
        }, zzaajVarZzb, zzqb.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzet zzb(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            zzxn zzxnVarZza = zzxn.zza(zzqbVar.zzd(), zzaku.zza());
            if (zzxnVarZza.zza() == 0) {
                return zzet.zza(zzev.zza(zzxnVarZza.zzd().zzd(), zza(zzqbVar.zzb())), zzqbVar.zze());
            }
            throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got ".concat(String.valueOf(zzxnVarZza)));
        } catch (zzall e5) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e5);
        }
    }

    private static zzev.zza zza(zzxz zzxzVar) throws GeneralSecurityException {
        int i = zzfa.zza[zzxzVar.ordinal()];
        if (i == 1) {
            return zzev.zza.zza;
        }
        if (i == 2) {
            return zzev.zza.zzb;
        }
        throw new GeneralSecurityException(a.g(zzxzVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzev zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                return zzev.zza(zzxq.zza(zzqeVar.zza().zze(), zzaku.zza()).zzd(), zza(zzqeVar.zza().zzd()));
            } catch (zzall e5) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e5);
            }
        }
        throw new IllegalArgumentException(AbstractC0854a.b("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ", zzqeVar.zza().zzf()));
    }

    private static zzxz zza(zzev.zza zzaVar) throws GeneralSecurityException {
        if (zzev.zza.zza.equals(zzaVar)) {
            return zzxz.TINK;
        }
        if (zzev.zza.zzb.equals(zzaVar)) {
            return zzxz.RAW;
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
