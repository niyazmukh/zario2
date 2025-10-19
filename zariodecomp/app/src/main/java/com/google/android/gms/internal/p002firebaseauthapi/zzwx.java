package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzwx.smali */
public final class zzwx extends zzalf<zzwx, zza> implements zzamo {
    private static final zzwx zzc;
    private static volatile zzamv<zzwx> zzd;
    private String zze = "";
    private zzajv zzf = zzajv.zza;
    private int zzg;

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzwx$zza.smali */
    public static final class zza extends zzalf.zzb<zzwx, zza> implements zzamo {
        public final zza zza(zzb zzbVar) {
            zzg();
            zzwx.zza((zzwx) this.zza, zzbVar);
            return this;
        }

        private zza() {
            super(zzwx.zzc);
        }

        public final zza zza(String str) {
            zzg();
            zzwx.zza((zzwx) this.zza, str);
            return this;
        }

        public final zza zza(zzajv zzajvVar) {
            zzg();
            zzwx.zza((zzwx) this.zza, zzajvVar);
            return this;
        }
    }

    static {
        zzwx zzwxVar = new zzwx();
        zzc = zzwxVar;
        zzalf.zza((Class<zzwx>) zzwx.class, zzwxVar);
    }

    private zzwx() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public static zzwx zzd() {
        return zzc;
    }

    public final zzb zzb() {
        zzb zzbVarZza = zzb.zza(this.zzg);
        return zzbVarZza == null ? zzb.UNRECOGNIZED : zzbVarZza;
    }

    public final zzajv zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final Object zza(int i, Object obj, Object obj2) {
        int i5 = zzwz.zza[i - 1];
        switch (i5) {
            case 1:
                return new zzwx();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzwx> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzwx.class) {
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

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzwx$zzb.smali */
    public enum zzb implements zzalk {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);

        private final int zzh;

        zzb(int i) {
            this.zzh = i;
        }

        @Override // java.lang.Enum
        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(zzb.class.getName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            if (this != UNRECOGNIZED) {
                sb.append(" number=");
                sb.append(zza());
            }
            sb.append(" name=");
            sb.append(name());
            sb.append('>');
            return sb.toString();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalk
        public final int zza() {
            if (this != UNRECOGNIZED) {
                return this.zzh;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static zzb zza(int i) {
            if (i == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i == 1) {
                return SYMMETRIC;
            }
            if (i == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i != 4) {
                return null;
            }
            return REMOTE;
        }
    }

    public static /* synthetic */ void zza(zzwx zzwxVar, zzb zzbVar) {
        zzwxVar.zzg = zzbVar.zza();
    }

    public static /* synthetic */ void zza(zzwx zzwxVar, String str) {
        str.getClass();
        zzwxVar.zze = str;
    }

    public static /* synthetic */ void zza(zzwx zzwxVar, zzajv zzajvVar) {
        zzajvVar.getClass();
        zzwxVar.zzf = zzajvVar;
    }
}
