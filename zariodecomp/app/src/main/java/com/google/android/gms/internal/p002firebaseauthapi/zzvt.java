package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzvt.smali */
public final class zzvt extends zzalf<zzvt, zza> implements zzamo {
    private static final zzvt zzc;
    private static volatile zzamv<zzvt> zzd;
    private int zze;
    private int zzf;
    private zzajv zzg = zzajv.zza;

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzvt$zza.smali */
    public static final class zza extends zzalf.zzb<zzvt, zza> implements zzamo {
        public final zza zza(zzvw zzvwVar) {
            zzg();
            zzvt.zza((zzvt) this.zza, zzvwVar);
            return this;
        }

        private zza() {
            super(zzvt.zzc);
        }

        public final zza zza(zzvy zzvyVar) {
            zzg();
            zzvt.zza((zzvt) this.zza, zzvyVar);
            return this;
        }

        public final zza zza(zzajv zzajvVar) {
            zzg();
            zzvt.zza((zzvt) this.zza, zzajvVar);
            return this;
        }
    }

    static {
        zzvt zzvtVar = new zzvt();
        zzc = zzvtVar;
        zzalf.zza((Class<zzvt>) zzvt.class, zzvtVar);
    }

    private zzvt() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public static zzvt zzc() {
        return zzc;
    }

    public final zzvw zzd() {
        zzvw zzvwVarZza = zzvw.zza(this.zze);
        return zzvwVarZza == null ? zzvw.UNRECOGNIZED : zzvwVarZza;
    }

    public final zzvy zze() {
        zzvy zzvyVarZza = zzvy.zza(this.zzf);
        return zzvyVarZza == null ? zzvy.UNRECOGNIZED : zzvyVarZza;
    }

    public final zzajv zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final Object zza(int i, Object obj, Object obj2) {
        int i5 = zzvs.zza[i - 1];
        switch (i5) {
            case 1:
                return new zzvt();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzvt> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzvt.class) {
                        try {
                            zzaVar = zzd;
                            if (zzaVar == null) {
                                zzaVar = new zzalf.zza<>(zzc);
                                zzd = zzaVar;
                            }
                        } finally {
                        }
                    }
                }
                return zzaVar;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }

    public static /* synthetic */ void zza(zzvt zzvtVar, zzvw zzvwVar) {
        zzvtVar.zze = zzvwVar.zza();
    }

    public static /* synthetic */ void zza(zzvt zzvtVar, zzvy zzvyVar) {
        zzvtVar.zzf = zzvyVar.zza();
    }

    public static /* synthetic */ void zza(zzvt zzvtVar, zzajv zzajvVar) {
        zzajvVar.getClass();
        zzvtVar.zzg = zzajvVar;
    }
}
