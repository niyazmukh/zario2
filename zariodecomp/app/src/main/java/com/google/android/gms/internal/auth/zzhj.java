package com.google.android.gms.internal.auth;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzhj.smali */
final class zzhj {
    public static /* bridge */ /* synthetic */ void zza(byte b5, byte b6, byte b7, byte b8, char[] cArr, int i) throws zzfa {
        if (!zze(b6)) {
            if ((((b6 + 112) + (b5 << 28)) >> 30) == 0 && !zze(b7) && !zze(b8)) {
                int i5 = ((b5 & 7) << 18) | ((b6 & 63) << 12) | ((b7 & 63) << 6) | (b8 & 63);
                cArr[i] = (char) ((i5 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i5 & 1023) + 56320);
                return;
            }
        }
        throw zzfa.zzb();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[PHI: r2
  0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* bridge */ /* synthetic */ void zzb(byte r2, byte r3, byte r4, char[] r5, int r6) throws com.google.android.gms.internal.auth.zzfa {
        /*
            boolean r0 = zze(r3)
            if (r0 != 0) goto L2c
            r0 = -96
            r1 = -32
            if (r2 != r1) goto Lf
            if (r3 < r0) goto L2c
            r2 = r1
        Lf:
            r1 = -19
            if (r2 != r1) goto L16
            if (r3 >= r0) goto L2c
            r2 = r1
        L16:
            boolean r0 = zze(r4)
            if (r0 != 0) goto L2c
            r2 = r2 & 15
            int r2 = r2 << 12
            r3 = r3 & 63
            int r3 = r3 << 6
            r2 = r2 | r3
            r3 = r4 & 63
            r2 = r2 | r3
            char r2 = (char) r2
            r5[r6] = r2
            return
        L2c:
            com.google.android.gms.internal.auth.zzfa r2 = com.google.android.gms.internal.auth.zzfa.zzb()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzhj.zzb(byte, byte, byte, char[], int):void");
    }

    public static /* bridge */ /* synthetic */ void zzc(byte b5, byte b6, char[] cArr, int i) throws zzfa {
        if (b5 < -62 || zze(b6)) {
            throw zzfa.zzb();
        }
        cArr[i] = (char) (((b5 & 31) << 6) | (b6 & 63));
    }

    public static /* bridge */ /* synthetic */ boolean zzd(byte b5) {
        return b5 >= 0;
    }

    private static boolean zze(byte b5) {
        return b5 > -65;
    }
}
