package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zznm.smali */
public final class zznm {
    private static final int[] zza = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] zzb = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] zzc = {67108863, 33554431};
    private static final int[] zzd = {26, 25};

    public static void zza(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        zzb(jArr3, jArr2);
        zzb(jArr12, jArr3);
        zzb(jArr11, jArr12);
        zza(jArr4, jArr11, jArr2);
        zza(jArr5, jArr4, jArr3);
        zzb(jArr11, jArr5);
        zza(jArr6, jArr11, jArr4);
        zzb(jArr11, jArr6);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zza(jArr7, jArr11, jArr6);
        zzb(jArr11, jArr7);
        zzb(jArr12, jArr11);
        for (int i = 2; i < 10; i += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr8, jArr12, jArr7);
        zzb(jArr11, jArr8);
        zzb(jArr12, jArr11);
        for (int i5 = 2; i5 < 20; i5 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr11, jArr12, jArr8);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        for (int i6 = 2; i6 < 10; i6 += 2) {
            zzb(jArr12, jArr11);
            zzb(jArr11, jArr12);
        }
        zza(jArr9, jArr11, jArr7);
        zzb(jArr11, jArr9);
        zzb(jArr12, jArr11);
        for (int i7 = 2; i7 < 50; i7 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr10, jArr12, jArr9);
        zzb(jArr12, jArr10);
        zzb(jArr11, jArr12);
        for (int i8 = 2; i8 < 100; i8 += 2) {
            zzb(jArr12, jArr11);
            zzb(jArr11, jArr12);
        }
        zza(jArr12, jArr11, jArr10);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        for (int i9 = 2; i9 < 50; i9 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr11, jArr12, jArr9);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zza(jArr, jArr12, jArr5);
    }

    public static void zzb(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j5 = jArr2[0];
        long j6 = jArr3[1] * j5;
        long j7 = jArr2[1];
        long j8 = jArr3[0];
        jArr[1] = (j7 * j8) + j6;
        long j9 = jArr2[1];
        long j10 = jArr3[1];
        jArr[2] = (jArr2[2] * j8) + (jArr3[2] * j5) + (j9 * 2 * j10);
        long j11 = jArr3[2];
        long j12 = jArr2[2];
        jArr[3] = (jArr2[3] * j8) + (jArr3[3] * j5) + (j12 * j10) + (j9 * j11);
        long j13 = jArr3[3];
        long j14 = jArr2[3];
        jArr[4] = (jArr2[4] * j8) + (jArr3[4] * j5) + (((j14 * j10) + (j9 * j13)) * 2) + (j12 * j11);
        long j15 = jArr3[4];
        long j16 = (j9 * j15) + (j14 * j11) + (j12 * j13);
        long j17 = jArr2[4];
        jArr[5] = (jArr2[5] * j8) + (jArr3[5] * j5) + (j17 * j10) + j16;
        long j18 = jArr3[5];
        long j19 = jArr2[5];
        jArr[6] = (jArr2[6] * j8) + (jArr3[6] * j5) + (j17 * j11) + (j12 * j15) + (((j19 * j10) + (j9 * j18) + (j14 * j13)) * 2);
        long j20 = (j19 * j11) + (j12 * j18) + (j17 * j13) + (j14 * j15);
        long j21 = jArr3[6];
        long j22 = (j9 * j21) + j20;
        long j23 = jArr2[6];
        jArr[7] = (jArr2[7] * j8) + (jArr3[7] * j5) + (j23 * j10) + j22;
        long j24 = jArr3[7];
        long j25 = (j9 * j24) + (j19 * j13) + (j14 * j18);
        long j26 = jArr2[7];
        long j27 = (((j26 * j10) + j25) * 2) + (j17 * j15);
        jArr[8] = (jArr2[8] * j8) + (jArr3[8] * j5) + (j23 * j11) + (j12 * j21) + j27;
        long j28 = (j26 * j11) + (j12 * j24) + (j23 * j13) + (j14 * j21) + (j19 * j15) + (j17 * j18);
        long j29 = jArr3[8];
        long j30 = (j9 * j29) + j28;
        long j31 = jArr2[8];
        jArr[9] = (jArr2[9] * j8) + (j5 * jArr3[9]) + (j31 * j10) + j30;
        long j32 = (j26 * j13) + (j14 * j24) + (j19 * j18);
        long j33 = jArr3[9];
        long j34 = jArr2[9];
        long j35 = j17 * j21;
        jArr[10] = (j31 * j11) + (j12 * j29) + (j23 * j15) + j35 + (((j10 * j34) + (j9 * j33) + j32) * 2);
        long j36 = j12 * j33;
        long j37 = j11 * j34;
        jArr[11] = j37 + j36 + (j31 * j13) + (j14 * j29) + (j26 * j15) + (j17 * j24) + (j23 * j18) + (j19 * j21);
        long j38 = j14 * j33;
        long j39 = j13 * j34;
        long j40 = j31 * j15;
        jArr[12] = j40 + (j17 * j29) + ((j39 + j38 + (j26 * j18) + (j19 * j24)) * 2) + (j23 * j21);
        long j41 = j17 * j33;
        long j42 = j15 * j34;
        jArr[13] = j42 + j41 + (j31 * j18) + (j19 * j29) + (j26 * j21) + (j23 * j24);
        long j43 = j18 * j34;
        long j44 = j31 * j21;
        jArr[14] = j44 + (j23 * j29) + ((j43 + (j19 * j33) + (j26 * j24)) * 2);
        long j45 = j23 * j33;
        long j46 = j21 * j34;
        jArr[15] = j46 + j45 + (j31 * j24) + (j26 * j29);
        jArr[16] = (((j24 * j34) + (j26 * j33)) * 2) + (j31 * j29);
        jArr[17] = (j29 * j34) + (j31 * j33);
        jArr[18] = j34 * 2 * j33;
    }

    public static void zzc(long[] jArr, long[] jArr2) {
        zzc(jArr, jArr2, jArr);
    }

    public static void zzd(long[] jArr, long[] jArr2) {
        zzd(jArr, jArr, jArr2);
    }

    private static void zze(long[] jArr, long[] jArr2) {
        if (jArr.length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
            jArr = jArr3;
        }
        zzb(jArr);
        zza(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static void zzc(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] - jArr3[i];
        }
    }

    public static void zzd(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] + jArr3[i];
        }
    }

    public static byte[] zzc(long[] jArr) {
        int i;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i5 = 0;
        while (true) {
            if (i5 >= 2) {
                break;
            }
            int i6 = 0;
            while (i6 < 9) {
                long j5 = jArrCopyOf[i6];
                int i7 = -((int) (((j5 >> 31) & j5) >> zzd[i6 & 1]));
                jArrCopyOf[i6] = j5 + (i7 << r14);
                i6++;
                jArrCopyOf[i6] = jArrCopyOf[i6] - i7;
            }
            long j6 = jArrCopyOf[9];
            jArrCopyOf[9] = j6 + (r6 << 25);
            jArrCopyOf[0] = jArrCopyOf[0] - ((-((int) (((j6 >> 31) & j6) >> 25))) * 19);
            i5++;
        }
        long j7 = jArrCopyOf[0];
        jArrCopyOf[0] = j7 + (r3 << 26);
        jArrCopyOf[1] = jArrCopyOf[1] - (-((int) (((j7 >> 31) & j7) >> 26)));
        int i8 = 0;
        for (i = 2; i8 < i; i = 2) {
            int i9 = 0;
            while (i9 < 9) {
                long j8 = jArrCopyOf[i9];
                int i10 = (int) (j8 >> zzd[i9 & 1]);
                jArrCopyOf[i9] = j8 & zzc[r15];
                i9++;
                jArrCopyOf[i9] = jArrCopyOf[i9] + i10;
            }
            i8++;
        }
        jArrCopyOf[9] = jArrCopyOf[9] & 33554431;
        long j9 = (((int) (r9 >> 25)) * 19) + jArrCopyOf[0];
        jArrCopyOf[0] = j9;
        int i11 = ~((((int) j9) - 67108845) >> 31);
        for (int i12 = 1; i12 < 10; i12++) {
            int i13 = ~(((int) jArrCopyOf[i12]) ^ zzc[i12 & 1]);
            int i14 = i13 & (i13 << 16);
            int i15 = i14 & (i14 << 8);
            int i16 = i15 & (i15 << 4);
            int i17 = i16 & (i16 << 2);
            i11 &= (i17 & (i17 << 1)) >> 31;
        }
        jArrCopyOf[0] = jArrCopyOf[0] - (67108845 & i11);
        long j10 = 33554431 & i11;
        jArrCopyOf[1] = jArrCopyOf[1] - j10;
        for (int i18 = 2; i18 < 10; i18 += 2) {
            jArrCopyOf[i18] = jArrCopyOf[i18] - (67108863 & i11);
            int i19 = i18 + 1;
            jArrCopyOf[i19] = jArrCopyOf[i19] - j10;
        }
        for (int i20 = 0; i20 < 10; i20++) {
            jArrCopyOf[i20] = jArrCopyOf[i20] << zzb[i20];
        }
        byte[] bArr = new byte[32];
        for (int i21 = 0; i21 < 10; i21++) {
            int i22 = zza[i21];
            long j11 = bArr[i22];
            long j12 = jArrCopyOf[i21];
            bArr[i22] = (byte) (j11 | (j12 & 255));
            bArr[i22 + 1] = (byte) (bArr[r5] | ((j12 >> 8) & 255));
            bArr[i22 + 2] = (byte) (bArr[r5] | ((j12 >> 16) & 255));
            bArr[i22 + 3] = (byte) (bArr[r4] | ((j12 >> 24) & 255));
        }
        return bArr;
    }

    public static void zzb(long[] jArr) {
        long j5 = jArr[8];
        long j6 = jArr[18];
        long j7 = j5 + (j6 << 4);
        jArr[8] = j7;
        long j8 = j7 + (j6 << 1);
        jArr[8] = j8;
        jArr[8] = j8 + j6;
        long j9 = jArr[7];
        long j10 = jArr[17];
        long j11 = j9 + (j10 << 4);
        jArr[7] = j11;
        long j12 = j11 + (j10 << 1);
        jArr[7] = j12;
        jArr[7] = j12 + j10;
        long j13 = jArr[6];
        long j14 = jArr[16];
        long j15 = j13 + (j14 << 4);
        jArr[6] = j15;
        long j16 = j15 + (j14 << 1);
        jArr[6] = j16;
        jArr[6] = j16 + j14;
        long j17 = jArr[5];
        long j18 = jArr[15];
        long j19 = j17 + (j18 << 4);
        jArr[5] = j19;
        long j20 = j19 + (j18 << 1);
        jArr[5] = j20;
        jArr[5] = j20 + j18;
        long j21 = jArr[4];
        long j22 = jArr[14];
        long j23 = j21 + (j22 << 4);
        jArr[4] = j23;
        long j24 = j23 + (j22 << 1);
        jArr[4] = j24;
        jArr[4] = j24 + j22;
        long j25 = jArr[3];
        long j26 = jArr[13];
        long j27 = j25 + (j26 << 4);
        jArr[3] = j27;
        long j28 = j27 + (j26 << 1);
        jArr[3] = j28;
        jArr[3] = j28 + j26;
        long j29 = jArr[2];
        long j30 = jArr[12];
        long j31 = j29 + (j30 << 4);
        jArr[2] = j31;
        long j32 = j31 + (j30 << 1);
        jArr[2] = j32;
        jArr[2] = j32 + j30;
        long j33 = jArr[1];
        long j34 = jArr[11];
        long j35 = j33 + (j34 << 4);
        jArr[1] = j35;
        long j36 = j35 + (j34 << 1);
        jArr[1] = j36;
        jArr[1] = j36 + j34;
        long j37 = jArr[0];
        long j38 = jArr[10];
        long j39 = j37 + (j38 << 4);
        jArr[0] = j39;
        long j40 = j39 + (j38 << 1);
        jArr[0] = j40;
        jArr[0] = j40 + j38;
    }

    public static void zzb(long[] jArr, long[] jArr2) {
        long j5 = jArr2[0];
        long j6 = jArr2[1];
        long j7 = jArr2[2];
        long j8 = jArr2[3];
        long j9 = jArr2[4];
        long j10 = jArr2[5];
        long j11 = jArr2[6];
        long j12 = jArr2[7];
        long j13 = jArr2[8];
        long j14 = jArr2[9];
        zze(new long[]{j5 * j5, j5 * 2 * j6, ((j5 * j7) + (j6 * j6)) * 2, ((j5 * j8) + (j6 * j7)) * 2, (j5 * 2 * j9) + (j6 * 4 * j8) + (j7 * j7), ((j5 * j10) + (j6 * j9) + (j7 * j8)) * 2, ((j6 * 2 * j10) + (j5 * j11) + (j7 * j9) + (j8 * j8)) * 2, ((j5 * j12) + (j6 * j11) + (j7 * j10) + (j8 * j9)) * 2, (((((j8 * j10) + (j6 * j12)) * 2) + (j5 * j13) + (j7 * j11)) * 2) + (j9 * j9), ((j5 * j14) + (j6 * j13) + (j7 * j12) + (j8 * j11) + (j9 * j10)) * 2, ((((j6 * j14) + (j8 * j12)) * 2) + (j7 * j13) + (j9 * j11) + (j10 * j10)) * 2, ((j7 * j14) + (j8 * j13) + (j9 * j12) + (j10 * j11)) * 2, (((((j8 * j14) + (j10 * j12)) * 2) + (j9 * j13)) * 2) + (j11 * j11), ((j9 * j14) + (j10 * j13) + (j11 * j12)) * 2, ((j10 * 2 * j14) + (j11 * j13) + (j12 * j12)) * 2, ((j11 * j14) + (j12 * j13)) * 2, (j12 * 4 * j14) + (j13 * j13), j13 * 2 * j14, 2 * j14 * j14}, jArr);
    }

    public static void zza(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        zzb(jArr4, jArr2, jArr3);
        zze(jArr4, jArr);
    }

    public static void zza(long[] jArr) {
        jArr[10] = 0;
        int i = 0;
        while (i < 10) {
            long j5 = jArr[i];
            long j6 = j5 / 67108864;
            jArr[i] = j5 - (j6 << 26);
            int i5 = i + 1;
            long j7 = jArr[i5] + j6;
            jArr[i5] = j7;
            long j8 = j7 / 33554432;
            jArr[i5] = j7 - (j8 << 25);
            i += 2;
            jArr[i] = jArr[i] + j8;
        }
        long j9 = jArr[0];
        long j10 = jArr[10];
        long j11 = j9 + (j10 << 4);
        jArr[0] = j11;
        long j12 = j11 + (j10 << 1);
        jArr[0] = j12;
        long j13 = j12 + j10;
        jArr[0] = j13;
        jArr[10] = 0;
        long j14 = j13 / 67108864;
        jArr[0] = j13 - (j14 << 26);
        jArr[1] = jArr[1] + j14;
    }

    public static void zza(long[] jArr, long[] jArr2, long j5) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] * j5;
        }
    }

    public static long[] zza(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i = 0; i < 10; i++) {
            int i5 = zza[i];
            jArr[i] = (((((bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8)) | ((bArr[i5 + 2] & 255) << 16)) | ((bArr[i5 + 3] & 255) << 24)) >> zzb[i]) & zzc[i & 1];
        }
        return jArr;
    }
}
