package com.google.android.gms.internal.p002firebaseauthapi;

import B.a;
import com.google.android.gms.common.api.f;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzakj.smali */
final class zzakj extends zzakh {
    private final InputStream zzd;
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    private final int zzaa() {
        int i;
        int i5 = this.zzh;
        int i6 = this.zzf;
        if (i6 != i5) {
            byte[] bArr = this.zze;
            int i7 = i5 + 1;
            byte b5 = bArr[i5];
            if (b5 >= 0) {
                this.zzh = i7;
                return b5;
            }
            if (i6 - i7 >= 9) {
                int i8 = i5 + 2;
                int i9 = (bArr[i7] << 7) ^ b5;
                if (i9 < 0) {
                    i = i9 ^ (-128);
                } else {
                    int i10 = i5 + 3;
                    int i11 = (bArr[i8] << 14) ^ i9;
                    if (i11 >= 0) {
                        i = i11 ^ 16256;
                    } else {
                        int i12 = i5 + 4;
                        int i13 = i11 ^ (bArr[i10] << 21);
                        if (i13 < 0) {
                            i = (-2080896) ^ i13;
                        } else {
                            i10 = i5 + 5;
                            byte b6 = bArr[i12];
                            int i14 = (i13 ^ (b6 << 28)) ^ 266354560;
                            if (b6 < 0) {
                                i12 = i5 + 6;
                                if (bArr[i10] < 0) {
                                    i10 = i5 + 7;
                                    if (bArr[i12] < 0) {
                                        i12 = i5 + 8;
                                        if (bArr[i10] < 0) {
                                            i10 = i5 + 9;
                                            if (bArr[i12] < 0) {
                                                int i15 = i5 + 10;
                                                if (bArr[i10] >= 0) {
                                                    i8 = i15;
                                                    i = i14;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i14;
                            }
                            i = i14;
                        }
                        i8 = i12;
                    }
                    i8 = i10;
                }
                this.zzh = i8;
                return i;
            }
        }
        return (int) zzm();
    }

    private final long zzab() throws zzall {
        int i = this.zzh;
        if (this.zzf - i < 8) {
            zzg(8);
            i = this.zzh;
        }
        byte[] bArr = this.zze;
        this.zzh = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    private final long zzac() {
        long j5;
        long j6;
        long j7;
        int i = this.zzh;
        int i5 = this.zzf;
        if (i5 != i) {
            byte[] bArr = this.zze;
            int i6 = i + 1;
            byte b5 = bArr[i];
            if (b5 >= 0) {
                this.zzh = i6;
                return b5;
            }
            if (i5 - i6 >= 9) {
                int i7 = i + 2;
                int i8 = (bArr[i6] << 7) ^ b5;
                if (i8 < 0) {
                    j5 = i8 ^ (-128);
                } else {
                    int i9 = i + 3;
                    int i10 = (bArr[i7] << 14) ^ i8;
                    if (i10 >= 0) {
                        j5 = i10 ^ 16256;
                        i7 = i9;
                    } else {
                        int i11 = i + 4;
                        int i12 = i10 ^ (bArr[i9] << 21);
                        if (i12 < 0) {
                            long j8 = (-2080896) ^ i12;
                            i7 = i11;
                            j5 = j8;
                        } else {
                            long j9 = i12;
                            i7 = i + 5;
                            long j10 = j9 ^ (bArr[i11] << 28);
                            if (j10 >= 0) {
                                j7 = 266354560;
                            } else {
                                int i13 = i + 6;
                                long j11 = j10 ^ (bArr[i7] << 35);
                                if (j11 < 0) {
                                    j6 = -34093383808L;
                                } else {
                                    i7 = i + 7;
                                    j10 = j11 ^ (bArr[i13] << 42);
                                    if (j10 >= 0) {
                                        j7 = 4363953127296L;
                                    } else {
                                        i13 = i + 8;
                                        j11 = j10 ^ (bArr[i7] << 49);
                                        if (j11 < 0) {
                                            j6 = -558586000294016L;
                                        } else {
                                            i7 = i + 9;
                                            long j12 = (j11 ^ (bArr[i13] << 56)) ^ 71499008037633920L;
                                            if (j12 < 0) {
                                                int i14 = i + 10;
                                                if (bArr[i7] >= 0) {
                                                    i7 = i14;
                                                }
                                            }
                                            j5 = j12;
                                        }
                                    }
                                }
                                j5 = j11 ^ j6;
                                i7 = i13;
                            }
                            j5 = j10 ^ j7;
                        }
                    }
                }
                this.zzh = i7;
                return j5;
            }
        }
        return zzm();
    }

    private final void zzad() {
        int i = this.zzf + this.zzg;
        this.zzf = i;
        int i5 = this.zzj + i;
        int i6 = this.zzk;
        if (i5 <= i6) {
            this.zzg = 0;
            return;
        }
        int i7 = i5 - i6;
        this.zzg = i7;
        this.zzf = i - i7;
    }

    private final byte zzy() throws zzall {
        if (this.zzh == this.zzf) {
            zzg(1);
        }
        byte[] bArr = this.zze;
        int i = this.zzh;
        this.zzh = i + 1;
        return bArr[i];
    }

    private final int zzz() throws zzall {
        int i = this.zzh;
        if (this.zzf - i < 4) {
            zzg(4);
            i = this.zzh;
        }
        byte[] bArr = this.zze;
        this.zzh = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final double zza() {
        return Double.longBitsToDouble(zzab());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final float zzb() {
        return Float.intBitsToFloat(zzz());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final int zzc() {
        return this.zzj + this.zzh;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final int zzd() {
        return zzaa();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final int zze() {
        return zzz();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final int zzf() {
        return zzaa();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final int zzg() {
        return zzz();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final int zzh() {
        return zzakh.zza(zzaa());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final int zzi() throws zzall {
        if (zzw()) {
            this.zzi = 0;
            return 0;
        }
        int iZzaa = zzaa();
        this.zzi = iZzaa;
        if ((iZzaa >>> 3) != 0) {
            return iZzaa;
        }
        throw zzall.zzc();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final int zzj() {
        return zzaa();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final long zzk() {
        return zzab();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final long zzl() {
        return zzac();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final long zzm() throws zzall {
        long j5 = 0;
        for (int i = 0; i < 64; i += 7) {
            j5 |= (r3 & 127) << i;
            if ((zzy() & 128) == 0) {
                return j5;
            }
        }
        throw zzall.zze();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final long zzn() {
        return zzab();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final long zzo() {
        return zzakh.zza(zzac());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final long zzp() {
        return zzac();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final zzajv zzq() throws IOException {
        int iZzaa = zzaa();
        int i = this.zzf;
        int i5 = this.zzh;
        if (iZzaa <= i - i5 && iZzaa > 0) {
            zzajv zzajvVarZza = zzajv.zza(this.zze, i5, iZzaa);
            this.zzh += iZzaa;
            return zzajvVarZza;
        }
        if (iZzaa == 0) {
            return zzajv.zza;
        }
        if (iZzaa < 0) {
            throw zzall.zzf();
        }
        byte[] bArrZzj = zzj(iZzaa);
        if (bArrZzj != null) {
            return zzajv.zza(bArrZzj);
        }
        int i6 = this.zzh;
        int i7 = this.zzf;
        int length = i7 - i6;
        this.zzj += i7;
        this.zzh = 0;
        this.zzf = 0;
        List<byte[]> listZzf = zzf(iZzaa - length);
        byte[] bArr = new byte[iZzaa];
        System.arraycopy(this.zze, i6, bArr, 0, length);
        for (byte[] bArr2 : listZzf) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return zzajv.zzb(bArr);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final String zzr() throws zzall {
        int iZzaa = zzaa();
        if (iZzaa > 0) {
            int i = this.zzf;
            int i5 = this.zzh;
            if (iZzaa <= i - i5) {
                String str = new String(this.zze, i5, iZzaa, zzalh.zza);
                this.zzh += iZzaa;
                return str;
            }
        }
        if (iZzaa == 0) {
            return "";
        }
        if (iZzaa < 0) {
            throw zzall.zzf();
        }
        if (iZzaa > this.zzf) {
            return new String(zza(iZzaa, false), zzalh.zza);
        }
        zzg(iZzaa);
        String str2 = new String(this.zze, this.zzh, iZzaa, zzalh.zza);
        this.zzh += iZzaa;
        return str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final String zzs() throws IOException {
        byte[] bArrZza;
        int iZzaa = zzaa();
        int i = this.zzh;
        int i5 = this.zzf;
        if (iZzaa <= i5 - i && iZzaa > 0) {
            bArrZza = this.zze;
            this.zzh = i + iZzaa;
        } else {
            if (iZzaa == 0) {
                return "";
            }
            if (iZzaa < 0) {
                throw zzall.zzf();
            }
            i = 0;
            if (iZzaa <= i5) {
                zzg(iZzaa);
                bArrZza = this.zze;
                this.zzh = iZzaa;
            } else {
                bArrZza = zza(iZzaa, false);
            }
        }
        return zzaoa.zzb(bArrZza, i, iZzaa);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final boolean zzw() {
        return this.zzh == this.zzf && !zzi(1);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final boolean zzx() {
        return zzac() != 0;
    }

    private zzakj(InputStream inputStream, int i) {
        super();
        this.zzk = f.API_PRIORITY_OTHER;
        zzalh.zza(inputStream, "input");
        this.zzd = inputStream;
        this.zze = new byte[4096];
        this.zzf = 0;
        this.zzh = 0;
        this.zzj = 0;
    }

    private static int zza(InputStream inputStream) throws zzall {
        try {
            return inputStream.available();
        } catch (zzall e5) {
            e5.zzk();
            throw e5;
        }
    }

    private final List<byte[]> zzf(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i5 = 0;
            while (i5 < iMin) {
                int i6 = this.zzd.read(bArr, i5, iMin - i5);
                if (i6 == -1) {
                    throw zzall.zzj();
                }
                this.zzj += i6;
                i5 += i6;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzg(int i) throws zzall {
        if (zzi(i)) {
            return;
        }
        if (i <= (this.zzb - this.zzj) - this.zzh) {
            throw zzall.zzj();
        }
        throw zzall.zzi();
    }

    private final void zzh(int i) throws zzall {
        int i5 = this.zzf;
        int i6 = this.zzh;
        if (i <= i5 - i6 && i >= 0) {
            this.zzh = i6 + i;
            return;
        }
        if (i < 0) {
            throw zzall.zzf();
        }
        int i7 = this.zzj;
        int i8 = i7 + i6 + i;
        int i9 = this.zzk;
        if (i8 > i9) {
            zzh((i9 - i7) - i6);
            throw zzall.zzj();
        }
        this.zzj = i7 + i6;
        int i10 = i5 - i6;
        this.zzf = 0;
        this.zzh = 0;
        while (i10 < i) {
            try {
                long j5 = i - i10;
                long jZza = zza(this.zzd, j5);
                if (jZza >= 0 && jZza <= j5) {
                    if (jZza == 0) {
                        break;
                    } else {
                        i10 += (int) jZza;
                    }
                } else {
                    throw new IllegalStateException(String.valueOf(this.zzd.getClass()) + "#skip returned invalid result: " + jZza + "\nThe InputStream implementation is buggy.");
                }
            } finally {
                this.zzj += i10;
                zzad();
            }
        }
        if (i10 >= i) {
            return;
        }
        int i11 = this.zzf;
        int i12 = i11 - this.zzh;
        this.zzh = i11;
        zzg(1);
        while (true) {
            int i13 = i - i12;
            int i14 = this.zzf;
            if (i13 <= i14) {
                this.zzh = i13;
                return;
            } else {
                i12 += i14;
                this.zzh = i14;
                zzg(1);
            }
        }
    }

    private final byte[] zzj(int i) throws zzall {
        if (i == 0) {
            return zzalh.zzb;
        }
        if (i < 0) {
            throw zzall.zzf();
        }
        int i5 = this.zzj;
        int i6 = this.zzh;
        int i7 = i5 + i6 + i;
        if (i7 - this.zzb > 0) {
            throw zzall.zzi();
        }
        int i8 = this.zzk;
        if (i7 > i8) {
            zzh((i8 - i5) - i6);
            throw zzall.zzj();
        }
        int i9 = this.zzf - i6;
        int i10 = i - i9;
        if (i10 >= 4096 && i10 > zza(this.zzd)) {
            return null;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.zze, this.zzh, bArr, 0, i9);
        this.zzj += this.zzf;
        this.zzh = 0;
        this.zzf = 0;
        while (i9 < i) {
            int iZza = zza(this.zzd, bArr, i9, i - i9);
            if (iZza == -1) {
                throw zzall.zzj();
            }
            this.zzj += iZza;
            i9 += iZza;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final int zzb(int i) throws zzall {
        if (i < 0) {
            throw zzall.zzf();
        }
        int i5 = this.zzj + this.zzh + i;
        if (i5 < 0) {
            throw zzall.zzi();
        }
        int i6 = this.zzk;
        if (i5 > i6) {
            throw zzall.zzj();
        }
        this.zzk = i5;
        zzad();
        return i6;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final void zzc(int i) throws zzall {
        if (this.zzi != i) {
            throw zzall.zzb();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final void zzd(int i) {
        this.zzk = i;
        zzad();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final boolean zze(int i) throws zzall {
        int i5 = i & 7;
        int i6 = 0;
        if (i5 == 0) {
            if (this.zzf - this.zzh < 10) {
                while (i6 < 10) {
                    if (zzy() < 0) {
                        i6++;
                    }
                }
                throw zzall.zze();
            }
            while (i6 < 10) {
                byte[] bArr = this.zze;
                int i7 = this.zzh;
                this.zzh = i7 + 1;
                if (bArr[i7] < 0) {
                    i6++;
                }
            }
            throw zzall.zze();
            return true;
        }
        if (i5 == 1) {
            zzh(8);
            return true;
        }
        if (i5 == 2) {
            zzh(zzaa());
            return true;
        }
        if (i5 == 3) {
            zzv();
            zzc(((i >>> 3) << 3) | 4);
            return true;
        }
        if (i5 == 4) {
            zzu();
            return false;
        }
        if (i5 != 5) {
            throw zzall.zza();
        }
        zzh(4);
        return true;
    }

    private static int zza(InputStream inputStream, byte[] bArr, int i, int i5) throws zzall {
        try {
            return inputStream.read(bArr, i, i5);
        } catch (zzall e5) {
            e5.zzk();
            throw e5;
        }
    }

    private final boolean zzi(int i) throws zzall {
        int i5 = this.zzh;
        int i6 = i5 + i;
        int i7 = this.zzf;
        if (i6 > i7) {
            int i8 = this.zzb;
            int i9 = this.zzj;
            if (i > (i8 - i9) - i5 || i9 + i5 + i > this.zzk) {
                return false;
            }
            if (i5 > 0) {
                if (i7 > i5) {
                    byte[] bArr = this.zze;
                    System.arraycopy(bArr, i5, bArr, 0, i7 - i5);
                }
                this.zzj += i5;
                this.zzf -= i5;
                this.zzh = 0;
            }
            InputStream inputStream = this.zzd;
            byte[] bArr2 = this.zze;
            int i10 = this.zzf;
            int iZza = zza(inputStream, bArr2, i10, Math.min(bArr2.length - i10, (this.zzb - this.zzj) - i10));
            if (iZza != 0 && iZza >= -1 && iZza <= this.zze.length) {
                if (iZza <= 0) {
                    return false;
                }
                this.zzf += iZza;
                zzad();
                return this.zzf >= i || zzi(i);
            }
            throw new IllegalStateException(String.valueOf(this.zzd.getClass()) + "#read(byte[]) returned invalid result: " + iZza + "\nThe InputStream implementation is buggy.");
        }
        throw new IllegalStateException(a.i("refillBuffer() called when ", i, " bytes were already available in buffer"));
    }

    private static long zza(InputStream inputStream, long j5) throws zzall {
        try {
            return inputStream.skip(j5);
        } catch (zzall e5) {
            e5.zzk();
            throw e5;
        }
    }

    private final byte[] zza(int i, boolean z4) throws IOException {
        byte[] bArrZzj = zzj(i);
        if (bArrZzj != null) {
            return bArrZzj;
        }
        int i5 = this.zzh;
        int i6 = this.zzf;
        int length = i6 - i5;
        this.zzj += i6;
        this.zzh = 0;
        this.zzf = 0;
        List<byte[]> listZzf = zzf(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.zze, i5, bArr, 0, length);
        for (byte[] bArr2 : listZzf) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }
}
