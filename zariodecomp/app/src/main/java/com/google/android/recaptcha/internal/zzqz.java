package com.google.android.recaptcha.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzqz.smali */
public final class zzqz extends zznd implements zzoj {
    private static final zzqz zzb;
    private static volatile zzoq zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private int zzk;
    private String zzf = "";
    private String zzh = "";
    private String zzj = "";

    static {
        zzqz zzqzVar = new zzqz();
        zzb = zzqzVar;
        zznd.zzI(zzqz.class, zzqzVar);
    }

    private zzqz() {
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i, Object obj, Object obj2) {
        int i5 = i - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\u0004\u0004Ȉ\u0005\u0004\u0006Ȉ\u0007\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i5 == 3) {
            return new zzqz();
        }
        zzqy zzqyVar = null;
        if (i5 == 4) {
            return new zzqx(zzqyVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        if (i5 != 6) {
            return null;
        }
        zzoq zzmyVar = zzd;
        if (zzmyVar == null) {
            synchronized (zzqz.class) {
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
