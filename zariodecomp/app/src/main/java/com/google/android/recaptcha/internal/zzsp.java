package com.google.android.recaptcha.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzsp.smali */
public final class zzsp extends zznd implements zzoj {
    private static final zzsp zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private zzsi zzm;

    static {
        zzsp zzspVar = new zzsp();
        zzb = zzspVar;
        zznd.zzI(zzsp.class, zzspVar);
    }

    private zzsp() {
    }

    public static /* synthetic */ void zzM(zzsp zzspVar, String str) {
        str.getClass();
        zzspVar.zze |= 4;
        zzspVar.zzh = str;
    }

    public static zzso zzf() {
        return (zzso) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzsp zzspVar, String str) {
        str.getClass();
        zzspVar.zze |= 8;
        zzspVar.zzi = str;
    }

    public static /* synthetic */ void zzj(zzsp zzspVar, String str) {
        str.getClass();
        zzspVar.zze |= 2;
        zzspVar.zzg = str;
    }

    public static /* synthetic */ void zzk(zzsp zzspVar, String str) {
        str.getClass();
        zzspVar.zze |= 1;
        zzspVar.zzf = str;
    }

    public static /* synthetic */ void zzl(zzsp zzspVar, zzsi zzsiVar) {
        zzsiVar.getClass();
        zzspVar.zzm = zzsiVar;
        zzspVar.zze |= 128;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i, Object obj, Object obj2) {
        int i5 = i - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bဉ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i5 == 3) {
            return new zzsp();
        }
        zzsu zzsuVar = null;
        if (i5 == 4) {
            return new zzso(zzsuVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        if (i5 != 6) {
            return null;
        }
        zzoq zzmyVar = zzd;
        if (zzmyVar == null) {
            synchronized (zzsp.class) {
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
