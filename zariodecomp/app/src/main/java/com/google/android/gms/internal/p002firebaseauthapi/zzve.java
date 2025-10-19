package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzve.smali */
public final class zzve extends zzalf<zzve, zza> implements zzamo {
    private static final zzve zzc;
    private static volatile zzamv<zzve> zzd;
    private int zze;
    private zzxb zzf;

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzve$zza.smali */
    public static final class zza extends zzalf.zzb<zzve, zza> implements zzamo {
        public final zza zza(zzxb zzxbVar) {
            zzg();
            zzve.zza((zzve) this.zza, zzxbVar);
            return this;
        }

        private zza() {
            super(zzve.zzc);
        }
    }

    static {
        zzve zzveVar = new zzve();
        zzc = zzveVar;
        zzalf.zza((Class<zzve>) zzve.class, zzveVar);
    }

    private zzve() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public static zzve zzc() {
        return zzc;
    }

    public final zzxb zzd() {
        zzxb zzxbVar = this.zzf;
        return zzxbVar == null ? zzxb.zzc() : zzxbVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final Object zza(int i, Object obj, Object obj2) {
        int i5 = zzvd.zza[i - 1];
        switch (i5) {
            case 1:
                return new zzve();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzve> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzve.class) {
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

    public static /* synthetic */ void zza(zzve zzveVar, zzxb zzxbVar) {
        zzxbVar.getClass();
        zzveVar.zzf = zzxbVar;
        zzveVar.zze |= 1;
    }
}
