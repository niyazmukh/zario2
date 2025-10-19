package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zztz.smali */
public final class zztz extends zznd implements zzoj {
    private static final zztz zzb;
    private static volatile zzoq zzd;
    private zznk zze = zznd.zzB();

    static {
        zztz zztzVar = new zztz();
        zzb = zztzVar;
        zznd.zzI(zztz.class, zztzVar);
    }

    private zztz() {
    }

    public static zztz zzg(byte[] bArr) {
        return (zztz) zznd.zzx(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i, Object obj, Object obj2) {
        int i5 = i - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzuf.class});
        }
        if (i5 == 3) {
            return new zztz();
        }
        zzug zzugVar = null;
        if (i5 == 4) {
            return new zzty(zzugVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        if (i5 != 6) {
            return null;
        }
        zzoq zzmyVar = zzd;
        if (zzmyVar == null) {
            synchronized (zztz.class) {
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

    public final List zzi() {
        return this.zze;
    }
}
