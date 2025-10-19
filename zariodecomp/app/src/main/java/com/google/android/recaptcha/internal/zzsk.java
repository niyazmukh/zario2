package com.google.android.recaptcha.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzsk.smali */
public final class zzsk extends zznd implements zzoj {
    private static final zzsk zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        zzsk zzskVar = new zzsk();
        zzb = zzskVar;
        zznd.zzI(zzsk.class, zzskVar);
    }

    private zzsk() {
    }

    public static zzsj zzf() {
        return (zzsj) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzsk zzskVar, String str) {
        str.getClass();
        zzskVar.zze |= 2;
        zzskVar.zzg = str;
    }

    public static /* synthetic */ void zzj(zzsk zzskVar, String str) {
        str.getClass();
        zzskVar.zze |= 1;
        zzskVar.zzf = str;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i, Object obj, Object obj2) {
        int i5 = i - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i5 == 3) {
            return new zzsk();
        }
        zzsn zzsnVar = null;
        if (i5 == 4) {
            return new zzsj(zzsnVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        if (i5 != 6) {
            return null;
        }
        zzoq zzmyVar = zzd;
        if (zzmyVar == null) {
            synchronized (zzsk.class) {
                try {
                    zzmyVar = zzd;
                    if (zzmyVar == null) {
                        zzmyVar = new zzmy(zzb);
                        zzd = zzmyVar;
                    }
                } finally {
                }
            }
        }
        return zzmyVar;
    }
}
