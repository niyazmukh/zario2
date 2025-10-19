package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzwr.smali */
public final class zzwr extends zzalf<zzwr, zza> implements zzamo {
    private static final zzwr zzc;
    private static volatile zzamv<zzwr> zzd;
    private int zze;
    private int zzf;
    private zzwu zzg;
    private zzajv zzh = zzajv.zza;

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzwr$zza.smali */
    public static final class zza extends zzalf.zzb<zzwr, zza> implements zzamo {
        public final zza zza(zzajv zzajvVar) {
            zzg();
            zzwr.zza((zzwr) this.zza, zzajvVar);
            return this;
        }

        private zza() {
            super(zzwr.zzc);
        }

        public final zza zza(zzwu zzwuVar) {
            zzg();
            zzwr.zza((zzwr) this.zza, zzwuVar);
            return this;
        }

        public final zza zza(int i) {
            zzg();
            ((zzwr) this.zza).zzf = 0;
            return this;
        }
    }

    static {
        zzwr zzwrVar = new zzwr();
        zzc = zzwrVar;
        zzalf.zza((Class<zzwr>) zzwr.class, zzwrVar);
    }

    private zzwr() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzamv<zzwr> zzf() {
        return (zzamv) zzc.zza(zzalf.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzwu zzd() {
        zzwu zzwuVar = this.zzg;
        return zzwuVar == null ? zzwu.zze() : zzwuVar;
    }

    public final zzajv zze() {
        return this.zzh;
    }

    public static zzwr zza(zzajv zzajvVar, zzaku zzakuVar) {
        return (zzwr) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final Object zza(int i, Object obj, Object obj2) {
        int i5 = zzwt.zza[i - 1];
        switch (i5) {
            case 1:
                return new zzwr();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzwr> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzwr.class) {
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

    public static /* synthetic */ void zza(zzwr zzwrVar, zzajv zzajvVar) {
        zzajvVar.getClass();
        zzwrVar.zzh = zzajvVar;
    }

    public static /* synthetic */ void zza(zzwr zzwrVar, zzwu zzwuVar) {
        zzwuVar.getClass();
        zzwrVar.zzg = zzwuVar;
        zzwrVar.zze |= 1;
    }
}
