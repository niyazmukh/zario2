package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzyi.smali */
public final class zzyi extends zzalf<zzyi, zza> implements zzamo {
    private static final zzyi zzc;
    private static volatile zzamv<zzyi> zzd;
    private int zze;
    private int zzf;
    private zzyl zzg;

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzyi$zza.smali */
    public static final class zza extends zzalf.zzb<zzyi, zza> implements zzamo {
        public final zza zza(zzyl zzylVar) {
            zzg();
            zzyi.zza((zzyi) this.zza, zzylVar);
            return this;
        }

        private zza() {
            super(zzyi.zzc);
        }
    }

    static {
        zzyi zzyiVar = new zzyi();
        zzc = zzyiVar;
        zzalf.zza((Class<zzyi>) zzyi.class, zzyiVar);
    }

    private zzyi() {
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

    public static zzyi zza(zzajv zzajvVar, zzaku zzakuVar) {
        return (zzyi) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final Object zza(int i, Object obj, Object obj2) {
        int i5 = zzyh.zza[i - 1];
        switch (i5) {
            case 1:
                return new zzyi();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzyi> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzyi.class) {
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

    public static /* synthetic */ void zza(zzyi zzyiVar, zzyl zzylVar) {
        zzylVar.getClass();
        zzyiVar.zzg = zzylVar;
        zzyiVar.zze |= 1;
    }
}
