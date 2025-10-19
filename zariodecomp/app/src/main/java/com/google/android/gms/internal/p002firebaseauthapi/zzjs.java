package com.google.android.gms.internal.p002firebaseauthapi;

import B.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzjf;
import com.google.android.gms.internal.p002firebaseauthapi.zzwx;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import r.AbstractC0854a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzjs.smali */
public final class zzjs {
    private static final zzaaj zza;
    private static final zzph<zzjf, zzqe> zzb;
    private static final zzpd<zzqe> zzc;
    private static final zznx<zzja, zzqb> zzd;
    private static final zznt<zzqb> zze;
    private static final Map<zzjf.zza, zzxz> zzf;
    private static final Map<zzxz, zzjf.zza> zzg;

    static {
        zzaaj zzaajVarZzb = zzqn.zzb("type.googleapis.com/google.crypto.tink.AesSivKey");
        zza = zzaajVarZzb;
        zzb = zzph.zza(new zzpj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpj
            public final zzqf zza(zzcb zzcbVar) {
                zzjf zzjfVar = (zzjf) zzcbVar;
                return zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.AesSivKey").zza(((zzus) ((zzalf) zzus.zzc().zza(zzjfVar.zzb()).zze())).zzj()).zza(zzjs.zza(zzjfVar.zzd())).zze()));
            }
        }, zzjf.class, zzqe.class);
        zzc = zzpd.zza(new zzpf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzju
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpf
            public final zzcb zza(zzqf zzqfVar) {
                return zzjs.zzb((zzqe) zzqfVar);
            }
        }, zzaajVarZzb, zzqe.class);
        zzd = zznx.zza(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjt
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznz
            public final zzqf zza(zzbi zzbiVar, zzch zzchVar) {
                zzja zzjaVar = (zzja) zzbiVar;
                return zzqb.zza("type.googleapis.com/google.crypto.tink.AesSivKey", ((zzup) ((zzalf) zzup.zzb().zza(zzajv.zza(zzjaVar.zzf().zza(zzch.zza(zzchVar)))).zze())).zzj(), zzwx.zzb.SYMMETRIC, zzjs.zza(((zzjf) zzjaVar.zza()).zzd()), zzjaVar.zzb());
            }
        }, zzja.class, zzqb.class);
        zze = zznt.zza(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjw
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznv
            public final zzbi zza(zzqf zzqfVar, zzch zzchVar) {
                return zzjs.zzb((zzqb) zzqfVar, zzchVar);
            }
        }, zzaajVarZzb, zzqb.class);
        HashMap map = new HashMap();
        zzjf.zza zzaVar = zzjf.zza.zzc;
        zzxz zzxzVar = zzxz.RAW;
        map.put(zzaVar, zzxzVar);
        zzjf.zza zzaVar2 = zzjf.zza.zza;
        zzxz zzxzVar2 = zzxz.TINK;
        map.put(zzaVar2, zzxzVar2);
        zzjf.zza zzaVar3 = zzjf.zza.zzb;
        zzxz zzxzVar3 = zzxz.CRUNCHY;
        map.put(zzaVar3, zzxzVar3);
        zzf = Collections.unmodifiableMap(map);
        EnumMap enumMap = new EnumMap(zzxz.class);
        enumMap.put((EnumMap) zzxzVar, (zzxz) zzaVar);
        enumMap.put((EnumMap) zzxzVar2, (zzxz) zzaVar2);
        enumMap.put((EnumMap) zzxzVar3, (zzxz) zzaVar3);
        enumMap.put((EnumMap) zzxz.LEGACY, (zzxz) zzaVar3);
        zzg = Collections.unmodifiableMap(enumMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzja zzb(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
        }
        try {
            zzup zzupVarZza = zzup.zza(zzqbVar.zzd(), zzaku.zza());
            if (zzupVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzja.zzc().zza(zzjf.zzc().zza(zzupVarZza.zzd().zzb()).zza(zza(zzqbVar.zzb())).zza()).zza(zzaal.zza(zzupVarZza.zzd().zzd(), zzch.zza(zzchVar))).zza(zzqbVar.zze()).zza();
        } catch (zzall unused) {
            throw new GeneralSecurityException("Parsing AesSivKey failed");
        }
    }

    private static zzjf.zza zza(zzxz zzxzVar) throws GeneralSecurityException {
        Map<zzxz, zzjf.zza> map = zzg;
        if (map.containsKey(zzxzVar)) {
            return map.get(zzxzVar);
        }
        throw new GeneralSecurityException(a.g(zzxzVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzjf zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            try {
                zzus zzusVarZza = zzus.zza(zzqeVar.zza().zze(), zzaku.zza());
                if (zzusVarZza.zzb() == 0) {
                    return zzjf.zzc().zza(zzusVarZza.zza()).zza(zza(zzqeVar.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzall e5) {
                throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e5);
            }
        }
        throw new IllegalArgumentException(AbstractC0854a.b("Wrong type URL in call to AesSivParameters.parseParameters: ", zzqeVar.zza().zzf()));
    }

    private static zzxz zza(zzjf.zza zzaVar) throws GeneralSecurityException {
        Map<zzjf.zza, zzxz> map = zzf;
        if (map.containsKey(zzaVar)) {
            return map.get(zzaVar);
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
