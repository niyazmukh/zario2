package com.google.android.recaptcha.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzti.smali */
public final class zzti extends zznd implements zzoj {
    private static final zzti zzb;
    private static volatile zzoq zzd;
    private zznk zze = zznd.zzB();
    private int zzf;

    static {
        zzti zztiVar = new zzti();
        zzb = zztiVar;
        zznd.zzI(zzti.class, zztiVar);
    }

    private zzti() {
    }

    public static zztf zzf() {
        return (zztf) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzti zztiVar, Iterable iterable) {
        zztiVar.zzl();
        zzko.zzc(iterable, zztiVar.zze);
    }

    public static /* synthetic */ void zzj(zzti zztiVar, zzth zzthVar) {
        zzthVar.getClass();
        zztiVar.zzl();
        zztiVar.zze.add(zzthVar);
    }

    private final void zzl() {
        zznk zznkVar = this.zze;
        if (zznkVar.zzc()) {
            return;
        }
        this.zze = zznd.zzC(zznkVar);
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i, Object obj, Object obj2) {
        int i5 = i - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u000b", new Object[]{"zze", zzth.class, "zzf"});
        }
        if (i5 == 3) {
            return new zzti();
        }
        zztj zztjVar = null;
        if (i5 == 4) {
            return new zztf(zztjVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        if (i5 != 6) {
            return null;
        }
        zzoq zzmyVar = zzd;
        if (zzmyVar == null) {
            synchronized (zzti.class) {
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
