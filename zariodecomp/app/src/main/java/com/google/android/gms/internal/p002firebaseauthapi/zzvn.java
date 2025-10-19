package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzvn.smali */
public final class zzvn extends zzalf<zzvn, zza> implements zzamo {
    private static final zzvn zzc;
    private static volatile zzamv<zzvn> zzd;
    private int zze;
    private int zzf;
    private zzvq zzg;
    private zzajv zzh = zzajv.zza;

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzvn$zza.smali */
    public static final class zza extends zzalf.zzb<zzvn, zza> implements zzamo {
        public final zza zza(zzajv zzajvVar) {
            zzg();
            zzvn.zza((zzvn) this.zza, zzajvVar);
            return this;
        }

        private zza() {
            super(zzvn.zzc);
        }

        public final zza zza(zzvq zzvqVar) {
            zzg();
            zzvn.zza((zzvn) this.zza, zzvqVar);
            return this;
        }

        public final zza zza(int i) {
            zzg();
            ((zzvn) this.zza).zzf = 0;
            return this;
        }
    }

    static {
        zzvn zzvnVar = new zzvn();
        zzc = zzvnVar;
        zzalf.zza((Class<zzvn>) zzvn.class, zzvnVar);
    }

    private zzvn() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzamv<zzvn> zzf() {
        return (zzamv) zzc.zza(zzalf.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzvq zzd() {
        zzvq zzvqVar = this.zzg;
        return zzvqVar == null ? zzvq.zze() : zzvqVar;
    }

    public final zzajv zze() {
        return this.zzh;
    }

    public static zzvn zza(zzajv zzajvVar, zzaku zzakuVar) {
        return (zzvn) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final Object zza(int i, Object obj, Object obj2) {
        int i5 = zzvm.zza[i - 1];
        switch (i5) {
            case 1:
                return new zzvn();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzvn> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzvn.class) {
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

    public static /* synthetic */ void zza(zzvn zzvnVar, zzajv zzajvVar) {
        zzajvVar.getClass();
        zzvnVar.zzh = zzajvVar;
    }

    public static /* synthetic */ void zza(zzvn zzvnVar, zzvq zzvqVar) {
        zzvqVar.getClass();
        zzvnVar.zzg = zzvqVar;
        zzvnVar.zze |= 1;
    }
}
