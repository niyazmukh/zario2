package com.google.android.recaptcha.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzkk.smali */
public final class zzkk {
    public static long zza(long j5, long j6) {
        long j7 = j5 + j6;
        zzkl.zza(((j5 ^ j6) < 0) | ((j5 ^ j7) >= 0), "checkedAdd", j5, j6);
        return j7;
    }

    public static long zzb(long j5, long j6) {
        long j7 = (-1) + j5;
        zzkl.zza(((1 ^ j5) >= 0) | ((j5 ^ j7) >= 0), "checkedSubtract", j5, 1L);
        return j7;
    }
}
