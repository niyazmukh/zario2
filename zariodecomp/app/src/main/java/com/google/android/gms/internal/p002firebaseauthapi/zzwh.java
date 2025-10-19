package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzwh.smali */
public final class zzwh extends zzalf<zzwh, zza> implements zzamo {
    private static final zzwh zzc;
    private static volatile zzamv<zzwh> zzd;
    private int zze;
    private int zzf;

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzwh$zza.smali */
    public static final class zza extends zzalf.zzb<zzwh, zza> implements zzamo {
        public final zza zza(zzvy zzvyVar) {
            zzg();
            zzwh.zza((zzwh) this.zza, zzvyVar);
            return this;
        }

        private zza() {
            super(zzwh.zzc);
        }

        public final zza zza(int i) {
            zzg();
            ((zzwh) this.zza).zzf = i;
            return this;
        }
    }

    static {
        zzwh zzwhVar = new zzwh();
        zzc = zzwhVar;
        zzalf.zza((Class<zzwh>) zzwh.class, zzwhVar);
    }

    private zzwh() {
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public static zzwh zze() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzvy zzb() {
        zzvy zzvyVarZza = zzvy.zza(this.zze);
        return zzvyVarZza == null ? zzvy.UNRECOGNIZED : zzvyVarZza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final Object zza(int i, Object obj, Object obj2) {
        int i5 = zzwg.zza[i - 1];
        switch (i5) {
            case 1:
                return new zzwh();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzwh> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzwh.class) {
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

    public static /* synthetic */ void zza(zzwh zzwhVar, zzvy zzvyVar) {
        zzwhVar.zze = zzvyVar.zza();
    }
}
