package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

@Deprecated
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzxe.smali */
public final class zzxe extends zzalf<zzxe, zza> implements zzamo {
    private static final zzxe zzc;
    private static volatile zzamv<zzxe> zzd;
    private int zzg;
    private boolean zzh;
    private String zze = "";
    private String zzf = "";
    private String zzi = "";

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzxe$zza.smali */
    public static final class zza extends zzalf.zzb<zzxe, zza> implements zzamo {
        private zza() {
            super(zzxe.zzc);
        }
    }

    static {
        zzxe zzxeVar = new zzxe();
        zzc = zzxeVar;
        zzalf.zza((Class<zzxe>) zzxe.class, zzxeVar);
    }

    private zzxe() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final Object zza(int i, Object obj, Object obj2) {
        int i5 = zzxg.zza[i - 1];
        switch (i5) {
            case 1:
                return new zzxe();
            case 2:
                return new zza();
            case 3:
                return zzalf.zza(zzc, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzxe> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzxe.class) {
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
