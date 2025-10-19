package com.google.android.gms.internal.auth;

import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzgz.smali */
public final class zzgz {
    private static final zzgz zza = new zzgz(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private boolean zze;

    private zzgz(int i, int[] iArr, Object[] objArr, boolean z4) {
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = z4;
    }

    public static zzgz zza() {
        return zza;
    }

    public static zzgz zzb(zzgz zzgzVar, zzgz zzgzVar2) {
        int i = zzgzVar.zzb + zzgzVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzgzVar.zzc, i);
        System.arraycopy(zzgzVar2.zzc, 0, iArrCopyOf, zzgzVar.zzb, zzgzVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzgzVar.zzd, i);
        System.arraycopy(zzgzVar2.zzd, 0, objArrCopyOf, zzgzVar.zzb, zzgzVar2.zzb);
        return new zzgz(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzgz zzc() {
        return new zzgz(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzgz)) {
            return false;
        }
        zzgz zzgzVar = (zzgz) obj;
        int i = this.zzb;
        if (i == zzgzVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzgzVar.zzc;
            int i5 = 0;
            while (true) {
                if (i5 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzgzVar.zzd;
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
        int i5 = (i + 527) * 31;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i6 = 17;
        for (int i7 = 0; i7 < i; i7++) {
            i6 = (i6 * 31) + iArr[i7];
        }
        int i8 = (i5 + i6) * 31;
        Object[] objArr = this.zzd;
        int i9 = this.zzb;
        for (int i10 = 0; i10 < i9; i10++) {
            iHashCode = (iHashCode * 31) + objArr[i10].hashCode();
        }
        return i8 + iHashCode;
    }

    public final void zzd() {
        this.zze = false;
    }

    public final void zze(StringBuilder sb, int i) {
        for (int i5 = 0; i5 < this.zzb; i5++) {
            zzfy.zzb(sb, i, String.valueOf(this.zzc[i5] >>> 3), this.zzd[i5]);
        }
    }

    public final void zzf(int i, Object obj) {
        if (!this.zze) {
            throw new UnsupportedOperationException();
        }
        int i5 = this.zzb;
        int[] iArr = this.zzc;
        if (i5 == iArr.length) {
            int i6 = i5 + (i5 < 4 ? 8 : i5 >> 1);
            this.zzc = Arrays.copyOf(iArr, i6);
            this.zzd = Arrays.copyOf(this.zzd, i6);
        }
        int[] iArr2 = this.zzc;
        int i7 = this.zzb;
        iArr2[i7] = i;
        this.zzd[i7] = obj;
        this.zzb = i7 + 1;
    }

    private zzgz() {
        this(0, new int[8], new Object[8], true);
    }
}
