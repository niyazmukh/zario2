package com.google.android.recaptcha.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zztx.smali */
public final class zztx extends zznd implements zzoj {
    private static final zztx zzb;
    private static volatile zzoq zzd;
    private int zze = 0;
    private Object zzf;

    static {
        zztx zztxVar = new zztx();
        zzb = zztxVar;
        zznd.zzI(zztx.class, zztxVar);
    }

    private zztx() {
    }

    public static /* synthetic */ void zzM(zztx zztxVar, zzrr zzrrVar) {
        zzrrVar.getClass();
        zztxVar.zzf = zzrrVar;
        zztxVar.zze = 2;
    }

    public static zztw zzi() {
        return (zztw) zzb.zzq();
    }

    public static zztx zzk(byte[] bArr) {
        return (zztx) zznd.zzx(zzb, bArr);
    }

    public static /* synthetic */ void zzl(zztx zztxVar, zzrc zzrcVar) {
        zzrcVar.getClass();
        zztxVar.zzf = zzrcVar;
        zztxVar.zze = 1;
    }

    public final int zzN() {
        int i = this.zze;
        if (i == 0) {
            return 3;
        }
        int i5 = 1;
        if (i != 1) {
            i5 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i5;
    }

    public final zzrc zzf() {
        return this.zze == 1 ? (zzrc) this.zzf : zzrc.zzk();
    }

    public final zzrr zzg() {
        return this.zze == 2 ? (zzrr) this.zzf : zzrr.zzg();
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i, Object obj, Object obj2) {
        int i5 = i - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zzf", "zze", zzrc.class, zzrr.class});
        }
        if (i5 == 3) {
            return new zztx();
        }
        zzug zzugVar = null;
        if (i5 == 4) {
            return new zztw(zzugVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        if (i5 != 6) {
            return null;
        }
        zzoq zzmyVar = zzd;
        if (zzmyVar == null) {
            synchronized (zztx.class) {
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
