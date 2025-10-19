package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzakk.smali */
final class zzakk extends zzakh {
    private final byte[] zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    private final int zzaa() {
        int i;
        int i5 = this.zzg;
        int i6 = this.zze;
        if (i6 != i5) {
            byte[] bArr = this.zzd;
            int i7 = i5 + 1;
            byte b5 = bArr[i5];
            if (b5 >= 0) {
                this.zzg = i7;
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
                this.zzg = i8;
                return i;
            }
        }
        return (int) zzm();
    }

    private final long zzab() throws zzall {
        int i = this.zzg;
        if (this.zze - i < 8) {
            throw zzall.zzj();
        }
        byte[] bArr = this.zzd;
        this.zzg = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    private final long zzac() {
        long j5;
        long j6;
        long j7;
        int i = this.zzg;
        int i5 = this.zze;
        if (i5 != i) {
            byte[] bArr = this.zzd;
            int i6 = i + 1;
            byte b5 = bArr[i];
            if (b5 >= 0) {
                this.zzg = i6;
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
                this.zzg = i7;
                return j5;
            }
        }
        return zzm();
    }

    private final void zzad() {
        int i = this.zze + this.zzf;
        this.zze = i;
        int i5 = i - this.zzh;
        int i6 = this.zzj;
        if (i5 <= i6) {
            this.zzf = 0;
            return;
        }
        int i7 = i5 - i6;
        this.zzf = i7;
        this.zze = i - i7;
    }

    private final byte zzy() throws zzall {
        int i = this.zzg;
        if (i == this.zze) {
            throw zzall.zzj();
        }
        byte[] bArr = this.zzd;
        this.zzg = i + 1;
        return bArr[i];
    }

    private final int zzz() throws zzall {
        int i = this.zzg;
        if (this.zze - i < 4) {
            throw zzall.zzj();
        }
        byte[] bArr = this.zzd;
        this.zzg = i + 4;
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
        return this.zzg - this.zzh;
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.p002firebaseauthapi.zzajv zzq() throws com.google.android.gms.internal.p002firebaseauthapi.zzall {
        /*
            r3 = this;
            int r0 = r3.zzaa()
            if (r0 <= 0) goto L19
            int r1 = r3.zze
            int r2 = r3.zzg
            int r1 = r1 - r2
            if (r0 > r1) goto L19
            byte[] r1 = r3.zzd
            com.google.android.gms.internal.firebase-auth-api.zzajv r1 = com.google.android.gms.internal.p002firebaseauthapi.zzajv.zza(r1, r2, r0)
            int r2 = r3.zzg
            int r2 = r2 + r0
            r3.zzg = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            com.google.android.gms.internal.firebase-auth-api.zzajv r3 = com.google.android.gms.internal.p002firebaseauthapi.zzajv.zza
            return r3
        L1e:
            if (r0 <= 0) goto L31
            int r1 = r3.zze
            int r2 = r3.zzg
            int r1 = r1 - r2
            if (r0 > r1) goto L31
            int r0 = r0 + r2
            r3.zzg = r0
            byte[] r3 = r3.zzd
            byte[] r3 = java.util.Arrays.copyOfRange(r3, r2, r0)
            goto L37
        L31:
            if (r0 > 0) goto L41
            if (r0 != 0) goto L3c
            byte[] r3 = com.google.android.gms.internal.p002firebaseauthapi.zzalh.zzb
        L37:
            com.google.android.gms.internal.firebase-auth-api.zzajv r3 = com.google.android.gms.internal.p002firebaseauthapi.zzajv.zzb(r3)
            return r3
        L3c:
            com.google.android.gms.internal.firebase-auth-api.zzall r3 = com.google.android.gms.internal.p002firebaseauthapi.zzall.zzf()
            throw r3
        L41:
            com.google.android.gms.internal.firebase-auth-api.zzall r3 = com.google.android.gms.internal.p002firebaseauthapi.zzall.zzj()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzakk.zzq():com.google.android.gms.internal.firebase-auth-api.zzajv");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final String zzr() throws zzall {
        int iZzaa = zzaa();
        if (iZzaa > 0) {
            int i = this.zze;
            int i5 = this.zzg;
            if (iZzaa <= i - i5) {
                String str = new String(this.zzd, i5, iZzaa, zzalh.zza);
                this.zzg += iZzaa;
                return str;
            }
        }
        if (iZzaa == 0) {
            return "";
        }
        if (iZzaa < 0) {
            throw zzall.zzf();
        }
        throw zzall.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final String zzs() throws zzall {
        int iZzaa = zzaa();
        if (iZzaa > 0) {
            int i = this.zze;
            int i5 = this.zzg;
            if (iZzaa <= i - i5) {
                String strZzb = zzaoa.zzb(this.zzd, i5, iZzaa);
                this.zzg += iZzaa;
                return strZzb;
            }
        }
        if (iZzaa == 0) {
            return "";
        }
        if (iZzaa <= 0) {
            throw zzall.zzf();
        }
        throw zzall.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final boolean zzw() {
        return this.zzg == this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final boolean zzx() {
        return zzac() != 0;
    }

    private zzakk(byte[] bArr, int i, int i5, boolean z4) {
        super();
        this.zzj = f.API_PRIORITY_OTHER;
        this.zzd = bArr;
        this.zze = i5 + i;
        this.zzg = i;
        this.zzh = i;
    }

    private final void zzf(int i) throws zzall {
        if (i >= 0) {
            int i5 = this.zze;
            int i6 = this.zzg;
            if (i <= i5 - i6) {
                this.zzg = i6 + i;
                return;
            }
        }
        if (i >= 0) {
            throw zzall.zzj();
        }
        throw zzall.zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final int zzb(int i) throws zzall {
        if (i < 0) {
            throw zzall.zzf();
        }
        int iZzc = i + zzc();
        if (iZzc < 0) {
            throw zzall.zzi();
        }
        int i5 = this.zzj;
        if (iZzc > i5) {
            throw zzall.zzj();
        }
        this.zzj = iZzc;
        zzad();
        return i5;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final void zzc(int i) throws zzall {
        if (this.zzi != i) {
            throw zzall.zzb();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final void zzd(int i) {
        this.zzj = i;
        zzad();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final boolean zze(int i) throws zzall {
        int i5 = i & 7;
        int i6 = 0;
        if (i5 == 0) {
            if (this.zze - this.zzg < 10) {
                while (i6 < 10) {
                    if (zzy() < 0) {
                        i6++;
                    }
                }
                throw zzall.zze();
            }
            while (i6 < 10) {
                byte[] bArr = this.zzd;
                int i7 = this.zzg;
                this.zzg = i7 + 1;
                if (bArr[i7] < 0) {
                    i6++;
                }
            }
            throw zzall.zze();
            return true;
        }
        if (i5 == 1) {
            zzf(8);
            return true;
        }
        if (i5 == 2) {
            zzf(zzaa());
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
        zzf(4);
        return true;
    }
}
