package com.google.android.recaptcha.internal;

import B.a;
import java.math.RoundingMode;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzkd.smali */
final class zzkd {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;
    private final boolean zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzkd(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c5 = cArr[i];
            boolean z4 = true;
            zzjf.zzc(c5 < 128, "Non-ASCII character: %s", c5);
            if (bArr[c5] != -1) {
                z4 = false;
            }
            zzjf.zzc(z4, "Duplicate character: %s", c5);
            bArr[c5] = (byte) i;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzkd) {
            zzkd zzkdVar = (zzkd) obj;
            boolean z4 = zzkdVar.zzi;
            if (Arrays.equals(this.zzf, zzkdVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + 1237;
    }

    public final String toString() {
        return this.zze;
    }

    public final char zza(int i) {
        return this.zzf[i];
    }

    public final int zzb(char c5) throws zzkf {
        if (c5 > 127) {
            throw new zzkf("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c5))));
        }
        byte b5 = this.zzg[c5];
        if (b5 != -1) {
            return b5;
        }
        if (c5 <= ' ' || c5 == 127) {
            throw new zzkf("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c5))));
        }
        throw new zzkf("Unrecognized character: " + c5);
    }

    public final boolean zzc(int i) {
        return this.zzh[i % this.zzc];
    }

    public final boolean zzd(char c5) {
        return this.zzg[61] != -1;
    }

    private zzkd(String str, char[] cArr, byte[] bArr, boolean z4) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int iZzb = zzkj.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = iZzb;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZzb);
            int i = 1 << (3 - iNumberOfTrailingZeros);
            this.zzc = i;
            this.zzd = iZzb >> iNumberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i];
            for (int i5 = 0; i5 < this.zzd; i5++) {
                zArr[zzkj.zza(i5 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = false;
        } catch (ArithmeticException e5) {
            throw new IllegalArgumentException(a.g(cArr.length, "Illegal alphabet length "), e5);
        }
    }
}
