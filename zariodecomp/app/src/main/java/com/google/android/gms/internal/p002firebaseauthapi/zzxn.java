package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzxn.smali */
public final class zzxn extends zzalf<zzxn, zza> implements zzamo {
    private static final zzxn zzc;
    private static volatile zzamv<zzxn> zzd;
    private int zze;
    private int zzf;
    private zzxq zzg;

    static {
        zzxn zzxnVar = new zzxn();
        zzc = zzxnVar;
        zzalf.zza((Class<zzxn>) zzxn.class, zzxnVar);
    }

    private zzxn() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzamv<zzxn> zze() {
        return (zzamv) zzc.zza(zzalf.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzxq zzd() {
        zzxq zzxqVar = this.zzg;
        return zzxqVar == null ? zzxq.zzc() : zzxqVar;
    }

    public static zzxn zza(zzajv zzajvVar, zzaku zzakuVar) {
        return (zzxn) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzxp.zza[i - 1]) {
            case 1:
                return new zzxn();
            case 2:
                return new zza((zzxr) null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzxn> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzxn.class) {
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

    public static /* synthetic */ void zza(zzxn zzxnVar, zzxq zzxqVar) {
        zzxqVar.getClass();
        zzxnVar.zzg = zzxqVar;
        zzxnVar.zze |= 1;
    }
}
