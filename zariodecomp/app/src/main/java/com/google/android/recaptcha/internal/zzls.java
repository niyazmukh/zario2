package com.google.android.recaptcha.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzls.smali */
public final class zzls extends zzna implements zzoj {
    private static final zzls zzd;
    private static volatile zzoq zze;
    private int zzf;
    private boolean zzg;
    private zzma zzh;
    private boolean zzi;
    private zzmc zzj;
    private byte zzl = 2;
    private zznk zzk = zzot.zze();

    static {
        zzls zzlsVar = new zzls();
        zzd = zzlsVar;
        zznd.zzI(zzls.class, zzlsVar);
    }

    private zzls() {
    }

    public static zzls zzg() {
        return zzd;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i, Object obj, Object obj2) {
        int i5 = i - 1;
        if (i5 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i5 == 2) {
            return new zzou(zzd, "\u0001\u0005\u0000\u0001\u0001ϧ\u0005\u0000\u0001\u0002\u0001ဇ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဉ\u0003ϧЛ", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzmg.class});
        }
        if (i5 == 3) {
            return new zzls();
        }
        zzmh zzmhVar = null;
        if (i5 == 4) {
            return new zzlr(zzmhVar);
        }
        if (i5 == 5) {
            return zzd;
        }
        if (i5 != 6) {
            this.zzl = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzoq zzmyVar = zze;
        if (zzmyVar == null) {
            synchronized (zzls.class) {
                try {
                    zzmyVar = zze;
                    if (zzmyVar == null) {
                        zzmyVar = new zzmy(zzd);
                        zze = zzmyVar;
                    }
                } finally {
                }
            }
        }
        return zzmyVar;
    }
}
