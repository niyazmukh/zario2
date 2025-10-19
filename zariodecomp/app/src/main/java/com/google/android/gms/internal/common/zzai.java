package com.google.android.gms.internal.common;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\common\zzai.smali */
public final class zzai {
    public static Object[] zza(Object[] objArr, int i) {
        for (int i5 = 0; i5 < i; i5++) {
            if (objArr[i5] == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 9);
                sb.append("at index ");
                sb.append(i5);
                throw new NullPointerException(sb.toString());
            }
        }
        return objArr;
    }
}
