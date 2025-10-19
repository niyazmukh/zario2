package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzyf.smali */
public final class zzyf extends zzalf<zzyf, zza> implements zzamo {
    private static final zzyf zzc;
    private static volatile zzamv<zzyf> zzd;
    private int zze;
    private int zzf;
    private zzyl zzg;
    private zzajv zzh = zzajv.zza;

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzyf$zza.smali */
    public static final class zza extends zzalf.zzb<zzyf, zza> implements zzamo {
        public final zza zza(zzajv zzajvVar) {
            zzg();
            zzyf.zza((zzyf) this.zza, zzajvVar);
            return this;
        }

        private zza() {
            super(zzyf.zzc);
        }

        public final zza zza(zzyl zzylVar) {
            zzg();
            zzyf.zza((zzyf) this.zza, zzylVar);
            return this;
        }
    }

    static {
        zzyf zzyfVar = new zzyf();
        zzc = zzyfVar;
        zzalf.zza((Class<zzyf>) zzyf.class, zzyfVar);
    }

    private zzyf() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzyl zzd() {
        zzyl zzylVar = this.zzg;
        return zzylVar == null ? zzyl.zzd() : zzylVar;
    }

    public final zzajv zze() {
        return this.zzh;
    }

    public static zzyf zza(zzajv zzajvVar, zzaku zzakuVar) {
        return (zzyf) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final Object zza(int i, Object obj, Object obj2) {
        int i5 = zzye.zza[i - 1];
        switch (i5) {
            case 1:
                return new zzyf();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzyf> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzyf.class) {
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

    public static /* synthetic */ void zza(zzyf zzyfVar, zzajv zzajvVar) {
        zzajvVar.getClass();
        zzyfVar.zzh = zzajvVar;
    }

    public static /* synthetic */ void zza(zzyf zzyfVar, zzyl zzylVar) {
        zzylVar.getClass();
        zzyfVar.zzg = zzylVar;
        zzyfVar.zze |= 1;
    }
}
