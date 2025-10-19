package com.google.android.recaptcha.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzmf.smali */
public final class zzmf extends zznd implements zzoj {
    private static final zzmf zzb;
    private static volatile zzoq zzd;
    private int zze;
    private boolean zzg;
    private byte zzh = 2;
    private String zzf = "";

    static {
        zzmf zzmfVar = new zzmf();
        zzb = zzmfVar;
        zznd.zzI(zzmf.class, zzmfVar);
    }

    private zzmf() {
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i, Object obj, Object obj2) {
        int i5 = i - 1;
        if (i5 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i5 == 2) {
            return new zzou(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i5 == 3) {
            return new zzmf();
        }
        zzmh zzmhVar = null;
        if (i5 == 4) {
            return new zzme(zzmhVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        if (i5 != 6) {
            this.zzh = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzoq zzmyVar = zzd;
        if (zzmyVar == null) {
            synchronized (zzmf.class) {
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
