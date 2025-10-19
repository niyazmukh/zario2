package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzwu.smali */
public final class zzwu extends zzalf<zzwu, zza> implements zzamo {
    private static final zzwu zzc;
    private static volatile zzamv<zzwu> zzd;
    private int zze;
    private int zzf;
    private zzwo zzg;
    private zzajv zzh = zzajv.zza;

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzwu$zza.smali */
    public static final class zza extends zzalf.zzb<zzwu, zza> implements zzamo {
        public final zza zza(zzwo zzwoVar) {
            zzg();
            zzwu.zza((zzwu) this.zza, zzwoVar);
            return this;
        }

        private zza() {
            super(zzwu.zzc);
        }

        public final zza zza(zzajv zzajvVar) {
            zzg();
            zzwu.zza((zzwu) this.zza, zzajvVar);
            return this;
        }

        public final zza zza(int i) {
            zzg();
            ((zzwu) this.zza).zzf = 0;
            return this;
        }
    }

    static {
        zzwu zzwuVar = new zzwu();
        zzc = zzwuVar;
        zzalf.zza((Class<zzwu>) zzwu.class, zzwuVar);
    }

    private zzwu() {
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public static zzwu zze() {
        return zzc;
    }

    public static zzamv<zzwu> zzg() {
        return (zzamv) zzc.zza(zzalf.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzwo zzb() {
        zzwo zzwoVar = this.zzg;
        return zzwoVar == null ? zzwo.zzf() : zzwoVar;
    }

    public final zzajv zzf() {
        return this.zzh;
    }

    public static zzwu zza(zzajv zzajvVar, zzaku zzakuVar) {
        return (zzwu) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final Object zza(int i, Object obj, Object obj2) {
        int i5 = zzww.zza[i - 1];
        switch (i5) {
            case 1:
                return new zzwu();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzwu> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzwu.class) {
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

    public static /* synthetic */ void zza(zzwu zzwuVar, zzwo zzwoVar) {
        zzwoVar.getClass();
        zzwuVar.zzg = zzwoVar;
        zzwuVar.zze |= 1;
    }

    public static /* synthetic */ void zza(zzwu zzwuVar, zzajv zzajvVar) {
        zzajvVar.getClass();
        zzwuVar.zzh = zzajvVar;
    }
}
