package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzuy.smali */
public final class zzuy extends zzalf<zzuy, zza> implements zzamo {
    private static final zzuy zzc;
    private static volatile zzamv<zzuy> zzd;

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzuy$zza.smali */
    public static final class zza extends zzalf.zzb<zzuy, zza> implements zzamo {
        private zza() {
            super(zzuy.zzc);
        }
    }

    static {
        zzuy zzuyVar = new zzuy();
        zzc = zzuyVar;
        zzalf.zza((Class<zzuy>) zzuy.class, zzuyVar);
    }

    private zzuy() {
    }

    public static zzuy zzb() {
        return zzc;
    }

    public static zzuy zza(zzajv zzajvVar, zzaku zzakuVar) {
        return (zzuy) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final Object zza(int i, Object obj, Object obj2) {
        int i5 = zzva.zza[i - 1];
        switch (i5) {
            case 1:
                return new zzuy();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzc;
            case 5:
                zzamv<zzuy> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzuy.class) {
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
