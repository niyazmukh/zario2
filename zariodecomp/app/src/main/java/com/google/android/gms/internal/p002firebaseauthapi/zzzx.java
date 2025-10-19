package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzzx.smali */
public final class zzzx {
    public static String zza(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b5 : bArr) {
            int i = b5 & 255;
            sb.append("0123456789abcdef".charAt(i / 16));
            sb.append("0123456789abcdef".charAt(i % 16));
        }
        return sb.toString();
    }

    public static byte[] zza(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i5 = i * 2;
                int iDigit = Character.digit(str.charAt(i5), 16);
                int iDigit2 = Character.digit(str.charAt(i5 + 1), 16);
                if (iDigit != -1 && iDigit2 != -1) {
                    bArr[i] = (byte) ((iDigit << 4) + iDigit2);
                } else {
                    throw new IllegalArgumentException("input is not hexadecimal");
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("Expected a string of even length");
    }
}
