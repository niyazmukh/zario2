package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzwb.smali */
public final class zzwb extends zzalf<zzwb, zza> implements zzamo {
    private static final zzwb zzc;
    private static volatile zzamv<zzwb> zzd;
    private int zze;
    private int zzf;
    private zzwh zzg;
    private zzajv zzh = zzajv.zza;

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzwb$zza.smali */
    public static final class zza extends zzalf.zzb<zzwb, zza> implements zzamo {
        public final zza zza(zzajv zzajvVar) {
            zzg();
            zzwb.zza((zzwb) this.zza, zzajvVar);
            return this;
        }

        private zza() {
            super(zzwb.zzc);
        }

        public final zza zza(zzwh zzwhVar) {
            zzg();
            zzwb.zza((zzwb) this.zza, zzwhVar);
            return this;
        }
    }

    static {
        zzwb zzwbVar = new zzwb();
        zzc = zzwbVar;
        zzalf.zza((Class<zzwb>) zzwb.class, zzwbVar);
    }

    private zzwb() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzwb zzd() {
        return zzc;
    }

    public static zzamv<zzwb> zzg() {
        return (zzamv) zzc.zza(zzalf.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzwh zze() {
        zzwh zzwhVar = this.zzg;
        return zzwhVar == null ? zzwh.zze() : zzwhVar;
    }

    public final zzajv zzf() {
        return this.zzh;
    }

    public static zzwb zza(zzajv zzajvVar, zzaku zzakuVar) {
        return (zzwb) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final Object zza(int i, Object obj, Object obj2) {
        int i5 = zzwa.zza[i - 1];
        switch (i5) {
            case 1:
                return new zzwb();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzwb> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzwb.class) {
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

    public static /* synthetic */ void zza(zzwb zzwbVar, zzajv zzajvVar) {
        zzajvVar.getClass();
        zzwbVar.zzh = zzajvVar;
    }

    public static /* synthetic */ void zza(zzwb zzwbVar, zzwh zzwhVar) {
        zzwhVar.getClass();
        zzwbVar.zzg = zzwhVar;
        zzwbVar.zze |= 1;
    }
}
