package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzalv.smali */
final class zzalv implements zzalw {
    private static <E> zzalm<E> zzc(Object obj, long j5) {
        return (zzalm) zzanz.zze(obj, j5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalw
    public final <L> List<L> zza(Object obj, long j5) {
        zzalm zzalmVarZzc = zzc(obj, j5);
        if (zzalmVarZzc.zzc()) {
            return zzalmVarZzc;
        }
        int size = zzalmVarZzc.size();
        zzalm zzalmVarZza = zzalmVarZzc.zza(size == 0 ? 10 : size << 1);
        zzanz.zza(obj, j5, zzalmVarZza);
        return zzalmVarZza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalw
    public final void zzb(Object obj, long j5) {
        zzc(obj, j5).zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalw
    public final <E> void zza(Object obj, Object obj2, long j5) {
        zzalm zzalmVarZzc = zzc(obj, j5);
        zzalm zzalmVarZzc2 = zzc(obj2, j5);
        int size = zzalmVarZzc.size();
        int size2 = zzalmVarZzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzalmVarZzc.zzc()) {
                zzalmVarZzc = zzalmVarZzc.zza(size2 + size);
            }
            zzalmVarZzc.addAll(zzalmVarZzc2);
        }
        if (size > 0) {
            zzalmVarZzc2 = zzalmVarZzc;
        }
        zzanz.zza(obj, j5, zzalmVarZzc2);
    }
}
