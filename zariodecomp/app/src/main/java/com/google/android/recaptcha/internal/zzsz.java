package com.google.android.recaptcha.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzsz.smali */
public final class zzsz extends zznd implements zzoj {
    private static final zzsz zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = "";
    private zznk zzg = zznd.zzB();

    static {
        zzsz zzszVar = new zzsz();
        zzb = zzszVar;
        zznd.zzI(zzsz.class, zzszVar);
    }

    private zzsz() {
    }

    public static zzsy zzf() {
        return (zzsy) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzsz zzszVar, Iterable iterable) {
        zzszVar.zzl();
        zzko.zzc(iterable, zzszVar.zzg);
    }

    public static /* synthetic */ void zzj(zzsz zzszVar, zzsx zzsxVar) {
        zzsxVar.getClass();
        zzszVar.zzl();
        zzszVar.zzg.add(zzsxVar);
    }

    public static /* synthetic */ void zzk(zzsz zzszVar, String str) {
        str.getClass();
        zzszVar.zze |= 1;
        zzszVar.zzf = str;
    }

    private final void zzl() {
        zznk zznkVar = this.zzg;
        if (zznkVar.zzc()) {
            return;
        }
        this.zzg = zznd.zzC(zznkVar);
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i, Object obj, Object obj2) {
        int i5 = i - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"zze", "zzg", zzsx.class, "zzf"});
        }
        if (i5 == 3) {
            return new zzsz();
        }
        zzta zztaVar = null;
        if (i5 == 4) {
            return new zzsy(zztaVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        if (i5 != 6) {
            return null;
        }
        zzoq zzmyVar = zzd;
        if (zzmyVar == null) {
            synchronized (zzsz.class) {
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
