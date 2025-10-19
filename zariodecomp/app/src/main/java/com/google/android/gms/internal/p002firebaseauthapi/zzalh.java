package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzalh.smali */
public final class zzalh {
    static final Charset zza;
    public static final byte[] zzb;

    static {
        Charset.forName("US-ASCII");
        zza = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzb = bArr;
        ByteBuffer.wrap(bArr);
        zzakh.zza(bArr, 0, bArr.length, false);
    }

    public static int zza(long j5) {
        return (int) (j5 ^ (j5 >>> 32));
    }

    public static int zza(boolean z4) {
        return z4 ? 1231 : 1237;
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        int iZza = zza(length, bArr, 0, length);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public static int zza(int i, byte[] bArr, int i5, int i6) {
        for (int i7 = i5; i7 < i5 + i6; i7++) {
            i = (i * 31) + bArr[i7];
        }
        return i;
    }

    public static <T> T zza(T t4) {
        t4.getClass();
        return t4;
    }

    public static <T> T zza(T t4, String str) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(str);
    }

    public static boolean zza(zzamm zzammVar) {
        boolean z4 = zzammVar instanceof zzajn;
        return false;
    }
}
