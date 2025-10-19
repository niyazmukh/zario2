package com.google.android.recaptcha.internal;

import B.a;
import com.google.android.gms.common.api.f;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzlg.smali */
final class zzlg extends zzli {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    public /* synthetic */ zzlg(InputStream inputStream, int i, zzlh zzlhVar) {
        super(null);
        this.zzl = f.API_PRIORITY_OTHER;
        byte[] bArr = zznl.zzb;
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final List zzJ(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i5 = 0;
            while (i5 < iMin) {
                int i6 = this.zze.read(bArr, i5, iMin - i5);
                if (i6 == -1) {
                    throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzk += i6;
                i5 += i6;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzK() {
        int i = this.zzg + this.zzh;
        this.zzg = i;
        int i5 = this.zzk + i;
        int i6 = this.zzl;
        if (i5 <= i6) {
            this.zzh = 0;
            return;
        }
        int i7 = i5 - i6;
        this.zzh = i7;
        this.zzg = i - i7;
    }

    private final void zzL(int i) throws zznn {
        if (zzM(i)) {
            return;
        }
        if (i <= (f.API_PRIORITY_OTHER - this.zzk) - this.zzi) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zznn("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    private final boolean zzM(int i) throws IOException {
        int i5 = this.zzi;
        int i6 = i5 + i;
        int i7 = this.zzg;
        if (i6 <= i7) {
            throw new IllegalStateException(a.i("refillBuffer() called when ", i, " bytes were already available in buffer"));
        }
        int i8 = this.zzk;
        if (i > (f.API_PRIORITY_OTHER - i8) - i5 || i8 + i5 + i > this.zzl) {
            return false;
        }
        if (i5 > 0) {
            if (i7 > i5) {
                byte[] bArr = this.zzf;
                System.arraycopy(bArr, i5, bArr, 0, i7 - i5);
            }
            i8 = this.zzk + i5;
            this.zzk = i8;
            i7 = this.zzg - i5;
            this.zzg = i7;
            this.zzi = 0;
        }
        try {
            int i9 = this.zze.read(this.zzf, i7, Math.min(4096 - i7, (f.API_PRIORITY_OTHER - i8) - i7));
            if (i9 == 0 || i9 < -1 || i9 > 4096) {
                throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + i9 + "\nThe InputStream implementation is buggy.");
            }
            if (i9 <= 0) {
                return false;
            }
            this.zzg += i9;
            zzK();
            if (this.zzg >= i) {
                return true;
            }
            return zzM(i);
        } catch (zznn e5) {
            e5.zza();
            throw e5;
        }
    }

    private final byte[] zzN(int i, boolean z4) throws IOException {
        byte[] bArrZzO = zzO(i);
        if (bArrZzO != null) {
            return bArrZzO;
        }
        int i5 = this.zzi;
        int i6 = this.zzg;
        int i7 = i6 - i5;
        this.zzk += i6;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzJ = zzJ(i - i7);
        byte[] bArr = new byte[i];
        System.arraycopy(this.zzf, i5, bArr, 0, i7);
        for (byte[] bArr2 : listZzJ) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i7, length);
            i7 += length;
        }
        return bArr;
    }

    private final byte[] zzO(int i) throws IOException {
        if (i == 0) {
            return zznl.zzb;
        }
        int i5 = this.zzk;
        int i6 = this.zzi;
        int i7 = i5 + i6 + i;
        if ((-2147483647) + i7 > 0) {
            throw new zznn("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i8 = this.zzl;
        if (i7 > i8) {
            zzB((i8 - i5) - i6);
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i9 = this.zzg - i6;
        int i10 = i - i9;
        if (i10 >= 4096) {
            try {
                if (i10 > this.zze.available()) {
                    return null;
                }
            } catch (zznn e5) {
                e5.zza();
                throw e5;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.zzf, this.zzi, bArr, 0, i9);
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        while (i9 < i) {
            try {
                int i11 = this.zze.read(bArr, i9, i - i9);
                if (i11 == -1) {
                    throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzk += i11;
                i9 += i11;
            } catch (zznn e6) {
                e6.zza();
                throw e6;
            }
        }
        return bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final void zzA(int i) {
        this.zzl = i;
        zzK();
    }

    public final void zzB(int i) throws zznn {
        int i5 = this.zzg;
        int i6 = this.zzi;
        int i7 = i5 - i6;
        if (i <= i7 && i >= 0) {
            this.zzi = i6 + i;
            return;
        }
        if (i < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i8 = this.zzk;
        int i9 = i8 + i6;
        int i10 = this.zzl;
        if (i9 + i > i10) {
            zzB((i10 - i8) - i6);
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzk = i9;
        this.zzg = 0;
        this.zzi = 0;
        while (i7 < i) {
            try {
                long j5 = i - i7;
                try {
                    long jSkip = this.zze.skip(j5);
                    if (jSkip < 0 || jSkip > j5) {
                        throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i7 += (int) jSkip;
                    }
                } catch (zznn e5) {
                    e5.zza();
                    throw e5;
                }
            } catch (Throwable th) {
                this.zzk += i7;
                zzK();
                throw th;
            }
        }
        this.zzk += i7;
        zzK();
        if (i7 >= i) {
            return;
        }
        int i11 = this.zzg;
        int i12 = i11 - this.zzi;
        this.zzi = i11;
        zzL(1);
        while (true) {
            int i13 = i - i12;
            int i14 = this.zzg;
            if (i13 <= i14) {
                this.zzi = i13;
                return;
            } else {
                i12 += i14;
                this.zzi = i14;
                zzL(1);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final boolean zzC() {
        return this.zzi == this.zzg && !zzM(1);
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final boolean zzD() {
        return zzr() != 0;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final boolean zzE(int i) throws zznn {
        int i5 = i & 7;
        int i6 = 0;
        if (i5 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i6 < 10) {
                    if (zza() < 0) {
                        i6++;
                    }
                }
                throw new zznn("CodedInputStream encountered a malformed varint.");
            }
            while (i6 < 10) {
                byte[] bArr = this.zzf;
                int i7 = this.zzi;
                this.zzi = i7 + 1;
                if (bArr[i7] < 0) {
                    i6++;
                }
            }
            throw new zznn("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i5 == 1) {
            zzB(8);
            return true;
        }
        if (i5 == 2) {
            zzB(zzj());
            return true;
        }
        if (i5 == 3) {
            zzI();
            zzz(((i >>> 3) << 3) | 4);
            return true;
        }
        if (i5 == 4) {
            return false;
        }
        if (i5 != 5) {
            throw new zznm("Protocol message tag had invalid wire type.");
        }
        zzB(4);
        return true;
    }

    public final byte zza() throws zznn {
        if (this.zzi == this.zzg) {
            zzL(1);
        }
        byte[] bArr = this.zzf;
        int i = this.zzi;
        this.zzi = i + 1;
        return bArr[i];
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final double zzb() {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final float zzc() {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzd() {
        return this.zzk + this.zzi;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zze(int i) throws zznn {
        if (i < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = this.zzk + this.zzi + i;
        if (i5 < 0) {
            throw new zznn("Failed to parse the message.");
        }
        int i6 = this.zzl;
        if (i5 > i6) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i5;
        zzK();
        return i6;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzf() {
        return zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzg() {
        return zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzh() {
        return zzj();
    }

    public final int zzi() throws zznn {
        int i = this.zzi;
        if (this.zzg - i < 4) {
            zzL(4);
            i = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    public final int zzj() {
        int i;
        int i5 = this.zzi;
        int i6 = this.zzg;
        if (i6 != i5) {
            byte[] bArr = this.zzf;
            int i7 = i5 + 1;
            byte b5 = bArr[i5];
            if (b5 >= 0) {
                this.zzi = i7;
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
                this.zzi = i8;
                return i;
            }
        }
        return (int) zzs();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzk() {
        return zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzl() {
        return zzli.zzF(zzj());
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzm() throws zznn {
        if (zzC()) {
            this.zzj = 0;
            return 0;
        }
        int iZzj = zzj();
        this.zzj = iZzj;
        if ((iZzj >>> 3) != 0) {
            return iZzj;
        }
        throw new zznn("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzn() {
        return zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final long zzo() {
        return zzq();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final long zzp() {
        return zzr();
    }

    public final long zzq() throws zznn {
        int i = this.zzi;
        if (this.zzg - i < 8) {
            zzL(8);
            i = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i + 8;
        long j5 = bArr[i];
        long j6 = bArr[i + 2];
        long j7 = bArr[i + 3];
        long j8 = bArr[i + 4];
        long j9 = bArr[i + 5];
        return ((bArr[i + 7] & 255) << 56) | ((bArr[i + 6] & 255) << 48) | (j5 & 255) | ((bArr[i + 1] & 255) << 8) | ((j6 & 255) << 16) | ((j7 & 255) << 24) | ((j8 & 255) << 32) | ((j9 & 255) << 40);
    }

    public final long zzr() {
        long j5;
        long j6;
        int i = this.zzi;
        int i5 = this.zzg;
        if (i5 != i) {
            byte[] bArr = this.zzf;
            int i6 = i + 1;
            byte b5 = bArr[i];
            if (b5 >= 0) {
                this.zzi = i6;
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
                    } else {
                        int i11 = i + 4;
                        int i12 = i10 ^ (bArr[i9] << 21);
                        if (i12 < 0) {
                            long j7 = (-2080896) ^ i12;
                            i7 = i11;
                            j5 = j7;
                        } else {
                            i9 = i + 5;
                            long j8 = (bArr[i11] << 28) ^ i12;
                            if (j8 >= 0) {
                                j5 = j8 ^ 266354560;
                            } else {
                                i7 = i + 6;
                                long j9 = (bArr[i9] << 35) ^ j8;
                                if (j9 < 0) {
                                    j6 = -34093383808L;
                                } else {
                                    int i13 = i + 7;
                                    long j10 = j9 ^ (bArr[i7] << 42);
                                    if (j10 >= 0) {
                                        j5 = j10 ^ 4363953127296L;
                                    } else {
                                        i7 = i + 8;
                                        j9 = j10 ^ (bArr[i13] << 49);
                                        if (j9 < 0) {
                                            j6 = -558586000294016L;
                                        } else {
                                            i13 = i + 9;
                                            long j11 = (j9 ^ (bArr[i7] << 56)) ^ 71499008037633920L;
                                            if (j11 < 0) {
                                                i7 = i + 10;
                                                if (bArr[i13] >= 0) {
                                                    j5 = j11;
                                                }
                                            } else {
                                                j5 = j11;
                                            }
                                        }
                                    }
                                    i7 = i13;
                                }
                                j5 = j9 ^ j6;
                            }
                        }
                    }
                    i7 = i9;
                }
                this.zzi = i7;
                return j5;
            }
        }
        return zzs();
    }

    public final long zzs() throws zznn {
        long j5 = 0;
        for (int i = 0; i < 64; i += 7) {
            j5 |= (r3 & 127) << i;
            if ((zza() & 128) == 0) {
                return j5;
            }
        }
        throw new zznn("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final long zzt() {
        return zzq();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final long zzu() {
        return zzli.zzG(zzr());
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final long zzv() {
        return zzr();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final zzle zzw() throws IOException {
        int iZzj = zzj();
        int i = this.zzg;
        int i5 = this.zzi;
        if (iZzj <= i - i5 && iZzj > 0) {
            zzle zzleVarZzk = zzle.zzk(this.zzf, i5, iZzj);
            this.zzi += iZzj;
            return zzleVarZzk;
        }
        if (iZzj == 0) {
            return zzle.zzb;
        }
        if (iZzj < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrZzO = zzO(iZzj);
        if (bArrZzO != null) {
            return zzle.zzk(bArrZzO, 0, bArrZzO.length);
        }
        int i6 = this.zzi;
        int i7 = this.zzg;
        int i8 = i7 - i6;
        this.zzk += i7;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzJ = zzJ(iZzj - i8);
        byte[] bArr = new byte[iZzj];
        System.arraycopy(this.zzf, i6, bArr, 0, i8);
        for (byte[] bArr2 : listZzJ) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i8, length);
            i8 += length;
        }
        return new zzlc(bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final String zzx() throws zznn {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i = this.zzg;
            int i5 = this.zzi;
            if (iZzj <= i - i5) {
                String str = new String(this.zzf, i5, iZzj, zznl.zza);
                this.zzi += iZzj;
                return str;
            }
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iZzj > this.zzg) {
            return new String(zzN(iZzj, false), zznl.zza);
        }
        zzL(iZzj);
        String str2 = new String(this.zzf, this.zzi, iZzj, zznl.zza);
        this.zzi += iZzj;
        return str2;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final String zzy() throws IOException {
        byte[] bArrZzN;
        int iZzj = zzj();
        int i = this.zzi;
        int i5 = this.zzg;
        if (iZzj <= i5 - i && iZzj > 0) {
            bArrZzN = this.zzf;
            this.zzi = i + iZzj;
        } else {
            if (iZzj == 0) {
                return "";
            }
            if (iZzj < 0) {
                throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i = 0;
            if (iZzj <= i5) {
                zzL(iZzj);
                bArrZzN = this.zzf;
                this.zzi = iZzj;
            } else {
                bArrZzN = zzN(iZzj, false);
            }
        }
        return zzpv.zzd(bArrZzN, i, iZzj);
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final void zzz(int i) throws zznn {
        if (this.zzj != i) {
            throw new zznn("Protocol message end-group tag did not match expected tag.");
        }
    }
}
