package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzug.smali */
public final class zzug extends zzalf<zzug, zza> implements zzamo {
    private static final zzug zzc;
    private static volatile zzamv<zzug> zzd;
    private int zze;
    private int zzf;

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzug$zza.smali */
    public static final class zza extends zzalf.zzb<zzug, zza> implements zzamo {
        public final zza zza(int i) {
            zzg();
            ((zzug) this.zza).zze = i;
            return this;
        }

        private zza() {
            super(zzug.zzc);
        }
    }

    static {
        zzug zzugVar = new zzug();
        zzc = zzugVar;
        zzalf.zza((Class<zzug>) zzug.class, zzugVar);
    }

    private zzug() {
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }

    public static zzug zza(zzajv zzajvVar, zzaku zzakuVar) {
        return (zzug) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final Object zza(int i, Object obj, Object obj2) {
        int i5 = zzui.zza[i - 1];
        switch (i5) {
            case 1:
                return new zzug();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzug> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzug.class) {
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
