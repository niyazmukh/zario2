package com.google.android.recaptcha.internal;

import B.a;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzpm.smali */
public final class zzpm {
    private static final zzpm zza = new zzpm(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzpm(int i, int[] iArr, Object[] objArr, boolean z4) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z4;
    }

    public static zzpm zzc() {
        return zza;
    }

    public static zzpm zze(zzpm zzpmVar, zzpm zzpmVar2) {
        int i = zzpmVar.zzb + zzpmVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzpmVar.zzc, i);
        System.arraycopy(zzpmVar2.zzc, 0, iArrCopyOf, zzpmVar.zzb, zzpmVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzpmVar.zzd, i);
        System.arraycopy(zzpmVar2.zzd, 0, objArrCopyOf, zzpmVar.zzb, zzpmVar2.zzb);
        return new zzpm(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzpm zzf() {
        return new zzpm(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i5 = this.zzb;
            int i6 = (i5 / 2) + i5;
            if (i6 >= i) {
                i = i6;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzpm)) {
            return false;
        }
        zzpm zzpmVar = (zzpm) obj;
        int i = this.zzb;
        if (i == zzpmVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzpmVar.zzc;
            int i5 = 0;
            while (true) {
                if (i5 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzpmVar.zzd;
                    int i6 = this.zzb;
                    for (int i7 = 0; i7 < i6; i7++) {
                        if (objArr[i7].equals(objArr2[i7])) {
                        }
                    }
                    return true;
                }
                if (iArr[i5] != iArr2[i5]) {
                    break;
                }
                i5++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i5 = i + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i6 = 17;
        for (int i7 = 0; i7 < i; i7++) {
            i6 = (i6 * 31) + iArr[i7];
        }
        int i8 = ((i5 * 31) + i6) * 31;
        Object[] objArr = this.zzd;
        int i9 = this.zzb;
        for (int i10 = 0; i10 < i9; i10++) {
            iHashCode = (iHashCode * 31) + objArr[i10].hashCode();
        }
        return i8 + iHashCode;
    }

    public final int zza() {
        int iZzA;
        int iZzB;
        int iZzA2;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzA3 = 0;
        for (int i5 = 0; i5 < this.zzb; i5++) {
            int i6 = this.zzc[i5];
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i8 != 0) {
                if (i8 == 1) {
                    ((Long) this.zzd[i5]).getClass();
                    iZzA2 = zzln.zzA(i7 << 3) + 8;
                } else if (i8 == 2) {
                    int i9 = i7 << 3;
                    zzle zzleVar = (zzle) this.zzd[i5];
                    int iZzA4 = zzln.zzA(i9);
                    int iZzd = zzleVar.zzd();
                    iZzA3 = zzln.zzA(iZzd) + iZzd + iZzA4 + iZzA3;
                } else if (i8 == 3) {
                    int iZzA5 = zzln.zzA(i7 << 3);
                    iZzA = iZzA5 + iZzA5;
                    iZzB = ((zzpm) this.zzd[i5]).zza();
                } else {
                    if (i8 != 5) {
                        throw new IllegalStateException(new zznm("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i5]).getClass();
                    iZzA2 = zzln.zzA(i7 << 3) + 4;
                }
                iZzA3 = iZzA2 + iZzA3;
            } else {
                int i10 = i7 << 3;
                long jLongValue = ((Long) this.zzd[i5]).longValue();
                iZzA = zzln.zzA(i10);
                iZzB = zzln.zzB(jLongValue);
            }
            iZzA3 = iZzB + iZzA + iZzA3;
        }
        this.zze = iZzA3;
        return iZzA3;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iQ = 0;
        for (int i5 = 0; i5 < this.zzb; i5++) {
            int i6 = this.zzc[i5] >>> 3;
            zzle zzleVar = (zzle) this.zzd[i5];
            int iZzA = zzln.zzA(8);
            int iZzA2 = zzln.zzA(i6) + zzln.zzA(16);
            int iZzA3 = zzln.zzA(24);
            int iZzd = zzleVar.zzd();
            iQ += iZzA + iZzA + iZzA2 + a.q(iZzd, iZzd, iZzA3);
        }
        this.zze = iQ;
        return iQ;
    }

    public final zzpm zzd(zzpm zzpmVar) {
        if (zzpmVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzpmVar.zzb;
        zzm(i);
        System.arraycopy(zzpmVar.zzc, 0, this.zzc, this.zzb, zzpmVar.zzb);
        System.arraycopy(zzpmVar.zzd, 0, this.zzd, this.zzb, zzpmVar.zzb);
        this.zzb = i;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb, int i) {
        for (int i5 = 0; i5 < this.zzb; i5++) {
            zzok.zzb(sb, i, String.valueOf(this.zzc[i5] >>> 3), this.zzd[i5]);
        }
    }

    public final void zzj(int i, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i5 = this.zzb;
        iArr[i5] = i;
        this.zzd[i5] = obj;
        this.zzb = i5 + 1;
    }

    public final void zzk(zzpy zzpyVar) {
        for (int i = 0; i < this.zzb; i++) {
            zzpyVar.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzl(zzpy zzpyVar) {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i5 = this.zzc[i];
                Object obj = this.zzd[i];
                int i6 = i5 & 7;
                int i7 = i5 >>> 3;
                if (i6 == 0) {
                    zzpyVar.zzt(i7, ((Long) obj).longValue());
                } else if (i6 == 1) {
                    zzpyVar.zzm(i7, ((Long) obj).longValue());
                } else if (i6 == 2) {
                    zzpyVar.zzd(i7, (zzle) obj);
                } else if (i6 == 3) {
                    zzpyVar.zzF(i7);
                    ((zzpm) obj).zzl(zzpyVar);
                    zzpyVar.zzh(i7);
                } else {
                    if (i6 != 5) {
                        throw new RuntimeException(new zznm("Protocol message tag had invalid wire type."));
                    }
                    zzpyVar.zzk(i7, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzpm() {
        this(0, new int[8], new Object[8], true);
    }
}
