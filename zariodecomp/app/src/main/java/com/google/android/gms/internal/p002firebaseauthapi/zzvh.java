package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzvh.smali */
public final class zzvh extends zzalf<zzvh, zza> implements zzamo {
    private static final zzvh zzc;
    private static volatile zzamv<zzvh> zzd;
    private int zze;
    private zzvk zzf;

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzvh$zza.smali */
    public static final class zza extends zzalf.zzb<zzvh, zza> implements zzamo {
        public final zza zza(zzvk zzvkVar) {
            zzg();
            zzvh.zza((zzvh) this.zza, zzvkVar);
            return this;
        }

        private zza() {
            super(zzvh.zzc);
        }
    }

    static {
        zzvh zzvhVar = new zzvh();
        zzc = zzvhVar;
        zzalf.zza((Class<zzvh>) zzvh.class, zzvhVar);
    }

    private zzvh() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public final zzvk zzc() {
        zzvk zzvkVar = this.zzf;
        return zzvkVar == null ? zzvk.zze() : zzvkVar;
    }

    public static zzvh zza(zzajv zzajvVar, zzaku zzakuVar) {
        return (zzvh) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final Object zza(int i, Object obj, Object obj2) {
        int i5 = zzvg.zza[i - 1];
        switch (i5) {
            case 1:
                return new zzvh();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzvh> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzvh.class) {
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

    public static /* synthetic */ void zza(zzvh zzvhVar, zzvk zzvkVar) {
        zzvkVar.getClass();
        zzvhVar.zzf = zzvkVar;
        zzvhVar.zze |= 1;
    }
}
