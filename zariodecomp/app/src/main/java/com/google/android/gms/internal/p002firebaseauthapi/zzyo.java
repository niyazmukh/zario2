package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzyo.smali */
public final class zzyo extends zzalf<zzyo, zza> implements zzamo {
    private static final zzyo zzc;
    private static volatile zzamv<zzyo> zzd;
    private int zze;
    private zzajv zzf = zzajv.zza;

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzyo$zza.smali */
    public static final class zza extends zzalf.zzb<zzyo, zza> implements zzamo {
        public final zza zza(zzajv zzajvVar) {
            zzg();
            zzyo.zza((zzyo) this.zza, zzajvVar);
            return this;
        }

        private zza() {
            super(zzyo.zzc);
        }
    }

    static {
        zzyo zzyoVar = new zzyo();
        zzc = zzyoVar;
        zzalf.zza((Class<zzyo>) zzyo.class, zzyoVar);
    }

    private zzyo() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzamv<zzyo> zze() {
        return (zzamv) zzc.zza(zzalf.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zze;
    }

    public final zzajv zzd() {
        return this.zzf;
    }

    public static zzyo zza(zzajv zzajvVar, zzaku zzakuVar) {
        return (zzyo) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final Object zza(int i, Object obj, Object obj2) {
        int i5 = zzyn.zza[i - 1];
        switch (i5) {
            case 1:
                return new zzyo();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzyo> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzyo.class) {
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

    public static /* synthetic */ void zza(zzyo zzyoVar, zzajv zzajvVar) {
        zzajvVar.getClass();
        zzyoVar.zzf = zzajvVar;
    }
}
