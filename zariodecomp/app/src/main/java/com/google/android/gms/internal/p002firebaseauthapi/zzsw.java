package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzsw.smali */
public final class zzsw extends zzalf<zzsw, zza> implements zzamo {
    private static final zzsw zzc;
    private static volatile zzamv<zzsw> zzd;
    private int zze;
    private int zzf;
    private zzajv zzg = zzajv.zza;
    private zztc zzh;

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzsw$zza.smali */
    public static final class zza extends zzalf.zzb<zzsw, zza> implements zzamo {
        public final zza zza(zzajv zzajvVar) {
            zzg();
            zzsw.zza((zzsw) this.zza, zzajvVar);
            return this;
        }

        private zza() {
            super(zzsw.zzc);
        }

        public final zza zza(zztc zztcVar) {
            zzg();
            zzsw.zza((zzsw) this.zza, zztcVar);
            return this;
        }
    }

    static {
        zzsw zzswVar = new zzsw();
        zzc = zzswVar;
        zzalf.zza((Class<zzsw>) zzsw.class, zzswVar);
    }

    private zzsw() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzamv<zzsw> zzf() {
        return (zzamv) zzc.zza(zzalf.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zztc zzd() {
        zztc zztcVar = this.zzh;
        return zztcVar == null ? zztc.zzd() : zztcVar;
    }

    public final zzajv zze() {
        return this.zzg;
    }

    public static zzsw zza(zzajv zzajvVar, zzaku zzakuVar) {
        return (zzsw) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final Object zza(int i, Object obj, Object obj2) {
        int i5 = zzsy.zza[i - 1];
        switch (i5) {
            case 1:
                return new zzsw();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzsw> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzsw.class) {
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

    public static /* synthetic */ void zza(zzsw zzswVar, zzajv zzajvVar) {
        zzajvVar.getClass();
        zzswVar.zzg = zzajvVar;
    }

    public static /* synthetic */ void zza(zzsw zzswVar, zztc zztcVar) {
        zztcVar.getClass();
        zzswVar.zzh = zztcVar;
        zzswVar.zze |= 1;
    }
}
