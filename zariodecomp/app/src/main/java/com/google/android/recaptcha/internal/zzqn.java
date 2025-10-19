package com.google.android.recaptcha.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzqn.smali */
public final class zzqn extends zznd implements zzoj {
    private static final zzqn zzb;
    private static volatile zzoq zzd;
    private zzle zze;
    private String zzf;
    private zzle zzg;
    private String zzh;
    private String zzi;
    private zzle zzj;
    private String zzk;
    private zzle zzl;

    static {
        zzqn zzqnVar = new zzqn();
        zzb = zzqnVar;
        zznd.zzI(zzqn.class, zzqnVar);
    }

    private zzqn() {
        zzle zzleVar = zzle.zzb;
        this.zze = zzleVar;
        this.zzf = "";
        this.zzg = zzleVar;
        this.zzh = "";
        this.zzi = "";
        this.zzj = zzleVar;
        this.zzk = "";
        this.zzl = zzleVar;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i, Object obj, Object obj2) {
        int i5 = i - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003\n\u0004Ȉ\u0005Ȉ\u0006\n\u0007Ȉ\b\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i5 == 3) {
            return new zzqn();
        }
        zzqm zzqmVar = null;
        if (i5 == 4) {
            return new zzql(zzqmVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        if (i5 != 6) {
            return null;
        }
        zzoq zzmyVar = zzd;
        if (zzmyVar == null) {
            synchronized (zzqn.class) {
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
