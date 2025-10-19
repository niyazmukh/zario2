package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzxq.smali */
public final class zzxq extends zzalf<zzxq, zza> implements zzamo {
    private static final zzxq zzc;
    private static volatile zzamv<zzxq> zzd;
    private String zze = "";

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzxq$zza.smali */
    public static final class zza extends zzalf.zzb<zzxq, zza> implements zzamo {
        public final zza zza(String str) {
            zzg();
            zzxq.zza((zzxq) this.zza, str);
            return this;
        }

        private zza() {
            super(zzxq.zzc);
        }
    }

    static {
        zzxq zzxqVar = new zzxq();
        zzc = zzxqVar;
        zzalf.zza((Class<zzxq>) zzxq.class, zzxqVar);
    }

    private zzxq() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public static zzxq zzc() {
        return zzc;
    }

    public final String zzd() {
        return this.zze;
    }

    public static zzxq zza(zzajv zzajvVar, zzaku zzakuVar) {
        return (zzxq) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final Object zza(int i, Object obj, Object obj2) {
        int i5 = zzxs.zza[i - 1];
        switch (i5) {
            case 1:
                return new zzxq();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzxq> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzxq.class) {
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

    public static /* synthetic */ void zza(zzxq zzxqVar, String str) {
        str.getClass();
        zzxqVar.zze = str;
    }
}
