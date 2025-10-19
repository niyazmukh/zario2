package com.google.android.recaptcha.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzpj.smali */
public final class zzpj extends zznd implements zzoj {
    private static final zzpj zzb;
    private static volatile zzoq zzd;
    private long zze;
    private int zzf;

    static {
        zzpj zzpjVar = new zzpj();
        zzb = zzpjVar;
        zznd.zzI(zzpj.class, zzpjVar);
    }

    private zzpj() {
    }

    public static zzph zzi() {
        return (zzph) zzb.zzq();
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
            return new zzpj();
        }
        zzpi zzpiVar = null;
        if (i5 == 4) {
            return new zzph(zzpiVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        if (i5 != 6) {
            return null;
        }
        zzoq zzmyVar = zzd;
        if (zzmyVar == null) {
            synchronized (zzpj.class) {
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
