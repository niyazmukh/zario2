package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzsz.smali */
public final class zzsz extends zzalf<zzsz, zza> implements zzamo {
    private static final zzsz zzc;
    private static volatile zzamv<zzsz> zzd;
    private int zze;
    private int zzf;
    private zztc zzg;

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzsz$zza.smali */
    public static final class zza extends zzalf.zzb<zzsz, zza> implements zzamo {
        public final zza zza(int i) {
            zzg();
            ((zzsz) this.zza).zzf = i;
            return this;
        }

        private zza() {
            super(zzsz.zzc);
        }

        public final zza zza(zztc zztcVar) {
            zzg();
            zzsz.zza((zzsz) this.zza, zztcVar);
            return this;
        }
    }

    static {
        zzsz zzszVar = new zzsz();
        zzc = zzszVar;
        zzalf.zza((Class<zzsz>) zzsz.class, zzszVar);
    }

    private zzsz() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    public final zztc zzd() {
        zztc zztcVar = this.zzg;
        return zztcVar == null ? zztc.zzd() : zztcVar;
    }

    public static zzsz zza(zzajv zzajvVar, zzaku zzakuVar) {
        return (zzsz) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final Object zza(int i, Object obj, Object obj2) {
        int i5 = zztb.zza[i - 1];
        switch (i5) {
            case 1:
                return new zzsz();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzsz> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzsz.class) {
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

    public static /* synthetic */ void zza(zzsz zzszVar, zztc zztcVar) {
        zztcVar.getClass();
        zzszVar.zzg = zztcVar;
        zzszVar.zze |= 1;
    }
}
