package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzyr.smali */
public final class zzyr extends zzalf<zzyr, zza> implements zzamo {
    private static final zzyr zzc;
    private static volatile zzamv<zzyr> zzd;
    private int zze;

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzyr$zza.smali */
    public static final class zza extends zzalf.zzb<zzyr, zza> implements zzamo {
        private zza() {
            super(zzyr.zzc);
        }
    }

    static {
        zzyr zzyrVar = new zzyr();
        zzc = zzyrVar;
        zzalf.zza((Class<zzyr>) zzyr.class, zzyrVar);
    }

    private zzyr() {
    }

    public static zzyr zzc() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    public static zzyr zza(zzajv zzajvVar, zzaku zzakuVar) {
        return (zzyr) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final Object zza(int i, Object obj, Object obj2) {
        int i5 = zzyq.zza[i - 1];
        switch (i5) {
            case 1:
                return new zzyr();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzyr> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzyr.class) {
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
