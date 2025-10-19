package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzanx.smali */
public final class zzanx {
    private static final zzanx zza = new zzanx(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzanx() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzanx zzc() {
        return zza;
    }

    public static zzanx zzd() {
        return new zzanx();
    }

    private final void zzf() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzanx)) {
            return false;
        }
        zzanx zzanxVar = (zzanx) obj;
        int i = this.zzb;
        if (i == zzanxVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzanxVar.zzc;
            int i5 = 0;
            while (true) {
                if (i5 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzanxVar.zzd;
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

    public final int zza() {
        int iZze;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZza = 0;
        for (int i5 = 0; i5 < this.zzb; i5++) {
            int i6 = this.zzc[i5];
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i8 == 0) {
                iZze = zzakn.zze(i7, ((Long) this.zzd[i5]).longValue());
            } else if (i8 == 1) {
                iZze = zzakn.zza(i7, ((Long) this.zzd[i5]).longValue());
            } else if (i8 == 2) {
                iZze = zzakn.zza(i7, (zzajv) this.zzd[i5]);
            } else if (i8 == 3) {
                iZza = ((zzanx) this.zzd[i5]).zza() + (zzakn.zzh(i7) << 1) + iZza;
            } else {
                if (i8 != 5) {
                    throw new IllegalStateException(zzall.zza());
                }
                iZze = zzakn.zzb(i7, ((Integer) this.zzd[i5]).intValue());
            }
            iZza = iZze + iZza;
        }
        this.zze = iZza;
        return iZza;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzb = 0;
        for (int i5 = 0; i5 < this.zzb; i5++) {
            iZzb += zzakn.zzb(this.zzc[i5] >>> 3, (zzajv) this.zzd[i5]);
        }
        this.zze = iZzb;
        return iZzb;
    }

    public final void zze() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    private zzanx(int i, int[] iArr, Object[] objArr, boolean z4) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z4;
    }

    public final void zzb(zzaol zzaolVar) {
        if (this.zzb == 0) {
            return;
        }
        if (zzaolVar.zza() == 1) {
            for (int i = 0; i < this.zzb; i++) {
                zza(this.zzc[i], this.zzd[i], zzaolVar);
            }
            return;
        }
        for (int i5 = this.zzb - 1; i5 >= 0; i5--) {
            zza(this.zzc[i5], this.zzd[i5], zzaolVar);
        }
    }

    public final zzanx zza(zzanx zzanxVar) {
        if (zzanxVar.equals(zza)) {
            return this;
        }
        zzf();
        int i = this.zzb + zzanxVar.zzb;
        zza(i);
        System.arraycopy(zzanxVar.zzc, 0, this.zzc, this.zzb, zzanxVar.zzb);
        System.arraycopy(zzanxVar.zzd, 0, this.zzd, this.zzb, zzanxVar.zzb);
        this.zzb = i;
        return this;
    }

    public static zzanx zza(zzanx zzanxVar, zzanx zzanxVar2) {
        int i = zzanxVar.zzb + zzanxVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzanxVar.zzc, i);
        System.arraycopy(zzanxVar2.zzc, 0, iArrCopyOf, zzanxVar.zzb, zzanxVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzanxVar.zzd, i);
        System.arraycopy(zzanxVar2.zzd, 0, objArrCopyOf, zzanxVar.zzb, zzanxVar2.zzb);
        return new zzanx(i, iArrCopyOf, objArrCopyOf, true);
    }

    private final void zza(int i) {
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

    public final void zza(StringBuilder sb, int i) {
        for (int i5 = 0; i5 < this.zzb; i5++) {
            zzamn.zza(sb, i, String.valueOf(this.zzc[i5] >>> 3), this.zzd[i5]);
        }
    }

    public final void zza(int i, Object obj) {
        zzf();
        zza(this.zzb + 1);
        int[] iArr = this.zzc;
        int i5 = this.zzb;
        iArr[i5] = i;
        this.zzd[i5] = obj;
        this.zzb = i5 + 1;
    }

    public final void zza(zzaol zzaolVar) {
        if (zzaolVar.zza() == 2) {
            for (int i = this.zzb - 1; i >= 0; i--) {
                zzaolVar.zza(this.zzc[i] >>> 3, this.zzd[i]);
            }
            return;
        }
        for (int i5 = 0; i5 < this.zzb; i5++) {
            zzaolVar.zza(this.zzc[i5] >>> 3, this.zzd[i5]);
        }
    }

    private static void zza(int i, Object obj, zzaol zzaolVar) {
        int i5 = i >>> 3;
        int i6 = i & 7;
        if (i6 == 0) {
            zzaolVar.zzb(i5, ((Long) obj).longValue());
            return;
        }
        if (i6 == 1) {
            zzaolVar.zza(i5, ((Long) obj).longValue());
            return;
        }
        if (i6 == 2) {
            zzaolVar.zza(i5, (zzajv) obj);
            return;
        }
        if (i6 != 3) {
            if (i6 == 5) {
                zzaolVar.zzb(i5, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzall.zza());
        }
        if (zzaolVar.zza() == 1) {
            zzaolVar.zzb(i5);
            ((zzanx) obj).zzb(zzaolVar);
            zzaolVar.zza(i5);
        } else {
            zzaolVar.zza(i5);
            ((zzanx) obj).zzb(zzaolVar);
            zzaolVar.zzb(i5);
        }
    }
}
