package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzup.smali */
public final class zzup extends zzalf<zzup, zza> implements zzamo {
    private static final zzup zzc;
    private static volatile zzamv<zzup> zzd;
    private int zze;
    private zzajv zzf = zzajv.zza;

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzup$zza.smali */
    public static final class zza extends zzalf.zzb<zzup, zza> implements zzamo {
        public final zza zza(zzajv zzajvVar) {
            zzg();
            zzup.zza((zzup) this.zza, zzajvVar);
            return this;
        }

        private zza() {
            super(zzup.zzc);
        }
    }

    static {
        zzup zzupVar = new zzup();
        zzc = zzupVar;
        zzalf.zza((Class<zzup>) zzup.class, zzupVar);
    }

    private zzup() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzamv<zzup> zze() {
        return (zzamv) zzc.zza(zzalf.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zze;
    }

    public final zzajv zzd() {
        return this.zzf;
    }

    public static zzup zza(zzajv zzajvVar, zzaku zzakuVar) {
        return (zzup) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final Object zza(int i, Object obj, Object obj2) {
        int i5 = zzur.zza[i - 1];
        switch (i5) {
            case 1:
                return new zzup();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzup> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzup.class) {
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

    public static /* synthetic */ void zza(zzup zzupVar, zzajv zzajvVar) {
        zzajvVar.getClass();
        zzupVar.zzf = zzajvVar;
    }
}
