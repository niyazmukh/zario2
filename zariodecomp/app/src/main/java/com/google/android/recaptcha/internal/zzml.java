package com.google.android.recaptcha.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzml.smali */
public final class zzml extends zznd implements zzoj {
    private static final zzml zzb;
    private static volatile zzoq zzd;
    private long zze;
    private int zzf;

    static {
        zzml zzmlVar = new zzml();
        zzb = zzmlVar;
        zznd.zzI(zzml.class, zzmlVar);
    }

    private zzml() {
    }

    public static zzmj zzi() {
        return (zzmj) zzb.zzq();
    }

    public final int zzf() {
        return this.zzf;
    }

    public final long zzg() {
        return this.zze;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i, Object obj, Object obj2) {
        int i5 = i - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new zzou(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zze", "zzf"});
        }
        if (i5 == 3) {
            return new zzml();
        }
        zzmk zzmkVar = null;
        if (i5 == 4) {
            return new zzmj(zzmkVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        if (i5 != 6) {
            return null;
        }
        zzoq zzmyVar = zzd;
        if (zzmyVar == null) {
            synchronized (zzml.class) {
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
