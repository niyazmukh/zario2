package com.google.android.recaptcha.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzlk.smali */
final class zzlk extends zzln {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    public zzlk(byte[] bArr, int i, int i5) {
        super(null);
        int length = bArr.length;
        if (((length - i5) | i5) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i5)));
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i5;
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzb(byte b5) throws zzll {
        try {
            byte[] bArr = this.zzb;
            int i = this.zzd;
            this.zzd = i + 1;
            bArr[i] = b5;
        } catch (IndexOutOfBoundsException e5) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e5);
        }
    }

    public final void zzc(byte[] bArr, int i, int i5) {
        try {
            System.arraycopy(bArr, 0, this.zzb, this.zzd, i5);
            this.zzd += i5;
        } catch (IndexOutOfBoundsException e5) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i5)), e5);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzd(int i, boolean z4) throws zzll {
        zzt(i << 3);
        zzb(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zze(int i, zzle zzleVar) throws zzll {
        zzt((i << 3) | 2);
        zzt(zzleVar.zzd());
        zzleVar.zzh(this);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzf(int i, int i5) throws zzll {
        zzt((i << 3) | 5);
        zzg(i5);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzg(int i) throws zzll {
        try {
            byte[] bArr = this.zzb;
            int i5 = this.zzd;
            int i6 = i5 + 1;
            this.zzd = i6;
            bArr[i5] = (byte) (i & 255);
            int i7 = i5 + 2;
            this.zzd = i7;
            bArr[i6] = (byte) ((i >> 8) & 255);
            int i8 = i5 + 3;
            this.zzd = i8;
            bArr[i7] = (byte) ((i >> 16) & 255);
            this.zzd = i5 + 4;
            bArr[i8] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e5) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e5);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzh(int i, long j5) throws zzll {
        zzt((i << 3) | 1);
        zzi(j5);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzi(long j5) throws zzll {
        try {
            byte[] bArr = this.zzb;
            int i = this.zzd;
            int i5 = i + 1;
            this.zzd = i5;
            bArr[i] = (byte) (((int) j5) & 255);
            int i6 = i + 2;
            this.zzd = i6;
            bArr[i5] = (byte) (((int) (j5 >> 8)) & 255);
            int i7 = i + 3;
            this.zzd = i7;
            bArr[i6] = (byte) (((int) (j5 >> 16)) & 255);
            int i8 = i + 4;
            this.zzd = i8;
            bArr[i7] = (byte) (((int) (j5 >> 24)) & 255);
            int i9 = i + 5;
            this.zzd = i9;
            bArr[i8] = (byte) (((int) (j5 >> 32)) & 255);
            int i10 = i + 6;
            this.zzd = i10;
            bArr[i9] = (byte) (((int) (j5 >> 40)) & 255);
            int i11 = i + 7;
            this.zzd = i11;
            bArr[i10] = (byte) (((int) (j5 >> 48)) & 255);
            this.zzd = i + 8;
            bArr[i11] = (byte) (((int) (j5 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e5) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e5);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzj(int i, int i5) throws zzll {
        zzt(i << 3);
        zzk(i5);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzk(int i) throws zzll {
        if (i >= 0) {
            zzt(i);
        } else {
            zzv(i);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzl(byte[] bArr, int i, int i5) {
        zzc(bArr, 0, i5);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzm(int i, zzoi zzoiVar, zzow zzowVar) throws zzll {
        zzt((i << 3) | 2);
        zzt(((zzko) zzoiVar).zza(zzowVar));
        zzowVar.zzj(zzoiVar, this.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzn(int i, zzoi zzoiVar) throws zzll {
        zzt(11);
        zzs(2, i);
        zzt(26);
        zzt(zzoiVar.zzo());
        zzoiVar.zze(this);
        zzt(12);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzo(int i, zzle zzleVar) throws zzll {
        zzt(11);
        zzs(2, i);
        zze(3, zzleVar);
        zzt(12);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzp(int i, String str) throws zzll {
        zzt((i << 3) | 2);
        zzq(str);
    }

    public final void zzq(String str) throws zzll {
        int i = this.zzd;
        try {
            int iZzA = zzln.zzA(str.length() * 3);
            int iZzA2 = zzln.zzA(str.length());
            if (iZzA2 != iZzA) {
                zzt(zzpv.zzc(str));
                byte[] bArr = this.zzb;
                int i5 = this.zzd;
                this.zzd = zzpv.zzb(str, bArr, i5, this.zzc - i5);
                return;
            }
            int i6 = i + iZzA2;
            this.zzd = i6;
            int iZzb = zzpv.zzb(str, this.zzb, i6, this.zzc - i6);
            this.zzd = i;
            zzt((iZzb - i) - iZzA2);
            this.zzd = iZzb;
        } catch (zzpu e5) {
            this.zzd = i;
            zzD(str, e5);
        } catch (IndexOutOfBoundsException e6) {
            throw new zzll(e6);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzr(int i, int i5) throws zzll {
        zzt((i << 3) | i5);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzs(int i, int i5) throws zzll {
        zzt(i << 3);
        zzt(i5);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzt(int i) throws zzll {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i5 = this.zzd;
                this.zzd = i5 + 1;
                bArr[i5] = (byte) ((i | 128) & 255);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e5) {
                throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e5);
            }
        }
        byte[] bArr2 = this.zzb;
        int i6 = this.zzd;
        this.zzd = i6 + 1;
        bArr2[i6] = (byte) i;
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzu(int i, long j5) throws zzll {
        zzt(i << 3);
        zzv(j5);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzv(long j5) throws zzll {
        if (!zzln.zzc || this.zzc - this.zzd < 10) {
            while ((j5 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i = this.zzd;
                    this.zzd = i + 1;
                    bArr[i] = (byte) ((((int) j5) | 128) & 255);
                    j5 >>>= 7;
                } catch (IndexOutOfBoundsException e5) {
                    throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e5);
                }
            }
            byte[] bArr2 = this.zzb;
            int i5 = this.zzd;
            this.zzd = i5 + 1;
            bArr2[i5] = (byte) j5;
            return;
        }
        while (true) {
            int i6 = (int) j5;
            if ((j5 & (-128)) == 0) {
                byte[] bArr3 = this.zzb;
                int i7 = this.zzd;
                this.zzd = i7 + 1;
                zzps.zzn(bArr3, i7, (byte) i6);
                return;
            }
            byte[] bArr4 = this.zzb;
            int i8 = this.zzd;
            this.zzd = i8 + 1;
            zzps.zzn(bArr4, i8, (byte) ((i6 | 128) & 255));
            j5 >>>= 7;
        }
    }
}
