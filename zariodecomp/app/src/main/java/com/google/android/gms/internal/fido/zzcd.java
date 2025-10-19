package com.google.android.gms.internal.fido;

import B.a;
import java.math.RoundingMode;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\fido\zzcd.smali */
final class zzcd {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzcd(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c5 = cArr[i];
            boolean z4 = true;
            zzap.zzd(c5 < 128, "Non-ASCII character: %s", c5);
            if (bArr[c5] != -1) {
                z4 = false;
            }
            zzap.zzd(z4, "Duplicate character: %s", c5);
            bArr[c5] = (byte) i;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzcd) {
            zzcd zzcdVar = (zzcd) obj;
            if (this.zzh == zzcdVar.zzh && Arrays.equals(this.zzf, zzcdVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (true != this.zzh ? 1237 : 1231);
    }

    public final String toString() {
        return this.zze;
    }

    public final char zza(int i) {
        return this.zzf[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    public final zzcd zzb() {
        int i;
        boolean z4;
        int i5 = 0;
        for (char c5 : this.zzf) {
            if (zzad.zza(c5)) {
                char[] cArr = this.zzf;
                int length = cArr.length;
                int i6 = 0;
                while (true) {
                    if (i6 >= length) {
                        z4 = false;
                        break;
                    }
                    char c6 = cArr[i6];
                    if (c6 >= 'A' && c6 <= 'Z') {
                        z4 = true;
                        break;
                    }
                    i6++;
                }
                if (z4) {
                    throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
                }
                char[] cArr2 = new char[this.zzf.length];
                while (true) {
                    char[] cArr3 = this.zzf;
                    if (i5 >= cArr3.length) {
                        break;
                    }
                    char c7 = cArr3[i5];
                    if (zzad.zza(c7)) {
                        c7 ^= 32;
                    }
                    cArr2[i5] = (char) c7;
                    i5++;
                }
                zzcd zzcdVar = new zzcd(this.zze.concat(".upperCase()"), cArr2);
                if (!this.zzh || zzcdVar.zzh) {
                    return zzcdVar;
                }
                byte[] bArr = zzcdVar.zzg;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                for (i = 65; i <= 90; i++) {
                    int i7 = i | 32;
                    byte[] bArr2 = zzcdVar.zzg;
                    byte b5 = bArr2[i];
                    byte b6 = bArr2[i7];
                    if (b5 == -1) {
                        bArrCopyOf[i] = b6;
                    } else {
                        char c8 = (char) i;
                        char c9 = (char) i7;
                        if (b6 != -1) {
                            throw new IllegalStateException(zzaq.zza("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c8), Character.valueOf(c9)));
                        }
                        bArrCopyOf[i7] = b5;
                    }
                }
                return new zzcd(zzcdVar.zze.concat(".ignoreCase()"), zzcdVar.zzf, bArrCopyOf, true);
            }
        }
        return this;
    }

    public final boolean zzc(char c5) {
        byte[] bArr = this.zzg;
        return bArr.length > 61 && bArr[61] != -1;
    }

    private zzcd(String str, char[] cArr, byte[] bArr, boolean z4) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int iZzb = zzcj.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = iZzb;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZzb);
            int i = 1 << (3 - iNumberOfTrailingZeros);
            this.zzc = i;
            this.zzd = iZzb >> iNumberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i];
            for (int i5 = 0; i5 < this.zzd; i5++) {
                zArr[zzcj.zza(i5 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = z4;
        } catch (ArithmeticException e5) {
            throw new IllegalArgumentException(a.g(cArr.length, "Illegal alphabet length "), e5);
        }
    }
}
