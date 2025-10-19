package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zztc.smali */
public final class zztc extends zzalf<zztc, zza> implements zzamo {
    private static final zztc zzc;
    private static volatile zzamv<zztc> zzd;
    private int zze;

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zztc$zza.smali */
    public static final class zza extends zzalf.zzb<zztc, zza> implements zzamo {
        public final zza zza(int i) {
            zzg();
            ((zztc) this.zza).zze = i;
            return this;
        }

        private zza() {
            super(zztc.zzc);
        }
    }

    static {
        zztc zztcVar = new zztc();
        zzc = zztcVar;
        zzalf.zza((Class<zztc>) zztc.class, zztcVar);
    }

    private zztc() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zztc zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final Object zza(int i, Object obj, Object obj2) {
        int i5 = zzte.zza[i - 1];
        switch (i5) {
            case 1:
                return new zztc();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzamv<zztc> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zztc.class) {
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
}
