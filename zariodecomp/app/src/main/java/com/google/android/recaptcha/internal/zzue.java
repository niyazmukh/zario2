package com.google.android.recaptcha.internal;

import N2.j0;
import N2.n0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzue.smali */
public final class zzue extends zznd implements zzoj {
    private static final zzue zzb;
    private static volatile zzoq zzd;
    private int zze = 0;
    private Object zzf;

    static {
        zzue zzueVar = new zzue();
        zzb = zzueVar;
        zznd.zzI(zzue.class, zzueVar);
    }

    private zzue() {
    }

    public final zzle zzM() {
        return this.zze == 3 ? (zzle) this.zzf : zzle.zzb;
    }

    public final String zzO() {
        return this.zze == 4 ? (String) this.zzf : "";
    }

    public final String zzP() {
        return this.zze == 12 ? (String) this.zzf : "";
    }

    public final boolean zzQ() {
        if (this.zze == 2) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    public final boolean zzR() {
        return this.zze == 1;
    }

    public final int zzS() {
        switch (this.zze) {
            case 0:
                return 16;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return 9;
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return 10;
            case 11:
                return 11;
            case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            default:
                return 0;
        }
    }

    public final double zzf() {
        if (this.zze == 11) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    public final float zzg() {
        if (this.zze == 10) {
            return ((Float) this.zzf).floatValue();
        }
        return 0.0f;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i, Object obj, Object obj2) {
        int i5 = i - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u000f\u0001\u0000\u0001\u000f\u000f\u0000\u0000\u0000\u0001>\u0000\u0002:\u0000\u0003=\u0000\u0004Ȼ\u0000\u0005B\u0000\u0006B\u0000\u0007>\u0000\bC\u0000\t6\u0000\n4\u0000\u000b3\u0000\fȻ\u0000\r:\u0000\u000e?\u0000\u000f?\u0000", new Object[]{"zzf", "zze"});
        }
        if (i5 == 3) {
            return new zzue();
        }
        zzug zzugVar = null;
        if (i5 == 4) {
            return new zzud(zzugVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        if (i5 != 6) {
            return null;
        }
        zzoq zzmyVar = zzd;
        if (zzmyVar == null) {
            synchronized (zzue.class) {
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

    public final int zzi() {
        if (this.zze == 1) {
            return ((Integer) this.zzf).intValue();
        }
        return 0;
    }

    public final int zzj() {
        if (this.zze == 5) {
            return ((Integer) this.zzf).intValue();
        }
        return 0;
    }

    public final int zzk() {
        if (this.zze == 6) {
            return ((Integer) this.zzf).intValue();
        }
        return 0;
    }

    public final long zzl() {
        if (this.zze == 8) {
            return ((Long) this.zzf).longValue();
        }
        return 0L;
    }
}
