package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzvq.smali */
public final class zzvq extends zzalf<zzvq, zza> implements zzamo {
    private static final zzvq zzc;
    private static volatile zzamv<zzvq> zzd;
    private int zze;
    private int zzf;
    private zzvk zzg;
    private zzajv zzh;
    private zzajv zzi;

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzvq$zza.smali */
    public static final class zza extends zzalf.zzb<zzvq, zza> implements zzamo {
        public final zza zza(zzvk zzvkVar) {
            zzg();
            zzvq.zza((zzvq) this.zza, zzvkVar);
            return this;
        }

        public final zza zzb(zzajv zzajvVar) {
            zzg();
            zzvq.zzb((zzvq) this.zza, zzajvVar);
            return this;
        }

        private zza() {
            super(zzvq.zzc);
        }

        public final zza zza(int i) {
            zzg();
            ((zzvq) this.zza).zzf = 0;
            return this;
        }

        public final zza zza(zzajv zzajvVar) {
            zzg();
            zzvq.zza((zzvq) this.zza, zzajvVar);
            return this;
        }
    }

    static {
        zzvq zzvqVar = new zzvq();
        zzc = zzvqVar;
        zzalf.zza((Class<zzvq>) zzvq.class, zzvqVar);
    }

    private zzvq() {
        zzajv zzajvVar = zzajv.zza;
        this.zzh = zzajvVar;
        this.zzi = zzajvVar;
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public static zzvq zze() {
        return zzc;
    }

    public static zzamv<zzvq> zzh() {
        return (zzamv) zzc.zza(zzalf.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzvk zzb() {
        zzvk zzvkVar = this.zzg;
        return zzvkVar == null ? zzvk.zze() : zzvkVar;
    }

    public final zzajv zzf() {
        return this.zzh;
    }

    public final zzajv zzg() {
        return this.zzi;
    }

    public static zzvq zza(zzajv zzajvVar, zzaku zzakuVar) {
        return (zzvq) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    public static /* synthetic */ void zzb(zzvq zzvqVar, zzajv zzajvVar) {
        zzajvVar.getClass();
        zzvqVar.zzi = zzajvVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final Object zza(int i, Object obj, Object obj2) {
        int i5 = zzvp.zza[i - 1];
        switch (i5) {
            case 1:
                return new zzvq();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzvq> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzvq.class) {
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

    public static /* synthetic */ void zza(zzvq zzvqVar, zzvk zzvkVar) {
        zzvkVar.getClass();
        zzvqVar.zzg = zzvkVar;
        zzvqVar.zze |= 1;
    }

    public static /* synthetic */ void zza(zzvq zzvqVar, zzajv zzajvVar) {
        zzajvVar.getClass();
        zzvqVar.zzh = zzajvVar;
    }
}
