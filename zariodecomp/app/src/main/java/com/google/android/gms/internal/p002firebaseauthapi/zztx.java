package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zztx.smali */
public final class zztx extends zzalf<zztx, zza> implements zzamo {
    private static final zztx zzc;
    private static volatile zzamv<zztx> zzd;
    private int zze;
    private zzua zzf;
    private int zzg;

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zztx$zza.smali */
    public static final class zza extends zzalf.zzb<zztx, zza> implements zzamo {
        public final zza zza(int i) {
            zzg();
            ((zztx) this.zza).zzg = i;
            return this;
        }

        private zza() {
            super(zztx.zzc);
        }

        public final zza zza(zzua zzuaVar) {
            zzg();
            zztx.zza((zztx) this.zza, zzuaVar);
            return this;
        }
    }

    static {
        zztx zztxVar = new zztx();
        zzc = zztxVar;
        zzalf.zza((Class<zztx>) zztx.class, zztxVar);
    }

    private zztx() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zzg;
    }

    public final zzua zzd() {
        zzua zzuaVar = this.zzf;
        return zzuaVar == null ? zzua.zzd() : zzuaVar;
    }

    public static zztx zza(zzajv zzajvVar, zzaku zzakuVar) {
        return (zztx) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final Object zza(int i, Object obj, Object obj2) {
        int i5 = zztz.zza[i - 1];
        switch (i5) {
            case 1:
                return new zztx();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamv<zztx> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zztx.class) {
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

    public static /* synthetic */ void zza(zztx zztxVar, zzua zzuaVar) {
        zzuaVar.getClass();
        zztxVar.zzf = zzuaVar;
        zztxVar.zze |= 1;
    }
}
