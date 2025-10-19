package com.google.android.recaptcha.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzro.smali */
public final class zzro extends zznd implements zzoj {
    private static final zzro zzb;
    private static volatile zzoq zzd;
    private int zze;
    private zzqt zzg;
    private zzqk zzh;
    private zzqw zzi;
    private String zzf = "";
    private String zzj = "";
    private String zzk = "";

    static {
        zzro zzroVar = new zzro();
        zzb = zzroVar;
        zznd.zzI(zzro.class, zzroVar);
    }

    private zzro() {
    }

    public static zzrm zzf() {
        return (zzrm) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzro zzroVar, zzqk zzqkVar) {
        zzqkVar.getClass();
        zzroVar.zzh = zzqkVar;
        zzroVar.zze |= 2;
    }

    public static /* synthetic */ void zzj(zzro zzroVar, String str) {
        str.getClass();
        zzroVar.zzk = str;
    }

    public static /* synthetic */ void zzk(zzro zzroVar, String str) {
        str.getClass();
        zzroVar.zzj = str;
    }

    public static /* synthetic */ void zzl(zzro zzroVar, String str) {
        str.getClass();
        zzroVar.zzf = str;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i, Object obj, Object obj2) {
        int i5 = i - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005Ȉ\u0006Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i5 == 3) {
            return new zzro();
        }
        zzrn zzrnVar = null;
        if (i5 == 4) {
            return new zzrm(zzrnVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        if (i5 != 6) {
            return null;
        }
        zzoq zzmyVar = zzd;
        if (zzmyVar == null) {
            synchronized (zzro.class) {
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
