package com.google.android.gms.internal.auth;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzgg.smali */
final class zzgg implements zzft {
    private final zzfw zza;
    private final String zzb = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a";
    private final Object[] zzc;
    private final int zzd;

    public zzgg(zzfw zzfwVar, String str, Object[] objArr) {
        this.zza = zzfwVar;
        this.zzc = objArr;
        char cCharAt = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(0);
        if (cCharAt < 55296) {
            this.zzd = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i5 = 13;
        int i6 = 1;
        while (true) {
            int i7 = i6 + 1;
            char cCharAt2 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i6);
            if (cCharAt2 < 55296) {
                this.zzd = (cCharAt2 << i5) | i;
                return;
            } else {
                i |= (cCharAt2 & 8191) << i5;
                i5 += 13;
                i6 = i7;
            }
        }
    }

    @Override // com.google.android.gms.internal.auth.zzft
    public final zzfw zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.auth.zzft
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.auth.zzft
    public final int zzc() {
        return (this.zzd & 1) == 1 ? 1 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
